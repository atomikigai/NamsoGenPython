package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzame implements zzamm {
    private final zzec zza;
    private final zzed zzb;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadx zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzad zzk;
    private int zzl;
    private long zzm;

    public zzame() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        zzdb.zzb(this.zzf);
        while (zzedVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                while (zzedVar.zzb() > 0) {
                    if (this.zzi) {
                        int iZzm = zzedVar.zzm();
                        if (iZzm == 119) {
                            this.zzi = false;
                            this.zzg = 1;
                            zzed zzedVar2 = this.zzb;
                            zzedVar2.zzN()[0] = 11;
                            zzedVar2.zzN()[1] = 119;
                            this.zzh = 2;
                            break;
                        }
                        this.zzi = iZzm == 11;
                    } else {
                        this.zzi = zzedVar.zzm() == 11;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzedVar.zzb(), this.zzl - this.zzh);
                this.zzf.zzq(zzedVar, iMin);
                int i10 = this.zzh + iMin;
                this.zzh = i10;
                if (i10 == this.zzl) {
                    zzdb.zzf(this.zzm != -9223372036854775807L);
                    this.zzf.zzs(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzj;
                    this.zzg = 0;
                }
            } else {
                byte[] bArrZzN = this.zzb.zzN();
                int iMin2 = Math.min(zzedVar.zzb(), 128 - this.zzh);
                zzedVar.zzH(bArrZzN, this.zzh, iMin2);
                int i11 = this.zzh + iMin2;
                this.zzh = i11;
                if (i11 == 128) {
                    this.zza.zzl(0);
                    zzabp zzabpVarZze = zzabr.zze(this.zza);
                    zzad zzadVar = this.zzk;
                    if (zzadVar == null || zzabpVarZze.zzc != zzadVar.zzC || zzabpVarZze.zzb != zzadVar.zzD || !Objects.equals(zzabpVarZze.zza, zzadVar.zzo)) {
                        zzab zzabVar = new zzab();
                        zzabVar.zzL(this.zze);
                        zzabVar.zzZ(zzabpVarZze.zza);
                        zzabVar.zzz(zzabpVarZze.zzc);
                        zzabVar.zzaa(zzabpVarZze.zzb);
                        zzabVar.zzP(this.zzc);
                        zzabVar.zzX(this.zzd);
                        zzabVar.zzU(zzabpVarZze.zzf);
                        if ("audio/ac3".equals(zzabpVarZze.zza)) {
                            zzabVar.zzy(zzabpVarZze.zzf);
                        }
                        zzad zzadVarZzaf = zzabVar.zzaf();
                        this.zzk = zzadVarZzaf;
                        this.zzf.zzl(zzadVarZzaf);
                    }
                    this.zzl = zzabpVarZze.zzd;
                    this.zzj = (((long) zzabpVarZze.zze) * 1000000) / ((long) this.zzk.zzD);
                    this.zzb.zzL(0);
                    this.zzf.zzq(this.zzb, 128);
                    this.zzg = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zze = zzaoaVar.zzb();
        this.zzf = zzacuVar.zzw(zzaoaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j4, int i) {
        this.zzm = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
    }

    public zzame(String str, int i) {
        zzec zzecVar = new zzec(new byte[128], 128);
        this.zza = zzecVar;
        this.zzb = new zzed(zzecVar.zza);
        this.zzg = 0;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
    }
}
