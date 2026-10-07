package h6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (i6.g.f5227b) {
            i6.g.f5228c = false;
            i6.g.f5229d = false;
            i6.h.g("Ad debug logging enablement is out of date.");
        }
        android.support.v4.media.session.a.K(context);
    }
}
