package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class au extends at {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k9.v f2646c;

    public au(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(axVar, taskCompletionSource);
        this.f2646c = new k9.v("OnRequestIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.at, k9.p
    public final void c(Bundle bundle) throws RemoteException {
        super.c(bundle);
        this.f2646c.b("onRequestExpressIntegrityToken", new Object[0]);
        int i = bundle.getInt("error");
        if (i != 0) {
            this.f2644a.trySetException(new StandardIntegrityException(i, null));
            return;
        }
        PendingIntent pendingIntent = Build.VERSION.SDK_INT >= 33 ? (PendingIntent) bundle.getParcelable("dialog.intent", PendingIntent.class) : (PendingIntent) bundle.getParcelable("dialog.intent");
        TaskCompletionSource taskCompletionSource = this.f2644a;
        b bVar = new b();
        bVar.c(bundle.getString("token"));
        bVar.b(this.f2646c);
        bVar.a(pendingIntent);
        taskCompletionSource.trySetResult(bVar.d());
    }
}
