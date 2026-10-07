package gb;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f4502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f4503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f4504d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new da.x("firebase-iid-executor", 3));

    public t(FirebaseMessaging firebaseMessaging, long j4) {
        this.f4503c = firebaseMessaging;
        this.f4501a = j4;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f2730b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f4502b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f4503c.f2730b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.f4503c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f4502b;
        r rVarG = r.g();
        FirebaseMessaging firebaseMessaging = this.f4503c;
        if (rVarG.j(firebaseMessaging.f2730b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f2736k = true;
                }
                if (!firebaseMessaging.f2735j.d()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f2736k = false;
                    }
                    if (r.g().j(firebaseMessaging.f2730b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (r.g().i(firebaseMessaging.f2730b) && !a()) {
                    a3.c cVar = new a3.c();
                    cVar.f94b = this;
                    cVar.a();
                    if (r.g().j(firebaseMessaging.f2730b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f2736k = false;
                    }
                } else {
                    firebaseMessaging.g(this.f4501a);
                }
                if (r.g().j(firebaseMessaging.f2730b)) {
                    wakeLock.release();
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f2736k = false;
                    if (r.g().j(firebaseMessaging.f2730b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th) {
            if (r.g().j(firebaseMessaging.f2730b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
