package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzum extends zzwt {
    private final boolean zzb;
    private final zzbu zzc;
    private final zzbt zzd;
    private zzuk zze;
    private zzuj zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzum(zzut zzutVar, boolean z4) {
        boolean z10;
        super(zzutVar);
        if (z4) {
            zzutVar.zzv();
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzb = z10;
        this.zzc = new zzbu();
        this.zzd = new zzbt();
        zzutVar.zzM();
        this.zze = zzuk.zzq(zzutVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zze == null || !obj.equals(zzuk.zzc)) ? obj : this.zze.zze;
    }

    private final boolean zzL(long j4) {
        zzuj zzujVar = this.zzf;
        int iZza = this.zze.zza(zzujVar.zza.zza);
        if (iZza == -1) {
            return false;
        }
        zzuk zzukVar = this.zze;
        zzbt zzbtVar = this.zzd;
        zzukVar.zzd(iZza, zzbtVar, false);
        long j10 = zzbtVar.zzd;
        if (j10 != -9223372036854775807L && j4 >= j10) {
            j4 = Math.max(0L, j10 - 1);
        }
        zzujVar.zzs(j4);
        return true;
    }

    public final zzbv zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final zzur zzD(zzur zzurVar) {
        Object obj = this.zze.zze;
        Object obj2 = zzurVar.zza;
        if (obj != null && this.zze.zze.equals(obj2)) {
            obj2 = zzuk.zzc;
        }
        return zzurVar.zza(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.zzwt
    public final void zzE(zzbv zzbvVar) {
        long j4;
        zzur zzurVarZza = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzbvVar);
            zzuj zzujVar = this.zzf;
            if (zzujVar != null) {
                zzL(zzujVar.zzn());
            }
        } else if (zzbvVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzbvVar) : zzuk.zzr(zzbvVar, zzbu.zza, zzuk.zzc);
        } else {
            zzbvVar.zze(0, this.zzc, 0L);
            Object obj = this.zzc.zzb;
            zzuj zzujVar2 = this.zzf;
            if (zzujVar2 != null) {
                long jZzq = zzujVar2.zzq();
                this.zze.zzn(zzujVar2.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (jZzq != 0) {
                    j4 = jZzq;
                } else {
                    j4 = 0;
                }
            } else {
                j4 = 0;
            }
            Pair pairZzl = zzbvVar.zzl(this.zzc, this.zzd, 0, j4);
            Object obj2 = pairZzl.first;
            long jLongValue = ((Long) pairZzl.second).longValue();
            this.zze = this.zzi ? this.zze.zzp(zzbvVar) : zzuk.zzr(zzbvVar, obj, obj2);
            zzuj zzujVar3 = this.zzf;
            if (zzujVar3 != null && zzL(jLongValue)) {
                zzur zzurVar = zzujVar3.zza;
                zzurVarZza = zzurVar.zza(zzK(zzurVar.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zzurVarZza != null) {
            zzuj zzujVar4 = this.zzf;
            zzujVar4.getClass();
            zzujVar4.zzr(zzurVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((zzwt) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzut
    public final void zzG(zzup zzupVar) {
        ((zzuj) zzupVar).zzt();
        if (zzupVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzut
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzuj zzI(zzur zzurVar, zzys zzysVar, long j4) {
        zzuj zzujVar = new zzuj(zzurVar, zzysVar, j4);
        zzujVar.zzu(((zzwt) this).zza);
        if (this.zzh) {
            zzujVar.zzr(zzurVar.zza(zzK(zzurVar.zza)));
            return zzujVar;
        }
        this.zzf = zzujVar;
        if (!this.zzg) {
            this.zzg = true;
            zzB(null, ((zzwt) this).zza);
        }
        return zzujVar;
    }

    @Override // com.google.android.gms.internal.ads.zztz, com.google.android.gms.internal.ads.zztq
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzut
    public final void zzt(zzaw zzawVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzwp(this.zze.zzb, zzawVar));
        } else {
            this.zze = zzuk.zzq(zzawVar);
        }
        ((zzwt) this).zza.zzt(zzawVar);
    }

    @Override // com.google.android.gms.internal.ads.zztz, com.google.android.gms.internal.ads.zzut
    public final void zzz() {
    }
}
