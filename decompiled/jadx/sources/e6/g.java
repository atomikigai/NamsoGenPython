package e6;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzbpc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbpc f3308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a6.b f3309d;

    public g(Context context, zzbpc zzbpcVar, a6.b bVar) {
        this.f3307b = context;
        this.f3308c = zzbpcVar;
        this.f3309d = bVar;
    }

    @Override // e6.r
    public final /* synthetic */ Object a() {
        return new zzbla();
    }

    @Override // e6.r
    public final Object b(b1 b1Var) {
        return b1Var.b(new q7.b(this.f3307b), this.f3308c, 243799000, new zzbkn(this.f3309d));
    }

    @Override // e6.r
    public final Object c() {
        Context context = this.f3307b;
        q7.b bVar = new q7.b(context);
        try {
            try {
                return zzbkv.zzb(qd.b.K(context).b("com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl")).zze(bVar, this.f3308c, 243799000, new zzbkn(this.f3309d));
            } catch (RemoteException | i6.j | NullPointerException unused) {
                return null;
            }
        } catch (Exception e) {
            throw new i6.j(e);
        }
    }
}
