package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzwf implements zzadx {
    private boolean zzA;
    private zzrq zzB;
    private final zzvz zza;
    private final zzrp zzd;
    private final zzrk zze;
    private zzwd zzf;
    private zzad zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzad zzy;
    private final zzwb zzb = new zzwb();
    private int zzh = zzbbs.zzq.zzf;
    private long[] zzi = new long[zzbbs.zzq.zzf];
    private long[] zzj = new long[zzbbs.zzq.zzf];
    private long[] zzm = new long[zzbbs.zzq.zzf];
    private int[] zzl = new int[zzbbs.zzq.zzf];
    private int[] zzk = new int[zzbbs.zzq.zzf];
    private zzadw[] zzn = new zzadw[zzbbs.zzq.zzf];
    private final zzwm zzc = new zzwm(new zzdg() { // from class: com.google.android.gms.internal.ads.zzwa
        @Override // com.google.android.gms.internal.ads.zzdg
        public final void zza(Object obj) {
            zzro zzroVar = ((zzwc) obj).zzb;
        }
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzz = true;

    public zzwf(zzys zzysVar, zzrp zzrpVar, zzrk zzrkVar) {
        this.zzd = zzrpVar;
        this.zze = zzrkVar;
        this.zza = new zzvz(zzysVar);
    }

    private final int zzA(int i, int i10, long j4, boolean z4) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.zzm[i];
            if (j10 > j4) {
                break;
            }
            if (!z4 || (this.zzl[i] & 1) != 0) {
                if (j10 == j4) {
                    return i12;
                }
                i11 = i12;
            }
            i++;
            if (i == this.zzh) {
                i = 0;
            }
        }
        return i11;
    }

    private final int zzB(int i) {
        int i10 = this.zzq + i;
        int i11 = this.zzh;
        return i10 < i11 ? i10 : i10 - i11;
    }

    private final synchronized int zzC(zzkj zzkjVar, zzhm zzhmVar, boolean z4, boolean z10, zzwb zzwbVar) {
        try {
            zzhmVar.zzd = false;
            if (!zzK()) {
                if (!z10 && !this.zzv) {
                    zzad zzadVar = this.zzy;
                    if (zzadVar == null || (!z4 && zzadVar == this.zzg)) {
                        return -3;
                    }
                    zzH(zzadVar, zzkjVar);
                    return -5;
                }
                zzhmVar.zzc(4);
                zzhmVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzad zzadVar2 = ((zzwc) this.zzc.zza(this.zzp + this.zzr)).zza;
            if (!z4 && zzadVar2 == this.zzg) {
                int iZzB = zzB(this.zzr);
                if (!zzL(iZzB)) {
                    zzhmVar.zzd = true;
                    return -3;
                }
                zzhmVar.zzc(this.zzl[iZzB]);
                if (this.zzr == this.zzo - 1 && (z10 || this.zzv)) {
                    zzhmVar.zza(536870912);
                }
                zzhmVar.zze = this.zzm[iZzB];
                zzwbVar.zza = this.zzk[iZzB];
                zzwbVar.zzb = this.zzj[iZzB];
                zzwbVar.zzc = this.zzn[iZzB];
                return -4;
            }
            zzH(zzadVar2, zzkjVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    private final synchronized long zzD(long j4, boolean z4, boolean z10) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.zzo;
                if (i != 0) {
                    long[] jArr = this.zzm;
                    int i10 = this.zzq;
                    if (j4 >= jArr[i10]) {
                        if (z10) {
                            try {
                                int i11 = this.zzr;
                                if (i11 != i) {
                                    i = i11 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iZzA = zzA(i10, i, j4, false);
                        if (iZzA != -1) {
                            return zzF(iZzA);
                        }
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final synchronized long zzE() {
        int i = this.zzo;
        if (i == 0) {
            return -1L;
        }
        return zzF(i);
    }

    private final long zzF(int i) {
        long j4 = this.zzt;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iZzB = zzB(i - 1);
            for (int i10 = 0; i10 < i; i10++) {
                jMax = Math.max(jMax, this.zzm[iZzB]);
                if ((this.zzl[iZzB] & 1) != 0) {
                    break;
                }
                iZzB--;
                if (iZzB == -1) {
                    iZzB = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j4, jMax);
        this.zzo -= i;
        int i11 = this.zzp + i;
        this.zzp = i11;
        int i12 = this.zzq + i;
        this.zzq = i12;
        int i13 = this.zzh;
        if (i12 >= i13) {
            this.zzq = i12 - i13;
        }
        int i14 = this.zzr - i;
        this.zzr = i14;
        if (i14 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i11);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i15 = this.zzq;
        if (i15 == 0) {
            i15 = this.zzh;
        }
        int i16 = i15 - 1;
        return this.zzj[i16] + ((long) this.zzk[i16]);
    }

    private final synchronized void zzG(long j4, int i, long j10, int i10, zzadw zzadwVar) {
        try {
            int i11 = this.zzo;
            if (i11 > 0) {
                int iZzB = zzB(i11 - 1);
                zzdb.zzd(this.zzj[iZzB] + ((long) this.zzk[iZzB]) <= j10);
            }
            this.zzv = (536870912 & i) != 0;
            this.zzu = Math.max(this.zzu, j4);
            int iZzB2 = zzB(this.zzo);
            this.zzm[iZzB2] = j4;
            this.zzj[iZzB2] = j10;
            this.zzk[iZzB2] = i10;
            this.zzl[iZzB2] = i;
            this.zzn[iZzB2] = zzadwVar;
            this.zzi[iZzB2] = 0;
            if (this.zzc.zzf() || !((zzwc) this.zzc.zzb()).zza.equals(this.zzy)) {
                zzad zzadVar = this.zzy;
                if (zzadVar == null) {
                    throw null;
                }
                this.zzc.zzc(this.zzp + this.zzo, new zzwc(zzadVar, this.zzd.zzb(this.zze, zzadVar), null));
            }
            int i12 = this.zzo + 1;
            this.zzo = i12;
            int i13 = this.zzh;
            if (i12 == i13) {
                int i14 = i13 + zzbbs.zzq.zzf;
                long[] jArr = new long[i14];
                long[] jArr2 = new long[i14];
                long[] jArr3 = new long[i14];
                int[] iArr = new int[i14];
                int[] iArr2 = new int[i14];
                zzadw[] zzadwVarArr = new zzadw[i14];
                int i15 = this.zzq;
                int i16 = i13 - i15;
                System.arraycopy(this.zzj, i15, jArr2, 0, i16);
                System.arraycopy(this.zzm, this.zzq, jArr3, 0, i16);
                System.arraycopy(this.zzl, this.zzq, iArr, 0, i16);
                System.arraycopy(this.zzk, this.zzq, iArr2, 0, i16);
                System.arraycopy(this.zzn, this.zzq, zzadwVarArr, 0, i16);
                System.arraycopy(this.zzi, this.zzq, jArr, 0, i16);
                int i17 = this.zzq;
                System.arraycopy(this.zzj, 0, jArr2, i16, i17);
                System.arraycopy(this.zzm, 0, jArr3, i16, i17);
                System.arraycopy(this.zzl, 0, iArr, i16, i17);
                System.arraycopy(this.zzk, 0, iArr2, i16, i17);
                System.arraycopy(this.zzn, 0, zzadwVarArr, i16, i17);
                System.arraycopy(this.zzi, 0, jArr, i16, i17);
                this.zzj = jArr2;
                this.zzm = jArr3;
                this.zzl = iArr;
                this.zzk = iArr2;
                this.zzn = zzadwVarArr;
                this.zzi = jArr;
                this.zzq = 0;
                this.zzh = i14;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzH(zzad zzadVar, zzkj zzkjVar) {
        zzad zzadVar2 = this.zzg;
        zzw zzwVar = zzadVar2 == null ? null : zzadVar2.zzs;
        this.zzg = zzadVar;
        zzw zzwVar2 = zzadVar.zzs;
        zzkjVar.zza = zzadVar.zzc(this.zzd.zza(zzadVar));
        zzkjVar.zzb = this.zzB;
        if (zzadVar2 == null || !Objects.equals(zzwVar, zzwVar2)) {
            zzrq zzrqVarZzc = this.zzd.zzc(this.zze, zzadVar);
            this.zzB = zzrqVarZzc;
            zzkjVar.zzb = zzrqVarZzc;
        }
    }

    private final void zzI() {
        if (this.zzB != null) {
            this.zzB = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzJ() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzK() {
        return this.zzr != this.zzo;
    }

    private final boolean zzL(int i) {
        if (this.zzB == null) {
            return true;
        }
        int i10 = this.zzl[i];
        return false;
    }

    private final synchronized boolean zzM(zzad zzadVar) {
        try {
            this.zzx = false;
            if (Objects.equals(zzadVar, this.zzy)) {
                return false;
            }
            if (this.zzc.zzf() || !((zzwc) this.zzc.zzb()).zza.equals(zzadVar)) {
                this.zzy = zzadVar;
            } else {
                this.zzy = ((zzwc) this.zzc.zzb()).zza;
            }
            boolean z4 = this.zzz;
            zzad zzadVar2 = this.zzy;
            this.zzz = z4 & zzbg.zzf(zzadVar2.zzo, zzadVar2.zzk);
            this.zzA = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j4, boolean z4) {
        Throwable th;
        try {
            try {
                int i = this.zzr;
                int iZzB = zzB(i);
                if (!zzK() || j4 < this.zzm[iZzB]) {
                    return 0;
                }
                if (j4 <= this.zzu || !z4) {
                    int iZzA = zzA(iZzB, this.zzo - i, j4, true);
                    if (iZzA == -1) {
                        return 0;
                    }
                    return iZzA;
                }
                try {
                    return this.zzo - i;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    public final int zze(zzkj zzkjVar, zzhm zzhmVar, int i, boolean z4) {
        int iZzC = zzC(zzkjVar, zzhmVar, (i & 2) != 0, z4, this.zzb);
        if (iZzC != -4) {
            return iZzC;
        }
        if (!zzhmVar.zzf()) {
            int i10 = i & 1;
            if ((i & 4) == 0) {
                if (i10 != 0) {
                    this.zza.zzd(zzhmVar, this.zzb);
                    return -4;
                }
                this.zza.zze(zzhmVar, this.zzb);
            } else if (i10 != 0) {
                return -4;
            }
            this.zzr++;
        }
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final /* synthetic */ int zzf(zzn zznVar, int i, boolean z4) {
        return zzadv.zza(this, zznVar, i, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zzg(zzn zznVar, int i, boolean z4, int i10) throws IOException {
        return this.zza.zza(zznVar, i, z4);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    public final synchronized zzad zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzy;
    }

    public final void zzj(long j4, boolean z4, boolean z10) {
        this.zza.zzc(zzD(j4, false, z10));
    }

    public final void zzk() {
        this.zza.zzc(zzE());
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzl(zzad zzadVar) {
        boolean zZzM = zzM(zzadVar);
        zzwd zzwdVar = this.zzf;
        if (zzwdVar == null || !zZzM) {
            return;
        }
        zzwdVar.zzM(zzadVar);
    }

    public final void zzm() throws IOException {
        zzrq zzrqVar = this.zzB;
        if (zzrqVar != null) {
            throw zzrqVar.zza();
        }
    }

    public final void zzn() {
        zzk();
        zzI();
    }

    public final void zzo() {
        zzp(true);
        zzI();
    }

    public final void zzp(boolean z4) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z4) {
            this.zzy = null;
            this.zzx = true;
            this.zzz = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final /* synthetic */ void zzq(zzed zzedVar, int i) {
        zzadv.zzb(this, zzedVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzr(zzed zzedVar, int i, int i10) {
        this.zza.zzh(zzedVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzs(long j4, int i, int i10, int i11, zzadw zzadwVar) {
        if (this.zzw) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzz) {
            if (j4 < this.zzs) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzA) {
                    zzdt.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzy)));
                    this.zzA = true;
                }
                i |= 1;
            }
        }
        int i12 = i;
        zzG(j4, i12, (this.zza.zzb() - ((long) i10)) - ((long) i11), i10, zzadwVar);
    }

    public final void zzt(long j4) {
        this.zzs = j4;
    }

    public final void zzu(zzwd zzwdVar) {
        this.zzf = zzwdVar;
    }

    public final synchronized void zzv(int i) {
        boolean z4 = false;
        if (i >= 0) {
            try {
                if (this.zzr + i <= this.zzo) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdb.zzd(z4);
        this.zzr += i;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    public final synchronized boolean zzx(boolean z4) {
        boolean z10 = true;
        if (zzK()) {
            if (((zzwc) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzL(zzB(this.zzr));
        }
        if (!z4 && !this.zzv) {
            zzad zzadVar = this.zzy;
            if (zzadVar == null) {
                z10 = false;
            } else if (zzadVar == this.zzg) {
                return false;
            }
        }
        return z10;
    }

    public final synchronized boolean zzy(int i) {
        zzJ();
        int i10 = this.zzp;
        if (i >= i10 && i <= this.zzo + i10) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i - i10;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    public final synchronized boolean zzz(long j4, boolean z4) throws Throwable {
        Throwable th;
        zzwf zzwfVar;
        long j10;
        int iZzA;
        try {
            try {
                zzJ();
                int i = this.zzr;
                int iZzB = zzB(i);
                if (zzK() && j4 >= this.zzm[iZzB]) {
                    if (j4 > this.zzu) {
                        if (z4) {
                            z4 = true;
                        }
                    }
                    if (this.zzz) {
                        try {
                            int i10 = this.zzo - i;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= i10) {
                                    if (!z4) {
                                        zzwfVar = this;
                                        j10 = j4;
                                        iZzA = -1;
                                        break;
                                    }
                                    j10 = j4;
                                    iZzA = i10;
                                    zzwfVar = this;
                                    break;
                                }
                                if (this.zzm[iZzB] >= j4) {
                                    zzwfVar = this;
                                    j10 = j4;
                                    iZzA = i11;
                                    break;
                                }
                                iZzB++;
                                if (iZzB == this.zzh) {
                                    iZzB = 0;
                                }
                                i11++;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        zzwfVar = this;
                        j10 = j4;
                        iZzA = zzwfVar.zzA(iZzB, this.zzo - i, j10, true);
                    }
                    if (iZzA != -1) {
                        zzwfVar.zzs = j10;
                        zzwfVar.zzr += iZzA;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
