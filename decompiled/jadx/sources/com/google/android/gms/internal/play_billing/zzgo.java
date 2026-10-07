package com.google.android.gms.internal.play_billing;

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
final class zzgo<T> implements zzgv<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzho.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgl zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzhh zzl;
    private final zzev zzm;

    private zzgo(int[] iArr, Object[] objArr, int i, int i10, zzgl zzglVar, boolean z4, int[] iArr2, int i11, int i12, zzgq zzgqVar, zzfy zzfyVar, zzhh zzhhVar, zzev zzevVar, zzgg zzggVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i10;
        boolean z10 = false;
        if (zzevVar != null && (zzglVar instanceof zzff)) {
            z10 = true;
        }
        this.zzh = z10;
        this.zzi = iArr2;
        this.zzj = i11;
        this.zzk = i12;
        this.zzl = zzhhVar;
        this.zzm = zzevVar;
        this.zzg = zzglVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = iZzs;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgv zzgvVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZze = zzgvVarZzv.zze();
                    zzgvVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzL(object2)) {
                Object objZze2 = zzgvVarZzv.zze();
                zzgvVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzgvVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i10 = iArr[i];
        if (zzM(obj2, i10, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = iZzs;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            zzgv zzgvVarZzv = zzv(i);
            if (!zzM(obj, i10, i)) {
                if (zzL(object)) {
                    Object objZze = zzgvVarZzv.zze();
                    zzgvVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j4, objZze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzE(obj, i10, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzL(object2)) {
                Object objZze2 = zzgvVarZzv.zze();
                zzgvVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j4, objZze2);
                object2 = objZze2;
            }
            zzgvVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzp = zzp(i);
        long j4 = 1048575 & iZzp;
        if (j4 == 1048575) {
            return;
        }
        zzho.zzq(obj, j4, (1 << (iZzp >>> 20)) | zzho.zzc(obj, j4));
    }

    private final void zzE(Object obj, int i, int i10) {
        zzho.zzq(obj, zzp(i10) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i10, Object obj2) {
        zzb.putObject(obj, zzs(i10) & 1048575, obj2);
        zzE(obj, i, i10);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int iZzp = zzp(i);
        long j4 = iZzp & 1048575;
        if (j4 != 1048575) {
            return (zzho.zzc(obj, j4) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j10 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzho.zza(obj, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzho.zzb(obj, j10)) != 0;
            case 2:
                return zzho.zzd(obj, j10) != 0;
            case 3:
                return zzho.zzd(obj, j10) != 0;
            case 4:
                return zzho.zzc(obj, j10) != 0;
            case 5:
                return zzho.zzd(obj, j10) != 0;
            case 6:
                return zzho.zzc(obj, j10) != 0;
            case 7:
                return zzho.zzw(obj, j10);
            case 8:
                Object objZzf = zzho.zzf(obj, j10);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzei) {
                    return !zzei.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzho.zzf(obj, j10) != null;
            case 10:
                return !zzei.zzb.equals(zzho.zzf(obj, j10));
            case 11:
                return zzho.zzc(obj, j10) != 0;
            case 12:
                return zzho.zzc(obj, j10) != 0;
            case 13:
                return zzho.zzc(obj, j10) != 0;
            case 14:
                return zzho.zzd(obj, j10) != 0;
            case 15:
                return zzho.zzc(obj, j10) != 0;
            case 16:
                return zzho.zzd(obj, j10) != 0;
            case 17:
                return zzho.zzf(obj, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return zzI(obj, i);
        }
        return (i11 & i12) != 0;
    }

    private static boolean zzK(Object obj, int i, zzgv zzgvVar) {
        return zzgvVar.zzk(zzho.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzfi) {
            return ((zzfi) obj).zzz();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i10) {
        return zzho.zzc(obj, (long) (zzp(i10) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j4) {
        return ((Boolean) zzho.zzf(obj, j4)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzhu zzhuVar) throws IOException {
        if (obj instanceof String) {
            zzhuVar.zzG(i, (String) obj);
        } else {
            zzhuVar.zzd(i, (zzei) obj);
        }
    }

    public static zzhi zzd(Object obj) {
        zzfi zzfiVar = (zzfi) obj;
        zzhi zzhiVar = zzfiVar.zzc;
        if (zzhiVar != zzhi.zzc()) {
            return zzhiVar;
        }
        zzhi zzhiVarZzf = zzhi.zzf();
        zzfiVar.zzc = zzhiVarZzf;
        return zzhiVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:193:0x03e2  */
    public static zzgo zzl(Class cls, zzgi zzgiVar, zzgq zzgqVar, zzfy zzfyVar, zzhh zzhhVar, zzev zzevVar, zzgg zzggVar) {
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
        zzgu zzguVar;
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
        Field fieldZzz;
        char cCharAt9;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Field fieldZzz2;
        Field fieldZzz3;
        int i38;
        char cCharAt10;
        int i39;
        int i40;
        char cCharAt11;
        int i41;
        char cCharAt12;
        int i42;
        char cCharAt13;
        if (!(zzgiVar instanceof zzgu)) {
            throw null;
        }
        zzgu zzguVar2 = (zzgu) zzgiVar;
        String strZzd = zzguVar2.zzd();
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
        Object[] objArrZze = zzguVar2.zze();
        Class<?> cls2 = zzguVar2.zza().getClass();
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
                    zzguVar = zzguVar2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i84 |= (cCharAt11 & 8191) << i86;
                    i86 += 13;
                    i85 = i40;
                    zzguVar2 = zzguVar;
                }
                iCharAt11 = i84 | (cCharAt11 << i86);
                i25 = i40;
            } else {
                zzguVar = zzguVar2;
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
                    objArr2[a.v(i77, 3, 1)] = objArrZze[i14];
                    i37 = i89;
                    i14++;
                } else if (i95 != 12) {
                    i37 = i89;
                } else if (zzguVar.zzc() == 1 || i89 != 0) {
                    objArr2[a.v(i77, 3, 1)] = objArrZze[i14];
                    i14++;
                    i37 = i89;
                } else {
                    i37 = 0;
                }
                int i97 = i94 + i94;
                Object obj = objArrZze[i97];
                int i98 = i37;
                if (obj instanceof Field) {
                    fieldZzz2 = (Field) obj;
                } else {
                    fieldZzz2 = zzz(cls2, (String) obj);
                    objArrZze[i97] = fieldZzz2;
                }
                Object[] objArr3 = objArr2;
                int i99 = i14;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz2);
                int i100 = i97 + 1;
                Object obj2 = objArrZze[i100];
                if (obj2 instanceof Field) {
                    fieldZzz3 = (Field) obj2;
                } else {
                    fieldZzz3 = zzz(cls2, (String) obj2);
                    objArrZze[i100] = fieldZzz3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzz3);
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
                Field fieldZzz4 = zzz(cls2, (String) objArrZze[i14]);
                i26 = iCharAt10;
                if (i87 == 9 || i87 == 17) {
                    i15 = i15;
                    objArr[a.v(i77, 3, 1)] = fieldZzz4.getType();
                } else {
                    if (i87 != 27) {
                        if (i87 == 49) {
                            i35 = i14 + 2;
                            i33 = 3;
                            i34 = 1;
                        } else if (i87 == 12 || i87 == 30 || i87 == 44) {
                            i15 = i15;
                            if (zzguVar.zzc() == 1 || i89 != 0) {
                                i35 = i14 + 2;
                                objArr[a.v(i77, 3, 1)] = objArrZze[i101];
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
                                fieldZzz = (Field) obj3;
                            } else {
                                fieldZzz = zzz(cls2, (String) obj3);
                                objArrZze[i108] = fieldZzz;
                            }
                            i28 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz);
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
                    objArr[a.v(i77, i33, i34)] = objArrZze[i101];
                    i101 = i35;
                }
                i77 = i77;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
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
            zzguVar2 = zzguVar;
            i15 = i15;
            objArr2 = objArr;
        }
        return new zzgo(iArr3, objArr2, i10, i12, zzguVar2.zza(), false, iArr, i13, i73, zzgqVar, zzfyVar, zzhhVar, zzevVar, zzggVar);
    }

    private static double zzm(Object obj, long j4) {
        return ((Double) zzho.zzf(obj, j4)).doubleValue();
    }

    private static float zzn(Object obj, long j4) {
        return ((Float) zzho.zzf(obj, j4)).floatValue();
    }

    private static int zzo(Object obj, long j4) {
        return ((Integer) zzho.zzf(obj, j4)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i10) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
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

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j4) {
        return ((Long) zzho.zzf(obj, j4)).longValue();
    }

    private final zzfl zzu(int i) {
        int i10 = i / 3;
        return (zzfl) this.zzd[i10 + i10 + 1];
    }

    private final zzgv zzv(int i) {
        Object[] objArr = this.zzd;
        int i10 = i / 3;
        int i11 = i10 + i10;
        zzgv zzgvVar = (zzgv) objArr[i11];
        if (zzgvVar != null) {
            return zzgvVar;
        }
        zzgv zzgvVarZzb = zzgs.zza().zzb((Class) objArr[i11 + 1]);
        objArr[i11] = zzgvVarZzb;
        return zzgvVarZzb;
    }

    private final Object zzw(int i) {
        int i10 = i / 3;
        return this.zzd[i10 + i10];
    }

    private final Object zzx(Object obj, int i) {
        zzgv zzgvVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzgvVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgvVarZzv.zze();
        if (object != null) {
            zzgvVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i, int i10) {
        zzgv zzgvVarZzv = zzv(i10);
        if (!zzM(obj, i, i10)) {
            return zzgvVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i10) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgvVarZzv.zze();
        if (object != null) {
            zzgvVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
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
            throw new RuntimeException(sbE.toString(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x038c  */
    /* JADX WARN: Code duplicated, block: B:196:0x04de  */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int zza(Object obj) {
        int i;
        int iZzC;
        int iZzD;
        int iZzC2;
        int iZzd;
        int iZzC3;
        int iZzh;
        int iZzy;
        int iZzC4;
        int size;
        int iZzl;
        int iZzC5;
        int iZzC6;
        int iZzC7;
        int iZze;
        int iZzC8;
        int iZzC9;
        int iZzy2;
        int iZzC10;
        int iZzD2;
        zzgo<T> zzgoVar = this;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int iZ = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = zzgoVar.zzc;
            if (i11 >= iArr.length) {
                int iZza = ((zzfi) obj).zzc.zza() + iZ;
                if (!zzgoVar.zzh) {
                    return iZza;
                }
                zzhd zzhdVar = ((zzff) obj).zzb.zza;
                int iZzc = zzhdVar.zzc();
                int iZzc2 = 0;
                for (int i14 = 0; i14 < iZzc; i14++) {
                    Map.Entry entryZzg = zzhdVar.zzg(i14);
                    iZzc2 += zzez.zzc((zzey) ((zzgz) entryZzg).zza(), entryZzg.getValue());
                }
                for (Map.Entry entry : zzhdVar.zzd()) {
                    iZzc2 += zzez.zzc((zzey) entry.getKey(), entry.getValue());
                }
                return iZza + iZzc2;
            }
            int iZzs = zzgoVar.zzs(i11);
            int iZzr = zzr(iZzs);
            int i15 = iArr[i11];
            int i16 = iArr[i11 + 2];
            int i17 = i16 & i10;
            if (iZzr <= 17) {
                if (i17 != i13) {
                    i12 = i17 == i10 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i = 1 << (i16 >>> 20);
            } else {
                i = 0;
            }
            int i18 = iZzs & i10;
            if (iZzr >= zzfa.zzJ.zza()) {
                zzfa.zzW.zza();
            }
            long j4 = i18;
            switch (iZzr) {
                case 0:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        iZ = a.z(i15 << 3, 8, iZ);
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 1:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        iZ = a.z(i15 << 3, 4, iZ);
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 2:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        long j10 = unsafe.getLong(obj, j4);
                        iZzC = zzep.zzC(i15 << 3);
                        iZzD = zzep.zzD(j10);
                        iZ += iZzD + iZzC;
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 3:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        long j11 = unsafe.getLong(obj, j4);
                        iZzC = zzep.zzC(i15 << 3);
                        iZzD = zzep.zzD(j11);
                        iZ += iZzD + iZzC;
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 4:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        long j12 = unsafe.getInt(obj, j4);
                        iZzC = zzep.zzC(i15 << 3);
                        iZzD = zzep.zzD(j12);
                        iZ += iZzD + iZzC;
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 5:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        iZ = a.z(i15 << 3, 8, iZ);
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 6:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        iZ = a.z(i15 << 3, 4, iZ);
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 7:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        iZ = a.z(i15 << 3, 1, iZ);
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 8:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof zzei) {
                            iZzC2 = zzep.zzC(i19);
                            iZzd = ((zzei) object).zzd();
                            iZzC3 = zzep.zzC(iZzd);
                            iZ += iZzC3 + iZzd + iZzC2;
                        } else {
                            iZzC = zzep.zzC(i19);
                            iZzD = zzep.zzB((String) object);
                            iZ += iZzD + iZzC;
                        }
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 9:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        iZzh = zzgx.zzh(i15, unsafe.getObject(obj, j4), zzgoVar.zzv(i11));
                        iZ += iZzh;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 10:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        zzei zzeiVar = (zzei) unsafe.getObject(obj, j4);
                        iZzC2 = zzep.zzC(i15 << 3);
                        iZzd = zzeiVar.zzd();
                        iZzC3 = zzep.zzC(iZzd);
                        iZ += iZzC3 + iZzd + iZzC2;
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 11:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        iZ = a.z(unsafe.getInt(obj, j4), zzep.zzC(i15 << 3), iZ);
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 12:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        long j13 = unsafe.getInt(obj, j4);
                        iZzC = zzep.zzC(i15 << 3);
                        iZzD = zzep.zzD(j13);
                        iZ += iZzD + iZzC;
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 13:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        iZ = a.z(i15 << 3, 4, iZ);
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 14:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        iZ = a.z(i15 << 3, 8, iZ);
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 15:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        int i20 = unsafe.getInt(obj, j4);
                        iZ = a.z((i20 >> 31) ^ (i20 + i20), zzep.zzC(i15 << 3), iZ);
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 16:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        long j14 = unsafe.getLong(obj, j4);
                        iZzC = zzep.zzC(i15 << 3);
                        iZzD = zzep.zzD((j14 >> 63) ^ (j14 + j14));
                        iZ += iZzD + iZzC;
                    }
                    zzgoVar = this;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 17:
                    if (zzgoVar.zzJ(obj, i11, i13, i12, i)) {
                        iZzy = zzep.zzy(i15, (zzgl) unsafe.getObject(obj, j4), zzgoVar.zzv(i11));
                        iZ += iZzy;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 18:
                    iZzh = zzgx.zzd(i15, (List) unsafe.getObject(obj, j4), false);
                    iZ += iZzh;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 19:
                    iZzh = zzgx.zzb(i15, (List) unsafe.getObject(obj, j4), false);
                    iZ += iZzh;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j4);
                    int i21 = zzgx.zza;
                    if (list.size() == 0) {
                        iZzC4 = 0;
                    } else {
                        iZzC4 = (zzep.zzC(i15 << 3) * list.size()) + zzgx.zzg(list);
                    }
                    iZ += iZzC4;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    List list2 = (List) unsafe.getObject(obj, j4);
                    int i22 = zzgx.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzC6 = 0;
                    } else {
                        iZzl = zzgx.zzl(list2);
                        iZzC5 = zzep.zzC(i15 << 3);
                        iZzC6 = (iZzC5 * size) + iZzl;
                    }
                    iZ += iZzC6;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j4);
                    int i23 = zzgx.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzC6 = 0;
                    } else {
                        iZzl = zzgx.zzf(list3);
                        iZzC5 = zzep.zzC(i15 << 3);
                        iZzC6 = (iZzC5 * size) + iZzl;
                    }
                    iZ += iZzC6;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 23:
                    iZzh = zzgx.zzd(i15, (List) unsafe.getObject(obj, j4), false);
                    iZ += iZzh;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 24:
                    iZzh = zzgx.zzb(i15, (List) unsafe.getObject(obj, j4), false);
                    iZ += iZzh;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j4);
                    int i24 = zzgx.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzC4 = 0;
                    } else {
                        iZzC4 = (zzep.zzC(i15 << 3) + 1) * size2;
                    }
                    iZ += iZzC4;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j4);
                    int i25 = zzgx.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzC6 = 0;
                    } else {
                        iZzC6 = zzep.zzC(i15 << 3) * size3;
                        if (list5 instanceof zzfx) {
                            zzfx zzfxVar = (zzfx) list5;
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object objZza = zzfxVar.zza();
                                if (objZza instanceof zzei) {
                                    int iZzd2 = ((zzei) objZza).zzd();
                                    iZzC6 = a.z(iZzd2, iZzd2, iZzC6);
                                } else {
                                    iZzC6 = zzep.zzB((String) objZza) + iZzC6;
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object obj2 = list5.get(i27);
                                if (obj2 instanceof zzei) {
                                    int iZzd3 = ((zzei) obj2).zzd();
                                    iZzC6 = a.z(iZzd3, iZzd3, iZzC6);
                                } else {
                                    iZzC6 = zzep.zzB((String) obj2) + iZzC6;
                                }
                            }
                        }
                    }
                    iZ += iZzC6;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j4);
                    zzgv zzgvVarZzv = zzgoVar.zzv(i11);
                    int i28 = zzgx.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzC7 = 0;
                    } else {
                        iZzC7 = zzep.zzC(i15 << 3) * size4;
                        for (int i29 = 0; i29 < size4; i29++) {
                            Object obj3 = list6.get(i29);
                            if (obj3 instanceof zzfw) {
                                int iZza2 = ((zzfw) obj3).zza();
                                iZzC7 = a.z(iZza2, iZza2, iZzC7);
                            } else {
                                iZzC7 = zzep.zzA((zzgl) obj3, zzgvVarZzv) + iZzC7;
                            }
                        }
                    }
                    iZ += iZzC7;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j4);
                    int i30 = zzgx.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzC6 = 0;
                    } else {
                        iZzC6 = zzep.zzC(i15 << 3) * size5;
                        for (int i31 = 0; i31 < list7.size(); i31++) {
                            int iZzd4 = ((zzei) list7.get(i31)).zzd();
                            iZzC6 = a.z(iZzd4, iZzd4, iZzC6);
                        }
                    }
                    iZ += iZzC6;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j4);
                    int i32 = zzgx.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzC6 = 0;
                    } else {
                        iZzl = zzgx.zzk(list8);
                        iZzC5 = zzep.zzC(i15 << 3);
                        iZzC6 = (iZzC5 * size) + iZzl;
                    }
                    iZ += iZzC6;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j4);
                    int i33 = zzgx.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzC6 = 0;
                    } else {
                        iZzl = zzgx.zza(list9);
                        iZzC5 = zzep.zzC(i15 << 3);
                        iZzC6 = (iZzC5 * size) + iZzl;
                    }
                    iZ += iZzC6;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 31:
                    iZzh = zzgx.zzb(i15, (List) unsafe.getObject(obj, j4), false);
                    iZ += iZzh;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    iZzh = zzgx.zzd(i15, (List) unsafe.getObject(obj, j4), false);
                    iZ += iZzh;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j4);
                    int i34 = zzgx.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzC6 = 0;
                    } else {
                        iZzl = zzgx.zzi(list10);
                        iZzC5 = zzep.zzC(i15 << 3);
                        iZzC6 = (iZzC5 * size) + iZzl;
                    }
                    iZ += iZzC6;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j4);
                    int i35 = zzgx.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzC6 = 0;
                    } else {
                        iZzl = zzgx.zzj(list11);
                        iZzC5 = zzep.zzC(i15 << 3);
                        iZzC6 = (iZzC5 * size) + iZzl;
                    }
                    iZ += iZzC6;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 35:
                    iZze = zzgx.zze((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 36:
                    iZze = zzgx.zzc((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 37:
                    iZze = zzgx.zzg((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 38:
                    iZze = zzgx.zzl((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 39:
                    iZze = zzgx.zzf((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 40:
                    iZze = zzgx.zze((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 41:
                    iZze = zzgx.zzc((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j4);
                    int i36 = zzgx.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 43:
                    iZze = zzgx.zzk((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 44:
                    iZze = zzgx.zza((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 45:
                    iZze = zzgx.zzc((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 46:
                    iZze = zzgx.zze((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 47:
                    iZze = zzgx.zzi((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 48:
                    iZze = zzgx.zzj((List) unsafe.getObject(obj, j4));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i15 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j4);
                    zzgv zzgvVarZzv2 = zzgoVar.zzv(i11);
                    int i37 = zzgx.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzy2 = 0;
                    } else {
                        iZzy2 = 0;
                        for (int i38 = 0; i38 < size6; i38++) {
                            iZzy2 += zzep.zzy(i15, (zzgl) list13.get(i38), zzgvVarZzv2);
                        }
                    }
                    iZ += iZzy2;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 50:
                    zzgf zzgfVar = (zzgf) unsafe.getObject(obj, j4);
                    if (zzgfVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzgfVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i11 += 3;
                    i10 = 1048575;
                case 51:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        iZ = a.z(i15 << 3, 8, iZ);
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 52:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        iZ = a.z(i15 << 3, 4, iZ);
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 53:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        long jZzt = zzt(obj, j4);
                        iZzC10 = zzep.zzC(i15 << 3);
                        iZzD2 = zzep.zzD(jZzt);
                        iZ += iZzD2 + iZzC10;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 54:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        long jZzt2 = zzt(obj, j4);
                        iZzC10 = zzep.zzC(i15 << 3);
                        iZzD2 = zzep.zzD(jZzt2);
                        iZ += iZzD2 + iZzC10;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 55:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        long jZzo = zzo(obj, j4);
                        iZzC10 = zzep.zzC(i15 << 3);
                        iZzD2 = zzep.zzD(jZzo);
                        iZ += iZzD2 + iZzC10;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 56:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        iZ = a.z(i15 << 3, 8, iZ);
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 57:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        iZ = a.z(i15 << 3, 4, iZ);
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 58:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        iZ = a.z(i15 << 3, 1, iZ);
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 59:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        int i39 = i15 << 3;
                        Object object2 = unsafe.getObject(obj, j4);
                        if (object2 instanceof zzei) {
                            iZze = zzep.zzC(i39);
                            iZzC8 = ((zzei) object2).zzd();
                            iZzC9 = zzep.zzC(iZzC8);
                            iZ += iZzC9 + iZzC8 + iZze;
                        } else {
                            iZzC10 = zzep.zzC(i39);
                            iZzD2 = zzep.zzB((String) object2);
                            iZ += iZzD2 + iZzC10;
                        }
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 60:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        iZzh = zzgx.zzh(i15, unsafe.getObject(obj, j4), zzgoVar.zzv(i11));
                        iZ += iZzh;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 61:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        zzei zzeiVar2 = (zzei) unsafe.getObject(obj, j4);
                        iZze = zzep.zzC(i15 << 3);
                        iZzC8 = zzeiVar2.zzd();
                        iZzC9 = zzep.zzC(iZzC8);
                        iZ += iZzC9 + iZzC8 + iZze;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 62:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        iZ = a.z(zzo(obj, j4), zzep.zzC(i15 << 3), iZ);
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 63:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        long jZzo2 = zzo(obj, j4);
                        iZzC10 = zzep.zzC(i15 << 3);
                        iZzD2 = zzep.zzD(jZzo2);
                        iZ += iZzD2 + iZzC10;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        iZ = a.z(i15 << 3, 4, iZ);
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 65:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        iZ = a.z(i15 << 3, 8, iZ);
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 66:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        int iZzo = zzo(obj, j4);
                        iZ = a.z((iZzo >> 31) ^ (iZzo + iZzo), zzep.zzC(i15 << 3), iZ);
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 67:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        long jZzt3 = zzt(obj, j4);
                        iZzC10 = zzep.zzC(i15 << 3);
                        iZzD2 = zzep.zzD((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        iZ += iZzD2 + iZzC10;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 68:
                    if (zzgoVar.zzM(obj, i15, i11)) {
                        iZzy = zzep.zzy(i15, (zzgl) unsafe.getObject(obj, j4), zzgoVar.zzv(i11));
                        iZ += iZzy;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                default:
                    i11 += 3;
                    i10 = 1048575;
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i10;
        int iFloatToIntBits;
        int iZzc;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int iHashCode = ((zzfi) obj).zzc.hashCode() + (i13 * 53);
                return this.zzh ? (iHashCode * 53) + ((zzff) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzs = zzs(i12);
            int i14 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i15 = iArr[i12];
            long j4 = i14;
            int iHashCode2 = 37;
            switch (iZzr) {
                case 0:
                    i = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzho.zza(obj, j4));
                    byte[] bArr = zzfo.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i + iZzc;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzho.zzb(obj, j4));
                    i13 = iFloatToIntBits + i10;
                    break;
                case 2:
                    i = i13 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j4);
                    byte[] bArr2 = zzfo.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i + iZzc;
                    break;
                case 3:
                    i = i13 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j4);
                    byte[] bArr3 = zzfo.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i + iZzc;
                    break;
                case 4:
                    i = i13 * 53;
                    iZzc = zzho.zzc(obj, j4);
                    i13 = i + iZzc;
                    break;
                case 5:
                    i = i13 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j4);
                    byte[] bArr4 = zzfo.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i + iZzc;
                    break;
                case 6:
                    i = i13 * 53;
                    iZzc = zzho.zzc(obj, j4);
                    i13 = i + iZzc;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzfo.zza(zzho.zzw(obj, j4));
                    i13 = iFloatToIntBits + i10;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) zzho.zzf(obj, j4)).hashCode();
                    i13 = iFloatToIntBits + i10;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objZzf = zzho.zzf(obj, j4);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzho.zzf(obj, j4).hashCode();
                    i13 = iFloatToIntBits + i10;
                    break;
                case 11:
                    i = i13 * 53;
                    iZzc = zzho.zzc(obj, j4);
                    i13 = i + iZzc;
                    break;
                case 12:
                    i = i13 * 53;
                    iZzc = zzho.zzc(obj, j4);
                    i13 = i + iZzc;
                    break;
                case 13:
                    i = i13 * 53;
                    iZzc = zzho.zzc(obj, j4);
                    i13 = i + iZzc;
                    break;
                case 14:
                    i = i13 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j4);
                    byte[] bArr5 = zzfo.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i + iZzc;
                    break;
                case 15:
                    i = i13 * 53;
                    iZzc = zzho.zzc(obj, j4);
                    i13 = i + iZzc;
                    break;
                case 16:
                    i = i13 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j4);
                    byte[] bArr6 = zzfo.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i + iZzc;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objZzf2 = zzho.zzf(obj, j4);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
                    }
                    i13 = i11 + iHashCode2;
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
                    i10 = i13 * 53;
                    iFloatToIntBits = zzho.zzf(obj, j4).hashCode();
                    i13 = iFloatToIntBits + i10;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzho.zzf(obj, j4).hashCode();
                    i13 = iFloatToIntBits + i10;
                    break;
                case 51:
                    if (zzM(obj, i15, i12)) {
                        i = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j4));
                        byte[] bArr7 = zzfo.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i + iZzc;
                    }
                    break;
                case 52:
                    if (zzM(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j4));
                        i13 = iFloatToIntBits + i10;
                    }
                    break;
                case 53:
                    if (zzM(obj, i15, i12)) {
                        i = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j4);
                        byte[] bArr8 = zzfo.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i + iZzc;
                    }
                    break;
                case 54:
                    if (zzM(obj, i15, i12)) {
                        i = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j4);
                        byte[] bArr9 = zzfo.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i + iZzc;
                    }
                    break;
                case 55:
                    if (zzM(obj, i15, i12)) {
                        i = i13 * 53;
                        iZzc = zzo(obj, j4);
                        i13 = i + iZzc;
                    }
                    break;
                case 56:
                    if (zzM(obj, i15, i12)) {
                        i = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j4);
                        byte[] bArr10 = zzfo.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i + iZzc;
                    }
                    break;
                case 57:
                    if (zzM(obj, i15, i12)) {
                        i = i13 * 53;
                        iZzc = zzo(obj, j4);
                        i13 = i + iZzc;
                    }
                    break;
                case 58:
                    if (zzM(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzfo.zza(zzN(obj, j4));
                        i13 = iFloatToIntBits + i10;
                    }
                    break;
                case 59:
                    if (zzM(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) zzho.zzf(obj, j4)).hashCode();
                        i13 = iFloatToIntBits + i10;
                    }
                    break;
                case 60:
                    if (zzM(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzho.zzf(obj, j4).hashCode();
                        i13 = iFloatToIntBits + i10;
                    }
                    break;
                case 61:
                    if (zzM(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzho.zzf(obj, j4).hashCode();
                        i13 = iFloatToIntBits + i10;
                    }
                    break;
                case 62:
                    if (zzM(obj, i15, i12)) {
                        i = i13 * 53;
                        iZzc = zzo(obj, j4);
                        i13 = i + iZzc;
                    }
                    break;
                case 63:
                    if (zzM(obj, i15, i12)) {
                        i = i13 * 53;
                        iZzc = zzo(obj, j4);
                        i13 = i + iZzc;
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzM(obj, i15, i12)) {
                        i = i13 * 53;
                        iZzc = zzo(obj, j4);
                        i13 = i + iZzc;
                    }
                    break;
                case 65:
                    if (zzM(obj, i15, i12)) {
                        i = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j4);
                        byte[] bArr11 = zzfo.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i + iZzc;
                    }
                    break;
                case 66:
                    if (zzM(obj, i15, i12)) {
                        i = i13 * 53;
                        iZzc = zzo(obj, j4);
                        i13 = i + iZzc;
                    }
                    break;
                case 67:
                    if (zzM(obj, i15, i12)) {
                        i = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j4);
                        byte[] bArr12 = zzfo.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzM(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzho.zzf(obj, j4).hashCode();
                        i13 = iFloatToIntBits + i10;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37421. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.play_billing.zzdw r38) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgo.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzdw):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final Object zze() {
        return ((zzfi) this.zzg).zzo();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzfi) {
                zzfi zzfiVar = (zzfi) obj;
                zzfiVar.zzx(f.API_PRIORITY_OTHER);
                zzfiVar.zza = 0;
                zzfiVar.zzv();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzs = zzs(i);
                int i10 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j4 = i10;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
                            case 17:
                                if (zzI(obj, i)) {
                                    zzv(i).zzf(zzb.getObject(obj, j4));
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
                                ((zzfn) zzho.zzf(obj, j4)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    ((zzgf) object).zzc();
                                    unsafe.putObject(obj, j4, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, iArr[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j4));
                    }
                } else if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j4));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzgx.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    zzgx.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzs = zzs(i);
            int i10 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i11 = iArr[i];
            long j4 = i10;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzho.zzo(obj, j4, zzho.zza(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i)) {
                        zzho.zzp(obj, j4, zzho.zzb(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i)) {
                        zzho.zzr(obj, j4, zzho.zzd(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i)) {
                        zzho.zzr(obj, j4, zzho.zzd(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i)) {
                        zzho.zzq(obj, j4, zzho.zzc(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i)) {
                        zzho.zzr(obj, j4, zzho.zzd(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i)) {
                        zzho.zzq(obj, j4, zzho.zzc(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i)) {
                        zzho.zzm(obj, j4, zzho.zzw(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i)) {
                        zzho.zzs(obj, j4, zzho.zzf(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzho.zzs(obj, j4, zzho.zzf(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i)) {
                        zzho.zzq(obj, j4, zzho.zzc(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i)) {
                        zzho.zzq(obj, j4, zzho.zzc(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i)) {
                        zzho.zzq(obj, j4, zzho.zzc(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i)) {
                        zzho.zzr(obj, j4, zzho.zzd(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i)) {
                        zzho.zzq(obj, j4, zzho.zzc(obj2, j4));
                        zzD(obj, i);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i)) {
                        zzho.zzr(obj, j4, zzho.zzd(obj2, j4));
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
                    zzfn zzfnVarZzd = (zzfn) zzho.zzf(obj, j4);
                    zzfn zzfnVar = (zzfn) zzho.zzf(obj2, j4);
                    int size = zzfnVarZzd.size();
                    int size2 = zzfnVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzfnVarZzd.zzc()) {
                            zzfnVarZzd = zzfnVarZzd.zzd(size2 + size);
                        }
                        zzfnVarZzd.addAll(zzfnVar);
                    }
                    if (size > 0) {
                        zzfnVar = zzfnVarZzd;
                    }
                    zzho.zzs(obj, j4, zzfnVar);
                    break;
                case 50:
                    int i12 = zzgx.zza;
                    zzho.zzs(obj, j4, zzgg.zza(zzho.zzf(obj, j4), zzho.zzf(obj2, j4)));
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
                    if (zzM(obj2, i11, i)) {
                        zzho.zzs(obj, j4, zzho.zzf(obj2, j4));
                        zzE(obj, i11, i);
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
                    if (zzM(obj2, i11, i)) {
                        zzho.zzs(obj, j4, zzho.zzf(obj2, j4));
                        zzE(obj, i11, i);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzh(Object obj, byte[] bArr, int i, int i10, zzdw zzdwVar) throws IOException {
        zzc(obj, bArr, i, i10, 0, zzdwVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzi(Object obj, zzhu zzhuVar) throws IOException {
        Map.Entry entry;
        int i;
        zzgo<T> zzgoVar = this;
        if (zzgoVar.zzh) {
            zzez zzezVar = ((zzff) obj).zzb;
            if (zzezVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzezVar.zzf().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zzgoVar.zzc;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < iArr.length) {
            int iZzs = zzgoVar.zzs(i12);
            int iZzr = zzr(iZzs);
            int i14 = iArr[i12];
            if (iZzr <= 17) {
                int i15 = iArr[i12 + 2];
                int i16 = i15 & i10;
                if (i16 != i11) {
                    i13 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i = 1 << (i15 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j4 = iZzs & i10;
            switch (iZzr) {
                case 0:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzf(i14, zzho.zza(obj, j4));
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 1:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzo(i14, zzho.zzb(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 2:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzt(i14, unsafe.getLong(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 3:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzK(i14, unsafe.getLong(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 4:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzr(i14, unsafe.getInt(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 5:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzm(i14, unsafe.getLong(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 6:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzk(i14, unsafe.getInt(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 7:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzb(i14, zzho.zzw(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 8:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzO(i14, unsafe.getObject(obj, j4), zzhuVar);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 9:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzv(i14, unsafe.getObject(obj, j4), zzgoVar.zzv(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 10:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzd(i14, (zzei) unsafe.getObject(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 11:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzI(i14, unsafe.getInt(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 12:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzi(i14, unsafe.getInt(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 13:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzx(i14, unsafe.getInt(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 14:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzz(i14, unsafe.getLong(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 15:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzB(i14, unsafe.getInt(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 16:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzD(i14, unsafe.getLong(obj, j4));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 17:
                    if (zzgoVar.zzJ(obj, i12, i11, i13, i)) {
                        zzhuVar.zzq(i14, unsafe.getObject(obj, j4), zzgoVar.zzv(i12));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 18:
                    zzgx.zzr(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 19:
                    zzgx.zzv(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 20:
                    zzgx.zzx(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    zzgx.zzD(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 22:
                    zzgx.zzw(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 23:
                    zzgx.zzu(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 24:
                    zzgx.zzt(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 25:
                    zzgx.zzq(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 26:
                    int i17 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j4);
                    int i18 = zzgx.zza;
                    if (list != null && !list.isEmpty()) {
                        zzhuVar.zzH(i17, list);
                    }
                    break;
                case 27:
                    int i19 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j4);
                    zzgv zzgvVarZzv = zzgoVar.zzv(i12);
                    int i20 = zzgx.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i21 = 0; i21 < list2.size(); i21++) {
                            ((zzeq) zzhuVar).zzv(i19, list2.get(i21), zzgvVarZzv);
                        }
                    }
                    break;
                case 28:
                    int i22 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j4);
                    int i23 = zzgx.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzhuVar.zze(i22, list3);
                    }
                    break;
                case 29:
                    zzgx.zzC(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 30:
                    zzgx.zzs(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 31:
                    zzgx.zzy(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    zzgx.zzz(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 33:
                    zzgx.zzA(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 34:
                    zzgx.zzB(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, false);
                    continue;
                    i12 += 3;
                    i10 = 1048575;
                    zzgoVar = this;
                    break;
                case 35:
                    zzgx.zzr(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 36:
                    zzgx.zzv(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 37:
                    zzgx.zzx(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 38:
                    zzgx.zzD(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 39:
                    zzgx.zzw(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 40:
                    zzgx.zzu(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 41:
                    zzgx.zzt(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 42:
                    zzgx.zzq(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 43:
                    zzgx.zzC(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 44:
                    zzgx.zzs(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 45:
                    zzgx.zzy(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 46:
                    zzgx.zzz(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 47:
                    zzgx.zzA(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 48:
                    zzgx.zzB(iArr[i12], (List) unsafe.getObject(obj, j4), zzhuVar, true);
                    break;
                case 49:
                    int i24 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j4);
                    zzgv zzgvVarZzv2 = zzgoVar.zzv(i12);
                    int i25 = zzgx.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            ((zzeq) zzhuVar).zzq(i24, list4.get(i26), zzgvVarZzv2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j4) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzf(i14, zzm(obj, j4));
                    }
                    break;
                case 52:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzo(i14, zzn(obj, j4));
                    }
                    break;
                case 53:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzt(i14, zzt(obj, j4));
                    }
                    break;
                case 54:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzK(i14, zzt(obj, j4));
                    }
                    break;
                case 55:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzr(i14, zzo(obj, j4));
                    }
                    break;
                case 56:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzm(i14, zzt(obj, j4));
                    }
                    break;
                case 57:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzk(i14, zzo(obj, j4));
                    }
                    break;
                case 58:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzb(i14, zzN(obj, j4));
                    }
                    break;
                case 59:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzO(i14, unsafe.getObject(obj, j4), zzhuVar);
                    }
                    break;
                case 60:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzv(i14, unsafe.getObject(obj, j4), zzgoVar.zzv(i12));
                    }
                    break;
                case 61:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzd(i14, (zzei) unsafe.getObject(obj, j4));
                    }
                    break;
                case 62:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzI(i14, zzo(obj, j4));
                    }
                    break;
                case 63:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzi(i14, zzo(obj, j4));
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzx(i14, zzo(obj, j4));
                    }
                    break;
                case 65:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzz(i14, zzt(obj, j4));
                    }
                    break;
                case 66:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzB(i14, zzo(obj, j4));
                    }
                    break;
                case 67:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzD(i14, zzt(obj, j4));
                    }
                    break;
                case 68:
                    if (zzgoVar.zzM(obj, i14, i12)) {
                        zzhuVar.zzq(i14, unsafe.getObject(obj, j4), zzgoVar.zzv(i12));
                    }
                    break;
            }
            i12 += 3;
            i10 = 1048575;
            zzgoVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzfi) obj).zzc.zzl(zzhuVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j4 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzho.zza(obj, j4)) != Double.doubleToLongBits(zzho.zza(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzho.zzb(obj, j4)) != Float.floatToIntBits(zzho.zzb(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzho.zzd(obj, j4) != zzho.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzho.zzd(obj, j4) != zzho.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzho.zzc(obj, j4) != zzho.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzho.zzd(obj, j4) != zzho.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzho.zzc(obj, j4) != zzho.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzho.zzw(obj, j4) != zzho.zzw(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zzgx.zzE(zzho.zzf(obj, j4), zzho.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zzgx.zzE(zzho.zzf(obj, j4), zzho.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zzgx.zzE(zzho.zzf(obj, j4), zzho.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzho.zzc(obj, j4) != zzho.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzho.zzc(obj, j4) != zzho.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzho.zzc(obj, j4) != zzho.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzho.zzd(obj, j4) != zzho.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzho.zzc(obj, j4) != zzho.zzc(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzho.zzd(obj, j4) != zzho.zzd(obj2, j4)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zzgx.zzE(zzho.zzf(obj, j4), zzho.zzf(obj2, j4))) {
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
                    zZzE = zzgx.zzE(zzho.zzf(obj, j4), zzho.zzf(obj2, j4));
                    break;
                case 50:
                    zZzE = zzgx.zzE(zzho.zzf(obj, j4), zzho.zzf(obj2, j4));
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
                    long jZzp = zzp(i) & 1048575;
                    if (zzho.zzc(obj, jZzp) != zzho.zzc(obj2, jZzp) || !zzgx.zzE(zzho.zzf(obj, j4), zzho.zzf(obj2, j4))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzfi) obj).zzc.equals(((zzfi) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzff) obj).zzb.equals(((zzff) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean zzk(Object obj) {
        int i;
        int i10;
        List list;
        zzgv zzgvVarZzv;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i13];
            int i16 = iArr2[i15];
            int iZzs = zzs(i15);
            int i17 = iArr2[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = zzb.getInt(obj, i18);
                }
                i10 = i12;
                i = i18;
            } else {
                int i20 = i12;
                i = i14;
                i10 = i20;
            }
            if ((268435456 & iZzs) != 0 && !zzJ(obj, i15, i, i10, i19)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj, i15, i, i10, i19) && !zzK(obj, iZzs, zzv(i15))) {
                    return false;
                }
            } else if (iZzr == 27) {
                list = (List) zzho.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgvVarZzv = zzv(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!zzgvVarZzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj, i16, i15) && !zzK(obj, iZzs, zzv(i15))) {
                    return false;
                }
            } else if (iZzr == 49) {
                list = (List) zzho.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    zzgvVarZzv = zzv(i15);
                    while (i11 < list.size()) {
                        if (!zzgvVarZzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzr == 50 && !((zzgf) zzho.zzf(obj, iZzs & 1048575)).isEmpty()) {
                throw null;
            }
            i13++;
            i14 = i;
            i12 = i10;
        }
        return !this.zzh || ((zzff) obj).zzb.zzi();
    }
}
