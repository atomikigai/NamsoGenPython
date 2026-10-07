package w9;

import android.os.HandlerThread;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.p002firebaseauthapi.zzc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static final j7.a e = new j7.a("TokenRefresher", "FirebaseAuth:");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f9830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f9831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzc f9832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a3.e f9833d;

    public e(n9.g gVar) {
        e.e("Initializing TokenRefresher", new Object[0]);
        i0.i(gVar);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        this.f9832c = new zzc(handlerThread.getLooper());
        gVar.a();
        this.f9833d = new a3.e(this, gVar.f7360b);
    }
}
