package e6;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k3 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5.c f3336a;

    public k3(w5.c cVar) {
        this.f3336a = cVar;
    }

    @Override // e6.z
    public final void zzc() {
        w5.c cVar = this.f3336a;
        if (cVar != null) {
            cVar.onAdClicked();
        }
    }

    @Override // e6.z
    public final void zzd() {
        w5.c cVar = this.f3336a;
        if (cVar != null) {
            cVar.onAdClosed();
        }
    }

    @Override // e6.z
    public final void zzf(h2 h2Var) {
        w5.c cVar = this.f3336a;
        if (cVar != null) {
            cVar.onAdFailedToLoad(h2Var.h());
        }
    }

    @Override // e6.z
    public final void zzg() {
        w5.c cVar = this.f3336a;
        if (cVar != null) {
            cVar.onAdImpression();
        }
    }

    @Override // e6.z
    public final void zzi() {
        w5.c cVar = this.f3336a;
        if (cVar != null) {
            cVar.onAdLoaded();
        }
    }

    @Override // e6.z
    public final void zzj() {
        w5.c cVar = this.f3336a;
        if (cVar != null) {
            cVar.onAdOpened();
        }
    }

    @Override // e6.z
    public final void zzk() {
        w5.c cVar = this.f3336a;
        if (cVar != null) {
            cVar.onAdSwipeGestureClicked();
        }
    }

    @Override // e6.z
    public final void zzh() {
    }

    @Override // e6.z
    public final void zze(int i) {
    }
}
