package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Arrays;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlm {
    private static final zzlm zza = new zzlm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzlm(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzlm zzc() {
        return zza;
    }

    public static zzlm zze(zzlm zzlmVar, zzlm zzlmVar2) {
        int i = zzlmVar.zzb + zzlmVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzlmVar.zzc, i);
        System.arraycopy(zzlmVar2.zzc, 0, iArrCopyOf, zzlmVar.zzb, zzlmVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzlmVar.zzd, i);
        System.arraycopy(zzlmVar2.zzd, 0, objArrCopyOf, zzlmVar.zzb, zzlmVar2.zzb);
        return new zzlm(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzlm zzf() {
        return new zzlm(0, new int[8], new Object[8], true);
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
        if (obj == null || !(obj instanceof zzlm)) {
            return false;
        }
        zzlm zzlmVar = (zzlm) obj;
        int i = this.zzb;
        if (i == zzlmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzlmVar.zzc;
            for (int i10 = 0; i10 < i; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzlmVar.zzd;
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
        int iZzy;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.zzd[i10]).getClass();
                    iZzy = zzhh.zzy(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    zzgw zzgwVar = (zzgw) this.zzd[i10];
                    int i15 = zzhh.zzb;
                    int iZzd = zzgwVar.zzd();
                    iA = a.A(i14, zzhh.zzy(iZzd) + iZzd, iA);
                } else if (i13 == 3) {
                    int i16 = i12 << 3;
                    int i17 = zzhh.zzb;
                    int iZza = ((zzlm) this.zzd[i10]).zza();
                    int iZzy2 = zzhh.zzy(i16);
                    iZzy = iZzy2 + iZzy2 + iZza;
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(zzje.zza());
                    }
                    ((Integer) this.zzd[i10]).getClass();
                    iZzy = zzhh.zzy(i12 << 3) + 4;
                }
                iA = iZzy + iA;
            } else {
                iA = a.A(i12 << 3, zzhh.zzz(((Long) this.zzd[i10]).longValue()), iA);
            }
        }
        this.zze = iA;
        return iA;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzy = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10] >>> 3;
            zzgw zzgwVar = (zzgw) this.zzd[i10];
            int i12 = zzhh.zzb;
            int iZzd = zzgwVar.zzd();
            int iZzy2 = zzhh.zzy(iZzd) + iZzd;
            int iZzy3 = zzhh.zzy(16);
            int iZzy4 = zzhh.zzy(i11);
            int iZzy5 = zzhh.zzy(8);
            iZzy += zzhh.zzy(24) + iZzy2 + iZzy3 + iZzy4 + iZzy5 + iZzy5;
        }
        this.zze = iZzy;
        return iZzy;
    }

    public final zzlm zzd(zzlm zzlmVar) {
        if (zzlmVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzlmVar.zzb;
        zzm(i);
        System.arraycopy(zzlmVar.zzc, 0, this.zzc, this.zzb, zzlmVar.zzb);
        System.arraycopy(zzlmVar.zzd, 0, this.zzd, this.zzb, zzlmVar.zzb);
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
            zzkg.zzb(sb2, i, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
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

    public final void zzk(zzmd zzmdVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzmdVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzmd zzmdVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i10 = this.zzc[i];
                Object obj = this.zzd[i];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzmdVar.zzt(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzmdVar.zzm(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzmdVar.zzd(i12, (zzgw) obj);
                } else if (i11 == 3) {
                    zzmdVar.zzF(i12);
                    ((zzlm) obj).zzl(zzmdVar);
                    zzmdVar.zzh(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(zzje.zza());
                    }
                    zzmdVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzlm() {
        this(0, new int[8], new Object[8], true);
    }
}
