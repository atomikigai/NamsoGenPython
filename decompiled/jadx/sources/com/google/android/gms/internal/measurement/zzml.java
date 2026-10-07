package com.google.android.gms.internal.measurement;

import androidx.webkit.TracingConfig;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbbs;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import q1.a;
import sun.misc.Unsafe;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private zzml(int[] iArr, Object[] objArr, int i, int i10, zzmi zzmiVar, boolean z4, boolean z10, int[] iArr2, int i11, int i12, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i10;
        this.zzi = z4;
        boolean z11 = false;
        if (zzkoVar != null && zzkoVar.zzc(zzmiVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i11;
        this.zzl = i12;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }

    private final zzlf zzA(int i) {
        int i10 = i / 3;
        return (zzlf) this.zzd[i10 + i10 + 1];
    }

    private final zzmt zzB(int i) {
        int i10 = i / 3;
        int i11 = i10 + i10;
        zzmt zzmtVar = (zzmt) this.zzd[i11];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzmtVarZzb = zzmq.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzmtVarZzb;
        return zzmtVarZzb;
    }

    private final Object zzC(int i) {
        int i10 = i / 3;
        return this.zzd[i10 + i10];
    }

    private final Object zzD(Object obj, int i) {
        zzmt zzmtVarZzB = zzB(i);
        int iZzy = zzy(i) & 1048575;
        if (!zzP(obj, i)) {
            return zzmtVarZzB.zze();
        }
        Object object = zzb.getObject(obj, iZzy);
        if (zzS(object)) {
            return object;
        }
        Object objZze = zzmtVarZzB.zze();
        if (object != null) {
            zzmtVarZzB.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzE(Object obj, int i, int i10) {
        zzmt zzmtVarZzB = zzB(i10);
        if (!zzT(obj, i, i10)) {
            return zzmtVarZzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i10) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object objZze = zzmtVarZzB.zze();
        if (object != null) {
            zzmtVarZzB.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzF(Class cls, String str) {
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

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        if (zzP(obj2, i)) {
            int iZzy = zzy(i) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = iZzy;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzmt zzmtVarZzB = zzB(i);
            if (!zzP(obj, i)) {
                if (zzS(object)) {
                    Object objZze = zzmtVarZzB.zze();
                    zzmtVarZzB.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzJ(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzS(object2)) {
                Object objZze2 = zzmtVarZzB.zze();
                zzmtVarZzB.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzmtVarZzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int i10 = this.zzc[i];
        if (zzT(obj2, i10, i)) {
            int iZzy = zzy(i) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = iZzy;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzmt zzmtVarZzB = zzB(i);
            if (!zzT(obj, i10, i)) {
                if (zzS(object)) {
                    Object objZze = zzmtVarZzB.zze();
                    zzmtVarZzB.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzK(obj, i10, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzS(object2)) {
                Object objZze2 = zzmtVarZzB.zze();
                zzmtVarZzB.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzmtVarZzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i) {
        int iZzv = zzv(i);
        long j4 = 1048575 & iZzv;
        if (j4 == 1048575) {
            return;
        }
        zznu.zzq(obj, j4, (1 << (iZzv >>> 20)) | zznu.zzc(obj, j4));
    }

    private final void zzK(Object obj, int i, int i10) {
        zznu.zzq(obj, zzv(i10) & 1048575, i);
    }

    private final void zzL(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzy(i) & 1048575, obj2);
        zzJ(obj, i);
    }

    private final void zzM(Object obj, int i, int i10, Object obj2) {
        zzb.putObject(obj, zzy(i10) & 1048575, obj2);
        zzK(obj, i, i10);
    }

    private final void zzN(zzoc zzocVar, int i, Object obj, int i10) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        return zzP(obj, i) == zzP(obj2, i);
    }

    private final boolean zzP(Object obj, int i) {
        int iZzv = zzv(i);
        long j4 = iZzv & 1048575;
        if (j4 != 1048575) {
            return (zznu.zzc(obj, j4) & (1 << (iZzv >>> 20))) != 0;
        }
        int iZzy = zzy(i);
        long j10 = iZzy & 1048575;
        switch (zzx(iZzy)) {
            case 0:
                return Double.doubleToRawLongBits(zznu.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zznu.zzb(obj, j10)) != 0;
            case 2:
                return zznu.zzd(obj, j10) != 0;
            case 3:
                return zznu.zzd(obj, j10) != 0;
            case 4:
                return zznu.zzc(obj, j10) != 0;
            case 5:
                return zznu.zzd(obj, j10) != 0;
            case 6:
                return zznu.zzc(obj, j10) != 0;
            case 7:
                return zznu.zzw(obj, j10);
            case 8:
                Object objZzf = zznu.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzka) {
                    return !zzka.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zznu.zzf(obj, j10) != null;
            case 10:
                return !zzka.zzb.equals(zznu.zzf(obj, j10));
            case 11:
                return zznu.zzc(obj, j10) != 0;
            case 12:
                return zznu.zzc(obj, j10) != 0;
            case 13:
                return zznu.zzc(obj, j10) != 0;
            case 14:
                return zznu.zzd(obj, j10) != 0;
            case 15:
                return zznu.zzc(obj, j10) != 0;
            case 16:
                return zznu.zzd(obj, j10) != 0;
            case 17:
                return zznu.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return zzP(obj, i);
        }
        return (i11 & i12) != 0;
    }

    private static boolean zzR(Object obj, int i, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i, int i10) {
        return zznu.zzc(obj, (long) (zzv(i10) & 1048575)) == i;
    }

    private static boolean zzU(Object obj, long j4) {
        return ((Boolean) zznu.zzf(obj, j4)).booleanValue();
    }

    private static final void zzV(int i, Object obj, zzoc zzocVar) throws IOException {
        if (obj instanceof String) {
            zzocVar.zzF(i, (String) obj);
        } else {
            zzocVar.zzd(i, (zzka) obj);
        }
    }

    public static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar != zznl.zzc()) {
            return zznlVar;
        }
        zznl zznlVarZzf = zznl.zzf();
        zzlbVar.zzc = zznlVarZzf;
        return zznlVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x030f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0394  */
    public static zzml zzl(Class cls, zzmf zzmfVar, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        int i;
        int iCharAt;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int i16;
        char cCharAt2;
        int i17;
        char cCharAt3;
        int i18;
        char cCharAt4;
        int i19;
        char cCharAt5;
        int i20;
        char cCharAt6;
        int i21;
        char cCharAt7;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i27;
        Field fieldZzF;
        int i28;
        char cCharAt9;
        int i29;
        Field fieldZzF2;
        Field fieldZzF3;
        int i30;
        char cCharAt10;
        int i31;
        int i32;
        char cCharAt11;
        int i33;
        int i34;
        char cCharAt12;
        int i35;
        char cCharAt13;
        if (!(zzmfVar instanceof zzms)) {
            throw null;
        }
        zzms zzmsVar = (zzms) zzmfVar;
        int iZzc = zzmsVar.zzc();
        String strZzd = zzmsVar.zzd();
        int length = strZzd.length();
        int i36 = 0;
        if (strZzd.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i = i37 + 1;
                if (strZzd.charAt(i37) < 55296) {
                    break;
                }
                i37 = i;
            }
        } else {
            i = 1;
        }
        int i38 = i + 1;
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i39 = iCharAt2 & 8191;
            int i40 = 13;
            while (true) {
                i35 = i38 + 1;
                cCharAt13 = strZzd.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i35;
            }
            iCharAt2 = i39 | (cCharAt13 << i40);
            i38 = i35;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            iCharAt = 0;
            i12 = 0;
            i14 = 0;
            i11 = 0;
            iArr = zza;
            i10 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt3 = strZzd.charAt(i38);
            if (iCharAt3 >= 55296) {
                int i42 = iCharAt3 & 8191;
                int i43 = 13;
                while (true) {
                    i22 = i41 + 1;
                    cCharAt8 = strZzd.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i22;
                }
                iCharAt3 = i42 | (cCharAt8 << i43);
                i41 = i22;
            }
            int i44 = i41 + 1;
            int iCharAt4 = strZzd.charAt(i41);
            if (iCharAt4 >= 55296) {
                int i45 = iCharAt4 & 8191;
                int i46 = 13;
                while (true) {
                    i21 = i44 + 1;
                    cCharAt7 = strZzd.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i21;
                }
                iCharAt4 = i45 | (cCharAt7 << i46);
                i44 = i21;
            }
            int i47 = i44 + 1;
            int iCharAt5 = strZzd.charAt(i44);
            if (iCharAt5 >= 55296) {
                int i48 = iCharAt5 & 8191;
                int i49 = 13;
                while (true) {
                    i20 = i47 + 1;
                    cCharAt6 = strZzd.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i20;
                }
                iCharAt5 = i48 | (cCharAt6 << i49);
                i47 = i20;
            }
            int i50 = i47 + 1;
            int iCharAt6 = strZzd.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i19 = i50 + 1;
                    cCharAt5 = strZzd.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i19;
                }
                iCharAt6 = i51 | (cCharAt5 << i52);
                i50 = i19;
            }
            int i53 = i50 + 1;
            iCharAt = strZzd.charAt(i50);
            if (iCharAt >= 55296) {
                int i54 = iCharAt & 8191;
                int i55 = 13;
                while (true) {
                    i18 = i53 + 1;
                    cCharAt4 = strZzd.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i18;
                }
                iCharAt = i54 | (cCharAt4 << i55);
                i53 = i18;
            }
            int i56 = i53 + 1;
            int iCharAt7 = strZzd.charAt(i53);
            if (iCharAt7 >= 55296) {
                int i57 = iCharAt7 & 8191;
                int i58 = 13;
                while (true) {
                    i17 = i56 + 1;
                    cCharAt3 = strZzd.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i17;
                }
                iCharAt7 = i57 | (cCharAt3 << i58);
                i56 = i17;
            }
            int i59 = i56 + 1;
            int iCharAt8 = strZzd.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i60 = iCharAt8 & 8191;
                int i61 = 13;
                while (true) {
                    i16 = i59 + 1;
                    cCharAt2 = strZzd.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i16;
                }
                iCharAt8 = i60 | (cCharAt2 << i61);
                i59 = i16;
            }
            int i62 = i59 + 1;
            int iCharAt9 = strZzd.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i15 = i64 + 1;
                    cCharAt = strZzd.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i64 = i15;
                }
                iCharAt9 = i63 | (cCharAt << i65);
                i62 = i15;
            }
            int i66 = iCharAt9 + iCharAt7 + iCharAt8;
            int i67 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[i66];
            i36 = iCharAt3;
            iArr = iArr2;
            i10 = iCharAt7;
            i11 = iCharAt9;
            i38 = i62;
            i12 = iCharAt5;
            i13 = i67;
            i14 = iCharAt6;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzmsVar.zze();
        Class<?> cls2 = zzmsVar.zza().getClass();
        int i68 = i11 + i10;
        int i69 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i69];
        int i70 = i11;
        int i71 = i68;
        int i72 = 0;
        int i73 = 0;
        while (true) {
            boolean z4 = iZzc == 2;
            if (i38 >= length) {
                return new zzml(iArr3, objArr, i12, i14, zzmsVar.zza(), z4, false, iArr, i11, i68, zzmnVar, zzlwVar, zznkVar, zzkoVar, zzmdVar);
            }
            int i74 = i38 + 1;
            int iCharAt10 = strZzd.charAt(i38);
            zzms zzmsVar2 = zzmsVar;
            if (iCharAt10 >= 55296) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i34 = i76 + 1;
                    cCharAt12 = strZzd.charAt(i76);
                    i23 = iZzc;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i34;
                    iZzc = i23;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i24 = i34;
            } else {
                i23 = iZzc;
                i24 = i74;
            }
            int i78 = i24 + 1;
            int iCharAt11 = strZzd.charAt(i24);
            if (iCharAt11 >= 55296) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i32 = i80 + 1;
                    cCharAt11 = strZzd.charAt(i80);
                    i33 = i79;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i79 = i33 | ((cCharAt11 & 8191) << i81);
                    i81 += 13;
                    i80 = i32;
                }
                iCharAt11 = i33 | (cCharAt11 << i81);
                i25 = i32;
            } else {
                i25 = i78;
            }
            int i82 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i73] = i72;
                i73++;
            }
            int i83 = iCharAt11 & 255;
            int i84 = i36;
            if (i83 >= 51) {
                int i85 = i25 + 1;
                int iCharAt12 = strZzd.charAt(i25);
                if (iCharAt12 >= 55296) {
                    int i86 = iCharAt12 & 8191;
                    int i87 = i85;
                    int i88 = 13;
                    while (true) {
                        i30 = i87 + 1;
                        cCharAt10 = strZzd.charAt(i87);
                        i31 = i86;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i86 = i31 | ((cCharAt10 & 8191) << i88);
                        i88 += 13;
                        i87 = i30;
                    }
                    iCharAt12 = i31 | (cCharAt10 << i88);
                    i29 = i30;
                } else {
                    i29 = i85;
                }
                int i89 = iCharAt12;
                int i90 = i83 - 51;
                int i91 = i29;
                if (i90 == 9 || i90 == 17) {
                    objArr[a.v(i72, 3, 1)] = objArrZze[i13];
                    i13++;
                } else if (i90 == 12 && !z4) {
                    objArr[a.v(i72, 3, 1)] = objArrZze[i13];
                    i13++;
                }
                int i92 = i89 + i89;
                Object obj = objArrZze[i92];
                if (obj instanceof Field) {
                    fieldZzF2 = (Field) obj;
                } else {
                    fieldZzF2 = zzF(cls2, (String) obj);
                    objArrZze[i92] = fieldZzF2;
                }
                i26 = iCharAt10;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzF2);
                int i93 = i92 + 1;
                Object obj2 = objArrZze[i93];
                if (obj2 instanceof Field) {
                    fieldZzF3 = (Field) obj2;
                } else {
                    fieldZzF3 = zzF(cls2, (String) obj2);
                    objArrZze[i93] = fieldZzF3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzF3);
                strZzd = strZzd;
                i38 = i91;
                i27 = 0;
            } else {
                i26 = iCharAt10;
                int i94 = i13 + 1;
                Field fieldZzF4 = zzF(cls2, (String) objArrZze[i13]);
                if (i83 == 9 || i83 == 17) {
                    objArr[a.v(i72, 3, 1)] = fieldZzF4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i13 += 2;
                        objArr[a.v(i72, 3, 1)] = objArrZze[i94];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        if (!z4) {
                            i13 += 2;
                            objArr[a.v(i72, 3, 1)] = objArrZze[i94];
                        }
                    } else if (i83 == 50) {
                        int i95 = i70 + 1;
                        iArr[i70] = i72;
                        int i96 = i72 / 3;
                        int i97 = i13 + 2;
                        int i98 = i96 + i96;
                        objArr[i98] = objArrZze[i94];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i98 + 1] = objArrZze[i97];
                            i13 += 3;
                        } else {
                            i13 = i97;
                        }
                        i70 = i95;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzF4);
                    if ((iCharAt11 & 4096) == 4096 || i83 > 17) {
                        i38 = i25;
                        iObjectFieldOffset2 = 1048575;
                        i27 = 0;
                    } else {
                        i38 = i25 + 1;
                        int iCharAt13 = strZzd.charAt(i25);
                        if (iCharAt13 >= 55296) {
                            int i99 = iCharAt13 & 8191;
                            int i100 = 13;
                            while (true) {
                                i28 = i38 + 1;
                                cCharAt9 = strZzd.charAt(i38);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i99 |= (cCharAt9 & 8191) << i100;
                                i100 += 13;
                                i38 = i28;
                            }
                            iCharAt13 = i99 | (cCharAt9 << i100);
                            i38 = i28;
                        }
                        int i101 = (iCharAt13 / 32) + i84 + i84;
                        Object obj3 = objArrZze[i101];
                        int i102 = iCharAt13;
                        if (obj3 instanceof Field) {
                            fieldZzF = (Field) obj3;
                        } else {
                            fieldZzF = zzF(cls2, (String) obj3);
                            objArrZze[i101] = fieldZzF;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzF);
                        i27 = i102 % 32;
                    }
                    if (i83 >= 18 && i83 <= 49) {
                        iArr[i71] = iObjectFieldOffset;
                        i71++;
                    }
                }
                i13 = i94;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzF4);
                if ((iCharAt11 & 4096) == 4096) {
                    i38 = i25;
                    iObjectFieldOffset2 = 1048575;
                    i27 = 0;
                } else {
                    i38 = i25;
                    iObjectFieldOffset2 = 1048575;
                    i27 = 0;
                }
                if (i83 >= 18) {
                    iArr[i71] = iObjectFieldOffset;
                    i71++;
                }
            }
            int i103 = i72 + 1;
            iArr3[i72] = i26;
            int i104 = i72 + 2;
            int i105 = iObjectFieldOffset2;
            iArr3[i103] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i83 << 20) | iObjectFieldOffset;
            i72 += 3;
            iArr3[i104] = (i27 << 20) | i105;
            strZzd = strZzd;
            length = i82;
            zzmsVar = zzmsVar2;
            i36 = i84;
            iZzc = i23;
        }
    }

    private static double zzm(Object obj, long j4) {
        return ((Double) zznu.zzf(obj, j4)).doubleValue();
    }

    private static float zzn(Object obj, long j4) {
        return ((Float) zznu.zzf(obj, j4)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzo(Object obj) {
        int i;
        int iZzn;
        int iZzy;
        int iZzt;
        boolean z4;
        int iZzc;
        int iZzy2;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int iY = 0;
        int i13 = 0;
        while (i12 < this.zzc.length) {
            int iZzy3 = zzy(i12);
            int[] iArr = this.zzc;
            int i14 = iArr[i12];
            int iZzx = zzx(iZzy3);
            if (iZzx <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & i10;
                int i17 = i15 >>> 20;
                if (i16 != i11) {
                    i13 = unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i = 1 << i17;
            } else {
                i = 0;
            }
            long j4 = iZzy3 & i10;
            switch (iZzx) {
                case 0:
                    if ((i13 & i) != 0) {
                        iY = a.y(i14 << 3, 8, iY);
                    }
                    break;
                case 1:
                    if ((i13 & i) != 0) {
                        iY = a.y(i14 << 3, 4, iY);
                    }
                    break;
                case 2:
                    if ((i13 & i) != 0) {
                        iY = a.y(i14 << 3, zzki.zzy(unsafe.getLong(obj, j4)), iY);
                    }
                    break;
                case 3:
                    if ((i13 & i) != 0) {
                        iY = a.y(i14 << 3, zzki.zzy(unsafe.getLong(obj, j4)), iY);
                    }
                    break;
                case 4:
                    if ((i13 & i) != 0) {
                        iY = a.y(i14 << 3, zzki.zzu(unsafe.getInt(obj, j4)), iY);
                    }
                    break;
                case 5:
                    if ((i13 & i) != 0) {
                        iY = a.y(i14 << 3, 8, iY);
                    }
                    break;
                case 6:
                    if ((i13 & i) != 0) {
                        iY = a.y(i14 << 3, 4, iY);
                    }
                    break;
                case 7:
                    if ((i13 & i) != 0) {
                        iY = a.y(i14 << 3, 1, iY);
                    }
                    break;
                case 8:
                    if ((i13 & i) != 0) {
                        Object object = unsafe.getObject(obj, j4);
                        if (!(object instanceof zzka)) {
                            iY = a.y(i14 << 3, zzki.zzw((String) object), iY);
                        } else {
                            int i18 = zzki.zzb;
                            int iZzd = ((zzka) object).zzd();
                            iY = a.y(i14 << 3, zzki.zzx(iZzd) + iZzd, iY);
                        }
                    }
                    break;
                case 9:
                    if ((i13 & i) != 0) {
                        iZzn = zzmv.zzn(i14, unsafe.getObject(obj, j4), zzB(i12));
                        iY += iZzn;
                    }
                    break;
                case 10:
                    if ((i13 & i) != 0) {
                        zzka zzkaVar = (zzka) unsafe.getObject(obj, j4);
                        int i19 = zzki.zzb;
                        int iZzd2 = zzkaVar.zzd();
                        iY = a.y(i14 << 3, zzki.zzx(iZzd2) + iZzd2, iY);
                    }
                    break;
                case 11:
                    if ((i13 & i) != 0) {
                        iY = a.y(i14 << 3, zzki.zzx(unsafe.getInt(obj, j4)), iY);
                    }
                    break;
                case 12:
                    if ((i13 & i) != 0) {
                        iY = a.y(i14 << 3, zzki.zzu(unsafe.getInt(obj, j4)), iY);
                    }
                    break;
                case 13:
                    if ((i13 & i) != 0) {
                        iY = a.y(i14 << 3, 4, iY);
                    }
                    break;
                case 14:
                    if ((i13 & i) != 0) {
                        iY = a.y(i14 << 3, 8, iY);
                    }
                    break;
                case 15:
                    if ((i13 & i) != 0) {
                        int i20 = unsafe.getInt(obj, j4);
                        iY = a.y((i20 >> 31) ^ (i20 + i20), zzki.zzx(i14 << 3), iY);
                    }
                    break;
                case 16:
                    if ((i13 & i) != 0) {
                        long j10 = unsafe.getLong(obj, j4);
                        iZzy = zzki.zzy((j10 >> 63) ^ (j10 + j10)) + zzki.zzx(i14 << 3);
                        iY += iZzy;
                    }
                    break;
                case 17:
                    if ((i13 & i) != 0) {
                        iZzy = zzki.zzt(i14, (zzmi) unsafe.getObject(obj, j4), zzB(i12));
                        iY += iZzy;
                    }
                    break;
                case 18:
                    iZzn = zzmv.zzg(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzn;
                    break;
                case 19:
                    iZzn = zzmv.zze(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzn;
                    break;
                case 20:
                    iZzn = zzmv.zzl(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzn;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    iZzn = zzmv.zzw(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzn;
                    break;
                case 22:
                    iZzn = zzmv.zzj(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzn;
                    break;
                case 23:
                    iZzn = zzmv.zzg(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzn;
                    break;
                case 24:
                    iZzn = zzmv.zze(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzn;
                    break;
                case 25:
                    iZzn = zzmv.zza(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzn;
                    break;
                case 26:
                    iZzt = zzmv.zzt(i14, (List) unsafe.getObject(obj, j4));
                    iY += iZzt;
                    break;
                case 27:
                    iZzt = zzmv.zzo(i14, (List) unsafe.getObject(obj, j4), zzB(i12));
                    iY += iZzt;
                    break;
                case 28:
                    iZzt = zzmv.zzb(i14, (List) unsafe.getObject(obj, j4));
                    iY += iZzt;
                    break;
                case 29:
                    iZzt = zzmv.zzu(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzt;
                    break;
                case 30:
                    z4 = false;
                    iZzc = zzmv.zzc(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzc;
                    break;
                case 31:
                    z4 = false;
                    iZzc = zzmv.zze(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzc;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    z4 = false;
                    iZzc = zzmv.zzg(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzc;
                    break;
                case 33:
                    z4 = false;
                    iZzc = zzmv.zzp(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzc;
                    break;
                case 34:
                    z4 = false;
                    iZzc = zzmv.zzr(i14, (List) unsafe.getObject(obj, j4), false);
                    iY += iZzc;
                    break;
                case 35:
                    int iZzh = zzmv.zzh((List) unsafe.getObject(obj, j4));
                    if (iZzh > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzh), iZzh, iY);
                    }
                    break;
                case 36:
                    int iZzf = zzmv.zzf((List) unsafe.getObject(obj, j4));
                    if (iZzf > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzf), iZzf, iY);
                    }
                    break;
                case 37:
                    int iZzm = zzmv.zzm((List) unsafe.getObject(obj, j4));
                    if (iZzm > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzm), iZzm, iY);
                    }
                    break;
                case 38:
                    int iZzx2 = zzmv.zzx((List) unsafe.getObject(obj, j4));
                    if (iZzx2 > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzx2), iZzx2, iY);
                    }
                    break;
                case 39:
                    int iZzk = zzmv.zzk((List) unsafe.getObject(obj, j4));
                    if (iZzk > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzk), iZzk, iY);
                    }
                    break;
                case 40:
                    int iZzh2 = zzmv.zzh((List) unsafe.getObject(obj, j4));
                    if (iZzh2 > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzh2), iZzh2, iY);
                    }
                    break;
                case 41:
                    int iZzf2 = zzmv.zzf((List) unsafe.getObject(obj, j4));
                    if (iZzf2 > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzf2), iZzf2, iY);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j4);
                    int i21 = zzmv.zza;
                    int size = list.size();
                    if (size > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(size), size, iY);
                    }
                    break;
                case 43:
                    int iZzv = zzmv.zzv((List) unsafe.getObject(obj, j4));
                    if (iZzv > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzv), iZzv, iY);
                    }
                    break;
                case 44:
                    int iZzd3 = zzmv.zzd((List) unsafe.getObject(obj, j4));
                    if (iZzd3 > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzd3), iZzd3, iY);
                    }
                    break;
                case 45:
                    int iZzf3 = zzmv.zzf((List) unsafe.getObject(obj, j4));
                    if (iZzf3 > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzf3), iZzf3, iY);
                    }
                    break;
                case 46:
                    int iZzh3 = zzmv.zzh((List) unsafe.getObject(obj, j4));
                    if (iZzh3 > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzh3), iZzh3, iY);
                    }
                    break;
                case 47:
                    int iZzq = zzmv.zzq((List) unsafe.getObject(obj, j4));
                    if (iZzq > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzq), iZzq, iY);
                    }
                    break;
                case 48:
                    int iZzs = zzmv.zzs((List) unsafe.getObject(obj, j4));
                    if (iZzs > 0) {
                        iY = a.w(i14 << 3, zzki.zzx(iZzs), iZzs, iY);
                    }
                    break;
                case 49:
                    iZzt = zzmv.zzi(i14, (List) unsafe.getObject(obj, j4), zzB(i12));
                    iY += iZzt;
                    break;
                case 50:
                    zzmd.zza(i14, unsafe.getObject(obj, j4), zzC(i12));
                    break;
                case 51:
                    if (zzT(obj, i14, i12)) {
                        iY = a.y(i14 << 3, 8, iY);
                    }
                    break;
                case 52:
                    if (zzT(obj, i14, i12)) {
                        iY = a.y(i14 << 3, 4, iY);
                    }
                    break;
                case 53:
                    if (zzT(obj, i14, i12)) {
                        iY = a.y(i14 << 3, zzki.zzy(zzz(obj, j4)), iY);
                    }
                    break;
                case 54:
                    if (zzT(obj, i14, i12)) {
                        iY = a.y(i14 << 3, zzki.zzy(zzz(obj, j4)), iY);
                    }
                    break;
                case 55:
                    if (zzT(obj, i14, i12)) {
                        iY = a.y(i14 << 3, zzki.zzu(zzp(obj, j4)), iY);
                    }
                    break;
                case 56:
                    if (zzT(obj, i14, i12)) {
                        iY = a.y(i14 << 3, 8, iY);
                    }
                    break;
                case 57:
                    if (zzT(obj, i14, i12)) {
                        iY = a.y(i14 << 3, 4, iY);
                    }
                    break;
                case 58:
                    if (zzT(obj, i14, i12)) {
                        iY = a.y(i14 << 3, 1, iY);
                    }
                    break;
                case 59:
                    if (zzT(obj, i14, i12)) {
                        Object object2 = unsafe.getObject(obj, j4);
                        if (object2 instanceof zzka) {
                            int i22 = zzki.zzb;
                            int iZzd4 = ((zzka) object2).zzd();
                            iY = a.y(i14 << 3, zzki.zzx(iZzd4) + iZzd4, iY);
                        } else {
                            iY = a.y(i14 << 3, zzki.zzw((String) object2), iY);
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i14, i12)) {
                        iZzt = zzmv.zzn(i14, unsafe.getObject(obj, j4), zzB(i12));
                        iY += iZzt;
                    }
                    break;
                case 61:
                    if (zzT(obj, i14, i12)) {
                        zzka zzkaVar2 = (zzka) unsafe.getObject(obj, j4);
                        int i23 = zzki.zzb;
                        int iZzd5 = zzkaVar2.zzd();
                        iY = a.y(i14 << 3, zzki.zzx(iZzd5) + iZzd5, iY);
                    }
                    break;
                case 62:
                    if (zzT(obj, i14, i12)) {
                        iY = a.y(i14 << 3, zzki.zzx(zzp(obj, j4)), iY);
                    }
                    break;
                case 63:
                    if (zzT(obj, i14, i12)) {
                        iY = a.y(i14 << 3, zzki.zzu(zzp(obj, j4)), iY);
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzT(obj, i14, i12)) {
                        iY = a.y(i14 << 3, 4, iY);
                    }
                    break;
                case 65:
                    if (zzT(obj, i14, i12)) {
                        iY = a.y(i14 << 3, 8, iY);
                    }
                    break;
                case 66:
                    if (zzT(obj, i14, i12)) {
                        int iZzp = zzp(obj, j4);
                        iY = a.y((iZzp >> 31) ^ (iZzp + iZzp), zzki.zzx(i14 << 3), iY);
                    }
                    break;
                case 67:
                    if (zzT(obj, i14, i12)) {
                        long jZzz = zzz(obj, j4);
                        iZzy2 = zzki.zzy((jZzz >> 63) ^ (jZzz + jZzz)) + zzki.zzx(i14 << 3);
                        iY += iZzy2;
                    }
                    break;
                case 68:
                    if (zzT(obj, i14, i12)) {
                        iZzy2 = zzki.zzt(i14, (zzmi) unsafe.getObject(obj, j4), zzB(i12));
                        iY += iZzy2;
                    }
                    break;
                default:
                    break;
            }
            i12 += 3;
            i10 = 1048575;
        }
        zznk zznkVar = this.zzn;
        int iZza = iY + zznkVar.zza(zznkVar.zzd(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j4) {
        return ((Integer) zznu.zzf(obj, j4)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i, int i10, int i11, long j4, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzC = zzC(i11);
        Object object = unsafe.getObject(obj, j4);
        if (!((zzmc) object).zze()) {
            zzmc zzmcVarZzb = zzmc.zza().zzb();
            zzmd.zzb(zzmcVarZzb, object);
            unsafe.putObject(obj, j4, zzmcVarZzb);
        }
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i, int i10, int i11, int i12, int i13, int i14, int i15, long j4, int i16, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        long j10 = this.zzc[i16 + 2] & 1048575;
        switch (i15) {
            case 51:
                if (i13 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j4, Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i))));
                int i17 = i + 8;
                unsafe.putInt(obj, j10, i12);
                return i17;
            case 52:
                if (i13 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j4, Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i))));
                int i18 = i + 4;
                unsafe.putInt(obj, j10, i12);
                return i18;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i;
                }
                int iZzm = zzjo.zzm(bArr, i, zzjnVar);
                unsafe.putObject(obj, j4, Long.valueOf(zzjnVar.zzb));
                unsafe.putInt(obj, j10, i12);
                return iZzm;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i;
                }
                int iZzj = zzjo.zzj(bArr, i, zzjnVar);
                unsafe.putObject(obj, j4, Integer.valueOf(zzjnVar.zza));
                unsafe.putInt(obj, j10, i12);
                return iZzj;
            case 56:
            case 65:
                if (i13 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j4, Long.valueOf(zzjo.zzp(bArr, i)));
                int i19 = i + 8;
                unsafe.putInt(obj, j10, i12);
                return i19;
            case 57:
            case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                if (i13 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(zzjo.zzb(bArr, i)));
                int i20 = i + 4;
                unsafe.putInt(obj, j10, i12);
                return i20;
            case 58:
                if (i13 != 0) {
                    return i;
                }
                int iZzm2 = zzjo.zzm(bArr, i, zzjnVar);
                unsafe.putObject(obj, j4, Boolean.valueOf(zzjnVar.zzb != 0));
                unsafe.putInt(obj, j10, i12);
                return iZzm2;
            case 59:
                if (i13 != 2) {
                    return i;
                }
                int iZzj2 = zzjo.zzj(bArr, i, zzjnVar);
                int i21 = zzjnVar.zza;
                if (i21 == 0) {
                    unsafe.putObject(obj, j4, "");
                } else {
                    if ((i14 & 536870912) != 0 && !zznz.zze(bArr, iZzj2, iZzj2 + i21)) {
                        throw zzll.zzc();
                    }
                    unsafe.putObject(obj, j4, new String(bArr, iZzj2, i21, zzlj.zzb));
                    iZzj2 += i21;
                }
                unsafe.putInt(obj, j10, i12);
                return iZzj2;
            case 60:
                if (i13 != 2) {
                    return i;
                }
                Object objZzE = zzE(obj, i12, i16);
                int iZzo = zzjo.zzo(objZzE, zzB(i16), bArr, i, i10, zzjnVar);
                zzM(obj, i12, i16, objZzE);
                return iZzo;
            case 61:
                if (i13 != 2) {
                    return i;
                }
                int iZza = zzjo.zza(bArr, i, zzjnVar);
                unsafe.putObject(obj, j4, zzjnVar.zzc);
                unsafe.putInt(obj, j10, i12);
                return iZza;
            case 63:
                if (i13 != 0) {
                    return i;
                }
                int iZzj3 = zzjo.zzj(bArr, i, zzjnVar);
                int i22 = zzjnVar.zza;
                zzlf zzlfVarZzA = zzA(i16);
                if (zzlfVarZzA != null && !zzlfVarZzA.zza(i22)) {
                    zzd(obj).zzj(i11, Long.valueOf(i22));
                    return iZzj3;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(i22));
                unsafe.putInt(obj, j10, i12);
                return iZzj3;
            case 66:
                if (i13 != 0) {
                    return i;
                }
                int iZzj4 = zzjo.zzj(bArr, i, zzjnVar);
                unsafe.putObject(obj, j4, Integer.valueOf(zzke.zzb(zzjnVar.zza)));
                unsafe.putInt(obj, j10, i12);
                return iZzj4;
            case 67:
                if (i13 != 0) {
                    return i;
                }
                int iZzm3 = zzjo.zzm(bArr, i, zzjnVar);
                unsafe.putObject(obj, j4, Long.valueOf(zzke.zzc(zzjnVar.zzb)));
                unsafe.putInt(obj, j10, i12);
                return iZzm3;
            case 68:
                if (i13 == 3) {
                    Object objZzE2 = zzE(obj, i12, i16);
                    int iZzn = zzjo.zzn(objZzE2, zzB(i16), bArr, i, i10, (i11 & (-8)) | 4, zzjnVar);
                    zzM(obj, i12, i16, objZzE2);
                    return iZzn;
                }
                break;
        }
        return i;
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i10, int i11, int i12, int i13, int i14, long j4, int i15, long j10, zzjn zzjnVar) throws IOException {
        int i16;
        int i17;
        int iZzl;
        Unsafe unsafe = zzb;
        zzli zzliVarZzd = (zzli) unsafe.getObject(obj, j10);
        if (!zzliVarZzd.zzc()) {
            int size = zzliVarZzd.size();
            zzliVarZzd = zzliVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j10, zzliVarZzd);
        }
        zzli zzliVar = zzliVarZzd;
        switch (i15) {
            case 18:
            case 35:
                if (i13 == 2) {
                    zzkk zzkkVar = (zzkk) zzliVar;
                    int iZzj = zzjo.zzj(bArr, i, zzjnVar);
                    int i18 = zzjnVar.zza + iZzj;
                    while (iZzj < i18) {
                        zzkkVar.zze(Double.longBitsToDouble(zzjo.zzp(bArr, iZzj)));
                        iZzj += 8;
                    }
                    if (iZzj == i18) {
                        return iZzj;
                    }
                    throw zzll.zzf();
                }
                if (i13 != 1) {
                    return i;
                }
                zzkk zzkkVar2 = (zzkk) zzliVar;
                zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, i)));
                int i19 = i + 8;
                while (i19 < i10) {
                    int iZzj2 = zzjo.zzj(bArr, i19, zzjnVar);
                    if (i11 != zzjnVar.zza) {
                        return i19;
                    }
                    zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, iZzj2)));
                    i19 = iZzj2 + 8;
                }
                return i19;
            case 19:
            case 36:
                if (i13 == 2) {
                    zzku zzkuVar = (zzku) zzliVar;
                    int iZzj3 = zzjo.zzj(bArr, i, zzjnVar);
                    int i20 = zzjnVar.zza + iZzj3;
                    while (iZzj3 < i20) {
                        zzkuVar.zze(Float.intBitsToFloat(zzjo.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i20) {
                        return iZzj3;
                    }
                    throw zzll.zzf();
                }
                if (i13 != 5) {
                    return i;
                }
                zzku zzkuVar2 = (zzku) zzliVar;
                zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, i)));
                int i21 = i + 4;
                while (i21 < i10) {
                    int iZzj4 = zzjo.zzj(bArr, i21, zzjnVar);
                    if (i11 != zzjnVar.zza) {
                        return i21;
                    }
                    zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, iZzj4)));
                    i21 = iZzj4 + 4;
                }
                return i21;
            case 20:
            case zzbbs.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i13 == 2) {
                    zzlx zzlxVar = (zzlx) zzliVar;
                    int iZzj5 = zzjo.zzj(bArr, i, zzjnVar);
                    int i22 = zzjnVar.zza + iZzj5;
                    while (iZzj5 < i22) {
                        iZzj5 = zzjo.zzm(bArr, iZzj5, zzjnVar);
                        zzlxVar.zzg(zzjnVar.zzb);
                    }
                    if (iZzj5 == i22) {
                        return iZzj5;
                    }
                    throw zzll.zzf();
                }
                if (i13 != 0) {
                    return i;
                }
                zzlx zzlxVar2 = (zzlx) zzliVar;
                int iZzm = zzjo.zzm(bArr, i, zzjnVar);
                zzlxVar2.zzg(zzjnVar.zzb);
                while (iZzm < i10) {
                    int iZzj6 = zzjo.zzj(bArr, iZzm, zzjnVar);
                    if (i11 != zzjnVar.zza) {
                        return iZzm;
                    }
                    iZzm = zzjo.zzm(bArr, iZzj6, zzjnVar);
                    zzlxVar2.zzg(zzjnVar.zzb);
                }
                return iZzm;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return zzjo.zzf(bArr, i, zzliVar, zzjnVar);
                }
                return i13 == 0 ? zzjo.zzl(i11, bArr, i, i10, zzliVar, zzjnVar) : i;
            case 23:
            case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
            case 40:
            case 46:
                if (i13 == 2) {
                    zzlx zzlxVar3 = (zzlx) zzliVar;
                    int iZzj7 = zzjo.zzj(bArr, i, zzjnVar);
                    int i23 = zzjnVar.zza + iZzj7;
                    while (iZzj7 < i23) {
                        zzlxVar3.zzg(zzjo.zzp(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i23) {
                        return iZzj7;
                    }
                    throw zzll.zzf();
                }
                if (i13 != 1) {
                    return i;
                }
                zzlx zzlxVar4 = (zzlx) zzliVar;
                zzlxVar4.zzg(zzjo.zzp(bArr, i));
                int i24 = i + 8;
                while (i24 < i10) {
                    int iZzj8 = zzjo.zzj(bArr, i24, zzjnVar);
                    if (i11 != zzjnVar.zza) {
                        return i24;
                    }
                    zzlxVar4.zzg(zzjo.zzp(bArr, iZzj8));
                    i24 = iZzj8 + 8;
                }
                return i24;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    zzlc zzlcVar = (zzlc) zzliVar;
                    int iZzj9 = zzjo.zzj(bArr, i, zzjnVar);
                    int i25 = zzjnVar.zza + iZzj9;
                    while (iZzj9 < i25) {
                        zzlcVar.zzh(zzjo.zzb(bArr, iZzj9));
                        iZzj9 += 4;
                    }
                    if (iZzj9 == i25) {
                        return iZzj9;
                    }
                    throw zzll.zzf();
                }
                if (i13 != 5) {
                    return i;
                }
                zzlc zzlcVar2 = (zzlc) zzliVar;
                zzlcVar2.zzh(zzjo.zzb(bArr, i));
                int i26 = i + 4;
                while (i26 < i10) {
                    int iZzj10 = zzjo.zzj(bArr, i26, zzjnVar);
                    if (i11 != zzjnVar.zza) {
                        return i26;
                    }
                    zzlcVar2.zzh(zzjo.zzb(bArr, iZzj10));
                    i26 = iZzj10 + 4;
                }
                return i26;
            case 25:
            case 42:
                if (i13 == 2) {
                    zzjp zzjpVar = (zzjp) zzliVar;
                    int iZzj11 = zzjo.zzj(bArr, i, zzjnVar);
                    int i27 = zzjnVar.zza + iZzj11;
                    while (iZzj11 < i27) {
                        iZzj11 = zzjo.zzm(bArr, iZzj11, zzjnVar);
                        zzjpVar.zze(zzjnVar.zzb != 0);
                    }
                    if (iZzj11 == i27) {
                        return iZzj11;
                    }
                    throw zzll.zzf();
                }
                if (i13 != 0) {
                    return i;
                }
                zzjp zzjpVar2 = (zzjp) zzliVar;
                int iZzm2 = zzjo.zzm(bArr, i, zzjnVar);
                zzjpVar2.zze(zzjnVar.zzb != 0);
                while (iZzm2 < i10) {
                    int iZzj12 = zzjo.zzj(bArr, iZzm2, zzjnVar);
                    if (i11 != zzjnVar.zza) {
                        return iZzm2;
                    }
                    iZzm2 = zzjo.zzm(bArr, iZzj12, zzjnVar);
                    zzjpVar2.zze(zzjnVar.zzb != 0);
                }
                return iZzm2;
            case 26:
                if (i13 != 2) {
                    return i;
                }
                if ((j4 & 536870912) == 0) {
                    int iZzj13 = zzjo.zzj(bArr, i, zzjnVar);
                    int i28 = zzjnVar.zza;
                    if (i28 < 0) {
                        throw zzll.zzd();
                    }
                    if (i28 == 0) {
                        zzliVar.add("");
                    } else {
                        zzliVar.add(new String(bArr, iZzj13, i28, zzlj.zzb));
                        iZzj13 += i28;
                    }
                    while (iZzj13 < i10) {
                        int iZzj14 = zzjo.zzj(bArr, iZzj13, zzjnVar);
                        if (i11 != zzjnVar.zza) {
                            return iZzj13;
                        }
                        iZzj13 = zzjo.zzj(bArr, iZzj14, zzjnVar);
                        int i29 = zzjnVar.zza;
                        if (i29 < 0) {
                            throw zzll.zzd();
                        }
                        if (i29 == 0) {
                            zzliVar.add("");
                        } else {
                            zzliVar.add(new String(bArr, iZzj13, i29, zzlj.zzb));
                            iZzj13 += i29;
                        }
                    }
                    return iZzj13;
                }
                int iZzj15 = zzjo.zzj(bArr, i, zzjnVar);
                int i30 = zzjnVar.zza;
                if (i30 < 0) {
                    throw zzll.zzd();
                }
                if (i30 == 0) {
                    zzliVar.add("");
                } else {
                    int i31 = iZzj15 + i30;
                    if (!zznz.zze(bArr, iZzj15, i31)) {
                        throw zzll.zzc();
                    }
                    zzliVar.add(new String(bArr, iZzj15, i30, zzlj.zzb));
                    iZzj15 = i31;
                }
                while (iZzj15 < i10) {
                    int iZzj16 = zzjo.zzj(bArr, iZzj15, zzjnVar);
                    if (i11 != zzjnVar.zza) {
                        return iZzj15;
                    }
                    iZzj15 = zzjo.zzj(bArr, iZzj16, zzjnVar);
                    int i32 = zzjnVar.zza;
                    if (i32 < 0) {
                        throw zzll.zzd();
                    }
                    if (i32 == 0) {
                        zzliVar.add("");
                    } else {
                        int i33 = iZzj15 + i32;
                        if (!zznz.zze(bArr, iZzj15, i33)) {
                            throw zzll.zzc();
                        }
                        zzliVar.add(new String(bArr, iZzj15, i32, zzlj.zzb));
                        iZzj15 = i33;
                    }
                }
                return iZzj15;
            case 27:
                i16 = i;
                if (i13 == 2) {
                    return zzjo.zze(zzB(i14), i11, bArr, i16, i10, zzliVar, zzjnVar);
                }
                return i16;
            case 28:
                i16 = i;
                if (i13 == 2) {
                    int iZzj17 = zzjo.zzj(bArr, i16, zzjnVar);
                    int i34 = zzjnVar.zza;
                    if (i34 < 0) {
                        throw zzll.zzd();
                    }
                    if (i34 > bArr.length - iZzj17) {
                        throw zzll.zzf();
                    }
                    if (i34 == 0) {
                        zzliVar.add(zzka.zzb);
                    } else {
                        zzliVar.add(zzka.zzl(bArr, iZzj17, i34));
                        iZzj17 += i34;
                    }
                    while (iZzj17 < i10) {
                        int iZzj18 = zzjo.zzj(bArr, iZzj17, zzjnVar);
                        if (i11 != zzjnVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzjo.zzj(bArr, iZzj18, zzjnVar);
                        int i35 = zzjnVar.zza;
                        if (i35 < 0) {
                            throw zzll.zzd();
                        }
                        if (i35 > bArr.length - iZzj17) {
                            throw zzll.zzf();
                        }
                        if (i35 == 0) {
                            zzliVar.add(zzka.zzb);
                        } else {
                            zzliVar.add(zzka.zzl(bArr, iZzj17, i35));
                            iZzj17 += i35;
                        }
                    }
                    return iZzj17;
                }
                return i16;
            case 30:
            case 44:
                i17 = i;
                if (i13 != 2) {
                    if (i13 == 0) {
                        iZzl = zzjo.zzl(i11, bArr, i17, i10, zzliVar, zzjnVar);
                    }
                    return i17;
                }
                iZzl = zzjo.zzf(bArr, i17, zzliVar, zzjnVar);
                zzlf zzlfVarZzA = zzA(i14);
                zznk zznkVar = this.zzn;
                int i36 = zzmv.zza;
                if (zzlfVarZzA != null) {
                    Object objZzA = null;
                    if (zzliVar != null) {
                        int size2 = zzliVar.size();
                        int i37 = 0;
                        for (int i38 = 0; i38 < size2; i38++) {
                            Integer num = (Integer) zzliVar.get(i38);
                            int iIntValue = num.intValue();
                            if (zzlfVarZzA.zza(iIntValue)) {
                                if (i38 != i37) {
                                    zzliVar.set(i37, num);
                                }
                                i37++;
                            } else {
                                objZzA = zzmv.zzA(obj, i12, iIntValue, objZzA, zznkVar);
                            }
                        }
                        if (i37 != size2) {
                            zzliVar.subList(i37, size2).clear();
                            return iZzl;
                        }
                    } else {
                        Iterator it = zzliVar.iterator();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Integer) it.next()).intValue();
                            if (!zzlfVarZzA.zza(iIntValue2)) {
                                objZzA = zzmv.zzA(obj, i12, iIntValue2, objZzA, zznkVar);
                                it.remove();
                            }
                        }
                    }
                }
                return iZzl;
            case 33:
            case 47:
                i17 = i;
                if (i13 == 2) {
                    zzlc zzlcVar3 = (zzlc) zzliVar;
                    int iZzj19 = zzjo.zzj(bArr, i17, zzjnVar);
                    int i39 = zzjnVar.zza + iZzj19;
                    while (iZzj19 < i39) {
                        iZzj19 = zzjo.zzj(bArr, iZzj19, zzjnVar);
                        zzlcVar3.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    if (iZzj19 == i39) {
                        return iZzj19;
                    }
                    throw zzll.zzf();
                }
                if (i13 == 0) {
                    zzlc zzlcVar4 = (zzlc) zzliVar;
                    int iZzj20 = zzjo.zzj(bArr, i17, zzjnVar);
                    zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    while (iZzj20 < i10) {
                        int iZzj21 = zzjo.zzj(bArr, iZzj20, zzjnVar);
                        if (i11 != zzjnVar.zza) {
                            return iZzj20;
                        }
                        iZzj20 = zzjo.zzj(bArr, iZzj21, zzjnVar);
                        zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    return iZzj20;
                }
                return i17;
            case 34:
            case 48:
                i17 = i;
                if (i13 == 2) {
                    zzlx zzlxVar5 = (zzlx) zzliVar;
                    int iZzj22 = zzjo.zzj(bArr, i17, zzjnVar);
                    int i40 = zzjnVar.zza + iZzj22;
                    while (iZzj22 < i40) {
                        iZzj22 = zzjo.zzm(bArr, iZzj22, zzjnVar);
                        zzlxVar5.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    if (iZzj22 == i40) {
                        return iZzj22;
                    }
                    throw zzll.zzf();
                }
                if (i13 == 0) {
                    zzlx zzlxVar6 = (zzlx) zzliVar;
                    int iZzm3 = zzjo.zzm(bArr, i17, zzjnVar);
                    zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    while (iZzm3 < i10) {
                        int iZzj23 = zzjo.zzj(bArr, iZzm3, zzjnVar);
                        if (i11 != zzjnVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzjo.zzm(bArr, iZzj23, zzjnVar);
                        zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    return iZzm3;
                }
                return i17;
            default:
                if (i13 != 3) {
                    return i;
                }
                zzmt zzmtVarZzB = zzB(i14);
                int i41 = (i11 & (-8)) | 4;
                int iZzc = zzjo.zzc(zzmtVarZzB, bArr, i, i10, i41, zzjnVar);
                zzmt zzmtVar = zzmtVarZzB;
                zzjn zzjnVar2 = zzjnVar;
                zzliVar.add(zzjnVar2.zzc);
                while (iZzc < i10) {
                    int iZzj24 = zzjo.zzj(bArr, iZzc, zzjnVar2);
                    if (i11 != zzjnVar2.zza) {
                        return iZzc;
                    }
                    zzmt zzmtVar2 = zzmtVar;
                    zzjn zzjnVar3 = zzjnVar2;
                    iZzc = zzjo.zzc(zzmtVar2, bArr, iZzj24, i10, i41, zzjnVar3);
                    zzliVar.add(zzjnVar3.zzc);
                    zzmtVar = zzmtVar2;
                    zzjnVar2 = zzjnVar3;
                }
                return iZzc;
        }
    }

    private final int zzt(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, 0);
    }

    private final int zzu(int i, int i10) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzw(i, i10);
    }

    private final int zzv(int i) {
        return this.zzc[i + 2];
    }

    private final int zzw(int i, int i10) {
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

    private static int zzx(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzy(int i) {
        return this.zzc[i + 1];
    }

    private static long zzz(Object obj, long j4) {
        return ((Long) zznu.zzf(obj, j4)).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zza(Object obj) {
        int iZzn;
        int iZzx;
        int iZzy;
        int iZzt;
        if (!this.zzi) {
            return zzo(obj);
        }
        Unsafe unsafe = zzb;
        int iY = 0;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzy2 = zzy(i);
            int iZzx2 = zzx(iZzy2);
            int i10 = this.zzc[i];
            int i11 = iZzy2 & 1048575;
            if (iZzx2 >= zzkt.zzJ.zza() && iZzx2 <= zzkt.zzW.zza()) {
                int i12 = this.zzc[i + 2];
            }
            long j4 = i11;
            switch (iZzx2) {
                case 0:
                    if (zzP(obj, i)) {
                        iY = a.y(i10 << 3, 8, iY);
                    }
                    break;
                case 1:
                    if (zzP(obj, i)) {
                        iY = a.y(i10 << 3, 4, iY);
                    }
                    break;
                case 2:
                    if (zzP(obj, i)) {
                        iY = a.y(i10 << 3, zzki.zzy(zznu.zzd(obj, j4)), iY);
                    }
                    break;
                case 3:
                    if (zzP(obj, i)) {
                        iY = a.y(i10 << 3, zzki.zzy(zznu.zzd(obj, j4)), iY);
                    }
                    break;
                case 4:
                    if (zzP(obj, i)) {
                        iY = a.y(i10 << 3, zzki.zzu(zznu.zzc(obj, j4)), iY);
                    }
                    break;
                case 5:
                    if (zzP(obj, i)) {
                        iY = a.y(i10 << 3, 8, iY);
                    }
                    break;
                case 6:
                    if (zzP(obj, i)) {
                        iY = a.y(i10 << 3, 4, iY);
                    }
                    break;
                case 7:
                    if (zzP(obj, i)) {
                        iY = a.y(i10 << 3, 1, iY);
                    }
                    break;
                case 8:
                    if (zzP(obj, i)) {
                        Object objZzf = zznu.zzf(obj, j4);
                        if (objZzf instanceof zzka) {
                            int i13 = i10 << 3;
                            int i14 = zzki.zzb;
                            int iZzd = ((zzka) objZzf).zzd();
                            iY = a.y(i13, zzki.zzx(iZzd) + iZzd, iY);
                        } else {
                            iY = a.y(i10 << 3, zzki.zzw((String) objZzf), iY);
                        }
                    }
                    break;
                case 9:
                    if (zzP(obj, i)) {
                        iZzn = zzmv.zzn(i10, zznu.zzf(obj, j4), zzB(i));
                        iY += iZzn;
                    }
                    break;
                case 10:
                    if (zzP(obj, i)) {
                        zzka zzkaVar = (zzka) zznu.zzf(obj, j4);
                        int i15 = i10 << 3;
                        int i16 = zzki.zzb;
                        int iZzd2 = zzkaVar.zzd();
                        iY = a.y(i15, zzki.zzx(iZzd2) + iZzd2, iY);
                    }
                    break;
                case 11:
                    if (zzP(obj, i)) {
                        iY = a.y(i10 << 3, zzki.zzx(zznu.zzc(obj, j4)), iY);
                    }
                    break;
                case 12:
                    if (zzP(obj, i)) {
                        iY = a.y(i10 << 3, zzki.zzu(zznu.zzc(obj, j4)), iY);
                    }
                    break;
                case 13:
                    if (zzP(obj, i)) {
                        iY = a.y(i10 << 3, 4, iY);
                    }
                    break;
                case 14:
                    if (zzP(obj, i)) {
                        iY = a.y(i10 << 3, 8, iY);
                    }
                    break;
                case 15:
                    if (zzP(obj, i)) {
                        int iZzc = zznu.zzc(obj, j4);
                        iY = a.y((iZzc >> 31) ^ (iZzc + iZzc), zzki.zzx(i10 << 3), iY);
                    }
                    break;
                case 16:
                    if (zzP(obj, i)) {
                        long jZzd = zznu.zzd(obj, j4);
                        iZzx = zzki.zzx(i10 << 3);
                        iZzy = zzki.zzy((jZzd >> 63) ^ (jZzd + jZzd));
                        iZzt = iZzy + iZzx;
                        iY += iZzt;
                    }
                    break;
                case 17:
                    if (zzP(obj, i)) {
                        iZzt = zzki.zzt(i10, (zzmi) zznu.zzf(obj, j4), zzB(i));
                        iY += iZzt;
                    }
                    break;
                case 18:
                    iZzn = zzmv.zzg(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case 19:
                    iZzn = zzmv.zze(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case 20:
                    iZzn = zzmv.zzl(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    iZzn = zzmv.zzw(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case 22:
                    iZzn = zzmv.zzj(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case 23:
                    iZzn = zzmv.zzg(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case 24:
                    iZzn = zzmv.zze(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case 25:
                    iZzn = zzmv.zza(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case 26:
                    iZzn = zzmv.zzt(i10, (List) zznu.zzf(obj, j4));
                    iY += iZzn;
                    break;
                case 27:
                    iZzn = zzmv.zzo(i10, (List) zznu.zzf(obj, j4), zzB(i));
                    iY += iZzn;
                    break;
                case 28:
                    iZzn = zzmv.zzb(i10, (List) zznu.zzf(obj, j4));
                    iY += iZzn;
                    break;
                case 29:
                    iZzn = zzmv.zzu(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case 30:
                    iZzn = zzmv.zzc(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case 31:
                    iZzn = zzmv.zze(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    iZzn = zzmv.zzg(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case 33:
                    iZzn = zzmv.zzp(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case 34:
                    iZzn = zzmv.zzr(i10, (List) zznu.zzf(obj, j4), false);
                    iY += iZzn;
                    break;
                case 35:
                    int iZzh = zzmv.zzh((List) unsafe.getObject(obj, j4));
                    if (iZzh > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzh), iZzh, iY);
                    }
                    break;
                case 36:
                    int iZzf = zzmv.zzf((List) unsafe.getObject(obj, j4));
                    if (iZzf > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzf), iZzf, iY);
                    }
                    break;
                case 37:
                    int iZzm = zzmv.zzm((List) unsafe.getObject(obj, j4));
                    if (iZzm > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzm), iZzm, iY);
                    }
                    break;
                case 38:
                    int iZzx3 = zzmv.zzx((List) unsafe.getObject(obj, j4));
                    if (iZzx3 > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzx3), iZzx3, iY);
                    }
                    break;
                case 39:
                    int iZzk = zzmv.zzk((List) unsafe.getObject(obj, j4));
                    if (iZzk > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzk), iZzk, iY);
                    }
                    break;
                case 40:
                    int iZzh2 = zzmv.zzh((List) unsafe.getObject(obj, j4));
                    if (iZzh2 > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzh2), iZzh2, iY);
                    }
                    break;
                case 41:
                    int iZzf2 = zzmv.zzf((List) unsafe.getObject(obj, j4));
                    if (iZzf2 > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzf2), iZzf2, iY);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j4);
                    int i17 = zzmv.zza;
                    int size = list.size();
                    if (size > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(size), size, iY);
                    }
                    break;
                case 43:
                    int iZzv = zzmv.zzv((List) unsafe.getObject(obj, j4));
                    if (iZzv > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzv), iZzv, iY);
                    }
                    break;
                case 44:
                    int iZzd3 = zzmv.zzd((List) unsafe.getObject(obj, j4));
                    if (iZzd3 > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzd3), iZzd3, iY);
                    }
                    break;
                case 45:
                    int iZzf3 = zzmv.zzf((List) unsafe.getObject(obj, j4));
                    if (iZzf3 > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzf3), iZzf3, iY);
                    }
                    break;
                case 46:
                    int iZzh3 = zzmv.zzh((List) unsafe.getObject(obj, j4));
                    if (iZzh3 > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzh3), iZzh3, iY);
                    }
                    break;
                case 47:
                    int iZzq = zzmv.zzq((List) unsafe.getObject(obj, j4));
                    if (iZzq > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzq), iZzq, iY);
                    }
                    break;
                case 48:
                    int iZzs = zzmv.zzs((List) unsafe.getObject(obj, j4));
                    if (iZzs > 0) {
                        iY = a.w(i10 << 3, zzki.zzx(iZzs), iZzs, iY);
                    }
                    break;
                case 49:
                    iZzn = zzmv.zzi(i10, (List) zznu.zzf(obj, j4), zzB(i));
                    iY += iZzn;
                    break;
                case 50:
                    zzmd.zza(i10, zznu.zzf(obj, j4), zzC(i));
                    break;
                case 51:
                    if (zzT(obj, i10, i)) {
                        iY = a.y(i10 << 3, 8, iY);
                    }
                    break;
                case 52:
                    if (zzT(obj, i10, i)) {
                        iY = a.y(i10 << 3, 4, iY);
                    }
                    break;
                case 53:
                    if (zzT(obj, i10, i)) {
                        iY = a.y(i10 << 3, zzki.zzy(zzz(obj, j4)), iY);
                    }
                    break;
                case 54:
                    if (zzT(obj, i10, i)) {
                        iY = a.y(i10 << 3, zzki.zzy(zzz(obj, j4)), iY);
                    }
                    break;
                case 55:
                    if (zzT(obj, i10, i)) {
                        iY = a.y(i10 << 3, zzki.zzu(zzp(obj, j4)), iY);
                    }
                    break;
                case 56:
                    if (zzT(obj, i10, i)) {
                        iY = a.y(i10 << 3, 8, iY);
                    }
                    break;
                case 57:
                    if (zzT(obj, i10, i)) {
                        iY = a.y(i10 << 3, 4, iY);
                    }
                    break;
                case 58:
                    if (zzT(obj, i10, i)) {
                        iY = a.y(i10 << 3, 1, iY);
                    }
                    break;
                case 59:
                    if (zzT(obj, i10, i)) {
                        Object objZzf2 = zznu.zzf(obj, j4);
                        if (objZzf2 instanceof zzka) {
                            int i18 = i10 << 3;
                            int i19 = zzki.zzb;
                            int iZzd4 = ((zzka) objZzf2).zzd();
                            iY = a.y(i18, zzki.zzx(iZzd4) + iZzd4, iY);
                        } else {
                            iY = a.y(i10 << 3, zzki.zzw((String) objZzf2), iY);
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i10, i)) {
                        iZzn = zzmv.zzn(i10, zznu.zzf(obj, j4), zzB(i));
                        iY += iZzn;
                    }
                    break;
                case 61:
                    if (zzT(obj, i10, i)) {
                        zzka zzkaVar2 = (zzka) zznu.zzf(obj, j4);
                        int i20 = i10 << 3;
                        int i21 = zzki.zzb;
                        int iZzd5 = zzkaVar2.zzd();
                        iY = a.y(i20, zzki.zzx(iZzd5) + iZzd5, iY);
                    }
                    break;
                case 62:
                    if (zzT(obj, i10, i)) {
                        iY = a.y(i10 << 3, zzki.zzx(zzp(obj, j4)), iY);
                    }
                    break;
                case 63:
                    if (zzT(obj, i10, i)) {
                        iY = a.y(i10 << 3, zzki.zzu(zzp(obj, j4)), iY);
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzT(obj, i10, i)) {
                        iY = a.y(i10 << 3, 4, iY);
                    }
                    break;
                case 65:
                    if (zzT(obj, i10, i)) {
                        iY = a.y(i10 << 3, 8, iY);
                    }
                    break;
                case 66:
                    if (zzT(obj, i10, i)) {
                        int iZzp = zzp(obj, j4);
                        iY = a.y((iZzp >> 31) ^ (iZzp + iZzp), zzki.zzx(i10 << 3), iY);
                    }
                    break;
                case 67:
                    if (zzT(obj, i10, i)) {
                        long jZzz = zzz(obj, j4);
                        iZzx = zzki.zzx(i10 << 3);
                        iZzy = zzki.zzy((jZzz >> 63) ^ (jZzz + jZzz));
                        iZzt = iZzy + iZzx;
                        iY += iZzt;
                    }
                    break;
                case 68:
                    if (zzT(obj, i10, i)) {
                        iZzt = zzki.zzt(i10, (zzmi) zznu.zzf(obj, j4), zzB(i));
                        iY += iZzt;
                    }
                    break;
            }
        }
        zznk zznkVar = this.zzn;
        return iY + zznkVar.zza(zznkVar.zzd(obj));
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int iZzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iZzy = zzy(i12);
            int i13 = this.zzc[i12];
            long j4 = 1048575 & iZzy;
            int iHashCode = 37;
            switch (zzx(iZzy)) {
                case 0:
                    i = i11 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zznu.zza(obj, j4));
                    byte[] bArr = zzlj.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i + iZzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zznu.zzb(obj, j4));
                    i11 = iFloatToIntBits + i10;
                    break;
                case 2:
                    i = i11 * 53;
                    jDoubleToLongBits = zznu.zzd(obj, j4);
                    byte[] bArr2 = zzlj.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i + iZzc;
                    break;
                case 3:
                    i = i11 * 53;
                    jDoubleToLongBits = zznu.zzd(obj, j4);
                    byte[] bArr3 = zzlj.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i + iZzc;
                    break;
                case 4:
                    i = i11 * 53;
                    iZzc = zznu.zzc(obj, j4);
                    i11 = i + iZzc;
                    break;
                case 5:
                    i = i11 * 53;
                    jDoubleToLongBits = zznu.zzd(obj, j4);
                    byte[] bArr4 = zzlj.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i + iZzc;
                    break;
                case 6:
                    i = i11 * 53;
                    iZzc = zznu.zzc(obj, j4);
                    i11 = i + iZzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzlj.zza(zznu.zzw(obj, j4));
                    i11 = iFloatToIntBits + i10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iFloatToIntBits = ((String) zznu.zzf(obj, j4)).hashCode();
                    i11 = iFloatToIntBits + i10;
                    break;
                case 9:
                    Object objZzf = zznu.zzf(obj, j4);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iFloatToIntBits = zznu.zzf(obj, j4).hashCode();
                    i11 = iFloatToIntBits + i10;
                    break;
                case 11:
                    i = i11 * 53;
                    iZzc = zznu.zzc(obj, j4);
                    i11 = i + iZzc;
                    break;
                case 12:
                    i = i11 * 53;
                    iZzc = zznu.zzc(obj, j4);
                    i11 = i + iZzc;
                    break;
                case 13:
                    i = i11 * 53;
                    iZzc = zznu.zzc(obj, j4);
                    i11 = i + iZzc;
                    break;
                case 14:
                    i = i11 * 53;
                    jDoubleToLongBits = zznu.zzd(obj, j4);
                    byte[] bArr5 = zzlj.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i + iZzc;
                    break;
                case 15:
                    i = i11 * 53;
                    iZzc = zznu.zzc(obj, j4);
                    i11 = i + iZzc;
                    break;
                case 16:
                    i = i11 * 53;
                    jDoubleToLongBits = zznu.zzd(obj, j4);
                    byte[] bArr6 = zzlj.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zznu.zzf(obj, j4);
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
                    i10 = i11 * 53;
                    iFloatToIntBits = zznu.zzf(obj, j4).hashCode();
                    i11 = iFloatToIntBits + i10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iFloatToIntBits = zznu.zzf(obj, j4).hashCode();
                    i11 = iFloatToIntBits + i10;
                    break;
                case 51:
                    if (zzT(obj, i13, i12)) {
                        i = i11 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j4));
                        byte[] bArr7 = zzlj.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i + iZzc;
                    }
                    break;
                case 52:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j4));
                        i11 = iFloatToIntBits + i10;
                    }
                    break;
                case 53:
                    if (zzT(obj, i13, i12)) {
                        i = i11 * 53;
                        jDoubleToLongBits = zzz(obj, j4);
                        byte[] bArr8 = zzlj.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i + iZzc;
                    }
                    break;
                case 54:
                    if (zzT(obj, i13, i12)) {
                        i = i11 * 53;
                        jDoubleToLongBits = zzz(obj, j4);
                        byte[] bArr9 = zzlj.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i + iZzc;
                    }
                    break;
                case 55:
                    if (zzT(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzp(obj, j4);
                        i11 = i + iZzc;
                    }
                    break;
                case 56:
                    if (zzT(obj, i13, i12)) {
                        i = i11 * 53;
                        jDoubleToLongBits = zzz(obj, j4);
                        byte[] bArr10 = zzlj.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i + iZzc;
                    }
                    break;
                case 57:
                    if (zzT(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzp(obj, j4);
                        i11 = i + iZzc;
                    }
                    break;
                case 58:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzlj.zza(zzU(obj, j4));
                        i11 = iFloatToIntBits + i10;
                    }
                    break;
                case 59:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = ((String) zznu.zzf(obj, j4)).hashCode();
                        i11 = iFloatToIntBits + i10;
                    }
                    break;
                case 60:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zznu.zzf(obj, j4).hashCode();
                        i11 = iFloatToIntBits + i10;
                    }
                    break;
                case 61:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zznu.zzf(obj, j4).hashCode();
                        i11 = iFloatToIntBits + i10;
                    }
                    break;
                case 62:
                    if (zzT(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzp(obj, j4);
                        i11 = i + iZzc;
                    }
                    break;
                case 63:
                    if (zzT(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzp(obj, j4);
                        i11 = i + iZzc;
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzT(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzp(obj, j4);
                        i11 = i + iZzc;
                    }
                    break;
                case 65:
                    if (zzT(obj, i13, i12)) {
                        i = i11 * 53;
                        jDoubleToLongBits = zzz(obj, j4);
                        byte[] bArr11 = zzlj.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i + iZzc;
                    }
                    break;
                case 66:
                    if (zzT(obj, i13, i12)) {
                        i = i11 * 53;
                        iZzc = zzp(obj, j4);
                        i11 = i + iZzc;
                    }
                    break;
                case 67:
                    if (zzT(obj, i13, i12)) {
                        i = i11 * 53;
                        jDoubleToLongBits = zzz(obj, j4);
                        byte[] bArr12 = zzlj.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zznu.zzf(obj, j4).hashCode();
                        i11 = iFloatToIntBits + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzn.zzd(obj).hashCode() + (i11 * 53);
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12561. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzjn r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzjn):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzf(Object obj) {
        if (zzS(obj)) {
            if (obj instanceof zzlb) {
                zzlb zzlbVar = (zzlb) obj;
                zzlbVar.zzbP(f.API_PRIORITY_OTHER);
                zzlbVar.zzb = 0;
                zzlbVar.zzbN();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int iZzy = zzy(i);
                int i10 = 1048575 & iZzy;
                int iZzx = zzx(iZzy);
                long j4 = i10;
                if (iZzx != 9) {
                    if (iZzx != 60 && iZzx != 68) {
                        switch (iZzx) {
                            case 17:
                                if (zzP(obj, i)) {
                                    zzB(i).zzf(zzb.getObject(obj, j4));
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
                                this.zzm.zza(obj, j4);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    ((zzmc) object).zzc();
                                    unsafe.putObject(obj, j4, object);
                                }
                                break;
                        }
                    } else if (zzT(obj, this.zzc[i], i)) {
                        zzB(i).zzf(zzb.getObject(obj, j4));
                    }
                } else if (zzP(obj, i)) {
                    zzB(i).zzf(zzb.getObject(obj, j4));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzy = zzy(i);
            int i10 = this.zzc[i];
            long j4 = 1048575 & iZzy;
            switch (zzx(iZzy)) {
                case 0:
                    if (zzP(obj2, i)) {
                        zznu.zzo(obj, j4, zznu.zza(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 1:
                    if (zzP(obj2, i)) {
                        zznu.zzp(obj, j4, zznu.zzb(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 2:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j4, zznu.zzd(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 3:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j4, zznu.zzd(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 4:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j4, zznu.zzc(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 5:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j4, zznu.zzd(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 6:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j4, zznu.zzc(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 7:
                    if (zzP(obj2, i)) {
                        zznu.zzm(obj, j4, zznu.zzw(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 8:
                    if (zzP(obj2, i)) {
                        zznu.zzs(obj, j4, zznu.zzf(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzP(obj2, i)) {
                        zznu.zzs(obj, j4, zznu.zzf(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 11:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j4, zznu.zzc(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 12:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j4, zznu.zzc(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 13:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j4, zznu.zzc(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 14:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j4, zznu.zzd(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 15:
                    if (zzP(obj2, i)) {
                        zznu.zzq(obj, j4, zznu.zzc(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 16:
                    if (zzP(obj2, i)) {
                        zznu.zzr(obj, j4, zznu.zzd(obj2, j4));
                        zzJ(obj, i);
                    }
                    break;
                case 17:
                    zzH(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j4);
                    break;
                case 50:
                    int i11 = zzmv.zza;
                    zznu.zzs(obj, j4, zzmd.zzb(zznu.zzf(obj, j4), zznu.zzf(obj2, j4)));
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
                    if (zzT(obj2, i10, i)) {
                        zznu.zzs(obj, j4, zznu.zzf(obj2, j4));
                        zzK(obj, i10, i);
                    }
                    break;
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i10, i)) {
                        zznu.zzs(obj, j4, zznu.zzf(obj2, j4));
                        zzK(obj, i10, i);
                    }
                    break;
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzmv.zzB(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0089. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzh(Object obj, byte[] bArr, int i, int i10, zzjn zzjnVar) throws IOException {
        Unsafe unsafe;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj2;
        Unsafe unsafe2;
        int i15;
        Unsafe unsafe3;
        int i16;
        Object obj3;
        int i17;
        Unsafe unsafe4;
        int i18;
        int i19;
        int i20;
        int i21;
        this = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        i10 = i10;
        zzjnVar = zzjnVar;
        if (!this.zzi) {
            zzc(obj4, bArr, i, i10, 0, zzjnVar);
            return;
        }
        zzG(obj4);
        Unsafe unsafe5 = zzb;
        int i22 = -1;
        int iZzm = i;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1048575;
        while (iZzm < i10) {
            int iZzk = iZzm + 1;
            int i27 = bArr2[iZzm];
            if (i27 < 0) {
                iZzk = zzjo.zzk(i27, bArr2, iZzk, zzjnVar);
                i27 = zzjnVar.zza;
            }
            i23 = i27 >>> 3;
            int iZzu = i23 > i23 ? this.zzu(i23, i24 / 3) : this.zzt(i23);
            if (iZzu == i22) {
                obj = obj4;
                unsafe = unsafe5;
                i11 = i27;
                i12 = iZzk;
                i23 = i23;
                i13 = 0;
            } else {
                int i28 = i27 & 7;
                int[] iArr = this.zzc;
                int i29 = iArr[iZzu + 1];
                int iZzx = zzx(i29);
                int i30 = i27;
                int i31 = iZzu;
                long j4 = i29 & 1048575;
                if (iZzx <= 17) {
                    int i32 = iArr[i31 + 2];
                    int i33 = 1 << (i32 >>> 20);
                    int i34 = i32 & 1048575;
                    int i35 = iZzk;
                    if (i34 != i26) {
                        if (i26 != 1048575) {
                            unsafe5.putInt(obj4, i26, i25);
                        }
                        if (i34 != 1048575) {
                            i25 = unsafe5.getInt(obj4, i34);
                        }
                        i26 = i34;
                    }
                    switch (iZzx) {
                        case 0:
                            i23 = i23;
                            i14 = i35;
                            obj2 = obj4;
                            unsafe2 = unsafe5;
                            i15 = i31;
                            if (i28 != 1) {
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                zznu.zzo(obj2, j4, Double.longBitsToDouble(zzjo.zzp(bArr2, i14)));
                                iZzm = i14 + 8;
                                i25 |= i33;
                                i10 = i10;
                                zzjnVar = zzjnVar;
                                unsafe5 = unsafe2;
                                i24 = i15;
                                obj4 = obj2;
                                i23 = i23;
                                i22 = -1;
                            }
                            break;
                        case 1:
                            i23 = i23;
                            i14 = i35;
                            obj2 = obj4;
                            unsafe2 = unsafe5;
                            i15 = i31;
                            if (i28 != 5) {
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                zznu.zzp(obj2, j4, Float.intBitsToFloat(zzjo.zzb(bArr2, i14)));
                                iZzm = i14 + 4;
                                i25 |= i33;
                                i10 = i10;
                                zzjnVar = zzjnVar;
                                unsafe5 = unsafe2;
                                i24 = i15;
                                obj4 = obj2;
                                i23 = i23;
                                i22 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            Unsafe unsafe6 = unsafe5;
                            i14 = i35;
                            i15 = i31;
                            if (i28 != 0) {
                                obj2 = obj4;
                                unsafe2 = unsafe6;
                                i23 = i23;
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                int iZzm2 = zzjo.zzm(bArr2, i14, zzjnVar);
                                Object obj5 = obj4;
                                unsafe6.putLong(obj5, j4, zzjnVar.zzb);
                                i25 |= i33;
                                i10 = i10;
                                unsafe5 = unsafe6;
                                i24 = i15;
                                i23 = i23;
                                iZzm = iZzm2;
                                obj4 = obj5;
                                i22 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            unsafe3 = unsafe5;
                            i14 = i35;
                            i15 = i31;
                            if (i28 != 0) {
                                Unsafe unsafe7 = unsafe3;
                                obj2 = obj4;
                                unsafe2 = unsafe7;
                                i23 = i23;
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                int iZzj = zzjo.zzj(bArr2, i14, zzjnVar);
                                unsafe3.putInt(obj4, j4, zzjnVar.zza);
                                i25 |= i33;
                                iZzm = iZzj;
                                i24 = i15;
                                unsafe5 = unsafe3;
                                i22 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i15 = i31;
                            Object obj6 = obj4;
                            unsafe3 = unsafe5;
                            if (i28 != 1) {
                                obj4 = obj6;
                                i14 = i35;
                                Unsafe unsafe8 = unsafe3;
                                obj2 = obj4;
                                unsafe2 = unsafe8;
                                i23 = i23;
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                unsafe3.putLong(obj6, j4, zzjo.zzp(bArr2, i35));
                                obj4 = obj6;
                                iZzm = i35 + 8;
                                i25 |= i33;
                                i24 = i15;
                                unsafe5 = unsafe3;
                                i22 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i16 = i35;
                            i15 = i31;
                            obj3 = obj4;
                            unsafe3 = unsafe5;
                            if (i28 != 5) {
                                i23 = i23;
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i14 = i16;
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                unsafe3.putInt(obj3, j4, zzjo.zzb(bArr2, i16));
                                iZzm = i16 + 4;
                                i25 |= i33;
                                i24 = i15;
                                obj4 = obj3;
                                unsafe5 = unsafe3;
                                i22 = -1;
                            }
                            break;
                        case 7:
                            i16 = i35;
                            i15 = i31;
                            obj3 = obj4;
                            unsafe3 = unsafe5;
                            if (i28 != 0) {
                                i23 = i23;
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i14 = i16;
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                iZzm = zzjo.zzm(bArr2, i16, zzjnVar);
                                zznu.zzm(obj3, j4, zzjnVar.zzb != 0);
                                i25 |= i33;
                                i24 = i15;
                                obj4 = obj3;
                                unsafe5 = unsafe3;
                                i22 = -1;
                            }
                            break;
                        case 8:
                            i16 = i35;
                            i15 = i31;
                            obj3 = obj4;
                            unsafe3 = unsafe5;
                            if (i28 != 2) {
                                i23 = i23;
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i14 = i16;
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                iZzm = (i29 & 536870912) == 0 ? zzjo.zzg(bArr2, i16, zzjnVar) : zzjo.zzh(bArr2, i16, zzjnVar);
                                unsafe3.putObject(obj3, j4, zzjnVar.zzc);
                                i25 |= i33;
                                i24 = i15;
                                obj4 = obj3;
                                unsafe5 = unsafe3;
                                i22 = -1;
                            }
                            break;
                        case 9:
                            obj3 = obj4;
                            unsafe3 = unsafe5;
                            i17 = i35;
                            i15 = i31;
                            if (i28 != 2) {
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i14 = i17;
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                Object objZzD = this.zzD(obj3, i15);
                                int iZzo = zzjo.zzo(objZzD, this.zzB(i15), bArr2, i17, i10, zzjnVar);
                                this.zzL(obj3, i15, objZzD);
                                i25 |= i33;
                                iZzm = iZzo;
                                i24 = i15;
                                obj4 = obj3;
                                unsafe5 = unsafe3;
                                i22 = -1;
                            }
                            break;
                        case 10:
                            i17 = i35;
                            obj3 = obj4;
                            unsafe4 = unsafe5;
                            if (i28 != 2) {
                                unsafe2 = unsafe4;
                                i15 = i31;
                                obj2 = obj3;
                                i14 = i17;
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                iZzm = zzjo.zza(bArr2, i17, zzjnVar);
                                unsafe4.putObject(obj3, j4, zzjnVar.zzc);
                                i25 |= i33;
                                i23 = i23;
                                obj4 = obj3;
                                unsafe5 = unsafe4;
                                i24 = i31;
                                i22 = -1;
                            }
                            break;
                        case 12:
                            i17 = i35;
                            obj3 = obj4;
                            unsafe4 = unsafe5;
                            if (i28 != 0) {
                                unsafe2 = unsafe4;
                                i15 = i31;
                                obj2 = obj3;
                                i14 = i17;
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                iZzm = zzjo.zzj(bArr2, i17, zzjnVar);
                                unsafe4.putInt(obj3, j4, zzjnVar.zza);
                                i25 |= i33;
                                i23 = i23;
                                obj4 = obj3;
                                unsafe5 = unsafe4;
                                i24 = i31;
                                i22 = -1;
                            }
                            break;
                        case 15:
                            i17 = i35;
                            obj3 = obj4;
                            unsafe4 = unsafe5;
                            if (i28 != 0) {
                                unsafe2 = unsafe4;
                                i15 = i31;
                                obj2 = obj3;
                                i14 = i17;
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                iZzm = zzjo.zzj(bArr2, i17, zzjnVar);
                                unsafe4.putInt(obj3, j4, zzke.zzb(zzjnVar.zza));
                                i25 |= i33;
                                i23 = i23;
                                obj4 = obj3;
                                unsafe5 = unsafe4;
                                i24 = i31;
                                i22 = -1;
                            }
                            break;
                        case 16:
                            if (i28 != 0) {
                                obj2 = obj4;
                                unsafe2 = unsafe5;
                                i14 = i35;
                                i15 = i31;
                                i23 = i23;
                                i11 = i30 == true ? 1 : 0;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = i14;
                                obj = obj2;
                            } else {
                                int iZzm3 = zzjo.zzm(bArr2, i35, zzjnVar);
                                Unsafe unsafe9 = unsafe5;
                                Object obj7 = obj4;
                                unsafe9.putLong(obj7, j4, zzke.zzc(zzjnVar.zzb));
                                unsafe4 = unsafe9;
                                obj3 = obj7;
                                i25 |= i33;
                                iZzm = iZzm3;
                                i23 = i23;
                                obj4 = obj3;
                                unsafe5 = unsafe4;
                                i24 = i31;
                                i22 = -1;
                            }
                            break;
                        default:
                            obj2 = obj4;
                            unsafe2 = unsafe5;
                            i14 = i35;
                            i15 = i31;
                            i23 = i23;
                            i11 = i30 == true ? 1 : 0;
                            unsafe = unsafe2;
                            i13 = i15;
                            i12 = i14;
                            obj = obj2;
                            break;
                    }
                } else {
                    i23 = i23;
                    Object obj8 = obj4;
                    Unsafe unsafe10 = unsafe5;
                    int i36 = iZzk;
                    if (iZzx != 27) {
                        i21 = i36;
                        if (iZzx <= 49) {
                            i13 = i31;
                            long j10 = i29;
                            i20 = i25;
                            unsafe = unsafe10;
                            i19 = i26;
                            int iZzs = this.zzs(obj8, bArr, i21, i10, i30 == true ? 1 : 0, i23, i28, i13, j10, iZzx, j4, zzjnVar);
                            i18 = i30 == true ? 1 : 0;
                            if (iZzs != i21) {
                                obj4 = obj;
                                iZzm = iZzs;
                                i26 = i19;
                                i23 = i23;
                                i24 = i13;
                                i25 = i20;
                                unsafe5 = unsafe;
                                i22 = -1;
                                bArr2 = bArr;
                            } else {
                                i12 = iZzs;
                                i11 = i18;
                                i26 = i19;
                                i25 = i20;
                            }
                        } else {
                            i19 = i26;
                            i20 = i25;
                            unsafe = unsafe10;
                            i18 = i30 == true ? 1 : 0;
                            if (iZzx == 50) {
                                i13 = i31;
                                if (i28 == 2) {
                                    int iZzq = zzq(obj, bArr, i21, i10, i13, j4, zzjnVar);
                                    if (iZzq != i21) {
                                        this = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i10 = i10;
                                        zzjnVar = zzjnVar;
                                        iZzm = iZzq;
                                        i26 = i19;
                                        i23 = i23;
                                        i24 = i13;
                                        i25 = i20;
                                        unsafe5 = unsafe;
                                        i22 = -1;
                                    } else {
                                        i12 = iZzq;
                                    }
                                }
                                i11 = i18;
                            } else {
                                i13 = i31;
                                i11 = i18 == true ? 1 : 0;
                                int iZzr = zzr(obj, bArr, i21, i10, i11 == true ? 1 : 0, i23, i28, i29, iZzx, j4, i13, zzjnVar);
                                obj = obj;
                                if (iZzr != i21) {
                                    iZzm = iZzr;
                                    obj4 = obj;
                                    i26 = i19;
                                    i23 = i23;
                                    i24 = i13;
                                    i25 = i20;
                                    unsafe5 = unsafe;
                                    i22 = -1;
                                    bArr2 = bArr;
                                } else {
                                    i12 = iZzr;
                                }
                            }
                            i26 = i19;
                            i25 = i20;
                        }
                    } else if (i28 == 2) {
                        zzli zzliVarZzd = (zzli) unsafe10.getObject(obj8, j4);
                        if (!zzliVarZzd.zzc()) {
                            int size = zzliVarZzd.size();
                            zzliVarZzd = zzliVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe10.putObject(obj8, j4, zzliVarZzd);
                        }
                        zzmt zzmtVarZzB = this.zzB(i31);
                        i31 = i31;
                        byte[] bArr3 = bArr2;
                        bArr2 = bArr;
                        i10 = i10;
                        zzjnVar = zzjnVar;
                        iZzm = zzjo.zze(zzmtVarZzB, i30 == true ? 1 : 0, bArr3, i36, i10, zzliVarZzd, zzjnVar);
                        unsafe5 = unsafe10;
                        obj4 = obj8;
                        i23 = i23;
                        i24 = i31;
                        i22 = -1;
                    } else {
                        i18 = i30 == true ? 1 : 0;
                        unsafe = unsafe10;
                        i13 = i31;
                        i19 = i26;
                        i20 = i25;
                        i21 = i36;
                    }
                    i12 = i21;
                    i11 = i18;
                    i26 = i19;
                    i25 = i20;
                }
            }
            int iZzi = zzjo.zzi(i11 == true ? 1 : 0, bArr, i12, i10, zzd(obj), zzjnVar);
            bArr2 = bArr;
            zzjnVar = zzjnVar;
            i10 = i10;
            obj4 = obj;
            i23 = i23;
            i24 = i13;
            unsafe5 = unsafe;
            i22 = -1;
            iZzm = iZzi;
            this = this;
        }
        Object obj9 = obj4;
        Unsafe unsafe11 = unsafe5;
        int i37 = i10;
        int i38 = i26;
        int i39 = i25;
        if (i38 != 1048575) {
            unsafe11.putInt(obj9, i38, i39);
        }
        if (iZzm != i37) {
            throw zzll.zze();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) throws IOException {
        int i;
        int i10;
        int i11 = 0;
        int i12 = 1048575;
        if (this.zzi) {
            if (this.zzh) {
                this.zzo.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i13 = 0; i13 < length; i13 += 3) {
                int iZzy = zzy(i13);
                int i14 = this.zzc[i13];
                switch (zzx(iZzy)) {
                    case 0:
                        if (zzP(obj, i13)) {
                            zzocVar.zzf(i14, zznu.zza(obj, iZzy & 1048575));
                        }
                        break;
                    case 1:
                        if (zzP(obj, i13)) {
                            zzocVar.zzo(i14, zznu.zzb(obj, iZzy & 1048575));
                        }
                        break;
                    case 2:
                        if (zzP(obj, i13)) {
                            zzocVar.zzt(i14, zznu.zzd(obj, iZzy & 1048575));
                        }
                        break;
                    case 3:
                        if (zzP(obj, i13)) {
                            zzocVar.zzJ(i14, zznu.zzd(obj, iZzy & 1048575));
                        }
                        break;
                    case 4:
                        if (zzP(obj, i13)) {
                            zzocVar.zzr(i14, zznu.zzc(obj, iZzy & 1048575));
                        }
                        break;
                    case 5:
                        if (zzP(obj, i13)) {
                            zzocVar.zzm(i14, zznu.zzd(obj, iZzy & 1048575));
                        }
                        break;
                    case 6:
                        if (zzP(obj, i13)) {
                            zzocVar.zzk(i14, zznu.zzc(obj, iZzy & 1048575));
                        }
                        break;
                    case 7:
                        if (zzP(obj, i13)) {
                            zzocVar.zzb(i14, zznu.zzw(obj, iZzy & 1048575));
                        }
                        break;
                    case 8:
                        if (zzP(obj, i13)) {
                            zzV(i14, zznu.zzf(obj, iZzy & 1048575), zzocVar);
                        }
                        break;
                    case 9:
                        if (zzP(obj, i13)) {
                            zzocVar.zzv(i14, zznu.zzf(obj, iZzy & 1048575), zzB(i13));
                        }
                        break;
                    case 10:
                        if (zzP(obj, i13)) {
                            zzocVar.zzd(i14, (zzka) zznu.zzf(obj, iZzy & 1048575));
                        }
                        break;
                    case 11:
                        if (zzP(obj, i13)) {
                            zzocVar.zzH(i14, zznu.zzc(obj, iZzy & 1048575));
                        }
                        break;
                    case 12:
                        if (zzP(obj, i13)) {
                            zzocVar.zzi(i14, zznu.zzc(obj, iZzy & 1048575));
                        }
                        break;
                    case 13:
                        if (zzP(obj, i13)) {
                            zzocVar.zzw(i14, zznu.zzc(obj, iZzy & 1048575));
                        }
                        break;
                    case 14:
                        if (zzP(obj, i13)) {
                            zzocVar.zzy(i14, zznu.zzd(obj, iZzy & 1048575));
                        }
                        break;
                    case 15:
                        if (zzP(obj, i13)) {
                            zzocVar.zzA(i14, zznu.zzc(obj, iZzy & 1048575));
                        }
                        break;
                    case 16:
                        if (zzP(obj, i13)) {
                            zzocVar.zzC(i14, zznu.zzd(obj, iZzy & 1048575));
                        }
                        break;
                    case 17:
                        if (zzP(obj, i13)) {
                            zzocVar.zzq(i14, zznu.zzf(obj, iZzy & 1048575), zzB(i13));
                        }
                        break;
                    case 18:
                        zzmv.zzF(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 19:
                        zzmv.zzJ(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 20:
                        zzmv.zzM(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case zzbbs.zzt.zzm /* 21 */:
                        zzmv.zzU(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 22:
                        zzmv.zzL(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 23:
                        zzmv.zzI(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 24:
                        zzmv.zzH(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 25:
                        zzmv.zzD(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 26:
                        zzmv.zzS(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar);
                        break;
                    case 27:
                        zzmv.zzN(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, zzB(i13));
                        break;
                    case 28:
                        zzmv.zzE(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar);
                        break;
                    case 29:
                        zzmv.zzT(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 30:
                        zzmv.zzG(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 31:
                        zzmv.zzO(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                        zzmv.zzP(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 33:
                        zzmv.zzQ(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 34:
                        zzmv.zzR(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, false);
                        break;
                    case 35:
                        zzmv.zzF(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 36:
                        zzmv.zzJ(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 37:
                        zzmv.zzM(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 38:
                        zzmv.zzU(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 39:
                        zzmv.zzL(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 40:
                        zzmv.zzI(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 41:
                        zzmv.zzH(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 42:
                        zzmv.zzD(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 43:
                        zzmv.zzT(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 44:
                        zzmv.zzG(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 45:
                        zzmv.zzO(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 46:
                        zzmv.zzP(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 47:
                        zzmv.zzQ(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 48:
                        zzmv.zzR(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, true);
                        break;
                    case 49:
                        zzmv.zzK(i14, (List) zznu.zzf(obj, iZzy & 1048575), zzocVar, zzB(i13));
                        break;
                    case 50:
                        zzN(zzocVar, i14, zznu.zzf(obj, iZzy & 1048575), i13);
                        break;
                    case 51:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzf(i14, zzm(obj, iZzy & 1048575));
                        }
                        break;
                    case 52:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzo(i14, zzn(obj, iZzy & 1048575));
                        }
                        break;
                    case 53:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzt(i14, zzz(obj, iZzy & 1048575));
                        }
                        break;
                    case 54:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzJ(i14, zzz(obj, iZzy & 1048575));
                        }
                        break;
                    case 55:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzr(i14, zzp(obj, iZzy & 1048575));
                        }
                        break;
                    case 56:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzm(i14, zzz(obj, iZzy & 1048575));
                        }
                        break;
                    case 57:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzk(i14, zzp(obj, iZzy & 1048575));
                        }
                        break;
                    case 58:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzb(i14, zzU(obj, iZzy & 1048575));
                        }
                        break;
                    case 59:
                        if (zzT(obj, i14, i13)) {
                            zzV(i14, zznu.zzf(obj, iZzy & 1048575), zzocVar);
                        }
                        break;
                    case 60:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzv(i14, zznu.zzf(obj, iZzy & 1048575), zzB(i13));
                        }
                        break;
                    case 61:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzd(i14, (zzka) zznu.zzf(obj, iZzy & 1048575));
                        }
                        break;
                    case 62:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzH(i14, zzp(obj, iZzy & 1048575));
                        }
                        break;
                    case 63:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzi(i14, zzp(obj, iZzy & 1048575));
                        }
                        break;
                    case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzw(i14, zzp(obj, iZzy & 1048575));
                        }
                        break;
                    case 65:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzy(i14, zzz(obj, iZzy & 1048575));
                        }
                        break;
                    case 66:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzA(i14, zzp(obj, iZzy & 1048575));
                        }
                        break;
                    case 67:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzC(i14, zzz(obj, iZzy & 1048575));
                        }
                        break;
                    case 68:
                        if (zzT(obj, i14, i13)) {
                            zzocVar.zzq(i14, zznu.zzf(obj, iZzy & 1048575), zzB(i13));
                        }
                        break;
                }
            }
            zznk zznkVar = this.zzn;
            zznkVar.zzi(zznkVar.zzd(obj), zzocVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length2 = this.zzc.length;
        Unsafe unsafe = zzb;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i15 < length2) {
            int iZzy2 = zzy(i15);
            int[] iArr = this.zzc;
            int i18 = iArr[i15];
            int iZzx = zzx(iZzy2);
            if (iZzx <= 17) {
                int i19 = iArr[i15 + 2];
                int i20 = i19 & i12;
                if (i20 != i17) {
                    i16 = unsafe.getInt(obj, i20);
                    i17 = i20;
                }
                i = 1 << (i19 >>> 20);
            } else {
                i = i11;
            }
            long j4 = iZzy2 & i12;
            switch (iZzx) {
                case 0:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzf(i18, zznu.zza(obj, j4));
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 1:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzo(i18, zznu.zzb(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 2:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzt(i18, unsafe.getLong(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 3:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzJ(i18, unsafe.getLong(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 4:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzr(i18, unsafe.getInt(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 5:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzm(i18, unsafe.getLong(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 6:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzk(i18, unsafe.getInt(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 7:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzb(i18, zznu.zzw(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 8:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzV(i18, unsafe.getObject(obj, j4), zzocVar);
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 9:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzv(i18, unsafe.getObject(obj, j4), zzB(i15));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 10:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzd(i18, (zzka) unsafe.getObject(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 11:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzH(i18, unsafe.getInt(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 12:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzi(i18, unsafe.getInt(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 13:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzw(i18, unsafe.getInt(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 14:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzy(i18, unsafe.getLong(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 15:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzA(i18, unsafe.getInt(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 16:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzC(i18, unsafe.getLong(obj, j4));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 17:
                    i10 = 0;
                    if ((i16 & i) != 0) {
                        zzocVar.zzq(i18, unsafe.getObject(obj, j4), zzB(i15));
                    } else {
                        continue;
                    }
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 18:
                    i10 = 0;
                    zzmv.zzF(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 19:
                    i10 = 0;
                    zzmv.zzJ(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 20:
                    i10 = 0;
                    zzmv.zzM(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    i10 = 0;
                    zzmv.zzU(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 22:
                    i10 = 0;
                    zzmv.zzL(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 23:
                    i10 = 0;
                    zzmv.zzI(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 24:
                    i10 = 0;
                    zzmv.zzH(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 25:
                    i10 = 0;
                    zzmv.zzD(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 26:
                    zzmv.zzS(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar);
                    break;
                case 27:
                    zzmv.zzN(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, zzB(i15));
                    break;
                case 28:
                    zzmv.zzE(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar);
                    break;
                case 29:
                    zzmv.zzT(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    break;
                case 30:
                    i10 = 0;
                    zzmv.zzG(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 31:
                    i10 = 0;
                    zzmv.zzO(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    i10 = 0;
                    zzmv.zzP(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 33:
                    i10 = 0;
                    zzmv.zzQ(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 34:
                    i10 = 0;
                    zzmv.zzR(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, false);
                    continue;
                    i15 += 3;
                    i11 = i10;
                    i12 = 1048575;
                    break;
                case 35:
                    zzmv.zzF(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 36:
                    zzmv.zzJ(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 37:
                    zzmv.zzM(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 38:
                    zzmv.zzU(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 39:
                    zzmv.zzL(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 40:
                    zzmv.zzI(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 41:
                    zzmv.zzH(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 42:
                    zzmv.zzD(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 43:
                    zzmv.zzT(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 44:
                    zzmv.zzG(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 45:
                    zzmv.zzO(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 46:
                    zzmv.zzP(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 47:
                    zzmv.zzQ(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 48:
                    zzmv.zzR(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, true);
                    break;
                case 49:
                    zzmv.zzK(this.zzc[i15], (List) unsafe.getObject(obj, j4), zzocVar, zzB(i15));
                    break;
                case 50:
                    zzN(zzocVar, i18, unsafe.getObject(obj, j4), i15);
                    break;
                case 51:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzf(i18, zzm(obj, j4));
                    }
                    break;
                case 52:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzo(i18, zzn(obj, j4));
                    }
                    break;
                case 53:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzt(i18, zzz(obj, j4));
                    }
                    break;
                case 54:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzJ(i18, zzz(obj, j4));
                    }
                    break;
                case 55:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzr(i18, zzp(obj, j4));
                    }
                    break;
                case 56:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzm(i18, zzz(obj, j4));
                    }
                    break;
                case 57:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzk(i18, zzp(obj, j4));
                    }
                    break;
                case 58:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzb(i18, zzU(obj, j4));
                    }
                    break;
                case 59:
                    if (zzT(obj, i18, i15)) {
                        zzV(i18, unsafe.getObject(obj, j4), zzocVar);
                    }
                    break;
                case 60:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzv(i18, unsafe.getObject(obj, j4), zzB(i15));
                    }
                    break;
                case 61:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzd(i18, (zzka) unsafe.getObject(obj, j4));
                    }
                    break;
                case 62:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzH(i18, zzp(obj, j4));
                    }
                    break;
                case 63:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzi(i18, zzp(obj, j4));
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzw(i18, zzp(obj, j4));
                    }
                    break;
                case 65:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzy(i18, zzz(obj, j4));
                    }
                    break;
                case 66:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzA(i18, zzp(obj, j4));
                    }
                    break;
                case 67:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzC(i18, zzz(obj, j4));
                    }
                    break;
                case 68:
                    if (zzT(obj, i18, i15)) {
                        zzocVar.zzq(i18, unsafe.getObject(obj, j4), zzB(i15));
                    }
                    break;
            }
            i10 = 0;
            i15 += 3;
            i11 = i10;
            i12 = 1048575;
        }
        zznk zznkVar2 = this.zzn;
        zznkVar2.zzi(zznkVar2.zzd(obj), zzocVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzV;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzy = zzy(i);
            long j4 = iZzy & 1048575;
            switch (zzx(iZzy)) {
                case 0:
                    if (!zzO(obj, obj2, i) || Double.doubleToLongBits(zznu.zza(obj, j4)) != Double.doubleToLongBits(zznu.zza(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzO(obj, obj2, i) || Float.floatToIntBits(zznu.zzb(obj, j4)) != Float.floatToIntBits(zznu.zzb(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzO(obj, obj2, i) || zznu.zzd(obj, j4) != zznu.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzO(obj, obj2, i) || zznu.zzd(obj, j4) != zznu.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzO(obj, obj2, i) || zznu.zzc(obj, j4) != zznu.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzO(obj, obj2, i) || zznu.zzd(obj, j4) != zznu.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzO(obj, obj2, i) || zznu.zzc(obj, j4) != zznu.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzO(obj, obj2, i) || zznu.zzw(obj, j4) != zznu.zzw(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzO(obj, obj2, i) || !zzmv.zzV(zznu.zzf(obj, j4), zznu.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzO(obj, obj2, i) || !zzmv.zzV(zznu.zzf(obj, j4), zznu.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzO(obj, obj2, i) || !zzmv.zzV(zznu.zzf(obj, j4), zznu.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzO(obj, obj2, i) || zznu.zzc(obj, j4) != zznu.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzO(obj, obj2, i) || zznu.zzc(obj, j4) != zznu.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzO(obj, obj2, i) || zznu.zzc(obj, j4) != zznu.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzO(obj, obj2, i) || zznu.zzd(obj, j4) != zznu.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzO(obj, obj2, i) || zznu.zzc(obj, j4) != zznu.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzO(obj, obj2, i) || zznu.zzd(obj, j4) != zznu.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzO(obj, obj2, i) || !zzmv.zzV(zznu.zzf(obj, j4), zznu.zzf(obj2, j4))) {
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
                    zZzV = zzmv.zzV(zznu.zzf(obj, j4), zznu.zzf(obj2, j4));
                    break;
                case 50:
                    zZzV = zzmv.zzV(zznu.zzf(obj, j4), zznu.zzf(obj2, j4));
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
                    long jZzv = zzv(i) & 1048575;
                    if (zznu.zzc(obj, jZzv) != zznu.zzc(obj2, jZzv) || !zzmv.zzV(zznu.zzf(obj, j4), zznu.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzV) {
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
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzk(Object obj) {
        int i;
        int i10;
        int i11;
        List list;
        zzmt zzmtVarZzB;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.zzk) {
            int i16 = this.zzj[i14];
            int i17 = this.zzc[i16];
            int iZzy = zzy(i16);
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
            if ((268435456 & iZzy) != 0) {
                i10 = i16;
                i11 = i15;
                if (!zzQ(obj, i10, i11, i, i20)) {
                    return false;
                }
            } else {
                i10 = i16;
                i11 = i15;
            }
            int iZzx = zzx(iZzy);
            if (iZzx == 9 || iZzx == 17) {
                if (zzQ(obj, i10, i11, i, i20) && !zzR(obj, iZzy, zzB(i10))) {
                    return false;
                }
            } else if (iZzx == 27) {
                list = (List) zznu.zzf(obj, iZzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmtVarZzB = zzB(i10);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzmtVarZzB.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzx == 60 || iZzx == 68) {
                if (zzT(obj, i17, i10) && !zzR(obj, iZzy, zzB(i10))) {
                    return false;
                }
            } else if (iZzx == 49) {
                list = (List) zznu.zzf(obj, iZzy & 1048575);
                if (list.isEmpty()) {
                    zzmtVarZzB = zzB(i10);
                    while (i12 < list.size()) {
                        if (!zzmtVarZzB.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzx == 50 && !((zzmc) zznu.zzf(obj, iZzy & 1048575)).isEmpty()) {
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
}
