package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamw {
    private static final zzamw zza = new zzamw(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzamw(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzamw zzc() {
        return zza;
    }

    public static zzamw zze(zzamw zzamwVar, zzamw zzamwVar2) {
        int i = zzamwVar.zzb + zzamwVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzamwVar.zzc, i);
        System.arraycopy(zzamwVar2.zzc, 0, iArrCopyOf, zzamwVar.zzb, zzamwVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzamwVar.zzd, i);
        System.arraycopy(zzamwVar2.zzd, 0, objArrCopyOf, zzamwVar.zzb, zzamwVar2.zzb);
        return new zzamw(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzamw zzf() {
        return new zzamw(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
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
        if (obj == null || !(obj instanceof zzamw)) {
            return false;
        }
        zzamw zzamwVar = (zzamw) obj;
        int i = this.zzb;
        if (i == zzamwVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamwVar.zzc;
            for (int i10 = 0; i10 < i; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzamwVar.zzd;
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
        int iZzA;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iX = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.zzd[i10]).getClass();
                    iZzA = zzajs.zzA(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    zzajf zzajfVar = (zzajf) this.zzd[i10];
                    int i15 = zzajs.zzf;
                    int iZzd = zzajfVar.zzd();
                    iX = a.x(i14, zzajs.zzA(iZzd) + iZzd, iX);
                } else if (i13 == 3) {
                    int i16 = i12 << 3;
                    int i17 = zzajs.zzf;
                    int iZza = ((zzamw) this.zzd[i10]).zza();
                    int iZzA2 = zzajs.zzA(i16);
                    iZzA = iZzA2 + iZzA2 + iZza;
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(zzaks.zza());
                    }
                    ((Integer) this.zzd[i10]).getClass();
                    iZzA = zzajs.zzA(i12 << 3) + 4;
                }
                iX = iZzA + iX;
            } else {
                iX = a.x(i12 << 3, zzajs.zzB(((Long) this.zzd[i10]).longValue()), iX);
            }
        }
        this.zze = iX;
        return iX;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzA = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10] >>> 3;
            zzajf zzajfVar = (zzajf) this.zzd[i10];
            int i12 = zzajs.zzf;
            int iZzd = zzajfVar.zzd();
            int iZzA2 = zzajs.zzA(iZzd) + iZzd;
            int iZzA3 = zzajs.zzA(16);
            int iZzA4 = zzajs.zzA(i11);
            int iZzA5 = zzajs.zzA(8);
            iZzA += zzajs.zzA(24) + iZzA2 + iZzA3 + iZzA4 + iZzA5 + iZzA5;
        }
        this.zze = iZzA;
        return iZzA;
    }

    public final zzamw zzd(zzamw zzamwVar) {
        if (zzamwVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzamwVar.zzb;
        zzl(i);
        System.arraycopy(zzamwVar.zzc, 0, this.zzc, this.zzb, zzamwVar.zzb);
        System.arraycopy(zzamwVar.zzd, 0, this.zzd, this.zzb, zzamwVar.zzb);
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
            zzalr.zzb(sb2, i, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzk(zzajt zzajtVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i10 = this.zzc[i];
                Object obj = this.zzd[i];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzajtVar.zzt(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzajtVar.zzm(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzajtVar.zzd(i12, (zzajf) obj);
                } else if (i11 == 3) {
                    zzajtVar.zzE(i12);
                    ((zzamw) obj).zzk(zzajtVar);
                    zzajtVar.zzh(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(zzaks.zza());
                    }
                    zzajtVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzamw() {
        this(0, new int[8], new Object[8], true);
    }
}
