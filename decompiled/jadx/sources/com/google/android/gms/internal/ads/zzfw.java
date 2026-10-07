package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfw implements zzgd {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzgi zzd;

    public zzfw(boolean z4) {
        this.zza = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzf(zzhd zzhdVar) {
        zzhdVar.getClass();
        if (this.zzb.contains(zzhdVar)) {
            return;
        }
        this.zzb.add(zzhdVar);
        this.zzc++;
    }

    public final void zzg(int i) {
        zzgi zzgiVar = this.zzd;
        int i10 = zzen.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzhd) this.zzb.get(i11)).zza(this, zzgiVar, this.zza, i);
        }
    }

    public final void zzh() {
        zzgi zzgiVar = this.zzd;
        int i = zzen.zza;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhd) this.zzb.get(i10)).zzb(this, zzgiVar, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzgi zzgiVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzhd) this.zzb.get(i)).zzc(this, zzgiVar, this.zza);
        }
    }

    public final void zzj(zzgi zzgiVar) {
        this.zzd = zzgiVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzhd) this.zzb.get(i)).zzd(this, zzgiVar, this.zza);
        }
    }
}
