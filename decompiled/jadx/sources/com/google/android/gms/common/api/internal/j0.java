package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2120a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2122c;

    public j0(androidx.fragment.app.w wVar, TaskCompletionSource taskCompletionSource) {
        this.f2121b = new WeakReference(wVar);
        this.f2122c = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f2120a) {
            case 0:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    a0 a0Var = (a0) this.f2122c;
                    b1 b1Var = (b1) ((a1) a0Var.f2058b).f2061c;
                    b1Var.f2064b.set(null);
                    b1Var.b();
                    AlertDialog alertDialog = (AlertDialog) a0Var.f2057a;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context2 = (Context) this.f2121b;
                            if (context2 != null) {
                                context2.unregisterReceiver(this);
                            }
                            this.f2121b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            default:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f2122c;
                if (((Activity) ((WeakReference) this.f2121b).get()) == null) {
                    Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
                    taskCompletionSource.setException(zzadz.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
                    ea.e.f(context);
                    return;
                }
                if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
                    String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
                    if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
                        ea.e.f(context);
                        return;
                    } else {
                        taskCompletionSource.setException(zzadz.zza(qd.b.G("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
                        return;
                    }
                }
                HashMap map = w9.r.f9855a;
                if (!intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
                    if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                        taskCompletionSource.setException(zzadz.zza(qd.b.G("WEB_CONTEXT_CANCELED")));
                        ea.e.f(context);
                        return;
                    }
                    return;
                }
                com.google.android.gms.common.internal.i0.b(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
                Parcelable.Creator<Status> creator = Status.CREATOR;
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.STATUS");
                taskCompletionSource.setException(zzadz.zza((Status) (byteArrayExtra != null ? fa.c1.q(byteArrayExtra, creator) : null)));
                ea.e.f(context);
                return;
        }
    }

    public j0(a0 a0Var) {
        this.f2122c = a0Var;
    }
}
