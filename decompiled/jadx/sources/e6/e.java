package e6;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbzj;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbpc f3303c;

    public e(Context context, zzbpc zzbpcVar) {
        this.f3302b = context;
        this.f3303c = zzbpcVar;
    }

    @Override // e6.r
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        return b1Var.t(new q7.b(this.f3302b), this.f3303c, 243799000);
    }

    @Override // e6.r
    public final Object c() {
        Context context = this.f3302b;
        q7.b bVar = new q7.b(context);
        try {
            try {
                return zzbzj.zzb(qd.b.K(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl")).zze(bVar, this.f3303c, 243799000);
            } catch (RemoteException | i6.j | NullPointerException unused) {
                return null;
            }
        } catch (Exception e) {
            throw new i6.j(e);
        }
    }
}
