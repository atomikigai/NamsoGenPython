package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzano implements zzaob {
    private final zzann zza;
    private final zzed zzb = new zzed(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzano(zzann zzannVar) {
        this.zza = zzannVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zza(zzed zzedVar, int i) {
        int iZzd;
        int i10 = i & 1;
        if (i10 != 0) {
            iZzd = zzedVar.zzd() + zzedVar.zzm();
        } else {
            iZzd = -1;
        }
        if (this.zzf) {
            if (i10 == 0) {
                return;
            }
            this.zzf = false;
            zzedVar.zzL(iZzd);
            this.zzd = 0;
        }
        while (zzedVar.zzb() > 0) {
            int i11 = this.zzd;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iZzm = zzedVar.zzm();
                    zzedVar.zzL(zzedVar.zzd() - 1);
                    if (iZzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzedVar.zzb(), 3 - this.zzd);
                zzedVar.zzH(this.zzb.zzN(), this.zzd, iMin);
                int i12 = this.zzd + iMin;
                this.zzd = i12;
                if (i12 == 3) {
                    this.zzb.zzL(0);
                    this.zzb.zzK(3);
                    this.zzb.zzM(1);
                    zzed zzedVar2 = this.zzb;
                    int iZzm2 = zzedVar2.zzm();
                    boolean z4 = (iZzm2 & 128) != 0;
                    int iZzm3 = zzedVar2.zzm();
                    this.zze = z4;
                    this.zzc = (iZzm3 | ((iZzm2 & 15) << 8)) + 3;
                    int iZzc = this.zzb.zzc();
                    int i13 = this.zzc;
                    if (iZzc < i13) {
                        int iZzc2 = this.zzb.zzc();
                        this.zzb.zzF(Math.min(4098, Math.max(i13, iZzc2 + iZzc2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzedVar.zzb(), this.zzc - i11);
                zzedVar.zzH(this.zzb.zzN(), this.zzd, iMin2);
                int i14 = this.zzd + iMin2;
                this.zzd = i14;
                int i15 = this.zzc;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzK(i15);
                    } else {
                        if (zzen.zzf(this.zzb.zzN(), 0, i15, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzK(this.zzc - 4);
                    }
                    this.zzb.zzL(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzb(zzek zzekVar, zzacu zzacuVar, zzaoa zzaoaVar) {
        this.zza.zzb(zzekVar, zzacuVar, zzaoaVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzc() {
        this.zzf = true;
    }
}
