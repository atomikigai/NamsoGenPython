package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhi {
    private static final zzhi zza = new zzhi(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhi(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzhi zzc() {
        return zza;
    }

    public static zzhi zze(zzhi zzhiVar, zzhi zzhiVar2) {
        int i = zzhiVar.zzb + zzhiVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhiVar.zzc, i);
        System.arraycopy(zzhiVar2.zzc, 0, iArrCopyOf, zzhiVar.zzb, zzhiVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhiVar.zzd, i);
        System.arraycopy(zzhiVar2.zzd, 0, objArrCopyOf, zzhiVar.zzb, zzhiVar2.zzb);
        return new zzhi(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzhi zzf() {
        return new zzhi(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i10 = this.zzb;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i) {
                i = i11;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhi)) {
            return false;
        }
        zzhi zzhiVar = (zzhi) obj;
        int i = this.zzb;
        if (i == zzhiVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhiVar.zzc;
            for (int i10 = 0; i10 < i; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzhiVar.zzd;
            int i11 = this.zzb;
            for (int i12 = 0; i12 < i11; i12++) {
                if (objArr[i12].equals(objArr2[i12])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i10 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    public final int zza() {
        int iZzC;
        int iZzD;
        int iZzC2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzC3 = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        int i14 = i12 << 3;
                        zzei zzeiVar = (zzei) this.zzd[i10];
                        int iZzC4 = zzep.zzC(i14);
                        int iZzd = zzeiVar.zzd();
                        iZzC3 = zzep.zzC(iZzd) + iZzd + iZzC4 + iZzC3;
                    } else if (i13 == 3) {
                        int iZzC5 = zzep.zzC(i12 << 3);
                        iZzC = iZzC5 + iZzC5;
                        iZzD = ((zzhi) this.zzd[i10]).zza();
                    } else {
                        if (i13 != 5) {
                            throw new IllegalStateException(new zzfp("Protocol message tag had invalid wire type."));
                        }
                        ((Integer) this.zzd[i10]).getClass();
                        iZzC2 = zzep.zzC(i12 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i10]).getClass();
                    iZzC2 = zzep.zzC(i12 << 3) + 8;
                }
                iZzC3 = iZzC2 + iZzC3;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.zzd[i10]).longValue();
                iZzC = zzep.zzC(i15);
                iZzD = zzep.zzD(jLongValue);
            }
            iZzC3 = iZzD + iZzC + iZzC3;
        }
        this.zze = iZzC3;
        return iZzC3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZ = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10] >>> 3;
            zzei zzeiVar = (zzei) this.zzd[i10];
            int iZzC = zzep.zzC(8);
            int iZzC2 = zzep.zzC(i11) + zzep.zzC(16);
            int iZzC3 = zzep.zzC(24);
            int iZzd = zzeiVar.zzd();
            iZ += iZzC + iZzC + iZzC2 + a.z(iZzd, iZzd, iZzC3);
        }
        this.zze = iZ;
        return iZ;
    }

    public final zzhi zzd(zzhi zzhiVar) {
        if (zzhiVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzhiVar.zzb;
        zzm(i);
        System.arraycopy(zzhiVar.zzc, 0, this.zzc, this.zzb, zzhiVar.zzb);
        System.arraycopy(zzhiVar.zzd, 0, this.zzd, this.zzb, zzhiVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzgn.zzb(sb2, i, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzk(zzhu zzhuVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzhuVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzhu zzhuVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i10 = this.zzc[i];
                Object obj = this.zzd[i];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzhuVar.zzt(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzhuVar.zzm(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzhuVar.zzd(i12, (zzei) obj);
                } else if (i11 == 3) {
                    zzhuVar.zzF(i12);
                    ((zzhi) obj).zzl(zzhuVar);
                    zzhuVar.zzh(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new zzfp("Protocol message tag had invalid wire type."));
                    }
                    zzhuVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzhi() {
        this(0, new int[8], new Object[8], true);
    }
}
