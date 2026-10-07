package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaey implements zzacr {
    private zzacu zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaex zzo;
    private zzafc zzp;
    private final zzed zza = new zzed(4);
    private final zzed zzb = new zzed(9);
    private final zzed zzc = new zzed(11);
    private final zzed zzd = new zzed();
    private final zzaez zze = new zzaez();
    private int zzg = 1;

    private final zzed zza(zzacs zzacsVar) throws IOException {
        if (this.zzl > this.zzd.zzc()) {
            zzed zzedVar = this.zzd;
            int iZzc = zzedVar.zzc();
            zzedVar.zzJ(new byte[Math.max(iZzc + iZzc, this.zzl)], 0);
        } else {
            this.zzd.zzL(0);
        }
        this.zzd.zzK(this.zzl);
        zzacsVar.zzi(this.zzd.zzN(), 0, this.zzl);
        return this.zzd;
    }

    private final void zzg() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzO(new zzadp(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        long j4;
        boolean zZzf;
        boolean z4;
        long j10;
        zzdb.zzb(this.zzf);
        while (true) {
            int i = this.zzg;
            int i10 = 8;
            if (i != 1) {
                if (i == 2) {
                    zzacsVar.zzk(this.zzj);
                    this.zzj = 0;
                    this.zzg = 3;
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (this.zzh) {
                        j4 = this.zzi + this.zzm;
                    } else {
                        j4 = this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                    }
                    int i11 = this.zzk;
                    if (i11 == 8) {
                        if (this.zzo != null) {
                            zzg();
                            zZzf = this.zzo.zzf(zza(zzacsVar), j4);
                        }
                        z4 = true;
                        if (!this.zzh && zZzf) {
                            this.zzh = true;
                            if (this.zze.zzc() == -9223372036854775807L) {
                                j10 = -this.zzm;
                            } else {
                                j10 = 0;
                            }
                            this.zzi = j10;
                        }
                        this.zzj = 4;
                        this.zzg = 2;
                        if (z4) {
                            return 0;
                        }
                    } else {
                        i10 = i11;
                    }
                    if (i10 == 9) {
                        if (this.zzp != null) {
                            zzg();
                            zZzf = this.zzp.zzf(zza(zzacsVar), j4);
                            z4 = true;
                        } else {
                            zzacsVar.zzk(this.zzl);
                            zZzf = false;
                            z4 = false;
                        }
                    } else if (i10 != 18 || this.zzn) {
                        zzacsVar.zzk(this.zzl);
                        zZzf = false;
                        z4 = false;
                    } else {
                        zZzf = this.zze.zzf(zza(zzacsVar), j4);
                        zzaez zzaezVar = this.zze;
                        long jZzc = zzaezVar.zzc();
                        if (jZzc != -9223372036854775807L) {
                            this.zzf.zzO(new zzadi(zzaezVar.zzd(), zzaezVar.zze(), jZzc));
                            this.zzn = true;
                        }
                        z4 = true;
                    }
                    if (!this.zzh) {
                        this.zzh = true;
                        if (this.zze.zzc() == -9223372036854775807L) {
                            j10 = -this.zzm;
                        } else {
                            j10 = 0;
                        }
                        this.zzi = j10;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (z4) {
                        return 0;
                    }
                } else {
                    if (!zzacsVar.zzn(this.zzc.zzN(), 0, 11, true)) {
                        return -1;
                    }
                    this.zzc.zzL(0);
                    this.zzk = this.zzc.zzm();
                    this.zzl = this.zzc.zzo();
                    this.zzm = this.zzc.zzo();
                    this.zzm = (((long) (this.zzc.zzm() << 24)) | this.zzm) * 1000;
                    this.zzc.zzM(3);
                    this.zzg = 4;
                }
            } else {
                if (!zzacsVar.zzn(this.zzb.zzN(), 0, 9, true)) {
                    return -1;
                }
                this.zzb.zzL(0);
                this.zzb.zzM(4);
                int iZzm = this.zzb.zzm();
                int i12 = iZzm & 4;
                int i13 = iZzm & 1;
                if (i12 != 0 && this.zzo == null) {
                    this.zzo = new zzaex(this.zzf.zzw(8, 1));
                }
                if (i13 != 0 && this.zzp == null) {
                    this.zzp = new zzafc(this.zzf.zzw(9, 2));
                }
                this.zzf.zzD();
                this.zzj = this.zzb.zzg() - 5;
                this.zzg = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zzf = zzacuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        if (j4 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        zzacg zzacgVar = (zzacg) zzacsVar;
        zzacgVar.zzm(this.zza.zzN(), 0, 3, false);
        this.zza.zzL(0);
        if (this.zza.zzo() != 4607062) {
            return false;
        }
        zzacgVar.zzm(this.zza.zzN(), 0, 2, false);
        this.zza.zzL(0);
        if ((this.zza.zzq() & 250) != 0) {
            return false;
        }
        zzacgVar.zzm(this.zza.zzN(), 0, 4, false);
        this.zza.zzL(0);
        int iZzg = this.zza.zzg();
        zzacsVar.zzj();
        zzacg zzacgVar2 = (zzacg) zzacsVar;
        zzacgVar2.zzl(iZzg, false);
        zzacgVar2.zzm(this.zza.zzN(), 0, 4, false);
        this.zza.zzL(0);
        return this.zza.zzg() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
