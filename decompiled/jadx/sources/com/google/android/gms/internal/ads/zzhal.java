package com.google.android.gms.internal.ads;

import androidx.webkit.TracingConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhal<T> implements zzhbb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhbu.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhai zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhbn zzm;
    private final zzgyi zzn;

    private zzhal(int[] iArr, Object[] objArr, int i, int i10, zzhai zzhaiVar, boolean z4, int[] iArr2, int i11, int i12, zzhao zzhaoVar, zzgzv zzgzvVar, zzhbn zzhbnVar, zzgyi zzgyiVar, zzhad zzhadVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i10;
        this.zzi = zzhaiVar instanceof zzgyx;
        boolean z10 = false;
        if (zzgyiVar != null && (zzhaiVar instanceof zzgyt)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzj = iArr2;
        this.zzk = i11;
        this.zzl = i12;
        this.zzm = zzhbnVar;
        this.zzn = zzgyiVar;
        this.zzg = zzhaiVar;
    }

    private final Object zzA(Object obj, int i) {
        zzhbb zzhbbVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzhbbVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzhbbVarZzx.zze();
        if (object != null) {
            zzhbbVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i10) {
        zzhbb zzhbbVarZzx = zzx(i10);
        if (!zzR(obj, i, i10)) {
            return zzhbbVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i10) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzhbbVarZzx.zze();
        if (object != null) {
            zzhbbVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = iZzu;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzhbb zzhbbVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzhbbVarZzx.zze();
                    zzhbbVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzQ(object2)) {
                Object objZze2 = zzhbbVarZzx.zze();
                zzhbbVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzhbbVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i10 = this.zzc[i];
        if (zzR(obj2, i10, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = iZzu;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzhbb zzhbbVarZzx = zzx(i);
            if (!zzR(obj, i10, i)) {
                if (zzQ(object)) {
                    Object objZze = zzhbbVarZzx.zze();
                    zzhbbVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzI(obj, i10, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzQ(object2)) {
                Object objZze2 = zzhbbVarZzx.zze();
                zzhbbVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzhbbVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzhav zzhavVar) throws IOException {
        long j4 = i & 1048575;
        if (zzM(i)) {
            zzhbu.zzv(obj, j4, zzhavVar.zzs());
        } else if (this.zzi) {
            zzhbu.zzv(obj, j4, zzhavVar.zzr());
        } else {
            zzhbu.zzv(obj, j4, zzhavVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j4 = 1048575 & iZzr;
        if (j4 == 1048575) {
            return;
        }
        zzhbu.zzt(obj, j4, (1 << (iZzr >>> 20)) | zzhbu.zzd(obj, j4));
    }

    private final void zzI(Object obj, int i, int i10) {
        zzhbu.zzt(obj, zzr(i10) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzI(obj, i, i10);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j4 = iZzr & 1048575;
        if (j4 != 1048575) {
            return (zzhbu.zzd(obj, j4) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j10 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhbu.zzb(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhbu.zzc(obj, j10)) != 0;
            case 2:
                return zzhbu.zzf(obj, j10) != 0;
            case 3:
                return zzhbu.zzf(obj, j10) != 0;
            case 4:
                return zzhbu.zzd(obj, j10) != 0;
            case 5:
                return zzhbu.zzf(obj, j10) != 0;
            case 6:
                return zzhbu.zzd(obj, j10) != 0;
            case 7:
                return zzhbu.zzz(obj, j10);
            case 8:
                Object objZzh = zzhbu.zzh(obj, j10);
                if (objZzh instanceof String) {
                    return !((String) objZzh).isEmpty();
                }
                if (objZzh instanceof zzgxp) {
                    return !zzgxp.zzb.equals(objZzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhbu.zzh(obj, j10) != null;
            case 10:
                return !zzgxp.zzb.equals(zzhbu.zzh(obj, j10));
            case 11:
                return zzhbu.zzd(obj, j10) != 0;
            case 12:
                return zzhbu.zzd(obj, j10) != 0;
            case 13:
                return zzhbu.zzd(obj, j10) != 0;
            case 14:
                return zzhbu.zzf(obj, j10) != 0;
            case 15:
                return zzhbu.zzd(obj, j10) != 0;
            case 16:
                return zzhbu.zzf(obj, j10) != 0;
            case 17:
                return zzhbu.zzh(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return zzN(obj, i);
        }
        return (i11 & i12) != 0;
    }

    private static boolean zzP(Object obj, int i, zzhbb zzhbbVar) {
        return zzhbbVar.zzl(zzhbu.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgyx) {
            return ((zzgyx) obj).zzcf();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i10) {
        return zzhbu.zzd(obj, (long) (zzr(i10) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j4) {
        return ((Boolean) zzhbu.zzh(obj, j4)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzhcc zzhccVar) throws IOException {
        if (obj instanceof String) {
            zzhccVar.zzG(i, (String) obj);
        } else {
            zzhccVar.zzd(i, (zzgxp) obj);
        }
    }

    public static zzhbo zzd(Object obj) {
        zzgyx zzgyxVar = (zzgyx) obj;
        zzhbo zzhboVar = zzgyxVar.zzt;
        if (zzhboVar != zzhbo.zzc()) {
            return zzhboVar;
        }
        zzhbo zzhboVarZzf = zzhbo.zzf();
        zzgyxVar.zzt = zzhboVarZzf;
        return zzhboVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:193:0x03e2  */
    public static zzhal zzm(Class cls, zzhaf zzhafVar, zzhao zzhaoVar, zzgzv zzgzvVar, zzhbn zzhbnVar, zzgyi zzgyiVar, zzhad zzhadVar) {
        int i;
        int iCharAt;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        zzhau zzhauVar;
        int i25;
        Object[] objArr;
        int i26;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        char c10;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Field fieldZzC;
        char cCharAt9;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Field fieldZzC2;
        Field fieldZzC3;
        int i38;
        char cCharAt10;
        int i39;
        int i40;
        char cCharAt11;
        int i41;
        char cCharAt12;
        int i42;
        char cCharAt13;
        if (!(zzhafVar instanceof zzhau)) {
            throw null;
        }
        zzhau zzhauVar2 = (zzhau) zzhafVar;
        String strZzd = zzhauVar2.zzd();
        int length = strZzd.length();
        char c11 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i = i43 + 1;
                if (strZzd.charAt(i43) < 55296) {
                    break;
                }
                i43 = i;
            }
        } else {
            i = 1;
        }
        int i44 = i + 1;
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i45 = iCharAt2 & 8191;
            int i46 = 13;
            while (true) {
                i42 = i44 + 1;
                cCharAt13 = strZzd.charAt(i44);
                if (cCharAt13 < 55296) {
                    break;
                }
                i45 |= (cCharAt13 & 8191) << i46;
                i46 += 13;
                i44 = i42;
            }
            iCharAt2 = i45 | (cCharAt13 << i46);
            i44 = i42;
        }
        if (iCharAt2 == 0) {
            i11 = 0;
            i14 = 0;
            iCharAt = 0;
            i10 = 0;
            i12 = 0;
            i13 = 0;
            iArr = zza;
            i15 = 0;
        } else {
            int i47 = i44 + 1;
            int iCharAt3 = strZzd.charAt(i44);
            if (iCharAt3 >= 55296) {
                int i48 = iCharAt3 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    cCharAt8 = strZzd.charAt(i47);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                iCharAt3 = i48 | (cCharAt8 << i49);
                i47 = i23;
            }
            int i50 = i47 + 1;
            int iCharAt4 = strZzd.charAt(i47);
            if (iCharAt4 >= 55296) {
                int i51 = iCharAt4 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    cCharAt7 = strZzd.charAt(i50);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                iCharAt4 = i51 | (cCharAt7 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int iCharAt5 = strZzd.charAt(i50);
            if (iCharAt5 >= 55296) {
                int i54 = iCharAt5 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    cCharAt6 = strZzd.charAt(i53);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                iCharAt5 = i54 | (cCharAt6 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            int iCharAt6 = strZzd.charAt(i53);
            if (iCharAt6 >= 55296) {
                int i57 = iCharAt6 & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    cCharAt5 = strZzd.charAt(i56);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                iCharAt6 = i57 | (cCharAt5 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            iCharAt = strZzd.charAt(i56);
            if (iCharAt >= 55296) {
                int i60 = iCharAt & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    cCharAt4 = strZzd.charAt(i59);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                iCharAt = i60 | (cCharAt4 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            int iCharAt7 = strZzd.charAt(i59);
            if (iCharAt7 >= 55296) {
                int i63 = iCharAt7 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    cCharAt3 = strZzd.charAt(i62);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                iCharAt7 = i63 | (cCharAt3 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            int iCharAt8 = strZzd.charAt(i62);
            if (iCharAt8 >= 55296) {
                int i66 = iCharAt8 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    cCharAt2 = strZzd.charAt(i65);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt2 & 8191) << i67;
                    i67 += 13;
                    i65 = i17;
                }
                iCharAt8 = i66 | (cCharAt2 << i67);
                i65 = i17;
            }
            int i68 = i65 + 1;
            int iCharAt9 = strZzd.charAt(i65);
            if (iCharAt9 >= 55296) {
                int i69 = iCharAt9 & 8191;
                int i70 = 13;
                while (true) {
                    i16 = i68 + 1;
                    cCharAt = strZzd.charAt(i68);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i69 |= (cCharAt & 8191) << i70;
                    i70 += 13;
                    i68 = i16;
                }
                iCharAt9 = i69 | (cCharAt << i70);
                i68 = i16;
            }
            int i71 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i72 = iCharAt7;
            i10 = iCharAt5;
            i11 = i72;
            i12 = iCharAt6;
            i13 = iCharAt9;
            i14 = i71;
            iArr = iArr2;
            i15 = iCharAt3;
            i44 = i68;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzhauVar2.zze();
        Class<?> cls2 = zzhauVar2.zza().getClass();
        int i73 = i13 + i11;
        int i74 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[i74];
        int i75 = i13;
        int i76 = i73;
        int i77 = 0;
        int i78 = 0;
        while (i44 < length) {
            int i79 = i44 + 1;
            int iCharAt10 = strZzd.charAt(i44);
            if (iCharAt10 >= c11) {
                int i80 = iCharAt10 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i41 = i81 + 1;
                    cCharAt12 = strZzd.charAt(i81);
                    if (cCharAt12 < c11) {
                        break;
                    }
                    i80 |= (cCharAt12 & 8191) << i82;
                    i82 += 13;
                    i81 = i41;
                }
                iCharAt10 = i80 | (cCharAt12 << i82);
                i24 = i41;
            } else {
                i24 = i79;
            }
            int i83 = i24 + 1;
            int iCharAt11 = strZzd.charAt(i24);
            if (iCharAt11 >= c11) {
                int i84 = iCharAt11 & 8191;
                int i85 = i83;
                int i86 = 13;
                while (true) {
                    i40 = i85 + 1;
                    cCharAt11 = strZzd.charAt(i85);
                    zzhauVar = zzhauVar2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i84 |= (cCharAt11 & 8191) << i86;
                    i86 += 13;
                    i85 = i40;
                    zzhauVar2 = zzhauVar;
                }
                iCharAt11 = i84 | (cCharAt11 << i86);
                i25 = i40;
            } else {
                zzhauVar = zzhauVar2;
                i25 = i83;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i78] = i77;
                i78++;
            }
            int i87 = iCharAt11 & 255;
            int i88 = length;
            int i89 = iCharAt11 & 2048;
            if (i87 >= 51) {
                int i90 = i25 + 1;
                int iCharAt12 = strZzd.charAt(i25);
                if (iCharAt12 >= 55296) {
                    int i91 = iCharAt12 & 8191;
                    int i92 = i90;
                    int i93 = 13;
                    while (true) {
                        i38 = i92 + 1;
                        cCharAt10 = strZzd.charAt(i92);
                        i39 = i91;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i91 = i39 | ((cCharAt10 & 8191) << i93);
                        i93 += 13;
                        i92 = i38;
                    }
                    iCharAt12 = i39 | (cCharAt10 << i93);
                    i36 = i38;
                } else {
                    i36 = i90;
                }
                int i94 = iCharAt12;
                int i95 = i87 - 51;
                int i96 = i36;
                if (i95 == 9 || i95 == 17) {
                    objArr2[q1.a.v(i77, 3, 1)] = objArrZze[i14];
                    i37 = i89;
                    i14++;
                } else if (i95 != 12) {
                    i37 = i89;
                } else if (zzhauVar.zzc() == 1 || i89 != 0) {
                    objArr2[q1.a.v(i77, 3, 1)] = objArrZze[i14];
                    i14++;
                    i37 = i89;
                } else {
                    i37 = 0;
                }
                int i97 = i94 + i94;
                Object obj = objArrZze[i97];
                int i98 = i37;
                if (obj instanceof Field) {
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i97] = fieldZzC2;
                }
                Object[] objArr3 = objArr2;
                int i99 = i14;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC2);
                int i100 = i97 + 1;
                Object obj2 = objArrZze[i100];
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i100] = fieldZzC3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzC3);
                i15 = i15;
                i31 = i99;
                i77 = i77;
                c10 = 55296;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i30 = iObjectFieldOffset3;
                i89 = i98;
                i26 = iCharAt10;
                i44 = i96;
                objArr = objArr3;
                i29 = 0;
            } else {
                Object[] objArr4 = objArr2;
                int i101 = i14 + 1;
                objArr = objArr4;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i14]);
                i26 = iCharAt10;
                if (i87 == 9 || i87 == 17) {
                    i15 = i15;
                    objArr[q1.a.v(i77, 3, 1)] = fieldZzC4.getType();
                } else {
                    if (i87 != 27) {
                        if (i87 == 49) {
                            i35 = i14 + 2;
                            i33 = 3;
                            i34 = 1;
                        } else if (i87 == 12 || i87 == 30 || i87 == 44) {
                            i15 = i15;
                            if (zzhauVar.zzc() == 1 || i89 != 0) {
                                i35 = i14 + 2;
                                objArr[q1.a.v(i77, 3, 1)] = objArrZze[i101];
                                i101 = i35;
                            } else {
                                i77 = i77;
                                i89 = 0;
                            }
                        } else if (i87 == 50) {
                            int i102 = i14 + 2;
                            i75++;
                            iArr[i75] = i77;
                            int i103 = i77 / 3;
                            int i104 = i103 + i103;
                            objArr[i104] = objArrZze[i101];
                            if (i89 != 0) {
                                i101 = i14 + 3;
                                objArr[i104 + 1] = objArrZze[i102];
                            } else {
                                i101 = i102;
                                i89 = 0;
                            }
                            i15 = i15;
                        } else {
                            i15 = i15;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i87 > 17) {
                            c10 = 55296;
                            i27 = i25;
                            i28 = 0;
                        } else {
                            int i105 = i25 + 1;
                            int iCharAt13 = strZzd.charAt(i25);
                            if (iCharAt13 >= 55296) {
                                int i106 = iCharAt13 & 8191;
                                int i107 = 13;
                                while (true) {
                                    i32 = i105 + 1;
                                    cCharAt9 = strZzd.charAt(i105);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i106 |= (cCharAt9 & 8191) << i107;
                                    i107 += 13;
                                    i105 = i32;
                                }
                                iCharAt13 = i106 | (cCharAt9 << i107);
                            } else {
                                i32 = i105;
                            }
                            int i108 = (iCharAt13 / 32) + i15 + i15;
                            Object obj3 = objArrZze[i108];
                            if (obj3 instanceof Field) {
                                fieldZzC = (Field) obj3;
                            } else {
                                fieldZzC = zzC(cls2, (String) obj3);
                                objArrZze[i108] = fieldZzC;
                            }
                            i28 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC);
                            i27 = i32;
                            c10 = 55296;
                        }
                        if (i87 >= 18 || i87 > 49) {
                            i29 = i28;
                            i30 = iObjectFieldOffset;
                            int i109 = i27;
                            i31 = i101;
                            i44 = i109;
                        } else {
                            int i110 = i76 + 1;
                            iArr[i76] = iObjectFieldOffset;
                            i29 = i28;
                            i30 = iObjectFieldOffset;
                            int i111 = i27;
                            i31 = i101;
                            i44 = i111;
                            i76 = i110;
                        }
                    } else {
                        i33 = 3;
                        i34 = 1;
                        i35 = i14 + 2;
                    }
                    objArr[q1.a.v(i77, i33, i34)] = objArrZze[i101];
                    i101 = i35;
                }
                i77 = i77;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    c10 = 55296;
                    i27 = i25;
                    i28 = 0;
                } else {
                    c10 = 55296;
                    i27 = i25;
                    i28 = 0;
                }
                if (i87 >= 18) {
                    i29 = i28;
                    i30 = iObjectFieldOffset;
                    int i1010 = i27;
                    i31 = i101;
                    i44 = i1010;
                } else {
                    i29 = i28;
                    i30 = iObjectFieldOffset;
                    int i1011 = i27;
                    i31 = i101;
                    i44 = i1011;
                }
            }
            int i112 = i77 + 1;
            iArr3[i77] = i26;
            int i113 = i77 + 2;
            iArr3[i112] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i89 != 0 ? Integer.MIN_VALUE : 0) | (i87 << 20) | i30;
            iArr3[i113] = (i29 << 20) | iObjectFieldOffset2;
            i77 += 3;
            i14 = i31;
            length = i88;
            c11 = c10;
            zzhauVar2 = zzhauVar;
            i15 = i15;
            objArr2 = objArr;
        }
        return new zzhal(iArr3, objArr2, i10, i12, zzhauVar2.zza(), false, iArr, i13, i73, zzhaoVar, zzgzvVar, zzhbnVar, zzgyiVar, zzhadVar);
    }

    private static double zzn(Object obj, long j4) {
        return ((Double) zzhbu.zzh(obj, j4)).doubleValue();
    }

    private static float zzo(Object obj, long j4) {
        return ((Float) zzhbu.zzh(obj, j4)).floatValue();
    }

    private static int zzp(Object obj, long j4) {
        return ((Integer) zzhbu.zzh(obj, j4)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i10) {
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j4) {
        return ((Long) zzhbu.zzh(obj, j4)).longValue();
    }

    private final zzgzd zzw(int i) {
        int i10 = i / 3;
        return (zzgzd) this.zzd[i10 + i10 + 1];
    }

    private final zzhbb zzx(int i) {
        Object[] objArr = this.zzd;
        int i10 = i / 3;
        int i11 = i10 + i10;
        zzhbb zzhbbVar = (zzhbb) objArr[i11];
        if (zzhbbVar != null) {
            return zzhbbVar;
        }
        zzhbb zzhbbVarZzb = zzhas.zza().zzb((Class) objArr[i11 + 1]);
        this.zzd[i11] = zzhbbVarZzb;
        return zzhbbVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzhbn zzhbnVar, Object obj3) {
        int i10 = this.zzc[i];
        Object objZzh = zzhbu.zzh(obj, zzu(i) & 1048575);
        if (objZzh == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i10 = i / 3;
        return this.zzd[i10 + i10];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:152:0x03df  */
    /* JADX WARN: Code duplicated, block: B:206:0x0522  */
    /* JADX WARN: Code duplicated, block: B:90:0x0211  */
    @Override // com.google.android.gms.internal.ads.zzhbb
    public final int zza(Object obj) {
        int i;
        int iZzD;
        int iZzE;
        int iZzD2;
        int iZzd;
        int iZzD3;
        int iZzh;
        int iZzD4;
        int size;
        int iZzl;
        int iZzD5;
        int iZzd2;
        boolean z4;
        int iZzb;
        int iZzC;
        int iZzD6;
        int iZzD7;
        int size2;
        int iZzk;
        int iZzD8;
        int size3;
        int iZzi;
        int iZzD9;
        int i10;
        int iZze;
        int iZzD10;
        int iZzD11;
        int iZzD12;
        int iZzE2;
        zzhal<T> zzhalVar = this;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int iT = 0;
        while (i13 < zzhalVar.zzc.length) {
            int iZzu = zzhalVar.zzu(i13);
            int iZzt = zzt(iZzu);
            int[] iArr = zzhalVar.zzc;
            int i15 = iArr[i13];
            int i16 = iArr[i13 + 2];
            int i17 = i16 & i11;
            if (iZzt <= 17) {
                if (i17 != i12) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i = 1 << (i16 >>> 20);
            } else {
                i = 0;
            }
            int i18 = iZzu & i11;
            if (iZzt >= zzgyn.zzJ.zza()) {
                zzgyn.zzW.zza();
            }
            long j4 = i18;
            switch (iZzt) {
                case 0:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        iT = q1.a.t(i15 << 3, 8, iT);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 1:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        iT = q1.a.t(i15 << 3, 4, iT);
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 2:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        long j10 = unsafe.getLong(obj, j4);
                        iZzD = zzgyc.zzD(i15 << 3);
                        iZzE = zzgyc.zzE(j10);
                        iT += iZzE + iZzD;
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 3:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        long j11 = unsafe.getLong(obj, j4);
                        iZzD = zzgyc.zzD(i15 << 3);
                        iZzE = zzgyc.zzE(j11);
                        iT += iZzE + iZzD;
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 4:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        long j12 = unsafe.getInt(obj, j4);
                        iZzD = zzgyc.zzD(i15 << 3);
                        iZzE = zzgyc.zzE(j12);
                        iT += iZzE + iZzD;
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 5:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        iT = q1.a.t(i15 << 3, 8, iT);
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 6:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        iT = q1.a.t(i15 << 3, 4, iT);
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 7:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        iT = q1.a.t(i15 << 3, 1, iT);
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 8:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof zzgxp) {
                            iZzD2 = zzgyc.zzD(i19);
                            iZzd = ((zzgxp) object).zzd();
                            iZzD3 = zzgyc.zzD(iZzd);
                            iT += iZzD3 + iZzd + iZzD2;
                        } else {
                            iZzD = zzgyc.zzD(i19);
                            iZzE = zzgyc.zzC((String) object);
                            iT += iZzE + iZzD;
                        }
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 9:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        iZzh = zzhbd.zzh(i15, unsafe.getObject(obj, j4), zzhalVar.zzx(i13));
                        iT += iZzh;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 10:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        zzgxp zzgxpVar = (zzgxp) unsafe.getObject(obj, j4);
                        iZzD2 = zzgyc.zzD(i15 << 3);
                        iZzd = zzgxpVar.zzd();
                        iZzD3 = zzgyc.zzD(iZzd);
                        iT += iZzD3 + iZzd + iZzD2;
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 11:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        iT = q1.a.t(unsafe.getInt(obj, j4), zzgyc.zzD(i15 << 3), iT);
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 12:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        long j13 = unsafe.getInt(obj, j4);
                        iZzD = zzgyc.zzD(i15 << 3);
                        iZzE = zzgyc.zzE(j13);
                        iT += iZzE + iZzD;
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 13:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        iT = q1.a.t(i15 << 3, 4, iT);
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 14:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        iT = q1.a.t(i15 << 3, 8, iT);
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 15:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        int i20 = unsafe.getInt(obj, j4);
                        iT = q1.a.t((i20 >> 31) ^ (i20 + i20), zzgyc.zzD(i15 << 3), iT);
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 16:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        long j14 = unsafe.getLong(obj, j4);
                        iZzD = zzgyc.zzD(i15 << 3);
                        iZzE = zzgyc.zzE((j14 >> 63) ^ (j14 + j14));
                        iT += iZzE + iZzD;
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 17:
                    if (zzhalVar.zzO(obj, i13, i12, i14, i)) {
                        iT += zzgyc.zzy(i15, (zzhai) unsafe.getObject(obj, j4), zzhalVar.zzx(i13));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 18:
                    iZzh = zzhbd.zzd(i15, (List) unsafe.getObject(obj, j4), false);
                    iT += iZzh;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 19:
                    iZzh = zzhbd.zzb(i15, (List) unsafe.getObject(obj, j4), false);
                    iT += iZzh;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j4);
                    int i21 = zzhbd.zza;
                    if (list.size() == 0) {
                        iZzD4 = 0;
                    } else {
                        iZzD4 = (zzgyc.zzD(i15 << 3) * list.size()) + zzhbd.zzg(list);
                    }
                    iT += iZzD4;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    List list2 = (List) unsafe.getObject(obj, j4);
                    int i22 = zzhbd.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzD4 = 0;
                    } else {
                        iZzl = zzhbd.zzl(list2);
                        iZzD5 = zzgyc.zzD(i15 << 3);
                        iZzD4 = (iZzD5 * size) + iZzl;
                    }
                    iT += iZzD4;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j4);
                    int i23 = zzhbd.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzD4 = 0;
                    } else {
                        iZzl = zzhbd.zzf(list3);
                        iZzD5 = zzgyc.zzD(i15 << 3);
                        iZzD4 = (iZzD5 * size) + iZzl;
                    }
                    iT += iZzD4;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 23:
                    iZzd2 = zzhbd.zzd(i15, (List) unsafe.getObject(obj, j4), false);
                    iT += iZzd2;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 24:
                    z4 = false;
                    iZzb = zzhbd.zzb(i15, (List) unsafe.getObject(obj, j4), false);
                    iT += iZzb;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j4);
                    int i24 = zzhbd.zza;
                    int size4 = list4.size();
                    if (size4 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzd2 = size4 * (zzgyc.zzD(i15 << 3) + 1);
                    }
                    iT += iZzd2;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j4);
                    int i25 = zzhbd.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzC = 0;
                    } else {
                        int iZzD13 = zzgyc.zzD(i15 << 3) * size5;
                        if (list5 instanceof zzgzu) {
                            zzgzu zzgzuVar = (zzgzu) list5;
                            iZzC = iZzD13;
                            for (int i26 = 0; i26 < size5; i26++) {
                                Object objZzc = zzgzuVar.zzc();
                                if (objZzc instanceof zzgxp) {
                                    int iZzd3 = ((zzgxp) objZzc).zzd();
                                    iZzC = q1.a.t(iZzd3, iZzd3, iZzC);
                                } else {
                                    iZzC = zzgyc.zzC((String) objZzc) + iZzC;
                                }
                            }
                        } else {
                            iZzC = iZzD13;
                            for (int i27 = 0; i27 < size5; i27++) {
                                Object obj2 = list5.get(i27);
                                if (obj2 instanceof zzgxp) {
                                    int iZzd4 = ((zzgxp) obj2).zzd();
                                    iZzC = q1.a.t(iZzd4, iZzd4, iZzC);
                                } else {
                                    iZzC = zzgyc.zzC((String) obj2) + iZzC;
                                }
                            }
                        }
                    }
                    iT += iZzC;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j4);
                    zzhbb zzhbbVarZzx = zzhalVar.zzx(i13);
                    int i28 = zzhbd.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzD6 = 0;
                    } else {
                        iZzD6 = zzgyc.zzD(i15 << 3) * size6;
                        for (int i29 = 0; i29 < size6; i29++) {
                            Object obj3 = list6.get(i29);
                            if (obj3 instanceof zzgzt) {
                                int iZza = ((zzgzt) obj3).zza();
                                iZzD6 = q1.a.t(iZza, iZza, iZzD6);
                            } else {
                                iZzD6 = zzgyc.zzA((zzhai) obj3, zzhbbVarZzx) + iZzD6;
                            }
                        }
                    }
                    iT += iZzD6;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j4);
                    int i30 = zzhbd.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzD7 = 0;
                    } else {
                        iZzD7 = zzgyc.zzD(i15 << 3) * size7;
                        for (int i31 = 0; i31 < list7.size(); i31++) {
                            int iZzd5 = ((zzgxp) list7.get(i31)).zzd();
                            iZzD7 = q1.a.t(iZzd5, iZzd5, iZzD7);
                        }
                    }
                    iT += iZzD7;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j4);
                    int i32 = zzhbd.zza;
                    size2 = list8.size();
                    if (size2 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzk = zzhbd.zzk(list8);
                        iZzD8 = zzgyc.zzD(i15 << 3);
                        iZzd2 = iZzk + (iZzD8 * size2);
                    }
                    iT += iZzd2;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j4);
                    int i33 = zzhbd.zza;
                    size2 = list9.size();
                    if (size2 == 0) {
                        iZzd2 = 0;
                    } else {
                        iZzk = zzhbd.zza(list9);
                        iZzD8 = zzgyc.zzD(i15 << 3);
                        iZzd2 = iZzk + (iZzD8 * size2);
                    }
                    iT += iZzd2;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 31:
                    iZzd2 = zzhbd.zzb(i15, (List) unsafe.getObject(obj, j4), false);
                    iT += iZzd2;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    z4 = false;
                    iZzb = zzhbd.zzd(i15, (List) unsafe.getObject(obj, j4), false);
                    iT += iZzb;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j4);
                    int i34 = zzhbd.zza;
                    size3 = list10.size();
                    if (size3 == 0) {
                        i10 = 0;
                    } else {
                        iZzi = zzhbd.zzi(list10);
                        iZzD9 = zzgyc.zzD(i15 << 3);
                        i10 = (iZzD9 * size3) + iZzi;
                    }
                    iT += i10;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j4);
                    int i35 = zzhbd.zza;
                    size3 = list11.size();
                    if (size3 == 0) {
                        i10 = 0;
                    } else {
                        iZzi = zzhbd.zzj(list11);
                        iZzD9 = zzgyc.zzD(i15 << 3);
                        i10 = (iZzD9 * size3) + iZzi;
                    }
                    iT += i10;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 35:
                    iZze = zzhbd.zze((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 36:
                    iZze = zzhbd.zzc((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 37:
                    iZze = zzhbd.zzg((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 38:
                    iZze = zzhbd.zzl((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 39:
                    iZze = zzhbd.zzf((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 40:
                    iZze = zzhbd.zze((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 41:
                    iZze = zzhbd.zzc((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j4);
                    int i36 = zzhbd.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 43:
                    iZze = zzhbd.zzk((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 44:
                    iZze = zzhbd.zza((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 45:
                    iZze = zzhbd.zzc((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 46:
                    iZze = zzhbd.zze((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 47:
                    iZze = zzhbd.zzi((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 48:
                    iZze = zzhbd.zzj((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzD10 = zzgyc.zzD(i15 << 3);
                        iZzD11 = zzgyc.zzD(iZze);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j4);
                    zzhbb zzhbbVarZzx2 = zzhalVar.zzx(i13);
                    int i37 = zzhbd.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        i10 = 0;
                    } else {
                        int iZzy = 0;
                        for (int i38 = 0; i38 < size8; i38++) {
                            iZzy += zzgyc.zzy(i15, (zzhai) list13.get(i38), zzhbbVarZzx2);
                        }
                        i10 = iZzy;
                    }
                    iT += i10;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 50:
                    zzhac zzhacVar = (zzhac) unsafe.getObject(obj, j4);
                    if (!zzhacVar.isEmpty()) {
                        Iterator it = zzhacVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 51:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        iT = q1.a.t(i15 << 3, 8, iT);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 52:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        iT = q1.a.t(i15 << 3, 4, iT);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 53:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        long jZzv = zzv(obj, j4);
                        iZzD12 = zzgyc.zzD(i15 << 3);
                        iZzE2 = zzgyc.zzE(jZzv);
                        iT += iZzE2 + iZzD12;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 54:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        long jZzv2 = zzv(obj, j4);
                        iZzD12 = zzgyc.zzD(i15 << 3);
                        iZzE2 = zzgyc.zzE(jZzv2);
                        iT += iZzE2 + iZzD12;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 55:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        long jZzp = zzp(obj, j4);
                        iZzD12 = zzgyc.zzD(i15 << 3);
                        iZzE2 = zzgyc.zzE(jZzp);
                        iT += iZzE2 + iZzD12;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 56:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        iT = q1.a.t(i15 << 3, 8, iT);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 57:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        iT = q1.a.t(i15 << 3, 4, iT);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 58:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        iT = q1.a.t(i15 << 3, 1, iT);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 59:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        int i39 = i15 << 3;
                        Object object2 = unsafe.getObject(obj, j4);
                        if (object2 instanceof zzgxp) {
                            iZze = zzgyc.zzD(i39);
                            iZzD10 = ((zzgxp) object2).zzd();
                            iZzD11 = zzgyc.zzD(iZzD10);
                            iT += iZzD11 + iZzD10 + iZze;
                        } else {
                            iZzD12 = zzgyc.zzD(i39);
                            iZzE2 = zzgyc.zzC((String) object2);
                            iT += iZzE2 + iZzD12;
                        }
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 60:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        iZzd2 = zzhbd.zzh(i15, unsafe.getObject(obj, j4), zzhalVar.zzx(i13));
                        iT += iZzd2;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 61:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        zzgxp zzgxpVar2 = (zzgxp) unsafe.getObject(obj, j4);
                        iZze = zzgyc.zzD(i15 << 3);
                        iZzD10 = zzgxpVar2.zzd();
                        iZzD11 = zzgyc.zzD(iZzD10);
                        iT += iZzD11 + iZzD10 + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 62:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        iT = q1.a.t(zzp(obj, j4), zzgyc.zzD(i15 << 3), iT);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 63:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        long jZzp2 = zzp(obj, j4);
                        iZzD12 = zzgyc.zzD(i15 << 3);
                        iZzE2 = zzgyc.zzE(jZzp2);
                        iT += iZzE2 + iZzD12;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        iT = q1.a.t(i15 << 3, 4, iT);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 65:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        iT = q1.a.t(i15 << 3, 8, iT);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 66:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        int iZzp = zzp(obj, j4);
                        iT = q1.a.t((iZzp >> 31) ^ (iZzp + iZzp), zzgyc.zzD(i15 << 3), iT);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 67:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        long jZzv3 = zzv(obj, j4);
                        iZzD12 = zzgyc.zzD(i15 << 3);
                        iZzE2 = zzgyc.zzE((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        iT += iZzE2 + iZzD12;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 68:
                    if (zzhalVar.zzR(obj, i15, i13)) {
                        iT += zzgyc.zzy(i15, (zzhai) unsafe.getObject(obj, j4), zzhalVar.zzx(i13));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                default:
                    i13 += 3;
                    i11 = 1048575;
                    break;
            }
        }
        int iZzc = 0;
        int iZza2 = ((zzgyx) obj).zzt.zza() + iT;
        if (!zzhalVar.zzh) {
            return iZza2;
        }
        zzgym zzgymVar = ((zzgyt) obj).zza;
        int iZzc2 = zzgymVar.zza.zzc();
        for (int i40 = 0; i40 < iZzc2; i40++) {
            Map.Entry entryZzg = zzgymVar.zza.zzg(i40);
            iZzc += zzgym.zzc((zzgyl) ((zzhbf) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzgymVar.zza.zzd()) {
            iZzc += zzgym.zzc((zzgyl) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int iZzd;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int iZzu = zzu(i13);
            int[] iArr = this.zzc;
            int i14 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i15 = iArr[i13];
            long j4 = i14;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhbu.zzb(obj, j4));
                    byte[] bArr = zzgzk.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzd;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhbu.zzc(obj, j4));
                    i12 = iFloatToIntBits + i10;
                    break;
                case 2:
                    i = i12 * 53;
                    jDoubleToLongBits = zzhbu.zzf(obj, j4);
                    byte[] bArr2 = zzgzk.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzd;
                    break;
                case 3:
                    i = i12 * 53;
                    jDoubleToLongBits = zzhbu.zzf(obj, j4);
                    byte[] bArr3 = zzgzk.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzd;
                    break;
                case 4:
                    i = i12 * 53;
                    iZzd = zzhbu.zzd(obj, j4);
                    i12 = i + iZzd;
                    break;
                case 5:
                    i = i12 * 53;
                    jDoubleToLongBits = zzhbu.zzf(obj, j4);
                    byte[] bArr4 = zzgzk.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzd;
                    break;
                case 6:
                    i = i12 * 53;
                    iZzd = zzhbu.zzd(obj, j4);
                    i12 = i + iZzd;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzgzk.zza(zzhbu.zzz(obj, j4));
                    i12 = iFloatToIntBits + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iFloatToIntBits = ((String) zzhbu.zzh(obj, j4)).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object objZzh = zzhbu.zzh(obj, j4);
                    if (objZzh != null) {
                        iHashCode = objZzh.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzhbu.zzh(obj, j4).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 11:
                    i = i12 * 53;
                    iZzd = zzhbu.zzd(obj, j4);
                    i12 = i + iZzd;
                    break;
                case 12:
                    i = i12 * 53;
                    iZzd = zzhbu.zzd(obj, j4);
                    i12 = i + iZzd;
                    break;
                case 13:
                    i = i12 * 53;
                    iZzd = zzhbu.zzd(obj, j4);
                    i12 = i + iZzd;
                    break;
                case 14:
                    i = i12 * 53;
                    jDoubleToLongBits = zzhbu.zzf(obj, j4);
                    byte[] bArr5 = zzgzk.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzd;
                    break;
                case 15:
                    i = i12 * 53;
                    iZzd = zzhbu.zzd(obj, j4);
                    i12 = i + iZzd;
                    break;
                case 16:
                    i = i12 * 53;
                    jDoubleToLongBits = zzhbu.zzf(obj, j4);
                    byte[] bArr6 = zzgzk.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzd;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object objZzh2 = zzhbu.zzh(obj, j4);
                    if (objZzh2 != null) {
                        iHashCode = objZzh2.hashCode();
                    }
                    i12 = i11 + iHashCode;
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
                    i10 = i12 * 53;
                    iFloatToIntBits = zzhbu.zzh(obj, j4).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzhbu.zzh(obj, j4).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j4));
                        byte[] bArr7 = zzgzk.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzd;
                    }
                    break;
                case 52:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j4));
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
                case 53:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr8 = zzgzk.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzd;
                    }
                    break;
                case 54:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr9 = zzgzk.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzd;
                    }
                    break;
                case 55:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzd = zzp(obj, j4);
                        i12 = i + iZzd;
                    }
                    break;
                case 56:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr10 = zzgzk.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzd;
                    }
                    break;
                case 57:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzd = zzp(obj, j4);
                        i12 = i + iZzd;
                    }
                    break;
                case 58:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzgzk.zza(zzS(obj, j4));
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
                case 59:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = ((String) zzhbu.zzh(obj, j4)).hashCode();
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
                case 60:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzhbu.zzh(obj, j4).hashCode();
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
                case 61:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzhbu.zzh(obj, j4).hashCode();
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
                case 62:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzd = zzp(obj, j4);
                        i12 = i + iZzd;
                    }
                    break;
                case 63:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzd = zzp(obj, j4);
                        i12 = i + iZzd;
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzd = zzp(obj, j4);
                        i12 = i + iZzd;
                    }
                    break;
                case 65:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr11 = zzgzk.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzd;
                    }
                    break;
                case 66:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzd = zzp(obj, j4);
                        i12 = i + iZzd;
                    }
                    break;
                case 67:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr12 = zzgzk.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzd;
                    }
                    break;
                case 68:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzhbu.zzh(obj, j4).hashCode();
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = ((zzgyx) obj).zzt.hashCode() + (i12 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzgyt) obj).zza.zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34801. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.ads.zzgxd r38) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhal.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgxd):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final Object zze() {
        return ((zzgyx) this.zzg).zzbj();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzgyx) {
                zzgyx zzgyxVar = (zzgyx) obj;
                zzgyxVar.zzbV();
                zzgyxVar.zzbU();
                zzgyxVar.zzbX();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzu = zzu(i);
                int i10 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j4 = i10;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case 17:
                                if (zzN(obj, i)) {
                                    zzx(i).zzf(zzb.getObject(obj, j4));
                                }
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
                                ((zzgzj) zzhbu.zzh(obj, j4)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    ((zzhac) object).zzc();
                                    unsafe.putObject(obj, j4, object);
                                }
                                break;
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j4));
                    }
                } else if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j4));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i10 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i11 = iArr[i];
            long j4 = i10;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzhbu.zzr(obj, j4, zzhbu.zzb(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        zzhbu.zzs(obj, j4, zzhbu.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i)) {
                        zzhbu.zzu(obj, j4, zzhbu.zzf(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i)) {
                        zzhbu.zzu(obj, j4, zzhbu.zzf(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i)) {
                        zzhbu.zzt(obj, j4, zzhbu.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i)) {
                        zzhbu.zzu(obj, j4, zzhbu.zzf(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i)) {
                        zzhbu.zzt(obj, j4, zzhbu.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i)) {
                        zzhbu.zzp(obj, j4, zzhbu.zzz(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i)) {
                        zzhbu.zzv(obj, j4, zzhbu.zzh(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzhbu.zzv(obj, j4, zzhbu.zzh(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        zzhbu.zzt(obj, j4, zzhbu.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i)) {
                        zzhbu.zzt(obj, j4, zzhbu.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        zzhbu.zzt(obj, j4, zzhbu.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        zzhbu.zzu(obj, j4, zzhbu.zzf(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        zzhbu.zzt(obj, j4, zzhbu.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        zzhbu.zzu(obj, j4, zzhbu.zzf(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i);
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
                    zzgzj zzgzjVarZzf = (zzgzj) zzhbu.zzh(obj, j4);
                    zzgzj zzgzjVar = (zzgzj) zzhbu.zzh(obj2, j4);
                    int size = zzgzjVarZzf.size();
                    int size2 = zzgzjVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzgzjVarZzf.zzc()) {
                            zzgzjVarZzf = zzgzjVarZzf.zzf(size2 + size);
                        }
                        zzgzjVarZzf.addAll(zzgzjVar);
                    }
                    if (size > 0) {
                        zzgzjVar = zzgzjVarZzf;
                    }
                    zzhbu.zzv(obj, j4, zzgzjVar);
                    break;
                case 50:
                    int i12 = zzhbd.zza;
                    zzhbu.zzv(obj, j4, zzhad.zzb(zzhbu.zzh(obj, j4), zzhbu.zzh(obj2, j4)));
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
                    if (zzR(obj2, i11, i)) {
                        zzhbu.zzv(obj, j4, zzhbu.zzh(obj2, j4));
                        zzI(obj, i11, i);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i11, i)) {
                        zzhbu.zzv(obj, j4, zzhbu.zzh(obj2, j4));
                        zzI(obj, i11, i);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzhbd.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzhbd.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:194:0x05f1 A[LOOP:2: B:192:0x05ed->B:194:0x05f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:204:0x0610 A[LOOP:3: B:202:0x060c->B:204:0x0610, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x061f  */
    /* JADX WARN: Code duplicated, block: B:211:0x05dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x05eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzh(Object obj, zzhav zzhavVar, zzgyh zzgyhVar) throws Throwable {
        Object obj2;
        Object obj3;
        zzhal<T> zzhalVar;
        Throwable th;
        int i;
        zzhbn zzhbnVar;
        Object obj4;
        Object obj5;
        int i10;
        zzgyhVar.getClass();
        zzD(obj);
        zzhbn zzhbnVar2 = this.zzm;
        Object objZza = null;
        while (true) {
            try {
                int iZzc = zzhavVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    obj5 = obj;
                    zzhbnVar = zzhbnVar2;
                    zzhalVar = this;
                    obj4 = objZza;
                    try {
                        int iZzu = zzu(iZzq);
                        try {
                            switch (zzt(iZzu)) {
                                case 0:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzr(obj2, iZzu & 1048575, zzhavVar.zza());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 1:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzs(obj2, iZzu & 1048575, zzhavVar.zzb());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 2:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzu(obj2, iZzu & 1048575, zzhavVar.zzl());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 3:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzu(obj2, iZzu & 1048575, zzhavVar.zzo());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 4:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzt(obj2, iZzu & 1048575, zzhavVar.zzg());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 5:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzu(obj2, iZzu & 1048575, zzhavVar.zzk());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 6:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzt(obj2, iZzu & 1048575, zzhavVar.zzf());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 7:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzp(obj2, iZzu & 1048575, zzhavVar.zzN());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 8:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzG(obj2, iZzu, zzhavVar);
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 9:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhai zzhaiVar = (zzhai) zzA(obj2, iZzq);
                                    zzhavVar.zzu(zzhaiVar, zzx(iZzq), zzgyhVar);
                                    zzJ(obj2, iZzq, zzhaiVar);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 10:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzv(obj2, iZzu & 1048575, zzhavVar.zzp());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 11:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzt(obj2, iZzu & 1048575, zzhavVar.zzj());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 12:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    int iZze = zzhavVar.zze();
                                    zzgzd zzgzdVarZzw = zzw(iZzq);
                                    if (zzgzdVarZzw == null || zzgzdVarZzw.zza(iZze)) {
                                        zzhbu.zzt(obj2, iZzu & 1048575, iZze);
                                        zzH(obj2, iZzq);
                                        objZza = obj3;
                                    } else {
                                        objZza = zzhbd.zzo(obj2, iZzc, iZze, obj3, zzhbnVar2);
                                    }
                                    obj = obj2;
                                    break;
                                case 13:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzt(obj2, iZzu & 1048575, zzhavVar.zzh());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 14:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzu(obj2, iZzu & 1048575, zzhavVar.zzm());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 15:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzt(obj2, iZzu & 1048575, zzhavVar.zzi());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 16:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhbu.zzu(obj2, iZzu & 1048575, zzhavVar.zzn());
                                    zzH(obj2, iZzq);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 17:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhai zzhaiVar2 = (zzhai) zzA(obj2, iZzq);
                                    zzhavVar.zzt(zzhaiVar2, zzx(iZzq), zzgyhVar);
                                    zzJ(obj2, iZzq, zzhaiVar2);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 18:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzx(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 19:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzB(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 20:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzE(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case zzbbs.zzt.zzm /* 21 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzM(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 22:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzD(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 23:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzA(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 24:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzz(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 25:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzv(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 26:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    if (zzM(iZzu)) {
                                        ((zzgxw) zzhavVar).zzK(zzgzv.zza(obj2, iZzu & 1048575), true);
                                    } else {
                                        ((zzgxw) zzhavVar).zzK(zzgzv.zza(obj2, iZzu & 1048575), false);
                                    }
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 27:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzF(zzgzv.zza(obj2, iZzu & 1048575), zzx(iZzq), zzgyhVar);
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 28:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzw(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 29:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzL(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 30:
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    try {
                                        List listZza = zzgzv.zza(obj5, iZzu & 1048575);
                                        zzhavVar.zzy(listZza);
                                        objZza = zzhbd.zzn(obj5, iZzc, listZza, zzw(iZzq), obj3, zzhbnVar2);
                                        obj2 = obj5;
                                        zzhbnVar2 = zzhbnVar2;
                                    } catch (zzgzl unused) {
                                        obj2 = obj5;
                                        objZza = obj3;
                                        if (objZza == null) {
                                            try {
                                                objZza = zzhbnVar2.zza(obj2);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                i = zzhalVar.zzk;
                                                while (i < zzhalVar.zzl) {
                                                    zzhalVar.zzy(obj2, zzhalVar.zzj[i], objZza, zzhbnVar2, obj2);
                                                    i++;
                                                    zzhalVar = this;
                                                }
                                                if (objZza == null) {
                                                    throw th;
                                                }
                                                zzhbnVar2.zzj(obj2, objZza);
                                                throw th;
                                            }
                                        }
                                        if (!zzhbnVar2.zzk(objZza, zzhavVar, 0)) {
                                            for (i10 = zzhalVar.zzk; i10 < zzhalVar.zzl; i10++) {
                                                zzhalVar.zzy(obj2, zzhalVar.zzj[i10], objZza, zzhbnVar2, obj2);
                                            }
                                            if (objZza != null) {
                                                zzhbnVar2.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = obj5;
                                        th = th;
                                        objZza = obj3;
                                        i = zzhalVar.zzk;
                                        while (i < zzhalVar.zzl) {
                                            zzhalVar.zzy(obj2, zzhalVar.zzj[i], objZza, zzhbnVar2, obj2);
                                            i++;
                                            zzhalVar = this;
                                        }
                                        if (objZza == null) {
                                            throw th;
                                        }
                                        zzhbnVar2.zzj(obj2, objZza);
                                        throw th;
                                    }
                                    obj = obj2;
                                    break;
                                case 31:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzG(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzH(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 33:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzI(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 34:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzJ(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 35:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzx(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 36:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzB(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 37:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzE(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 38:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzM(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 39:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzD(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 40:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzA(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 41:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzz(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 42:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    zzhavVar.zzv(zzgzv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 43:
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    try {
                                        zzhavVar.zzL(zzgzv.zza(obj2, iZzu & 1048575));
                                        objZza = obj3;
                                    } catch (zzgzl unused2) {
                                        objZza = obj3;
                                        if (objZza == null) {
                                            objZza = zzhbnVar2.zza(obj2);
                                        }
                                        if (!zzhbnVar2.zzk(objZza, zzhavVar, 0)) {
                                            while (i10 < zzhalVar.zzl) {
                                                zzhalVar.zzy(obj2, zzhalVar.zzj[i10], objZza, zzhbnVar2, obj2);
                                            }
                                            if (objZza != null) {
                                                zzhbnVar2.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = th;
                                        objZza = obj3;
                                        i = zzhalVar.zzk;
                                        while (i < zzhalVar.zzl) {
                                            zzhalVar.zzy(obj2, zzhalVar.zzj[i], objZza, zzhbnVar2, obj2);
                                            i++;
                                            zzhalVar = this;
                                        }
                                        if (objZza == null) {
                                            throw th;
                                        }
                                        zzhbnVar2.zzj(obj2, objZza);
                                        throw th;
                                    }
                                    obj = obj2;
                                    break;
                                case 44:
                                    List listZza2 = zzgzv.zza(obj5, iZzu & 1048575);
                                    zzhavVar.zzy(listZza2);
                                    try {
                                        objZza = zzhbd.zzn(obj5, iZzc, listZza2, zzw(iZzq), obj4, zzhbnVar);
                                        obj2 = obj5;
                                        zzhbnVar2 = zzhbnVar;
                                    } catch (zzgzl unused3) {
                                        obj2 = obj5;
                                        obj3 = obj4;
                                        zzhbnVar2 = zzhbnVar;
                                        objZza = obj3;
                                        if (objZza == null) {
                                            objZza = zzhbnVar2.zza(obj2);
                                        }
                                        if (!zzhbnVar2.zzk(objZza, zzhavVar, 0)) {
                                            while (i10 < zzhalVar.zzl) {
                                                zzhalVar.zzy(obj2, zzhalVar.zzj[i10], objZza, zzhbnVar2, obj2);
                                            }
                                            if (objZza != null) {
                                                zzhbnVar2.zzj(obj2, objZza);
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj5;
                                        obj3 = obj4;
                                        zzhbnVar2 = zzhbnVar;
                                        th = th;
                                        objZza = obj3;
                                        i = zzhalVar.zzk;
                                        while (i < zzhalVar.zzl) {
                                            zzhalVar.zzy(obj2, zzhalVar.zzj[i], objZza, zzhbnVar2, obj2);
                                            i++;
                                            zzhalVar = this;
                                        }
                                        if (objZza == null) {
                                            throw th;
                                        }
                                        zzhbnVar2.zzj(obj2, objZza);
                                        throw th;
                                    }
                                    obj = obj2;
                                    break;
                                case 45:
                                    zzhavVar.zzG(zzgzv.zza(obj5, iZzu & 1048575));
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 46:
                                    zzhavVar.zzH(zzgzv.zza(obj5, iZzu & 1048575));
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 47:
                                    zzhavVar.zzI(zzgzv.zza(obj5, iZzu & 1048575));
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 48:
                                    zzhavVar.zzJ(zzgzv.zza(obj5, iZzu & 1048575));
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 49:
                                    zzhavVar.zzC(zzgzv.zza(obj5, iZzu & 1048575), zzx(iZzq), zzgyhVar);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 50:
                                    Object objZzz = zzz(iZzq);
                                    long jZzu = zzu(iZzq) & 1048575;
                                    Object objZzh = zzhbu.zzh(obj5, jZzu);
                                    if (objZzh == null) {
                                        objZzh = zzhac.zza().zzb();
                                        zzhbu.zzv(obj5, jZzu, objZzh);
                                    } else if (zzhad.zza(objZzh)) {
                                        Object objZzb = zzhac.zza().zzb();
                                        zzhad.zzb(objZzb, objZzh);
                                        zzhbu.zzv(obj5, jZzu, objZzb);
                                        objZzh = objZzb;
                                    }
                                    throw null;
                                case 51:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Double.valueOf(zzhavVar.zza()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 52:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Float.valueOf(zzhavVar.zzb()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 53:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Long.valueOf(zzhavVar.zzl()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 54:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Long.valueOf(zzhavVar.zzo()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 55:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Integer.valueOf(zzhavVar.zzg()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 56:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Long.valueOf(zzhavVar.zzk()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 57:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Integer.valueOf(zzhavVar.zzf()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 58:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Boolean.valueOf(zzhavVar.zzN()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 59:
                                    zzG(obj5, iZzu, zzhavVar);
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 60:
                                    zzhai zzhaiVar3 = (zzhai) zzB(obj5, iZzc, iZzq);
                                    zzhavVar.zzu(zzhaiVar3, zzx(iZzq), zzgyhVar);
                                    zzK(obj5, iZzc, iZzq, zzhaiVar3);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 61:
                                    zzhbu.zzv(obj5, iZzu & 1048575, zzhavVar.zzp());
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 62:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Integer.valueOf(zzhavVar.zzj()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 63:
                                    int iZze2 = zzhavVar.zze();
                                    zzgzd zzgzdVarZzw2 = zzw(iZzq);
                                    if (zzgzdVarZzw2 != null && !zzgzdVarZzw2.zza(iZze2)) {
                                        objZza = zzhbd.zzo(obj5, iZzc, iZze2, obj4, zzhbnVar);
                                        obj = obj5;
                                        zzhbnVar2 = zzhbnVar;
                                    }
                                    zzhbu.zzv(obj5, iZzu & 1048575, Integer.valueOf(iZze2));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Integer.valueOf(zzhavVar.zzh()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 65:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Long.valueOf(zzhavVar.zzm()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 66:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Integer.valueOf(zzhavVar.zzi()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 67:
                                    zzhbu.zzv(obj5, iZzu & 1048575, Long.valueOf(zzhavVar.zzn()));
                                    zzI(obj5, iZzc, iZzq);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                case 68:
                                    zzhai zzhaiVar4 = (zzhai) zzB(obj5, iZzc, iZzq);
                                    zzhavVar.zzt(zzhaiVar4, zzx(iZzq), zzgyhVar);
                                    zzK(obj5, iZzc, iZzq, zzhaiVar4);
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzhbnVar2 = zzhbnVar;
                                    objZza = obj3;
                                    obj = obj2;
                                    break;
                                default:
                                    if (obj4 == null) {
                                        try {
                                            objZza = zzhbnVar.zza(obj5);
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th = th;
                                            obj2 = obj5;
                                            obj3 = obj4;
                                            zzhbnVar2 = zzhbnVar;
                                            objZza = obj3;
                                            i = zzhalVar.zzk;
                                            while (i < zzhalVar.zzl) {
                                                zzhalVar.zzy(obj2, zzhalVar.zzj[i], objZza, zzhbnVar2, obj2);
                                                i++;
                                                zzhalVar = this;
                                            }
                                            if (objZza == null) {
                                                throw th;
                                            }
                                            zzhbnVar2.zzj(obj2, objZza);
                                            throw th;
                                        }
                                    } else {
                                        objZza = obj4;
                                    }
                                    try {
                                        if (!zzhbnVar.zzk(objZza, zzhavVar, 0)) {
                                            for (int i11 = zzhalVar.zzk; i11 < zzhalVar.zzl; i11++) {
                                                zzhbn zzhbnVar3 = zzhbnVar;
                                                Object obj6 = obj5;
                                                zzhalVar.zzy(obj6, zzhalVar.zzj[i11], objZza, zzhbnVar3, obj5);
                                                obj5 = obj6;
                                                zzhbnVar = zzhbnVar3;
                                            }
                                            obj2 = obj5;
                                            zzhbnVar2 = zzhbnVar;
                                        }
                                        obj = obj5;
                                        zzhbnVar2 = zzhbnVar;
                                    } catch (zzgzl unused4) {
                                        obj2 = obj5;
                                        zzhbnVar2 = zzhbnVar;
                                        if (objZza == null) {
                                            objZza = zzhbnVar2.zza(obj2);
                                        }
                                        if (!zzhbnVar2.zzk(objZza, zzhavVar, 0)) {
                                            while (i10 < zzhalVar.zzl) {
                                                zzhalVar.zzy(obj2, zzhalVar.zzj[i10], objZza, zzhbnVar2, obj2);
                                            }
                                        }
                                        obj = obj2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        th = th;
                                        obj2 = obj5;
                                        zzhbnVar2 = zzhbnVar;
                                        i = zzhalVar.zzk;
                                        while (i < zzhalVar.zzl) {
                                            zzhalVar.zzy(obj2, zzhalVar.zzj[i], objZza, zzhbnVar2, obj2);
                                            i++;
                                            zzhalVar = this;
                                        }
                                        if (objZza == null) {
                                            throw th;
                                        }
                                        zzhbnVar2.zzj(obj2, objZza);
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (zzgzl unused5) {
                            obj2 = obj5;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        obj2 = obj5;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i12 = this.zzk;
                    while (i12 < this.zzl) {
                        zzy(obj, this.zzj[i12], objZza, zzhbnVar2, obj);
                        i12++;
                        zzhbnVar2 = zzhbnVar2;
                    }
                    obj2 = obj;
                    zzhbnVar2 = zzhbnVar2;
                } else {
                    zzhbnVar = zzhbnVar2;
                    obj4 = objZza;
                    try {
                        if ((!this.zzh ? null : zzgyhVar.zzc(this.zzg, iZzc)) != null) {
                            obj5 = obj;
                            zzhalVar = this;
                            throw null;
                        }
                        if (obj4 == null) {
                            try {
                                objZza = zzhbnVar.zza(obj);
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj;
                                zzhalVar = this;
                                obj3 = obj4;
                                zzhbnVar2 = zzhbnVar;
                                objZza = obj3;
                                i = zzhalVar.zzk;
                                while (i < zzhalVar.zzl) {
                                    zzhalVar.zzy(obj2, zzhalVar.zzj[i], objZza, zzhbnVar2, obj2);
                                    i++;
                                    zzhalVar = this;
                                }
                                if (objZza == null) {
                                    throw th;
                                }
                                zzhbnVar2.zzj(obj2, objZza);
                                throw th;
                            }
                        } else {
                            objZza = obj4;
                        }
                        try {
                            if (zzhbnVar.zzk(objZza, zzhavVar, 0)) {
                                obj5 = obj;
                                obj = obj5;
                                zzhbnVar2 = zzhbnVar;
                            } else {
                                int i13 = this.zzk;
                                while (i13 < this.zzl) {
                                    zzhbn zzhbnVar4 = zzhbnVar;
                                    Object obj7 = obj;
                                    zzy(obj7, this.zzj[i13], objZza, zzhbnVar4, obj);
                                    zzhbnVar = zzhbnVar4;
                                    i13++;
                                    obj = obj7;
                                }
                                obj5 = obj;
                                obj2 = obj5;
                                zzhbnVar2 = zzhbnVar;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            obj5 = obj;
                            zzhalVar = this;
                            th = th;
                            obj2 = obj5;
                            zzhbnVar2 = zzhbnVar;
                            i = zzhalVar.zzk;
                            while (i < zzhalVar.zzl) {
                                zzhalVar.zzy(obj2, zzhalVar.zzj[i], objZza, zzhbnVar2, obj2);
                                i++;
                                zzhalVar = this;
                            }
                            if (objZza == null) {
                                throw th;
                            }
                            zzhbnVar2.zzj(obj2, objZza);
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        obj5 = obj;
                        zzhalVar = this;
                        th = th;
                        obj2 = obj5;
                        obj3 = obj4;
                        zzhbnVar2 = zzhbnVar;
                        objZza = obj3;
                        i = zzhalVar.zzk;
                        while (i < zzhalVar.zzl) {
                            zzhalVar.zzy(obj2, zzhalVar.zzj[i], objZza, zzhbnVar2, obj2);
                            i++;
                            zzhalVar = this;
                        }
                        if (objZza == null) {
                            throw th;
                        }
                        zzhbnVar2.zzj(obj2, objZza);
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
                obj2 = obj;
                obj3 = objZza;
                zzhalVar = this;
            }
        }
        if (objZza != null) {
            zzhbnVar2.zzj(obj2, objZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzi(Object obj, byte[] bArr, int i, int i10, zzgxd zzgxdVar) throws IOException {
        zzc(obj, bArr, i, i10, 0, zzgxdVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzj(Object obj, zzhcc zzhccVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i;
        int i10;
        int i11;
        int i12;
        zzhal<T> zzhalVar = this;
        if (zzhalVar.zzh) {
            zzgym zzgymVar = ((zzgyt) obj).zza;
            if (zzgymVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzgymVar.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzhalVar.zzc;
        Unsafe unsafe = zzb;
        int i13 = 0;
        int i14 = 1048575;
        int i15 = 0;
        while (i13 < iArr.length) {
            int iZzu = zzhalVar.zzu(i13);
            int[] iArr2 = zzhalVar.zzc;
            int iZzt = zzt(iZzu);
            int i16 = iArr2[i13];
            if (iZzt <= 17) {
                int i17 = iArr2[i13 + 2];
                int i18 = i17 & 1048575;
                if (i18 != i14) {
                    i = 1;
                    i15 = i18 == 1048575 ? 0 : unsafe.getInt(obj, i18);
                    i14 = i18;
                } else {
                    i = 1;
                }
                i10 = i14;
                i11 = i15;
                i12 = i << (i17 >>> 20);
            } else {
                i = 1;
                i10 = i14;
                i11 = i15;
                i12 = 0;
            }
            while (entry != null && ((zzgyu) entry.getKey()).zza <= i16) {
                zzhalVar.zzn.zzb(zzhccVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j4 = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzf(i16, zzhbu.zzb(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 1:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzo(i16, zzhbu.zzc(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 2:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzt(i16, unsafe.getLong(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 3:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzK(i16, unsafe.getLong(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 4:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzr(i16, unsafe.getInt(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 5:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzm(i16, unsafe.getLong(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 6:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzk(i16, unsafe.getInt(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 7:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzb(i16, zzhbu.zzz(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 8:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzT(i16, unsafe.getObject(obj, j4), zzhccVar);
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 9:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzv(i16, unsafe.getObject(obj, j4), zzhalVar.zzx(i13));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 10:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzd(i16, (zzgxp) unsafe.getObject(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 11:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzI(i16, unsafe.getInt(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 12:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzi(i16, unsafe.getInt(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 13:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzx(i16, unsafe.getInt(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 14:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzz(i16, unsafe.getLong(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 15:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzB(i16, unsafe.getInt(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 16:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzD(i16, unsafe.getLong(obj, j4));
                    }
                    zzhalVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 17:
                    if (zzhalVar.zzO(obj, i13, i10, i11, i12)) {
                        zzhccVar.zzq(i16, unsafe.getObject(obj, j4), zzhalVar.zzx(i13));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 18:
                    zzhbd.zzt(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 19:
                    zzhbd.zzx(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 20:
                    zzhbd.zzA(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    zzhbd.zzI(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 22:
                    zzhbd.zzz(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 23:
                    zzhbd.zzw(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 24:
                    zzhbd.zzv(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 25:
                    zzhbd.zzr(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 26:
                    zzhbd.zzG(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 27:
                    zzhbd.zzB(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, zzhalVar.zzx(i13));
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 28:
                    zzhbd.zzs(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 29:
                    zzhbd.zzH(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 30:
                    zzhbd.zzu(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 31:
                    zzhbd.zzC(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    zzhbd.zzD(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 33:
                    zzhbd.zzE(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 34:
                    zzhbd.zzF(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 35:
                    zzhbd.zzt(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 36:
                    zzhbd.zzx(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 37:
                    zzhbd.zzA(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 38:
                    zzhbd.zzI(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 39:
                    zzhbd.zzz(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 40:
                    zzhbd.zzw(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 41:
                    zzhbd.zzv(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 42:
                    zzhbd.zzr(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 43:
                    zzhbd.zzH(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 44:
                    zzhbd.zzu(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 45:
                    zzhbd.zzC(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 46:
                    zzhbd.zzD(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 47:
                    zzhbd.zzE(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 48:
                    zzhbd.zzF(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 49:
                    zzhbd.zzy(zzhalVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzhccVar, zzhalVar.zzx(i13));
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j4) != null) {
                        throw null;
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 51:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzf(i16, zzn(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 52:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzo(i16, zzo(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 53:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzt(i16, zzv(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 54:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzK(i16, zzv(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 55:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzr(i16, zzp(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 56:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzm(i16, zzv(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 57:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzk(i16, zzp(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 58:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzb(i16, zzS(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 59:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzT(i16, unsafe.getObject(obj, j4), zzhccVar);
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 60:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzv(i16, unsafe.getObject(obj, j4), zzhalVar.zzx(i13));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 61:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzd(i16, (zzgxp) unsafe.getObject(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 62:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzI(i16, zzp(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 63:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzi(i16, zzp(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzx(i16, zzp(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 65:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzz(i16, zzv(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 66:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzB(i16, zzp(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 67:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzD(i16, zzv(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 68:
                    if (zzhalVar.zzR(obj, i16, i13)) {
                        zzhccVar.zzq(i16, unsafe.getObject(obj, j4), zzhalVar.zzx(i13));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                default:
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            zzhalVar.zzn.zzb(zzhccVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zzgyx) obj).zzt.zzl(zzhccVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzJ;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j4 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzhbu.zzb(obj, j4)) != Double.doubleToLongBits(zzhbu.zzb(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzhbu.zzc(obj, j4)) != Float.floatToIntBits(zzhbu.zzc(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzhbu.zzf(obj, j4) != zzhbu.zzf(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzhbu.zzf(obj, j4) != zzhbu.zzf(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzhbu.zzd(obj, j4) != zzhbu.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzhbu.zzf(obj, j4) != zzhbu.zzf(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzhbu.zzd(obj, j4) != zzhbu.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzhbu.zzz(obj, j4) != zzhbu.zzz(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzhbd.zzJ(zzhbu.zzh(obj, j4), zzhbu.zzh(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzhbd.zzJ(zzhbu.zzh(obj, j4), zzhbu.zzh(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzhbd.zzJ(zzhbu.zzh(obj, j4), zzhbu.zzh(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzhbu.zzd(obj, j4) != zzhbu.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzhbu.zzd(obj, j4) != zzhbu.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzhbu.zzd(obj, j4) != zzhbu.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzhbu.zzf(obj, j4) != zzhbu.zzf(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzhbu.zzd(obj, j4) != zzhbu.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzhbu.zzf(obj, j4) != zzhbu.zzf(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzhbd.zzJ(zzhbu.zzh(obj, j4), zzhbu.zzh(obj2, j4))) {
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
                    zZzJ = zzhbd.zzJ(zzhbu.zzh(obj, j4), zzhbu.zzh(obj2, j4));
                    break;
                case 50:
                    zZzJ = zzhbd.zzJ(zzhbu.zzh(obj, j4), zzhbu.zzh(obj2, j4));
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
                    long jZzr = zzr(i) & 1048575;
                    if (zzhbu.zzd(obj, jZzr) != zzhbu.zzd(obj2, jZzr) || !zzhbd.zzJ(zzhbu.zzh(obj, j4), zzhbu.zzh(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzJ) {
                return false;
            }
        }
        if (!((zzgyx) obj).zzt.equals(((zzgyx) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzgyt) obj).zza.equals(((zzgyt) obj2).zza);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhbb
    public final boolean zzl(Object obj) {
        int i;
        int i10;
        List list;
        zzhbb zzhbbVarZzx;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i12 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i12];
            int i16 = iArr2[i15];
            int iZzu = zzu(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj, i18);
                }
                i10 = i13;
                i = i18;
            } else {
                i = i14;
                i10 = i13;
            }
            Object obj2 = obj;
            if ((268435456 & iZzu) != 0 && !zzO(obj2, i15, i, i10, i19)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj2, i15, i, i10, i19) && !zzP(obj2, iZzu, zzx(i15))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (List) zzhbu.zzh(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhbbVarZzx = zzx(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!zzhbbVarZzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj2, i16, i15) && !zzP(obj2, iZzu, zzx(i15))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzhbu.zzh(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzhbbVarZzx = zzx(i15);
                    while (i11 < list.size()) {
                        if (!zzhbbVarZzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzhac) zzhbu.zzh(obj2, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i12++;
            obj = obj2;
            i14 = i;
            i13 = i10;
        }
        return !this.zzh || ((zzgyt) obj).zza.zzi();
    }
}
