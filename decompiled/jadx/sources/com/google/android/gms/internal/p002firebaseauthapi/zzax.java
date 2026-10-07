package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzax extends zzap {
    static final zzap zza = new zzax(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzax(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    public static zzax zzg(int i, Object[] objArr, zzao zzaoVar) {
        int iHighestOneBit;
        boolean z4;
        int i10;
        int i11;
        short[] sArr;
        boolean z10;
        ?? r16;
        int i12 = i;
        Object[] objArrCopyOf = objArr;
        if (i12 == 0) {
            return (zzax) zza;
        }
        zzan zzanVar = null;
        ?? r10 = 0;
        zzan zzanVar2 = null;
        zzan zzanVar3 = null;
        boolean z11 = false;
        int i13 = 1;
        if (i12 == 1) {
            Object obj = objArrCopyOf[0];
            obj.getClass();
            Object obj2 = objArrCopyOf[1];
            obj2.getClass();
            zzae.zza(obj, obj2);
            return new zzax(null, objArrCopyOf, 1);
        }
        zzu.zzb(i12, objArrCopyOf.length >> 1, "index");
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
        if (i12 == 1) {
            Object obj3 = objArrCopyOf[0];
            obj3.getClass();
            Object obj4 = objArrCopyOf[1];
            obj4.getClass();
            zzae.zza(obj3, obj4);
            r16 = 0;
            i12 = 1;
            i10 = 1;
        } else {
            int i14 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i12) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj5 = objArrCopyOf[i18];
                    obj5.getClass();
                    Object obj6 = objArrCopyOf[i18 ^ 1];
                    obj6.getClass();
                    zzae.zza(obj5, obj6);
                    int iZza = zzaf.zza(obj5.hashCode());
                    while (true) {
                        int i19 = iZza & i14;
                        z10 = z11;
                        int i20 = bArr[i19] & 255;
                        if (i20 == 255) {
                            bArr[i19] = (byte) i17;
                            if (i16 < i15) {
                                objArrCopyOf[i17] = obj5;
                                objArrCopyOf[i17 ^ 1] = obj6;
                            }
                            i16++;
                            break;
                        }
                        if (obj5.equals(objArrCopyOf[i20 == true ? 1 : 0])) {
                            int i21 = ~i20;
                            Object obj7 = objArrCopyOf[i21 == true ? 1 : 0];
                            obj7.getClass();
                            zzan zzanVar4 = new zzan(obj5, obj6, obj7);
                            objArrCopyOf[i21 == true ? 1 : 0] = obj6;
                            zzanVar2 = zzanVar4;
                            break;
                        }
                        iZza = i19 + 1;
                        z11 = z10;
                    }
                    i15++;
                    z11 = z10;
                }
                z4 = z11;
                if (i16 == i12) {
                    i10 = 1;
                    r10 = bArr;
                    r16 = z4;
                } else {
                    sArr = new Object[3];
                    sArr[z4 ? 1 : 0] = bArr;
                    sArr[1] = Integer.valueOf(i16);
                    sArr[2] = zzanVar2;
                    r10 = sArr;
                    i10 = 1;
                    r16 = z4;
                }
            } else {
                z4 = false;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i22 = 0;
                    for (int i23 = 0; i23 < i12; i23++) {
                        int i24 = i22 + i22;
                        int i25 = i23 + i23;
                        Object obj8 = objArrCopyOf[i25];
                        obj8.getClass();
                        Object obj9 = objArrCopyOf[i25 ^ 1];
                        obj9.getClass();
                        zzae.zza(obj8, obj9);
                        int iZza2 = zzaf.zza(obj8.hashCode());
                        while (true) {
                            int i26 = iZza2 & i14;
                            char c10 = (char) sArr[i26];
                            if (c10 == 65535) {
                                sArr[i26] = (short) i24;
                                if (i22 < i23) {
                                    objArrCopyOf[i24] = obj8;
                                    objArrCopyOf[i24 ^ 1] = obj9;
                                }
                                i22++;
                                break;
                            }
                            if (obj8.equals(objArrCopyOf[c10])) {
                                int i27 = c10 ^ 1;
                                Object obj10 = objArrCopyOf[i27 == true ? 1 : 0];
                                obj10.getClass();
                                zzan zzanVar5 = new zzan(obj8, obj9, obj10);
                                objArrCopyOf[i27 == true ? 1 : 0] = obj9;
                                zzanVar3 = zzanVar5;
                                break;
                            }
                            iZza2 = i26 + 1;
                        }
                    }
                    if (i22 == i12) {
                        r10 = sArr;
                        i10 = 1;
                        r16 = z4;
                    } else {
                        i10 = 1;
                        r10 = new Object[]{sArr, Integer.valueOf(i22), zzanVar3};
                        r16 = z4;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i12) {
                        int i30 = i29 + i29;
                        int i31 = i28 + i28;
                        Object obj11 = objArrCopyOf[i31];
                        obj11.getClass();
                        Object obj12 = objArrCopyOf[i31 ^ i13];
                        obj12.getClass();
                        zzae.zza(obj11, obj12);
                        int iZza3 = zzaf.zza(obj11.hashCode());
                        while (true) {
                            int i32 = iZza3 & i14;
                            int i33 = iArr[i32];
                            if (i33 == -1) {
                                iArr[i32] = i30;
                                if (i29 < i28) {
                                    objArrCopyOf[i30] = obj11;
                                    objArrCopyOf[i30 ^ 1] = obj12;
                                }
                                i29++;
                                i11 = i13;
                                break;
                            }
                            i11 = i13;
                            if (obj11.equals(objArrCopyOf[i33])) {
                                int i34 = i33 ^ 1;
                                Object obj13 = objArrCopyOf[i34];
                                obj13.getClass();
                                zzan zzanVar6 = new zzan(obj11, obj12, obj13);
                                objArrCopyOf[i34] = obj12;
                                zzanVar = zzanVar6;
                                break;
                            }
                            iZza3 = i32 + 1;
                            i13 = i11;
                        }
                        i28++;
                        i13 = i11;
                    }
                    i10 = i13;
                    if (i29 == i12) {
                        r10 = iArr;
                        r16 = z4;
                    } else {
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = iArr;
                        objArr2[i10] = Integer.valueOf(i29);
                        objArr2[2] = zzanVar;
                        r10 = objArr2;
                        r16 = z4;
                    }
                }
            }
        }
        boolean z12 = r10 instanceof Object[];
        ?? r11 = r10;
        if (z12) {
            Object[] objArr3 = (Object[]) r10;
            zzaoVar.zzc = (zzan) objArr3[2];
            Object obj14 = objArr3[r16];
            int iIntValue = ((Integer) objArr3[i10]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r11 = obj14;
            i12 = iIntValue;
        }
        return new zzax(r11, objArrCopyOf, i12);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
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
                    int iZza = zzaf.zza(obj.hashCode());
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
                    int iZza2 = zzaf.zza(obj.hashCode());
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
                    int iZza3 = zzaf.zza(obj.hashCode());
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    public final zzai zza() {
        return new zzaw(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    public final zzaq zzd() {
        return new zzau(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    public final zzaq zze() {
        return new zzav(this, new zzaw(this.zzb, 0, this.zzd));
    }
}
