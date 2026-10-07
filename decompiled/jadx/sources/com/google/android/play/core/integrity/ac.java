package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class ac extends k9.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f2615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k9.v f2616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f2617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ad adVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f2615a = adVar;
        this.f2616b = new k9.v("OnRequestIntegrityTokenCallback");
        this.f2617c = taskCompletionSource;
    }

    @Override // k9.u
    public final void b(Bundle bundle) {
        this.f2615a.f2618a.c(this.f2617c);
        this.f2616b.b("onRequestIntegrityToken", new Object[0]);
        int i = bundle.getInt("error");
        if (i != 0) {
            this.f2617c.trySetException(new IntegrityServiceException(i, null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f2617c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        PendingIntent pendingIntent = Build.VERSION.SDK_INT >= 33 ? (PendingIntent) bundle.getParcelable("dialog.intent", PendingIntent.class) : (PendingIntent) bundle.getParcelable("dialog.intent");
        TaskCompletionSource taskCompletionSource = this.f2617c;
        a aVar = new a();
        aVar.c(string);
        aVar.b(this.f2616b);
        aVar.a(pendingIntent);
        taskCompletionSource.trySetResult(aVar.d());
    }
}
