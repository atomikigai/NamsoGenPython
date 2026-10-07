package cd;

import androidx.webkit.ProxyConfig;
import bd.m;
import bd.o;
import bd.s;
import bd.x;
import bd.y;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import jc.t;
import jd.l;
import od.h;
import od.i;
import od.n;
import od.v;
import pc.f;
import pc.g;
import vb.j;
import z9.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f1822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f1823b = qd.b.x(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f1824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f1825d;
    public static final TimeZone e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f1826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f1827g;

    static {
        int i;
        int i10 = 0;
        byte[] bArr = new byte[0];
        f1822a = bArr;
        od.f fVar = new od.f();
        fVar.S(0, bArr);
        long j4 = 0;
        f1824c = new y(j4, fVar);
        c(j4, j4, j4);
        i iVar = i.f7735d;
        i[] iVarArr = {c.k("efbbbf"), c.k("feff"), c.k("fffe"), c.k("0000ffff"), c.k("ffff0000")};
        ArrayList arrayList = new ArrayList(new vb.f(iVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i11 = 0; i11 < 5; i11++) {
            i iVar2 = iVarArr[i11];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] objArrCopyOf = Arrays.copyOf(numArr, numArr.length);
        jc.i.e(objArrCopyOf, "elements");
        ArrayList arrayList3 = objArrCopyOf.length == 0 ? new ArrayList() : new ArrayList(new vb.f(objArrCopyOf, true));
        int i12 = 0;
        int i13 = 0;
        while (i12 < 5) {
            i iVar3 = iVarArr[i12];
            int i14 = i13 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException(q1.a.j(size, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i15 = size - 1;
            int i16 = 0;
            while (true) {
                if (i16 > i15) {
                    i = -(i16 + 1);
                    break;
                }
                i = (i16 + i15) >>> 1;
                int iF = l.f((Comparable) arrayList.get(i), iVar3);
                if (iF < 0) {
                    i16 = i + 1;
                } else if (iF <= 0) {
                    break;
                } else {
                    i15 = i - 1;
                }
            }
            arrayList3.set(i, Integer.valueOf(i13));
            i12++;
            i13 = i14;
        }
        if (((i) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i17 = 0;
        while (i17 < arrayList.size()) {
            i iVar4 = (i) arrayList.get(i17);
            int i18 = i17 + 1;
            int i19 = i18;
            while (i19 < arrayList.size()) {
                i iVar5 = (i) arrayList.get(i19);
                iVar5.getClass();
                jc.i.e(iVar4, "prefix");
                if (!iVar5.f(iVar4, iVar4.a())) {
                    break;
                }
                if (iVar5.a() == iVar4.a()) {
                    throw new IllegalArgumentException(("duplicate option: " + iVar5).toString());
                }
                if (((Number) arrayList3.get(i19)).intValue() > ((Number) arrayList3.get(i17)).intValue()) {
                    arrayList.remove(i19);
                    arrayList3.remove(i19);
                } else {
                    i19++;
                }
            }
            i17 = i18;
        }
        od.f fVar2 = new od.f();
        n9.b.c(0L, fVar2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (fVar2.f7734b / ((long) 4))];
        while (!fVar2.d()) {
            iArr[i10] = fVar2.readInt();
            i10++;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(iVarArr, 5);
        jc.i.d(objArrCopyOf2, "copyOf(this, size)");
        f1825d = new n((i[]) objArrCopyOf2, iArr);
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        jc.i.b(timeZone);
        e = timeZone;
        f1826f = new f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f1827g = g.s0(g.r0(s.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(o oVar, o oVar2) {
        jc.i.e(oVar, "<this>");
        jc.i.e(oVar2, "other");
        return jc.i.a(oVar.f1629d, oVar2.f1629d) && oVar.e == oVar2.e && jc.i.a(oVar.f1626a, oVar2.f1626a);
    }

    public static final int b(long j4, TimeUnit timeUnit) {
        if (j4 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j4);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j4 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(long j4, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j4 || j4 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        jc.i.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        jc.i.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e10) {
            if (!jc.i.a(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(int i, int i10, String str, String str2) {
        while (i < i10) {
            if (g.g0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final int g(String str, char c10, int i, int i10) {
        while (i < i10) {
            if (str.charAt(i) == c10) {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final String h(String str, Object... objArr) {
        jc.i.e(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        jc.i.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                jc.a aVarC = t.c(strArr2);
                while (aVarC.hasNext()) {
                    if (comparator.compare(str, (String) aVarC.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(x xVar) {
        String strD = xVar.f1700f.d("Content-Length");
        if (strD == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strD);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        jc.i.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(j.S(Arrays.copyOf(objArr2, objArr2.length)));
        jc.i.d(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (jc.i.f(cCharAt, 31) <= 0 || jc.i.f(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i10, String str) {
        while (i < i10) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i10;
    }

    public static final int n(int i, int i10, String str) {
        int i11 = i10 - 1;
        if (i <= i11) {
            while (true) {
                char cCharAt = str.charAt(i11);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i11 + 1;
                }
                if (i11 != i) {
                    i11--;
                }
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        jc.i.e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        jc.i.e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset r(h hVar, Charset charset) {
        jc.i.e(hVar, "<this>");
        jc.i.e(charset, "default");
        int iL = hVar.L(f1825d);
        if (iL == -1) {
            return charset;
        }
        if (iL == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            jc.i.d(charset2, "UTF_8");
            return charset2;
        }
        if (iL == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            jc.i.d(charset3, "UTF_16BE");
            return charset3;
        }
        if (iL == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            jc.i.d(charset4, "UTF_16LE");
            return charset4;
        }
        if (iL == 3) {
            Charset charset5 = pc.a.f7846a;
            Charset charset6 = pc.a.f7849d;
            if (charset6 != null) {
                return charset6;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            jc.i.d(charsetForName, "forName(...)");
            pc.a.f7849d = charsetForName;
            return charsetForName;
        }
        if (iL != 4) {
            throw new AssertionError();
        }
        Charset charset7 = pc.a.f7846a;
        Charset charset8 = pc.a.f7848c;
        if (charset8 != null) {
            return charset8;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        jc.i.d(charsetForName2, "forName(...)");
        pc.a.f7848c = charsetForName2;
        return charsetForName2;
    }

    public static final int s(h hVar) {
        jc.i.e(hVar, "<this>");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static final boolean t(v vVar, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jc.i.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = vVar.a().e() ? vVar.a().c() - jNanoTime : Long.MAX_VALUE;
        vVar.a().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            od.f fVar = new od.f();
            while (vVar.t(8192L, fVar) != -1) {
                fVar.skip(fVar.f7734b);
            }
            if (jC == Long.MAX_VALUE) {
                vVar.a().a();
                return true;
            }
            vVar.a().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                vVar.a().a();
                return false;
            }
            vVar.a().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                vVar.a().a();
            } else {
                vVar.a().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final m u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            id.b bVar = (id.b) it.next();
            i iVar = bVar.f5262a;
            i iVar2 = bVar.f5263b;
            String strH = iVar.h();
            String strH2 = iVar2.h();
            arrayList.add(strH);
            arrayList.add(g.B0(strH2).toString());
        }
        return new m((String[]) arrayList.toArray(new String[0]));
    }

    public static final String v(o oVar, boolean z4) {
        int i;
        jc.i.e(oVar, "<this>");
        int i10 = oVar.e;
        String str = oVar.f1629d;
        if (g.f0(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z4) {
            String str2 = oVar.f1626a;
            jc.i.e(str2, "scheme");
            if (str2.equals(ProxyConfig.MATCH_HTTP)) {
                i = 80;
            } else {
                i = str2.equals(ProxyConfig.MATCH_HTTPS) ? 443 : -1;
            }
            if (i10 == i) {
                return str;
            }
        }
        return str + ':' + i10;
    }

    public static final List w(List list) {
        jc.i.e(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        jc.i.d(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int x(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j4 = Long.parseLong(str);
            if (j4 > 2147483647L) {
                return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            }
            if (j4 < 0) {
                return 0;
            }
            return (int) j4;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String y(int i, int i10, String str) {
        int iM = m(i, i10, str);
        String strSubstring = str.substring(iM, n(iM, i10, str));
        jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
