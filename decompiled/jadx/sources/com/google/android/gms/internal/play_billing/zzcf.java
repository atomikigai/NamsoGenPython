package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcf extends zzbw {
    static final zzbw zza = new zzcf(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzcf(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static zzcf zzg(int i, Object[] objArr, zzbv zzbvVar) {
        int iHighestOneBit;
        boolean z4;
        int i10;
        char c10;
        ?? r10;
        char c11;
        short[] sArr;
        boolean z10;
        int i11;
        ?? r16;
        boolean z11;
        ?? r11;
        Object[] objArr2;
        zzbu zzbuVar;
        boolean z12;
        int i12 = i;
        Object[] objArrCopyOf = objArr;
        if (i12 == 0) {
            return (zzcf) zza;
        }
        zzbu zzbuVar2 = null;
        ?? r12 = 0;
        zzbu zzbuVar3 = null;
        zzbu zzbuVar4 = null;
        boolean z13 = false;
        int i13 = 1;
        if (i12 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzbo.zza(obj, obj2);
            return new zzcf(null, objArrCopyOf, 1);
        }
        zzbg.zzb(i12, objArrCopyOf.length >> 1, "index");
        char c12 = 2;
        int iMax = Math.max(i12, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i12 != 1) {
            int i14 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj3 = objArrCopyOf[i18];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i18 ^ i13];
                    Objects.requireNonNull(obj4);
                    zzbo.zza(obj3, obj4);
                    int iZza = zzbp.zza(obj3.hashCode());
                    while (true) {
                        int i19 = iZza & i14;
                        z10 = z13;
                        i11 = i13;
                        int i20 = bArr[i19] & 255;
                        if (i20 == 255) {
                            bArr[i19] = (byte) i17;
                            if (i16 < i15) {
                                objArrCopyOf[i17] = obj3;
                                objArrCopyOf[i17 ^ 1] = obj4;
                            }
                            i16++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i20 == true ? 1 : 0])) {
                            int i21 = ~i20;
                            Object obj5 = objArrCopyOf[i21 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            zzbu zzbuVar5 = new zzbu(obj3, obj4, obj5);
                            objArrCopyOf[i21 == true ? 1 : 0] = obj4;
                            zzbuVar3 = zzbuVar5;
                            break;
                        }
                        iZza = i19 + 1;
                        z13 = z10;
                        i13 = i11;
                    }
                    i15++;
                    z13 = z10;
                    i13 = i11;
                }
                z4 = z13;
                i10 = i13;
                if (i16 == i12) {
                    c10 = 2;
                    r10 = bArr;
                    r16 = z4;
                } else {
                    sArr = new Object[3];
                    sArr[z4 ? 1 : 0] = bArr;
                    sArr[i10] = Integer.valueOf(i16);
                    sArr[2] = zzbuVar3;
                    r12 = sArr;
                    z12 = z4;
                }
            } else {
                z4 = false;
                i10 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i22 = 0;
                    for (int i23 = 0; i23 < i12; i23++) {
                        int i24 = i22 + i22;
                        int i25 = i23 + i23;
                        Object obj6 = objArrCopyOf[i25];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i25 ^ 1];
                        Objects.requireNonNull(obj7);
                        zzbo.zza(obj6, obj7);
                        int iZza2 = zzbp.zza(obj6.hashCode());
                        while (true) {
                            int i26 = iZza2 & i14;
                            char c13 = (char) sArr[i26];
                            if (c13 == 65535) {
                                sArr[i26] = (short) i24;
                                if (i22 < i23) {
                                    objArrCopyOf[i24] = obj6;
                                    objArrCopyOf[i24 ^ 1] = obj7;
                                }
                                i22++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c13])) {
                                int i27 = c13 ^ 1;
                                Object obj8 = objArrCopyOf[i27 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                zzbu zzbuVar6 = new zzbu(obj6, obj7, obj8);
                                objArrCopyOf[i27 == true ? 1 : 0] = obj7;
                                zzbuVar4 = zzbuVar6;
                                break;
                            }
                            iZza2 = i26 + 1;
                        }
                    }
                    if (i22 == i12) {
                        r12 = sArr;
                        z12 = z4;
                    } else {
                        r12 = new Object[]{sArr, Integer.valueOf(i22), zzbuVar4};
                        z12 = z4;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i12) {
                        int i30 = i29 + i29;
                        int i31 = i28 + i28;
                        Object obj9 = objArrCopyOf[i31];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i31 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzbo.zza(obj9, obj10);
                        int iZza3 = zzbp.zza(obj9.hashCode());
                        while (true) {
                            int i32 = iZza3 & i14;
                            int i33 = iArr[i32];
                            if (i33 == -1) {
                                iArr[i32] = i30;
                                if (i29 < i28) {
                                    objArrCopyOf[i30] = obj9;
                                    objArrCopyOf[i30 ^ 1] = obj10;
                                }
                                i29++;
                                c11 = c12;
                                break;
                            }
                            c11 = c12;
                            if (obj9.equals(objArrCopyOf[i33])) {
                                int i34 = i33 ^ 1;
                                Object obj11 = objArrCopyOf[i34];
                                Objects.requireNonNull(obj11);
                                zzbu zzbuVar7 = new zzbu(obj9, obj10, obj11);
                                objArrCopyOf[i34] = obj10;
                                zzbuVar2 = zzbuVar7;
                                break;
                            }
                            iZza3 = i32 + 1;
                            c12 = c11;
                        }
                        i28++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i29 == i12) {
                        r10 = iArr;
                        r16 = z4;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i29);
                        objArr3[c10] = zzbuVar2;
                        r10 = objArr3;
                        r16 = z4;
                    }
                }
            }
            z11 = r10 instanceof Object[];
            r11 = r10;
            if (z11) {
                objArr2 = (Object[]) r10;
                zzbuVar = (zzbu) objArr2[c10];
                if (zzbvVar != null) {
                    throw zzbuVar.zza();
                }
                zzbvVar.zzc = zzbuVar;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i10]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r11 = obj12;
                i12 = iIntValue;
            }
            return new zzcf(r11, objArrCopyOf, i12);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        zzbo.zza(obj13, obj14);
        z12 = false;
        i12 = 1;
        i10 = 1;
        c10 = 2;
        r10 = r12;
        r16 = z12;
        z11 = r10 instanceof Object[];
        r11 = r10;
        if (z11) {
            objArr2 = (Object[]) r10;
            zzbuVar = (zzbu) objArr2[c10];
            if (zzbvVar != null) {
                throw zzbuVar.zza();
            }
            zzbvVar.zzc = zzbuVar;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i10]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r11 = obj15;
            i12 = iIntValue2;
        }
        return new zzcf(r11, objArrCopyOf, i12);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.play_billing.zzbw, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iZza = zzbp.zza(obj.hashCode());
                    while (true) {
                        int i10 = iZza & length;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            obj2 = objArr[i11 ^ 1];
                        } else {
                            iZza = i10 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzbp.zza(obj.hashCode());
                    while (true) {
                        int i12 = iZza2 & length2;
                        char c10 = (char) sArr[i12];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                        } else {
                            iZza2 = i12 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzbp.zza(obj.hashCode());
                    while (true) {
                        int i13 = iZza3 & length3;
                        int i14 = iArr[i13];
                        if (i14 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i14])) {
                            obj2 = objArr[i14 ^ 1];
                        } else {
                            iZza3 = i13 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    public final zzbq zza() {
        return new zzce(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    public final zzbx zzd() {
        return new zzcc(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    public final zzbx zze() {
        return new zzcd(this, new zzce(this.zzb, 0, this.zzd));
    }
}
