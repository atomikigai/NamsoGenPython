package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzwo implements zzup, zzuo {
    private final zzup zza;
    private final long zzb;
    private zzuo zzc;

    public zzwo(zzup zzupVar, long j4) {
        this.zza = zzupVar;
        this.zzb = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j4, zzls zzlsVar) {
        long j10 = this.zzb;
        return this.zza.zza(j4 - j10, zzlsVar) + j10;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        long jZzd = this.zza.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j4) {
        long j10 = this.zzb;
        return this.zza.zze(j4 - j10) + j10;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzf(zzyd[] zzydVarArr, boolean[] zArr, zzwg[] zzwgVarArr, boolean[] zArr2, long j4) {
        zzwg[] zzwgVarArr2 = new zzwg[zzwgVarArr.length];
        int i = 0;
        while (true) {
            zzwg zzwgVarZzc = null;
            if (i >= zzwgVarArr.length) {
                break;
            }
            zzwn zzwnVar = (zzwn) zzwgVarArr[i];
            if (zzwnVar != null) {
                zzwgVarZzc = zzwnVar.zzc();
            }
            zzwgVarArr2[i] = zzwgVarZzc;
            i++;
        }
        long jZzf = this.zza.zzf(zzydVarArr, zArr, zzwgVarArr2, zArr2, j4 - this.zzb);
        for (int i10 = 0; i10 < zzwgVarArr.length; i10++) {
            zzwg zzwgVar = zzwgVarArr2[i10];
            if (zzwgVar == null) {
                zzwgVarArr[i10] = null;
            } else {
                zzwg zzwgVar2 = zzwgVarArr[i10];
                if (zzwgVar2 == null || ((zzwn) zzwgVar2).zzc() != zzwgVar) {
                    zzwgVarArr[i10] = new zzwn(zzwgVar, this.zzb);
                }
            }
        }
        return jZzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final /* bridge */ /* synthetic */ void zzg(zzwi zzwiVar) {
        zzuo zzuoVar = this.zzc;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzwr zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        zzuo zzuoVar = this.zzc;
        zzuoVar.getClass();
        zzuoVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j4, boolean z4) {
        this.zza.zzj(j4 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j4) {
        this.zzc = zzuoVar;
        this.zza.zzl(this, j4 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j4) {
        this.zza.zzm(j4 - this.zzb);
    }

    public final zzup zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        long j4 = zzkoVar.zza;
        long j10 = this.zzb;
        zzkm zzkmVarZza = zzkoVar.zza();
        zzkmVarZza.zze(j4 - j10);
        return this.zza.zzo(zzkmVarZza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
