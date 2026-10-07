package e6;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbtb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbpc f3305c;

    public f(Context context, zzbpc zzbpcVar) {
        this.f3304b = context;
        this.f3305c = zzbpcVar;
    }

    @Override // e6.r
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        return b1Var.d(new q7.b(this.f3304b), this.f3305c, 243799000);
    }

    @Override // e6.r
    public final Object c() {
        Context context = this.f3304b;
        q7.b bVar = new q7.b(context);
        try {
            try {
                return zzbtb.zzb(qd.b.K(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl")).zze(bVar, this.f3305c, 243799000);
            } catch (RemoteException | i6.j | NullPointerException unused) {
                return null;
            }
        } catch (Exception e) {
            throw new i6.j(e);
        }
    }
}
