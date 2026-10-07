package okhttp3.internal.publicsuffix;

import androidx.webkit.ProxyConfig;
import b9.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import jc.i;
import jd.d;
import jd.n;
import oc.b;
import od.k;
import od.m;
import od.p;
import od.x;
import pc.g;
import q1.a;
import vb.j;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f7771f = d.D(ProxyConfig.MATCH_ALL_SCHEMES);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f7772g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f7773a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f7774b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f7775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f7776d;

    public static List c(String str) {
        List listV0 = g.v0(str, new char[]{'.'}, 6);
        if (listV0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!i.a(listV0.get(j.R(listV0)), "")) {
            return listV0;
        }
        int size = listV0.size() - 1;
        return vb.i.j0(size >= 0 ? size : 0, listV0);
    }

    public final String a(String str) {
        String strQ;
        String strQ2;
        String strQ3;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        i.d(unicode, "unicodeDomain");
        List listC = c(unicode);
        List listV0 = q.f9297a;
        if (this.f7773a.get() || !this.f7773a.compareAndSet(false, true)) {
            try {
                this.f7774b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z4 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z4 = true;
                    } catch (IOException e4) {
                        n nVar = n.f5799a;
                        n.f5799a.getClass();
                        n.i(5, "Failed to read public suffix list", e4);
                        if (z4) {
                        }
                    }
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f7775c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            String str2 = (String) listC.get(i);
            Charset charset = StandardCharsets.UTF_8;
            i.d(charset, "UTF_8");
            byte[] bytes = str2.getBytes(charset);
            i.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                strQ = null;
                break;
            }
            byte[] bArr2 = this.f7775c;
            if (bArr2 == null) {
                i.i("publicSuffixListBytes");
                throw null;
            }
            strQ = e.q(bArr2, bArr, i10);
            if (strQ != null) {
                break;
            }
            i10++;
        }
        if (size3 <= 1) {
            strQ2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                strQ2 = null;
                break;
            }
            bArr3[i11] = e;
            byte[] bArr4 = this.f7775c;
            if (bArr4 == null) {
                i.i("publicSuffixListBytes");
                throw null;
            }
            strQ2 = e.q(bArr4, bArr3, i11);
            if (strQ2 != null) {
                break;
            }
            i11++;
        }
        if (strQ2 == null) {
            strQ3 = null;
            break;
        }
        int i12 = size3 - 1;
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                strQ3 = null;
                break;
            }
            byte[] bArr5 = this.f7776d;
            if (bArr5 == null) {
                i.i("publicSuffixExceptionListBytes");
                throw null;
            }
            strQ3 = e.q(bArr5, bArr, i13);
            if (strQ3 != null) {
                break;
            }
            i13++;
        }
        if (strQ3 != null) {
            listV0 = g.v0("!".concat(strQ3), new char[]{'.'}, 6);
        } else if (strQ == null && strQ2 == null) {
            listV0 = f7771f;
        } else {
            List listV1 = strQ != null ? g.v0(strQ, new char[]{'.'}, 6) : listV0;
            if (strQ2 != null) {
                listV0 = g.v0(strQ2, new char[]{'.'}, 6);
            }
            if (listV1.size() > listV0.size()) {
                listV0 = listV1;
            }
        }
        if (listC.size() == listV0.size() && ((String) listV0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listV0.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listV0.size();
        } else {
            size = listC.size();
            size2 = listV0.size() + 1;
        }
        int i14 = size - size2;
        oc.e dVar = new oc.d(c(str), 4);
        if (i14 < 0) {
            throw new IllegalArgumentException(a.j(i14, "Requested element count ", " is less than zero.").toString());
        }
        if (i14 != 0) {
            dVar = new b(dVar, i14);
        }
        return oc.g.T(dVar, ".");
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = m.f7747a;
                p pVar = new p(new k(new od.d(1, resourceAsStream, new x())));
                try {
                    long j4 = pVar.readInt();
                    pVar.P(j4);
                    byte[] bArrB = pVar.f7754b.B(j4);
                    long j10 = pVar.readInt();
                    pVar.P(j10);
                    byte[] bArrB2 = pVar.f7754b.B(j10);
                    pVar.close();
                    synchronized (this) {
                        this.f7775c = bArrB;
                        this.f7776d = bArrB2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r7.g.h(pVar, th);
                        throw th2;
                    }
                }
            }
            this.f7774b.countDown();
        } catch (Throwable th3) {
            this.f7774b.countDown();
            throw th3;
        }
    }
}
