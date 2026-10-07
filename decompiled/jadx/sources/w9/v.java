package w9;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.internal.p002firebaseauthapi.zzael;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements OnFailureListener, Continuation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f9862c = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9864b;

    public /* synthetic */ v() {
        this.f9863a = 0;
    }

    public static void a(FirebaseAuth firebaseAuth, s sVar, androidx.fragment.app.w wVar, TaskCompletionSource taskCompletionSource) {
        Task taskForException;
        n9.g gVar = firebaseAuth.f2698a;
        gVar.a();
        Context context = gVar.f7359a;
        sVar.getClass();
        s.c(context, firebaseAuth);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (ea.e.f3513d == null) {
            ea.e eVar = new ea.e(6);
            eVar.f3515b = false;
            ea.e.f3513d = eVar;
        }
        ea.e eVar2 = ea.e.f3513d;
        if (eVar2.f3515b) {
            taskForException = Tasks.forException(zzadz.zza(new Status(17057, "reCAPTCHA flow already in progress", null, null)));
        } else {
            eVar2.g(wVar, new j0(wVar, taskCompletionSource2));
            eVar2.f3515b = true;
            Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent.setClass(wVar, RecaptchaActivity.class);
            intent.setPackage(wVar.getPackageName());
            gVar.a();
            intent.putExtra("com.google.firebase.auth.KEY_API_KEY", gVar.f7361c.f7366a);
            if (!TextUtils.isEmpty(firebaseAuth.a())) {
                intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.a());
            }
            intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzael.zza().zzb());
            gVar.a();
            intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", gVar.f7360b);
            wVar.startActivity(intent);
            taskForException = taskCompletionSource2.getTask();
        }
        taskForException.addOnSuccessListener(new t(taskCompletionSource)).addOnFailureListener(new t(taskCompletionSource));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        long j4;
        if (exc instanceof n9.i) {
            j7.a aVar = e.e;
            aVar.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            e eVar = (e) ((a3.e) this.f9864b).f98c;
            int i = (int) eVar.f9831b;
            if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
                long j10 = eVar.f9831b;
                j4 = j10 + j10;
            } else {
                j4 = i != 960 ? 30L : 960L;
            }
            eVar.f9831b = j4;
            eVar.f9830a = (eVar.f9831b * 1000) + System.currentTimeMillis();
            aVar.e(da.v.g("Scheduling refresh for ", eVar.f9830a), new Object[0]);
            eVar.f9832c.postDelayed(eVar.f9833d, eVar.f9831b * 1000);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f9863a) {
            case 2:
                a.a aVar = (a.a) this.f9864b;
                if (task.isSuccessful()) {
                    return aVar.q((String) task.getResult());
                }
                Exception exception = task.getException();
                i0.i(exception);
                Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + exception.getMessage() + "\n\n Failing open with a fake token.");
                return aVar.q("NO_RECAPTCHA");
            default:
                if (task.isSuccessful()) {
                    return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.f9864b);
                }
                Exception exception2 = task.getException();
                i0.i(exception2);
                if (!(exception2 instanceof o)) {
                    return Tasks.forException(exception2);
                }
                if (Log.isLoggable("RecaptchaHandler", 4)) {
                    Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - ".concat(String.valueOf(exception2.getMessage())));
                }
                return Tasks.forResult("");
        }
    }

    public /* synthetic */ v(Object obj, int i) {
        this.f9863a = i;
        this.f9864b = obj;
    }

    public v(n9.g gVar) {
        this.f9863a = 4;
        gVar.a();
        Context context = gVar.f7359a;
        this.f9864b = new e(gVar);
        com.google.android.gms.common.api.internal.c.b((Application) context.getApplicationContext());
        com.google.android.gms.common.api.internal.c.e.a(new p(this));
    }
}
