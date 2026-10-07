package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamg implements zzamm {
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

    public zzamg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        zzdb.zzb(this.zzf);
        while (zzedVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                while (true) {
                    if (zzedVar.zzb() > 0) {
                        if (this.zzi) {
                            int iZzm = zzedVar.zzm();
                            this.zzi = iZzm == 172;
                            if (iZzm != 64) {
                                if (iZzm == 65) {
                                    iZzm = 65;
                                }
                            }
                            this.zzg = 1;
                            zzed zzedVar2 = this.zzb;
                            zzedVar2.zzN()[0] = -84;
                            zzedVar2.zzN()[1] = iZzm == 65 ? (byte) 65 : (byte) 64;
                            this.zzh = 2;
                        } else {
                            this.zzi = zzedVar.zzm() == 172;
                        }
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
                int iMin2 = Math.min(zzedVar.zzb(), 16 - this.zzh);
                zzedVar.zzH(bArrZzN, this.zzh, iMin2);
                int i11 = this.zzh + iMin2;
                this.zzh = i11;
                if (i11 == 16) {
                    this.zza.zzl(0);
                    zzabs zzabsVarZza = zzabu.zza(this.zza);
                    zzad zzadVar = this.zzk;
                    if (zzadVar == null || zzadVar.zzC != 2 || zzabsVarZza.zza != zzadVar.zzD || !"audio/ac4".equals(zzadVar.zzo)) {
                        zzab zzabVar = new zzab();
                        zzabVar.zzL(this.zze);
                        zzabVar.zzZ("audio/ac4");
                        zzabVar.zzz(2);
                        zzabVar.zzaa(zzabsVarZza.zza);
                        zzabVar.zzP(this.zzc);
                        zzabVar.zzX(this.zzd);
                        zzad zzadVarZzaf = zzabVar.zzaf();
                        this.zzk = zzadVarZzaf;
                        this.zzf.zzl(zzadVarZzaf);
                    }
                    this.zzl = zzabsVarZza.zzb;
                    this.zzj = (((long) zzabsVarZza.zzc) * 1000000) / ((long) this.zzk.zzD);
                    this.zzb.zzL(0);
                    this.zzf.zzq(this.zzb, 16);
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

    public zzamg(String str, int i) {
        zzec zzecVar = new zzec(new byte[16], 16);
        this.zza = zzecVar;
        this.zzb = new zzed(zzecVar.zza);
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
    }
}
