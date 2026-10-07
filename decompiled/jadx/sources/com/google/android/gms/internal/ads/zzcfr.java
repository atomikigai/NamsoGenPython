package com.google.android.gms.internal.ads;

import g6.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcfr implements l {
    private final zzcfk zza;
    private final l zzb;

    public zzcfr(zzcfk zzcfkVar, l lVar) {
        this.zza = zzcfkVar;
        this.zzb = lVar;
    }

    @Override // g6.l
    public final void zzdq() {
        l lVar = this.zzb;
        if (lVar != null) {
            lVar.zzdq();
        }
    }

    @Override // g6.l
    public final void zzdr() {
        l lVar = this.zzb;
        if (lVar != null) {
            lVar.zzdr();
        }
        this.zza.zzaa();
    }

    @Override // g6.l
    public final void zzdt() {
        l lVar = this.zzb;
        if (lVar != null) {
            lVar.zzdt();
        }
    }

    @Override // g6.l
    public final void zzdu(int i) {
        l lVar = this.zzb;
        if (lVar != null) {
            lVar.zzdu(i);
        }
        this.zza.zzY();
    }

    @Override // g6.l
    public final void zzdH() {
    }

    @Override // g6.l
    public final void zzdk() {
    }
}
