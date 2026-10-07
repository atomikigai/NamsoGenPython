package w9;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import fa.c1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import v9.h0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f9839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f9840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseAuth f9841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9.n f9842d;

    public i(ea.e eVar, u4.c cVar, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, v9.n nVar) {
        this.f9839a = new WeakReference(cVar);
        this.f9840b = taskCompletionSource;
        this.f9841c = firebaseAuth;
        this.f9842d = nVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Activity activity = (Activity) this.f9839a.get();
        TaskCompletionSource taskCompletionSource = this.f9840b;
        if (activity == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            taskCompletionSource.setException(zzadz.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
            ea.e.f(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            HashMap map = r.f9855a;
            if (!intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    taskCompletionSource.setException(zzadz.zza(qd.b.G("WEB_CONTEXT_CANCELED")));
                    ea.e.f(context);
                    return;
                }
                return;
            }
            i0.b(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.STATUS");
            taskCompletionSource.setException(zzadz.zza((Status) (byteArrayExtra != null ? c1.q(byteArrayExtra, creator) : null)));
            ea.e.f(context);
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            this.f9841c.c(ea.e.h(intent)).addOnSuccessListener(new h(taskCompletionSource, context, 1)).addOnFailureListener(new h(taskCompletionSource, context, 0));
            return;
        }
        boolean zEquals = "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra);
        v9.n nVar = this.f9842d;
        if (zEquals) {
            nVar.k(ea.e.h(intent)).addOnSuccessListener(new h(taskCompletionSource, context, 3)).addOnFailureListener(new h(taskCompletionSource, context, 2));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            h0 h0VarH = ea.e.h(intent);
            nVar.getClass();
            FirebaseAuth.getInstance(n9.g.e(((d0) nVar).f9821c)).k(nVar, h0VarH).addOnSuccessListener(new h(taskCompletionSource, context, 5)).addOnFailureListener(new h(taskCompletionSource, context, 4));
        } else {
            taskCompletionSource.setException(zzadz.zza(qd.b.G("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
