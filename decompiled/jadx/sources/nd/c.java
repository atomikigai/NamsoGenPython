package nd;

import androidx.webkit.ProxyConfig;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import jc.i;
import pc.f;
import pc.g;
import pc.o;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7404a = new c();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && i.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return q.f9297a;
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(q1.a.j(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j4 = 0;
        int i10 = 0;
        while (i10 < length2) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                j4++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i11 = i10 + 1;
                    char cCharAt2 = i11 < length2 ? str.charAt(i11) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j4++;
                        i10 = i11;
                    } else {
                        j4 += (long) 4;
                        i10 += 2;
                    }
                }
                j4 += (long) i;
            }
            i10++;
        }
        return length == ((int) j4);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00fc  */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean zA;
        int length;
        i.e(str, "host");
        byte[] bArr = cd.b.f1822a;
        f fVar = cd.b.f1826f;
        fVar.getClass();
        if (fVar.f7863a.matcher(str).matches()) {
            String strD = n9.b.D(str);
            List listA = a(x509Certificate, 7);
            if (!listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (i.a(strD, n9.b.D((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            i.d(locale, "US");
            str = str.toLowerCase(locale);
            i.d(str, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> listA2 = a(x509Certificate, 2);
        if (!listA2.isEmpty()) {
            for (String lowerCase : listA2) {
                if (str.length() == 0 || o.e0(str, ".", false) || o.Z(str, "..") || lowerCase == null || lowerCase.length() == 0 || o.e0(lowerCase, ".", false) || o.Z(lowerCase, "..")) {
                    zA = false;
                } else {
                    String strConcat = !o.Z(str, ".") ? str.concat(".") : str;
                    if (!o.Z(lowerCase, ".")) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (b(lowerCase)) {
                        Locale locale2 = Locale.US;
                        i.d(locale2, "US");
                        lowerCase = lowerCase.toLowerCase(locale2);
                        i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!g.f0(lowerCase, ProxyConfig.MATCH_ALL_SCHEMES, false)) {
                        zA = i.a(strConcat, lowerCase);
                    } else if (!o.e0(lowerCase, "*.", false) || g.j0(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zA = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                        if (o.Z(strConcat, strSubstring) && ((length = strConcat.length() - strSubstring.length()) <= 0 || g.n0(strConcat, '.', length - 1, 4) == -1)) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        i.e(str, "host");
        i.e(sSLSession, "session");
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                i.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
