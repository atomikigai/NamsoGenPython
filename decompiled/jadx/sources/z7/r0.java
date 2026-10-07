package z7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f11326b;

    public r0(s0 s0Var, String str) {
        this.f11326b = s0Var;
        this.f11325a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        s0 s0Var = this.f11326b;
        if (iBinder == null) {
            i0 i0Var = s0Var.f11339b.f11007t;
            a1.f(i0Var);
            i0Var.f11193t.b("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbr zzbrVarZzb = zzbq.zzb(iBinder);
            if (zzbrVarZzb == null) {
                i0 i0Var2 = s0Var.f11339b.f11007t;
                a1.f(i0Var2);
                i0Var2.f11193t.b("Install Referrer Service implementation was not found");
            } else {
                i0 i0Var3 = s0Var.f11339b.f11007t;
                a1.f(i0Var3);
                i0Var3.f11198y.b("Install Referrer Service connected");
                z0 z0Var = s0Var.f11339b.f11008u;
                a1.f(z0Var);
                z0Var.l(new y9.j(this, zzbrVarZzb, this));
            }
        } catch (RuntimeException e) {
            i0 i0Var4 = s0Var.f11339b.f11007t;
            a1.f(i0Var4);
            i0Var4.f11193t.c(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i0 i0Var = this.f11326b.f11339b.f11007t;
        a1.f(i0Var);
        i0Var.f11198y.b("Install Referrer Service disconnected");
    }
}
