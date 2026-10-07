package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzanw implements zzacr {
    private final int zza;
    private final List zzb;
    private final zzed zzc;
    private final SparseIntArray zzd;
    private final zzanz zze;
    private final zzakg zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzant zzj;
    private zzans zzk;
    private zzacu zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzanw() {
        this(1, 1, zzakg.zza, new zzek(0L), new zzamj(0), 112800);
    }

    /* JADX WARN: Code duplicated, block: B:96:0x01ba  */
    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        long j4;
        long jZzd = zzacsVar.zzd();
        long j10 = -1;
        if (this.zzn) {
            if (jZzd != -1) {
                zzant zzantVar = this.zzj;
                if (!zzantVar.zzd()) {
                    return zzantVar.zza(zzacsVar, zzadnVar, this.zzr);
                }
            }
            if (this.zzo) {
                j4 = 0;
            } else {
                this.zzo = true;
                zzant zzantVar2 = this.zzj;
                if (zzantVar2.zzb() != -9223372036854775807L) {
                    j4 = 0;
                    zzans zzansVar = new zzans(zzantVar2.zzc(), zzantVar2.zzb(), jZzd, this.zzr, 112800);
                    this.zzk = zzansVar;
                    this.zzl.zzO(zzansVar.zzb());
                } else {
                    j4 = 0;
                    this.zzl.zzO(new zzadp(zzantVar2.zzb(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zzf(j4, j4);
                if (zzacsVar.zzf() != j4) {
                    zzadnVar.zza = j4;
                    return 1;
                }
            }
            zzans zzansVar2 = this.zzk;
            if (zzansVar2 != null && zzansVar2.zze()) {
                return zzansVar2.zza(zzacsVar, zzadnVar);
            }
        } else {
            j10 = -1;
        }
        zzed zzedVar = this.zzc;
        byte[] bArrZzN = zzedVar.zzN();
        if (9400 - zzedVar.zzd() < 188) {
            int iZzb = zzedVar.zzb();
            if (iZzb > 0) {
                System.arraycopy(bArrZzN, zzedVar.zzd(), bArrZzN, 0, iZzb);
            }
            this.zzc.zzJ(bArrZzN, iZzb);
        }
        while (true) {
            zzed zzedVar2 = this.zzc;
            if (zzedVar2.zzb() >= 188) {
                int iZzd = zzedVar2.zzd();
                int iZze = zzedVar2.zze();
                int iZza = zzaoc.zza(zzedVar2.zzN(), iZzd, iZze);
                this.zzc.zzL(iZza);
                int i = iZza + 188;
                if (i > iZze) {
                    this.zzq = (iZza - iZzd) + this.zzq;
                } else {
                    this.zzq = 0;
                }
                zzed zzedVar3 = this.zzc;
                int iZze2 = zzedVar3.zze();
                if (i > iZze2) {
                    return 0;
                }
                int iZzg = zzedVar3.zzg();
                if ((8388608 & iZzg) != 0) {
                    this.zzc.zzL(i);
                    return 0;
                }
                int i10 = (4194304 & iZzg) != 0 ? 1 : 0;
                int i11 = iZzg & 32;
                int i12 = (iZzg >> 8) & 8191;
                zzaob zzaobVar = (iZzg & 16) != 0 ? (zzaob) this.zzg.get(i12) : null;
                if (zzaobVar == null) {
                    this.zzc.zzL(i);
                    return 0;
                }
                int i13 = iZzg & 15;
                int i14 = this.zzd.get(i12, i13 - 1);
                this.zzd.put(i12, i13);
                if (i14 == i13) {
                    this.zzc.zzL(i);
                    return 0;
                }
                if (i13 != ((i14 + 1) & 15)) {
                    zzaobVar.zzc();
                }
                if (i11 != 0) {
                    zzed zzedVar4 = this.zzc;
                    int iZzm = zzedVar4.zzm();
                    i10 |= (zzedVar4.zzm() & 64) != 0 ? 2 : 0;
                    this.zzc.zzM(iZzm - 1);
                }
                boolean z4 = this.zzn;
                if (z4 || !this.zzi.get(i12, false)) {
                    this.zzc.zzK(i);
                    zzaobVar.zza(this.zzc, i10);
                    this.zzc.zzK(iZze2);
                    if (!z4) {
                        if (this.zzn && jZzd != j10) {
                            this.zzp = true;
                        }
                    }
                } else if (this.zzn) {
                    this.zzp = true;
                }
                this.zzc.zzL(i);
                return 0;
            }
            int iZze3 = zzedVar2.zze();
            int iZza2 = zzacsVar.zza(bArrZzN, iZze3, 9400 - iZze3);
            if (iZza2 == -1) {
                for (int i15 = 0; i15 < this.zzg.size(); i15++) {
                    zzaob zzaobVar2 = (zzaob) this.zzg.valueAt(i15);
                    if (zzaobVar2 instanceof zzang) {
                        zzang zzangVar = (zzang) zzaobVar2;
                        if (zzangVar.zzd(false)) {
                            zzangVar.zza(new zzed(), 1);
                        }
                    }
                }
                return -1;
            }
            this.zzc.zzK(iZze3 + iZza2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        if (this.zza == 0) {
            zzacuVar = new zzakj(zzacuVar, this.zzf);
        }
        this.zzl = zzacuVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        zzans zzansVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzek zzekVar = (zzek) this.zzb.get(i);
            if (zzekVar.zzf() != -9223372036854775807L) {
                long jZzd = zzekVar.zzd();
                if (jZzd != -9223372036854775807L && jZzd != 0 && jZzd != j10) {
                    zzekVar.zzi(j10);
                }
            } else {
                zzekVar.zzi(j10);
            }
        }
        if (j10 != 0 && (zzansVar = this.zzk) != null) {
            zzansVar.zzd(j10);
        }
        this.zzc.zzI(0);
        this.zzd.clear();
        for (int i10 = 0; i10 < this.zzg.size(); i10++) {
            ((zzaob) this.zzg.valueAt(i10)).zzc();
        }
        this.zzq = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        byte[] bArrZzN = this.zzc.zzN();
        zzacg zzacgVar = (zzacg) zzacsVar;
        zzacgVar.zzm(bArrZzN, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i10 = 0;
            while (true) {
                if (i10 >= 5) {
                    zzacgVar.zzo(i, false);
                    return true;
                }
                if (bArrZzN[(i10 * 188) + i] != 71) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public zzanw(int i, int i10, zzakg zzakgVar, zzek zzekVar, zzanz zzanzVar, int i11) {
        this.zze = zzanzVar;
        this.zza = i10;
        this.zzf = zzakgVar;
        this.zzb = Collections.singletonList(zzekVar);
        this.zzc = new zzed(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzant(112800);
        this.zzl = zzacu.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzanzVar.zza();
        int size = sparseArrayZza.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.zzg.put(sparseArrayZza.keyAt(i12), (zzaob) sparseArrayZza.valueAt(i12));
        }
        this.zzg.put(0, new zzano(new zzanu(this)));
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
