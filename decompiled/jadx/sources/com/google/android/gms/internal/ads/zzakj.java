package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzakj implements zzacu {
    private final zzacu zzb;
    private final zzakg zzc;
    private final SparseArray zzd = new SparseArray();

    public zzakj(zzacu zzacuVar, zzakg zzakgVar) {
        this.zzb = zzacuVar;
        this.zzc = zzakgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzD() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzO(zzadq zzadqVar) {
        this.zzb.zzO(zzadqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final zzadx zzw(int i, int i10) {
        if (i10 != 3) {
            return this.zzb.zzw(i, i10);
        }
        zzakl zzaklVar = (zzakl) this.zzd.get(i);
        if (zzaklVar != null) {
            return zzaklVar;
        }
        zzakl zzaklVar2 = new zzakl(this.zzb.zzw(i, 3), this.zzc);
        this.zzd.put(i, zzaklVar2);
        return zzaklVar2;
    }
}
