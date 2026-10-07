package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhbo {
    private static final zzhbo zza = new zzhbo(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhbo(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzhbo zzc() {
        return zza;
    }

    public static zzhbo zze(zzhbo zzhboVar, zzhbo zzhboVar2) {
        int i = zzhboVar.zzb + zzhboVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhboVar.zzc, i);
        System.arraycopy(zzhboVar2.zzc, 0, iArrCopyOf, zzhboVar.zzb, zzhboVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhboVar.zzd, i);
        System.arraycopy(zzhboVar2.zzd, 0, objArrCopyOf, zzhboVar.zzb, zzhboVar2.zzb);
        return new zzhbo(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzhbo zzf() {
        return new zzhbo();
    }

    private final void zzn(int i) {
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
        if (obj == null || !(obj instanceof zzhbo)) {
            return false;
        }
        zzhbo zzhboVar = (zzhbo) obj;
        int i = this.zzb;
        if (i == zzhboVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhboVar.zzc;
            for (int i10 = 0; i10 < i; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzhboVar.zzd;
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
        int iZzD;
        int iZzE;
        int iZzD2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzD3 = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        int i14 = i12 << 3;
                        zzgxp zzgxpVar = (zzgxp) this.zzd[i10];
                        int iZzD4 = zzgyc.zzD(i14);
                        int iZzd = zzgxpVar.zzd();
                        iZzD3 = zzgyc.zzD(iZzd) + iZzd + iZzD4 + iZzD3;
                    } else if (i13 == 3) {
                        int iZzD5 = zzgyc.zzD(i12 << 3);
                        iZzD = iZzD5 + iZzD5;
                        iZzE = ((zzhbo) this.zzd[i10]).zza();
                    } else {
                        if (i13 != 5) {
                            throw new IllegalStateException(new zzgzl("Protocol message tag had invalid wire type."));
                        }
                        ((Integer) this.zzd[i10]).getClass();
                        iZzD2 = zzgyc.zzD(i12 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i10]).getClass();
                    iZzD2 = zzgyc.zzD(i12 << 3) + 8;
                }
                iZzD3 = iZzD2 + iZzD3;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.zzd[i10]).longValue();
                iZzD = zzgyc.zzD(i15);
                iZzE = zzgyc.zzE(jLongValue);
            }
            iZzD3 = iZzE + iZzD + iZzD3;
        }
        this.zze = iZzD3;
        return iZzD3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iT = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10] >>> 3;
            zzgxp zzgxpVar = (zzgxp) this.zzd[i10];
            int iZzD = zzgyc.zzD(8);
            int iZzD2 = zzgyc.zzD(i11) + zzgyc.zzD(16);
            int iZzD3 = zzgyc.zzD(24);
            int iZzd = zzgxpVar.zzd();
            iT += iZzD + iZzD + iZzD2 + q1.a.t(iZzd, iZzd, iZzD3);
        }
        this.zze = iT;
        return iT;
    }

    public final zzhbo zzd(zzhbo zzhboVar) {
        if (zzhboVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzhboVar.zzb;
        zzn(i);
        System.arraycopy(zzhboVar.zzc, 0, this.zzc, this.zzb, zzhboVar.zzb);
        System.arraycopy(zzhboVar.zzd, 0, this.zzd, this.zzb, zzhboVar.zzb);
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
            zzhak.zzb(sb2, i, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzk(zzhcc zzhccVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzhccVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzhcc zzhccVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i10 = this.zzc[i];
                Object obj = this.zzd[i];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzhccVar.zzt(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzhccVar.zzm(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzhccVar.zzd(i12, (zzgxp) obj);
                } else if (i11 == 3) {
                    zzhccVar.zzF(i12);
                    ((zzhbo) obj).zzl(zzhccVar);
                    zzhccVar.zzh(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new zzgzl("Protocol message tag had invalid wire type."));
                    }
                    zzhccVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean zzm(int i, zzgxv zzgxvVar) throws IOException {
        int iZzl;
        zzg();
        int i10 = i & 7;
        if (i10 == 0) {
            zzj(i, Long.valueOf(zzgxvVar.zzo()));
            return true;
        }
        if (i10 == 1) {
            zzj(i, Long.valueOf(zzgxvVar.zzn()));
            return true;
        }
        if (i10 == 2) {
            zzj(i, zzgxvVar.zzv());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            zzj(i, Integer.valueOf(zzgxvVar.zzf()));
            return true;
        }
        zzhbo zzhboVar = new zzhbo();
        do {
            iZzl = zzgxvVar.zzl();
            if (iZzl == 0) {
                break;
            }
        } while (zzhboVar.zzm(iZzl, zzgxvVar));
        zzgxvVar.zzy(4 | ((i >>> 3) << 3));
        zzj(i, zzhboVar);
        return true;
    }

    private zzhbo() {
        this(0, new int[8], new Object[8], true);
    }
}
