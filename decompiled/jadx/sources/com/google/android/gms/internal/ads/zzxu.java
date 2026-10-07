package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzxu extends zzxw implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    /* JADX WARN: Multi-variable type inference failed */
    public zzxu(int i, zzbw zzbwVar, int i10, zzxp zzxpVar, int i11, String str) {
        int iZzc;
        super(i, zzbwVar, i10);
        int i12 = 0;
        this.zzf = zzlo.zza(i11, false);
        int i13 = this.zzd.zze;
        int i14 = zzxpVar.zzv;
        this.zzg = 1 == (i13 & 1);
        this.zzh = (i13 & 2) != 0;
        zzfzo zzfzoVarZzo = zzxpVar.zzt.isEmpty() ? zzfzo.zzo("") : zzxpVar.zzt;
        int i15 = 0;
        while (true) {
            if (i15 >= zzfzoVarZzo.size()) {
                i15 = f.API_PRIORITY_OTHER;
                iZzc = 0;
                break;
            } else {
                iZzc = zzyb.zzc(this.zzd, (String) zzfzoVarZzo.get(i15), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.zzi = i15;
        this.zzj = iZzc;
        int iZzb = zzyb.zzb(this.zzd.zzf, zzxpVar.zzu);
        this.zzk = iZzb;
        this.zzm = (this.zzd.zzf & 1088) != 0;
        int iZzc2 = zzyb.zzc(this.zzd, str, zzyb.zzh(str) == null);
        this.zzl = iZzc2;
        boolean z4 = iZzc > 0 || (zzxpVar.zzt.isEmpty() && iZzb > 0) || this.zzg || (this.zzh && iZzc2 > 0);
        if (zzlo.zza(i11, zzxpVar.zzN) && z4) {
            i12 = 1;
        }
        this.zze = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxu zzxuVar) {
        zzfzd zzfzdVarZzb = zzfzd.zzj().zzd(this.zzf, zzxuVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzxuVar.zzi), zzgaz.zzc().zza()).zzb(this.zzj, zzxuVar.zzj).zzb(this.zzk, zzxuVar.zzk).zzd(this.zzg, zzxuVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzxuVar.zzh), this.zzj == 0 ? zzgaz.zzc() : zzgaz.zzc().zza()).zzb(this.zzl, zzxuVar.zzl);
        if (this.zzk == 0) {
            zzfzdVarZzb = zzfzdVarZzb.zze(this.zzm, zzxuVar.zzm);
        }
        return zzfzdVarZzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final /* bridge */ /* synthetic */ boolean zzc(zzxw zzxwVar) {
        return false;
    }
}
