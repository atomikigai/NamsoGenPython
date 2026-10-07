package kb;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import da.v;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static final Pattern e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f6175f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f6176a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f6177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f6178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f6179d;

    static {
        Charset.forName("UTF-8");
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f6175f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public i(Executor executor, c cVar, c cVar2) {
        this.f6177b = executor;
        this.f6178c = cVar;
        this.f6179d = cVar2;
    }

    public static e b(c cVar) {
        synchronized (cVar) {
            try {
                Task task = cVar.f6150c;
                if (task != null && task.isSuccessful()) {
                    return (e) cVar.f6150c.getResult();
                }
                try {
                    Task taskB = cVar.b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (e) c.a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e4);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String c(c cVar, String str) {
        e eVarB = b(cVar);
        if (eVarB == null) {
            return null;
        }
        try {
            return eVarB.f6157b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void d(String str, String str2) {
        Log.w("FirebaseRemoteConfig", v.k("No value of type '", str2, "' exists for parameter key '", str, "'."));
    }

    public final void a(String str, e eVar) {
        if (eVar == null) {
            return;
        }
        synchronized (this.f6176a) {
            try {
                Iterator it = this.f6176a.iterator();
                while (it.hasNext()) {
                    this.f6177b.execute(new androidx.emoji2.text.m((jb.h) it.next(), str, eVar, 4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
