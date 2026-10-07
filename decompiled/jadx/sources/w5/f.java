package w5;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbel;
import e6.f0;
import e6.o2;
import e6.p3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f9646b;

    public f(Context context, f0 f0Var) {
        this.f9645a = context;
        this.f9646b = f0Var;
    }

    public final void a(g gVar) {
        o2 o2Var = gVar.f9647a;
        Context context = this.f9645a;
        zzbcn.zza(context);
        if (((Boolean) zzbel.zzc.zze()).booleanValue()) {
            if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzkP)).booleanValue()) {
                i6.b.f5218b.execute(new a3.e(this, o2Var, 26, false));
                return;
            }
        }
        try {
            this.f9646b.zzg(p3.a(context, o2Var));
        } catch (RemoteException e) {
            i6.h.e("Failed to load ad.", e);
        }
    }
}
