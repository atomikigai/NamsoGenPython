package d7;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e7.g;
import e7.h;
import r7.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3000a = 1;

    public a(Application application, x6.a aVar) {
        super(application, null, x6.b.f10298a, aVar, new k(new b9.e(8), Looper.getMainLooper()));
    }

    public synchronized int c() {
        int i;
        try {
            i = f3000a;
            if (i == 1) {
                Context applicationContext = getApplicationContext();
                g7.e eVar = g7.e.e;
                int iD = eVar.d(applicationContext, 12451000);
                if (iD == 0) {
                    i = 4;
                    f3000a = 4;
                } else if (eVar.b(applicationContext, null, iD) != null || f.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    f3000a = 2;
                } else {
                    i = 3;
                    f3000a = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public Task signOut() {
        BasePendingResult basePendingResultDoWrite;
        o oVarAsGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        boolean z4 = c() == 3;
        h.f3486a.a("Signing out", new Object[0]);
        h.b(applicationContext);
        if (z4) {
            basePendingResultDoWrite = new w(oVarAsGoogleApiClient);
            basePendingResultDoWrite.setResult(Status.e);
        } else {
            basePendingResultDoWrite = ((i0) oVarAsGoogleApiClient).f2119b.doWrite(new g(oVarAsGoogleApiClient, 0));
        }
        wa.d dVar = new wa.d();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        basePendingResultDoWrite.addStatusListener(new z(basePendingResultDoWrite, taskCompletionSource, dVar));
        return taskCompletionSource.getTask();
    }
}
