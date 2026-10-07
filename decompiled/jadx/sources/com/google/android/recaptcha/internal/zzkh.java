package com.google.android.recaptcha.internal;

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
/* JADX INFO: loaded from: classes3.dex */
final class zzkh<T> implements zzkr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzlv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzke zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzjs zzm;
    private final zzll zzn;
    private final zzif zzo;
    private final zzkk zzp;
    private final zzjz zzq;

    private zzkh(int[] iArr, Object[] objArr, int i, int i10, zzke zzkeVar, int i11, boolean z4, int[] iArr2, int i12, int i13, zzkk zzkkVar, zzjs zzjsVar, zzll zzllVar, zzif zzifVar, zzjz zzjzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i10;
        this.zzi = zzkeVar instanceof zzit;
        boolean z10 = false;
        if (zzifVar != null && zzifVar.zzj(zzkeVar)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzkkVar;
        this.zzm = zzjsVar;
        this.zzn = zzllVar;
        this.zzo = zzifVar;
        this.zzg = zzkeVar;
        this.zzq = zzjzVar;
    }

    private final Object zzA(Object obj, int i) {
        zzkr zzkrVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzkrVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzkrVarZzx.zze();
        if (object != null) {
            zzkrVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i10) {
        zzkr zzkrVarZzx = zzx(i10);
        if (!zzR(obj, i, i10)) {
            return zzkrVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i10) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzkrVarZzx.zze();
        if (object != null) {
            zzkrVarZzx.zzg(objZze, object);
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
            zzkr zzkrVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzkrVarZzx.zze();
                    zzkrVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzQ(object2)) {
                Object objZze2 = zzkrVarZzx.zze();
                zzkrVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzkrVarZzx.zzg(object2, object);
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
            zzkr zzkrVarZzx = zzx(i);
            if (!zzR(obj, i10, i)) {
                if (zzQ(object)) {
                    Object objZze = zzkrVarZzx.zze();
                    zzkrVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzI(obj, i10, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzQ(object2)) {
                Object objZze2 = zzkrVarZzx.zze();
                zzkrVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzkrVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzkq zzkqVar) throws IOException {
        long j4 = i & 1048575;
        if (zzM(i)) {
            zzlv.zzs(obj, j4, zzkqVar.zzs());
        } else if (this.zzi) {
            zzlv.zzs(obj, j4, zzkqVar.zzr());
        } else {
            zzlv.zzs(obj, j4, zzkqVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j4 = 1048575 & iZzr;
        if (j4 == 1048575) {
            return;
        }
        zzlv.zzq(obj, j4, (1 << (iZzr >>> 20)) | zzlv.zzc(obj, j4));
    }

    private final void zzI(Object obj, int i, int i10) {
        zzlv.zzq(obj, zzr(i10) & 1048575, i);
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
            return (zzlv.zzc(obj, j4) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j10 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzlv.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzlv.zzb(obj, j10)) != 0;
            case 2:
                return zzlv.zzd(obj, j10) != 0;
            case 3:
                return zzlv.zzd(obj, j10) != 0;
            case 4:
                return zzlv.zzc(obj, j10) != 0;
            case 5:
                return zzlv.zzd(obj, j10) != 0;
            case 6:
                return zzlv.zzc(obj, j10) != 0;
            case 7:
                return zzlv.zzw(obj, j10);
            case 8:
                Object objZzf = zzlv.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzgw) {
                    return !zzgw.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzlv.zzf(obj, j10) != null;
            case 10:
                return !zzgw.zzb.equals(zzlv.zzf(obj, j10));
            case 11:
                return zzlv.zzc(obj, j10) != 0;
            case 12:
                return zzlv.zzc(obj, j10) != 0;
            case 13:
                return zzlv.zzc(obj, j10) != 0;
            case 14:
                return zzlv.zzd(obj, j10) != 0;
            case 15:
                return zzlv.zzc(obj, j10) != 0;
            case 16:
                return zzlv.zzd(obj, j10) != 0;
            case 17:
                return zzlv.zzf(obj, j10) != null;
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

    private static boolean zzP(Object obj, int i, zzkr zzkrVar) {
        return zzkrVar.zzl(zzlv.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzit) {
            return ((zzit) obj).zzG();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i10) {
        return zzlv.zzc(obj, (long) (zzr(i10) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j4) {
        return ((Boolean) zzlv.zzf(obj, j4)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzmd zzmdVar) throws IOException {
        if (obj instanceof String) {
            zzmdVar.zzG(i, (String) obj);
        } else {
            zzmdVar.zzd(i, (zzgw) obj);
        }
    }

    public static zzlm zzd(Object obj) {
        zzit zzitVar = (zzit) obj;
        zzlm zzlmVar = zzitVar.zzc;
        if (zzlmVar != zzlm.zzc()) {
            return zzlmVar;
        }
        zzlm zzlmVarZzf = zzlm.zzf();
        zzitVar.zzc = zzlmVarZzf;
        return zzlmVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:186:0x03af  */
    public static zzkh zzm(Class cls, zzkb zzkbVar, zzkk zzkkVar, zzjs zzjsVar, zzll zzllVar, zzif zzifVar, zzjz zzjzVar) {
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
        if (!(zzkbVar instanceof zzkp)) {
            throw null;
        }
        zzkp zzkpVar = (zzkp) zzkbVar;
        String strZzd = zzkpVar.zzd();
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
        Object[] objArrZze = zzkpVar.zze();
        Class<?> cls2 = zzkpVar.zza().getClass();
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
            zzkp zzkpVar2 = zzkpVar;
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
                } else if (zzkpVar2.zzc() == 1 || i84 != 0) {
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
                            if (zzkpVar2.zzc() == 1 || i84 != 0) {
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
            zzkpVar = zzkpVar2;
            i10 = i28;
            length = i26;
            i15 = i27;
        }
        zzkp zzkpVar3 = zzkpVar;
        return new zzkh(iArr3, objArr, i11, i13, zzkpVar3.zza(), zzkpVar3.zzc(), false, iArr, i14, i69, zzkkVar, zzjsVar, zzllVar, zzifVar, zzjzVar);
    }

    private static double zzn(Object obj, long j4) {
        return ((Double) zzlv.zzf(obj, j4)).doubleValue();
    }

    private static float zzo(Object obj, long j4) {
        return ((Float) zzlv.zzf(obj, j4)).floatValue();
    }

    private static int zzp(Object obj, long j4) {
        return ((Integer) zzlv.zzf(obj, j4)).intValue();
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
        return ((Long) zzlv.zzf(obj, j4)).longValue();
    }

    private final zzix zzw(int i) {
        int i10 = i / 3;
        return (zzix) this.zzd[i10 + i10 + 1];
    }

    private final zzkr zzx(int i) {
        Object[] objArr = this.zzd;
        int i10 = i / 3;
        int i11 = i10 + i10;
        zzkr zzkrVar = (zzkr) objArr[i11];
        if (zzkrVar != null) {
            return zzkrVar;
        }
        zzkr zzkrVarZzb = zzkn.zza().zzb((Class) objArr[i11 + 1]);
        this.zzd[i11] = zzkrVarZzb;
        return zzkrVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzll zzllVar, Object obj3) {
        int i10 = this.zzc[i];
        Object objZzf = zzlv.zzf(obj, zzu(i) & 1048575);
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
    /* JADX WARN: Code duplicated, block: B:152:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:206:0x0520  */
    /* JADX WARN: Code duplicated, block: B:89:0x0213  */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final int zza(Object obj) {
        int i;
        int iZzh;
        int iZzy;
        int size;
        int iZzl;
        int iZzy2;
        int iZzd;
        boolean z4;
        int iZzb;
        int iZzx;
        int iZzy3;
        int iZzy4;
        int size2;
        int iZzk;
        int iZzy5;
        int size3;
        int iZzi;
        int iZzy6;
        int i10;
        int iZze;
        int iZzy7;
        int iZzy8;
        int iZzz;
        zzkh<T> zzkhVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int iA = 0;
        while (i13 < zzkhVar.zzc.length) {
            int iZzu = zzkhVar.zzu(i13);
            int iZzt = zzt(iZzu);
            int[] iArr = zzkhVar.zzc;
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
            if (iZzt >= zzik.zzJ.zza()) {
                zzik.zzW.zza();
            }
            long j4 = i18;
            switch (iZzt) {
                case 0:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA = a.A(i15 << 3, 8, iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 1:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA = a.A(i15 << 3, 4, iA);
                    }
                    zzkhVar = this;
                    obj2 = obj;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 2:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA = a.A(i15 << 3, zzhh.zzz(unsafe.getLong(obj2, j4)), iA);
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 3:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA = a.A(i15 << 3, zzhh.zzz(unsafe.getLong(obj2, j4)), iA);
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 4:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA = a.A(i15 << 3, zzhh.zzu(unsafe.getInt(obj2, j4)), iA);
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 5:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA = a.A(i15 << 3, 8, iA);
                    }
                    zzkhVar = this;
                    obj2 = obj;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 6:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA = a.A(i15 << 3, 4, iA);
                    }
                    zzkhVar = this;
                    obj2 = obj;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 7:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA = a.A(i15 << 3, 1, iA);
                    }
                    zzkhVar = this;
                    obj2 = obj;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 8:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj2, j4);
                        if (object instanceof zzgw) {
                            int i20 = zzhh.zzb;
                            int iZzd2 = ((zzgw) object).zzd();
                            iA = a.A(i19, zzhh.zzy(iZzd2) + iZzd2, iA);
                        } else {
                            iA = a.A(i19, zzhh.zzx((String) object), iA);
                        }
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 9:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iZzh = zzkt.zzh(i15, unsafe.getObject(obj2, j4), zzkhVar.zzx(i13));
                        iA += iZzh;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 10:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        zzgw zzgwVar = (zzgw) unsafe.getObject(obj2, j4);
                        int i21 = zzhh.zzb;
                        int iZzd3 = zzgwVar.zzd();
                        iA = a.A(i15 << 3, zzhh.zzy(iZzd3) + iZzd3, iA);
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 11:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA = a.A(i15 << 3, zzhh.zzy(unsafe.getInt(obj2, j4)), iA);
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 12:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA = a.A(i15 << 3, zzhh.zzu(unsafe.getInt(obj2, j4)), iA);
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 13:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA = a.A(i15 << 3, 4, iA);
                    }
                    zzkhVar = this;
                    obj2 = obj;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 14:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA = a.A(i15 << 3, 8, iA);
                    }
                    zzkhVar = this;
                    obj2 = obj;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 15:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        int i22 = unsafe.getInt(obj2, j4);
                        iA = a.A((i22 >> 31) ^ (i22 + i22), zzhh.zzy(i15 << 3), iA);
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 16:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        long j10 = unsafe.getLong(obj2, j4);
                        iA += zzhh.zzz((j10 >> 63) ^ (j10 + j10)) + zzhh.zzy(i15 << 3);
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 17:
                    if (zzkhVar.zzO(obj2, i13, i12, i14, i)) {
                        iA += zzhh.zzt(i15, (zzke) unsafe.getObject(obj2, j4), zzkhVar.zzx(i13));
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 18:
                    iZzh = zzkt.zzd(i15, (List) unsafe.getObject(obj2, j4), false);
                    iA += iZzh;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 19:
                    iZzh = zzkt.zzb(i15, (List) unsafe.getObject(obj2, j4), false);
                    iA += iZzh;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j4);
                    int i23 = zzkt.zza;
                    if (list.size() == 0) {
                        iZzy = 0;
                    } else {
                        iZzy = (zzhh.zzy(i15 << 3) * list.size()) + zzkt.zzg(list);
                    }
                    iA += iZzy;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    List list2 = (List) unsafe.getObject(obj2, j4);
                    int i24 = zzkt.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzy = 0;
                    } else {
                        iZzl = zzkt.zzl(list2);
                        iZzy2 = zzhh.zzy(i15 << 3);
                        iZzy = (iZzy2 * size) + iZzl;
                    }
                    iA += iZzy;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j4);
                    int i25 = zzkt.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzy = 0;
                    } else {
                        iZzl = zzkt.zzf(list3);
                        iZzy2 = zzhh.zzy(i15 << 3);
                        iZzy = (iZzy2 * size) + iZzl;
                    }
                    iA += iZzy;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 23:
                    iZzd = zzkt.zzd(i15, (List) unsafe.getObject(obj2, j4), false);
                    iA += iZzd;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 24:
                    z4 = false;
                    iZzb = zzkt.zzb(i15, (List) unsafe.getObject(obj2, j4), false);
                    iA += iZzb;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j4);
                    int i26 = zzkt.zza;
                    int size4 = list4.size();
                    if (size4 == 0) {
                        iZzd = 0;
                    } else {
                        iZzd = size4 * (zzhh.zzy(i15 << 3) + 1);
                    }
                    iA += iZzd;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j4);
                    int i27 = zzkt.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzx = 0;
                    } else {
                        boolean z10 = list5 instanceof zzjm;
                        int iZzy9 = zzhh.zzy(i15 << 3) * size5;
                        if (z10) {
                            zzjm zzjmVar = (zzjm) list5;
                            iZzx = iZzy9;
                            for (int i28 = 0; i28 < size5; i28++) {
                                Object objZzf = zzjmVar.zzf(i28);
                                if (objZzf instanceof zzgw) {
                                    int iZzd4 = ((zzgw) objZzf).zzd();
                                    iZzx = a.A(iZzd4, iZzd4, iZzx);
                                } else {
                                    iZzx = zzhh.zzx((String) objZzf) + iZzx;
                                }
                            }
                        } else {
                            iZzx = iZzy9;
                            for (int i29 = 0; i29 < size5; i29++) {
                                Object obj3 = list5.get(i29);
                                if (obj3 instanceof zzgw) {
                                    int iZzd5 = ((zzgw) obj3).zzd();
                                    iZzx = a.A(iZzd5, iZzd5, iZzx);
                                } else {
                                    iZzx = zzhh.zzx((String) obj3) + iZzx;
                                }
                            }
                        }
                    }
                    iA += iZzx;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j4);
                    zzkr zzkrVarZzx = zzkhVar.zzx(i13);
                    int i30 = zzkt.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzy3 = 0;
                    } else {
                        iZzy3 = zzhh.zzy(i15 << 3) * size6;
                        for (int i31 = 0; i31 < size6; i31++) {
                            Object obj4 = list6.get(i31);
                            if (obj4 instanceof zzjk) {
                                int iZza = ((zzjk) obj4).zza();
                                iZzy3 = a.A(iZza, iZza, iZzy3);
                            } else {
                                iZzy3 = zzhh.zzw((zzke) obj4, zzkrVarZzx) + iZzy3;
                            }
                        }
                    }
                    iA += iZzy3;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j4);
                    int i32 = zzkt.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzy4 = 0;
                    } else {
                        iZzy4 = zzhh.zzy(i15 << 3) * size7;
                        for (int i33 = 0; i33 < list7.size(); i33++) {
                            int iZzd6 = ((zzgw) list7.get(i33)).zzd();
                            iZzy4 = a.A(iZzd6, iZzd6, iZzy4);
                        }
                    }
                    iA += iZzy4;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j4);
                    int i34 = zzkt.zza;
                    size2 = list8.size();
                    if (size2 == 0) {
                        iZzd = 0;
                    } else {
                        iZzk = zzkt.zzk(list8);
                        iZzy5 = zzhh.zzy(i15 << 3);
                        iZzd = iZzk + (iZzy5 * size2);
                    }
                    iA += iZzd;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j4);
                    int i35 = zzkt.zza;
                    size2 = list9.size();
                    if (size2 == 0) {
                        iZzd = 0;
                    } else {
                        iZzk = zzkt.zza(list9);
                        iZzy5 = zzhh.zzy(i15 << 3);
                        iZzd = iZzk + (iZzy5 * size2);
                    }
                    iA += iZzd;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 31:
                    iZzd = zzkt.zzb(i15, (List) unsafe.getObject(obj2, j4), false);
                    iA += iZzd;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    z4 = false;
                    iZzb = zzkt.zzd(i15, (List) unsafe.getObject(obj2, j4), false);
                    iA += iZzb;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j4);
                    int i36 = zzkt.zza;
                    size3 = list10.size();
                    if (size3 == 0) {
                        i10 = 0;
                    } else {
                        iZzi = zzkt.zzi(list10);
                        iZzy6 = zzhh.zzy(i15 << 3);
                        i10 = (iZzy6 * size3) + iZzi;
                    }
                    iA += i10;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j4);
                    int i37 = zzkt.zza;
                    size3 = list11.size();
                    if (size3 == 0) {
                        i10 = 0;
                    } else {
                        iZzi = zzkt.zzj(list11);
                        iZzy6 = zzhh.zzy(i15 << 3);
                        i10 = (iZzy6 * size3) + iZzi;
                    }
                    iA += i10;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 35:
                    iZze = zzkt.zze((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 36:
                    iZze = zzkt.zzc((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 37:
                    iZze = zzkt.zzg((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 38:
                    iZze = zzkt.zzl((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 39:
                    iZze = zzkt.zzf((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 40:
                    iZze = zzkt.zze((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 41:
                    iZze = zzkt.zzc((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j4);
                    int i38 = zzkt.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 43:
                    iZze = zzkt.zzk((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 44:
                    iZze = zzkt.zza((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 45:
                    iZze = zzkt.zzc((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 46:
                    iZze = zzkt.zze((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 47:
                    iZze = zzkt.zzi((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 48:
                    iZze = zzkt.zzj((List) unsafe.getObject(obj2, j4));
                    if (iZze > 0) {
                        iZzy7 = zzhh.zzy(iZze);
                        iZzy8 = zzhh.zzy(i15 << 3);
                        iZzz = iZzy8 + iZzy7;
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j4);
                    zzkr zzkrVarZzx2 = zzkhVar.zzx(i13);
                    int i39 = zzkt.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        i10 = 0;
                    } else {
                        int iZzt2 = 0;
                        for (int i40 = 0; i40 < size8; i40++) {
                            iZzt2 += zzhh.zzt(i15, (zzke) list13.get(i40), zzkrVarZzx2);
                        }
                        i10 = iZzt2;
                    }
                    iA += i10;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 50:
                    zzjy zzjyVar = (zzjy) unsafe.getObject(obj2, j4);
                    if (!zzjyVar.isEmpty()) {
                        Iterator it = zzjyVar.entrySet().iterator();
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
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA = a.A(i15 << 3, 8, iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 52:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA = a.A(i15 << 3, 4, iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 53:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA = a.A(i15 << 3, zzhh.zzz(zzv(obj2, j4)), iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 54:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA = a.A(i15 << 3, zzhh.zzz(zzv(obj2, j4)), iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 55:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA = a.A(i15 << 3, zzhh.zzu(zzp(obj2, j4)), iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 56:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA = a.A(i15 << 3, 8, iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 57:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA = a.A(i15 << 3, 4, iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 58:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA = a.A(i15 << 3, 1, iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 59:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        int i41 = i15 << 3;
                        Object object2 = unsafe.getObject(obj2, j4);
                        if (object2 instanceof zzgw) {
                            int i42 = zzhh.zzb;
                            int iZzd7 = ((zzgw) object2).zzd();
                            iA = a.A(i41, zzhh.zzy(iZzd7) + iZzd7, iA);
                        } else {
                            iA = a.A(i41, zzhh.zzx((String) object2), iA);
                        }
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 60:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iZzd = zzkt.zzh(i15, unsafe.getObject(obj2, j4), zzkhVar.zzx(i13));
                        iA += iZzd;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 61:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        zzgw zzgwVar2 = (zzgw) unsafe.getObject(obj2, j4);
                        int i43 = zzhh.zzb;
                        int iZzd8 = zzgwVar2.zzd();
                        iA = a.A(i15 << 3, zzhh.zzy(iZzd8) + iZzd8, iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 62:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA = a.A(i15 << 3, zzhh.zzy(zzp(obj2, j4)), iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 63:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA = a.A(i15 << 3, zzhh.zzu(zzp(obj2, j4)), iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA = a.A(i15 << 3, 4, iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 65:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA = a.A(i15 << 3, 8, iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 66:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        int iZzp = zzp(obj2, j4);
                        iA = a.A((iZzp >> 31) ^ (iZzp + iZzp), zzhh.zzy(i15 << 3), iA);
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 67:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        long jZzv = zzv(obj2, j4);
                        iZze = zzhh.zzy(i15 << 3);
                        iZzz = zzhh.zzz((jZzv >> 63) ^ (jZzv + jZzv));
                        iA += iZzz + iZze;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 68:
                    if (zzkhVar.zzR(obj2, i15, i13)) {
                        iA += zzhh.zzt(i15, (zzke) unsafe.getObject(obj2, j4), zzkhVar.zzx(i13));
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
        int iZza2 = 0;
        zzll zzllVar = zzkhVar.zzn;
        int iZza3 = iA + zzllVar.zza(zzllVar.zzd(obj2));
        if (!zzkhVar.zzh) {
            return iZza3;
        }
        zzij zzijVarZzb = zzkhVar.zzo.zzb(obj2);
        for (int i44 = 0; i44 < zzijVarZzb.zza.zzb(); i44++) {
            Map.Entry entryZzg = zzijVarZzb.zza.zzg(i44);
            iZza2 += zzij.zza((zzii) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzijVarZzb.zza.zzc()) {
            iZza2 += zzij.zza((zzii) entry2.getKey(), entry2.getValue());
        }
        return iZza3 + iZza2;
    }

    @Override // com.google.android.recaptcha.internal.zzkr
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
                    jDoubleToLongBits = Double.doubleToLongBits(zzlv.zza(obj, j4));
                    byte[] bArr = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzlv.zzb(obj, j4));
                    i12 = iFloatToIntBits + i10;
                    break;
                case 2:
                    i = i12 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j4);
                    byte[] bArr2 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 3:
                    i = i12 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j4);
                    byte[] bArr3 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 4:
                    i = i12 * 53;
                    iZzc = zzlv.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 5:
                    i = i12 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j4);
                    byte[] bArr4 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 6:
                    i = i12 * 53;
                    iZzc = zzlv.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzjc.zza(zzlv.zzw(obj, j4));
                    i12 = iFloatToIntBits + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iFloatToIntBits = ((String) zzlv.zzf(obj, j4)).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object objZzf = zzlv.zzf(obj, j4);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j4).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 11:
                    i = i12 * 53;
                    iZzc = zzlv.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 12:
                    i = i12 * 53;
                    iZzc = zzlv.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 13:
                    i = i12 * 53;
                    iZzc = zzlv.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 14:
                    i = i12 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j4);
                    byte[] bArr5 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 15:
                    i = i12 * 53;
                    iZzc = zzlv.zzc(obj, j4);
                    i12 = i + iZzc;
                    break;
                case 16:
                    i = i12 * 53;
                    jDoubleToLongBits = zzlv.zzd(obj, j4);
                    byte[] bArr6 = zzjc.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i + iZzc;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object objZzf2 = zzlv.zzf(obj, j4);
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
                    iFloatToIntBits = zzlv.zzf(obj, j4).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzlv.zzf(obj, j4).hashCode();
                    i12 = iFloatToIntBits + i10;
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j4));
                        byte[] bArr7 = zzjc.zzd;
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
                        byte[] bArr8 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                    }
                    break;
                case 54:
                    if (zzR(obj, i15, i13)) {
                        i = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j4);
                        byte[] bArr9 = zzjc.zzd;
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
                        byte[] bArr10 = zzjc.zzd;
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
                        iFloatToIntBits = zzjc.zza(zzS(obj, j4));
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
                case 59:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = ((String) zzlv.zzf(obj, j4)).hashCode();
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
                case 60:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j4).hashCode();
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
                case 61:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j4).hashCode();
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
                        byte[] bArr11 = zzjc.zzd;
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
                        byte[] bArr12 = zzjc.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzlv.zzf(obj, j4).hashCode();
                        i12 = iFloatToIntBits + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzn.zzd(obj).hashCode() + (i12 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzo.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36301. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzc(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.recaptcha.internal.zzgj r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzgj):int");
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final Object zze() {
        return ((zzit) this.zzg).zzs();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzit) {
                zzit zzitVar = (zzit) obj;
                zzitVar.zzE(f.API_PRIORITY_OTHER);
                zzitVar.zza = 0;
                zzitVar.zzC();
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
                                    ((zzjy) object).zzc();
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
                this.zzo.zzf(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
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
                        zzlv.zzo(obj, j4, zzlv.zza(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        zzlv.zzp(obj, j4, zzlv.zzb(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j4, zzlv.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j4, zzlv.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j4, zzlv.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j4, zzlv.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j4, zzlv.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i)) {
                        zzlv.zzm(obj, j4, zzlv.zzw(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i)) {
                        zzlv.zzs(obj, j4, zzlv.zzf(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzlv.zzs(obj, j4, zzlv.zzf(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j4, zzlv.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j4, zzlv.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j4, zzlv.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j4, zzlv.zzd(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        zzlv.zzq(obj, j4, zzlv.zzc(obj2, j4));
                        zzH(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        zzlv.zzr(obj, j4, zzlv.zzd(obj2, j4));
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
                    int i12 = zzkt.zza;
                    zzlv.zzs(obj, j4, zzjz.zzb(zzlv.zzf(obj, j4), zzlv.zzf(obj2, j4)));
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
                        zzlv.zzs(obj, j4, zzlv.zzf(obj2, j4));
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
                        zzlv.zzs(obj, j4, zzlv.zzf(obj2, j4));
                        zzI(obj, i11, i);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzkt.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzkt.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:195:0x07e4 A[Catch: all -> 0x07ea, TRY_LEAVE, TryCatch #7 {all -> 0x07ea, blocks: (B:193:0x07df, B:195:0x07e4), top: B:234:0x07df }] */
    /* JADX WARN: Code duplicated, block: B:205:0x07fa A[LOOP:1: B:203:0x07f6->B:205:0x07fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x080e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0812  */
    /* JADX WARN: Code duplicated, block: B:219:0x0827 A[LOOP:2: B:217:0x0823->B:219:0x0827, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x0839  */
    /* JADX WARN: Code duplicated, block: B:260:0x07f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzh(Object obj, zzkq zzkqVar, zzie zzieVar) throws Throwable {
        Object obj2;
        Object objZzc;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        zzkh<T> zzkhVar;
        Object obj6;
        Object obj7;
        zzll zzllVar;
        zzif zzifVar;
        zzie zzieVar2;
        zzll zzllVar2;
        zzll zzllVar3;
        int i10;
        Object objZzo;
        zzll zzllVar4;
        zzkh<T> zzkhVar2 = this;
        zzie zzieVar3 = zzieVar;
        zzieVar3.getClass();
        zzD(obj);
        zzll zzllVar5 = zzkhVar2.zzn;
        zzif zzifVar2 = zzkhVar2.zzo;
        Object objZzc2 = null;
        zzij zzijVarZzc = null;
        while (true) {
            try {
                int iZzc = zzkqVar.zzc();
                int iZzq = zzkhVar2.zzq(iZzc);
                if (iZzq >= 0) {
                    zzifVar = zzifVar2;
                    zzieVar2 = zzieVar3;
                    zzllVar = zzllVar5;
                    obj5 = objZzc2;
                    obj7 = obj;
                    try {
                        int iZzu = zzkhVar2.zzu(iZzq);
                        try {
                            try {
                                switch (zzt(iZzu)) {
                                    case 0:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzo(obj7, iZzu & 1048575, zzkqVar.zza());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 1:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzp(obj7, iZzu & 1048575, zzkqVar.zzb());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 2:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzr(obj7, iZzu & 1048575, zzkqVar.zzl());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 3:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzr(obj7, iZzu & 1048575, zzkqVar.zzo());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 4:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzq(obj7, iZzu & 1048575, zzkqVar.zzg());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 5:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzr(obj7, iZzu & 1048575, zzkqVar.zzk());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 6:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzq(obj7, iZzu & 1048575, zzkqVar.zzf());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 7:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzm(obj7, iZzu & 1048575, zzkqVar.zzN());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 8:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkhVar.zzG(obj7, iZzu, zzkqVar);
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 9:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzke zzkeVar = (zzke) zzkhVar.zzA(obj7, iZzq);
                                        zzkqVar.zzu(zzkeVar, zzkhVar.zzx(iZzq), zzieVar2);
                                        zzkhVar.zzJ(obj7, iZzq, zzkeVar);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 10:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, zzkqVar.zzp());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 11:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzq(obj7, iZzu & 1048575, zzkqVar.zzj());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 12:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        int iZze = zzkqVar.zze();
                                        zzix zzixVarZzw = zzkhVar.zzw(iZzq);
                                        if (zzixVarZzw == null || zzixVarZzw.zza(iZze)) {
                                            zzlv.zzq(obj7, iZzu & 1048575, iZze);
                                            zzkhVar.zzH(obj7, iZzq);
                                        } else {
                                            objZzc2 = zzkt.zzp(obj7, iZzc, iZze, objZzc2, zzllVar5);
                                        }
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 13:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzq(obj7, iZzu & 1048575, zzkqVar.zzh());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 14:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzr(obj7, iZzu & 1048575, zzkqVar.zzm());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 15:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzq(obj7, iZzu & 1048575, zzkqVar.zzi());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 16:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzlv.zzr(obj7, iZzu & 1048575, zzkqVar.zzn());
                                        zzkhVar.zzH(obj7, iZzq);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 17:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzke zzkeVar2 = (zzke) zzkhVar.zzA(obj7, iZzq);
                                        zzkqVar.zzt(zzkeVar2, zzkhVar.zzx(iZzq), zzieVar2);
                                        zzkhVar.zzJ(obj7, iZzq, zzkeVar2);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 18:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzx(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 19:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzB(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 20:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzE(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case zzbbs.zzt.zzm /* 21 */:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzM(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 22:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzD(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 23:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzA(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 24:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzz(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 25:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzv(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 26:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        if (zzM(iZzu)) {
                                            ((zzhd) zzkqVar).zzK(zzkhVar.zzm.zza(obj7, iZzu & 1048575), true);
                                        } else {
                                            ((zzhd) zzkqVar).zzK(zzkhVar.zzm.zza(obj7, iZzu & 1048575), false);
                                        }
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 27:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzF(zzkhVar.zzm.zza(obj7, iZzu & 1048575), zzkhVar.zzx(iZzq), zzieVar2);
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 28:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzw(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 29:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzL(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 30:
                                        zzkhVar = zzkhVar2;
                                        List listZza = zzkhVar.zzm.zza(obj7, iZzu & 1048575);
                                        zzkqVar.zzy(listZza);
                                        objZzo = zzkt.zzo(obj7, iZzc, listZza, zzkhVar.zzw(iZzq), obj5, zzllVar);
                                        zzllVar5 = zzllVar;
                                        objZzc2 = objZzo;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 31:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzG(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzH(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 33:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzI(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 34:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzJ(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 35:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzx(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 36:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzB(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 37:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzE(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 38:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzM(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 39:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzD(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 40:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzA(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 41:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzz(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 42:
                                        zzkhVar = zzkhVar2;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        zzkqVar.zzv(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 43:
                                        zzkhVar = zzkhVar2;
                                        obj6 = obj7;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar;
                                        try {
                                            zzkqVar.zzL(zzkhVar.zzm.zza(obj6, iZzu & 1048575));
                                        } catch (zzjd unused) {
                                            try {
                                                zzllVar5.zzs(zzkqVar);
                                                if (objZzc2 == null) {
                                                    objZzc2 = zzllVar5.zzc(obj6);
                                                }
                                                objZzc = objZzc2;
                                                try {
                                                    if (zzllVar5.zzr(objZzc, zzkqVar)) {
                                                        i10 = zzkhVar.zzk;
                                                        while (i10 < zzkhVar.zzl) {
                                                            Object obj8 = obj6;
                                                            zzkhVar.zzy(obj8, zzkhVar.zzj[i10], objZzc, zzllVar5, obj);
                                                            i10++;
                                                            obj6 = obj8;
                                                        }
                                                        obj2 = obj6;
                                                        obj4 = objZzc;
                                                        if (obj4 != null) {
                                                            zzllVar5.zzn(obj2, obj4);
                                                        }
                                                    }
                                                    objZzc2 = objZzc;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    obj2 = obj6;
                                                    zzkhVar2 = zzkhVar;
                                                    i = zzkhVar2.zzk;
                                                    while (i < zzkhVar2.zzl) {
                                                        zzkhVar2.zzy(obj2, zzkhVar2.zzj[i], objZzc, zzllVar5, obj);
                                                        i++;
                                                        zzkhVar2 = this;
                                                    }
                                                    obj3 = obj2;
                                                    if (objZzc != null) {
                                                        zzllVar5.zzn(obj3, objZzc);
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                obj2 = obj6;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            obj2 = obj6;
                                            zzkhVar2 = zzkhVar;
                                            objZzc = objZzc2;
                                            i = zzkhVar2.zzk;
                                            while (i < zzkhVar2.zzl) {
                                                zzkhVar2.zzy(obj2, zzkhVar2.zzj[i], objZzc, zzllVar5, obj);
                                                i++;
                                                zzkhVar2 = this;
                                            }
                                            obj3 = obj2;
                                            if (objZzc != null) {
                                                zzllVar5.zzn(obj3, objZzc);
                                            }
                                            throw th;
                                        }
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 44:
                                        zzkhVar = zzkhVar2;
                                        obj6 = obj7;
                                        try {
                                            List listZza2 = zzkhVar.zzm.zza(obj6, iZzu & 1048575);
                                            zzkqVar.zzy(listZza2);
                                            objZzo = zzkt.zzo(obj6, iZzc, listZza2, zzkhVar.zzw(iZzq), obj5, zzllVar);
                                            zzllVar5 = zzllVar;
                                            objZzc2 = objZzo;
                                            zzkhVar2 = zzkhVar;
                                            zzieVar3 = zzieVar2;
                                            zzifVar2 = zzifVar;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            zzllVar2 = zzllVar;
                                            objZzc2 = obj5;
                                            zzllVar5 = zzllVar2;
                                            obj2 = obj6;
                                            zzkhVar2 = zzkhVar;
                                            objZzc = objZzc2;
                                            i = zzkhVar2.zzk;
                                            while (i < zzkhVar2.zzl) {
                                                zzkhVar2.zzy(obj2, zzkhVar2.zzj[i], objZzc, zzllVar5, obj);
                                                i++;
                                                zzkhVar2 = this;
                                            }
                                            obj3 = obj2;
                                            if (objZzc != null) {
                                                zzllVar5.zzn(obj3, objZzc);
                                            }
                                            throw th;
                                        }
                                        break;
                                    case 45:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzkqVar.zzG(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzll zzllVar6 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar6;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 46:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzkqVar.zzH(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzll zzllVar7 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar7;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 47:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzkqVar.zzI(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzll zzllVar8 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar8;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 48:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzkqVar.zzJ(zzkhVar.zzm.zza(obj7, iZzu & 1048575));
                                        zzll zzllVar9 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar9;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 49:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzkqVar.zzC(zzkhVar.zzm.zza(obj7, iZzu & 1048575), zzkhVar.zzx(iZzq), zzieVar2);
                                        zzll zzllVar10 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar10;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 50:
                                        zzkhVar = zzkhVar2;
                                        obj6 = obj7;
                                        zzllVar4 = zzllVar;
                                        Object objZzz = zzkhVar.zzz(iZzq);
                                        long jZzu = zzkhVar.zzu(iZzq) & 1048575;
                                        Object objZzf = zzlv.zzf(obj6, jZzu);
                                        if (objZzf == null) {
                                            objZzf = zzjy.zza().zzb();
                                            zzlv.zzs(obj6, jZzu, objZzf);
                                        } else if (zzjz.zza(objZzf)) {
                                            Object objZzb = zzjy.zza().zzb();
                                            zzjz.zzb(objZzb, objZzf);
                                            zzlv.zzs(obj6, jZzu, objZzb);
                                            objZzf = objZzb;
                                        }
                                        throw null;
                                    case 51:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Double.valueOf(zzkqVar.zza()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar11 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar11;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 52:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Float.valueOf(zzkqVar.zzb()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar12 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar12;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 53:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Long.valueOf(zzkqVar.zzl()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar13 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar13;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 54:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Long.valueOf(zzkqVar.zzo()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar14 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar14;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 55:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Integer.valueOf(zzkqVar.zzg()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar15 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar15;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 56:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Long.valueOf(zzkqVar.zzk()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar16 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar16;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 57:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Integer.valueOf(zzkqVar.zzf()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar17 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar17;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 58:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Boolean.valueOf(zzkqVar.zzN()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar18 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar18;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 59:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzkhVar.zzG(obj7, iZzu, zzkqVar);
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar19 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar19;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 60:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzke zzkeVar3 = (zzke) zzkhVar.zzB(obj7, iZzc, iZzq);
                                        zzkqVar.zzu(zzkeVar3, zzkhVar.zzx(iZzq), zzieVar2);
                                        zzkhVar.zzK(obj7, iZzc, iZzq, zzkeVar3);
                                        zzll zzllVar110 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar110;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 61:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, zzkqVar.zzp());
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar111 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar111;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 62:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Integer.valueOf(zzkqVar.zzj()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar112 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar112;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 63:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        int iZze2 = zzkqVar.zze();
                                        zzix zzixVarZzw2 = zzkhVar.zzw(iZzq);
                                        if (zzixVarZzw2 == null || zzixVarZzw2.zza(iZze2)) {
                                            zzlv.zzs(obj7, iZzu & 1048575, Integer.valueOf(iZze2));
                                            zzkhVar.zzI(obj7, iZzc, iZzq);
                                            zzll zzllVar113 = zzllVar4;
                                            objZzc2 = obj5;
                                            zzllVar5 = zzllVar113;
                                            zzkhVar2 = zzkhVar;
                                            zzieVar3 = zzieVar2;
                                            zzifVar2 = zzifVar;
                                        } else {
                                            Object objZzp = zzkt.zzp(obj7, iZzc, iZze2, obj5, zzllVar4);
                                            zzllVar5 = zzllVar4;
                                            zzkhVar2 = zzkhVar;
                                            zzieVar3 = zzieVar2;
                                            zzifVar2 = zzifVar;
                                            objZzc2 = objZzp;
                                        }
                                        break;
                                    case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Integer.valueOf(zzkqVar.zzh()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar114 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar114;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 65:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Long.valueOf(zzkqVar.zzm()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar115 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar115;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 66:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Integer.valueOf(zzkqVar.zzi()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar116 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar116;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 67:
                                        zzkhVar = zzkhVar2;
                                        zzllVar4 = zzllVar;
                                        zzlv.zzs(obj7, iZzu & 1048575, Long.valueOf(zzkqVar.zzn()));
                                        zzkhVar.zzI(obj7, iZzc, iZzq);
                                        zzll zzllVar117 = zzllVar4;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar117;
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    case 68:
                                        zzkhVar = zzkhVar2;
                                        obj6 = obj7;
                                        zzllVar4 = zzllVar;
                                        try {
                                            zzke zzkeVar4 = (zzke) zzkhVar.zzB(obj6, iZzc, iZzq);
                                            zzkqVar.zzt(zzkeVar4, zzkhVar.zzx(iZzq), zzieVar2);
                                            zzkhVar.zzK(obj6, iZzc, iZzq, zzkeVar4);
                                            zzll zzllVar118 = zzllVar4;
                                            objZzc2 = obj5;
                                            zzllVar5 = zzllVar118;
                                        } catch (zzjd unused2) {
                                            zzllVar3 = zzllVar4;
                                            objZzc2 = obj5;
                                            zzllVar5 = zzllVar3;
                                            zzllVar5.zzs(zzkqVar);
                                            if (objZzc2 == null) {
                                                objZzc2 = zzllVar5.zzc(obj6);
                                            }
                                            objZzc = objZzc2;
                                            if (zzllVar5.zzr(objZzc, zzkqVar)) {
                                                i10 = zzkhVar.zzk;
                                                while (i10 < zzkhVar.zzl) {
                                                    Object obj9 = obj6;
                                                    zzkhVar.zzy(obj9, zzkhVar.zzj[i10], objZzc, zzllVar5, obj);
                                                    i10++;
                                                    obj6 = obj9;
                                                }
                                                obj2 = obj6;
                                                obj4 = objZzc;
                                                if (obj4 != null) {
                                                    zzllVar5.zzn(obj2, obj4);
                                                }
                                            }
                                            objZzc2 = objZzc;
                                        }
                                        zzkhVar2 = zzkhVar;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                        break;
                                    default:
                                        objZzc = obj5 == null ? zzllVar.zzc(obj7) : obj5;
                                        try {
                                            if (!zzllVar.zzr(objZzc, zzkqVar)) {
                                                int i11 = zzkhVar2.zzk;
                                                while (i11 < zzkhVar2.zzl) {
                                                    zzll zzllVar20 = zzllVar;
                                                    zzkhVar2.zzy(obj, zzkhVar2.zzj[i11], objZzc, zzllVar20, obj);
                                                    i11++;
                                                    obj7 = obj;
                                                    zzkhVar2 = zzkhVar2;
                                                    zzllVar = zzllVar20;
                                                }
                                                zzll zzllVar21 = zzllVar;
                                                zzkhVar = zzkhVar2;
                                                obj2 = obj7;
                                                zzllVar5 = zzllVar21;
                                                obj4 = objZzc;
                                            } else {
                                                zzllVar5 = zzllVar;
                                                zzkhVar2 = zzkhVar2;
                                                zzifVar2 = zzifVar;
                                                objZzc2 = objZzc;
                                                zzieVar3 = zzieVar2;
                                            }
                                        } catch (zzjd unused3) {
                                            zzkhVar = zzkhVar2;
                                            obj6 = obj7;
                                            zzllVar5 = zzllVar;
                                            objZzc2 = objZzc;
                                            zzllVar5.zzs(zzkqVar);
                                            if (objZzc2 == null) {
                                                objZzc2 = zzllVar5.zzc(obj6);
                                            }
                                            objZzc = objZzc2;
                                            if (zzllVar5.zzr(objZzc, zzkqVar)) {
                                                objZzc2 = objZzc;
                                                zzkhVar2 = zzkhVar;
                                                zzieVar3 = zzieVar2;
                                                zzifVar2 = zzifVar;
                                            } else {
                                                i10 = zzkhVar.zzk;
                                                while (i10 < zzkhVar.zzl) {
                                                    Object obj10 = obj6;
                                                    zzkhVar.zzy(obj10, zzkhVar.zzj[i10], objZzc, zzllVar5, obj);
                                                    i10++;
                                                    obj6 = obj10;
                                                }
                                                obj2 = obj6;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            zzkhVar = zzkhVar2;
                                            obj2 = obj7;
                                            zzllVar5 = zzllVar;
                                            zzkhVar2 = zzkhVar;
                                            i = zzkhVar2.zzk;
                                            while (i < zzkhVar2.zzl) {
                                                zzkhVar2.zzy(obj2, zzkhVar2.zzj[i], objZzc, zzllVar5, obj);
                                                i++;
                                                zzkhVar2 = this;
                                            }
                                            obj3 = obj2;
                                            if (objZzc != null) {
                                                zzllVar5.zzn(obj3, objZzc);
                                            }
                                            throw th;
                                        }
                                        break;
                                }
                            } catch (zzjd unused4) {
                                zzllVar3 = zzllVar;
                                zzkhVar = zzkhVar2;
                                obj6 = obj7;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            zzllVar2 = zzllVar;
                            zzkhVar = zzkhVar2;
                            obj6 = obj7;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        obj2 = obj7;
                        objZzc2 = obj5;
                        zzllVar5 = zzllVar;
                        objZzc = objZzc2;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i12 = zzkhVar2.zzk;
                    while (i12 < zzkhVar2.zzl) {
                        Object obj11 = objZzc2;
                        zzkhVar2.zzy(obj, zzkhVar2.zzj[i12], obj11, zzllVar5, obj);
                        i12++;
                        objZzc2 = obj11;
                        zzllVar5 = zzllVar5;
                        zzkhVar2 = zzkhVar2;
                    }
                    obj4 = objZzc2;
                    zzllVar5 = zzllVar5;
                    obj2 = obj;
                } else {
                    Object obj12 = objZzc2;
                    zzll zzllVar22 = zzllVar5;
                    obj5 = obj12;
                    zzkhVar = zzkhVar2;
                    obj6 = obj;
                    try {
                        Object objZzd = !zzkhVar.zzh ? null : zzifVar2.zzd(zzieVar3, zzkhVar.zzg, iZzc);
                        if (objZzd != null) {
                            if (zzijVarZzc == null) {
                                try {
                                    zzijVarZzc = zzifVar2.zzc(obj6);
                                } catch (Throwable th8) {
                                    th = th8;
                                    objZzc2 = obj5;
                                    zzllVar5 = zzllVar22;
                                    obj2 = obj6;
                                    zzkhVar2 = zzkhVar;
                                    objZzc = objZzc2;
                                    i = zzkhVar2.zzk;
                                    while (i < zzkhVar2.zzl) {
                                        zzkhVar2.zzy(obj2, zzkhVar2.zzj[i], objZzc, zzllVar5, obj);
                                        i++;
                                        zzkhVar2 = this;
                                    }
                                    obj3 = obj2;
                                    if (objZzc != null) {
                                        zzllVar5.zzn(obj3, objZzc);
                                    }
                                    throw th;
                                }
                            }
                            zzij zzijVar = zzijVarZzc;
                            try {
                                zzifVar2.zze(obj6, zzkqVar, objZzd, zzieVar3, zzijVar, obj5, zzllVar22);
                                zzijVarZzc = zzijVar;
                                zzifVar = zzifVar2;
                                zzieVar2 = zzieVar3;
                                objZzc2 = obj5;
                                zzllVar5 = zzllVar22;
                                zzkhVar2 = zzkhVar;
                                zzieVar3 = zzieVar2;
                                zzifVar2 = zzifVar;
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj6;
                                obj5 = obj5;
                                zzllVar22 = zzllVar22;
                            }
                        } else {
                            zzifVar = zzifVar2;
                            obj2 = obj6;
                            zzieVar2 = zzieVar3;
                            try {
                                zzllVar22.zzs(zzkqVar);
                                if (obj5 == null) {
                                    try {
                                        objZzc = zzllVar22.zzc(obj2);
                                    } catch (Throwable th10) {
                                        th = th10;
                                        zzll zzllVar23 = zzllVar22;
                                        objZzc2 = obj5;
                                        zzllVar5 = zzllVar23;
                                        zzkhVar2 = zzkhVar;
                                        objZzc = objZzc2;
                                    }
                                } else {
                                    objZzc = obj5;
                                }
                                try {
                                    if (zzllVar22.zzr(objZzc, zzkqVar)) {
                                        zzkhVar2 = zzkhVar;
                                        objZzc2 = objZzc;
                                        zzllVar5 = zzllVar22;
                                        zzieVar3 = zzieVar2;
                                        zzifVar2 = zzifVar;
                                    } else {
                                        int i13 = zzkhVar.zzk;
                                        while (i13 < zzkhVar.zzl) {
                                            zzll zzllVar24 = zzllVar22;
                                            zzkh<T> zzkhVar3 = zzkhVar;
                                            zzkhVar3.zzy(obj2, zzkhVar.zzj[i13], objZzc, zzllVar24, obj);
                                            i13++;
                                            zzllVar22 = zzllVar24;
                                            zzkhVar = zzkhVar3;
                                        }
                                        zzll zzllVar25 = zzllVar22;
                                        obj4 = objZzc;
                                        zzllVar5 = zzllVar25;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    zzkhVar2 = zzkhVar;
                                    zzllVar5 = zzllVar22;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                zzkhVar2 = zzkhVar;
                                zzllVar = zzllVar22;
                                objZzc2 = obj5;
                                zzllVar5 = zzllVar;
                                objZzc = objZzc2;
                            }
                        }
                        zzll zzllVar26 = zzllVar22;
                        objZzc2 = obj5;
                        zzllVar5 = zzllVar26;
                    } catch (Throwable th13) {
                        th = th13;
                        obj7 = obj6;
                        zzkhVar2 = zzkhVar;
                        zzllVar = zzllVar22;
                        obj2 = obj7;
                        objZzc2 = obj5;
                        zzllVar5 = zzllVar;
                        objZzc = objZzc2;
                        i = zzkhVar2.zzk;
                        while (i < zzkhVar2.zzl) {
                            zzkhVar2.zzy(obj2, zzkhVar2.zzj[i], objZzc, zzllVar5, obj);
                            i++;
                            zzkhVar2 = this;
                        }
                        obj3 = obj2;
                        if (objZzc != null) {
                            zzllVar5.zzn(obj3, objZzc);
                        }
                        throw th;
                    }
                    zzkhVar2 = zzkhVar;
                    objZzc = objZzc2;
                }
            } catch (Throwable th14) {
                th = th14;
                obj2 = obj;
            }
            i = zzkhVar2.zzk;
            while (i < zzkhVar2.zzl) {
                zzkhVar2.zzy(obj2, zzkhVar2.zzj[i], objZzc, zzllVar5, obj);
                i++;
                zzkhVar2 = this;
            }
            obj3 = obj2;
            if (objZzc != null) {
                zzllVar5.zzn(obj3, objZzc);
            }
            throw th;
        }
        if (obj4 != null) {
            zzllVar5.zzn(obj2, obj4);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzi(Object obj, byte[] bArr, int i, int i10, zzgj zzgjVar) throws IOException {
        zzc(obj, bArr, i, i10, 0, zzgjVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final void zzj(Object obj, zzmd zzmdVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i;
        int i10;
        int i11;
        int i12;
        zzkh<T> zzkhVar = this;
        if (zzkhVar.zzh) {
            zzij zzijVarZzb = zzkhVar.zzo.zzb(obj);
            if (zzijVarZzb.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzijVarZzb.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzkhVar.zzc;
        Unsafe unsafe = zzb;
        int i13 = 0;
        int i14 = 1048575;
        int i15 = 0;
        while (i13 < iArr.length) {
            int iZzu = zzkhVar.zzu(i13);
            int[] iArr2 = zzkhVar.zzc;
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
            while (entry != null && zzkhVar.zzo.zza(entry) <= i16) {
                zzkhVar.zzo.zzi(zzmdVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j4 = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzf(i16, zzlv.zza(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 1:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzo(i16, zzlv.zzb(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 2:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzt(i16, unsafe.getLong(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 3:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzK(i16, unsafe.getLong(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 4:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzr(i16, unsafe.getInt(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 5:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzm(i16, unsafe.getLong(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 6:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzk(i16, unsafe.getInt(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 7:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzb(i16, zzlv.zzw(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 8:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzT(i16, unsafe.getObject(obj, j4), zzmdVar);
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 9:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzv(i16, unsafe.getObject(obj, j4), zzkhVar.zzx(i13));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 10:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzd(i16, (zzgw) unsafe.getObject(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 11:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzI(i16, unsafe.getInt(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 12:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzi(i16, unsafe.getInt(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 13:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzx(i16, unsafe.getInt(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 14:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzz(i16, unsafe.getLong(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 15:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzB(i16, unsafe.getInt(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 16:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzD(i16, unsafe.getLong(obj, j4));
                    }
                    zzkhVar = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 17:
                    if (zzkhVar.zzO(obj, i13, i10, i11, i12)) {
                        zzmdVar.zzq(i16, unsafe.getObject(obj, j4), zzkhVar.zzx(i13));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 18:
                    zzkt.zzu(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 19:
                    zzkt.zzy(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 20:
                    zzkt.zzA(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    zzkt.zzG(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 22:
                    zzkt.zzz(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 23:
                    zzkt.zzx(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 24:
                    zzkt.zzw(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 25:
                    zzkt.zzt(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 26:
                    int i19 = zzkhVar.zzc[i13];
                    List list = (List) unsafe.getObject(obj, j4);
                    int i20 = zzkt.zza;
                    if (list != null && !list.isEmpty()) {
                        zzmdVar.zzH(i19, list);
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 27:
                    int i21 = zzkhVar.zzc[i13];
                    List list2 = (List) unsafe.getObject(obj, j4);
                    zzkr zzkrVarZzx = zzkhVar.zzx(i13);
                    int i22 = zzkt.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            ((zzhi) zzmdVar).zzv(i21, list2.get(i23), zzkrVarZzx);
                        }
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 28:
                    int i24 = zzkhVar.zzc[i13];
                    List list3 = (List) unsafe.getObject(obj, j4);
                    int i25 = zzkt.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzmdVar.zze(i24, list3);
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 29:
                    zzkt.zzF(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 30:
                    zzkt.zzv(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 31:
                    zzkt.zzB(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    zzkt.zzC(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 33:
                    zzkt.zzD(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 34:
                    zzkt.zzE(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 35:
                    zzkt.zzu(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 36:
                    zzkt.zzy(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 37:
                    zzkt.zzA(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 38:
                    zzkt.zzG(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 39:
                    zzkt.zzz(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 40:
                    zzkt.zzx(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 41:
                    zzkt.zzw(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 42:
                    zzkt.zzt(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 43:
                    zzkt.zzF(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 44:
                    zzkt.zzv(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 45:
                    zzkt.zzB(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 46:
                    zzkt.zzC(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 47:
                    zzkt.zzD(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 48:
                    zzkt.zzE(zzkhVar.zzc[i13], (List) unsafe.getObject(obj, j4), zzmdVar, i);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 49:
                    int i26 = zzkhVar.zzc[i13];
                    List list4 = (List) unsafe.getObject(obj, j4);
                    zzkr zzkrVarZzx2 = zzkhVar.zzx(i13);
                    int i27 = zzkt.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i28 = 0; i28 < list4.size(); i28++) {
                            ((zzhi) zzmdVar).zzq(i26, list4.get(i28), zzkrVarZzx2);
                        }
                    }
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
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzf(i16, zzn(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 52:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzo(i16, zzo(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 53:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzt(i16, zzv(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 54:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzK(i16, zzv(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 55:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzr(i16, zzp(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 56:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzm(i16, zzv(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 57:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzk(i16, zzp(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 58:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzb(i16, zzS(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 59:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzT(i16, unsafe.getObject(obj, j4), zzmdVar);
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 60:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzv(i16, unsafe.getObject(obj, j4), zzkhVar.zzx(i13));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 61:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzd(i16, (zzgw) unsafe.getObject(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 62:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzI(i16, zzp(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 63:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzi(i16, zzp(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzx(i16, zzp(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 65:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzz(i16, zzv(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 66:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzB(i16, zzp(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 67:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzD(i16, zzv(obj, j4));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 68:
                    if (zzkhVar.zzR(obj, i16, i13)) {
                        zzmdVar.zzq(i16, unsafe.getObject(obj, j4), zzkhVar.zzx(i13));
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
            zzkhVar.zzo.zzi(zzmdVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        zzll zzllVar = zzkhVar.zzn;
        zzllVar.zzq(zzllVar.zzd(obj), zzmdVar);
    }

    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzH;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j4 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzlv.zza(obj, j4)) != Double.doubleToLongBits(zzlv.zza(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzlv.zzb(obj, j4)) != Float.floatToIntBits(zzlv.zzb(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzlv.zzd(obj, j4) != zzlv.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzlv.zzd(obj, j4) != zzlv.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzlv.zzc(obj, j4) != zzlv.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzlv.zzd(obj, j4) != zzlv.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzlv.zzc(obj, j4) != zzlv.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzlv.zzw(obj, j4) != zzlv.zzw(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzkt.zzH(zzlv.zzf(obj, j4), zzlv.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzkt.zzH(zzlv.zzf(obj, j4), zzlv.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzkt.zzH(zzlv.zzf(obj, j4), zzlv.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzlv.zzc(obj, j4) != zzlv.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzlv.zzc(obj, j4) != zzlv.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzlv.zzc(obj, j4) != zzlv.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzlv.zzd(obj, j4) != zzlv.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzlv.zzc(obj, j4) != zzlv.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzlv.zzd(obj, j4) != zzlv.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzkt.zzH(zzlv.zzf(obj, j4), zzlv.zzf(obj2, j4))) {
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
                    zZzH = zzkt.zzH(zzlv.zzf(obj, j4), zzlv.zzf(obj2, j4));
                    break;
                case 50:
                    zZzH = zzkt.zzH(zzlv.zzf(obj, j4), zzlv.zzf(obj2, j4));
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
                    if (zzlv.zzc(obj, jZzr) != zzlv.zzc(obj2, jZzr) || !zzkt.zzH(zzlv.zzf(obj, j4), zzlv.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzH) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzkr
    public final boolean zzl(Object obj) {
        int i;
        int i10;
        List list;
        zzkr zzkrVarZzx;
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
                list = (List) zzlv.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzkrVarZzx = zzx(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!zzkrVarZzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj2, i16, i15) && !zzP(obj2, iZzu, zzx(i15))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzlv.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzkrVarZzx = zzx(i15);
                    while (i11 < list.size()) {
                        if (!zzkrVarZzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzjy) zzlv.zzf(obj2, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i12++;
            obj = obj2;
            i14 = i;
            i13 = i10;
        }
        return !this.zzh || this.zzo.zzb(obj).zzk();
    }
}
