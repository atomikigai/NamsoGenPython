package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzanm implements zzacr {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzanj zzi;
    private zzacu zzj;
    private boolean zzk;
    private final zzek zza = new zzek(0);
    private final zzed zzc = new zzed(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzank zzd = new zzank();

    /* JADX WARN: Code duplicated, block: B:64:0x0140  */
    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        zzamm zzamoVar;
        zzdb.zzb(this.zzj);
        long jZzd = zzacsVar.zzd();
        if (jZzd != -1) {
            zzank zzankVar = this.zzd;
            if (!zzankVar.zze()) {
                return zzankVar.zza(zzacsVar, zzadnVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzank zzankVar2 = this.zzd;
            if (zzankVar2.zzb() != -9223372036854775807L) {
                zzanj zzanjVar = new zzanj(zzankVar2.zzd(), zzankVar2.zzb(), jZzd);
                this.zzi = zzanjVar;
                this.zzj.zzO(zzanjVar.zzb());
            } else {
                this.zzj.zzO(new zzadp(zzankVar2.zzb(), 0L));
            }
        }
        zzanj zzanjVar2 = this.zzi;
        if (zzanjVar2 != null && zzanjVar2.zze()) {
            return zzanjVar2.zza(zzacsVar, zzadnVar);
        }
        zzacsVar.zzj();
        long jZze = jZzd != -1 ? jZzd - zzacsVar.zze() : -1L;
        if ((jZze != -1 && jZze < 4) || !zzacsVar.zzm(this.zzc.zzN(), 0, 4, true)) {
            return -1;
        }
        this.zzc.zzL(0);
        int iZzg = this.zzc.zzg();
        if (iZzg == 441) {
            return -1;
        }
        if (iZzg == 442) {
            zzacsVar.zzh(this.zzc.zzN(), 0, 10);
            this.zzc.zzL(9);
            zzacsVar.zzk((this.zzc.zzm() & 7) + 14);
            return 0;
        }
        if (iZzg == 443) {
            zzacsVar.zzh(this.zzc.zzN(), 0, 2);
            this.zzc.zzL(0);
            zzacsVar.zzk(this.zzc.zzq() + 6);
            return 0;
        }
        if ((iZzg >> 8) != 1) {
            zzacsVar.zzk(1);
            return 0;
        }
        int i = iZzg & 255;
        zzanl zzanlVar = (zzanl) this.zzb.get(i);
        if (!this.zze) {
            if (zzanlVar == null) {
                zzamm zzammVar = null;
                if (i == 189) {
                    zzamoVar = new zzame(null, 0);
                    this.zzf = true;
                    this.zzh = zzacsVar.zzf();
                } else if ((iZzg & 224) == 192) {
                    zzamoVar = new zzamy(null, 0);
                    this.zzf = true;
                    this.zzh = zzacsVar.zzf();
                } else if ((iZzg & 240) == 224) {
                    zzamoVar = new zzamo(null);
                    this.zzg = true;
                    this.zzh = zzacsVar.zzf();
                } else if (zzammVar != null) {
                    zzammVar.zzb(this.zzj, new zzaoa(Integer.MIN_VALUE, i, 256));
                    zzanlVar = new zzanl(zzammVar, this.zza);
                    this.zzb.put(i, zzanlVar);
                }
                zzammVar = zzamoVar;
                if (zzammVar != null) {
                    zzammVar.zzb(this.zzj, new zzaoa(Integer.MIN_VALUE, i, 256));
                    zzanlVar = new zzanl(zzammVar, this.zza);
                    this.zzb.put(i, zzanlVar);
                }
            }
            long j4 = 1048576;
            if (this.zzf && this.zzg) {
                j4 = this.zzh + 8192;
            }
            if (zzacsVar.zzf() > j4) {
                this.zze = true;
                this.zzj.zzD();
            }
        }
        zzacsVar.zzh(this.zzc.zzN(), 0, 2);
        this.zzc.zzL(0);
        int iZzq = this.zzc.zzq() + 6;
        if (zzanlVar == null) {
            zzacsVar.zzk(iZzq);
        } else {
            this.zzc.zzI(iZzq);
            zzacsVar.zzi(this.zzc.zzN(), 0, iZzq);
            this.zzc.zzL(6);
            zzanlVar.zza(this.zzc);
            zzed zzedVar = this.zzc;
            zzedVar.zzK(zzedVar.zzc());
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zzj = zzacuVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        zzek zzekVar = this.zza;
        if (zzekVar.zzf() != -9223372036854775807L) {
            long jZzd = zzekVar.zzd();
            if (jZzd != -9223372036854775807L && jZzd != 0 && jZzd != j10) {
                zzekVar.zzi(j10);
            }
        } else {
            zzekVar.zzi(j10);
        }
        zzanj zzanjVar = this.zzi;
        if (zzanjVar != null) {
            zzanjVar.zzd(j10);
        }
        for (int i = 0; i < this.zzb.size(); i++) {
            ((zzanl) this.zzb.valueAt(i)).zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        byte[] bArr = new byte[14];
        zzacg zzacgVar = (zzacg) zzacsVar;
        zzacgVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzacgVar.zzl(bArr[13] & 7, false);
        zzacgVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
