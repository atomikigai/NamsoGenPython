package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzvz {
    private final zzed zza = new zzed(32);
    private zzvy zzb;
    private zzvy zzc;
    private zzvy zzd;
    private long zze;
    private final zzys zzf;

    public zzvz(zzys zzysVar) {
        this.zzf = zzysVar;
        zzvy zzvyVar = new zzvy(0L, 65536);
        this.zzb = zzvyVar;
        this.zzc = zzvyVar;
        this.zzd = zzvyVar;
    }

    private final int zzi(int i) {
        zzvy zzvyVar = this.zzd;
        if (zzvyVar.zzc == null) {
            zzyl zzylVarZzb = this.zzf.zzb();
            zzvy zzvyVar2 = new zzvy(this.zzd.zzb, 65536);
            zzvyVar.zzc = zzylVarZzb;
            zzvyVar.zzd = zzvyVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvy zzj(zzvy zzvyVar, long j4) {
        while (j4 >= zzvyVar.zzb) {
            zzvyVar = zzvyVar.zzd;
        }
        return zzvyVar;
    }

    private static zzvy zzk(zzvy zzvyVar, long j4, ByteBuffer byteBuffer, int i) {
        zzvy zzvyVarZzj = zzj(zzvyVar, j4);
        while (i > 0) {
            int iMin = Math.min(i, (int) (zzvyVarZzj.zzb - j4));
            byteBuffer.put(zzvyVarZzj.zzc.zza, zzvyVarZzj.zza(j4), iMin);
            i -= iMin;
            j4 += (long) iMin;
            if (j4 == zzvyVarZzj.zzb) {
                zzvyVarZzj = zzvyVarZzj.zzd;
            }
        }
        return zzvyVarZzj;
    }

    private static zzvy zzl(zzvy zzvyVar, long j4, byte[] bArr, int i) {
        zzvy zzvyVarZzj = zzj(zzvyVar, j4);
        int i10 = i;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (zzvyVarZzj.zzb - j4));
            System.arraycopy(zzvyVarZzj.zzc.zza, zzvyVarZzj.zza(j4), bArr, i - i10, iMin);
            i10 -= iMin;
            j4 += (long) iMin;
            if (j4 == zzvyVarZzj.zzb) {
                zzvyVarZzj = zzvyVarZzj.zzd;
            }
        }
        return zzvyVarZzj;
    }

    private static zzvy zzm(zzvy zzvyVar, zzhm zzhmVar, zzwb zzwbVar, zzed zzedVar) {
        zzvy zzvyVarZzl;
        if (zzhmVar.zzl()) {
            long j4 = zzwbVar.zzb;
            int iZzq = 1;
            zzedVar.zzI(1);
            zzvy zzvyVarZzl2 = zzl(zzvyVar, j4, zzedVar.zzN(), 1);
            long j10 = j4 + 1;
            byte b10 = zzedVar.zzN()[0];
            int i = b10 & 128;
            int i10 = b10 & 127;
            zzhj zzhjVar = zzhmVar.zzb;
            byte[] bArr = zzhjVar.zza;
            if (bArr == null) {
                zzhjVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z4 = i != 0;
            zzvyVarZzl = zzl(zzvyVarZzl2, j10, zzhjVar.zza, i10);
            long j11 = j10 + ((long) i10);
            if (z4) {
                zzedVar.zzI(2);
                zzvyVarZzl = zzl(zzvyVarZzl, j11, zzedVar.zzN(), 2);
                j11 += 2;
                iZzq = zzedVar.zzq();
            }
            int i11 = iZzq;
            int[] iArr = zzhjVar.zzd;
            if (iArr == null || iArr.length < i11) {
                iArr = new int[i11];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhjVar.zze;
            if (iArr3 == null || iArr3.length < i11) {
                iArr3 = new int[i11];
            }
            int[] iArr4 = iArr3;
            if (z4) {
                int i12 = i11 * 6;
                zzedVar.zzI(i12);
                zzvyVarZzl = zzl(zzvyVarZzl, j11, zzedVar.zzN(), i12);
                j11 += (long) i12;
                zzedVar.zzL(0);
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr2[i13] = zzedVar.zzq();
                    iArr4[i13] = zzedVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwbVar.zza - ((int) (j11 - zzwbVar.zzb));
            }
            zzadw zzadwVar = zzwbVar.zzc;
            int i14 = zzen.zza;
            zzhjVar.zzc(i11, iArr2, iArr4, zzadwVar.zzb, zzhjVar.zza, zzadwVar.zza, zzadwVar.zzc, zzadwVar.zzd);
            long j12 = zzwbVar.zzb;
            int i15 = (int) (j11 - j12);
            zzwbVar.zzb = j12 + ((long) i15);
            zzwbVar.zza -= i15;
        } else {
            zzvyVarZzl = zzvyVar;
        }
        if (!zzhmVar.zze()) {
            zzhmVar.zzj(zzwbVar.zza);
            return zzk(zzvyVarZzl, zzwbVar.zzb, zzhmVar.zzc, zzwbVar.zza);
        }
        zzedVar.zzI(4);
        zzvy zzvyVarZzl3 = zzl(zzvyVarZzl, zzwbVar.zzb, zzedVar.zzN(), 4);
        int iZzp = zzedVar.zzp();
        zzwbVar.zzb += 4;
        zzwbVar.zza -= 4;
        zzhmVar.zzj(iZzp);
        zzvy zzvyVarZzk = zzk(zzvyVarZzl3, zzwbVar.zzb, zzhmVar.zzc, iZzp);
        zzwbVar.zzb += (long) iZzp;
        int i16 = zzwbVar.zza - iZzp;
        zzwbVar.zza = i16;
        ByteBuffer byteBuffer = zzhmVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i16) {
            zzhmVar.zzf = ByteBuffer.allocate(i16);
        } else {
            zzhmVar.zzf.clear();
        }
        return zzk(zzvyVarZzk, zzwbVar.zzb, zzhmVar.zzf, zzwbVar.zza);
    }

    private final void zzn(int i) {
        long j4 = this.zze + ((long) i);
        this.zze = j4;
        zzvy zzvyVar = this.zzd;
        if (j4 == zzvyVar.zzb) {
            this.zzd = zzvyVar.zzd;
        }
    }

    public final int zza(zzn zznVar, int i, boolean z4) throws IOException {
        int iZzi = zzi(i);
        zzvy zzvyVar = this.zzd;
        int iZza = zznVar.zza(zzvyVar.zzc.zza, zzvyVar.zza(this.zze), iZzi);
        if (iZza != -1) {
            zzn(iZza);
            return iZza;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j4) {
        zzvy zzvyVar;
        if (j4 != -1) {
            while (true) {
                zzvyVar = this.zzb;
                if (j4 < zzvyVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvyVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvyVar.zza) {
                this.zzc = zzvyVar;
            }
        }
    }

    public final void zzd(zzhm zzhmVar, zzwb zzwbVar) {
        zzm(this.zzc, zzhmVar, zzwbVar, this.zza);
    }

    public final void zze(zzhm zzhmVar, zzwb zzwbVar) {
        this.zzc = zzm(this.zzc, zzhmVar, zzwbVar, this.zza);
    }

    public final void zzf() {
        zzvy zzvyVar = this.zzb;
        if (zzvyVar.zzc != null) {
            this.zzf.zzd(zzvyVar);
            zzvyVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzvy zzvyVar2 = this.zzb;
        this.zzc = zzvyVar2;
        this.zzd = zzvyVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzed zzedVar, int i) {
        while (i > 0) {
            int iZzi = zzi(i);
            zzvy zzvyVar = this.zzd;
            zzedVar.zzH(zzvyVar.zzc.zza, zzvyVar.zza(this.zze), iZzi);
            i -= iZzi;
            zzn(iZzi);
        }
    }
}
