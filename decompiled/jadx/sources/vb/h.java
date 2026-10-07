package vb;

import fa.c1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends c1 {
    public static List H(Object[] objArr) {
        jc.i.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        jc.i.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static void I(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        jc.i.e(iArr, "<this>");
        jc.i.e(iArr2, "destination");
        System.arraycopy(iArr, i10, iArr2, i, i11 - i10);
    }

    public static void J(byte[] bArr, int i, byte[] bArr2, int i10, int i11) {
        jc.i.e(bArr, "<this>");
        jc.i.e(bArr2, "destination");
        System.arraycopy(bArr, i10, bArr2, i, i11 - i10);
    }

    public static void K(Object[] objArr, int i, Object[] objArr2, int i10, int i11) {
        jc.i.e(objArr, "<this>");
        jc.i.e(objArr2, "destination");
        System.arraycopy(objArr, i10, objArr2, i, i11 - i10);
    }

    public static /* synthetic */ void L(Object[] objArr, int i, Object[] objArr2, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i = 0;
        }
        K(objArr, 0, objArr2, i, i10);
    }

    public static Object[] M(Object[] objArr, int i, int i10) {
        jc.i.e(objArr, "<this>");
        c1.n(i10, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i10);
        jc.i.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void N(Object[] objArr, int i, int i10) {
        jc.i.e(objArr, "<this>");
        Arrays.fill(objArr, i, i10, (Object) null);
    }

    public static ArrayList O(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static String P(int i, Object[] objArr) {
        String str = (i & 1) != 0 ? ", " : ",";
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            com.bumptech.glide.c.b(sb2, obj, null);
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static List Q(byte[] bArr) {
        if (255 >= bArr.length) {
            return R(bArr);
        }
        ArrayList arrayList = new ArrayList(255);
        int i = 0;
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
            i++;
            if (i == 255) {
                break;
            }
        }
        return arrayList;
    }

    public static List R(byte[] bArr) {
        jc.i.e(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return q.f9297a;
        }
        if (length == 1) {
            return jd.d.D(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static List S(long[] jArr) {
        jc.i.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return q.f9297a;
        }
        if (length == 1) {
            return jd.d.D(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j4 : jArr) {
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    public static List T(Object[] objArr) {
        jc.i.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new f(objArr, false)) : jd.d.D(objArr[0]);
        }
        return q.f9297a;
    }

    public static ArrayList U(int[] iArr) {
        jc.i.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
