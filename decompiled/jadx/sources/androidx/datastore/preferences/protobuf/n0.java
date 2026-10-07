package androidx.datastore.preferences.protobuf;

import androidx.webkit.TracingConfig;
import com.google.android.gms.internal.ads.zzbbs;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements v0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f672o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f673p = n1.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f677d;
    public final a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f679g;
    public final int[] h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p0 f681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f1 f683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j0 f684n;

    public n0(int[] iArr, Object[] objArr, int i, int i10, a aVar, boolean z4, int[] iArr2, int i11, int i12, p0 p0Var, d0 d0Var, f1 f1Var, m mVar, j0 j0Var) {
        this.f674a = iArr;
        this.f675b = objArr;
        this.f676c = i;
        this.f677d = i10;
        this.f678f = aVar instanceof t;
        this.f679g = z4;
        this.h = iArr2;
        this.i = i11;
        this.f680j = i12;
        this.f681k = p0Var;
        this.f682l = d0Var;
        this.f683m = f1Var;
        this.e = aVar;
        this.f684n = j0Var;
    }

    public static long A(long j4, Object obj) {
        return ((Long) n1.f688d.i(j4, obj)).longValue();
    }

    public static Field D(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbN = q1.a.n("Field ", str, " for ");
            sbN.append(cls.getName());
            sbN.append(" not found. Known fields are ");
            sbN.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbN.toString());
        }
    }

    public static int G(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void K(int i, Object obj, f0 f0Var) throws IOException {
        if (!(obj instanceof String)) {
            f0Var.a(i, (f) obj);
        } else {
            ((j) f0Var.f636a).P(i, (String) obj);
        }
    }

    public static List s(long j4, Object obj) {
        return (List) n1.f688d.i(j4, obj);
    }

    public static n0 w(u0 u0Var, p0 p0Var, d0 d0Var, f1 f1Var, m mVar, j0 j0Var) {
        if (u0Var instanceof u0) {
            return x(u0Var, p0Var, d0Var, f1Var, mVar, j0Var);
        }
        u0Var.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0283  */
    /* JADX WARN: Code duplicated, block: B:127:0x0287  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:166:0x035b  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ad  */
    public static n0 x(u0 u0Var, p0 p0Var, d0 d0Var, f1 f1Var, m mVar, j0 j0Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i10;
        int i11;
        int[] iArr;
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
        int[] iArr2;
        int i23;
        int i24;
        int i25;
        int i26;
        int iObjectFieldOffset;
        int i27;
        int i28;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        Field fieldD;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field fieldD2;
        int i34;
        Object obj2;
        Field fieldD3;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        char cCharAt14;
        int i40 = 0;
        boolean z4 = (u0Var.f719d & 1) != 1;
        String str = u0Var.f717b;
        int length = str.length();
        int iCharAt3 = str.charAt(0);
        if (iCharAt3 >= 55296) {
            int i41 = iCharAt3 & 8191;
            int i42 = 1;
            int i43 = 13;
            while (true) {
                i = i42 + 1;
                cCharAt14 = str.charAt(i42);
                if (cCharAt14 < 55296) {
                    break;
                }
                i41 |= (cCharAt14 & 8191) << i43;
                i43 += 13;
                i42 = i;
            }
            iCharAt3 = i41 | (cCharAt14 << i43);
        } else {
            i = 1;
        }
        int i44 = i + 1;
        int iCharAt4 = str.charAt(i);
        if (iCharAt4 >= 55296) {
            int i45 = iCharAt4 & 8191;
            int i46 = 13;
            while (true) {
                i39 = i44 + 1;
                cCharAt13 = str.charAt(i44);
                if (cCharAt13 < 55296) {
                    break;
                }
                i45 |= (cCharAt13 & 8191) << i46;
                i46 += 13;
                i44 = i39;
            }
            iCharAt4 = i45 | (cCharAt13 << i46);
            i44 = i39;
        }
        if (iCharAt4 == 0) {
            i12 = 0;
            i14 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            iArr = f672o;
            i13 = 0;
        } else {
            int i47 = i44 + 1;
            int iCharAt5 = str.charAt(i44);
            if (iCharAt5 >= 55296) {
                int i48 = iCharAt5 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    cCharAt8 = str.charAt(i47);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                iCharAt5 = i48 | (cCharAt8 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int iCharAt6 = str.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    cCharAt7 = str.charAt(i50);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                iCharAt6 = i51 | (cCharAt7 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    cCharAt6 = str.charAt(i53);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                iCharAt7 = i54 | (cCharAt6 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            int iCharAt8 = str.charAt(i53);
            if (iCharAt8 >= 55296) {
                int i57 = iCharAt8 & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    cCharAt5 = str.charAt(i56);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                iCharAt8 = i57 | (cCharAt5 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            iCharAt = str.charAt(i56);
            if (iCharAt >= 55296) {
                int i60 = iCharAt & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    cCharAt4 = str.charAt(i59);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                iCharAt = i60 | (cCharAt4 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            iCharAt2 = str.charAt(i59);
            if (iCharAt2 >= 55296) {
                int i63 = iCharAt2 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    cCharAt3 = str.charAt(i62);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                iCharAt2 = i63 | (cCharAt3 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int iCharAt9 = str.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i16 = i67 + 1;
                    cCharAt2 = str.charAt(i67);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt2 & 8191) << i68;
                    i68 += 13;
                    i67 = i16;
                }
                iCharAt9 = i66 | (cCharAt2 << i68);
                i10 = i16;
            } else {
                i10 = i65;
            }
            int i69 = i10 + 1;
            int iCharAt10 = str.charAt(i10);
            if (iCharAt10 >= 55296) {
                int i70 = iCharAt10 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i15 = i71 + 1;
                    cCharAt = str.charAt(i71);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i70 |= (cCharAt & 8191) << i72;
                    i72 += 13;
                    i71 = i15;
                }
                iCharAt10 = i70 | (cCharAt << i72);
                i69 = i15;
            }
            int[] iArr3 = new int[iCharAt10 + iCharAt2 + iCharAt9];
            i11 = (iCharAt5 * 2) + iCharAt6;
            int i73 = iCharAt7;
            iArr = iArr3;
            i12 = i73;
            i13 = iCharAt8;
            i14 = iCharAt10;
            i40 = iCharAt5;
            i44 = i69;
        }
        Unsafe unsafe = f673p;
        Object[] objArr = u0Var.f718c;
        int i74 = i40;
        Class<?> cls = u0Var.f716a.getClass();
        int i75 = iCharAt3;
        int[] iArr4 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i76 = iCharAt2 + i14;
        int i77 = i14;
        int i78 = i76;
        int i79 = 0;
        int i80 = 0;
        while (i44 < length) {
            int i81 = i44 + 1;
            int iCharAt11 = str.charAt(i44);
            int i82 = length;
            if (iCharAt11 >= 55296) {
                int i83 = iCharAt11 & 8191;
                int i84 = i81;
                int i85 = 13;
                while (true) {
                    i38 = i84 + 1;
                    cCharAt12 = str.charAt(i84);
                    iArr2 = iArr4;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i83 |= (cCharAt12 & 8191) << i85;
                    i85 += 13;
                    i84 = i38;
                    iArr4 = iArr2;
                }
                iCharAt11 = i83 | (cCharAt12 << i85);
                i23 = i38;
            } else {
                iArr2 = iArr4;
                i23 = i81;
            }
            int i86 = i23 + 1;
            int iCharAt12 = str.charAt(i23);
            if (iCharAt12 >= 55296) {
                int i87 = iCharAt12 & 8191;
                int i88 = i86;
                int i89 = 13;
                while (true) {
                    i36 = i88 + 1;
                    cCharAt11 = str.charAt(i88);
                    i37 = i87;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i87 = i37 | ((cCharAt11 & 8191) << i89);
                    i89 += 13;
                    i88 = i36;
                }
                iCharAt12 = i37 | (cCharAt11 << i89);
                i24 = i36;
            } else {
                i24 = i86;
            }
            int i90 = i12;
            int i91 = iCharAt12 & 255;
            Object[] objArr3 = objArr;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i79] = i80;
                i79++;
            }
            int i92 = iCharAt11;
            if (i91 >= 51) {
                int i93 = i24 + 1;
                int iCharAt13 = str.charAt(i24);
                char c10 = 55296;
                if (iCharAt13 >= 55296) {
                    int i94 = iCharAt13 & 8191;
                    int i95 = 13;
                    while (true) {
                        i35 = i93 + 1;
                        cCharAt10 = str.charAt(i93);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i94 |= (cCharAt10 & 8191) << i95;
                        i95 += 13;
                        i93 = i35;
                        c10 = 55296;
                    }
                    iCharAt13 = i94 | (cCharAt10 << i95);
                    i93 = i35;
                }
                int i96 = i91 - 51;
                int i97 = iCharAt13;
                if (i96 == 9 || i96 == 17) {
                    i32 = i11 + 1;
                    objArr2[((i80 / 3) * 2) + 1] = objArr3[i11];
                } else {
                    if (i96 == 12 && (i75 & 1) == 1) {
                        i32 = i11 + 1;
                        objArr2[((i80 / 3) * 2) + 1] = objArr3[i11];
                    }
                    i33 = i97 * 2;
                    obj = objArr3[i33];
                    if (obj instanceof Field) {
                        fieldD2 = (Field) obj;
                    } else {
                        fieldD2 = D(cls, (String) obj);
                        objArr3[i33] = fieldD2;
                    }
                    int i98 = i93;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldD2);
                    i34 = i33 + 1;
                    obj2 = objArr3[i34];
                    if (obj2 instanceof Field) {
                        fieldD3 = (Field) obj2;
                    } else {
                        fieldD3 = D(cls, (String) obj2);
                        objArr3[i34] = fieldD3;
                    }
                    int i99 = i11;
                    z4 = z4;
                    i29 = i99;
                    i44 = i98;
                    i30 = iObjectFieldOffset3;
                    i25 = i13;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD3);
                    i28 = 0;
                }
                i11 = i32;
                i33 = i97 * 2;
                obj = objArr3[i33];
                if (obj instanceof Field) {
                    fieldD2 = (Field) obj;
                } else {
                    fieldD2 = D(cls, (String) obj);
                    objArr3[i33] = fieldD2;
                }
                int i910 = i93;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldD2);
                i34 = i33 + 1;
                obj2 = objArr3[i34];
                if (obj2 instanceof Field) {
                    fieldD3 = (Field) obj2;
                } else {
                    fieldD3 = D(cls, (String) obj2);
                    objArr3[i34] = fieldD3;
                }
                int i911 = i11;
                z4 = z4;
                i29 = i911;
                i44 = i910;
                i30 = iObjectFieldOffset4;
                i25 = i13;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD3);
                i28 = 0;
            } else {
                int i100 = i11 + 1;
                Field fieldD4 = D(cls, (String) objArr3[i11]);
                if (i91 == 9 || i91 == 17) {
                    i25 = i13;
                    objArr2[((i80 / 3) * 2) + 1] = fieldD4.getType();
                } else {
                    if (i91 == 27 || i91 == 49) {
                        i25 = i13;
                        i31 = i11 + 2;
                        objArr2[((i80 / 3) * 2) + 1] = objArr3[i100];
                    } else if (i91 == 12 || i91 == 30 || i91 == 44) {
                        i25 = i13;
                        if ((i75 & 1) == 1) {
                            i31 = i11 + 2;
                            objArr2[((i80 / 3) * 2) + 1] = objArr3[i100];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                        if ((i75 & 1) == 1 || i91 > 17) {
                            i27 = i24;
                            i28 = 0;
                            iObjectFieldOffset2 = 0;
                        } else {
                            int i101 = i24 + 1;
                            int iCharAt14 = str.charAt(i24);
                            if (iCharAt14 >= 55296) {
                                int i102 = iCharAt14 & 8191;
                                int i103 = 13;
                                while (true) {
                                    i27 = i101 + 1;
                                    cCharAt9 = str.charAt(i101);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i102 |= (cCharAt9 & 8191) << i103;
                                    i103 += 13;
                                    i101 = i27;
                                }
                                iCharAt14 = i102 | (cCharAt9 << i103);
                            } else {
                                i27 = i101;
                            }
                            int i104 = (iCharAt14 / 32) + (i74 * 2);
                            Object obj3 = objArr3[i104];
                            if (obj3 instanceof Field) {
                                fieldD = (Field) obj3;
                            } else {
                                fieldD = D(cls, (String) obj3);
                                objArr3[i104] = fieldD;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD);
                            i28 = iCharAt14 % 32;
                        }
                        if (i91 >= 18 && i91 <= 49) {
                            iArr[i78] = iObjectFieldOffset;
                            i78++;
                        }
                        i29 = i26;
                        i30 = iObjectFieldOffset;
                        i44 = i27;
                    } else {
                        if (i91 == 50) {
                            int i105 = i77 + 1;
                            iArr[i77] = i80;
                            int i106 = (i80 / 3) * 2;
                            int i107 = i11 + 2;
                            objArr2[i106] = objArr3[i100];
                            if ((iCharAt12 & 2048) != 0) {
                                i26 = i11 + 3;
                                objArr2[i106 + 1] = objArr3[i107];
                                i25 = i13;
                                i77 = i105;
                            } else {
                                i26 = i107;
                                i77 = i105;
                                i25 = i13;
                            }
                        } else {
                            i25 = i13;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                        if ((i75 & 1) == 1) {
                            i27 = i24;
                            i28 = 0;
                            iObjectFieldOffset2 = 0;
                        } else {
                            i27 = i24;
                            i28 = 0;
                            iObjectFieldOffset2 = 0;
                        }
                        if (i91 >= 18) {
                            iArr[i78] = iObjectFieldOffset;
                            i78++;
                        }
                        i29 = i26;
                        i30 = iObjectFieldOffset;
                        i44 = i27;
                    }
                    i26 = i31;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                    if ((i75 & 1) == 1) {
                        i27 = i24;
                        i28 = 0;
                        iObjectFieldOffset2 = 0;
                    } else {
                        i27 = i24;
                        i28 = 0;
                        iObjectFieldOffset2 = 0;
                    }
                    if (i91 >= 18) {
                        iArr[i78] = iObjectFieldOffset;
                        i78++;
                    }
                    i29 = i26;
                    i30 = iObjectFieldOffset;
                    i44 = i27;
                }
                i26 = i100;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                if ((i75 & 1) == 1) {
                    i27 = i24;
                    i28 = 0;
                    iObjectFieldOffset2 = 0;
                } else {
                    i27 = i24;
                    i28 = 0;
                    iObjectFieldOffset2 = 0;
                }
                if (i91 >= 18) {
                    iArr[i78] = iObjectFieldOffset;
                    i78++;
                }
                i29 = i26;
                i30 = iObjectFieldOffset;
                i44 = i27;
            }
            int i108 = i80 + 1;
            iArr2[i80] = i92;
            int i109 = i80 + 2;
            String str2 = str;
            iArr2[i108] = ((iCharAt12 & 512) != 0 ? 536870912 : 0) | ((iCharAt12 & 256) != 0 ? 268435456 : 0) | (i91 << 20) | i30;
            i80 += 3;
            iArr2[i109] = (i28 << 20) | iObjectFieldOffset2;
            boolean z10 = z4;
            i11 = i29;
            z4 = z10;
            i12 = i90;
            length = i82;
            objArr = objArr3;
            iArr4 = iArr2;
            i13 = i25;
            str = str2;
        }
        return new n0(iArr4, objArr2, i12, i13, u0Var.f716a, z4, iArr, i14, i76, p0Var, d0Var, f1Var, mVar, j0Var);
    }

    public static long y(int i) {
        return i & 1048575;
    }

    public static int z(long j4, Object obj) {
        return ((Integer) n1.f688d.i(j4, obj)).intValue();
    }

    public final void B(Object obj, int i, h hVar, v0 v0Var, l lVar) throws w {
        int iZ;
        List listC = this.f682l.c(i & 1048575, obj);
        g gVar = (g) hVar.f651d;
        int i10 = hVar.f648a;
        if ((i10 & 7) != 2) {
            throw x.b();
        }
        do {
            listC.add(hVar.B(v0Var, lVar));
            if (gVar.c() || hVar.f650c != 0) {
                return;
            } else {
                iZ = gVar.z();
            }
        } while (iZ == i10);
        hVar.f650c = iZ;
    }

    public final void C(Object obj, int i, h hVar) {
        if ((536870912 & i) != 0) {
            n1.o(obj, i & 1048575, hVar.N());
        } else if (this.f678f) {
            n1.o(obj, i & 1048575, hVar.L());
        } else {
            n1.o(obj, i & 1048575, hVar.h());
        }
    }

    public final void E(int i, Object obj) {
        if (this.f679g) {
            return;
        }
        int i10 = this.f674a[i + 2];
        long j4 = i10 & 1048575;
        n1.m(obj, j4, n1.f688d.g(j4, obj) | (1 << (i10 >>> 20)));
    }

    public final void F(Object obj, int i, int i10) {
        n1.m(obj, this.f674a[i10 + 2] & 1048575, i);
    }

    public final int H(int i) {
        return this.f674a[i + 1];
    }

    public final void I(Object obj, f0 f0Var) throws IOException {
        int i;
        int i10;
        int i11;
        boolean z4;
        int[] iArr = this.f674a;
        int length = iArr.length;
        Unsafe unsafe = f673p;
        int i12 = -1;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14 = i11 + 3) {
            int iH = H(i14);
            int i15 = iArr[i14];
            int iG = G(iH);
            if (this.f679g || iG > 17) {
                i = 1048575;
                i10 = 0;
            } else {
                int i16 = iArr[i14 + 2];
                i = 1048575;
                int i17 = i16 & 1048575;
                if (i17 != i12) {
                    i13 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            }
            long j4 = iH & i;
            switch (iG) {
                case 0:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        double dE = n1.f688d.e(j4, obj);
                        j jVar = (j) f0Var.f636a;
                        jVar.getClass();
                        jVar.K(i15, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        float f10 = n1.f688d.f(j4, obj);
                        j jVar2 = (j) f0Var.f636a;
                        jVar2.getClass();
                        jVar2.I(i15, Float.floatToRawIntBits(f10));
                    }
                    break;
                case 2:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((j) f0Var.f636a).U(i15, unsafe.getLong(obj, j4));
                    }
                    break;
                case 3:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((j) f0Var.f636a).U(i15, unsafe.getLong(obj, j4));
                    }
                    break;
                case 4:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((j) f0Var.f636a).M(i15, unsafe.getInt(obj, j4));
                    }
                    break;
                case 5:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((j) f0Var.f636a).K(i15, unsafe.getLong(obj, j4));
                    }
                    break;
                case 6:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((j) f0Var.f636a).I(i15, unsafe.getInt(obj, j4));
                    }
                    break;
                case 7:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((j) f0Var.f636a).F(i15, n1.f688d.c(j4, obj));
                    }
                    break;
                case 8:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        K(i15, unsafe.getObject(obj, j4), f0Var);
                    }
                    break;
                case 9:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((j) f0Var.f636a).O(i15, (a) unsafe.getObject(obj, j4), n(i11));
                    }
                    break;
                case 10:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        f0Var.a(i15, (f) unsafe.getObject(obj, j4));
                    }
                    break;
                case 11:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((j) f0Var.f636a).S(i15, unsafe.getInt(obj, j4));
                    }
                    break;
                case 12:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((j) f0Var.f636a).M(i15, unsafe.getInt(obj, j4));
                    }
                    break;
                case 13:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((j) f0Var.f636a).I(i15, unsafe.getInt(obj, j4));
                    }
                    break;
                case 14:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        ((j) f0Var.f636a).K(i15, unsafe.getLong(obj, j4));
                    }
                    break;
                case 15:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        int i18 = unsafe.getInt(obj, j4);
                        ((j) f0Var.f636a).S(i15, (i18 >> 31) ^ (i18 << 1));
                    }
                    break;
                case 16:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        long j10 = unsafe.getLong(obj, j4);
                        ((j) f0Var.f636a).U(i15, (j10 >> 63) ^ (j10 << 1));
                    }
                    break;
                case 17:
                    i11 = i14;
                    if ((i10 & i13) != 0) {
                        f0Var.b(i15, unsafe.getObject(obj, j4), n(i11));
                    }
                    break;
                case 18:
                    i11 = i14;
                    w0.A(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case 19:
                    i11 = i14;
                    w0.E(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case 20:
                    i11 = i14;
                    w0.H(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    i11 = i14;
                    w0.P(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case 22:
                    i11 = i14;
                    w0.G(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case 23:
                    i11 = i14;
                    w0.D(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case 24:
                    i11 = i14;
                    w0.C(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case 25:
                    i11 = i14;
                    w0.y(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case 26:
                    i11 = i14;
                    w0.N(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var);
                    break;
                case 27:
                    i11 = i14;
                    w0.I(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, n(i11));
                    break;
                case 28:
                    i11 = i14;
                    w0.z(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var);
                    break;
                case 29:
                    i11 = i14;
                    z4 = false;
                    w0.O(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case 30:
                    i11 = i14;
                    z4 = false;
                    w0.B(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case 31:
                    i11 = i14;
                    z4 = false;
                    w0.J(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    i11 = i14;
                    z4 = false;
                    w0.K(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case 33:
                    i11 = i14;
                    z4 = false;
                    w0.L(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case 34:
                    i11 = i14;
                    z4 = false;
                    w0.M(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, false);
                    break;
                case 35:
                    i11 = i14;
                    w0.A(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 36:
                    i11 = i14;
                    w0.E(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 37:
                    i11 = i14;
                    w0.H(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 38:
                    i11 = i14;
                    w0.P(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 39:
                    i11 = i14;
                    w0.G(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 40:
                    i11 = i14;
                    w0.D(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 41:
                    i11 = i14;
                    w0.C(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 42:
                    i11 = i14;
                    w0.y(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 43:
                    i11 = i14;
                    w0.O(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 44:
                    i11 = i14;
                    w0.B(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 45:
                    i11 = i14;
                    w0.J(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 46:
                    i11 = i14;
                    w0.K(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 47:
                    i11 = i14;
                    w0.L(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 48:
                    i11 = i14;
                    w0.M(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, true);
                    break;
                case 49:
                    i11 = i14;
                    w0.F(iArr[i11], (List) unsafe.getObject(obj, j4), f0Var, n(i11));
                    break;
                case 50:
                    i11 = i14;
                    J(f0Var, i15, unsafe.getObject(obj, j4), i11);
                    break;
                case 51:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        double dDoubleValue = ((Double) n1.f688d.i(j4, obj)).doubleValue();
                        j jVar3 = (j) f0Var.f636a;
                        jVar3.getClass();
                        jVar3.K(i15, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        float fFloatValue = ((Float) n1.f688d.i(j4, obj)).floatValue();
                        j jVar4 = (j) f0Var.f636a;
                        jVar4.getClass();
                        jVar4.I(i15, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        ((j) f0Var.f636a).U(i15, A(j4, obj));
                    }
                    break;
                case 54:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        ((j) f0Var.f636a).U(i15, A(j4, obj));
                    }
                    break;
                case 55:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        ((j) f0Var.f636a).M(i15, z(j4, obj));
                    }
                    break;
                case 56:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        ((j) f0Var.f636a).K(i15, A(j4, obj));
                    }
                    break;
                case 57:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        ((j) f0Var.f636a).I(i15, z(j4, obj));
                    }
                    break;
                case 58:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        ((j) f0Var.f636a).F(i15, ((Boolean) n1.f688d.i(j4, obj)).booleanValue());
                    }
                    break;
                case 59:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        K(i15, unsafe.getObject(obj, j4), f0Var);
                    }
                    break;
                case 60:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        ((j) f0Var.f636a).O(i15, (a) unsafe.getObject(obj, j4), n(i11));
                    }
                    break;
                case 61:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        f0Var.a(i15, (f) unsafe.getObject(obj, j4));
                    }
                    break;
                case 62:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        ((j) f0Var.f636a).S(i15, z(j4, obj));
                    }
                    break;
                case 63:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        ((j) f0Var.f636a).M(i15, z(j4, obj));
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        ((j) f0Var.f636a).I(i15, z(j4, obj));
                    }
                    break;
                case 65:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        ((j) f0Var.f636a).K(i15, A(j4, obj));
                    }
                    break;
                case 66:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        int iZ = z(j4, obj);
                        ((j) f0Var.f636a).S(i15, (iZ >> 31) ^ (iZ << 1));
                    }
                    break;
                case 67:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        long jA = A(j4, obj);
                        ((j) f0Var.f636a).U(i15, (jA >> 63) ^ (jA << 1));
                    }
                    break;
                case 68:
                    i11 = i14;
                    if (r(obj, i15, i11)) {
                        f0Var.b(i15, unsafe.getObject(obj, j4), n(i11));
                    }
                    break;
                default:
                    i11 = i14;
                    break;
            }
        }
        this.f683m.getClass();
        ((t) obj).unknownFields.d(f0Var);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x013f  */
    /* JADX WARN: Code duplicated, block: B:48:0x014e  */
    /* JADX WARN: Code duplicated, block: B:49:0x015e  */
    /* JADX WARN: Code duplicated, block: B:50:0x016f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0176  */
    /* JADX WARN: Code duplicated, block: B:53:0x017f  */
    /* JADX WARN: Code duplicated, block: B:54:0x018b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0197  */
    /* JADX WARN: Code duplicated, block: B:57:0x019b  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0203  */
    /* JADX WARN: Code duplicated, block: B:72:0x020e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0215  */
    /* JADX WARN: Code duplicated, block: B:78:0x0148 A[SYNTHETIC] */
    public final void J(f0 f0Var, int i, Object obj, int i10) throws IOException {
        int iA;
        int size;
        int iZ;
        int i11;
        int iY;
        int size2;
        int iZ2;
        if (obj != null) {
            Object objM = m(i10);
            this.f684n.getClass();
            g0 g0Var = ((h0) objM).f652a;
            v1 v1Var = g0Var.f645b;
            v1 v1Var2 = g0Var.f644a;
            j jVar = (j) f0Var.f636a;
            jVar.getClass();
            for (Map.Entry entry : ((i0) obj).entrySet()) {
                jVar.R(i, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i12 = o.f691c;
                int iY2 = j.y(1);
                s1 s1Var = v1.f723d;
                if (v1Var2 == s1Var) {
                    iY2 *= 2;
                }
                int iA2 = 8;
                switch (v1Var2.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        iA = 8;
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key2);
                                o.b(jVar, v1Var, 2, value2);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key3 = entry.getKey();
                                Object value3 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key3);
                                o.b(jVar, v1Var, 2, value3);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key4 = entry.getKey();
                                Object value4 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key4);
                                o.b(jVar, v1Var, 2, value4);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key5 = entry.getKey();
                                Object value5 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key5);
                                o.b(jVar, v1Var, 2, value5);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key6 = entry.getKey();
                                Object value6 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key6);
                                o.b(jVar, v1Var, 2, value6);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key7 = entry.getKey();
                                Object value7 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key7);
                                o.b(jVar, v1Var, 2, value7);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key8 = entry.getKey();
                                Object value8 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key8);
                                o.b(jVar, v1Var, 2, value8);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key9 = entry.getKey();
                                Object value9 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key9);
                                o.b(jVar, v1Var, 2, value9);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key10 = entry.getKey();
                                Object value10 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key10);
                                o.b(jVar, v1Var, 2, value10);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key11 = entry.getKey();
                                Object value11 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11);
                                o.b(jVar, v1Var, 2, value11);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key12 = entry.getKey();
                                Object value12 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key12);
                                o.b(jVar, v1Var, 2, value12);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key13 = entry.getKey();
                                Object value13 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key13);
                                o.b(jVar, v1Var, 2, value13);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key14 = entry.getKey();
                                Object value14 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key14);
                                o.b(jVar, v1Var, 2, value14);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key15 = entry.getKey();
                                Object value15 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key15);
                                o.b(jVar, v1Var, 2, value15);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key16 = entry.getKey();
                                Object value16 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key16);
                                o.b(jVar, v1Var, 2, value16);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key17 = entry.getKey();
                                Object value17 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key17);
                                o.b(jVar, v1Var, 2, value17);
                                break;
                            case 16:
                                int iIntValue = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue >> 31) ^ (iIntValue << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key18 = entry.getKey();
                                Object value18 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key18);
                                o.b(jVar, v1Var, 2, value18);
                                break;
                            case 17:
                                long jLongValue = ((Long) value).longValue();
                                iA2 = j.A((jLongValue >> 63) ^ (jLongValue << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key19 = entry.getKey();
                                Object value19 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key19);
                                o.b(jVar, v1Var, 2, value19);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 1:
                        ((Float) key).getClass();
                        iA = 4;
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key110 = entry.getKey();
                                Object value110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key110);
                                o.b(jVar, v1Var, 2, value110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111 = entry.getKey();
                                Object value111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111);
                                o.b(jVar, v1Var, 2, value111);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key112 = entry.getKey();
                                Object value112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key112);
                                o.b(jVar, v1Var, 2, value112);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key113 = entry.getKey();
                                Object value113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key113);
                                o.b(jVar, v1Var, 2, value113);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key114 = entry.getKey();
                                Object value114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key114);
                                o.b(jVar, v1Var, 2, value114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key115 = entry.getKey();
                                Object value115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key115);
                                o.b(jVar, v1Var, 2, value115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key116 = entry.getKey();
                                Object value116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key116);
                                o.b(jVar, v1Var, 2, value116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key117 = entry.getKey();
                                Object value117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key117);
                                o.b(jVar, v1Var, 2, value117);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key118 = entry.getKey();
                                Object value118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key118);
                                o.b(jVar, v1Var, 2, value118);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key119 = entry.getKey();
                                Object value119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key119);
                                o.b(jVar, v1Var, 2, value119);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1110 = entry.getKey();
                                Object value1110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1110);
                                o.b(jVar, v1Var, 2, value1110);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111 = entry.getKey();
                                Object value1111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111);
                                o.b(jVar, v1Var, 2, value1111);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1112 = entry.getKey();
                                Object value1112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1112);
                                o.b(jVar, v1Var, 2, value1112);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1113 = entry.getKey();
                                Object value1113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1113);
                                o.b(jVar, v1Var, 2, value1113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1114 = entry.getKey();
                                Object value1114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1114);
                                o.b(jVar, v1Var, 2, value1114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1115 = entry.getKey();
                                Object value1115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1115);
                                o.b(jVar, v1Var, 2, value1115);
                                break;
                            case 16:
                                int iIntValue2 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1116 = entry.getKey();
                                Object value1116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1116);
                                o.b(jVar, v1Var, 2, value1116);
                                break;
                            case 17:
                                long jLongValue2 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1117 = entry.getKey();
                                Object value1117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1117);
                                o.b(jVar, v1Var, 2, value1117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 2:
                        iA = j.A(((Long) key).longValue());
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1118 = entry.getKey();
                                Object value1118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1118);
                                o.b(jVar, v1Var, 2, value1118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1119 = entry.getKey();
                                Object value1119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1119);
                                o.b(jVar, v1Var, 2, value1119);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11110 = entry.getKey();
                                Object value11110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11110);
                                o.b(jVar, v1Var, 2, value11110);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111 = entry.getKey();
                                Object value11111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111);
                                o.b(jVar, v1Var, 2, value11111);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11112 = entry.getKey();
                                Object value11112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11112);
                                o.b(jVar, v1Var, 2, value11112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11113 = entry.getKey();
                                Object value11113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11113);
                                o.b(jVar, v1Var, 2, value11113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11114 = entry.getKey();
                                Object value11114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11114);
                                o.b(jVar, v1Var, 2, value11114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key11115 = entry.getKey();
                                Object value11115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11115);
                                o.b(jVar, v1Var, 2, value11115);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key11116 = entry.getKey();
                                Object value11116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11116);
                                o.b(jVar, v1Var, 2, value11116);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key11117 = entry.getKey();
                                Object value11117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11117);
                                o.b(jVar, v1Var, 2, value11117);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11118 = entry.getKey();
                                Object value11118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11118);
                                o.b(jVar, v1Var, 2, value11118);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11119 = entry.getKey();
                                Object value11119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11119);
                                o.b(jVar, v1Var, 2, value11119);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111110 = entry.getKey();
                                Object value111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111110);
                                o.b(jVar, v1Var, 2, value111110);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111 = entry.getKey();
                                Object value111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111);
                                o.b(jVar, v1Var, 2, value111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111112 = entry.getKey();
                                Object value111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111112);
                                o.b(jVar, v1Var, 2, value111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111113 = entry.getKey();
                                Object value111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111113);
                                o.b(jVar, v1Var, 2, value111113);
                                break;
                            case 16:
                                int iIntValue3 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key111114 = entry.getKey();
                                Object value111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111114);
                                o.b(jVar, v1Var, 2, value111114);
                                break;
                            case 17:
                                long jLongValue3 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key111115 = entry.getKey();
                                Object value111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111115);
                                o.b(jVar, v1Var, 2, value111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 3:
                        iA = j.A(((Long) key).longValue());
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111116 = entry.getKey();
                                Object value111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111116);
                                o.b(jVar, v1Var, 2, value111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111117 = entry.getKey();
                                Object value111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111117);
                                o.b(jVar, v1Var, 2, value111117);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111118 = entry.getKey();
                                Object value111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111118);
                                o.b(jVar, v1Var, 2, value111118);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111119 = entry.getKey();
                                Object value111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111119);
                                o.b(jVar, v1Var, 2, value111119);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111110 = entry.getKey();
                                Object value1111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111110);
                                o.b(jVar, v1Var, 2, value1111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111 = entry.getKey();
                                Object value1111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111);
                                o.b(jVar, v1Var, 2, value1111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111112 = entry.getKey();
                                Object value1111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111112);
                                o.b(jVar, v1Var, 2, value1111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key1111113 = entry.getKey();
                                Object value1111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111113);
                                o.b(jVar, v1Var, 2, value1111113);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key1111114 = entry.getKey();
                                Object value1111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111114);
                                o.b(jVar, v1Var, 2, value1111114);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key1111115 = entry.getKey();
                                Object value1111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111115);
                                o.b(jVar, v1Var, 2, value1111115);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111116 = entry.getKey();
                                Object value1111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111116);
                                o.b(jVar, v1Var, 2, value1111116);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111117 = entry.getKey();
                                Object value1111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111117);
                                o.b(jVar, v1Var, 2, value1111117);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111118 = entry.getKey();
                                Object value1111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111118);
                                o.b(jVar, v1Var, 2, value1111118);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111119 = entry.getKey();
                                Object value1111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111119);
                                o.b(jVar, v1Var, 2, value1111119);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11111110 = entry.getKey();
                                Object value11111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111110);
                                o.b(jVar, v1Var, 2, value11111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111 = entry.getKey();
                                Object value11111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111);
                                o.b(jVar, v1Var, 2, value11111111);
                                break;
                            case 16:
                                int iIntValue4 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key11111112 = entry.getKey();
                                Object value11111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111112);
                                o.b(jVar, v1Var, 2, value11111112);
                                break;
                            case 17:
                                long jLongValue4 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key11111113 = entry.getKey();
                                Object value11111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111113);
                                o.b(jVar, v1Var, 2, value11111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 4:
                        iA = j.w(((Integer) key).intValue());
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111114 = entry.getKey();
                                Object value11111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111114);
                                o.b(jVar, v1Var, 2, value11111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11111115 = entry.getKey();
                                Object value11111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111115);
                                o.b(jVar, v1Var, 2, value11111115);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111116 = entry.getKey();
                                Object value11111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111116);
                                o.b(jVar, v1Var, 2, value11111116);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111117 = entry.getKey();
                                Object value11111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111117);
                                o.b(jVar, v1Var, 2, value11111117);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111118 = entry.getKey();
                                Object value11111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111118);
                                o.b(jVar, v1Var, 2, value11111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111119 = entry.getKey();
                                Object value11111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111119);
                                o.b(jVar, v1Var, 2, value11111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111110 = entry.getKey();
                                Object value111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111110);
                                o.b(jVar, v1Var, 2, value111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111 = entry.getKey();
                                Object value111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111);
                                o.b(jVar, v1Var, 2, value111111111);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key111111112 = entry.getKey();
                                Object value111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111112);
                                o.b(jVar, v1Var, 2, value111111112);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key111111113 = entry.getKey();
                                Object value111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111113);
                                o.b(jVar, v1Var, 2, value111111113);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key111111114 = entry.getKey();
                                Object value111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111114);
                                o.b(jVar, v1Var, 2, value111111114);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key111111115 = entry.getKey();
                                Object value111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111115);
                                o.b(jVar, v1Var, 2, value111111115);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111116 = entry.getKey();
                                Object value111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111116);
                                o.b(jVar, v1Var, 2, value111111116);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111117 = entry.getKey();
                                Object value111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111117);
                                o.b(jVar, v1Var, 2, value111111117);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111118 = entry.getKey();
                                Object value111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111118);
                                o.b(jVar, v1Var, 2, value111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111119 = entry.getKey();
                                Object value111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111119);
                                o.b(jVar, v1Var, 2, value111111119);
                                break;
                            case 16:
                                int iIntValue5 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1111111110 = entry.getKey();
                                Object value1111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111110);
                                o.b(jVar, v1Var, 2, value1111111110);
                                break;
                            case 17:
                                long jLongValue5 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111 = entry.getKey();
                                Object value1111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111);
                                o.b(jVar, v1Var, 2, value1111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 5:
                        ((Long) key).getClass();
                        iA = 8;
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111112 = entry.getKey();
                                Object value1111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111112);
                                o.b(jVar, v1Var, 2, value1111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111113 = entry.getKey();
                                Object value1111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111113);
                                o.b(jVar, v1Var, 2, value1111111113);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111114 = entry.getKey();
                                Object value1111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111114);
                                o.b(jVar, v1Var, 2, value1111111114);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111115 = entry.getKey();
                                Object value1111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111115);
                                o.b(jVar, v1Var, 2, value1111111115);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111116 = entry.getKey();
                                Object value1111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111116);
                                o.b(jVar, v1Var, 2, value1111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111117 = entry.getKey();
                                Object value1111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111117);
                                o.b(jVar, v1Var, 2, value1111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111118 = entry.getKey();
                                Object value1111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111118);
                                o.b(jVar, v1Var, 2, value1111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111119 = entry.getKey();
                                Object value1111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111119);
                                o.b(jVar, v1Var, 2, value1111111119);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key11111111110 = entry.getKey();
                                Object value11111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111110);
                                o.b(jVar, v1Var, 2, value11111111110);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111 = entry.getKey();
                                Object value11111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111);
                                o.b(jVar, v1Var, 2, value11111111111);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111112 = entry.getKey();
                                Object value11111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111112);
                                o.b(jVar, v1Var, 2, value11111111112);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111113 = entry.getKey();
                                Object value11111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111113);
                                o.b(jVar, v1Var, 2, value11111111113);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111114 = entry.getKey();
                                Object value11111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111114);
                                o.b(jVar, v1Var, 2, value11111111114);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111115 = entry.getKey();
                                Object value11111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111115);
                                o.b(jVar, v1Var, 2, value11111111115);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111116 = entry.getKey();
                                Object value11111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111116);
                                o.b(jVar, v1Var, 2, value11111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111117 = entry.getKey();
                                Object value11111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111117);
                                o.b(jVar, v1Var, 2, value11111111117);
                                break;
                            case 16:
                                int iIntValue6 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key11111111118 = entry.getKey();
                                Object value11111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111118);
                                o.b(jVar, v1Var, 2, value11111111118);
                                break;
                            case 17:
                                long jLongValue6 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key11111111119 = entry.getKey();
                                Object value11111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111119);
                                o.b(jVar, v1Var, 2, value11111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 6:
                        ((Integer) key).getClass();
                        iA = 4;
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111110 = entry.getKey();
                                Object value111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111110);
                                o.b(jVar, v1Var, 2, value111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111 = entry.getKey();
                                Object value111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111);
                                o.b(jVar, v1Var, 2, value111111111111);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111112 = entry.getKey();
                                Object value111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111112);
                                o.b(jVar, v1Var, 2, value111111111112);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111113 = entry.getKey();
                                Object value111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111113);
                                o.b(jVar, v1Var, 2, value111111111113);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111114 = entry.getKey();
                                Object value111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111114);
                                o.b(jVar, v1Var, 2, value111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111115 = entry.getKey();
                                Object value111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111115);
                                o.b(jVar, v1Var, 2, value111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111116 = entry.getKey();
                                Object value111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111116);
                                o.b(jVar, v1Var, 2, value111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111117 = entry.getKey();
                                Object value111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111117);
                                o.b(jVar, v1Var, 2, value111111111117);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key111111111118 = entry.getKey();
                                Object value111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111118);
                                o.b(jVar, v1Var, 2, value111111111118);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111119 = entry.getKey();
                                Object value111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111119);
                                o.b(jVar, v1Var, 2, value111111111119);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111110 = entry.getKey();
                                Object value1111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111110);
                                o.b(jVar, v1Var, 2, value1111111111110);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111 = entry.getKey();
                                Object value1111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111);
                                o.b(jVar, v1Var, 2, value1111111111111);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111112 = entry.getKey();
                                Object value1111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111112);
                                o.b(jVar, v1Var, 2, value1111111111112);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111113 = entry.getKey();
                                Object value1111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111113);
                                o.b(jVar, v1Var, 2, value1111111111113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111114 = entry.getKey();
                                Object value1111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111114);
                                o.b(jVar, v1Var, 2, value1111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111115 = entry.getKey();
                                Object value1111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111115);
                                o.b(jVar, v1Var, 2, value1111111111115);
                                break;
                            case 16:
                                int iIntValue7 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111116 = entry.getKey();
                                Object value1111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111116);
                                o.b(jVar, v1Var, 2, value1111111111116);
                                break;
                            case 17:
                                long jLongValue7 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111117 = entry.getKey();
                                Object value1111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111117);
                                o.b(jVar, v1Var, 2, value1111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 7:
                        ((Boolean) key).getClass();
                        iA = 1;
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111118 = entry.getKey();
                                Object value1111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111118);
                                o.b(jVar, v1Var, 2, value1111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111119 = entry.getKey();
                                Object value1111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111119);
                                o.b(jVar, v1Var, 2, value1111111111119);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111110 = entry.getKey();
                                Object value11111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111110);
                                o.b(jVar, v1Var, 2, value11111111111110);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111 = entry.getKey();
                                Object value11111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111);
                                o.b(jVar, v1Var, 2, value11111111111111);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111112 = entry.getKey();
                                Object value11111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111112);
                                o.b(jVar, v1Var, 2, value11111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111113 = entry.getKey();
                                Object value11111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111113);
                                o.b(jVar, v1Var, 2, value11111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111114 = entry.getKey();
                                Object value11111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111114);
                                o.b(jVar, v1Var, 2, value11111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111115 = entry.getKey();
                                Object value11111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111115);
                                o.b(jVar, v1Var, 2, value11111111111115);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111116 = entry.getKey();
                                Object value11111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111116);
                                o.b(jVar, v1Var, 2, value11111111111116);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111117 = entry.getKey();
                                Object value11111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111117);
                                o.b(jVar, v1Var, 2, value11111111111117);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111118 = entry.getKey();
                                Object value11111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111118);
                                o.b(jVar, v1Var, 2, value11111111111118);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111119 = entry.getKey();
                                Object value11111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111119);
                                o.b(jVar, v1Var, 2, value11111111111119);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111110 = entry.getKey();
                                Object value111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111110);
                                o.b(jVar, v1Var, 2, value111111111111110);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111 = entry.getKey();
                                Object value111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111);
                                o.b(jVar, v1Var, 2, value111111111111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111112 = entry.getKey();
                                Object value111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111112);
                                o.b(jVar, v1Var, 2, value111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111113 = entry.getKey();
                                Object value111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111113);
                                o.b(jVar, v1Var, 2, value111111111111113);
                                break;
                            case 16:
                                int iIntValue8 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111114 = entry.getKey();
                                Object value111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111114);
                                o.b(jVar, v1Var, 2, value111111111111114);
                                break;
                            case 17:
                                long jLongValue8 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111115 = entry.getKey();
                                Object value111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111115);
                                o.b(jVar, v1Var, 2, value111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 8:
                        if (key instanceof f) {
                            size = ((f) key).size();
                            iZ = j.z(size);
                            iA = size + iZ;
                        } else {
                            iA = j.x((String) key);
                        }
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111116 = entry.getKey();
                                Object value111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111116);
                                o.b(jVar, v1Var, 2, value111111111111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111117 = entry.getKey();
                                Object value111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111117);
                                o.b(jVar, v1Var, 2, value111111111111117);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111118 = entry.getKey();
                                Object value111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111118);
                                o.b(jVar, v1Var, 2, value111111111111118);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111119 = entry.getKey();
                                Object value111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111119);
                                o.b(jVar, v1Var, 2, value111111111111119);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111110 = entry.getKey();
                                Object value1111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111110);
                                o.b(jVar, v1Var, 2, value1111111111111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111 = entry.getKey();
                                Object value1111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111);
                                o.b(jVar, v1Var, 2, value1111111111111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111112 = entry.getKey();
                                Object value1111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111112);
                                o.b(jVar, v1Var, 2, value1111111111111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111113 = entry.getKey();
                                Object value1111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111113);
                                o.b(jVar, v1Var, 2, value1111111111111113);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111114 = entry.getKey();
                                Object value1111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111114);
                                o.b(jVar, v1Var, 2, value1111111111111114);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111115 = entry.getKey();
                                Object value1111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111115);
                                o.b(jVar, v1Var, 2, value1111111111111115);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111116 = entry.getKey();
                                Object value1111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111116);
                                o.b(jVar, v1Var, 2, value1111111111111116);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111117 = entry.getKey();
                                Object value1111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111117);
                                o.b(jVar, v1Var, 2, value1111111111111117);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111118 = entry.getKey();
                                Object value1111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111118);
                                o.b(jVar, v1Var, 2, value1111111111111118);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111119 = entry.getKey();
                                Object value1111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111119);
                                o.b(jVar, v1Var, 2, value1111111111111119);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111110 = entry.getKey();
                                Object value11111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111110);
                                o.b(jVar, v1Var, 2, value11111111111111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111 = entry.getKey();
                                Object value11111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111);
                                o.b(jVar, v1Var, 2, value11111111111111111);
                                break;
                            case 16:
                                int iIntValue9 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111112 = entry.getKey();
                                Object value11111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111112);
                                o.b(jVar, v1Var, 2, value11111111111111112);
                                break;
                            case 17:
                                long jLongValue9 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111113 = entry.getKey();
                                Object value11111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111113);
                                o.b(jVar, v1Var, 2, value11111111111111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 9:
                        iA = ((a) key).a();
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111114 = entry.getKey();
                                Object value11111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111114);
                                o.b(jVar, v1Var, 2, value11111111111111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111115 = entry.getKey();
                                Object value11111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111115);
                                o.b(jVar, v1Var, 2, value11111111111111115);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111116 = entry.getKey();
                                Object value11111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111116);
                                o.b(jVar, v1Var, 2, value11111111111111116);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111117 = entry.getKey();
                                Object value11111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111117);
                                o.b(jVar, v1Var, 2, value11111111111111117);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111118 = entry.getKey();
                                Object value11111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111118);
                                o.b(jVar, v1Var, 2, value11111111111111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111119 = entry.getKey();
                                Object value11111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111119);
                                o.b(jVar, v1Var, 2, value11111111111111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111110 = entry.getKey();
                                Object value111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111110);
                                o.b(jVar, v1Var, 2, value111111111111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111 = entry.getKey();
                                Object value111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111);
                                o.b(jVar, v1Var, 2, value111111111111111111);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111112 = entry.getKey();
                                Object value111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111112);
                                o.b(jVar, v1Var, 2, value111111111111111112);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111113 = entry.getKey();
                                Object value111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111113);
                                o.b(jVar, v1Var, 2, value111111111111111113);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111114 = entry.getKey();
                                Object value111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111114);
                                o.b(jVar, v1Var, 2, value111111111111111114);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111115 = entry.getKey();
                                Object value111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111115);
                                o.b(jVar, v1Var, 2, value111111111111111115);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111116 = entry.getKey();
                                Object value111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111116);
                                o.b(jVar, v1Var, 2, value111111111111111116);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111117 = entry.getKey();
                                Object value111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111117);
                                o.b(jVar, v1Var, 2, value111111111111111117);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111118 = entry.getKey();
                                Object value111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111118);
                                o.b(jVar, v1Var, 2, value111111111111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111119 = entry.getKey();
                                Object value111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111119);
                                o.b(jVar, v1Var, 2, value111111111111111119);
                                break;
                            case 16:
                                int iIntValue10 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111110 = entry.getKey();
                                Object value1111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111110);
                                o.b(jVar, v1Var, 2, value1111111111111111110);
                                break;
                            case 17:
                                long jLongValue10 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111 = entry.getKey();
                                Object value1111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111);
                                o.b(jVar, v1Var, 2, value1111111111111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 10:
                        size = ((a) key).a();
                        iZ = j.z(size);
                        iA = size + iZ;
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111112 = entry.getKey();
                                Object value1111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111112);
                                o.b(jVar, v1Var, 2, value1111111111111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111113 = entry.getKey();
                                Object value1111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111113);
                                o.b(jVar, v1Var, 2, value1111111111111111113);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111114 = entry.getKey();
                                Object value1111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111114);
                                o.b(jVar, v1Var, 2, value1111111111111111114);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111115 = entry.getKey();
                                Object value1111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111115);
                                o.b(jVar, v1Var, 2, value1111111111111111115);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111116 = entry.getKey();
                                Object value1111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111116);
                                o.b(jVar, v1Var, 2, value1111111111111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111117 = entry.getKey();
                                Object value1111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111117);
                                o.b(jVar, v1Var, 2, value1111111111111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111118 = entry.getKey();
                                Object value1111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111118);
                                o.b(jVar, v1Var, 2, value1111111111111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111119 = entry.getKey();
                                Object value1111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111119);
                                o.b(jVar, v1Var, 2, value1111111111111111119);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111110 = entry.getKey();
                                Object value11111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111110);
                                o.b(jVar, v1Var, 2, value11111111111111111110);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111 = entry.getKey();
                                Object value11111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111);
                                o.b(jVar, v1Var, 2, value11111111111111111111);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111112 = entry.getKey();
                                Object value11111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111112);
                                o.b(jVar, v1Var, 2, value11111111111111111112);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111113 = entry.getKey();
                                Object value11111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111113);
                                o.b(jVar, v1Var, 2, value11111111111111111113);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111114 = entry.getKey();
                                Object value11111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111114);
                                o.b(jVar, v1Var, 2, value11111111111111111114);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111115 = entry.getKey();
                                Object value11111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111115);
                                o.b(jVar, v1Var, 2, value11111111111111111115);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111116 = entry.getKey();
                                Object value11111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111116);
                                o.b(jVar, v1Var, 2, value11111111111111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111117 = entry.getKey();
                                Object value11111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111117);
                                o.b(jVar, v1Var, 2, value11111111111111111117);
                                break;
                            case 16:
                                int iIntValue11 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111118 = entry.getKey();
                                Object value11111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111118);
                                o.b(jVar, v1Var, 2, value11111111111111111118);
                                break;
                            case 17:
                                long jLongValue11 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111119 = entry.getKey();
                                Object value11111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111119);
                                o.b(jVar, v1Var, 2, value11111111111111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 11:
                        if (key instanceof f) {
                            size = ((f) key).size();
                            iZ = j.z(size);
                        } else {
                            size = ((byte[]) key).length;
                            iZ = j.z(size);
                        }
                        iA = size + iZ;
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111110 = entry.getKey();
                                Object value111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111110);
                                o.b(jVar, v1Var, 2, value111111111111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111 = entry.getKey();
                                Object value111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111);
                                o.b(jVar, v1Var, 2, value111111111111111111111);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111112 = entry.getKey();
                                Object value111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111112);
                                o.b(jVar, v1Var, 2, value111111111111111111112);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111113 = entry.getKey();
                                Object value111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111113);
                                o.b(jVar, v1Var, 2, value111111111111111111113);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111114 = entry.getKey();
                                Object value111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111114);
                                o.b(jVar, v1Var, 2, value111111111111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111115 = entry.getKey();
                                Object value111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111115);
                                o.b(jVar, v1Var, 2, value111111111111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111116 = entry.getKey();
                                Object value111111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111116);
                                o.b(jVar, v1Var, 2, value111111111111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111117 = entry.getKey();
                                Object value111111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111117);
                                o.b(jVar, v1Var, 2, value111111111111111111117);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111118 = entry.getKey();
                                Object value111111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111118);
                                o.b(jVar, v1Var, 2, value111111111111111111118);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111119 = entry.getKey();
                                Object value111111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111119);
                                o.b(jVar, v1Var, 2, value111111111111111111119);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111110 = entry.getKey();
                                Object value1111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111110);
                                o.b(jVar, v1Var, 2, value1111111111111111111110);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111);
                                o.b(jVar, v1Var, 2, value1111111111111111111111);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111112 = entry.getKey();
                                Object value1111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111112);
                                o.b(jVar, v1Var, 2, value1111111111111111111112);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111113 = entry.getKey();
                                Object value1111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111113);
                                o.b(jVar, v1Var, 2, value1111111111111111111113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111114 = entry.getKey();
                                Object value1111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111114);
                                o.b(jVar, v1Var, 2, value1111111111111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111115 = entry.getKey();
                                Object value1111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111115);
                                o.b(jVar, v1Var, 2, value1111111111111111111115);
                                break;
                            case 16:
                                int iIntValue12 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111116 = entry.getKey();
                                Object value1111111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111116);
                                o.b(jVar, v1Var, 2, value1111111111111111111116);
                                break;
                            case 17:
                                long jLongValue12 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111117 = entry.getKey();
                                Object value1111111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111117);
                                o.b(jVar, v1Var, 2, value1111111111111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 12:
                        iA = j.z(((Integer) key).intValue());
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111118 = entry.getKey();
                                Object value1111111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111118);
                                o.b(jVar, v1Var, 2, value1111111111111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111119 = entry.getKey();
                                Object value1111111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111119);
                                o.b(jVar, v1Var, 2, value1111111111111111111119);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111110 = entry.getKey();
                                Object value11111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111110);
                                o.b(jVar, v1Var, 2, value11111111111111111111110);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111);
                                o.b(jVar, v1Var, 2, value11111111111111111111111);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111112 = entry.getKey();
                                Object value11111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111112);
                                o.b(jVar, v1Var, 2, value11111111111111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111113 = entry.getKey();
                                Object value11111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111113);
                                o.b(jVar, v1Var, 2, value11111111111111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111114 = entry.getKey();
                                Object value11111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111114);
                                o.b(jVar, v1Var, 2, value11111111111111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111115 = entry.getKey();
                                Object value11111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111115);
                                o.b(jVar, v1Var, 2, value11111111111111111111115);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111116 = entry.getKey();
                                Object value11111111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111116);
                                o.b(jVar, v1Var, 2, value11111111111111111111116);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111117 = entry.getKey();
                                Object value11111111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111117);
                                o.b(jVar, v1Var, 2, value11111111111111111111117);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111118 = entry.getKey();
                                Object value11111111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111118);
                                o.b(jVar, v1Var, 2, value11111111111111111111118);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111119 = entry.getKey();
                                Object value11111111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111119);
                                o.b(jVar, v1Var, 2, value11111111111111111111119);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111110);
                                o.b(jVar, v1Var, 2, value111111111111111111111110);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111);
                                o.b(jVar, v1Var, 2, value111111111111111111111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111112);
                                o.b(jVar, v1Var, 2, value111111111111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111113);
                                o.b(jVar, v1Var, 2, value111111111111111111111113);
                                break;
                            case 16:
                                int iIntValue13 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111114);
                                o.b(jVar, v1Var, 2, value111111111111111111111114);
                                break;
                            case 17:
                                long jLongValue13 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111115);
                                o.b(jVar, v1Var, 2, value111111111111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 13:
                        iA = j.w(((Integer) key).intValue());
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111116);
                                o.b(jVar, v1Var, 2, value111111111111111111111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111117);
                                o.b(jVar, v1Var, 2, value111111111111111111111117);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111118);
                                o.b(jVar, v1Var, 2, value111111111111111111111118);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111119);
                                o.b(jVar, v1Var, 2, value111111111111111111111119);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111110);
                                o.b(jVar, v1Var, 2, value1111111111111111111111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111112);
                                o.b(jVar, v1Var, 2, value1111111111111111111111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111113);
                                o.b(jVar, v1Var, 2, value1111111111111111111111113);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111114);
                                o.b(jVar, v1Var, 2, value1111111111111111111111114);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111115);
                                o.b(jVar, v1Var, 2, value1111111111111111111111115);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111116);
                                o.b(jVar, v1Var, 2, value1111111111111111111111116);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111117);
                                o.b(jVar, v1Var, 2, value1111111111111111111111117);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111118);
                                o.b(jVar, v1Var, 2, value1111111111111111111111118);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111119);
                                o.b(jVar, v1Var, 2, value1111111111111111111111119);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111110);
                                o.b(jVar, v1Var, 2, value11111111111111111111111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111);
                                break;
                            case 16:
                                int iIntValue14 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111112);
                                o.b(jVar, v1Var, 2, value11111111111111111111111112);
                                break;
                            case 17:
                                long jLongValue14 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111113);
                                o.b(jVar, v1Var, 2, value11111111111111111111111113);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 14:
                        ((Integer) key).getClass();
                        iA = 4;
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111114);
                                o.b(jVar, v1Var, 2, value11111111111111111111111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111115);
                                o.b(jVar, v1Var, 2, value11111111111111111111111115);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111116);
                                o.b(jVar, v1Var, 2, value11111111111111111111111116);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111117);
                                o.b(jVar, v1Var, 2, value11111111111111111111111117);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111118);
                                o.b(jVar, v1Var, 2, value11111111111111111111111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111119);
                                o.b(jVar, v1Var, 2, value11111111111111111111111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111110);
                                o.b(jVar, v1Var, 2, value111111111111111111111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111112);
                                o.b(jVar, v1Var, 2, value111111111111111111111111112);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111113);
                                o.b(jVar, v1Var, 2, value111111111111111111111111113);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111114);
                                o.b(jVar, v1Var, 2, value111111111111111111111111114);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111115);
                                o.b(jVar, v1Var, 2, value111111111111111111111111115);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111116);
                                o.b(jVar, v1Var, 2, value111111111111111111111111116);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111117);
                                o.b(jVar, v1Var, 2, value111111111111111111111111117);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111118);
                                o.b(jVar, v1Var, 2, value111111111111111111111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111119);
                                o.b(jVar, v1Var, 2, value111111111111111111111111119);
                                break;
                            case 16:
                                int iIntValue15 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111110);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111110);
                                break;
                            case 17:
                                long jLongValue15 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111111);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111111);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 15:
                        ((Long) key).getClass();
                        iA = 8;
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111112);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111113);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111113);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111114);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111114);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111115);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111115);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111116);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111117);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111118);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111119);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111119);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111110);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111110);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111111);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111111);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111112);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111112);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111113);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111113);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111114);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111114);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111115);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111115);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111116);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111117);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111117);
                                break;
                            case 16:
                                int iIntValue16 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111118);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111118);
                                break;
                            case 17:
                                long jLongValue16 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111119);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111119);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 16:
                        int iIntValue17 = ((Integer) key).intValue();
                        iA = j.z((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111110);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111111);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111111);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111112);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111112);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111113);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111113);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111114);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111115);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111116);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111117);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111117);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111118);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111118);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111119);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111119);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111111110);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111111110);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111111111);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111111111);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111111112);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111111112);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111111113);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111111113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111111114);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111111115);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111111115);
                                break;
                            case 16:
                                int iIntValue18 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111111116);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111111116);
                                break;
                            case 17:
                                long jLongValue17 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111111117);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111111117);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    case 17:
                        long jLongValue18 = ((Long) key).longValue();
                        iA = j.A((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                        i11 = iA + iY2;
                        iY = j.y(2);
                        if (v1Var == s1Var) {
                            iY *= 2;
                        }
                        switch (v1Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111111118);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key1111111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key1111111111111111111111111111119);
                                o.b(jVar, v1Var, 2, value1111111111111111111111111111119);
                                break;
                            case 2:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111111110);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111111110);
                                break;
                            case 3:
                                iA2 = j.A(((Long) value).longValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111111111);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111111111);
                                break;
                            case 4:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111111112);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111111113);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111111114);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iA2 = 1;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111111115);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111111115);
                                break;
                            case 8:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                    iA2 = iZ2 + size2;
                                } else {
                                    iA2 = j.x((String) value);
                                }
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111111116 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111111116);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111111116);
                                break;
                            case 9:
                                iA2 = ((a) value).a();
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111111117 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111111117);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111111117);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iZ2 = j.z(size2);
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111111118 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111111118);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111111118);
                                break;
                            case 11:
                                if (value instanceof f) {
                                    size2 = ((f) value).size();
                                    iZ2 = j.z(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iZ2 = j.z(size2);
                                }
                                iA2 = iZ2 + size2;
                                jVar.T(iA2 + iY + i11);
                                Object key11111111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111111119 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key11111111111111111111111111111119);
                                o.b(jVar, v1Var, 2, value11111111111111111111111111111119);
                                break;
                            case 12:
                                iA2 = j.z(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111111110 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111111110);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111111110);
                                break;
                            case 13:
                                iA2 = j.w(((Integer) value).intValue());
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111111 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111111111);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iA2 = 4;
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111111112 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111111112);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111111113 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111111113);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111111113);
                                break;
                            case 16:
                                int iIntValue19 = ((Integer) value).intValue();
                                iA2 = j.z((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111111114 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111111114);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111111114);
                                break;
                            case 17:
                                long jLongValue19 = ((Long) value).longValue();
                                iA2 = j.A((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                                jVar.T(iA2 + iY + i11);
                                Object key111111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111111115 = entry.getValue();
                                o.b(jVar, v1Var2, 1, key111111111111111111111111111111115);
                                o.b(jVar, v1Var, 2, value111111111111111111111111111111115);
                                break;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                        break;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void a(Object obj, f0 f0Var) throws IOException {
        f0Var.getClass();
        j jVar = (j) f0Var.f636a;
        if (!this.f679g) {
            I(obj, f0Var);
            return;
        }
        int[] iArr = this.f674a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iH = H(i);
            int i10 = iArr[i];
            switch (G(iH)) {
                case 0:
                    if (q(i, obj)) {
                        double dE = n1.f688d.e(iH & 1048575, obj);
                        jVar.getClass();
                        jVar.K(i10, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    if (q(i, obj)) {
                        float f10 = n1.f688d.f(iH & 1048575, obj);
                        jVar.getClass();
                        jVar.I(i10, Float.floatToRawIntBits(f10));
                    }
                    break;
                case 2:
                    if (q(i, obj)) {
                        jVar.U(i10, n1.f688d.h(iH & 1048575, obj));
                    }
                    break;
                case 3:
                    if (q(i, obj)) {
                        jVar.U(i10, n1.f688d.h(iH & 1048575, obj));
                    }
                    break;
                case 4:
                    if (q(i, obj)) {
                        jVar.M(i10, n1.f688d.g(iH & 1048575, obj));
                    }
                    break;
                case 5:
                    if (q(i, obj)) {
                        jVar.K(i10, n1.f688d.h(iH & 1048575, obj));
                    }
                    break;
                case 6:
                    if (q(i, obj)) {
                        jVar.I(i10, n1.f688d.g(iH & 1048575, obj));
                    }
                    break;
                case 7:
                    if (q(i, obj)) {
                        jVar.F(i10, n1.f688d.c(iH & 1048575, obj));
                    }
                    break;
                case 8:
                    if (q(i, obj)) {
                        K(i10, n1.f688d.i(iH & 1048575, obj), f0Var);
                    }
                    break;
                case 9:
                    if (q(i, obj)) {
                        jVar.O(i10, (a) n1.f688d.i(iH & 1048575, obj), n(i));
                    }
                    break;
                case 10:
                    if (q(i, obj)) {
                        f0Var.a(i10, (f) n1.f688d.i(iH & 1048575, obj));
                    }
                    break;
                case 11:
                    if (q(i, obj)) {
                        jVar.S(i10, n1.f688d.g(iH & 1048575, obj));
                    }
                    break;
                case 12:
                    if (q(i, obj)) {
                        jVar.M(i10, n1.f688d.g(iH & 1048575, obj));
                    }
                    break;
                case 13:
                    if (q(i, obj)) {
                        jVar.I(i10, n1.f688d.g(iH & 1048575, obj));
                    }
                    break;
                case 14:
                    if (q(i, obj)) {
                        jVar.K(i10, n1.f688d.h(iH & 1048575, obj));
                    }
                    break;
                case 15:
                    if (q(i, obj)) {
                        int iG = n1.f688d.g(iH & 1048575, obj);
                        jVar.S(i10, (iG >> 31) ^ (iG << 1));
                    }
                    break;
                case 16:
                    if (q(i, obj)) {
                        long jH = n1.f688d.h(iH & 1048575, obj);
                        jVar.U(i10, (jH >> 63) ^ (jH << 1));
                    }
                    break;
                case 17:
                    if (q(i, obj)) {
                        f0Var.b(i10, n1.f688d.i(iH & 1048575, obj), n(i));
                    }
                    break;
                case 18:
                    w0.A(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case 19:
                    w0.E(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case 20:
                    w0.H(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    w0.P(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case 22:
                    w0.G(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case 23:
                    w0.D(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case 24:
                    w0.C(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case 25:
                    w0.y(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case 26:
                    w0.N(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var);
                    break;
                case 27:
                    w0.I(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, n(i));
                    break;
                case 28:
                    w0.z(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var);
                    break;
                case 29:
                    w0.O(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case 30:
                    w0.B(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case 31:
                    w0.J(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    w0.K(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case 33:
                    w0.L(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case 34:
                    w0.M(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, false);
                    break;
                case 35:
                    w0.A(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 36:
                    w0.E(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 37:
                    w0.H(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 38:
                    w0.P(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 39:
                    w0.G(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 40:
                    w0.D(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 41:
                    w0.C(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 42:
                    w0.y(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 43:
                    w0.O(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 44:
                    w0.B(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 45:
                    w0.J(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 46:
                    w0.K(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 47:
                    w0.L(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 48:
                    w0.M(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, true);
                    break;
                case 49:
                    w0.F(iArr[i], (List) n1.f688d.i(iH & 1048575, obj), f0Var, n(i));
                    break;
                case 50:
                    J(f0Var, i10, n1.f688d.i(iH & 1048575, obj), i);
                    break;
                case 51:
                    if (r(obj, i10, i)) {
                        double dDoubleValue = ((Double) n1.f688d.i(iH & 1048575, obj)).doubleValue();
                        jVar.getClass();
                        jVar.K(i10, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (r(obj, i10, i)) {
                        float fFloatValue = ((Float) n1.f688d.i(iH & 1048575, obj)).floatValue();
                        jVar.getClass();
                        jVar.I(i10, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (r(obj, i10, i)) {
                        jVar.U(i10, A(iH & 1048575, obj));
                    }
                    break;
                case 54:
                    if (r(obj, i10, i)) {
                        jVar.U(i10, A(iH & 1048575, obj));
                    }
                    break;
                case 55:
                    if (r(obj, i10, i)) {
                        jVar.M(i10, z(iH & 1048575, obj));
                    }
                    break;
                case 56:
                    if (r(obj, i10, i)) {
                        jVar.K(i10, A(iH & 1048575, obj));
                    }
                    break;
                case 57:
                    if (r(obj, i10, i)) {
                        jVar.I(i10, z(iH & 1048575, obj));
                    }
                    break;
                case 58:
                    if (r(obj, i10, i)) {
                        jVar.F(i10, ((Boolean) n1.f688d.i(iH & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(obj, i10, i)) {
                        K(i10, n1.f688d.i(iH & 1048575, obj), f0Var);
                    }
                    break;
                case 60:
                    if (r(obj, i10, i)) {
                        jVar.O(i10, (a) n1.f688d.i(iH & 1048575, obj), n(i));
                    }
                    break;
                case 61:
                    if (r(obj, i10, i)) {
                        f0Var.a(i10, (f) n1.f688d.i(iH & 1048575, obj));
                    }
                    break;
                case 62:
                    if (r(obj, i10, i)) {
                        jVar.S(i10, z(iH & 1048575, obj));
                    }
                    break;
                case 63:
                    if (r(obj, i10, i)) {
                        jVar.M(i10, z(iH & 1048575, obj));
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (r(obj, i10, i)) {
                        jVar.I(i10, z(iH & 1048575, obj));
                    }
                    break;
                case 65:
                    if (r(obj, i10, i)) {
                        jVar.K(i10, A(iH & 1048575, obj));
                    }
                    break;
                case 66:
                    if (r(obj, i10, i)) {
                        int iZ = z(iH & 1048575, obj);
                        jVar.S(i10, (iZ >> 31) ^ (iZ << 1));
                    }
                    break;
                case 67:
                    if (r(obj, i10, i)) {
                        long jA = A(iH & 1048575, obj);
                        jVar.U(i10, (jA >> 63) ^ (jA << 1));
                    }
                    break;
                case 68:
                    if (r(obj, i10, i)) {
                        f0Var.b(i10, n1.f688d.i(iH & 1048575, obj), n(i));
                    }
                    break;
            }
        }
        this.f683m.getClass();
        ((t) obj).unknownFields.d(f0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final void b(Object obj) {
        int[] iArr;
        int i;
        int i10 = this.i;
        while (true) {
            iArr = this.h;
            i = this.f680j;
            if (i10 >= i) {
                break;
            }
            long jH = H(iArr[i10]) & 1048575;
            Object objI = n1.f688d.i(jH, obj);
            if (objI != null) {
                this.f684n.getClass();
                ((i0) objI).f655a = false;
                n1.o(obj, jH, objI);
            }
            i10++;
        }
        int length = iArr.length;
        while (i < length) {
            this.f682l.a(iArr[i], obj);
            i++;
        }
        this.f683m.getClass();
        ((t) obj).unknownFields.e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final int c(a aVar) {
        return this.f679g ? p(aVar) : o(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:71:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0123 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.v0
    public final boolean d(Object obj) {
        int i;
        int iG;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean zQ = true;
            if (i11 >= this.i) {
                return true;
            }
            int i13 = this.h[i11];
            int[] iArr = this.f674a;
            int i14 = iArr[i13];
            int iH = H(i13);
            boolean z4 = this.f679g;
            if (z4) {
                i = 0;
            } else {
                int i15 = iArr[i13 + 2];
                int i16 = i15 & 1048575;
                i = 1 << (i15 >>> 20);
                if (i16 != i10) {
                    i12 = f673p.getInt(obj, i16);
                    i10 = i16;
                }
            }
            if ((268435456 & iH) == 0) {
                iG = G(iH);
                if (iG != 9 || iG == 17) {
                    if (z4) {
                        zQ = q(i13, obj);
                    } else if ((i & i12) == 0) {
                        zQ = false;
                    }
                    if (zQ) {
                        continue;
                    } else if (!n(i13).d(n1.f688d.i(iH & 1048575, obj))) {
                    }
                    i11++;
                } else {
                    if (iG != 27) {
                        if (iG == 60 || iG == 68) {
                            if (!r(obj, i14, i13)) {
                                continue;
                            } else if (!n(i13).d(n1.f688d.i(iH & 1048575, obj))) {
                            }
                            i11++;
                        } else if (iG != 49) {
                            if (iG != 50) {
                                continue;
                            } else {
                                Object objI = n1.f688d.i(iH & 1048575, obj);
                                this.f684n.getClass();
                                i0 i0Var = (i0) objI;
                                if (!i0Var.isEmpty() && ((h0) m(i13)).f652a.f645b.f725a == w1.f738t) {
                                    v0 v0VarA = null;
                                    for (Object obj2 : i0Var.values()) {
                                        if (v0VarA == null) {
                                            v0VarA = s0.f710c.a(obj2.getClass());
                                        }
                                        if (!v0VarA.d(obj2)) {
                                        }
                                    }
                                }
                            }
                            i11++;
                        }
                    }
                    List list = (List) n1.f688d.i(iH & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        v0 v0VarN = n(i13);
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            if (v0VarN.d(list.get(i17))) {
                            }
                        }
                    }
                    i11++;
                }
            } else {
                if (z4 ? q(i13, obj) : (i12 & i) != 0) {
                    iG = G(iH);
                    if (iG != 9) {
                    }
                    if (z4) {
                        zQ = q(i13, obj);
                    } else if ((i & i12) == 0) {
                        zQ = false;
                    }
                    if (zQ) {
                        continue;
                    } else if (!n(i13).d(n1.f688d.i(iH & 1048575, obj))) {
                    }
                    i11++;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    @Override // androidx.datastore.preferences.protobuf.v0
    public final void e(t tVar, t tVar2) {
        t tVar3;
        tVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f674a;
            if (i >= iArr.length) {
                t tVar4 = tVar;
                if (this.f679g) {
                    return;
                }
                w0.w(this.f683m, tVar4, tVar2);
                return;
            }
            int iH = H(i);
            long j4 = 1048575 & iH;
            int i10 = iArr[i];
            switch (G(iH)) {
                case 0:
                    if (!q(i, tVar2)) {
                        tVar3 = tVar;
                    } else {
                        m1 m1Var = n1.f688d;
                        tVar3 = tVar;
                        m1Var.m(tVar3, j4, m1Var.e(j4, tVar2));
                        E(i, tVar3);
                    }
                    break;
                case 1:
                    if (q(i, tVar2)) {
                        m1 m1Var2 = n1.f688d;
                        m1Var2.n(tVar, j4, m1Var2.f(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 2:
                    if (q(i, tVar2)) {
                        n1.n(tVar, j4, n1.f688d.h(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 3:
                    if (q(i, tVar2)) {
                        n1.n(tVar, j4, n1.f688d.h(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 4:
                    if (q(i, tVar2)) {
                        n1.m(tVar, j4, n1.f688d.g(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 5:
                    if (q(i, tVar2)) {
                        n1.n(tVar, j4, n1.f688d.h(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 6:
                    if (q(i, tVar2)) {
                        n1.m(tVar, j4, n1.f688d.g(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 7:
                    if (q(i, tVar2)) {
                        m1 m1Var3 = n1.f688d;
                        m1Var3.k(tVar, j4, m1Var3.c(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 8:
                    if (q(i, tVar2)) {
                        n1.o(tVar, j4, n1.f688d.i(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 9:
                    u(i, tVar, tVar2);
                    tVar3 = tVar;
                    break;
                case 10:
                    if (q(i, tVar2)) {
                        n1.o(tVar, j4, n1.f688d.i(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 11:
                    if (q(i, tVar2)) {
                        n1.m(tVar, j4, n1.f688d.g(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 12:
                    if (q(i, tVar2)) {
                        n1.m(tVar, j4, n1.f688d.g(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 13:
                    if (q(i, tVar2)) {
                        n1.m(tVar, j4, n1.f688d.g(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 14:
                    if (q(i, tVar2)) {
                        n1.n(tVar, j4, n1.f688d.h(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 15:
                    if (q(i, tVar2)) {
                        n1.m(tVar, j4, n1.f688d.g(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 16:
                    if (q(i, tVar2)) {
                        n1.n(tVar, j4, n1.f688d.h(j4, tVar2));
                        E(i, tVar);
                    }
                    tVar3 = tVar;
                    break;
                case 17:
                    u(i, tVar, tVar2);
                    tVar3 = tVar;
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
                    this.f682l.b(tVar, j4, tVar2);
                    tVar3 = tVar;
                    break;
                case 50:
                    Class cls = w0.f727a;
                    m1 m1Var4 = n1.f688d;
                    Object objI = m1Var4.i(j4, tVar);
                    Object objI2 = m1Var4.i(j4, tVar2);
                    this.f684n.getClass();
                    n1.o(tVar, j4, j0.b(objI, objI2));
                    tVar3 = tVar;
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
                    if (r(tVar2, i10, i)) {
                        n1.o(tVar, j4, n1.f688d.i(j4, tVar2));
                        F(tVar, i10, i);
                    }
                    tVar3 = tVar;
                    break;
                case 60:
                    v(i, tVar, tVar2);
                    tVar3 = tVar;
                    break;
                case 61:
                case 62:
                case 63:
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (r(tVar2, i10, i)) {
                        n1.o(tVar, j4, n1.f688d.i(j4, tVar2));
                        F(tVar, i10, i);
                    }
                    tVar3 = tVar;
                    break;
                case 68:
                    v(i, tVar, tVar2);
                    tVar3 = tVar;
                    break;
                default:
                    tVar3 = tVar;
                    break;
            }
            i += 3;
            tVar = tVar3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.v0
    public final int f(t tVar) {
        int i;
        int iB;
        int i10;
        int[] iArr = this.f674a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iH = H(i12);
            int i13 = iArr[i12];
            long j4 = 1048575 & iH;
            int i14 = 1237;
            int iHashCode = 37;
            switch (G(iH)) {
                case 0:
                    i = i11 * 53;
                    iB = v.b(Double.doubleToLongBits(n1.f688d.e(j4, tVar)));
                    i11 = iB + i;
                    break;
                case 1:
                    i = i11 * 53;
                    iB = Float.floatToIntBits(n1.f688d.f(j4, tVar));
                    i11 = iB + i;
                    break;
                case 2:
                    i = i11 * 53;
                    iB = v.b(n1.f688d.h(j4, tVar));
                    i11 = iB + i;
                    break;
                case 3:
                    i = i11 * 53;
                    iB = v.b(n1.f688d.h(j4, tVar));
                    i11 = iB + i;
                    break;
                case 4:
                    i = i11 * 53;
                    iB = n1.f688d.g(j4, tVar);
                    i11 = iB + i;
                    break;
                case 5:
                    i = i11 * 53;
                    iB = v.b(n1.f688d.h(j4, tVar));
                    i11 = iB + i;
                    break;
                case 6:
                    i = i11 * 53;
                    iB = n1.f688d.g(j4, tVar);
                    i11 = iB + i;
                    break;
                case 7:
                    i10 = i11 * 53;
                    boolean zC = n1.f688d.c(j4, tVar);
                    Charset charset = v.f720a;
                    if (zC) {
                        i14 = 1231;
                    }
                    i11 = i14 + i10;
                    break;
                case 8:
                    i = i11 * 53;
                    iB = ((String) n1.f688d.i(j4, tVar)).hashCode();
                    i11 = iB + i;
                    break;
                case 9:
                    Object objI = n1.f688d.i(j4, tVar);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i = i11 * 53;
                    iB = n1.f688d.i(j4, tVar).hashCode();
                    i11 = iB + i;
                    break;
                case 11:
                    i = i11 * 53;
                    iB = n1.f688d.g(j4, tVar);
                    i11 = iB + i;
                    break;
                case 12:
                    i = i11 * 53;
                    iB = n1.f688d.g(j4, tVar);
                    i11 = iB + i;
                    break;
                case 13:
                    i = i11 * 53;
                    iB = n1.f688d.g(j4, tVar);
                    i11 = iB + i;
                    break;
                case 14:
                    i = i11 * 53;
                    iB = v.b(n1.f688d.h(j4, tVar));
                    i11 = iB + i;
                    break;
                case 15:
                    i = i11 * 53;
                    iB = n1.f688d.g(j4, tVar);
                    i11 = iB + i;
                    break;
                case 16:
                    i = i11 * 53;
                    iB = v.b(n1.f688d.h(j4, tVar));
                    i11 = iB + i;
                    break;
                case 17:
                    Object objI2 = n1.f688d.i(j4, tVar);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
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
                    iB = n1.f688d.i(j4, tVar).hashCode();
                    i11 = iB + i;
                    break;
                case 50:
                    i = i11 * 53;
                    iB = n1.f688d.i(j4, tVar).hashCode();
                    i11 = iB + i;
                    break;
                case 51:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = v.b(Double.doubleToLongBits(((Double) n1.f688d.i(j4, tVar)).doubleValue()));
                        i11 = iB + i;
                    }
                    break;
                case 52:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = Float.floatToIntBits(((Float) n1.f688d.i(j4, tVar)).floatValue());
                        i11 = iB + i;
                    }
                    break;
                case 53:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = v.b(A(j4, tVar));
                        i11 = iB + i;
                    }
                    break;
                case 54:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = v.b(A(j4, tVar));
                        i11 = iB + i;
                    }
                    break;
                case 55:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = z(j4, tVar);
                        i11 = iB + i;
                    }
                    break;
                case 56:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = v.b(A(j4, tVar));
                        i11 = iB + i;
                    }
                    break;
                case 57:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = z(j4, tVar);
                        i11 = iB + i;
                    }
                    break;
                case 58:
                    if (r(tVar, i13, i12)) {
                        i10 = i11 * 53;
                        boolean zBooleanValue = ((Boolean) n1.f688d.i(j4, tVar)).booleanValue();
                        Charset charset2 = v.f720a;
                        if (zBooleanValue) {
                            i14 = 1231;
                        }
                        i11 = i14 + i10;
                    }
                    break;
                case 59:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = ((String) n1.f688d.i(j4, tVar)).hashCode();
                        i11 = iB + i;
                    }
                    break;
                case 60:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = n1.f688d.i(j4, tVar).hashCode();
                        i11 = iB + i;
                    }
                    break;
                case 61:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = n1.f688d.i(j4, tVar).hashCode();
                        i11 = iB + i;
                    }
                    break;
                case 62:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = z(j4, tVar);
                        i11 = iB + i;
                    }
                    break;
                case 63:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = z(j4, tVar);
                        i11 = iB + i;
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = z(j4, tVar);
                        i11 = iB + i;
                    }
                    break;
                case 65:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = v.b(A(j4, tVar));
                        i11 = iB + i;
                    }
                    break;
                case 66:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = z(j4, tVar);
                        i11 = iB + i;
                    }
                    break;
                case 67:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = v.b(A(j4, tVar));
                        i11 = iB + i;
                    }
                    break;
                case 68:
                    if (r(tVar, i13, i12)) {
                        i = i11 * 53;
                        iB = n1.f688d.i(j4, tVar).hashCode();
                        i11 = iB + i;
                    }
                    break;
            }
        }
        this.f683m.getClass();
        return tVar.unknownFields.hashCode() + (i11 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.v0
    public final boolean g(t tVar, t tVar2) {
        int[] iArr = this.f674a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zX = true;
            if (i < length) {
                int iH = H(i);
                long j4 = iH & 1048575;
                switch (G(iH)) {
                    case 0:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var = n1.f688d;
                            if (Double.doubleToLongBits(m1Var.e(j4, tVar)) != Double.doubleToLongBits(m1Var.e(j4, tVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var2 = n1.f688d;
                            if (Float.floatToIntBits(m1Var2.f(j4, tVar)) != Float.floatToIntBits(m1Var2.f(j4, tVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var3 = n1.f688d;
                            if (m1Var3.h(j4, tVar) != m1Var3.h(j4, tVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var4 = n1.f688d;
                            if (m1Var4.h(j4, tVar) != m1Var4.h(j4, tVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var5 = n1.f688d;
                            if (m1Var5.g(j4, tVar) != m1Var5.g(j4, tVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var6 = n1.f688d;
                            if (m1Var6.h(j4, tVar) != m1Var6.h(j4, tVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var7 = n1.f688d;
                            if (m1Var7.g(j4, tVar) != m1Var7.g(j4, tVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var8 = n1.f688d;
                            if (m1Var8.c(j4, tVar) != m1Var8.c(j4, tVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var9 = n1.f688d;
                            if (!w0.x(m1Var9.i(j4, tVar), m1Var9.i(j4, tVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var10 = n1.f688d;
                            if (!w0.x(m1Var10.i(j4, tVar), m1Var10.i(j4, tVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var11 = n1.f688d;
                            if (!w0.x(m1Var11.i(j4, tVar), m1Var11.i(j4, tVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var12 = n1.f688d;
                            if (m1Var12.g(j4, tVar) != m1Var12.g(j4, tVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var13 = n1.f688d;
                            if (m1Var13.g(j4, tVar) != m1Var13.g(j4, tVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 13:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var14 = n1.f688d;
                            if (m1Var14.g(j4, tVar) != m1Var14.g(j4, tVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var15 = n1.f688d;
                            if (m1Var15.h(j4, tVar) != m1Var15.h(j4, tVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var16 = n1.f688d;
                            if (m1Var16.g(j4, tVar) != m1Var16.g(j4, tVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var17 = n1.f688d;
                            if (m1Var17.h(j4, tVar) != m1Var17.h(j4, tVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(tVar, tVar2, i)) {
                            zX = false;
                        } else {
                            m1 m1Var18 = n1.f688d;
                            if (!w0.x(m1Var18.i(j4, tVar), m1Var18.i(j4, tVar2))) {
                                zX = false;
                            }
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
                        m1 m1Var19 = n1.f688d;
                        zX = w0.x(m1Var19.i(j4, tVar), m1Var19.i(j4, tVar2));
                        break;
                    case 50:
                        m1 m1Var20 = n1.f688d;
                        zX = w0.x(m1Var20.i(j4, tVar), m1Var20.i(j4, tVar2));
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
                        long j10 = iArr[i + 2] & 1048575;
                        m1 m1Var21 = n1.f688d;
                        if (m1Var21.g(j10, tVar) != m1Var21.g(j10, tVar2) || !w0.x(m1Var21.i(j4, tVar), m1Var21.i(j4, tVar2))) {
                            zX = false;
                        }
                        break;
                }
                if (zX) {
                    i += 3;
                }
            } else {
                this.f683m.getClass();
                if (tVar.unknownFields.equals(tVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0608 A[Catch: all -> 0x039e, TryCatch #11 {all -> 0x039e, blocks: (B:165:0x0603, B:167:0x0608, B:169:0x060f, B:171:0x0616, B:116:0x0388, B:117:0x0391, B:120:0x03a1, B:121:0x03b2, B:122:0x03c3, B:123:0x03d4, B:124:0x03e5, B:125:0x03f6, B:126:0x0407, B:127:0x0418, B:128:0x0429, B:130:0x0434, B:131:0x0453, B:132:0x0467, B:133:0x047c, B:134:0x0491, B:135:0x04a6, B:136:0x04bb, B:137:0x04d3, B:138:0x04e8, B:139:0x04fd, B:141:0x0508, B:142:0x0527, B:143:0x053b, B:144:0x0548, B:145:0x055f, B:146:0x0574, B:147:0x0589, B:148:0x059e, B:149:0x05b3, B:150:0x05c8, B:151:0x05de, B:157:0x05f4), top: B:202:0x0603 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x060f A[Catch: all -> 0x039e, TryCatch #11 {all -> 0x039e, blocks: (B:165:0x0603, B:167:0x0608, B:169:0x060f, B:171:0x0616, B:116:0x0388, B:117:0x0391, B:120:0x03a1, B:121:0x03b2, B:122:0x03c3, B:123:0x03d4, B:124:0x03e5, B:125:0x03f6, B:126:0x0407, B:127:0x0418, B:128:0x0429, B:130:0x0434, B:131:0x0453, B:132:0x0467, B:133:0x047c, B:134:0x0491, B:135:0x04a6, B:136:0x04bb, B:137:0x04d3, B:138:0x04e8, B:139:0x04fd, B:141:0x0508, B:142:0x0527, B:143:0x053b, B:144:0x0548, B:145:0x055f, B:146:0x0574, B:147:0x0589, B:148:0x059e, B:149:0x05b3, B:150:0x05c8, B:151:0x05de, B:157:0x05f4), top: B:202:0x0603 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x061e A[LOOP:3: B:173:0x061c->B:174:0x061e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x0628  */
    /* JADX WARN: Code duplicated, block: B:182:0x0639 A[LOOP:4: B:181:0x0637->B:182:0x0639, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x0643  */
    /* JADX WARN: Code duplicated, block: B:213:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:? A[RETURN, SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.v0
    public final void h(Object obj, h hVar, l lVar) throws Throwable {
        n0 n0Var;
        int i;
        h hVar2;
        t tVar;
        e1 e1VarB;
        n0 n0Var2 = this;
        Object obj2 = obj;
        h hVar3 = hVar;
        l lVar2 = lVar;
        lVar2.getClass();
        f1 f1Var = n0Var2.f683m;
        int[] iArr = n0Var2.h;
        int i10 = n0Var2.f680j;
        int i11 = n0Var2.i;
        e1 e1VarB2 = null;
        while (true) {
            try {
                int iD = hVar3.d();
                if (iD < n0Var2.f676c || iD > n0Var2.f677d) {
                    i = -1;
                } else {
                    int[] iArr2 = n0Var2.f674a;
                    int length = (iArr2.length / 3) - 1;
                    int i12 = 0;
                    while (true) {
                        if (i12 > length) {
                            i = -1;
                        } else {
                            int i13 = (length + i12) >>> 1;
                            int i14 = i13 * 3;
                            int i15 = iArr2[i14];
                            if (iD == i15) {
                                i = i14;
                            } else if (iD < i15) {
                                length = i13 - 1;
                            } else {
                                i12 = i13 + 1;
                            }
                        }
                    }
                }
                e1 e1Var = e1.f626f;
                if (i >= 0) {
                    int iH = n0Var2.H(i);
                    try {
                        int iG = G(iH);
                        d0 d0Var = n0Var2.f682l;
                        switch (iG) {
                            case 0:
                                int i16 = i;
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                try {
                                    try {
                                        n1.f688d.m(obj, y(iH), hVar2.j());
                                        obj2 = obj;
                                        n0Var.E(i16, obj2);
                                    } catch (w unused) {
                                        obj2 = obj;
                                        try {
                                            f1Var.getClass();
                                            if (e1VarB2 == null) {
                                                tVar = (t) obj2;
                                                e1VarB = tVar.unknownFields;
                                                if (e1VarB == e1Var) {
                                                    e1VarB = e1.b();
                                                    tVar.unknownFields = e1VarB;
                                                }
                                                e1VarB2 = e1VarB;
                                            }
                                            if (!f1.a(e1VarB2, hVar2)) {
                                                while (i11 < i10) {
                                                    n0Var.k(iArr[i11], obj2, e1VarB2);
                                                    i11++;
                                                }
                                                if (e1VarB2 != null) {
                                                    ((t) obj2).unknownFields = e1VarB2;
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            while (i11 < i10) {
                                                n0Var.k(iArr[i11], obj2, e1VarB2);
                                                i11++;
                                            }
                                            if (e1VarB2 != null) {
                                                f1Var.getClass();
                                                ((t) obj2).unknownFields = e1VarB2;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj2 = obj;
                                        while (i11 < i10) {
                                            n0Var.k(iArr[i11], obj2, e1VarB2);
                                            i11++;
                                        }
                                        if (e1VarB2 != null) {
                                            f1Var.getClass();
                                            ((t) obj2).unknownFields = e1VarB2;
                                        }
                                        throw th;
                                    }
                                } catch (w unused2) {
                                    obj2 = obj;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj;
                                }
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 1:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.f688d.n(obj2, y(iH), hVar2.s());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 2:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.n(obj2, y(iH), hVar2.z());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 3:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.n(obj2, y(iH), hVar2.Q());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 4:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.m(obj2, y(iH), hVar2.x());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 5:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.n(obj2, y(iH), hVar2.q());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 6:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.m(obj2, y(iH), hVar2.o());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 7:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.f688d.k(obj2, y(iH), hVar2.f());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 8:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n0Var.C(obj2, iH, hVar2);
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 9:
                                int i17 = i;
                                hVar2 = hVar3;
                                l lVar3 = lVar2;
                                n0Var = n0Var2;
                                if (n0Var.q(i17, obj2)) {
                                    n1.o(obj2, y(iH), v.c(n1.f688d.i(y(iH), obj2), hVar2.C(n0Var.n(i17), lVar3)));
                                } else {
                                    n1.o(obj2, y(iH), hVar2.C(n0Var.n(i17), lVar3));
                                    n0Var.E(i17, obj2);
                                }
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 10:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.o(obj2, y(iH), hVar2.h());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 11:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.m(obj2, y(iH), hVar2.O());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 12:
                                int i18 = i;
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                int iL = hVar2.l();
                                n0Var.l(i18);
                                n1.m(obj2, y(iH), iL);
                                n0Var.E(i18, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 13:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.m(obj2, y(iH), hVar2.D());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 14:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.n(obj2, y(iH), hVar2.F());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 15:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.m(obj2, y(iH), hVar2.H());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 16:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                n1.n(obj2, y(iH), hVar2.J());
                                n0Var.E(i, obj2);
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 17:
                                int i19 = i;
                                hVar2 = hVar3;
                                l lVar4 = lVar2;
                                n0Var = n0Var2;
                                if (n0Var.q(i19, obj2)) {
                                    n1.o(obj2, y(iH), v.c(n1.f688d.i(y(iH), obj2), hVar2.v(n0Var.n(i19), lVar4)));
                                } else {
                                    n1.o(obj2, y(iH), hVar2.v(n0Var.n(i19), lVar4));
                                    n0Var.E(i19, obj2);
                                }
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 18:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                hVar2.k(d0Var.c(y(iH), obj2));
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 19:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                hVar2.t(d0Var.c(y(iH), obj2));
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 20:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                hVar2.A(d0Var.c(y(iH), obj2));
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case zzbbs.zzt.zzm /* 21 */:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                hVar2.R(d0Var.c(y(iH), obj2));
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 22:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                hVar2.y(d0Var.c(y(iH), obj2));
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 23:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                hVar2.r(d0Var.c(y(iH), obj2));
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 24:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                hVar2.p(d0Var.c(y(iH), obj2));
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 25:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                hVar2.g(d0Var.c(y(iH), obj2));
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 26:
                                hVar2 = hVar3;
                                n0Var = n0Var2;
                                if ((536870912 & iH) != 0) {
                                    try {
                                        hVar2.M(d0Var.c(iH & 1048575, obj2), true);
                                    } catch (w unused3) {
                                        f1Var.getClass();
                                        if (e1VarB2 == null) {
                                            tVar = (t) obj2;
                                            e1VarB = tVar.unknownFields;
                                            if (e1VarB == e1Var) {
                                                e1VarB = e1.b();
                                                tVar.unknownFields = e1VarB;
                                            }
                                            e1VarB2 = e1VarB;
                                        }
                                        if (!f1.a(e1VarB2, hVar2)) {
                                            while (i11 < i10) {
                                                n0Var.k(iArr[i11], obj2, e1VarB2);
                                                i11++;
                                            }
                                            if (e1VarB2 != null) {
                                                ((t) obj2).unknownFields = e1VarB2;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } else {
                                    hVar2.M(d0Var.c(iH & 1048575, obj2), false);
                                }
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 27:
                                try {
                                    try {
                                        n0Var2.B(obj2, iH, hVar3, n0Var2.n(i), lVar);
                                        n0Var = n0Var2;
                                        hVar2 = hVar3;
                                    } catch (w unused4) {
                                        n0Var = n0Var2;
                                        hVar2 = hVar3;
                                        f1Var.getClass();
                                        if (e1VarB2 == null) {
                                            tVar = (t) obj2;
                                            e1VarB = tVar.unknownFields;
                                            if (e1VarB == e1Var) {
                                                e1VarB = e1.b();
                                                tVar.unknownFields = e1VarB;
                                            }
                                            e1VarB2 = e1VarB;
                                        }
                                        if (!f1.a(e1VarB2, hVar2)) {
                                            while (i11 < i10) {
                                                n0Var.k(iArr[i11], obj2, e1VarB2);
                                                i11++;
                                            }
                                            if (e1VarB2 != null) {
                                                ((t) obj2).unknownFields = e1VarB2;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } catch (w unused5) {
                                    n0Var = n0Var2;
                                    hVar2 = hVar3;
                                    f1Var.getClass();
                                    if (e1VarB2 == null) {
                                        tVar = (t) obj2;
                                        e1VarB = tVar.unknownFields;
                                        if (e1VarB == e1Var) {
                                            e1VarB = e1.b();
                                            tVar.unknownFields = e1VarB;
                                        }
                                        e1VarB2 = e1VarB;
                                    }
                                    if (!f1.a(e1VarB2, hVar2)) {
                                        while (i11 < i10) {
                                            n0Var.k(iArr[i11], obj2, e1VarB2);
                                            i11++;
                                        }
                                        if (e1VarB2 != null) {
                                            ((t) obj2).unknownFields = e1VarB2;
                                            return;
                                        }
                                        return;
                                    }
                                    lVar2 = lVar;
                                    n0Var2 = n0Var;
                                    hVar3 = hVar2;
                                    break;
                                }
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 28:
                                hVar3.i(d0Var.c(y(iH), obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 29:
                                hVar3.P(d0Var.c(y(iH), obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 30:
                                hVar3.m(d0Var.c(y(iH), obj2));
                                n0Var2.l(i);
                                Class cls = w0.f727a;
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 31:
                                hVar3.E(d0Var.c(y(iH), obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                                hVar3.G(d0Var.c(y(iH), obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 33:
                                hVar3.I(d0Var.c(y(iH), obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 34:
                                hVar3.K(d0Var.c(y(iH), obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 35:
                                hVar3.k(d0Var.c(y(iH), obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 36:
                                hVar3.t(d0Var.c(y(iH), obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 37:
                                hVar3.A(d0Var.c(y(iH), obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 38:
                                hVar3.R(d0Var.c(y(iH), obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 39:
                                hVar3.y(d0Var.c(y(iH), obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 40:
                                hVar3.r(d0Var.c(y(iH), obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 41:
                                hVar3.p(d0Var.c(iH & 1048575, obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 42:
                                hVar3.g(d0Var.c(iH & 1048575, obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 43:
                                hVar3.P(d0Var.c(iH & 1048575, obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 44:
                                hVar3.m(d0Var.c(iH & 1048575, obj2));
                                n0Var2.l(i);
                                Class cls2 = w0.f727a;
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 45:
                                hVar3.E(d0Var.c(iH & 1048575, obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 46:
                                hVar3.G(d0Var.c(iH & 1048575, obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 47:
                                hVar3.I(d0Var.c(iH & 1048575, obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 48:
                                hVar3.K(d0Var.c(iH & 1048575, obj2));
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 49:
                                hVar3.w(d0Var.c(iH & 1048575, obj2), n0Var2.n(i), lVar2);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 50:
                                try {
                                    try {
                                        n0Var2.t(obj2, i, n0Var2.m(i), lVar2, hVar);
                                        hVar3 = hVar;
                                        n0Var = n0Var2;
                                        hVar2 = hVar3;
                                    } catch (w unused6) {
                                        n0Var = n0Var2;
                                        hVar2 = hVar;
                                        f1Var.getClass();
                                        if (e1VarB2 == null) {
                                            tVar = (t) obj2;
                                            e1VarB = tVar.unknownFields;
                                            if (e1VarB == e1Var) {
                                                e1VarB = e1.b();
                                                tVar.unknownFields = e1VarB;
                                            }
                                            e1VarB2 = e1VarB;
                                        }
                                        if (!f1.a(e1VarB2, hVar2)) {
                                            while (i11 < i10) {
                                                n0Var.k(iArr[i11], obj2, e1VarB2);
                                                i11++;
                                            }
                                            if (e1VarB2 != null) {
                                                ((t) obj2).unknownFields = e1VarB2;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } catch (w unused7) {
                                    hVar2 = hVar;
                                    n0Var = n0Var2;
                                }
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 51:
                                n1.o(obj2, iH & 1048575, Double.valueOf(hVar3.j()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 52:
                                n1.o(obj2, iH & 1048575, Float.valueOf(hVar3.s()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 53:
                                n1.o(obj2, iH & 1048575, Long.valueOf(hVar3.z()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 54:
                                n1.o(obj2, iH & 1048575, Long.valueOf(hVar3.Q()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 55:
                                n1.o(obj2, iH & 1048575, Integer.valueOf(hVar3.x()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 56:
                                n1.o(obj2, iH & 1048575, Long.valueOf(hVar3.q()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 57:
                                n1.o(obj2, iH & 1048575, Integer.valueOf(hVar3.o()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 58:
                                n1.o(obj2, iH & 1048575, Boolean.valueOf(hVar3.f()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 59:
                                n0Var2.C(obj2, iH, hVar3);
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 60:
                                if (n0Var2.r(obj2, iD, i)) {
                                    long j4 = iH & 1048575;
                                    n1.o(obj2, j4, v.c(n1.f688d.i(j4, obj2), hVar3.C(n0Var2.n(i), lVar2)));
                                } else {
                                    n1.o(obj2, iH & 1048575, hVar3.C(n0Var2.n(i), lVar2));
                                    n0Var2.E(i, obj2);
                                }
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 61:
                                n1.o(obj2, iH & 1048575, hVar3.h());
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 62:
                                n1.o(obj2, iH & 1048575, Integer.valueOf(hVar3.O()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 63:
                                int iL2 = hVar3.l();
                                n0Var2.l(i);
                                n1.o(obj2, iH & 1048575, Integer.valueOf(iL2));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                                n1.o(obj2, iH & 1048575, Integer.valueOf(hVar3.D()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 65:
                                n1.o(obj2, iH & 1048575, Long.valueOf(hVar3.F()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 66:
                                n1.o(obj2, iH & 1048575, Integer.valueOf(hVar3.H()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 67:
                                n1.o(obj2, iH & 1048575, Long.valueOf(hVar3.J()));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            case 68:
                                n1.o(obj2, iH & 1048575, hVar3.v(n0Var2.n(i), lVar2));
                                n0Var2.F(obj2, iD, i);
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                            default:
                                if (e1VarB2 == null) {
                                    f1Var.getClass();
                                    e1VarB2 = e1.b();
                                }
                                f1Var.getClass();
                                if (!f1.a(e1VarB2, hVar3)) {
                                    while (i11 < i10) {
                                        n0Var2.k(iArr[i11], obj2, e1VarB2);
                                        i11++;
                                    }
                                }
                                n0Var = n0Var2;
                                hVar2 = hVar3;
                                lVar2 = lVar;
                                n0Var2 = n0Var;
                                hVar3 = hVar2;
                                break;
                        }
                    } catch (w unused8) {
                    }
                } else if (iD == Integer.MAX_VALUE) {
                    while (i11 < i10) {
                        n0Var2.k(iArr[i11], obj2, e1VarB2);
                        i11++;
                    }
                    if (e1VarB2 != null) {
                        f1Var.getClass();
                    }
                } else {
                    f1Var.getClass();
                    if (e1VarB2 == null) {
                        t tVar2 = (t) obj2;
                        e1 e1VarB3 = tVar2.unknownFields;
                        if (e1VarB3 == e1Var) {
                            e1VarB3 = e1.b();
                            tVar2.unknownFields = e1VarB3;
                        }
                        e1VarB2 = e1VarB3;
                    }
                    if (!f1.a(e1VarB2, hVar3)) {
                        while (i11 < i10) {
                            n0Var2.k(iArr[i11], obj2, e1VarB2);
                            i11++;
                        }
                        if (e1VarB2 != null) {
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                n0Var = n0Var2;
            }
        }
        ((t) obj2).unknownFields = e1VarB2;
    }

    @Override // androidx.datastore.preferences.protobuf.v0
    public final Object i() {
        this.f681k.getClass();
        return ((t) this.e).d(4);
    }

    public final boolean j(t tVar, Object obj, int i) {
        return q(i, tVar) == q(i, obj);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i10 = this.f674a[i];
        if (n1.f688d.i(H(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.f675b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object m(int i) {
        return this.f675b[(i / 3) * 2];
    }

    public final v0 n(int i) {
        int i10 = (i / 3) * 2;
        Object[] objArr = this.f675b;
        v0 v0Var = (v0) objArr[i10];
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0VarA = s0.f710c.a((Class) objArr[i10 + 1]);
        objArr[i10] = v0VarA;
        return v0VarA;
    }

    public final int o(Object obj) {
        int i;
        int iY;
        int iA;
        int iY2;
        int iW;
        int iU;
        int iY3;
        int iX;
        int iE;
        int iY4;
        int iV;
        Unsafe unsafe = f673p;
        int i10 = -1;
        int i11 = 0;
        int iD = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f674a;
            if (i11 >= iArr.length) {
                this.f683m.getClass();
                return ((t) obj).unknownFields.a() + iD;
            }
            int iH = H(i11);
            int i13 = iArr[i11];
            int iG = G(iH);
            if (iG <= 17) {
                int i14 = iArr[i11 + 2];
                int i15 = i14 & 1048575;
                i = 1 << (i14 >>> 20);
                if (i15 != i10) {
                    i12 = unsafe.getInt(obj, i15);
                    i10 = i15;
                }
            } else {
                i = 0;
            }
            long j4 = iH & 1048575;
            switch (iG) {
                case 0:
                    if ((i & i12) != 0) {
                        iD = q1.a.d(i13, 8, iD);
                    }
                    break;
                case 1:
                    if ((i12 & i) != 0) {
                        iD = q1.a.d(i13, 4, iD);
                    }
                    break;
                case 2:
                    if ((i12 & i) != 0) {
                        long j10 = unsafe.getLong(obj, j4);
                        iY = j.y(i13);
                        iA = j.A(j10);
                        iY4 = iA + iY;
                        iD += iY4;
                    }
                    break;
                case 3:
                    if ((i12 & i) != 0) {
                        long j11 = unsafe.getLong(obj, j4);
                        iY = j.y(i13);
                        iA = j.A(j11);
                        iY4 = iA + iY;
                        iD += iY4;
                    }
                    break;
                case 4:
                    if ((i12 & i) != 0) {
                        int i16 = unsafe.getInt(obj, j4);
                        iY2 = j.y(i13);
                        iW = j.w(i16);
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 5:
                    if ((i12 & i) != 0) {
                        iU = j.u(i13);
                        iD += iU;
                    }
                    break;
                case 6:
                    if ((i12 & i) != 0) {
                        iU = j.t(i13);
                        iD += iU;
                    }
                    break;
                case 7:
                    if ((i12 & i) != 0) {
                        iD = q1.a.d(i13, 1, iD);
                    }
                    break;
                case 8:
                    if ((i12 & i) != 0) {
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof f) {
                            int iY5 = j.y(i13);
                            int size = ((f) object).size();
                            iE = q1.a.e(size, size, iY5, iD);
                        } else {
                            iY3 = j.y(i13);
                            iX = j.x((String) object);
                            iE = iX + iY3 + iD;
                        }
                        iD = iE;
                    }
                    break;
                case 9:
                    if ((i12 & i) != 0) {
                        Object object2 = unsafe.getObject(obj, j4);
                        v0 v0VarN = n(i11);
                        Class cls = w0.f727a;
                        int iY6 = j.y(i13);
                        int iB = ((a) object2).b(v0VarN);
                        iD = q1.a.e(iB, iB, iY6, iD);
                    }
                    break;
                case 10:
                    if ((i12 & i) != 0) {
                        iU = j.r(i13, (f) unsafe.getObject(obj, j4));
                        iD += iU;
                    }
                    break;
                case 11:
                    if ((i12 & i) != 0) {
                        int i17 = unsafe.getInt(obj, j4);
                        iY2 = j.y(i13);
                        iW = j.z(i17);
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 12:
                    if ((i12 & i) != 0) {
                        int i18 = unsafe.getInt(obj, j4);
                        iY2 = j.y(i13);
                        iW = j.w(i18);
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 13:
                    if ((i12 & i) != 0) {
                        iD = q1.a.d(i13, 4, iD);
                    }
                    break;
                case 14:
                    if ((i & i12) != 0) {
                        iD = q1.a.d(i13, 8, iD);
                    }
                    break;
                case 15:
                    if ((i12 & i) != 0) {
                        int i19 = unsafe.getInt(obj, j4);
                        iY2 = j.y(i13);
                        iW = j.z((i19 >> 31) ^ (i19 << 1));
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 16:
                    if ((i12 & i) != 0) {
                        long j12 = unsafe.getLong(obj, j4);
                        iY = j.y(i13);
                        iA = j.A((j12 >> 63) ^ (j12 << 1));
                        iY4 = iA + iY;
                        iD += iY4;
                    }
                    break;
                case 17:
                    if ((i12 & i) != 0) {
                        iU = j.v(i13, (a) unsafe.getObject(obj, j4), n(i11));
                        iD += iU;
                    }
                    break;
                case 18:
                    iU = w0.f(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 19:
                    iU = w0.d(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 20:
                    iU = w0.j(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    iU = w0.t(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 22:
                    iU = w0.h(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 23:
                    iU = w0.f(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 24:
                    iU = w0.d(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(obj, j4);
                    Class cls2 = w0.f727a;
                    int size2 = list.size();
                    iY4 = size2 == 0 ? 0 : (j.y(i13) + 1) * size2;
                    iD += iY4;
                    break;
                case 26:
                    iU = w0.q(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 27:
                    iU = w0.l(i13, (List) unsafe.getObject(obj, j4), n(i11));
                    iD += iU;
                    break;
                case 28:
                    iU = w0.a(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 29:
                    iU = w0.r(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 30:
                    iU = w0.b(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 31:
                    iU = w0.d(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    iU = w0.f(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 33:
                    iU = w0.m(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 34:
                    iU = w0.o(i13, (List) unsafe.getObject(obj, j4));
                    iD += iU;
                    break;
                case 35:
                    int iG2 = w0.g((List) unsafe.getObject(obj, j4));
                    if (iG2 > 0) {
                        iD = q1.a.e(iG2, j.y(i13), iG2, iD);
                    }
                    break;
                case 36:
                    int iE2 = w0.e((List) unsafe.getObject(obj, j4));
                    if (iE2 > 0) {
                        iD = q1.a.e(iE2, j.y(i13), iE2, iD);
                    }
                    break;
                case 37:
                    int iK = w0.k((List) unsafe.getObject(obj, j4));
                    if (iK > 0) {
                        iD = q1.a.e(iK, j.y(i13), iK, iD);
                    }
                    break;
                case 38:
                    int iU2 = w0.u((List) unsafe.getObject(obj, j4));
                    if (iU2 > 0) {
                        iD = q1.a.e(iU2, j.y(i13), iU2, iD);
                    }
                    break;
                case 39:
                    int i20 = w0.i((List) unsafe.getObject(obj, j4));
                    if (i20 > 0) {
                        iD = q1.a.e(i20, j.y(i13), i20, iD);
                    }
                    break;
                case 40:
                    int iG3 = w0.g((List) unsafe.getObject(obj, j4));
                    if (iG3 > 0) {
                        iD = q1.a.e(iG3, j.y(i13), iG3, iD);
                    }
                    break;
                case 41:
                    int iE3 = w0.e((List) unsafe.getObject(obj, j4));
                    if (iE3 > 0) {
                        iD = q1.a.e(iE3, j.y(i13), iE3, iD);
                    }
                    break;
                case 42:
                    List list2 = (List) unsafe.getObject(obj, j4);
                    Class cls3 = w0.f727a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        iD = q1.a.e(size3, j.y(i13), size3, iD);
                    }
                    break;
                case 43:
                    int iS = w0.s((List) unsafe.getObject(obj, j4));
                    if (iS > 0) {
                        iD = q1.a.e(iS, j.y(i13), iS, iD);
                    }
                    break;
                case 44:
                    int iC = w0.c((List) unsafe.getObject(obj, j4));
                    if (iC > 0) {
                        iD = q1.a.e(iC, j.y(i13), iC, iD);
                    }
                    break;
                case 45:
                    int iE4 = w0.e((List) unsafe.getObject(obj, j4));
                    if (iE4 > 0) {
                        iD = q1.a.e(iE4, j.y(i13), iE4, iD);
                    }
                    break;
                case 46:
                    int iG4 = w0.g((List) unsafe.getObject(obj, j4));
                    if (iG4 > 0) {
                        iD = q1.a.e(iG4, j.y(i13), iG4, iD);
                    }
                    break;
                case 47:
                    int iN = w0.n((List) unsafe.getObject(obj, j4));
                    if (iN > 0) {
                        iD = q1.a.e(iN, j.y(i13), iN, iD);
                    }
                    break;
                case 48:
                    int iP = w0.p((List) unsafe.getObject(obj, j4));
                    if (iP > 0) {
                        iD = q1.a.e(iP, j.y(i13), iP, iD);
                    }
                    break;
                case 49:
                    List list3 = (List) unsafe.getObject(obj, j4);
                    v0 v0VarN2 = n(i11);
                    Class cls4 = w0.f727a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        iV = 0;
                    } else {
                        iV = 0;
                        for (int i21 = 0; i21 < size4; i21++) {
                            iV += j.v(i13, (a) list3.get(i21), v0VarN2);
                        }
                    }
                    iD += iV;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j4);
                    Object objM = m(i11);
                    this.f684n.getClass();
                    iU = j0.a(i13, object3, objM);
                    iD += iU;
                    break;
                case 51:
                    if (r(obj, i13, i11)) {
                        iD = q1.a.d(i13, 8, iD);
                    }
                    break;
                case 52:
                    if (r(obj, i13, i11)) {
                        iD = q1.a.d(i13, 4, iD);
                    }
                    break;
                case 53:
                    if (r(obj, i13, i11)) {
                        long jA = A(j4, obj);
                        iY = j.y(i13);
                        iA = j.A(jA);
                        iY4 = iA + iY;
                        iD += iY4;
                    }
                    break;
                case 54:
                    if (r(obj, i13, i11)) {
                        long jA2 = A(j4, obj);
                        iY = j.y(i13);
                        iA = j.A(jA2);
                        iY4 = iA + iY;
                        iD += iY4;
                    }
                    break;
                case 55:
                    if (r(obj, i13, i11)) {
                        int iZ = z(j4, obj);
                        iY2 = j.y(i13);
                        iW = j.w(iZ);
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 56:
                    if (r(obj, i13, i11)) {
                        iU = j.u(i13);
                        iD += iU;
                    }
                    break;
                case 57:
                    if (r(obj, i13, i11)) {
                        iU = j.t(i13);
                        iD += iU;
                    }
                    break;
                case 58:
                    if (r(obj, i13, i11)) {
                        iD = q1.a.d(i13, 1, iD);
                    }
                    break;
                case 59:
                    if (r(obj, i13, i11)) {
                        Object object4 = unsafe.getObject(obj, j4);
                        if (object4 instanceof f) {
                            int iY7 = j.y(i13);
                            int size5 = ((f) object4).size();
                            iE = q1.a.e(size5, size5, iY7, iD);
                        } else {
                            iY3 = j.y(i13);
                            iX = j.x((String) object4);
                            iE = iX + iY3 + iD;
                        }
                        iD = iE;
                    }
                    break;
                case 60:
                    if (r(obj, i13, i11)) {
                        Object object5 = unsafe.getObject(obj, j4);
                        v0 v0VarN3 = n(i11);
                        Class cls5 = w0.f727a;
                        int iY8 = j.y(i13);
                        int iB2 = ((a) object5).b(v0VarN3);
                        iD = q1.a.e(iB2, iB2, iY8, iD);
                    }
                    break;
                case 61:
                    if (r(obj, i13, i11)) {
                        iU = j.r(i13, (f) unsafe.getObject(obj, j4));
                        iD += iU;
                    }
                    break;
                case 62:
                    if (r(obj, i13, i11)) {
                        int iZ2 = z(j4, obj);
                        iY2 = j.y(i13);
                        iW = j.z(iZ2);
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 63:
                    if (r(obj, i13, i11)) {
                        int iZ3 = z(j4, obj);
                        iY2 = j.y(i13);
                        iW = j.w(iZ3);
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (r(obj, i13, i11)) {
                        iD = q1.a.d(i13, 4, iD);
                    }
                    break;
                case 65:
                    if (r(obj, i13, i11)) {
                        iD = q1.a.d(i13, 8, iD);
                    }
                    break;
                case 66:
                    if (r(obj, i13, i11)) {
                        int iZ4 = z(j4, obj);
                        iY2 = j.y(i13);
                        iW = j.z((iZ4 >> 31) ^ (iZ4 << 1));
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 67:
                    if (r(obj, i13, i11)) {
                        long jA3 = A(j4, obj);
                        iY = j.y(i13);
                        iA = j.A((jA3 >> 63) ^ (jA3 << 1));
                        iY4 = iA + iY;
                        iD += iY4;
                    }
                    break;
                case 68:
                    if (r(obj, i13, i11)) {
                        iU = j.v(i13, (a) unsafe.getObject(obj, j4), n(i11));
                        iD += iU;
                    }
                    break;
            }
            i11 += 3;
        }
    }

    public final int p(Object obj) {
        int iY;
        int iA;
        int iY2;
        int iW;
        int iU;
        int iY3;
        int iX;
        int iY4;
        int iA2;
        int iV;
        Unsafe unsafe = f673p;
        int i = 0;
        int iD = 0;
        while (true) {
            int[] iArr = this.f674a;
            if (i >= iArr.length) {
                this.f683m.getClass();
                return ((t) obj).unknownFields.a() + iD;
            }
            int iH = H(i);
            int iG = G(iH);
            int i10 = iArr[i];
            long j4 = iH & 1048575;
            if (iG >= p.f698b.f701a && iG <= p.f699c.f701a) {
                int i11 = iArr[i + 2];
            }
            switch (iG) {
                case 0:
                    if (q(i, obj)) {
                        iD = q1.a.d(i10, 8, iD);
                    }
                    break;
                case 1:
                    if (q(i, obj)) {
                        iD = q1.a.d(i10, 4, iD);
                    }
                    break;
                case 2:
                    if (q(i, obj)) {
                        long jH = n1.f688d.h(j4, obj);
                        iY = j.y(i10);
                        iA = j.A(jH);
                        iU = iA + iY;
                        iD += iU;
                    }
                    break;
                case 3:
                    if (q(i, obj)) {
                        long jH2 = n1.f688d.h(j4, obj);
                        iY = j.y(i10);
                        iA = j.A(jH2);
                        iU = iA + iY;
                        iD += iU;
                    }
                    break;
                case 4:
                    if (q(i, obj)) {
                        int iG2 = n1.f688d.g(j4, obj);
                        iY2 = j.y(i10);
                        iW = j.w(iG2);
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 5:
                    if (q(i, obj)) {
                        iU = j.u(i10);
                        iD += iU;
                    }
                    break;
                case 6:
                    if (q(i, obj)) {
                        iU = j.t(i10);
                        iD += iU;
                    }
                    break;
                case 7:
                    if (q(i, obj)) {
                        iD = q1.a.d(i10, 1, iD);
                    }
                    break;
                case 8:
                    if (q(i, obj)) {
                        Object objI = n1.f688d.i(j4, obj);
                        if (objI instanceof f) {
                            int iY5 = j.y(i10);
                            int size = ((f) objI).size();
                            iD = q1.a.e(size, size, iY5, iD);
                        } else {
                            iY3 = j.y(i10);
                            iX = j.x((String) objI);
                            iD = iX + iY3 + iD;
                        }
                    }
                    break;
                case 9:
                    if (q(i, obj)) {
                        Object objI2 = n1.f688d.i(j4, obj);
                        v0 v0VarN = n(i);
                        Class cls = w0.f727a;
                        int iY6 = j.y(i10);
                        int iB = ((a) objI2).b(v0VarN);
                        iD = q1.a.e(iB, iB, iY6, iD);
                    }
                    break;
                case 10:
                    if (q(i, obj)) {
                        iU = j.r(i10, (f) n1.f688d.i(j4, obj));
                        iD += iU;
                    }
                    break;
                case 11:
                    if (q(i, obj)) {
                        int iG3 = n1.f688d.g(j4, obj);
                        iY2 = j.y(i10);
                        iW = j.z(iG3);
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 12:
                    if (q(i, obj)) {
                        int iG4 = n1.f688d.g(j4, obj);
                        iY2 = j.y(i10);
                        iW = j.w(iG4);
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 13:
                    if (q(i, obj)) {
                        iD = q1.a.d(i10, 4, iD);
                    }
                    break;
                case 14:
                    if (q(i, obj)) {
                        iD = q1.a.d(i10, 8, iD);
                    }
                    break;
                case 15:
                    if (q(i, obj)) {
                        int iG5 = n1.f688d.g(j4, obj);
                        iY2 = j.y(i10);
                        iW = j.z((iG5 >> 31) ^ (iG5 << 1));
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 16:
                    if (q(i, obj)) {
                        long jH3 = n1.f688d.h(j4, obj);
                        iY4 = j.y(i10);
                        iA2 = j.A((jH3 >> 63) ^ (jH3 << 1));
                        iU = iA2 + iY4;
                        iD += iU;
                    }
                    break;
                case 17:
                    if (q(i, obj)) {
                        iU = j.v(i10, (a) n1.f688d.i(j4, obj), n(i));
                        iD += iU;
                    }
                    break;
                case 18:
                    iU = w0.f(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 19:
                    iU = w0.d(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 20:
                    iU = w0.j(i10, s(j4, obj));
                    iD += iU;
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    iU = w0.t(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 22:
                    iU = w0.h(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 23:
                    iU = w0.f(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 24:
                    iU = w0.d(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 25:
                    List listS = s(j4, obj);
                    Class cls2 = w0.f727a;
                    int size2 = listS.size();
                    iD += size2 == 0 ? 0 : (j.y(i10) + 1) * size2;
                    break;
                case 26:
                    iU = w0.q(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 27:
                    iU = w0.l(i10, s(j4, obj), n(i));
                    iD += iU;
                    break;
                case 28:
                    iU = w0.a(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 29:
                    iU = w0.r(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 30:
                    iU = w0.b(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 31:
                    iU = w0.d(i10, s(j4, obj));
                    iD += iU;
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    iU = w0.f(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 33:
                    iU = w0.m(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 34:
                    iU = w0.o(i10, s(j4, obj));
                    iD += iU;
                    break;
                case 35:
                    int iG6 = w0.g((List) unsafe.getObject(obj, j4));
                    if (iG6 > 0) {
                        iD = q1.a.e(iG6, j.y(i10), iG6, iD);
                    }
                    break;
                case 36:
                    int iE = w0.e((List) unsafe.getObject(obj, j4));
                    if (iE > 0) {
                        iD = q1.a.e(iE, j.y(i10), iE, iD);
                    }
                    break;
                case 37:
                    int iK = w0.k((List) unsafe.getObject(obj, j4));
                    if (iK > 0) {
                        iD = q1.a.e(iK, j.y(i10), iK, iD);
                    }
                    break;
                case 38:
                    int iU2 = w0.u((List) unsafe.getObject(obj, j4));
                    if (iU2 > 0) {
                        iD = q1.a.e(iU2, j.y(i10), iU2, iD);
                    }
                    break;
                case 39:
                    int i12 = w0.i((List) unsafe.getObject(obj, j4));
                    if (i12 > 0) {
                        iD = q1.a.e(i12, j.y(i10), i12, iD);
                    }
                    break;
                case 40:
                    int iG7 = w0.g((List) unsafe.getObject(obj, j4));
                    if (iG7 > 0) {
                        iD = q1.a.e(iG7, j.y(i10), iG7, iD);
                    }
                    break;
                case 41:
                    int iE2 = w0.e((List) unsafe.getObject(obj, j4));
                    if (iE2 > 0) {
                        iD = q1.a.e(iE2, j.y(i10), iE2, iD);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j4);
                    Class cls3 = w0.f727a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        iD = q1.a.e(size3, j.y(i10), size3, iD);
                    }
                    break;
                case 43:
                    int iS = w0.s((List) unsafe.getObject(obj, j4));
                    if (iS > 0) {
                        iD = q1.a.e(iS, j.y(i10), iS, iD);
                    }
                    break;
                case 44:
                    int iC = w0.c((List) unsafe.getObject(obj, j4));
                    if (iC > 0) {
                        iD = q1.a.e(iC, j.y(i10), iC, iD);
                    }
                    break;
                case 45:
                    int iE3 = w0.e((List) unsafe.getObject(obj, j4));
                    if (iE3 > 0) {
                        iD = q1.a.e(iE3, j.y(i10), iE3, iD);
                    }
                    break;
                case 46:
                    int iG8 = w0.g((List) unsafe.getObject(obj, j4));
                    if (iG8 > 0) {
                        iD = q1.a.e(iG8, j.y(i10), iG8, iD);
                    }
                    break;
                case 47:
                    int iN = w0.n((List) unsafe.getObject(obj, j4));
                    if (iN > 0) {
                        iD = q1.a.e(iN, j.y(i10), iN, iD);
                    }
                    break;
                case 48:
                    int iP = w0.p((List) unsafe.getObject(obj, j4));
                    if (iP > 0) {
                        iD = q1.a.e(iP, j.y(i10), iP, iD);
                    }
                    break;
                case 49:
                    List listS2 = s(j4, obj);
                    v0 v0VarN2 = n(i);
                    Class cls4 = w0.f727a;
                    int size4 = listS2.size();
                    if (size4 == 0) {
                        iV = 0;
                    } else {
                        iV = 0;
                        for (int i13 = 0; i13 < size4; i13++) {
                            iV += j.v(i10, (a) listS2.get(i13), v0VarN2);
                        }
                    }
                    iD += iV;
                    break;
                case 50:
                    Object objI3 = n1.f688d.i(j4, obj);
                    Object objM = m(i);
                    this.f684n.getClass();
                    iU = j0.a(i10, objI3, objM);
                    iD += iU;
                    break;
                case 51:
                    if (r(obj, i10, i)) {
                        iD = q1.a.d(i10, 8, iD);
                    }
                    break;
                case 52:
                    if (r(obj, i10, i)) {
                        iD = q1.a.d(i10, 4, iD);
                    }
                    break;
                case 53:
                    if (r(obj, i10, i)) {
                        long jA = A(j4, obj);
                        iY = j.y(i10);
                        iA = j.A(jA);
                        iU = iA + iY;
                        iD += iU;
                    }
                    break;
                case 54:
                    if (r(obj, i10, i)) {
                        long jA2 = A(j4, obj);
                        iY = j.y(i10);
                        iA = j.A(jA2);
                        iU = iA + iY;
                        iD += iU;
                    }
                    break;
                case 55:
                    if (r(obj, i10, i)) {
                        int iZ = z(j4, obj);
                        iY2 = j.y(i10);
                        iW = j.w(iZ);
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 56:
                    if (r(obj, i10, i)) {
                        iU = j.u(i10);
                        iD += iU;
                    }
                    break;
                case 57:
                    if (r(obj, i10, i)) {
                        iU = j.t(i10);
                        iD += iU;
                    }
                    break;
                case 58:
                    if (r(obj, i10, i)) {
                        iD = q1.a.d(i10, 1, iD);
                    }
                    break;
                case 59:
                    if (r(obj, i10, i)) {
                        Object objI4 = n1.f688d.i(j4, obj);
                        if (objI4 instanceof f) {
                            int iY7 = j.y(i10);
                            int size5 = ((f) objI4).size();
                            iD = q1.a.e(size5, size5, iY7, iD);
                        } else {
                            iY3 = j.y(i10);
                            iX = j.x((String) objI4);
                            iD = iX + iY3 + iD;
                        }
                    }
                    break;
                case 60:
                    if (r(obj, i10, i)) {
                        Object objI5 = n1.f688d.i(j4, obj);
                        v0 v0VarN3 = n(i);
                        Class cls5 = w0.f727a;
                        int iY8 = j.y(i10);
                        int iB2 = ((a) objI5).b(v0VarN3);
                        iD = q1.a.e(iB2, iB2, iY8, iD);
                    }
                    break;
                case 61:
                    if (r(obj, i10, i)) {
                        iU = j.r(i10, (f) n1.f688d.i(j4, obj));
                        iD += iU;
                    }
                    break;
                case 62:
                    if (r(obj, i10, i)) {
                        int iZ2 = z(j4, obj);
                        iY2 = j.y(i10);
                        iW = j.z(iZ2);
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 63:
                    if (r(obj, i10, i)) {
                        int iZ3 = z(j4, obj);
                        iY2 = j.y(i10);
                        iW = j.w(iZ3);
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    if (r(obj, i10, i)) {
                        iD = q1.a.d(i10, 4, iD);
                    }
                    break;
                case 65:
                    if (r(obj, i10, i)) {
                        iD = q1.a.d(i10, 8, iD);
                    }
                    break;
                case 66:
                    if (r(obj, i10, i)) {
                        int iZ4 = z(j4, obj);
                        iY2 = j.y(i10);
                        iW = j.z((iZ4 >> 31) ^ (iZ4 << 1));
                        iU = iW + iY2;
                        iD += iU;
                    }
                    break;
                case 67:
                    if (r(obj, i10, i)) {
                        long jA3 = A(j4, obj);
                        iY4 = j.y(i10);
                        iA2 = j.A((jA3 >> 63) ^ (jA3 << 1));
                        iU = iA2 + iY4;
                        iD += iU;
                    }
                    break;
                case 68:
                    if (r(obj, i10, i)) {
                        iU = j.v(i10, (a) n1.f688d.i(j4, obj), n(i));
                        iD += iU;
                    }
                    break;
            }
            i += 3;
        }
    }

    public final boolean q(int i, Object obj) {
        if (this.f679g) {
            int iH = H(i);
            long j4 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (n1.f688d.e(j4, obj) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (n1.f688d.f(j4, obj) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (n1.f688d.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (n1.f688d.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (n1.f688d.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (n1.f688d.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (n1.f688d.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return n1.f688d.c(j4, obj);
                case 8:
                    Object objI = n1.f688d.i(j4, obj);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof f) {
                        return !f.f631c.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (n1.f688d.i(j4, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !f.f631c.equals(n1.f688d.i(j4, obj));
                case 11:
                    if (n1.f688d.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (n1.f688d.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (n1.f688d.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (n1.f688d.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (n1.f688d.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (n1.f688d.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (n1.f688d.i(j4, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int i10 = this.f674a[i + 2];
            if ((n1.f688d.g(i10 & 1048575, obj) & (1 << (i10 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(Object obj, int i, int i10) {
        return n1.f688d.g((long) (this.f674a[i10 + 2] & 1048575), obj) == i;
    }

    public final void t(Object obj, int i, Object obj2, l lVar, h hVar) throws w {
        long jH = H(i) & 1048575;
        Object objI = n1.f688d.i(jH, obj);
        j0 j0Var = this.f684n;
        if (objI == null) {
            j0Var.getClass();
            objI = i0.f654b.b();
            n1.o(obj, jH, objI);
        } else {
            j0Var.getClass();
            if (!((i0) objI).f655a) {
                i0 i0VarB = i0.f654b.b();
                j0.b(i0VarB, objI);
                n1.o(obj, jH, i0VarB);
                objI = i0VarB;
            }
        }
        j0Var.getClass();
        i0 i0Var = (i0) objI;
        g0 g0Var = ((h0) obj2).f652a;
        hVar.T(2);
        g gVar = (g) hVar.f651d;
        int iE = gVar.e(gVar.A());
        Object obj3 = g0Var.f646c;
        Object objN = "";
        Object objN2 = obj3;
        while (true) {
            try {
                int iD = hVar.d();
                if (iD == Integer.MAX_VALUE || gVar.c()) {
                    break;
                }
                if (iD == 1) {
                    objN = hVar.n(g0Var.f644a, null, null);
                } else if (iD != 2) {
                    try {
                        if (!hVar.U()) {
                            throw new x("Unable to parse map entry.");
                        }
                    } catch (w unused) {
                        if (!hVar.U()) {
                            throw new x("Unable to parse map entry.");
                        }
                    }
                } else {
                    objN2 = hVar.n(g0Var.f645b, obj3.getClass(), lVar);
                }
            } catch (Throwable th) {
                gVar.d(iE);
                throw th;
            }
        }
        i0Var.put(objN, objN2);
        gVar.d(iE);
    }

    public final void u(int i, Object obj, Object obj2) {
        long jH = H(i) & 1048575;
        if (q(i, obj2)) {
            m1 m1Var = n1.f688d;
            Object objI = m1Var.i(jH, obj);
            Object objI2 = m1Var.i(jH, obj2);
            if (objI != null && objI2 != null) {
                n1.o(obj, jH, v.c(objI, objI2));
                E(i, obj);
            } else if (objI2 != null) {
                n1.o(obj, jH, objI2);
                E(i, obj);
            }
        }
    }

    public final void v(int i, Object obj, Object obj2) {
        int iH = H(i);
        int i10 = this.f674a[i];
        long j4 = iH & 1048575;
        if (r(obj2, i10, i)) {
            m1 m1Var = n1.f688d;
            Object objI = m1Var.i(j4, obj);
            Object objI2 = m1Var.i(j4, obj2);
            if (objI != null && objI2 != null) {
                n1.o(obj, j4, v.c(objI, objI2));
                F(obj, i10, i);
            } else if (objI2 != null) {
                n1.o(obj, j4, objI2);
                F(obj, i10, i);
            }
        }
    }
}
