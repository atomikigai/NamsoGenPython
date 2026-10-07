package p6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzcid;
import com.google.android.gms.internal.ads.zzhfx;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements zzhfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzchq f7817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzcid f7818b;

    public b(zzchq zzchqVar, zzcid zzcidVar) {
        this.f7817a = zzchqVar;
        this.f7818b = zzcidVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        return new a((Context) this.f7817a.zzb(), (i6.a) this.f7818b.zzb());
    }
}
