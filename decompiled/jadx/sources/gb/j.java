package gb;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f4470c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static d0 f4471d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4473b;

    public j(ExecutorService executorService) {
        this.f4473b = new r.e(0);
        this.f4472a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z4) {
        d0 d0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f4470c) {
            try {
                if (f4471d == null) {
                    f4471d = new d0(context);
                }
                d0Var = f4471d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z4) {
            return d0Var.b(intent).continueWith(new androidx.webkit.a(3), new ga.a(5));
        }
        if (r.g().j(context)) {
            synchronized (a0.f4442b) {
                try {
                    a0.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        a0.f4443c.a(a0.f4441a);
                    }
                    d0Var.b(intent).addOnCompleteListener(new a5.a(intent, 9));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            d0Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public Task b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f4472a;
        androidx.webkit.a aVar = (androidx.webkit.a) this.f4473b;
        boolean z4 = n7.c.h() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z10 = (intent.getFlags() & 268435456) != 0;
        return (!z4 || z10) ? Tasks.call(aVar, new h(0, context, intent)).continueWithTask(aVar, new Continuation() { // from class: gb.i
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (n7.c.h() && ((Integer) task.getResult()).intValue() == 402) ? j.a(context, intent, z10).continueWith(new androidx.webkit.a(3), new ga.a(4)) : task;
            }
        }) : a(context, intent, z10);
    }

    public j(Context context) {
        this.f4472a = context;
        this.f4473b = new androidx.webkit.a(3);
    }

    public j(d0.t tVar, String str) {
        this.f4472a = tVar;
        this.f4473b = str;
    }
}
