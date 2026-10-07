package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zztv implements zzup, zzuo {
    public final zzup zza;
    long zzb;
    private zzuo zzc;
    private zztu[] zzd = new zztu[0];
    private long zze = 0;

    public zztv(zzup zzupVar, boolean z4, long j4, long j10) {
        this.zza = zzupVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j4, zzls zzlsVar) {
        if (j4 == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(zzlsVar.zzc, j4));
        long j10 = zzlsVar.zzd;
        long j11 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j10, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j4));
        if (jMax != zzlsVar.zzc || jMax2 != zzlsVar.zzd) {
            zzlsVar = new zzls(jMax, jMax2);
        }
        return this.zza.zza(j4, zzlsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j4 = this.zzb;
            if (j4 == Long.MIN_VALUE || jZzb < j4) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j4 = this.zzb;
            if (j4 == Long.MIN_VALUE || jZzc < j4) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        if (zzq()) {
            long j4 = this.zze;
            this.zze = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j4;
        }
        long jZzd2 = this.zza.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        zzdb.zzf(jZzd2 >= 0);
        long j10 = this.zzb;
        zzdb.zzf(j10 == Long.MIN_VALUE || jZzd2 <= j10);
        return jZzd2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j4) {
        this.zze = -9223372036854775807L;
        boolean z4 = false;
        for (zztu zztuVar : this.zzd) {
            if (zztuVar != null) {
                zztuVar.zzc();
            }
        }
        long jZze = this.zza.zze(j4);
        if (jZze == j4) {
            z4 = true;
        } else if (jZze >= 0) {
            long j10 = this.zzb;
            if (j10 == Long.MIN_VALUE || jZze <= j10) {
                z4 = true;
            }
        }
        zzdb.zzf(z4);
        return jZze;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzf(zzyd[] zzydVarArr, boolean[] zArr, zzwg[] zzwgVarArr, boolean[] zArr2, long j4) {
        int length = zzwgVarArr.length;
        this.zzd = new zztu[length];
        zzwg[] zzwgVarArr2 = new zzwg[length];
        int i = 0;
        while (true) {
            zzwg zzwgVar = null;
            if (i >= zzwgVarArr.length) {
                break;
            }
            zztu[] zztuVarArr = this.zzd;
            zztu zztuVar = (zztu) zzwgVarArr[i];
            zztuVarArr[i] = zztuVar;
            if (zztuVar != null) {
                zzwgVar = zztuVar.zza;
            }
            zzwgVarArr2[i] = zzwgVar;
            i++;
        }
        long jZzf = this.zza.zzf(zzydVarArr, zArr, zzwgVarArr2, zArr2, j4);
        long j10 = (zzq() && j4 == 0) ? 0L : j4;
        this.zze = -9223372036854775807L;
        boolean z4 = true;
        if (jZzf != j10) {
            if (jZzf >= 0) {
                long j11 = this.zzb;
                if (j11 != Long.MIN_VALUE && jZzf > j11) {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
        }
        zzdb.zzf(z4);
        for (int i10 = 0; i10 < zzwgVarArr.length; i10++) {
            zzwg zzwgVar2 = zzwgVarArr2[i10];
            if (zzwgVar2 == null) {
                this.zzd[i10] = null;
            } else {
                zztu[] zztuVarArr2 = this.zzd;
                zztu zztuVar2 = zztuVarArr2[i10];
                if (zztuVar2 == null || zztuVar2.zza != zzwgVar2) {
                    zztuVarArr2[i10] = new zztu(this, zzwgVar2);
                }
            }
            zzwgVarArr[i10] = this.zzd[i10];
        }
        return jZzf;
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
        this.zza.zzj(j4, false);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j4) {
        this.zzc = zzuoVar;
        this.zza.zzl(this, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final void zzm(long j4) {
        this.zza.zzm(j4);
    }

    public final void zzn(long j4, long j10) {
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzo(zzko zzkoVar) {
        return this.zza.zzo(zzkoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwi
    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }
}
