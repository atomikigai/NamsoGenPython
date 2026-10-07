package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamy implements zzamm {
    private final zzed zza;
    private final zzadj zzb;
    private final String zzc;
    private final int zzd;
    private zzadx zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzamy() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        zzdb.zzb(this.zze);
        while (zzedVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                byte[] bArrZzN = zzedVar.zzN();
                int iZzd = zzedVar.zzd();
                int iZze = zzedVar.zze();
                while (true) {
                    if (iZzd >= iZze) {
                        zzedVar.zzL(iZze);
                        break;
                    }
                    int i10 = iZzd + 1;
                    byte b10 = bArrZzN[iZzd];
                    boolean z4 = (b10 & 255) == 255;
                    boolean z10 = this.zzj && (b10 & 224) == 224;
                    this.zzj = z4;
                    if (z10) {
                        zzedVar.zzL(i10);
                        this.zzj = false;
                        this.zza.zzN()[1] = bArrZzN[iZzd];
                        this.zzh = 2;
                        this.zzg = 1;
                        break;
                    }
                    iZzd = i10;
                }
            } else if (i != 1) {
                int iMin = Math.min(zzedVar.zzb(), this.zzl - this.zzh);
                this.zze.zzq(zzedVar, iMin);
                int i11 = this.zzh + iMin;
                this.zzh = i11;
                if (i11 >= this.zzl) {
                    zzdb.zzf(this.zzm != -9223372036854775807L);
                    this.zze.zzs(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzk;
                    this.zzh = 0;
                    this.zzg = 0;
                }
            } else {
                int iMin2 = Math.min(zzedVar.zzb(), 4 - this.zzh);
                zzedVar.zzH(this.zza.zzN(), this.zzh, iMin2);
                int i12 = this.zzh + iMin2;
                this.zzh = i12;
                if (i12 >= 4) {
                    this.zza.zzL(0);
                    if (this.zzb.zza(this.zza.zzg())) {
                        zzadj zzadjVar = this.zzb;
                        this.zzl = zzadjVar.zzc;
                        if (!this.zzi) {
                            this.zzk = (((long) zzadjVar.zzg) * 1000000) / ((long) zzadjVar.zzd);
                            zzab zzabVar = new zzab();
                            zzabVar.zzL(this.zzf);
                            zzabVar.zzZ(this.zzb.zzb);
                            zzabVar.zzQ(4096);
                            zzabVar.zzz(this.zzb.zze);
                            zzabVar.zzaa(this.zzb.zzd);
                            zzabVar.zzP(this.zzc);
                            zzabVar.zzX(this.zzd);
                            this.zze.zzl(zzabVar.zzaf());
                            this.zzi = true;
                        }
                        this.zza.zzL(0);
                        this.zze.zzq(this.zza, 4);
                        this.zzg = 2;
                    } else {
                        this.zzh = 0;
                        this.zzg = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zzf = zzaoaVar.zzb();
        this.zze = zzacuVar.zzw(zzaoaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j4, int i) {
        this.zzm = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
    }

    public zzamy(String str, int i) {
        this.zzg = 0;
        zzed zzedVar = new zzed(4);
        this.zza = zzedVar;
        zzedVar.zzN()[0] = -1;
        this.zzb = new zzadj();
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
    }
}
