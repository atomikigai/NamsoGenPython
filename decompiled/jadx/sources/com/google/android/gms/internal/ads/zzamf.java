package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamf implements zzacr {
    private final zzamg zza = new zzamg(null, 0);
    private final zzed zzb = new zzed(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        int iZza = zzacsVar.zza(this.zzb.zzN(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(iZza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zza.zzb(zzacuVar, new zzaoa(Integer.MIN_VALUE, 0, 1));
        zzacuVar.zzD();
        zzacuVar.zzO(new zzadp(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        int i;
        zzed zzedVar = new zzed(10);
        int i10 = 0;
        while (true) {
            zzacg zzacgVar = (zzacg) zzacsVar;
            zzacgVar.zzm(zzedVar.zzN(), 0, 10, false);
            zzedVar.zzL(0);
            if (zzedVar.zzo() != 4801587) {
                break;
            }
            zzedVar.zzM(3);
            int iZzl = zzedVar.zzl();
            i10 += iZzl + 10;
            zzacgVar.zzl(iZzl, false);
        }
        zzacsVar.zzj();
        zzacg zzacgVar2 = (zzacg) zzacsVar;
        zzacgVar2.zzl(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            zzacgVar2.zzm(zzedVar.zzN(), 0, 7, false);
            zzedVar.zzL(0);
            int iZzq = zzedVar.zzq();
            if (iZzq == 44096 || iZzq == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArrZzN = zzedVar.zzN();
                if (bArrZzN.length < 7) {
                    i = -1;
                } else {
                    int i14 = ((bArrZzN[2] & 255) << 8) | (bArrZzN[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((bArrZzN[4] & 255) << 16) | ((bArrZzN[5] & 255) << 8) | (bArrZzN[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (iZzq == 44097) {
                        i13 += 2;
                    }
                    i = i14 + i13;
                }
                if (i == -1) {
                    return false;
                }
                zzacgVar2.zzl(i - 7, false);
            } else {
                zzacsVar.zzj();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                zzacgVar2.zzl(i12, false);
                i11 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
