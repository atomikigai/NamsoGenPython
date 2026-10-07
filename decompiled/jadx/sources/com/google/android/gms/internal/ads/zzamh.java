package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamh implements zzacr {
    private final zzami zza;
    private final zzed zzb;
    private final zzed zzc;
    private final zzec zzd;
    private zzacu zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzamh() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        zzdb.zzb(this.zze);
        int iZza = zzacsVar.zza(this.zzb.zzN(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzO(new zzadp(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(iZza);
        if (!this.zzh) {
            this.zza.zzd(this.zzf, 4);
            this.zzh = true;
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
        this.zze = zzacuVar;
        this.zza.zzb(zzacuVar, new zzaoa(Integer.MIN_VALUE, 0, 1));
        zzacuVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        int i = 0;
        while (true) {
            zzacg zzacgVar = (zzacg) zzacsVar;
            zzacgVar.zzm(this.zzc.zzN(), 0, 10, false);
            this.zzc.zzL(0);
            if (this.zzc.zzo() != 4801587) {
                break;
            }
            this.zzc.zzM(3);
            int iZzl = this.zzc.zzl();
            i += iZzl + 10;
            zzacgVar.zzl(iZzl, false);
        }
        zzacsVar.zzj();
        zzacg zzacgVar2 = (zzacg) zzacsVar;
        zzacgVar2.zzl(i, false);
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = i;
        do {
            zzacgVar2.zzm(this.zzc.zzN(), 0, 2, false);
            this.zzc.zzL(0);
            if (zzami.zzf(this.zzc.zzq())) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                zzacgVar2.zzm(this.zzc.zzN(), 0, 4, false);
                this.zzd.zzl(14);
                int iZzd = this.zzd.zzd(13);
                if (iZzd <= 6) {
                    i12++;
                    zzacsVar.zzj();
                    zzacgVar2.zzl(i12, false);
                } else {
                    zzacgVar2.zzl(iZzd - 6, false);
                    i11 += iZzd;
                }
            } else {
                i12++;
                zzacsVar.zzj();
                zzacgVar2.zzl(i12, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i12 - i < 8192);
        return false;
    }

    public zzamh(int i) {
        this.zza = new zzami(true, null, 0);
        this.zzb = new zzed(2048);
        this.zzg = -1L;
        zzed zzedVar = new zzed(10);
        this.zzc = zzedVar;
        byte[] bArrZzN = zzedVar.zzN();
        this.zzd = new zzec(bArrZzN, bArrZzN.length);
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
