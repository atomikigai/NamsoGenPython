package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.webkit.TracingConfig;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbbs;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q1.a;
import sun.misc.Unsafe;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzals<T> implements zzamb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzanf.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzalp zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzald zzm;
    private final zzamv zzn;
    private final zzajy zzo;
    private final zzalu zzp;
    private final zzalk zzq;

    private zzals(int[] iArr, Object[] objArr, int i, int i10, zzalp zzalpVar, int i11, boolean z4, int[] iArr2, int i12, int i13, zzalu zzaluVar, zzald zzaldVar, zzamv zzamvVar, zzajy zzajyVar, zzalk zzalkVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i10;
        this.zzi = zzalpVar instanceof zzakk;
        boolean z10 = false;
        if (zzajyVar != null && zzajyVar.zzh(zzalpVar)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzaluVar;
        this.zzm = zzaldVar;
        this.zzn = zzamvVar;
        this.zzo = zzajyVar;
        this.zzg = zzalpVar;
        this.zzq = zzalkVar;
    }

    private final Object zzA(Object obj, int i) {
        zzamb zzambVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzambVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzambVarZzx.zze();
        if (object != null) {
            zzambVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i10) {
        zzamb zzambVarZzx = zzx(i10);
        if (!zzR(obj, i, i10)) {
            return zzambVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i10) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzambVarZzx.zze();
        if (object != null) {
            zzambVarZzx.zzg(objZze, object);
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
            zzamb zzambVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzambVarZzx.zze();
                    zzambVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzQ(object2)) {
                Object objZze2 = zzambVarZzx.zze();
                zzambVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzambVarZzx.zzg(object2, object);
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
            zzamb zzambVarZzx = zzx(i);
            if (!zzR(obj, i10, i)) {
                if (zzQ(object)) {
                    Object objZze = zzambVarZzx.zze();
                    zzambVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzI(obj, i10, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzQ(object2)) {
                Object objZze2 = zzambVarZzx.zze();
                zzambVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzambVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzama zzamaVar) throws IOException {
        long j4 = i & 1048575;
        if (zzM(i)) {
            zzanf.zzs(obj, j4, zzamaVar.zzs());
        } else if (this.zzi) {
            zzanf.zzs(obj, j4, zzamaVar.zzr());
        } else {
            zzanf.zzs(obj, j4, zzamaVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j4 = 1048575 & iZzr;
        if (j4 == 1048575) {
            return;
        }
        zzanf.zzq(obj, j4, (1 << (iZzr >>> 20)) | zzanf.zzc(obj, j4));
    }

    private final void zzI(Object obj, int i, int i10) {
        zzanf.zzq(obj, zzr(i10) & 1048575, i);
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
            return (zzanf.zzc(obj, j4) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j10 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzanf.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzanf.zzb(obj, j10)) != 0;
            case 2:
                return zzanf.zzd(obj, j10) != 0;
            case 3:
                return zzanf.zzd(obj, j10) != 0;
            case 4:
                return zzanf.zzc(obj, j10) != 0;
            case 5:
                return zzanf.zzd(obj, j10) != 0;
            case 6:
                return zzanf.zzc(obj, j10) != 0;
            case 7:
                return zzanf.zzw(obj, j10);
            case 8:
                Object objZzf = zzanf.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzajf) {
                    return !zzajf.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzanf.zzf(obj, j10) != null;
            case 10:
                return !zzajf.zzb.equals(zzanf.zzf(obj, j10));
            case 11:
                return zzanf.zzc(obj, j10) != 0;
            case 12:
                return zzanf.zzc(obj, j10) != 0;
            case 13:
                return zzanf.zzc(obj, j10) != 0;
            case 14:
                return zzanf.zzd(obj, j10) != 0;
            case 15:
                return zzanf.zzc(obj, j10) != 0;
            case 16:
                return zzanf.zzd(obj, j10) != 0;
            case 17:
                return zzanf.zzf(obj, j10) != null;
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

    private static boolean zzP(Object obj, int i, zzamb zzambVar) {
        return zzambVar.zzk(zzanf.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzakk) {
            return ((zzakk) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i10) {
        return zzanf.zzc(obj, (long) (zzr(i10) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j4) {
        return ((Boolean) zzanf.zzf(obj, j4)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzajt zzajtVar) throws IOException {
        if (obj instanceof String) {
            zzajtVar.zzF(i, (String) obj);
        } else {
            zzajtVar.zzd(i, (zzajf) obj);
        }
    }

    public static zzamw zzd(Object obj) {
        zzakk zzakkVar = (zzakk) obj;
        zzamw zzamwVar = zzakkVar.zzc;
        if (zzamwVar != zzamw.zzc()) {
            return zzamwVar;
        }
        zzamw zzamwVarZzf = zzamw.zzf();
        zzakkVar.zzc = zzamwVarZzf;
        return zzamwVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:186:0x03af  */
    public static zzals zzl(Class cls, zzalm zzalmVar, zzalu zzaluVar, zzald zzaldVar, zzamv zzamvVar, zzajy zzajyVar, zzalk zzalkVar) {
        int i;
        int iCharAt;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
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
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        char c10;
        int i29;
        int i30;
        Field fieldZzC;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Field fieldZzC2;
        Field fieldZzC3;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        if (!(zzalmVar instanceof zzalz)) {
            throw null;
        }
        zzalz zzalzVar = (zzalz) zzalmVar;
        String strZzd = zzalzVar.zzd();
        int length = strZzd.length();
        char c11 = 55296;
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
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i42 = iCharAt2 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = strZzd.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt2 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt2 == 0) {
            i12 = 0;
            iCharAt = 0;
            i11 = 0;
            i13 = 0;
            i10 = 0;
            i14 = 0;
            iArr = zza;
            i15 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt3 = strZzd.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i23 = i44 + 1;
                    cCharAt8 = strZzd.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i23;
                }
                iCharAt3 = i45 | (cCharAt8 << i46);
                i44 = i23;
            }
            int i47 = i44 + 1;
            int iCharAt4 = strZzd.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    cCharAt7 = strZzd.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                iCharAt4 = i48 | (cCharAt7 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int iCharAt5 = strZzd.charAt(i47);
            if (iCharAt5 >= 55296) {
                int i51 = iCharAt5 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    cCharAt6 = strZzd.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                iCharAt5 = i51 | (cCharAt6 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            int iCharAt6 = strZzd.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    cCharAt5 = strZzd.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                iCharAt6 = i54 | (cCharAt5 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            iCharAt = strZzd.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    cCharAt4 = strZzd.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            int iCharAt7 = strZzd.charAt(i56);
            if (iCharAt7 >= 55296) {
                int i60 = iCharAt7 & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    cCharAt3 = strZzd.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                iCharAt7 = i60 | (cCharAt3 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            int iCharAt8 = strZzd.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    cCharAt2 = strZzd.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                iCharAt8 = i63 | (cCharAt2 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int iCharAt9 = strZzd.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i16 = i65 + 1;
                    cCharAt = strZzd.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i16;
                }
                iCharAt9 = i66 | (cCharAt << i67);
                i65 = i16;
            }
            i10 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i68 = iCharAt7;
            i11 = iCharAt5;
            i12 = i68;
            iArr = iArr2;
            i13 = iCharAt6;
            i14 = iCharAt9;
            i15 = iCharAt3;
            i41 = i65;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzalzVar.zze();
        Class<?> cls2 = zzalzVar.zza().getClass();
        int i69 = i14 + i12;
        int i70 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i70];
        int i71 = i14;
        int i72 = i69;
        int i73 = 0;
        int i74 = 0;
        while (i41 < length) {
            int i75 = i41 + 1;
            int iCharAt10 = strZzd.charAt(i41);
            if (iCharAt10 >= c11) {
                int i76 = iCharAt10 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i38 = i77 + 1;
                    cCharAt12 = strZzd.charAt(i77);
                    if (cCharAt12 < c11) {
                        break;
                    }
                    i76 |= (cCharAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i38;
                }
                iCharAt10 = i76 | (cCharAt12 << i78);
                i24 = i38;
            } else {
                i24 = i75;
            }
            int i79 = i24 + 1;
            int iCharAt11 = strZzd.charAt(i24);
            if (iCharAt11 >= c11) {
                int i80 = iCharAt11 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i37 = i81 + 1;
                    cCharAt11 = strZzd.charAt(i81);
                    if (cCharAt11 < c11) {
                        break;
                    }
                    i80 |= (cCharAt11 & 8191) << i82;
                    i82 += 13;
                    i81 = i37;
                }
                iCharAt11 = i80 | (cCharAt11 << i82);
                i25 = i37;
            } else {
                i25 = i79;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i74] = i73;
                i74++;
            }
            int i83 = iCharAt11 & 255;
            zzalz zzalzVar2 = zzalzVar;
            int i84 = iCharAt11 & 2048;
            if (i83 >= 51) {
                int i85 = i25 + 1;
                int iCharAt12 = strZzd.charAt(i25);
                char c12 = 55296;
                if (iCharAt12 >= 55296) {
                    int i86 = iCharAt12 & 8191;
                    int i87 = i85;
                    int i88 = 13;
                    while (true) {
                        i36 = i87 + 1;
                        cCharAt10 = strZzd.charAt(i87);
                        if (cCharAt10 < c12) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i88;
                        i88 += 13;
                        i87 = i36;
                        c12 = 55296;
                    }
                    iCharAt12 = i86 | (cCharAt10 << i88);
                    i34 = i36;
                } else {
                    i34 = i85;
                }
                int i89 = i34;
                int i90 = i83 - 51;
                i26 = length;
                if (i90 == 9 || i90 == 17) {
                    objArr[a.v(i73, 3, 1)] = objArrZze[i10];
                    i35 = i84;
                    i10++;
                } else if (i90 != 12) {
                    i35 = i84;
                } else if (zzalzVar2.zzc() == 1 || i84 != 0) {
                    objArr[a.v(i73, 3, 1)] = objArrZze[i10];
                    i10++;
                    i35 = i84;
                } else {
                    i35 = 0;
                }
                int i91 = iCharAt12 + iCharAt12;
                Object obj = objArrZze[i91];
                i84 = i35;
                if (obj instanceof Field) {
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i91] = fieldZzC2;
                }
                int i92 = i15;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC2);
                int i93 = i91 + 1;
                Object obj2 = objArrZze[i93];
                i27 = i92;
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i93] = fieldZzC3;
                }
                i28 = i10;
                i29 = i89;
                i30 = 0;
                c10 = 55296;
                i73 = i73;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                objArr = objArr;
            } else {
                i26 = length;
                i27 = i15;
                int i94 = i10 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i10]);
                if (i83 == 9 || i83 == 17) {
                    i28 = i94;
                    objArr[a.v(i73, 3, 1)] = fieldZzC4.getType();
                } else {
                    if (i83 != 27) {
                        if (i83 == 49) {
                            i33 = i10 + 2;
                            i31 = 1;
                            i32 = 3;
                        } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                            i28 = i94;
                            if (zzalzVar2.zzc() == 1 || i84 != 0) {
                                i33 = i10 + 2;
                                objArr[a.v(i73, 3, 1)] = objArrZze[i28];
                                i28 = i33;
                            } else {
                                i84 = 0;
                            }
                        } else if (i83 == 50) {
                            int i95 = i10 + 2;
                            int i96 = i71 + 1;
                            iArr[i71] = i73;
                            int i97 = i73 / 3;
                            int i98 = i97 + i97;
                            objArr[i98] = objArrZze[i94];
                            if (i84 != 0) {
                                objArr[i98 + 1] = objArrZze[i95];
                                i71 = i96;
                                i28 = i10 + 3;
                            } else {
                                i71 = i96;
                                i84 = 0;
                                i28 = i95;
                            }
                        } else {
                            i28 = i94;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i83 > 17) {
                            c10 = 55296;
                            i29 = i25;
                            i30 = 0;
                        } else {
                            int i99 = i25 + 1;
                            int iCharAt13 = strZzd.charAt(i25);
                            if (iCharAt13 >= 55296) {
                                int i100 = iCharAt13 & 8191;
                                int i101 = 13;
                                while (true) {
                                    i29 = i99 + 1;
                                    cCharAt9 = strZzd.charAt(i99);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i100 |= (cCharAt9 & 8191) << i101;
                                    i101 += 13;
                                    i99 = i29;
                                }
                                iCharAt13 = i100 | (cCharAt9 << i101);
                            } else {
                                i29 = i99;
                            }
                            int i102 = (iCharAt13 / 32) + i27 + i27;
                            Object obj3 = objArrZze[i102];
                            if (obj3 instanceof Field) {
                                fieldZzC = (Field) obj3;
                            } else {
                                fieldZzC = zzC(cls2, (String) obj3);
                                objArrZze[i102] = fieldZzC;
                            }
                            i30 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC);
                            c10 = 55296;
                        }
                        if (i83 >= 18 && i83 <= 49) {
                            iArr[i72] = iObjectFieldOffset;
                            i72++;
                        }
                    } else {
                        i31 = 1;
                        i32 = 3;
                        i33 = i10 + 2;
                    }
                    objArr[a.v(i73, i32, i31)] = objArrZze[i94];
                    i28 = i33;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    c10 = 55296;
                    i29 = i25;
                    i30 = 0;
                } else {
                    c10 = 55296;
                    i29 = i25;
                    i30 = 0;
                }
                if (i83 >= 18) {
                    iArr[i72] = iObjectFieldOffset;
                    i72++;
                }
            }
            int i103 = i73 + 1;
            iArr3[i73] = iCharAt10;
            int i104 = i73 + 2;
            iArr3[i103] = iObjectFieldOffset | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i84 != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20);
            iArr3[i104] = (i30 << 20) | iObjectFieldOffset2;
            objArr = objArr;
            i73 += 3;
            c11 = c10;
            i41 = i29;
            zzalzVar = zzalzVar2;
            i10 = i28;
            length = i26;
            i15 = i27;
        }
        zzalz zzalzVar3 = zzalzVar;
        return new zzals(iArr3, objArr, i11, i13, zzalzVar3.zza(), zzalzVar3.zzc(), false, iArr, i14, i69, zzaluVar, zzaldVar, zzamvVar, zzajyVar, zzalkVar);
    }

    private static double zzn(Object obj, long j4) {
        return ((Double) zzanf.zzf(obj, j4)).doubleValue();
    }

    private static float zzo(Object obj, long j4) {
        return ((Float) zzanf.zzf(obj, j4)).floatValue();
    }

    private static int zzp(Object obj, long j4) {
        return ((Integer) zzanf.zzf(obj, j4)).intValue();
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
        return ((Long) zzanf.zzf(obj, j4)).longValue();
    }

    private final zzako zzw(int i) {
        int i10 = i / 3;
        return (zzako) this.zzd[i10 + i10 + 1];
    }

    private final zzamb zzx(int i) {
        Object[] objArr = this.zzd;
        int i10 = i / 3;
        int i11 = i10 + i10;
        zzamb zzambVar = (zzamb) objArr[i11];
        if (zzambVar != null) {
            return zzambVar;
        }
        zzamb zzambVarZzb = zzalx.zza().zzb((Class) objArr[i11 + 1]);
        this.zzd[i11] = zzambVarZzb;
        return zzambVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzamv zzamvVar, Object obj3) {
        int i10 = this.zzc[i];
        Object objZzf = zzanf.zzf(obj, zzu(i) & 1048575);
        if (objZzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i10 = i / 3;
        return this.zzd[i10 + i10];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:152:0x03de  */
    /* JADX WARN: Code duplicated, block: B:206:0x0521  */
    /* JADX WARN: Code duplicated, block: B:89:0x0214  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final int zza(Object obj) {
        int i;
        int iZzh;
        int iZzA;
        int size;
        int iZzl;
        int iZzA2;
        int iZzd;
        boolean z4;
        int iZzb;
        int iZzz;
        int iZzA3;
        int iZzA4;
        int size2;
        int iZzk;
        int iZzA5;
        int size3;
        int iZzi;
        int iZzA6;
        int i10;
        int iZze;
        int iZzA7;
        int iZzA8;
        int iZzB;
        zzals<T> zzalsVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int iX = 0;
        while (i13 < zzalsVar.zzc.length) {
            int iZzu = zzalsVar.zzu(i13);
            int iZzt = zzt(iZzu);
            int[] iArr = zzalsVar.zzc;
            int i15 = iArr[i13];
            int i16 = iArr[i13 + 2];
            int i17 = i16 & i11;
            if (iZzt <= 17) {
                if (i17 != i12) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj2, i17);
                    i12 = i17;
                }
                i = 1 << (i16 >>> 20);
            } else {
                i = 0;
            }
            int i18 = iZzu & i11;
            if (iZzt >= zzakd.zzJ.zza()) {
                zzakd.zzW.zza();
            }
            long j4 = i18;
            switch (iZzt) {
                case 0:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX = a.x(i15 << 3, 8, iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 1:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX = a.x(i15 << 3, 4, iX);
                    }
                    zzalsVar = this;
                    obj2 = obj;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 2:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX = a.x(i15 << 3, zzajs.zzB(unsafe.getLong(obj2, j4)), iX);
                    }
                    zzalsVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 3:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX = a.x(i15 << 3, zzajs.zzB(unsafe.getLong(obj2, j4)), iX);
                    }
                    zzalsVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 4:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX = a.x(i15 << 3, zzajs.zzx(unsafe.getInt(obj2, j4)), iX);
                    }
                    zzalsVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 5:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX = a.x(i15 << 3, 8, iX);
                    }
                    zzalsVar = this;
                    obj2 = obj;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 6:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX = a.x(i15 << 3, 4, iX);
                    }
                    zzalsVar = this;
                    obj2 = obj;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 7:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX = a.x(i15 << 3, 1, iX);
                    }
                    zzalsVar = this;
                    obj2 = obj;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 8:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj2, j4);
                        if (object instanceof zzajf) {
                            int i20 = zzajs.zzf;
                            int iZzd2 = ((zzajf) object).zzd();
                            iX = a.x(i19, zzajs.zzA(iZzd2) + iZzd2, iX);
                        } else {
                            iX = a.x(i19, zzajs.zzz((String) object), iX);
                        }
                    }
                    zzalsVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 9:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iZzh = zzamd.zzh(i15, unsafe.getObject(obj2, j4), zzalsVar.zzx(i13));
                        iX += iZzh;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 10:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        zzajf zzajfVar = (zzajf) unsafe.getObject(obj2, j4);
                        int i21 = zzajs.zzf;
                        int iZzd3 = zzajfVar.zzd();
                        iX = a.x(i15 << 3, zzajs.zzA(iZzd3) + iZzd3, iX);
                    }
                    zzalsVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 11:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX = a.x(i15 << 3, zzajs.zzA(unsafe.getInt(obj2, j4)), iX);
                    }
                    zzalsVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 12:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX = a.x(i15 << 3, zzajs.zzx(unsafe.getInt(obj2, j4)), iX);
                    }
                    zzalsVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 13:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX = a.x(i15 << 3, 4, iX);
                    }
                    zzalsVar = this;
                    obj2 = obj;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 14:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX = a.x(i15 << 3, 8, iX);
                    }
                    zzalsVar = this;
                    obj2 = obj;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 15:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        int i22 = unsafe.getInt(obj2, j4);
                        iX = a.x((i22 >> 31) ^ (i22 + i22), zzajs.zzA(i15 << 3), iX);
                    }
                    zzalsVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 16:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        long j10 = unsafe.getLong(obj2, j4);
                        iX += zzajs.zzB((j10 >> 63) ^ (j10 + j10)) + zzajs.zzA(i15 << 3);
                    }
                    zzalsVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 17:
                    if (zzalsVar.zzO(obj2, i13, i12, i14, i)) {
                        iX += zzajs.zzw(i15, (zzalp) unsafe.getObject(obj2, j4), zzalsVar.zzx(i13));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 18:
                    iZzh = zzamd.zzd(i15, (List) unsafe.getObject(obj2, j4), false);
                    iX += iZzh;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 19:
                    iZzh = zzamd.zzb(i15, (List) unsafe.getObject(obj2, j4), false);
                    iX += iZzh;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j4);
                    int i23 = zzamd.zza;
                    if (list.size() == 0) {
                        iZzA = 0;
                    } else {
                        iZzA = (zzajs.zzA(i15 << 3) * list.size()) + zzamd.zzg(list);
                    }
                    iX += iZzA;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    List list2 = (List) unsafe.getObject(obj2, j4);
                    int i24 = zzamd.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzA = 0;
                    } else {
                        iZzl = zzamd.zzl(list2);
                        iZzA2 = zzajs.zzA(i15 << 3);
                        iZzA = (iZzA2 * size) + iZzl;
                    }
                    iX += iZzA;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j4);
                    int i25 = zzamd.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzA = 0;
                    } else {
                        iZzl = zzamd.zzf(list3);
                        iZzA2 = zzajs.zzA(i15 << 3);
                        iZzA = (iZzA2 * size) + iZzl;
                    }
                    iX += iZzA;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 23:
                    iZzd = zzamd.zzd(i15, (List) unsafe.getObject(obj2, j4), false);
                    iX += iZzd;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 24:
                    z4 = false;
                    iZzb = zzamd.zzb(i15, (List) unsafe.getObject(obj2, j4), false);
                    iX += iZzb;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j4);
                    int i26 = zzamd.zza;
                    int size4 = list4.size();
                    if (size4 == 0) {
                        iZzd = 0;
                    } else {
                        iZzd = size4 * (zzajs.zzA(i15 << 3) + 1);
                    }
                    iX += iZzd;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j4);
                    int i27 = zzamd.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzz = 0;
                    } else {
                        boolean z10 = list5 instanceof zzakx;
                        int iZzA9 = zzajs.zzA(i15 << 3) * size5;
                        if (z10) {
                            zzakx zzakxVar = (zzakx) list5;
                            iZzz = iZzA9;
                            for (int i28 = 0; i28 < size5; i28++) {
                                Object objZzf = zzakxVar.zzf(i28);
                                if (objZzf instanceof zzajf) {
                                    int iZzd4 = ((zzajf) objZzf).zzd();
                                    iZzz = a.x(iZzd4, iZzd4, iZzz);
                                } else {
                                    iZzz = zzajs.zzz((String) objZzf) + iZzz;
                                }
                            }
                        } else {
                            iZzz = iZzA9;
                            for (int i29 = 0; i29 < size5; i29++) {
                                Object obj3 = list5.get(i29);
                                if (obj3 instanceof zzajf) {
                                    int iZzd5 = ((zzajf) obj3).zzd();
                                    iZzz = a.x(iZzd5, iZzd5, iZzz);
                                } else {
                                    iZzz = zzajs.zzz((String) obj3) + iZzz;
                                }
                            }
                        }
                    }
                    iX += iZzz;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j4);
                    zzamb zzambVarZzx = zzalsVar.zzx(i13);
                    int i30 = zzamd.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzA3 = 0;
                    } else {
                        iZzA3 = zzajs.zzA(i15 << 3) * size6;
                        for (int i31 = 0; i31 < size6; i31++) {
                            Object obj4 = list6.get(i31);
                            if (obj4 instanceof zzakv) {
                                int iZza = ((zzakv) obj4).zza();
                                iZzA3 = a.x(iZza, iZza, iZzA3);
                            } else {
                                iZzA3 = zzajs.zzy((zzalp) obj4, zzambVarZzx) + iZzA3;
                            }
                        }
                    }
                    iX += iZzA3;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j4);
                    int i32 = zzamd.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzA4 = zzajs.zzA(i15 << 3) * size7;
                        for (int i33 = 0; i33 < list7.size(); i33++) {
                            int iZzd6 = ((zzajf) list7.get(i33)).zzd();
                            iZzA4 = a.x(iZzd6, iZzd6, iZzA4);
                        }
                    }
                    iX += iZzA4;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j4);
                    int i34 = zzamd.zza;
                    size2 = list8.size();
                    if (size2 == 0) {
                        iZzd = 0;
                    } else {
                        iZzk = zzamd.zzk(list8);
                        iZzA5 = zzajs.zzA(i15 << 3);
                        iZzd = iZzk + (iZzA5 * size2);
                    }
                    iX += iZzd;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j4);
                    int i35 = zzamd.zza;
                    size2 = list9.size();
                    if (size2 == 0) {
                        iZzd = 0;
                    } else {
                        iZzk = zzamd.zza(list9);
                        iZzA5 = zzajs.zzA(i15 << 3);
                        iZzd = iZzk + (iZzA5 * size2);
                    }
                    iX += iZzd;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 31:
                    iZzd = zzamd.zzb(i15, (List) unsafe.getObject(obj2, j4), false);
                    iX += iZzd;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    z4 = false;
                    iZzb = zzamd.zzd(i15, (List) unsafe.getObject(obj2, j4), false);
                    iX += iZzb;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j4);
                    int i36 = zzamd.zza;
                    size3 = list10.size();
                    if (size3 == 0) {
                        i10 = 0;
                    } else {
                        iZzi = zzamd.zzi(list10);
                        iZzA6 = zzajs.zzA(i15 << 3);
                        i10 = (iZzA6 * size3) + iZzi;
                    }
                    iX += i10;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j4);
                    int i37 = zzamd.zza;
                    size3 = list11.size();
                    if (size3 == 0) {
                        i10 = 0;
                    } else {
                        iZzi = zzamd.zzj(list11);
                        iZzA6 = zzajs.zzA(i15 << 3);
                        i10 = (iZzA6 * size3) + iZzi;
                    }
                    iX += i10;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 35:
                    iZze = zzamd.zze((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 36:
                    iZze = zzamd.zzc((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 37:
                    iZze = zzamd.zzg((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 38:
                    iZze = zzamd.zzl((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 39:
                    iZze = zzamd.zzf((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 40:
                    iZze = zzamd.zze((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 41:
                    iZze = zzamd.zzc((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j4);
                    int i38 = zzamd.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 43:
                    iZze = zzamd.zzk((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 44:
                    iZze = zzamd.zza((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 45:
                    iZze = zzamd.zzc((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 46:
                    iZze = zzamd.zze((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 47:
                    iZze = zzamd.zzi((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 48:
                    iZze = zzamd.zzj((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzA7 = zzajs.zzA(iZze);
                        iZzA8 = zzajs.zzA(i15 << 3);
                        iZzB = iZzA8 + iZzA7;
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j4);
                    zzamb zzambVarZzx2 = zzalsVar.zzx(i13);
                    int i39 = zzamd.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        i10 = 0;
                    } else {
                        int iZzw = 0;
                        for (int i40 = 0; i40 < size8; i40++) {
                            iZzw += zzajs.zzw(i15, (zzalp) list13.get(i40), zzambVarZzx2);
                        }
                        i10 = iZzw;
                    }
                    iX += i10;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 50:
                    zzalj zzaljVar = (zzalj) unsafe.getObject(obj2, j4);
                    if (!zzaljVar.isEmpty()) {
                        Iterator it = zzaljVar.entrySet().iterator();
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
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX = a.x(i15 << 3, 8, iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 52:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX = a.x(i15 << 3, 4, iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 53:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX = a.x(i15 << 3, zzajs.zzB(zzv(obj2, j4)), iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 54:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX = a.x(i15 << 3, zzajs.zzB(zzv(obj2, j4)), iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 55:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX = a.x(i15 << 3, zzajs.zzx(zzp(obj2, j4)), iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 56:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX = a.x(i15 << 3, 8, iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 57:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX = a.x(i15 << 3, 4, iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 58:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX = a.x(i15 << 3, 1, iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 59:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        int i41 = i15 << 3;
                        Object object2 = unsafe.getObject(obj2, j4);
                        if (object2 instanceof zzajf) {
                            int i42 = zzajs.zzf;
                            int iZzd7 = ((zzajf) object2).zzd();
                            iX = a.x(i41, zzajs.zzA(iZzd7) + iZzd7, iX);
                        } else {
                            iX = a.x(i41, zzajs.zzz((String) object2), iX);
                        }
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 60:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iZzd = zzamd.zzh(i15, unsafe.getObject(obj2, j4), zzalsVar.zzx(i13));
                        iX += iZzd;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 61:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        zzajf zzajfVar2 = (zzajf) unsafe.getObject(obj2, j4);
                        int i43 = zzajs.zzf;
                        int iZzd8 = zzajfVar2.zzd();
                        iX = a.x(i15 << 3, zzajs.zzA(iZzd8) + iZzd8, iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 62:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX = a.x(i15 << 3, zzajs.zzA(zzp(obj2, j4)), iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 63:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX = a.x(i15 << 3, zzajs.zzx(zzp(obj2, j4)), iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX = a.x(i15 << 3, 4, iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 65:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX = a.x(i15 << 3, 8, iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 66:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        int iZzp = zzp(obj2, j4);
                        iX = a.x((iZzp >> 31) ^ (iZzp + iZzp), zzajs.zzA(i15 << 3), iX);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 67:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        long jZzv = zzv(obj2, j4);
                        iZze = zzajs.zzA(i15 << 3);
                        iZzB = zzajs.zzB((jZzv >> 63) ^ (jZzv + jZzv));
                        iX += iZzB + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 68:
                    if (zzalsVar.zzR(obj2, i15, i13)) {
                        iX += zzajs.zzw(i15, (zzalp) unsafe.getObject(obj2, j4), zzalsVar.zzx(i13));
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
        zzamv zzamvVar = zzalsVar.zzn;
        int iZza2 = iX + zzamvVar.zza(zzamvVar.zzd(obj2));
        if (!zzalsVar.zzh) {
            return iZza2;
        }
        zzalsVar.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int iZzc;
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
                    jDoubleToLongBits = Double.doubleToLongBits(zzanf.zza(obj, j4));
                    byte[] bArr = zzakq.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzanf.zzb(obj, j4));
                    i12 = iFloatToIntBits + i10;
                    break;
                case 2:
                    i = i12 * 53;
                    jDoubleToLongBits = zzanf.zzd(obj, j4);
                    byte[] bArr2 = zzakq.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 3:
                    i = i12 * 53;
                    jDoubleToLongBits = zzanf.zzd(obj, j4);
                    byte[] bArr3 = zzakq.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 4:
                    i = i12 * 53;
                    iZzc = zzanf.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 5:
                    i = i12 * 53;
                    jDoubleToLongBits = zzanf.zzd(obj, j4);
                    byte[] bArr4 = zzakq.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 6:
                    i = i12 * 53;
                    iZzc = zzanf.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzakq.zza(zzanf.zzw(obj, j4));
                    i12 = iFloatToIntBits + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iFloatToIntBits = ((String) zzanf.zzf(obj, j4)).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object objZzf = zzanf.zzf(obj, j4);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzanf.zzf(obj, j4).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 11:
                    i = i12 * 53;
                    iZzc = zzanf.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 12:
                    i = i12 * 53;
                    iZzc = zzanf.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 13:
                    i = i12 * 53;
                    iZzc = zzanf.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 14:
                    i = i12 * 53;
                    jDoubleToLongBits = zzanf.zzd(obj, j4);
                    byte[] bArr5 = zzakq.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 15:
                    i = i12 * 53;
                    iZzc = zzanf.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 16:
                    i = i12 * 53;
                    jDoubleToLongBits = zzanf.zzd(obj, j4);
                    byte[] bArr6 = zzakq.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object objZzf2 = zzanf.zzf(obj, j4);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
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
                    iFloatToIntBits = zzanf.zzf(obj, j4).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzanf.zzf(obj, j4).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j4));
                        byte[] bArr7 = zzakq.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
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
                        byte[] bArr8 = zzakq.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                    }
                    break;
                case 54:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr9 = zzakq.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                    }
                    break;
                case 55:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzc = zzp(obj, j4);
                        i12 = i + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr10 = zzakq.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                    }
                    break;
                case 57:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzc = zzp(obj, j4);
                        i12 = i + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzakq.zza(zzS(obj, j4));
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
                case 59:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = ((String) zzanf.zzf(obj, j4)).hashCode();
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
                case 60:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzanf.zzf(obj, j4).hashCode();
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
                case 61:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzanf.zzf(obj, j4).hashCode();
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
                case 62:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzc = zzp(obj, j4);
                        i12 = i + iZzc;
                    }
                    break;
                case 63:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzc = zzp(obj, j4);
                        i12 = i + iZzc;
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzc = zzp(obj, j4);
                        i12 = i + iZzc;
                    }
                    break;
                case 65:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr11 = zzakq.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                    }
                    break;
                case 66:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        iZzc = zzp(obj, j4);
                        i12 = i + iZzc;
                    }
                    break;
                case 67:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr12 = zzakq.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzanf.zzf(obj, j4).hashCode();
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzn.zzd(obj).hashCode() + (i12 * 53);
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34301. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.p002firebaseauthapi.zzais r36) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzals.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzais):int");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final Object zze() {
        return ((zzakk) this.zzg).zzw();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzakk) {
                zzakk zzakkVar = (zzakk) obj;
                zzakkVar.zzI(f.API_PRIORITY_OTHER);
                zzakkVar.zza = 0;
                zzakkVar.zzG();
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
                                this.zzm.zzb(obj, j4);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    ((zzalj) object).zzc();
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
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zze(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
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
                        zzanf.zzo(obj, j4, zzanf.zza(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        zzanf.zzp(obj, j4, zzanf.zzb(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i)) {
                        zzanf.zzr(obj, j4, zzanf.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i)) {
                        zzanf.zzr(obj, j4, zzanf.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i)) {
                        zzanf.zzq(obj, j4, zzanf.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i)) {
                        zzanf.zzr(obj, j4, zzanf.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i)) {
                        zzanf.zzq(obj, j4, zzanf.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i)) {
                        zzanf.zzm(obj, j4, zzanf.zzw(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i)) {
                        zzanf.zzs(obj, j4, zzanf.zzf(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzanf.zzs(obj, j4, zzanf.zzf(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        zzanf.zzq(obj, j4, zzanf.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i)) {
                        zzanf.zzq(obj, j4, zzanf.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        zzanf.zzq(obj, j4, zzanf.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        zzanf.zzr(obj, j4, zzanf.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        zzanf.zzq(obj, j4, zzanf.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        zzanf.zzr(obj, j4, zzanf.zzd(obj2, j4));
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
                    this.zzm.zzc(obj, obj2, j4);
                    break;
                case 50:
                    int i12 = zzamd.zza;
                    zzanf.zzs(obj, j4, zzalk.zzb(zzanf.zzf(obj, j4), zzanf.zzf(obj2, j4)));
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
                        zzanf.zzs(obj, j4, zzanf.zzf(obj2, j4));
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
                        zzanf.zzs(obj, j4, zzanf.zzf(obj2, j4));
                        zzI(obj, i11, i);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzamd.zzq(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:191:0x077c A[Catch: all -> 0x07a9, TryCatch #6 {all -> 0x07a9, blocks: (B:24:0x0059, B:85:0x0136, B:189:0x0777, B:191:0x077c, B:192:0x0781, B:86:0x0148, B:87:0x0160, B:88:0x0178, B:89:0x0190, B:90:0x01a8, B:92:0x01b8, B:95:0x01bf, B:96:0x01c5, B:97:0x01d3, B:98:0x01eb, B:99:0x01ff, B:100:0x0217, B:101:0x0225, B:102:0x023d, B:103:0x0255, B:104:0x026d, B:105:0x0285, B:106:0x029d, B:107:0x02b5, B:108:0x02cd, B:109:0x02e5, B:111:0x02fb, B:113:0x0301, B:115:0x031c, B:116:0x0320, B:114:0x0311, B:117:0x0321, B:118:0x0339, B:119:0x034d, B:120:0x0361, B:121:0x0375, B:122:0x0389, B:131:0x03bc, B:132:0x03ca, B:133:0x03de, B:134:0x03f2, B:135:0x0406, B:136:0x041a, B:137:0x042e, B:138:0x0442, B:139:0x0456, B:140:0x046a, B:141:0x047e, B:142:0x0492, B:143:0x04a6, B:144:0x04ba, B:149:0x04e1, B:150:0x04ef, B:151:0x0503, B:152:0x051b, B:154:0x0527, B:155:0x0539, B:156:0x054b, B:157:0x055f, B:158:0x0573, B:159:0x0587, B:160:0x059b, B:161:0x05af, B:162:0x05c3, B:163:0x05d7, B:164:0x05eb, B:165:0x0603, B:166:0x0618, B:167:0x062d, B:168:0x0642, B:169:0x0657, B:171:0x0667, B:174:0x066e, B:175:0x0674, B:176:0x067f, B:177:0x0694, B:178:0x06a9, B:179:0x06c1, B:180:0x06cf, B:181:0x06e4, B:182:0x06f9, B:183:0x070e, B:184:0x0723, B:185:0x0738, B:186:0x074d, B:187:0x0762), top: B:226:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x078e A[LOOP:5: B:195:0x078a->B:197:0x078e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:202:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:210:0x07b7 A[LOOP:1: B:208:0x07b3->B:210:0x07b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:213:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:241:0x0787 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzh(Object obj, zzama zzamaVar, zzajx zzajxVar) throws Throwable {
        Object obj2;
        int i;
        Object objZzy;
        Object obj3;
        zzajy zzajyVar;
        zzajx zzajxVar2;
        zzamv zzamvVar;
        Object obj4;
        zzamv zzamvVar2;
        zzals<T> zzalsVar;
        Object obj5;
        zzamv zzamvVar3;
        int i10;
        Object objZzy2;
        Object obj6;
        Object objZzo;
        zzals<T> zzalsVar2;
        zzals<T> zzalsVar3 = this;
        zzajx zzajxVar3 = zzajxVar;
        zzajxVar3.getClass();
        zzD(obj);
        zzamv zzamvVar4 = zzalsVar3.zzn;
        zzajy zzajyVar2 = zzalsVar3.zzo;
        Object objZzc = null;
        zzakc zzakcVarZzb = null;
        while (true) {
            try {
                int iZzc = zzamaVar.zzc();
                int iZzq = zzalsVar3.zzq(iZzc);
                if (iZzq >= 0) {
                    zzajyVar = zzajyVar2;
                    zzajxVar2 = zzajxVar3;
                    zzamvVar = zzamvVar4;
                    obj4 = obj;
                    try {
                        int iZzu = zzalsVar3.zzu(iZzq);
                        try {
                            try {
                                switch (zzt(iZzu)) {
                                    case 0:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzo(obj4, iZzu & 1048575, zzamaVar.zza());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 1:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzp(obj4, iZzu & 1048575, zzamaVar.zzb());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 2:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzr(obj4, iZzu & 1048575, zzamaVar.zzl());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 3:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzr(obj4, iZzu & 1048575, zzamaVar.zzo());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 4:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzq(obj4, iZzu & 1048575, zzamaVar.zzg());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 5:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzr(obj4, iZzu & 1048575, zzamaVar.zzk());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 6:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzq(obj4, iZzu & 1048575, zzamaVar.zzf());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 7:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzm(obj4, iZzu & 1048575, zzamaVar.zzN());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 8:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzalsVar.zzG(obj4, iZzu, zzamaVar);
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 9:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzalp zzalpVar = (zzalp) zzalsVar.zzA(obj4, iZzq);
                                        zzamaVar.zzu(zzalpVar, zzalsVar.zzx(iZzq), zzajxVar2);
                                        zzalsVar.zzJ(obj4, iZzq, zzalpVar);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 10:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, zzamaVar.zzp());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 11:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzq(obj4, iZzu & 1048575, zzamaVar.zzj());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 12:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        int iZze = zzamaVar.zze();
                                        zzako zzakoVarZzw = zzalsVar.zzw(iZzq);
                                        if (zzakoVarZzw == null || zzakoVarZzw.zza()) {
                                            zzanf.zzq(obj4, iZzu & 1048575, iZze);
                                            zzalsVar.zzH(obj4, iZzq);
                                        } else {
                                            objZzc = zzamd.zzp(obj4, iZzc, iZze, objZzc, zzamvVar4);
                                        }
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 13:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzq(obj4, iZzu & 1048575, zzamaVar.zzh());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 14:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzr(obj4, iZzu & 1048575, zzamaVar.zzm());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 15:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzq(obj4, iZzu & 1048575, zzamaVar.zzi());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 16:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzr(obj4, iZzu & 1048575, zzamaVar.zzn());
                                        zzalsVar.zzH(obj4, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 17:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzalp zzalpVar2 = (zzalp) zzalsVar.zzA(obj4, iZzq);
                                        zzamaVar.zzt(zzalpVar2, zzalsVar.zzx(iZzq), zzajxVar2);
                                        zzalsVar.zzJ(obj4, iZzq, zzalpVar2);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 18:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzx(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 19:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzB(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 20:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzE(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case zzbbs.zzt.zzm /* 21 */:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzM(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 22:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzD(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 23:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzA(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 24:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzz(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 25:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzv(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 26:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        if (zzM(iZzu)) {
                                            ((zzajm) zzamaVar).zzK(zzalsVar.zzm.zza(obj4, iZzu & 1048575), true);
                                        } else {
                                            ((zzajm) zzamaVar).zzK(zzalsVar.zzm.zza(obj4, iZzu & 1048575), false);
                                        }
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 27:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzF(zzalsVar.zzm.zza(obj4, iZzu & 1048575), zzalsVar.zzx(iZzq), zzajxVar2);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 28:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzw(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 29:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzL(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 30:
                                        zzalsVar = zzalsVar3;
                                        List listZza = zzalsVar.zzm.zza(obj4, iZzu & 1048575);
                                        zzamaVar.zzy(listZza);
                                        objZzo = zzamd.zzo(obj4, iZzc, listZza, zzalsVar.zzw(iZzq), objZzc, zzamvVar);
                                        zzamvVar4 = zzamvVar;
                                        objZzc = objZzo;
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 31:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzG(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzH(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 33:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzI(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 34:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzJ(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 35:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzx(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 36:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzB(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 37:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzE(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 38:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzM(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 39:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzD(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 40:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzA(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 41:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzz(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 42:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzv(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 43:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzL(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 44:
                                        zzalsVar = zzalsVar3;
                                        obj5 = obj4;
                                        List listZza2 = zzalsVar.zzm.zza(obj5, iZzu & 1048575);
                                        zzamaVar.zzy(listZza2);
                                        zzako zzakoVarZzw2 = zzalsVar.zzw(iZzq);
                                        Object obj7 = objZzc;
                                        try {
                                            objZzo = zzamd.zzo(obj5, iZzc, listZza2, zzakoVarZzw2, obj7, zzamvVar);
                                            zzamvVar4 = zzamvVar;
                                            objZzc = objZzo;
                                        } catch (zzakr unused) {
                                            zzamvVar3 = zzamvVar;
                                            objZzc = obj7;
                                            zzamvVar4 = zzamvVar3;
                                            zzamvVar4.zzq(zzamaVar);
                                            if (objZzc == null) {
                                                objZzc = zzamvVar4.zzc(obj5);
                                            }
                                            if (!zzamvVar4.zzp(objZzc, zzamaVar)) {
                                                i10 = zzalsVar.zzk;
                                                objZzy2 = objZzc;
                                                while (i10 < zzalsVar.zzl) {
                                                    Object obj8 = obj5;
                                                    objZzy2 = zzalsVar.zzy(obj8, zzalsVar.zzj[i10], objZzy2, zzamvVar4, obj);
                                                    i10++;
                                                    obj5 = obj8;
                                                }
                                                obj6 = obj5;
                                                if (objZzy2 != null) {
                                                    zzamvVar4.zzn(obj6, objZzy2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            zzamvVar2 = zzamvVar;
                                            objZzc = obj7;
                                            zzamvVar4 = zzamvVar2;
                                            obj2 = obj5;
                                            zzalsVar3 = zzalsVar;
                                            i = zzalsVar3.zzk;
                                            objZzy = objZzc;
                                            while (i < zzalsVar3.zzl) {
                                                objZzy = zzalsVar3.zzy(obj2, zzalsVar3.zzj[i], objZzy, zzamvVar4, obj);
                                                i++;
                                                zzalsVar3 = this;
                                            }
                                            obj3 = obj2;
                                            if (objZzy != null) {
                                                zzamvVar4.zzn(obj3, objZzy);
                                            }
                                            throw th;
                                        }
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 45:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzG(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 46:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzH(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 47:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzI(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 48:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzJ(zzalsVar.zzm.zza(obj4, iZzu & 1048575));
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 49:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzamaVar.zzC(zzalsVar.zzm.zza(obj4, iZzu & 1048575), zzalsVar.zzx(iZzq), zzajxVar2);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 50:
                                        zzalsVar = zzalsVar3;
                                        obj5 = obj4;
                                        zzamvVar4 = zzamvVar;
                                        Object objZzz = zzalsVar.zzz(iZzq);
                                        long jZzu = zzalsVar.zzu(iZzq) & 1048575;
                                        Object objZzf = zzanf.zzf(obj5, jZzu);
                                        if (objZzf == null) {
                                            objZzf = zzalj.zza().zzb();
                                            zzanf.zzs(obj5, jZzu, objZzf);
                                        } else if (zzalk.zza(objZzf)) {
                                            Object objZzb = zzalj.zza().zzb();
                                            zzalk.zzb(objZzb, objZzf);
                                            zzanf.zzs(obj5, jZzu, objZzb);
                                            objZzf = objZzb;
                                        }
                                        throw null;
                                    case 51:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Double.valueOf(zzamaVar.zza()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 52:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Float.valueOf(zzamaVar.zzb()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 53:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Long.valueOf(zzamaVar.zzl()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 54:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Long.valueOf(zzamaVar.zzo()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 55:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Integer.valueOf(zzamaVar.zzg()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 56:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Long.valueOf(zzamaVar.zzk()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 57:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Integer.valueOf(zzamaVar.zzf()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 58:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Boolean.valueOf(zzamaVar.zzN()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 59:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzalsVar.zzG(obj4, iZzu, zzamaVar);
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 60:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzalp zzalpVar3 = (zzalp) zzalsVar.zzB(obj4, iZzc, iZzq);
                                        zzamaVar.zzu(zzalpVar3, zzalsVar.zzx(iZzq), zzajxVar2);
                                        zzalsVar.zzK(obj4, iZzc, iZzq, zzalpVar3);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 61:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, zzamaVar.zzp());
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 62:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Integer.valueOf(zzamaVar.zzj()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 63:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        int iZze2 = zzamaVar.zze();
                                        zzako zzakoVarZzw3 = zzalsVar.zzw(iZzq);
                                        if (zzakoVarZzw3 == null || zzakoVarZzw3.zza()) {
                                            zzanf.zzs(obj4, iZzu & 1048575, Integer.valueOf(iZze2));
                                            zzalsVar.zzI(obj4, iZzc, iZzq);
                                        } else {
                                            objZzc = zzamd.zzp(obj4, iZzc, iZze2, objZzc, zzamvVar4);
                                        }
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Integer.valueOf(zzamaVar.zzh()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 65:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Long.valueOf(zzamaVar.zzm()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 66:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Integer.valueOf(zzamaVar.zzi()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 67:
                                        zzalsVar = zzalsVar3;
                                        zzamvVar4 = zzamvVar;
                                        zzanf.zzs(obj4, iZzu & 1048575, Long.valueOf(zzamaVar.zzn()));
                                        zzalsVar.zzI(obj4, iZzc, iZzq);
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    case 68:
                                        zzalsVar = zzalsVar3;
                                        obj5 = obj4;
                                        zzamvVar4 = zzamvVar;
                                        try {
                                            zzalp zzalpVar4 = (zzalp) zzalsVar.zzB(obj5, iZzc, iZzq);
                                            zzamaVar.zzt(zzalpVar4, zzalsVar.zzx(iZzq), zzajxVar2);
                                            zzalsVar.zzK(obj5, iZzc, iZzq, zzalpVar4);
                                        } catch (zzakr unused2) {
                                            zzamvVar4.zzq(zzamaVar);
                                            if (objZzc == null) {
                                                objZzc = zzamvVar4.zzc(obj5);
                                            }
                                            if (!zzamvVar4.zzp(objZzc, zzamaVar)) {
                                                i10 = zzalsVar.zzk;
                                                objZzy2 = objZzc;
                                                while (i10 < zzalsVar.zzl) {
                                                    Object obj9 = obj5;
                                                    objZzy2 = zzalsVar.zzy(obj9, zzalsVar.zzj[i10], objZzy2, zzamvVar4, obj);
                                                    i10++;
                                                    obj5 = obj9;
                                                }
                                                obj6 = obj5;
                                                if (objZzy2 != null) {
                                                    zzamvVar4.zzn(obj6, objZzy2);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        zzalsVar3 = zzalsVar;
                                        zzajxVar3 = zzajxVar2;
                                        zzajyVar2 = zzajyVar;
                                        break;
                                    default:
                                        if (objZzc == null) {
                                            objZzc = zzamvVar.zzc(obj4);
                                        }
                                        if (zzamvVar.zzp(objZzc, zzamaVar)) {
                                            zzalsVar = zzalsVar3;
                                            zzamvVar4 = zzamvVar;
                                            zzalsVar3 = zzalsVar;
                                            zzajxVar3 = zzajxVar2;
                                            zzajyVar2 = zzajyVar;
                                        } else {
                                            int i11 = zzalsVar3.zzk;
                                            Object objZzy3 = objZzc;
                                            while (i11 < zzalsVar3.zzl) {
                                                Object obj10 = obj4;
                                                zzamv zzamvVar5 = zzamvVar;
                                                objZzy3 = zzalsVar3.zzy(obj10, zzalsVar3.zzj[i11], objZzy3, zzamvVar5, obj);
                                                i11++;
                                                obj4 = obj10;
                                                zzalsVar3 = zzalsVar3;
                                                zzamvVar = zzamvVar5;
                                            }
                                            zzamv zzamvVar6 = zzamvVar;
                                            zzalsVar2 = zzalsVar3;
                                            Object obj11 = obj4;
                                            if (objZzy3 != null) {
                                                zzamvVar6.zzn(obj11, objZzy3);
                                                return;
                                            }
                                        }
                                        break;
                                }
                            } catch (zzakr unused3) {
                                zzamvVar3 = zzamvVar;
                                zzalsVar = zzalsVar3;
                                obj5 = obj4;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            zzamvVar2 = zzamvVar;
                            zzalsVar = zzalsVar3;
                            obj5 = obj4;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj2 = obj4;
                        zzamvVar4 = zzamvVar;
                        i = zzalsVar3.zzk;
                        objZzy = objZzc;
                        while (i < zzalsVar3.zzl) {
                            objZzy = zzalsVar3.zzy(obj2, zzalsVar3.zzj[i], objZzy, zzamvVar4, obj);
                            i++;
                            zzalsVar3 = this;
                        }
                        obj3 = obj2;
                        if (objZzy != null) {
                            zzamvVar4.zzn(obj3, objZzy);
                        }
                        throw th;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i12 = zzalsVar3.zzk;
                    Object objZzy4 = objZzc;
                    while (i12 < zzalsVar3.zzl) {
                        objZzy4 = zzalsVar3.zzy(obj, zzalsVar3.zzj[i12], objZzy4, zzamvVar4, obj);
                        i12++;
                        zzalsVar3 = zzalsVar3;
                    }
                    zzalsVar2 = zzalsVar3;
                    if (objZzy4 != null) {
                        zzamvVar4.zzn(obj, objZzy4);
                        return;
                    }
                } else {
                    zzalsVar = zzalsVar3;
                    obj5 = obj;
                    try {
                        Object objZzc2 = !zzalsVar.zzh ? null : zzajyVar2.zzc(zzajxVar3, zzalsVar.zzg, iZzc);
                        if (objZzc2 != null) {
                            if (zzakcVarZzb == null) {
                                try {
                                    zzakcVarZzb = zzajyVar2.zzb(obj5);
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj2 = obj5;
                                }
                            }
                            zzakc zzakcVar = zzakcVarZzb;
                            zzamv zzamvVar7 = zzamvVar4;
                            try {
                                objZzc = zzajyVar2.zzd(obj5, zzamaVar, objZzc2, zzajxVar3, zzakcVar, objZzc, zzamvVar7);
                                zzakcVarZzb = zzakcVar;
                                zzamvVar4 = zzamvVar7;
                                zzajyVar = zzajyVar2;
                                zzajxVar2 = zzajxVar3;
                                zzalsVar3 = zzalsVar;
                                zzajxVar3 = zzajxVar2;
                                zzajyVar2 = zzajyVar;
                            } catch (Throwable th5) {
                                th = th5;
                                obj2 = obj5;
                                zzamvVar4 = zzamvVar7;
                            }
                        } else {
                            zzajyVar = zzajyVar2;
                            obj2 = obj5;
                            zzajxVar2 = zzajxVar3;
                            try {
                                zzamvVar4.zzq(zzamaVar);
                                if (objZzc == null) {
                                    try {
                                        objZzc = zzamvVar4.zzc(obj2);
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                }
                                if (!zzamvVar4.zzp(objZzc, zzamaVar)) {
                                    int i13 = zzalsVar.zzk;
                                    Object objZzy5 = objZzc;
                                    while (i13 < zzalsVar.zzl) {
                                        zzals<T> zzalsVar4 = zzalsVar;
                                        objZzy5 = zzalsVar4.zzy(obj2, zzalsVar.zzj[i13], objZzy5, zzamvVar4, obj);
                                        i13++;
                                        zzamvVar4 = zzamvVar4;
                                        zzalsVar = zzalsVar4;
                                    }
                                    zzamv zzamvVar8 = zzamvVar4;
                                    if (objZzy5 != null) {
                                        zzamvVar8.zzn(obj2, objZzy5);
                                        return;
                                    }
                                    return;
                                }
                                zzalsVar3 = zzalsVar;
                                zzamvVar4 = zzamvVar4;
                                zzajxVar3 = zzajxVar2;
                                zzajyVar2 = zzajyVar;
                            } catch (Throwable th7) {
                                th = th7;
                                zzalsVar3 = zzalsVar;
                                zzamvVar = zzamvVar4;
                                zzamvVar4 = zzamvVar;
                                i = zzalsVar3.zzk;
                                objZzy = objZzc;
                                while (i < zzalsVar3.zzl) {
                                    objZzy = zzalsVar3.zzy(obj2, zzalsVar3.zzj[i], objZzy, zzamvVar4, obj);
                                    i++;
                                    zzalsVar3 = this;
                                }
                                obj3 = obj2;
                                if (objZzy != null) {
                                    zzamvVar4.zzn(obj3, objZzy);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzamv zzamvVar9 = zzamvVar4;
                        obj4 = obj5;
                        zzalsVar3 = zzalsVar;
                        zzamvVar = zzamvVar9;
                        obj2 = obj4;
                        zzamvVar4 = zzamvVar;
                        i = zzalsVar3.zzk;
                        objZzy = objZzc;
                        while (i < zzalsVar3.zzl) {
                            objZzy = zzalsVar3.zzy(obj2, zzalsVar3.zzj[i], objZzy, zzamvVar4, obj);
                            i++;
                            zzalsVar3 = this;
                        }
                        obj3 = obj2;
                        if (objZzy != null) {
                            zzamvVar4.zzn(obj3, objZzy);
                        }
                        throw th;
                    }
                    zzalsVar3 = zzalsVar;
                }
            } catch (Throwable th9) {
                th = th9;
                obj2 = obj;
            }
            i = zzalsVar3.zzk;
            objZzy = objZzc;
            while (i < zzalsVar3.zzl) {
                objZzy = zzalsVar3.zzy(obj2, zzalsVar3.zzj[i], objZzy, zzamvVar4, obj);
                i++;
                zzalsVar3 = this;
            }
            obj3 = obj2;
            if (objZzy != null) {
                zzamvVar4.zzn(obj3, objZzy);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzi(Object obj, byte[] bArr, int i, int i10, zzais zzaisVar) throws IOException {
        zzc(obj, bArr, i, i10, 0, zzaisVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzs;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j4 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzanf.zza(obj, j4)) != Double.doubleToLongBits(zzanf.zza(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzanf.zzb(obj, j4)) != Float.floatToIntBits(zzanf.zzb(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzanf.zzd(obj, j4) != zzanf.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzanf.zzd(obj, j4) != zzanf.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzanf.zzc(obj, j4) != zzanf.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzanf.zzd(obj, j4) != zzanf.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzanf.zzc(obj, j4) != zzanf.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzanf.zzw(obj, j4) != zzanf.zzw(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzamd.zzs(zzanf.zzf(obj, j4), zzanf.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzamd.zzs(zzanf.zzf(obj, j4), zzanf.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzamd.zzs(zzanf.zzf(obj, j4), zzanf.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzanf.zzc(obj, j4) != zzanf.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzanf.zzc(obj, j4) != zzanf.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzanf.zzc(obj, j4) != zzanf.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzanf.zzd(obj, j4) != zzanf.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzanf.zzc(obj, j4) != zzanf.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzanf.zzd(obj, j4) != zzanf.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzamd.zzs(zzanf.zzf(obj, j4), zzanf.zzf(obj2, j4))) {
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
                    zZzs = zzamd.zzs(zzanf.zzf(obj, j4), zzanf.zzf(obj2, j4));
                    break;
                case 50:
                    zZzs = zzamd.zzs(zzanf.zzf(obj, j4), zzanf.zzf(obj2, j4));
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
                    if (zzanf.zzc(obj, jZzr) != zzanf.zzc(obj2, jZzr) || !zzamd.zzs(zzanf.zzf(obj, j4), zzanf.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzs) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6 A[LOOP:1: B:46:0x00a5->B:51:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final boolean zzk(Object obj) {
        int i;
        int i10;
        int i11;
        List list;
        zzamb zzambVarZzx;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i16 = iArr[i14];
            int i17 = iArr2[i16];
            int iZzu = zzu(i16);
            int i18 = this.zzc[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = zzb.getInt(obj, i19);
                }
                i = i13;
                i15 = i19;
            } else {
                i = i13;
            }
            if ((268435456 & iZzu) != 0) {
                i10 = i16;
                i11 = i15;
                if (!zzO(obj, i10, i11, i, i20)) {
                    return false;
                }
            } else {
                i10 = i16;
                i11 = i15;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj, i10, i11, i, i20) && !zzP(obj, iZzu, zzx(i10))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (List) zzanf.zzf(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzambVarZzx = zzx(i10);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzambVarZzx.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj, i17, i10) && !zzP(obj, iZzu, zzx(i10))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzanf.zzf(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzambVarZzx = zzx(i10);
                    while (i12 < list.size()) {
                        if (!zzambVarZzx.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzalj) zzanf.zzf(obj, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i14++;
            i15 = i11;
            i13 = i;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamb
    public final void zzm(Object obj, zzajt zzajtVar) throws IOException {
        int i;
        zzals<T> zzalsVar = this;
        if (zzalsVar.zzh) {
            zzalsVar.zzo.zza(obj);
            throw null;
        }
        int[] iArr = zzalsVar.zzc;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < iArr.length) {
            int iZzu = zzalsVar.zzu(i12);
            int[] iArr2 = zzalsVar.zzc;
            int iZzt = zzt(iZzu);
            int i14 = iArr2[i12];
            if (iZzt <= 17) {
                int i15 = iArr2[i12 + 2];
                int i16 = i15 & i10;
                if (i16 != i11) {
                    i13 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i = 1 << (i15 >>> 20);
            } else {
                i = 0;
            }
            long j4 = iZzu & i10;
            switch (iZzt) {
                case 0:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzf(i14, zzanf.zza(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 1:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzo(i14, zzanf.zzb(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 2:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzt(i14, unsafe.getLong(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 3:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzJ(i14, unsafe.getLong(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 4:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzr(i14, unsafe.getInt(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 5:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzm(i14, unsafe.getLong(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 6:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzk(i14, unsafe.getInt(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 7:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzb(i14, zzanf.zzw(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 8:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzT(i14, unsafe.getObject(obj, j4), zzajtVar);
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 9:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzv(i14, unsafe.getObject(obj, j4), zzalsVar.zzx(i12));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 10:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzd(i14, (zzajf) unsafe.getObject(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 11:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzH(i14, unsafe.getInt(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 12:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzi(i14, unsafe.getInt(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 13:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzw(i14, unsafe.getInt(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 14:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzy(i14, unsafe.getLong(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 15:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzA(i14, unsafe.getInt(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 16:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzC(i14, unsafe.getLong(obj, j4));
                    }
                    zzalsVar = this;
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 17:
                    if (zzalsVar.zzO(obj, i12, i11, i13, i)) {
                        zzajtVar.zzq(i14, unsafe.getObject(obj, j4), zzalsVar.zzx(i12));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 18:
                    zzamd.zzu(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 19:
                    zzamd.zzy(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 20:
                    zzamd.zzA(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    zzamd.zzG(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 22:
                    zzamd.zzz(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 23:
                    zzamd.zzx(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 24:
                    zzamd.zzw(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 25:
                    zzamd.zzt(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 26:
                    int i17 = zzalsVar.zzc[i12];
                    List list = (List) unsafe.getObject(obj, j4);
                    int i18 = zzamd.zza;
                    if (list != null && !list.isEmpty()) {
                        zzajtVar.zzG(i17, list);
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 27:
                    int i19 = zzalsVar.zzc[i12];
                    List list2 = (List) unsafe.getObject(obj, j4);
                    zzamb zzambVarZzx = zzalsVar.zzx(i12);
                    int i20 = zzamd.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i21 = 0; i21 < list2.size(); i21++) {
                            zzajtVar.zzv(i19, list2.get(i21), zzambVarZzx);
                        }
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 28:
                    int i22 = zzalsVar.zzc[i12];
                    List list3 = (List) unsafe.getObject(obj, j4);
                    int i23 = zzamd.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzajtVar.zze(i22, list3);
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 29:
                    zzamd.zzF(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 30:
                    zzamd.zzv(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 31:
                    zzamd.zzB(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    zzamd.zzC(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 33:
                    zzamd.zzD(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 34:
                    zzamd.zzE(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, false);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 35:
                    zzamd.zzu(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 36:
                    zzamd.zzy(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 37:
                    zzamd.zzA(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 38:
                    zzamd.zzG(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 39:
                    zzamd.zzz(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 40:
                    zzamd.zzx(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 41:
                    zzamd.zzw(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 42:
                    zzamd.zzt(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 43:
                    zzamd.zzF(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 44:
                    zzamd.zzv(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 45:
                    zzamd.zzB(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 46:
                    zzamd.zzC(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 47:
                    zzamd.zzD(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 48:
                    zzamd.zzE(zzalsVar.zzc[i12], (List) unsafe.getObject(obj, j4), zzajtVar, true);
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 49:
                    int i24 = zzalsVar.zzc[i12];
                    List list4 = (List) unsafe.getObject(obj, j4);
                    zzamb zzambVarZzx2 = zzalsVar.zzx(i12);
                    int i25 = zzamd.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            zzajtVar.zzq(i24, list4.get(i26), zzambVarZzx2);
                        }
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j4) != null) {
                        throw null;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 51:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzf(i14, zzn(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 52:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzo(i14, zzo(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 53:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzt(i14, zzv(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 54:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzJ(i14, zzv(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 55:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzr(i14, zzp(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 56:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzm(i14, zzv(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 57:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzk(i14, zzp(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 58:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzb(i14, zzS(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 59:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzT(i14, unsafe.getObject(obj, j4), zzajtVar);
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 60:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzv(i14, unsafe.getObject(obj, j4), zzalsVar.zzx(i12));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 61:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzd(i14, (zzajf) unsafe.getObject(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 62:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzH(i14, zzp(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 63:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzi(i14, zzp(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzw(i14, zzp(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 65:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzy(i14, zzv(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 66:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzA(i14, zzp(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 67:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzC(i14, zzv(obj, j4));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                case 68:
                    if (zzalsVar.zzR(obj, i14, i12)) {
                        zzajtVar.zzq(i14, unsafe.getObject(obj, j4), zzalsVar.zzx(i12));
                    }
                    i12 += 3;
                    i10 = 1048575;
                    break;
                default:
                    i12 += 3;
                    i10 = 1048575;
                    break;
            }
        }
        zzamv zzamvVar = zzalsVar.zzn;
        zzamvVar.zzr(zzamvVar.zzd(obj), zzajtVar);
    }
}
