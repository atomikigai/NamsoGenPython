package bd;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f1632c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f1633d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f1635b;

    public q(String str, String[] strArr) {
        this.f1634a = str;
        this.f1635b = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f1635b;
        int i = 0;
        int iK = jd.l.k(0, strArr.length - 1, 2);
        if (iK < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!pc.o.a0(strArr[i], "charset")) {
                if (i == iK) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && jc.i.a(((q) obj).f1634a, this.f1634a);
    }

    public final int hashCode() {
        return this.f1634a.hashCode();
    }

    public final String toString() {
        return this.f1634a;
    }
}
