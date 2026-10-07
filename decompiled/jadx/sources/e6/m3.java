package e6;

import com.google.android.gms.internal.ads.zzbml;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m3 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5.d f3347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbml f3348b;

    public m3(w5.d dVar, zzbml zzbmlVar) {
        this.f3347a = dVar;
        this.f3348b = zzbmlVar;
    }

    @Override // e6.c0
    public final void zzb(h2 h2Var) {
        w5.d dVar = this.f3347a;
        if (dVar != null) {
            dVar.onAdFailedToLoad(h2Var.h());
        }
    }

    @Override // e6.c0
    public final void zzc() {
        zzbml zzbmlVar;
        w5.d dVar = this.f3347a;
        if (dVar == null || (zzbmlVar = this.f3348b) == null) {
            return;
        }
        dVar.onAdLoaded(zzbmlVar);
    }
}
