package z7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f11270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11272c;

    public n0(z2 z2Var) {
        this.f11270a = z2Var;
    }

    public final void a() {
        z2 z2Var = this.f11270a;
        z2Var.b();
        z2Var.zzaB().c();
        z2Var.zzaB().c();
        if (this.f11271b) {
            z2Var.zzaA().f11198y.b("Unregistering connectivity change receiver");
            this.f11271b = false;
            this.f11272c = false;
            try {
                z2Var.f11517w.f11000a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                z2Var.zzaA().f11190f.c(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        z2 z2Var = this.f11270a;
        z2Var.b();
        String action = intent.getAction();
        z2Var.zzaA().f11198y.c(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            z2Var.zzaA().f11193t.c(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        l0 l0Var = z2Var.f11508b;
        z2.D(l0Var);
        boolean zS = l0Var.s();
        if (this.f11272c != zS) {
            this.f11272c = zS;
            z2Var.zzaB().l(new v9.i0(this, zS));
        }
    }
}
