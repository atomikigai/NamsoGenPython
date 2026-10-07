package com.google.android.gms.internal.auth;

import androidx.webkit.TracingConfig;
import com.google.android.gms.internal.ads.zzbbs;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import q1.a;
import sun.misc.Unsafe;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i, int i10, zzfw zzfwVar, boolean z4, boolean z10, int[] iArr2, int i11, int i12, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i10;
        this.zzh = z4;
        this.zzi = iArr2;
        this.zzj = i11;
        this.zzk = i12;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbE = b.e("Field ", str, " for ", name, " not found. Known fields are ");
            sbE.append(string);
            throw new RuntimeException(sbE.toString());
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        long jZzv = zzv(i) & 1048575;
        if (zzG(obj2, i)) {
            Object objZzf = zzhi.zzf(obj, jZzv);
            Object objZzf2 = zzhi.zzf(obj2, jZzv);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, jZzv, zzez.zzg(objZzf, objZzf2));
                zzD(obj, i);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, jZzv, objZzf2);
                zzD(obj, i);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int iZzv = zzv(i);
        int i10 = this.zzc[i];
        long j4 = iZzv & 1048575;
        if (zzJ(obj2, i10, i)) {
            Object objZzf = zzJ(obj, i10, i) ? zzhi.zzf(obj, j4) : null;
            Object objZzf2 = zzhi.zzf(obj2, j4);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, j4, zzez.zzg(objZzf, objZzf2));
                zzE(obj, i10, i);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, j4, objZzf2);
                zzE(obj, i10, i);
            }
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzs = zzs(i);
        long j4 = 1048575 & iZzs;
        if (j4 == 1048575) {
            return;
        }
        zzhi.zzn(obj, j4, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j4));
    }

    private final void zzE(Object obj, int i, int i10) {
        zzhi.zzn(obj, zzs(i10) & 1048575, i);
    }

    private final boolean zzF(Object obj, Object obj2, int i) {
        return zzG(obj, i) == zzG(obj2, i);
    }

    private final boolean zzG(Object obj, int i) {
        int iZzs = zzs(i);
        long j4 = iZzs & 1048575;
        if (j4 != 1048575) {
            return (zzhi.zzc(obj, j4) & (1 << (iZzs >>> 20))) != 0;
        }
        int iZzv = zzv(i);
        long j10 = iZzv & 1048575;
        switch (zzu(iZzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j10)) != 0;
            case 2:
                return zzhi.zzd(obj, j10) != 0;
            case 3:
                return zzhi.zzd(obj, j10) != 0;
            case 4:
                return zzhi.zzc(obj, j10) != 0;
            case 5:
                return zzhi.zzd(obj, j10) != 0;
            case 6:
                return zzhi.zzc(obj, j10) != 0;
            case 7:
                return zzhi.zzt(obj, j10);
            case 8:
                Object objZzf = zzhi.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzee) {
                    return !zzee.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j10) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j10));
            case 11:
                return zzhi.zzc(obj, j10) != 0;
            case 12:
                return zzhi.zzc(obj, j10) != 0;
            case 13:
                return zzhi.zzc(obj, j10) != 0;
            case 14:
                return zzhi.zzd(obj, j10) != 0;
            case 15:
                return zzhi.zzc(obj, j10) != 0;
            case 16:
                return zzhi.zzd(obj, j10) != 0;
            case 17:
                return zzhi.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return zzG(obj, i);
        }
        return (i11 & i12) != 0;
    }

    private static boolean zzI(Object obj, int i, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i & 1048575));
    }

    private final boolean zzJ(Object obj, int i, int i10) {
        return zzhi.zzc(obj, (long) (zzs(i10) & 1048575)) == i;
    }

    public static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzgzVarZzc = zzgz.zzc();
        zzeuVar.zzc = zzgzVarZzc;
        return zzgzVarZzc;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0260  */
    /* JADX WARN: Code duplicated, block: B:124:0x0263  */
    /* JADX WARN: Code duplicated, block: B:127:0x027c  */
    /* JADX WARN: Code duplicated, block: B:128:0x027f  */
    /* JADX WARN: Code duplicated, block: B:162:0x033d  */
    /* JADX WARN: Code duplicated, block: B:177:0x038e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0399  */
    public static zzfz zzk(zzgg zzggVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        char cCharAt;
        int i14;
        char cCharAt2;
        int i15;
        char cCharAt3;
        int i16;
        char cCharAt4;
        int i17;
        char cCharAt5;
        int i18;
        char cCharAt6;
        int i19;
        char cCharAt7;
        int i20;
        char cCharAt8;
        int i21;
        int i22;
        int i23;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i24;
        int i25;
        int i26;
        int i27;
        Field fieldZzA;
        int i28;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldZzA2;
        int i33;
        Object obj2;
        Field fieldZzA3;
        int i34;
        char cCharAt10;
        int i35;
        int i36;
        char cCharAt11;
        int i37;
        char cCharAt12;
        int i38;
        char cCharAt13;
        boolean z4 = zzggVar.zzc() == 2;
        String strZzd = zzggVar.zzd();
        int length = strZzd.length();
        int i39 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i = i40 + 1;
                if (strZzd.charAt(i40) < 55296) {
                    break;
                }
                i40 = i;
            }
        } else {
            i = 1;
        }
        int i41 = i + 1;
        int iCharAt5 = strZzd.charAt(i);
        if (iCharAt5 >= 55296) {
            int i42 = iCharAt5 & 8191;
            int i43 = 13;
            while (true) {
                i38 = i41 + 1;
                cCharAt13 = strZzd.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i38;
            }
            iCharAt5 = i42 | (cCharAt13 << i43);
            i41 = i38;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i11 = 0;
            iCharAt4 = 0;
            i10 = 0;
            iArr = zza;
            i12 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt6 = strZzd.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i20 = i44 + 1;
                    cCharAt8 = strZzd.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i20;
                }
                iCharAt6 = i45 | (cCharAt8 << i46);
                i44 = i20;
            }
            int i47 = i44 + 1;
            int iCharAt7 = strZzd.charAt(i44);
            if (iCharAt7 >= 55296) {
                int i48 = iCharAt7 & 8191;
                int i49 = 13;
                while (true) {
                    i19 = i47 + 1;
                    cCharAt7 = strZzd.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i19;
                }
                iCharAt7 = i48 | (cCharAt7 << i49);
                i47 = i19;
            }
            int i50 = i47 + 1;
            iCharAt = strZzd.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i18 = i50 + 1;
                    cCharAt6 = strZzd.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i18;
                }
                iCharAt = i51 | (cCharAt6 << i52);
                i50 = i18;
            }
            int i53 = i50 + 1;
            iCharAt2 = strZzd.charAt(i50);
            if (iCharAt2 >= 55296) {
                int i54 = iCharAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i17 = i53 + 1;
                    cCharAt5 = strZzd.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i17;
                }
                iCharAt2 = i54 | (cCharAt5 << i55);
                i53 = i17;
            }
            int i56 = i53 + 1;
            iCharAt3 = strZzd.charAt(i53);
            if (iCharAt3 >= 55296) {
                int i57 = iCharAt3 & 8191;
                int i58 = 13;
                while (true) {
                    i16 = i56 + 1;
                    cCharAt4 = strZzd.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i16;
                }
                iCharAt3 = i57 | (cCharAt4 << i58);
                i56 = i16;
            }
            int i59 = i56 + 1;
            int iCharAt8 = strZzd.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i60 = iCharAt8 & 8191;
                int i61 = 13;
                while (true) {
                    i15 = i59 + 1;
                    cCharAt3 = strZzd.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i15;
                }
                iCharAt8 = i60 | (cCharAt3 << i61);
                i59 = i15;
            }
            int i62 = i59 + 1;
            int iCharAt9 = strZzd.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = 13;
                while (true) {
                    i14 = i62 + 1;
                    cCharAt2 = strZzd.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i14;
                }
                iCharAt9 = i63 | (cCharAt2 << i64);
                i62 = i14;
            }
            int i65 = i62 + 1;
            iCharAt4 = strZzd.charAt(i62);
            if (iCharAt4 >= 55296) {
                int i66 = iCharAt4 & 8191;
                int i67 = 13;
                while (true) {
                    i13 = i65 + 1;
                    cCharAt = strZzd.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i13;
                }
                iCharAt4 = i66 | (cCharAt << i67);
                i65 = i13;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt8 + iCharAt9];
            i10 = iCharAt6 + iCharAt6 + iCharAt7;
            i11 = iCharAt8;
            iArr = iArr2;
            i12 = iCharAt6;
            i41 = i65;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzggVar.zze();
        Class<?> cls = zzggVar.zza().getClass();
        int[] iArr3 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 + iCharAt3];
        int i68 = i11 + iCharAt4;
        int i69 = i68;
        int i70 = iCharAt4;
        int i71 = 0;
        int i72 = 0;
        while (i41 < length) {
            int i73 = i41 + 1;
            int iCharAt10 = strZzd.charAt(i41);
            if (iCharAt10 >= i39) {
                int i74 = iCharAt10 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i37 = i75 + 1;
                    cCharAt12 = strZzd.charAt(i75);
                    i21 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i37;
                    length = i21;
                }
                iCharAt10 = i74 | (cCharAt12 << i76);
                i22 = i37;
            } else {
                i21 = length;
                i22 = i73;
            }
            int i77 = i22 + 1;
            int iCharAt11 = strZzd.charAt(i22);
            int i78 = iCharAt10;
            char c10 = 55296;
            if (iCharAt11 >= 55296) {
                int i79 = iCharAt11 & 8191;
                int i80 = 13;
                while (true) {
                    i36 = i77 + 1;
                    cCharAt11 = strZzd.charAt(i77);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i77 = i36;
                    c10 = 55296;
                }
                iCharAt11 = i79 | (cCharAt11 << i80);
                i77 = i36;
            }
            int i81 = iCharAt11 & 255;
            int i82 = i12;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i71;
                i72++;
            }
            if (i81 >= 51) {
                int i83 = i77 + 1;
                int iCharAt12 = strZzd.charAt(i77);
                if (iCharAt12 >= 55296) {
                    int i84 = iCharAt12 & 8191;
                    int i85 = i83;
                    int i86 = 13;
                    while (true) {
                        i34 = i85 + 1;
                        cCharAt10 = strZzd.charAt(i85);
                        i35 = i84;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i84 = i35 | ((cCharAt10 & 8191) << i86);
                        i86 += 13;
                        i85 = i34;
                    }
                    iCharAt12 = i35 | (cCharAt10 << i86);
                    i30 = i34;
                } else {
                    i30 = i83;
                }
                int i87 = iCharAt12;
                int i88 = i81 - 51;
                int i89 = i30;
                if (i88 == 9 || i88 == 17) {
                    int i90 = i71 / 3;
                    i31 = i10 + 1;
                    objArr[i90 + i90 + 1] = objArrZze[i10];
                } else {
                    if (i88 == 12 && !z4) {
                        int i91 = i71 / 3;
                        i31 = i10 + 1;
                        objArr[i91 + i91 + 1] = objArrZze[i10];
                    }
                    i32 = i87 + i87;
                    obj = objArrZze[i32];
                    if (obj instanceof Field) {
                        fieldZzA2 = (Field) obj;
                    } else {
                        fieldZzA2 = zzA(cls, (String) obj);
                        objArrZze[i32] = fieldZzA2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzA2);
                    i33 = i32 + 1;
                    obj2 = objArrZze[i33];
                    if (obj2 instanceof Field) {
                        fieldZzA3 = (Field) obj2;
                    } else {
                        fieldZzA3 = zzA(cls, (String) obj2);
                        objArrZze[i33] = fieldZzA3;
                    }
                    i71 = i71;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                    i23 = i10;
                    i27 = iObjectFieldOffset3;
                    iCharAt = iCharAt;
                    i24 = i89;
                    strZzd = strZzd;
                    cls = cls;
                    i26 = 0;
                }
                i10 = i31;
                i32 = i87 + i87;
                obj = objArrZze[i32];
                if (obj instanceof Field) {
                    fieldZzA2 = (Field) obj;
                } else {
                    fieldZzA2 = zzA(cls, (String) obj);
                    objArrZze[i32] = fieldZzA2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzA2);
                i33 = i32 + 1;
                obj2 = objArrZze[i33];
                if (obj2 instanceof Field) {
                    fieldZzA3 = (Field) obj2;
                } else {
                    fieldZzA3 = zzA(cls, (String) obj2);
                    objArrZze[i33] = fieldZzA3;
                }
                i71 = i71;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                i23 = i10;
                i27 = iObjectFieldOffset4;
                iCharAt = iCharAt;
                i24 = i89;
                strZzd = strZzd;
                cls = cls;
                i26 = 0;
            } else {
                int i92 = i10 + 1;
                Field fieldZzA4 = zzA(cls, (String) objArrZze[i10]);
                if (i81 == 9 || i81 == 17) {
                    objArr[a.v(i71, 3, 1)] = fieldZzA4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        int i93 = i71 / 3;
                        i29 = i10 + 2;
                        objArr[i93 + i93 + 1] = objArrZze[i92];
                    } else if (i81 != 12 && i81 != 30 && i81 != 44) {
                        if (i81 == 50) {
                            int i94 = i70 + 1;
                            iArr[i70] = i71;
                            int i95 = i71 / 3;
                            int i96 = i95 + i95;
                            i23 = i10 + 2;
                            objArr[i96] = objArrZze[i92];
                            if ((iCharAt11 & 2048) != 0) {
                                objArr[i96 + 1] = objArrZze[i23];
                                i23 = i10 + 3;
                            }
                            iCharAt = iCharAt;
                            i70 = i94;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) == 4096 || i81 > 17) {
                            i24 = i77;
                            i25 = 0;
                        } else {
                            i24 = i77 + 1;
                            int iCharAt13 = strZzd.charAt(i77);
                            if (iCharAt13 >= 55296) {
                                int i97 = iCharAt13 & 8191;
                                int i98 = 13;
                                while (true) {
                                    i28 = i24 + 1;
                                    cCharAt9 = strZzd.charAt(i24);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i97 |= (cCharAt9 & 8191) << i98;
                                    i98 += 13;
                                    i24 = i28;
                                }
                                iCharAt13 = i97 | (cCharAt9 << i98);
                                i24 = i28;
                            }
                            int i99 = (iCharAt13 / 32) + i82 + i82;
                            Object obj3 = objArrZze[i99];
                            if (obj3 instanceof Field) {
                                fieldZzA = (Field) obj3;
                            } else {
                                fieldZzA = zzA(cls, (String) obj3);
                                objArrZze[i99] = fieldZzA;
                            }
                            i25 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA);
                        }
                        if (i81 >= 18 && i81 <= 49) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                        i26 = i25;
                        i27 = iObjectFieldOffset;
                    } else if (!z4) {
                        int i100 = i71 / 3;
                        i29 = i10 + 2;
                        objArr[i100 + i100 + 1] = objArrZze[i92];
                    }
                    i23 = i29;
                    iCharAt = iCharAt;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) == 4096) {
                        i24 = i77;
                        i25 = 0;
                    } else {
                        i24 = i77;
                        i25 = 0;
                    }
                    if (i81 >= 18) {
                        iArr[i69] = iObjectFieldOffset;
                        i69++;
                    }
                    i26 = i25;
                    i27 = iObjectFieldOffset;
                }
                i23 = i92;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) == 4096) {
                    i24 = i77;
                    i25 = 0;
                } else {
                    i24 = i77;
                    i25 = 0;
                }
                if (i81 >= 18) {
                    iArr[i69] = iObjectFieldOffset;
                    i69++;
                }
                i26 = i25;
                i27 = iObjectFieldOffset;
            }
            int i101 = i71 + 1;
            iArr3[i71] = i78;
            int i102 = i71 + 2;
            iArr3[i101] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i81 << 20) | i27;
            i71 += 3;
            iArr3[i102] = (i26 << 20) | iObjectFieldOffset2;
            cls = cls;
            i41 = i24;
            iCharAt = iCharAt;
            i12 = i82;
            length = i21;
            iArr3 = iArr3;
            i10 = i23;
            strZzd = strZzd;
            i39 = 55296;
        }
        return new zzfz(iArr3, objArr, iCharAt, iCharAt2, zzggVar.zza(), z4, false, iArr, iCharAt4, i68, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar, null);
    }

    private static int zzl(Object obj, long j4) {
        return ((Integer) zzhi.zzf(obj, j4)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i, int i10, int i11, long j4, zzds zzdsVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzz = zzz(i11);
        Object object = unsafe.getObject(obj, j4);
        if (!((zzfq) object).zze()) {
            zzfq zzfqVarZzb = zzfq.zza().zzb();
            zzfr.zza(zzfqVarZzb, object);
            unsafe.putObject(obj, j4, zzfqVarZzb);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i, int i10, int i11, int i12, int i13, int i14, int i15, long j4, int i16, zzds zzdsVar) throws IOException {
        Object object;
        Unsafe unsafe = zzb;
        long j10 = this.zzc[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j4, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i))));
                unsafe.putInt(obj, j10, i12);
                return i + 8;
            case 52:
                if (i13 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j4, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i))));
                unsafe.putInt(obj, j10, i12);
                return i + 4;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i;
                }
                int iZzm = zzdt.zzm(bArr, i, zzdsVar);
                unsafe.putObject(obj, j4, Long.valueOf(zzdsVar.zzb));
                unsafe.putInt(obj, j10, i12);
                return iZzm;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i;
                }
                int iZzj = zzdt.zzj(bArr, i, zzdsVar);
                unsafe.putObject(obj, j4, Integer.valueOf(zzdsVar.zza));
                unsafe.putInt(obj, j10, i12);
                return iZzj;
            case 56:
            case 65:
                if (i13 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j4, Long.valueOf(zzdt.zzn(bArr, i)));
                unsafe.putInt(obj, j10, i12);
                return i + 8;
            case 57:
            case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                if (i13 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(zzdt.zzb(bArr, i)));
                unsafe.putInt(obj, j10, i12);
                return i + 4;
            case 58:
                if (i13 != 0) {
                    return i;
                }
                int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
                unsafe.putObject(obj, j4, Boolean.valueOf(zzdsVar.zzb != 0));
                unsafe.putInt(obj, j10, i12);
                return iZzm2;
            case 59:
                if (i13 != 2) {
                    return i;
                }
                int iZzj2 = zzdt.zzj(bArr, i, zzdsVar);
                int i17 = zzdsVar.zza;
                if (i17 == 0) {
                    unsafe.putObject(obj, j4, "");
                } else {
                    if ((i14 & 536870912) != 0 && !zzhm.zzd(bArr, iZzj2, iZzj2 + i17)) {
                        throw zzfa.zzb();
                    }
                    unsafe.putObject(obj, j4, new String(bArr, iZzj2, i17, zzez.zzb));
                    iZzj2 += i17;
                }
                unsafe.putInt(obj, j10, i12);
                return iZzj2;
            case 60:
                if (i13 != 2) {
                    return i;
                }
                int iZzd = zzdt.zzd(zzy(i16), bArr, i, i10, zzdsVar);
                object = unsafe.getInt(obj, j10) == i12 ? unsafe.getObject(obj, j4) : null;
                if (object == null) {
                    unsafe.putObject(obj, j4, zzdsVar.zzc);
                } else {
                    unsafe.putObject(obj, j4, zzez.zzg(object, zzdsVar.zzc));
                }
                unsafe.putInt(obj, j10, i12);
                return iZzd;
            case 61:
                if (i13 != 2) {
                    return i;
                }
                int iZza = zzdt.zza(bArr, i, zzdsVar);
                unsafe.putObject(obj, j4, zzdsVar.zzc);
                unsafe.putInt(obj, j10, i12);
                return iZza;
            case 63:
                if (i13 != 0) {
                    return i;
                }
                int iZzj3 = zzdt.zzj(bArr, i, zzdsVar);
                int i18 = zzdsVar.zza;
                zzex zzexVarZzx = zzx(i16);
                if (zzexVarZzx != null && !zzexVarZzx.zza()) {
                    zzc(obj).zzf(i11, Long.valueOf(i18));
                    return iZzj3;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(i18));
                unsafe.putInt(obj, j10, i12);
                return iZzj3;
            case 66:
                if (i13 != 0) {
                    return i;
                }
                int iZzj4 = zzdt.zzj(bArr, i, zzdsVar);
                unsafe.putObject(obj, j4, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                unsafe.putInt(obj, j10, i12);
                return iZzj4;
            case 67:
                if (i13 != 0) {
                    return i;
                }
                int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
                unsafe.putObject(obj, j4, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                unsafe.putInt(obj, j10, i12);
                return iZzm3;
            case 68:
                if (i13 == 3) {
                    int iZzc = zzdt.zzc(zzy(i16), bArr, i, i10, (i11 & (-8)) | 4, zzdsVar);
                    object = unsafe.getInt(obj, j10) == i12 ? unsafe.getObject(obj, j4) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j4, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j4, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j10, i12);
                    return iZzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
    private final int zzo(Object obj, byte[] bArr, int i, int i10, zzds zzdsVar) throws IOException {
        Unsafe unsafe;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        this = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i21 = i10;
        zzdsVar = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i22 = -1;
        int iZzm = i;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1048575;
        while (iZzm < i21) {
            int iZzk = iZzm + 1;
            int i27 = bArr2[iZzm];
            if (i27 < 0) {
                iZzk = zzdt.zzk(i27, bArr2, iZzk, zzdsVar);
                i27 = zzdsVar.zza;
            }
            int i28 = iZzk;
            int i29 = i27 >>> 3;
            int i30 = i27 & 7;
            int iZzr = i29 > i23 ? this.zzr(i29, i24 / 3) : this.zzq(i29);
            if (iZzr == i22) {
                unsafe = unsafe2;
                i11 = i27;
                i12 = i22;
                i13 = i29;
                i14 = 0;
                obj = obj2;
            } else {
                int[] iArr = this.zzc;
                int i31 = iArr[iZzr + 1];
                int iZzu = zzu(i31);
                int i32 = i27;
                int i33 = iZzr;
                long j4 = i31 & 1048575;
                if (iZzu <= 17) {
                    int i34 = iArr[i33 + 2];
                    int i35 = 1 << (i34 >>> 20);
                    int i36 = i34 & 1048575;
                    if (i36 != i26) {
                        int i37 = 1048575;
                        if (i26 != 1048575) {
                            unsafe2.putInt(obj2, i26, i25);
                            i37 = 1048575;
                        }
                        if (i36 != i37) {
                            i25 = unsafe2.getInt(obj2, i36);
                        }
                        i26 = i36;
                    }
                    switch (iZzu) {
                        case 0:
                            i20 = i33;
                            if (i30 != 1) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                zzhi.zzl(obj2, j4, Double.longBitsToDouble(zzdt.zzn(bArr2, i28)));
                                iZzm = i28 + 8;
                                i25 |= i35;
                                i21 = i10;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                            }
                            break;
                        case 1:
                            i20 = i33;
                            if (i30 != 5) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                zzhi.zzm(obj2, j4, Float.intBitsToFloat(zzdt.zzb(bArr2, i28)));
                                iZzm = i28 + 4;
                                i25 |= i35;
                                i21 = i10;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i20 = i33;
                            if (i30 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                int iZzm2 = zzdt.zzm(bArr2, i28, zzdsVar);
                                Unsafe unsafe3 = unsafe2;
                                Object obj3 = obj2;
                                unsafe3.putLong(obj3, j4, zzdsVar.zzb);
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i25 |= i35;
                                iZzm = iZzm2;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                                i21 = i10;
                            }
                            break;
                        case 4:
                        case 11:
                            i20 = i33;
                            if (i30 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                int iZzj = zzdt.zzj(bArr2, i28, zzdsVar);
                                unsafe2.putInt(obj2, j4, zzdsVar.zza);
                                i25 |= i35;
                                i21 = i10;
                                iZzm = iZzj;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i20 = i33;
                            if (i30 != 1) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj4 = obj2;
                                unsafe4.putLong(obj4, j4, zzdt.zzn(bArr2, i28));
                                unsafe2 = unsafe4;
                                obj2 = obj4;
                                iZzm = i28 + 8;
                                i25 |= i35;
                                i21 = i10;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i20 = i33;
                            if (i30 != 5) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                unsafe2.putInt(obj2, j4, zzdt.zzb(bArr2, i28));
                                iZzm = i28 + 4;
                                i25 |= i35;
                                i21 = i10;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                            }
                            break;
                        case 7:
                            i20 = i33;
                            if (i30 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzm(bArr2, i28, zzdsVar);
                                zzhi.zzk(obj2, j4, zzdsVar.zzb != 0);
                                i25 |= i35;
                                i21 = i10;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                            }
                            break;
                        case 8:
                            i20 = i33;
                            if (i30 != 2) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                iZzm = (536870912 & i31) == 0 ? zzdt.zzg(bArr2, i28, zzdsVar) : zzdt.zzh(bArr2, i28, zzdsVar);
                                unsafe2.putObject(obj2, j4, zzdsVar.zzc);
                                i25 |= i35;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                            }
                            break;
                        case 9:
                            i20 = i33;
                            if (i30 != 2) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzd(this.zzy(i20), bArr2, i28, i21, zzdsVar);
                                Object object = unsafe2.getObject(obj2, j4);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j4, zzdsVar.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j4, zzez.zzg(object, zzdsVar.zzc));
                                }
                                i25 |= i35;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                            }
                            break;
                        case 10:
                            i20 = i33;
                            if (i30 != 2) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zza(bArr2, i28, zzdsVar);
                                unsafe2.putObject(obj2, j4, zzdsVar.zzc);
                                i25 |= i35;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                            }
                            break;
                        case 12:
                            i20 = i33;
                            if (i30 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzj(bArr2, i28, zzdsVar);
                                unsafe2.putInt(obj2, j4, zzdsVar.zza);
                                i25 |= i35;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                            }
                            break;
                        case 15:
                            i20 = i33;
                            if (i30 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzj(bArr2, i28, zzdsVar);
                                unsafe2.putInt(obj2, j4, zzei.zzb(zzdsVar.zza));
                                i25 |= i35;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                            }
                            break;
                        case 16:
                            if (i30 != 0) {
                                i20 = i33;
                                obj = obj2;
                                unsafe = unsafe2;
                                i13 = i29;
                                i14 = i20;
                                i12 = -1;
                                i11 = i32 == true ? 1 : 0;
                            } else {
                                int iZzm3 = zzdt.zzm(bArr2, i28, zzdsVar);
                                Unsafe unsafe5 = unsafe2;
                                Object obj5 = obj2;
                                i20 = i33;
                                unsafe5.putLong(obj5, j4, zzei.zzc(zzdsVar.zzb));
                                unsafe2 = unsafe5;
                                obj2 = obj5;
                                i25 |= i35;
                                iZzm = iZzm3;
                                i23 = i29;
                                i24 = i20;
                                i22 = -1;
                            }
                            break;
                        default:
                            i20 = i33;
                            obj = obj2;
                            unsafe = unsafe2;
                            i13 = i29;
                            i14 = i20;
                            i12 = -1;
                            i11 = i32 == true ? 1 : 0;
                            break;
                    }
                } else {
                    i14 = i33;
                    if (iZzu != 27) {
                        i15 = i28;
                        Unsafe unsafe6 = unsafe2;
                        if (iZzu <= 49) {
                            i16 = i25;
                            unsafe = unsafe6;
                            i12 = -1;
                            i18 = i26;
                            int iZzp = this.zzp(obj, bArr, i15, i10, i32 == true ? 1 : 0, i29, i30, i14, i31, iZzu, j4, zzdsVar);
                            i17 = i32 == true ? 1 : 0;
                            i19 = i29;
                            if (iZzp != i15) {
                                obj2 = obj;
                                iZzm = iZzp;
                                i24 = i14;
                                i23 = i19;
                                i26 = i18;
                                i22 = i12;
                                i25 = i16;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i21 = i10;
                            } else {
                                i28 = iZzp;
                                i13 = i19;
                                i11 = i17;
                            }
                        } else {
                            i16 = i25;
                            unsafe = unsafe6;
                            i12 = -1;
                            i17 = i32 == true ? 1 : 0;
                            i18 = i26;
                            i19 = i29;
                            if (iZzu == 50) {
                                if (i30 == 2) {
                                    int iZzm4 = zzm(obj, bArr, i15, i10, i14, j4, zzdsVar);
                                    if (iZzm4 != i15) {
                                        i14 = i14;
                                        this = this;
                                        obj2 = obj;
                                        bArr2 = bArr;
                                        zzdsVar = zzdsVar;
                                        iZzm = iZzm4;
                                        i24 = i14;
                                        i23 = i19;
                                        i26 = i18;
                                        i22 = -1;
                                        i25 = i16;
                                        unsafe2 = unsafe;
                                        i21 = i10;
                                    } else {
                                        i14 = i14;
                                        i28 = iZzm4;
                                    }
                                } else {
                                    i14 = i14;
                                    i28 = i15;
                                }
                                i13 = i19;
                                i11 = i17;
                            } else {
                                i13 = i19;
                                int iZzn = zzn(obj, bArr, i15, i10, i17 == true ? 1 : 0, i13, i30, i31, iZzu, j4, i14, zzdsVar);
                                obj = obj;
                                i11 = i17 == true ? 1 : 0;
                                if (iZzn != i15) {
                                    i14 = i14;
                                    i23 = i13;
                                    iZzm = iZzn;
                                    i24 = i14;
                                    obj2 = obj;
                                    i26 = i18;
                                    i22 = i12;
                                    i25 = i16;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i21 = i10;
                                } else {
                                    i14 = i14;
                                    i28 = iZzn;
                                }
                            }
                        }
                    } else if (i30 == 2) {
                        zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj2, j4);
                        if (!zzeyVarZzd.zzc()) {
                            int size = zzeyVarZzd.size();
                            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj2, j4, zzeyVarZzd);
                        }
                        int iZze = zzdt.zze(this.zzy(i14), i32 == true ? 1 : 0, bArr2, i28, i10, zzeyVarZzd, zzdsVar);
                        bArr2 = bArr;
                        zzdsVar = zzdsVar;
                        iZzm = iZze;
                        i24 = i14;
                        unsafe2 = unsafe2;
                        i23 = i29;
                        i22 = -1;
                        obj2 = obj;
                        i21 = i10;
                    } else {
                        i15 = i28;
                        i18 = i26;
                        i16 = i25;
                        unsafe = unsafe2;
                        i19 = i29;
                        i12 = -1;
                        i17 = i32 == true ? 1 : 0;
                        i28 = i15;
                        i13 = i19;
                        i11 = i17;
                    }
                    i26 = i18;
                    i25 = i16;
                }
            }
            int iZzi = zzdt.zzi(i11 == true ? 1 : 0, bArr, i28, i10, zzc(obj), zzdsVar);
            bArr2 = bArr;
            zzdsVar = zzdsVar;
            i23 = i13;
            i24 = i14;
            obj2 = obj;
            i22 = i12;
            unsafe2 = unsafe;
            i21 = i10;
            iZzm = iZzi;
            this = this;
        }
        Object obj6 = obj2;
        Unsafe unsafe7 = unsafe2;
        int i38 = i21;
        int i39 = i26;
        int i40 = i25;
        if (i39 != 1048575) {
            unsafe7.putInt(obj6, i39, i40);
        }
        if (iZzm == i38) {
            return iZzm;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i, int i10, int i11, int i12, int i13, int i14, long j4, int i15, long j10, zzds zzdsVar) throws IOException {
        int iZzl;
        Unsafe unsafe = zzb;
        zzey zzeyVarZzd = (zzey) unsafe.getObject(obj, j10);
        if (!zzeyVarZzd.zzc()) {
            int size = zzeyVarZzd.size();
            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j10, zzeyVarZzd);
        }
        zzey zzeyVar = zzeyVarZzd;
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    zzej zzejVar = (zzej) zzeyVar;
                    int iZzj = zzdt.zzj(bArr, i, zzdsVar);
                    int i16 = zzdsVar.zza + iZzj;
                    while (iZzj < i16) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj)));
                        iZzj += 8;
                    }
                    if (iZzj == i16) {
                        return iZzj;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVar;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i)));
                    int i17 = i + 8;
                    while (i17 < i10) {
                        int iZzj2 = zzdt.zzj(bArr, i17, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return i17;
                        }
                        zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj2)));
                        i17 = iZzj2 + 8;
                    }
                    return i17;
                }
                return i;
            case 19:
            case 36:
                if (i13 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVar;
                    int iZzj3 = zzdt.zzj(bArr, i, zzdsVar);
                    int i18 = zzdsVar.zza + iZzj3;
                    while (iZzj3 < i18) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i18) {
                        return iZzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVar;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i)));
                    int i19 = i + 4;
                    while (i19 < i10) {
                        int iZzj4 = zzdt.zzj(bArr, i19, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return i19;
                        }
                        zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj4)));
                        i19 = iZzj4 + 4;
                    }
                    return i19;
                }
                return i;
            case 20:
            case zzbbs.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i13 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVar;
                    int iZzj5 = zzdt.zzj(bArr, i, zzdsVar);
                    int i20 = zzdsVar.zza + iZzj5;
                    while (iZzj5 < i20) {
                        iZzj5 = zzdt.zzm(bArr, iZzj5, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (iZzj5 == i20) {
                        return iZzj5;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVar;
                    int iZzm = zzdt.zzm(bArr, i, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (iZzm < i10) {
                        int iZzj6 = zzdt.zzj(bArr, iZzm, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzdt.zzm(bArr, iZzj6, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return iZzm;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return zzdt.zzf(bArr, i, zzeyVar, zzdsVar);
                }
                if (i13 == 0) {
                    return zzdt.zzl(i11, bArr, i, i10, zzeyVar, zzdsVar);
                }
                return i;
            case 23:
            case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
            case 40:
            case 46:
                if (i13 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVar;
                    int iZzj7 = zzdt.zzj(bArr, i, zzdsVar);
                    int i21 = zzdsVar.zza + iZzj7;
                    while (iZzj7 < i21) {
                        zzflVar3.zze(zzdt.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i21) {
                        return iZzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVar;
                    zzflVar4.zze(zzdt.zzn(bArr, i));
                    int i22 = i + 8;
                    while (i22 < i10) {
                        int iZzj8 = zzdt.zzj(bArr, i22, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return i22;
                        }
                        zzflVar4.zze(zzdt.zzn(bArr, iZzj8));
                        i22 = iZzj8 + 8;
                    }
                    return i22;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    zzev zzevVar = (zzev) zzeyVar;
                    int iZzj9 = zzdt.zzj(bArr, i, zzdsVar);
                    int i23 = zzdsVar.zza + iZzj9;
                    while (iZzj9 < i23) {
                        zzevVar.zze(zzdt.zzb(bArr, iZzj9));
                        iZzj9 += 4;
                    }
                    if (iZzj9 == i23) {
                        return iZzj9;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVar;
                    zzevVar2.zze(zzdt.zzb(bArr, i));
                    int i24 = i + 4;
                    while (i24 < i10) {
                        int iZzj10 = zzdt.zzj(bArr, i24, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return i24;
                        }
                        zzevVar2.zze(zzdt.zzb(bArr, iZzj10));
                        i24 = iZzj10 + 4;
                    }
                    return i24;
                }
                return i;
            case 25:
            case 42:
                if (i13 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVar;
                    int iZzj11 = zzdt.zzj(bArr, i, zzdsVar);
                    int i25 = zzdsVar.zza + iZzj11;
                    while (iZzj11 < i25) {
                        iZzj11 = zzdt.zzm(bArr, iZzj11, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (iZzj11 == i25) {
                        return iZzj11;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVar;
                    int iZzm2 = zzdt.zzm(bArr, i, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (iZzm2 < i10) {
                        int iZzj12 = zzdt.zzj(bArr, iZzm2, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzdt.zzm(bArr, iZzj12, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return i;
            case 26:
                if (i13 == 2) {
                    if ((j4 & 536870912) == 0) {
                        int iZzj13 = zzdt.zzj(bArr, i, zzdsVar);
                        int i26 = zzdsVar.zza;
                        if (i26 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i26 == 0) {
                            zzeyVar.add("");
                        } else {
                            zzeyVar.add(new String(bArr, iZzj13, i26, zzez.zzb));
                            iZzj13 += i26;
                        }
                        while (iZzj13 < i10) {
                            int iZzj14 = zzdt.zzj(bArr, iZzj13, zzdsVar);
                            if (i11 != zzdsVar.zza) {
                                return iZzj13;
                            }
                            iZzj13 = zzdt.zzj(bArr, iZzj14, zzdsVar);
                            int i27 = zzdsVar.zza;
                            if (i27 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i27 == 0) {
                                zzeyVar.add("");
                            } else {
                                zzeyVar.add(new String(bArr, iZzj13, i27, zzez.zzb));
                                iZzj13 += i27;
                            }
                        }
                        return iZzj13;
                    }
                    int iZzj15 = zzdt.zzj(bArr, i, zzdsVar);
                    int i28 = zzdsVar.zza;
                    if (i28 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i28 == 0) {
                        zzeyVar.add("");
                    } else {
                        int i29 = iZzj15 + i28;
                        if (!zzhm.zzd(bArr, iZzj15, i29)) {
                            throw zzfa.zzb();
                        }
                        zzeyVar.add(new String(bArr, iZzj15, i28, zzez.zzb));
                        iZzj15 = i29;
                    }
                    while (iZzj15 < i10) {
                        int iZzj16 = zzdt.zzj(bArr, iZzj15, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzdt.zzj(bArr, iZzj16, zzdsVar);
                        int i30 = zzdsVar.zza;
                        if (i30 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i30 == 0) {
                            zzeyVar.add("");
                        } else {
                            int i31 = iZzj15 + i30;
                            if (!zzhm.zzd(bArr, iZzj15, i31)) {
                                throw zzfa.zzb();
                            }
                            zzeyVar.add(new String(bArr, iZzj15, i30, zzez.zzb));
                            iZzj15 = i31;
                        }
                    }
                    return iZzj15;
                }
                return i;
            case 27:
                if (i13 == 2) {
                    return zzdt.zze(zzy(i14), i11, bArr, i, i10, zzeyVar, zzdsVar);
                }
                return i;
            case 28:
                if (i13 == 2) {
                    int iZzj17 = zzdt.zzj(bArr, i, zzdsVar);
                    int i32 = zzdsVar.zza;
                    if (i32 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i32 > bArr.length - iZzj17) {
                        throw zzfa.zzf();
                    }
                    if (i32 == 0) {
                        zzeyVar.add(zzee.zzb);
                    } else {
                        zzeyVar.add(zzee.zzk(bArr, iZzj17, i32));
                        iZzj17 += i32;
                    }
                    while (iZzj17 < i10) {
                        int iZzj18 = zzdt.zzj(bArr, iZzj17, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzdt.zzj(bArr, iZzj18, zzdsVar);
                        int i33 = zzdsVar.zza;
                        if (i33 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i33 > bArr.length - iZzj17) {
                            throw zzfa.zzf();
                        }
                        if (i33 == 0) {
                            zzeyVar.add(zzee.zzb);
                        } else {
                            zzeyVar.add(zzee.zzk(bArr, iZzj17, i33));
                            iZzj17 += i33;
                        }
                    }
                    return iZzj17;
                }
                return i;
            case 30:
            case 44:
                if (i13 != 2) {
                    if (i13 == 0) {
                        iZzl = zzdt.zzl(i11, bArr, i, i10, zzeyVar, zzdsVar);
                    }
                    return i;
                }
                iZzl = zzdt.zzf(bArr, i, zzeyVar, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object objZzd = zzgj.zzd(i12, zzeyVar, zzx(i14), zzgzVar, this.zzm);
                if (objZzd == null) {
                    return iZzl;
                }
                zzeuVar.zzc = (zzgz) objZzd;
                return iZzl;
            case 33:
            case 47:
                if (i13 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVar;
                    int iZzj19 = zzdt.zzj(bArr, i, zzdsVar);
                    int i34 = zzdsVar.zza + iZzj19;
                    while (iZzj19 < i34) {
                        iZzj19 = zzdt.zzj(bArr, iZzj19, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (iZzj19 == i34) {
                        return iZzj19;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVar;
                    int iZzj20 = zzdt.zzj(bArr, i, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (iZzj20 < i10) {
                        int iZzj21 = zzdt.zzj(bArr, iZzj20, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return iZzj20;
                        }
                        iZzj20 = zzdt.zzj(bArr, iZzj21, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return iZzj20;
                }
                return i;
            case 34:
            case 48:
                if (i13 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVar;
                    int iZzj22 = zzdt.zzj(bArr, i, zzdsVar);
                    int i35 = zzdsVar.zza + iZzj22;
                    while (iZzj22 < i35) {
                        iZzj22 = zzdt.zzm(bArr, iZzj22, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (iZzj22 == i35) {
                        return iZzj22;
                    }
                    throw zzfa.zzf();
                }
                if (i13 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVar;
                    int iZzm3 = zzdt.zzm(bArr, i, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (iZzm3 < i10) {
                        int iZzj23 = zzdt.zzj(bArr, iZzm3, zzdsVar);
                        if (i11 != zzdsVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzdt.zzm(bArr, iZzj23, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return iZzm3;
                }
                return i;
            default:
                if (i13 == 3) {
                    zzgh zzghVarZzy = zzy(i14);
                    int i36 = (i11 & (-8)) | 4;
                    int iZzc = zzdt.zzc(zzghVarZzy, bArr, i, i10, i36, zzdsVar);
                    zzgh zzghVar = zzghVarZzy;
                    zzds zzdsVar2 = zzdsVar;
                    zzeyVar.add(zzdsVar2.zzc);
                    while (iZzc < i10) {
                        int iZzj24 = zzdt.zzj(bArr, iZzc, zzdsVar2);
                        if (i11 != zzdsVar2.zza) {
                            return iZzc;
                        }
                        zzgh zzghVar2 = zzghVar;
                        zzds zzdsVar3 = zzdsVar2;
                        iZzc = zzdt.zzc(zzghVar2, bArr, iZzj24, i10, i36, zzdsVar3);
                        zzeyVar.add(zzdsVar3.zzc);
                        zzghVar = zzghVar2;
                        zzdsVar2 = zzdsVar3;
                    }
                    return iZzc;
                }
                return i;
        }
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, 0);
    }

    private final int zzr(int i, int i10) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, i10);
    }

    private final int zzs(int i) {
        return this.zzc[i + 2];
    }

    private final int zzt(int i, int i10) {
        int length = (this.zzc.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = this.zzc[i12];
            if (i == i13) {
                return i12;
            }
            if (i < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzv(int i) {
        return this.zzc[i + 1];
    }

    private static long zzw(Object obj, long j4) {
        return ((Long) zzhi.zzf(obj, j4)).longValue();
    }

    private final zzex zzx(int i) {
        int i10 = i / 3;
        return (zzex) this.zzd[i10 + i10 + 1];
    }

    private final zzgh zzy(int i) {
        int i10 = i / 3;
        int i11 = i10 + i10;
        zzgh zzghVar = (zzgh) this.zzd[i11];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzghVarZzb;
        return zzghVarZzb;
    }

    private final Object zzz(int i) {
        int i10 = i / 3;
        return this.zzd[i10 + i10];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i;
        int iZzc;
        int i10;
        int iZzc2;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iZzv = zzv(i12);
            int i13 = this.zzc[i12];
            long j4 = 1048575 & iZzv;
            int iHashCode = 37;
            switch (zzu(iZzv)) {
                case 0:
                    i = i11 * 53;
                    iZzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j4)));
                    i11 = iZzc + i;
                    break;
                case 1:
                    i = i11 * 53;
                    iZzc = Float.floatToIntBits(zzhi.zzb(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 2:
                    i = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 3:
                    i = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iZzc2 = zzhi.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 5:
                    i = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iZzc2 = zzhi.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 7:
                    i = i11 * 53;
                    iZzc = zzez.zza(zzhi.zzt(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 8:
                    i = i11 * 53;
                    iZzc = ((String) zzhi.zzf(obj, j4)).hashCode();
                    i11 = iZzc + i;
                    break;
                case 9:
                    Object objZzf = zzhi.zzf(obj, j4);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i = i11 * 53;
                    iZzc = zzhi.zzf(obj, j4).hashCode();
                    i11 = iZzc + i;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iZzc2 = zzhi.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iZzc2 = zzhi.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iZzc2 = zzhi.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 14:
                    i = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iZzc2 = zzhi.zzc(obj, j4);
                    i11 = i10 + iZzc2;
                    break;
                case 16:
                    i = i11 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i11 = iZzc + i;
                    break;
                case 17:
                    Object objZzf2 = zzhi.zzf(obj, j4);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbs.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i11 * 53;
                    iZzc = zzhi.zzf(obj, j4).hashCode();
                    i11 = iZzc + i;
                    break;
                case 50:
                    i = i11 * 53;
                    iZzc = zzhi.zzf(obj, j4).hashCode();
                    i11 = iZzc + i;
                    break;
                case 51:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j4)).doubleValue()));
                        i11 = iZzc + i;
                    }
                    break;
                case 52:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j4)).floatValue());
                        i11 = iZzc + i;
                    }
                    break;
                case 53:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j4));
                        i11 = iZzc + i;
                    }
                    break;
                case 54:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j4));
                        i11 = iZzc + i;
                    }
                    break;
                case 55:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzl(obj, j4);
                        i11 = i10 + iZzc2;
                    }
                    break;
                case 56:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j4));
                        i11 = iZzc + i;
                    }
                    break;
                case 57:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzl(obj, j4);
                        i11 = i10 + iZzc2;
                    }
                    break;
                case 58:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zza(((Boolean) zzhi.zzf(obj, j4)).booleanValue());
                        i11 = iZzc + i;
                    }
                    break;
                case 59:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = ((String) zzhi.zzf(obj, j4)).hashCode();
                        i11 = iZzc + i;
                    }
                    break;
                case 60:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzhi.zzf(obj, j4).hashCode();
                        i11 = iZzc + i;
                    }
                    break;
                case 61:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzhi.zzf(obj, j4).hashCode();
                        i11 = iZzc + i;
                    }
                    break;
                case 62:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzl(obj, j4);
                        i11 = i10 + iZzc2;
                    }
                    break;
                case 63:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzl(obj, j4);
                        i11 = i10 + iZzc2;
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzl(obj, j4);
                        i11 = i10 + iZzc2;
                    }
                    break;
                case 65:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j4));
                        i11 = iZzc + i;
                    }
                    break;
                case 66:
                    if (zzJ(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc2 = zzl(obj, j4);
                        i11 = i10 + iZzc2;
                    }
                    break;
                case 67:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzez.zzc(zzw(obj, j4));
                        i11 = iZzc + i;
                    }
                    break;
                case 68:
                    if (zzJ(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzhi.zzf(obj, j4).hashCode();
                        i11 = iZzc + i;
                    }
                    break;
            }
        }
        return this.zzm.zza(obj).hashCode() + (i11 * 53);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12421. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzb(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.auth.zzds r33) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzds):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i;
        int i10 = this.zzj;
        while (true) {
            i = this.zzk;
            if (i10 >= i) {
                break;
            }
            long jZzv = zzv(this.zzi[i10]) & 1048575;
            Object objZzf = zzhi.zzf(obj, jZzv);
            if (objZzf != null) {
                ((zzfq) objZzf).zzc();
                zzhi.zzp(obj, jZzv, objZzf);
            }
            i10++;
        }
        int length = this.zzi.length;
        while (i < length) {
            this.zzl.zza(obj, this.zzi[i]);
            i++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzv = zzv(i);
            long j4 = 1048575 & iZzv;
            int i10 = this.zzc[i];
            switch (zzu(iZzv)) {
                case 0:
                    if (zzG(obj2, i)) {
                        zzhi.zzl(obj, j4, zzhi.zza(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 1:
                    if (zzG(obj2, i)) {
                        zzhi.zzm(obj, j4, zzhi.zzb(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 2:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 3:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 4:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 5:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 6:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 7:
                    if (zzG(obj2, i)) {
                        zzhi.zzk(obj, j4, zzhi.zzt(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 8:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzG(obj2, i)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 11:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 12:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 13:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 14:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 15:
                    if (zzG(obj2, i)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 16:
                    if (zzG(obj2, i)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbs.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j4);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j4);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzJ(obj2, i10, i)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzE(obj, i10, i);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (zzJ(obj2, i10, i)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzE(obj, i10, i);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i, int i10, zzds zzdsVar) throws IOException {
        if (this.zzh) {
            zzo(obj, bArr, i, i10, zzdsVar);
        } else {
            zzb(obj, bArr, i, i10, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzh;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzv = zzv(i);
            long j4 = iZzv & 1048575;
            switch (zzu(iZzv)) {
                case 0:
                    if (!zzF(obj, obj2, i) || Double.doubleToLongBits(zzhi.zza(obj, j4)) != Double.doubleToLongBits(zzhi.zza(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzF(obj, obj2, i) || Float.floatToIntBits(zzhi.zzb(obj, j4)) != Float.floatToIntBits(zzhi.zzb(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j4) != zzhi.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j4) != zzhi.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j4) != zzhi.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j4) != zzhi.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j4) != zzhi.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzF(obj, obj2, i) || zzhi.zzt(obj, j4) != zzhi.zzt(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j4) != zzhi.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j4) != zzhi.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j4) != zzhi.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j4) != zzhi.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzF(obj, obj2, i) || zzhi.zzc(obj, j4) != zzhi.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzF(obj, obj2, i) || zzhi.zzd(obj, j4) != zzhi.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzF(obj, obj2, i) || !zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbs.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4));
                    break;
                case 50:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzs = zzs(i) & 1048575;
                    if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzi(Object obj) {
        int i;
        int i10;
        List list;
        zzgh zzghVarZzy;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.zzj) {
            int i15 = this.zzi[i13];
            int i16 = this.zzc[i15];
            int iZzv = zzv(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i14 = zzb.getInt(obj, i18);
                }
                i10 = i14;
                i = i18;
            } else {
                i = i12;
                i10 = i14;
            }
            Object obj2 = obj;
            if ((268435456 & iZzv) != 0 && !zzH(obj2, i15, i, i10, i19)) {
                return false;
            }
            int iZzu = zzu(iZzv);
            if (iZzu == 9 || iZzu == 17) {
                if (zzH(obj2, i15, i, i10, i19) && !zzI(obj2, iZzv, zzy(i15))) {
                    return false;
                }
            } else if (iZzu == 27) {
                list = (List) zzhi.zzf(obj2, iZzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzghVarZzy = zzy(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!zzghVarZzy.zzi(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzu == 60 || iZzu == 68) {
                if (zzJ(obj2, i16, i15) && !zzI(obj2, iZzv, zzy(i15))) {
                    return false;
                }
            } else if (iZzu == 49) {
                list = (List) zzhi.zzf(obj2, iZzv & 1048575);
                if (list.isEmpty()) {
                    zzghVarZzy = zzy(i15);
                    while (i11 < list.size()) {
                        if (!zzghVarZzy.zzi(list.get(i11))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzu == 50 && !((zzfq) zzhi.zzf(obj2, iZzv & 1048575)).isEmpty()) {
                throw null;
            }
            i13++;
            obj = obj2;
            i12 = i;
            i14 = i10;
        }
        return true;
    }
}
