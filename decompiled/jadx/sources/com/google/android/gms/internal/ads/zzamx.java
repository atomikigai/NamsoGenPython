package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamx implements zzamm {
    private final String zza;
    private final int zzb;
    private final zzed zzc;
    private final zzec zzd;
    private zzadx zze;
    private String zzf;
    private zzad zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private String zzv;

    public zzamx(String str, int i) {
        this.zza = str;
        this.zzb = i;
        zzed zzedVar = new zzed(1024);
        this.zzc = zzedVar;
        byte[] bArrZzN = zzedVar.zzN();
        this.zzd = new zzec(bArrZzN, bArrZzN.length);
        this.zzl = -9223372036854775807L;
    }

    private final int zzf(zzec zzecVar) throws zzbh {
        int iZza = zzecVar.zza();
        zzabm zzabmVarZzb = zzabo.zzb(zzecVar, true);
        this.zzv = zzabmVarZzb.zzc;
        this.zzs = zzabmVarZzb.zza;
        this.zzu = zzabmVarZzb.zzb;
        return iZza - zzecVar.zza();
    }

    private static long zzg(zzec zzecVar) {
        return zzecVar.zzd((zzecVar.zzd(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) throws zzbh {
        int i;
        int i10;
        int iZzd;
        boolean zZzp;
        zzdb.zzb(this.zze);
        while (zzedVar.zzb() > 0) {
            int i11 = this.zzh;
            if (i11 != 0) {
                if (i11 == 1) {
                    int iZzm = zzedVar.zzm();
                    if ((iZzm & 224) == 224) {
                        this.zzk = iZzm;
                        this.zzh = 2;
                    } else if (iZzm != 86) {
                        this.zzh = 0;
                    }
                } else if (i11 != 2) {
                    int iMin = Math.min(zzedVar.zzb(), this.zzj - this.zzi);
                    zzedVar.zzH(this.zzd.zza, this.zzi, iMin);
                    int i12 = this.zzi + iMin;
                    this.zzi = i12;
                    if (i12 == this.zzj) {
                        this.zzd.zzl(0);
                        zzec zzecVar = this.zzd;
                        if (zzecVar.zzp()) {
                            if (this.zzm) {
                            }
                            this.zzh = 0;
                        } else {
                            this.zzm = true;
                            int iZzd2 = zzecVar.zzd(1);
                            if (iZzd2 == 1) {
                                iZzd = zzecVar.zzd(1);
                                i10 = 1;
                            } else {
                                i10 = iZzd2;
                                iZzd = 0;
                            }
                            this.zzn = iZzd;
                            if (iZzd != 0) {
                                throw zzbh.zza(null, null);
                            }
                            if (i10 == 1) {
                                zzg(zzecVar);
                                i10 = 1;
                            }
                            if (!zzecVar.zzp()) {
                                throw zzbh.zza(null, null);
                            }
                            this.zzo = zzecVar.zzd(6);
                            int iZzd3 = zzecVar.zzd(4);
                            int iZzd4 = zzecVar.zzd(3);
                            if (iZzd3 != 0 || iZzd4 != 0) {
                                throw zzbh.zza(null, null);
                            }
                            if (i10 == 0) {
                                int iZzc = zzecVar.zzc();
                                int iZzf = zzf(zzecVar);
                                zzecVar.zzl(iZzc);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzecVar.zzh(bArr, 0, iZzf);
                                zzab zzabVar = new zzab();
                                zzabVar.zzL(this.zzf);
                                zzabVar.zzZ("audio/mp4a-latm");
                                zzabVar.zzA(this.zzv);
                                zzabVar.zzz(this.zzu);
                                zzabVar.zzaa(this.zzs);
                                zzabVar.zzM(Collections.singletonList(bArr));
                                zzabVar.zzP(this.zza);
                                zzabVar.zzX(this.zzb);
                                zzad zzadVarZzaf = zzabVar.zzaf();
                                if (!zzadVarZzaf.equals(this.zzg)) {
                                    this.zzg = zzadVarZzaf;
                                    this.zzt = 1024000000 / ((long) zzadVarZzaf.zzD);
                                    this.zze.zzl(zzadVarZzaf);
                                }
                            } else {
                                zzecVar.zzn(((int) zzg(zzecVar)) - zzf(zzecVar));
                            }
                            int iZzd5 = zzecVar.zzd(3);
                            this.zzp = iZzd5;
                            if (iZzd5 == 0) {
                                zzecVar.zzn(8);
                            } else if (iZzd5 == 1) {
                                zzecVar.zzn(9);
                            } else if (iZzd5 == 3 || iZzd5 == 4 || iZzd5 == 5) {
                                zzecVar.zzn(6);
                            } else {
                                if (iZzd5 != 6 && iZzd5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzecVar.zzn(1);
                            }
                            boolean zZzp2 = zzecVar.zzp();
                            this.zzq = zZzp2;
                            this.zzr = 0L;
                            if (zZzp2) {
                                if (i10 != 1) {
                                    do {
                                        zZzp = zzecVar.zzp();
                                        this.zzr = (this.zzr << 8) + ((long) zzecVar.zzd(8));
                                    } while (zZzp);
                                } else {
                                    this.zzr = zzg(zzecVar);
                                }
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(8);
                            }
                        }
                        if (this.zzn != 0) {
                            throw zzbh.zza(null, null);
                        }
                        if (this.zzo != 0) {
                            throw zzbh.zza(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzbh.zza(null, null);
                        }
                        int i13 = 0;
                        while (true) {
                            int iZzd6 = zzecVar.zzd(8);
                            i = i13 + iZzd6;
                            if (iZzd6 != 255) {
                                break;
                            } else {
                                i13 = i;
                            }
                        }
                        int iZzc2 = zzecVar.zzc();
                        if ((iZzc2 & 7) == 0) {
                            this.zzc.zzL(iZzc2 >> 3);
                        } else {
                            zzecVar.zzh(this.zzc.zzN(), 0, i * 8);
                            this.zzc.zzL(0);
                        }
                        this.zze.zzq(this.zzc, i);
                        zzdb.zzf(this.zzl != -9223372036854775807L);
                        this.zze.zzs(this.zzl, 1, i, 0, null);
                        this.zzl += this.zzt;
                        if (this.zzq) {
                            zzecVar.zzn((int) this.zzr);
                        }
                        this.zzh = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzm2 = ((this.zzk & (-225)) << 8) | zzedVar.zzm();
                    this.zzj = iZzm2;
                    zzed zzedVar2 = this.zzc;
                    if (iZzm2 > zzedVar2.zzN().length) {
                        zzedVar2.zzI(iZzm2);
                        zzec zzecVar2 = this.zzd;
                        byte[] bArrZzN = this.zzc.zzN();
                        zzecVar2.zzk(bArrZzN, bArrZzN.length);
                    }
                    this.zzi = 0;
                    this.zzh = 3;
                }
            } else if (zzedVar.zzm() == 86) {
                this.zzh = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        this.zze = zzacuVar.zzw(zzaoaVar.zza(), 1);
        this.zzf = zzaoaVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j4, int i) {
        this.zzl = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzh = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = false;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
    }
}
