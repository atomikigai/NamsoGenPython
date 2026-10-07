package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamd implements zzacr {
    private final zzame zza = new zzame(null, 0);
    private final zzed zzb = new zzed(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        int iZza = zzacsVar.zza(this.zzb.zzN(), 0, 2786);
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
        zzed zzedVar = new zzed(10);
        int i = 0;
        while (true) {
            zzacg zzacgVar = (zzacg) zzacsVar;
            zzacgVar.zzm(zzedVar.zzN(), 0, 10, false);
            zzedVar.zzL(0);
            if (zzedVar.zzo() != 4801587) {
                break;
            }
            zzedVar.zzM(3);
            int iZzl = zzedVar.zzl();
            i += iZzl + 10;
            zzacgVar.zzl(iZzl, false);
        }
        zzacsVar.zzj();
        zzacg zzacgVar2 = (zzacg) zzacsVar;
        zzacgVar2.zzl(i, false);
        int i10 = 0;
        int i11 = i;
        while (true) {
            zzacgVar2.zzm(zzedVar.zzN(), 0, 6, false);
            zzedVar.zzL(0);
            if (zzedVar.zzq() != 2935) {
                zzacsVar.zzj();
                i11++;
                if (i11 - i >= 8192) {
                    return false;
                }
                zzacgVar2.zzl(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                int iZzb = zzabr.zzb(zzedVar.zzN());
                if (iZzb == -1) {
                    return false;
                }
                zzacgVar2.zzl(iZzb - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
