package gd;

import bd.a0;
import bd.l;
import bd.m;
import bd.n;
import bd.o;
import bd.p;
import bd.q;
import bd.s;
import bd.u;
import bd.v;
import bd.w;
import bd.x;
import bd.z;
import ea.j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import jc.i;
import od.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4532a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4533b;

    public a(bd.b bVar) {
        i.e(bVar, "cookieJar");
        this.f4533b = bVar;
    }

    public static int d(x xVar, int i) {
        String strC = x.c(xVar, "Retry-After");
        if (strC == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        i.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strC).matches()) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        Integer numValueOf = Integer.valueOf(strC);
        i.d(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // bd.p
    public final x a(f fVar) {
        z zVar;
        x xVarB;
        SSLSocketFactory sSLSocketFactory;
        nd.c cVar;
        bd.e eVar;
        switch (this.f4532a) {
            case 0:
                bd.b bVar = (bd.b) this.f4533b;
                v vVar = fVar.e;
                m mVar = (m) vVar.f1683d;
                u uVarL = vVar.l();
                o oVar = (o) vVar.f1682c;
                bb.b bVar2 = (bb.b) vVar.e;
                if (bVar2 != null) {
                    q qVar = (q) bVar2.f1525c;
                    if (qVar != null) {
                        uVarL.f("Content-Type", qVar.f1634a);
                    }
                    long j4 = bVar2.f1524b;
                    if (j4 != -1) {
                        uVarL.f("Content-Length", String.valueOf(j4));
                        ((l) uVarL.f1678d).c("Transfer-Encoding");
                    } else {
                        uVarL.f("Transfer-Encoding", "chunked");
                        ((l) uVarL.f1678d).c("Content-Length");
                    }
                }
                boolean z4 = false;
                if (mVar.d("Host") == null) {
                    uVarL.f("Host", cd.b.v(oVar, false));
                }
                if (mVar.d("Connection") == null) {
                    uVarL.f("Connection", "Keep-Alive");
                }
                if (mVar.d("Accept-Encoding") == null && mVar.d("Range") == null) {
                    uVarL.f("Accept-Encoding", "gzip");
                    z4 = true;
                }
                bVar.getClass();
                i.e(oVar, "url");
                if (mVar.d("User-Agent") == null) {
                    uVarL.f("User-Agent", "okhttp/4.12.0");
                }
                x xVarB2 = fVar.b(uVarL.a());
                m mVar2 = xVarB2.f1700f;
                e.b(bVar, oVar, mVar2);
                w wVarG = xVarB2.g();
                wVarG.f1686a = vVar;
                if (z4 && "gzip".equalsIgnoreCase(x.c(xVarB2, "Content-Encoding")) && e.a(xVarB2) && (zVar = xVarB2.f1701r) != null) {
                    k kVar = new k(zVar.g());
                    l lVarH = mVar2.h();
                    lVarH.c("Content-Encoding");
                    lVarH.c("Content-Length");
                    wVarG.f1690f = lVarH.b().h();
                    wVarG.f1691g = new g(x.c(xVarB2, "Content-Type"), -1L, new od.p(kVar));
                }
                return wVarG.a();
            default:
                v vVar2 = fVar.e;
                fd.i iVar = fVar.f4535a;
                List listG0 = vb.q.f9297a;
                x xVar = null;
                int i = 0;
                v vVarB = vVar2;
                while (true) {
                    boolean z10 = true;
                    while (true) {
                        if (iVar.f3930t != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (iVar) {
                            try {
                                if (iVar.f3932v) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (iVar.f3931u) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z10) {
                            fd.l lVar = iVar.f3925c;
                            o oVar2 = (o) vVarB.f1682c;
                            s sVar = iVar.f3923a;
                            if (oVar2.i) {
                                SSLSocketFactory sSLSocketFactory2 = sVar.A;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                nd.c cVar2 = sVar.E;
                                eVar = sVar.F;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                eVar = null;
                            }
                            iVar.f3928r = new fd.f(lVar, new bd.a(oVar2.f1629d, oVar2.e, sVar.f1663v, sVar.f1667z, sSLSocketFactory, cVar, eVar, sVar.f1666y, sVar.f1664w, sVar.D, sVar.C, sVar.f1665x), iVar);
                        }
                        try {
                            if (iVar.f3934x) {
                                throw new IOException("Canceled");
                            }
                            try {
                                xVarB = fVar.b(vVarB);
                            } catch (fd.m e) {
                                if (!c(e.f3956b, iVar, vVarB, false)) {
                                    IOException iOException = e.f3955a;
                                    i.e(iOException, "<this>");
                                    Iterator it = listG0.iterator();
                                    while (it.hasNext()) {
                                        p3.a.a(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                listG0 = vb.i.g0(listG0, e.f3955a);
                                iVar.d(true);
                                z10 = false;
                            } catch (IOException e4) {
                                if (!c(e4, iVar, vVarB, !(e4 instanceof id.a))) {
                                    Iterator it2 = listG0.iterator();
                                    while (it2.hasNext()) {
                                        p3.a.a(e4, (Exception) it2.next());
                                    }
                                    throw e4;
                                }
                                listG0 = vb.i.g0(listG0, e4);
                                iVar.d(true);
                                z10 = false;
                            }
                        } catch (Throwable th2) {
                            iVar.d(true);
                            throw th2;
                        }
                        break;
                    }
                    if (xVar != null) {
                        w wVarG2 = xVarB.g();
                        w wVarG3 = xVar.g();
                        wVarG3.f1691g = null;
                        x xVarA = wVarG3.a();
                        if (xVarA.f1701r != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        wVarG2.f1692j = xVarA;
                        xVarB = wVarG2.a();
                    }
                    xVar = xVarB;
                    vVarB = b(xVar, iVar.f3930t);
                    if (vVarB == null) {
                        iVar.d(false);
                        return xVar;
                    }
                    z zVar2 = xVar.f1701r;
                    if (zVar2 != null) {
                        cd.b.d(zVar2);
                    }
                    i++;
                    if (i > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i);
                    }
                    iVar.d(true);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x011e  */
    /* JADX WARN: Code duplicated, block: B:98:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0131  */
    public v b(x xVar, fd.e eVar) throws ProtocolException {
        s sVar;
        String strC;
        v vVar;
        n nVar;
        o oVarA;
        u uVarL;
        boolean z4;
        x xVar2;
        fd.k kVar;
        a0 a0Var = (eVar == null || (kVar = (fd.k) eVar.e) == null) ? null : kVar.f3938b;
        int i = xVar.f1699d;
        String str = (String) xVar.f1696a.f1681b;
        if (i == 307 || i == 308) {
            sVar = (s) this.f4533b;
            if (sVar.f1660s) {
                strC = x.c(xVar, "Location");
                vVar = xVar.f1696a;
                if (strC != null) {
                    o oVar = (o) vVar.f1682c;
                    oVar.getClass();
                    try {
                        nVar = new n();
                        nVar.i(oVar, strC);
                    } catch (IllegalArgumentException unused) {
                        nVar = null;
                    }
                    if (nVar != null) {
                        oVarA = nVar.a();
                    } else {
                        oVarA = null;
                    }
                    if (oVarA != null && (i.a(oVarA.f1626a, ((o) vVar.f1682c).f1626a) || sVar.f1661t)) {
                        uVarL = vVar.l();
                        if (android.support.v4.media.session.a.u(str)) {
                            int i10 = xVar.f1699d;
                            z4 = !str.equals("PROPFIND") || i10 == 308 || i10 == 307;
                            if (!str.equals("PROPFIND") || i10 == 308 || i10 == 307) {
                                uVarL.h(str, z4 ? (bb.b) vVar.e : null);
                            } else {
                                uVarL.h("GET", null);
                            }
                            if (!z4) {
                                ((l) uVarL.f1678d).c("Transfer-Encoding");
                                ((l) uVarL.f1678d).c("Content-Length");
                                ((l) uVarL.f1678d).c("Content-Type");
                            }
                        }
                        if (!cd.b.a((o) vVar.f1682c, oVarA)) {
                            ((l) uVarL.f1678d).c("Authorization");
                        }
                        uVarL.f1677c = oVarA;
                        return uVarL.a();
                    }
                }
            }
        } else {
            if (i == 401) {
                ((s) this.f4533b).f1659r.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    x xVar3 = xVar.f1704u;
                    if ((xVar3 == null || xVar3.f1699d != 503) && d(xVar, com.google.android.gms.common.api.f.API_PRIORITY_OTHER) == 0) {
                        return xVar.f1696a;
                    }
                } else {
                    if (i == 407) {
                        i.b(a0Var);
                        if (a0Var.f1548b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((s) this.f4533b).f1666y.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                sVar = (s) this.f4533b;
                                if (sVar.f1660s) {
                                    strC = x.c(xVar, "Location");
                                    vVar = xVar.f1696a;
                                    if (strC != null) {
                                        o oVar2 = (o) vVar.f1682c;
                                        oVar2.getClass();
                                        nVar = new n();
                                        nVar.i(oVar2, strC);
                                        if (nVar != null) {
                                            oVarA = nVar.a();
                                        } else {
                                            oVarA = null;
                                        }
                                        if (oVarA != null) {
                                            uVarL = vVar.l();
                                            if (android.support.v4.media.session.a.u(str)) {
                                                int i11 = xVar.f1699d;
                                                if (str.equals("PROPFIND")) {
                                                }
                                                if (str.equals("PROPFIND")) {
                                                    uVarL.h(str, z4 ? (bb.b) vVar.e : null);
                                                } else {
                                                    uVarL.h(str, z4 ? (bb.b) vVar.e : null);
                                                }
                                                if (!z4) {
                                                    ((l) uVarL.f1678d).c("Transfer-Encoding");
                                                    ((l) uVarL.f1678d).c("Content-Length");
                                                    ((l) uVarL.f1678d).c("Content-Type");
                                                }
                                            }
                                            if (!cd.b.a((o) vVar.f1682c, oVarA)) {
                                                ((l) uVarL.f1678d).c("Authorization");
                                            }
                                            uVarL.f1677c = oVarA;
                                            return uVarL.a();
                                        }
                                    }
                                }
                            default:
                                return null;
                        }
                    } else if (((s) this.f4533b).f1658f && (((xVar2 = xVar.f1704u) == null || xVar2.f1699d != 408) && d(xVar, 0) <= 0)) {
                        return xVar.f1696a;
                    }
                }
            } else if (eVar != null && !i.a(((fd.f) eVar.f3913c).f3916b.i.f1629d, ((fd.k) eVar.e).f3938b.f1547a.i.f1629d)) {
                fd.k kVar2 = (fd.k) eVar.e;
                synchronized (kVar2) {
                    kVar2.f3944k = true;
                }
                return xVar.f1696a;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0049  */
    /* JADX WARN: Code duplicated, block: B:36:0x004e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0051  */
    /* JADX WARN: Code duplicated, block: B:49:0x0066 A[ADDED_TO_REGION, DONT_GENERATE, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:51:0x0068 A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:47:0x0062, B:51:0x0068, B:55:0x007a), top: B:76:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0083  */
    /* JADX WARN: Code duplicated, block: B:63:0x0085  */
    /* JADX WARN: Code duplicated, block: B:64:0x0087  */
    /* JADX WARN: Code duplicated, block: B:66:0x008b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0092  */
    /* JADX WARN: Code duplicated, block: B:75:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public boolean c(IOException iOException, fd.i iVar, v vVar, boolean z4) {
        fd.f fVar;
        int i;
        boolean zJ;
        a0 a0Var;
        j jVar;
        fd.n nVar;
        fd.k kVar;
        if (!((s) this.f4533b).f1658f || ((z4 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            fVar = iVar.f3928r;
            i.b(fVar);
            i = fVar.f3919f;
            if (i != 0) {
                if (fVar.i != null) {
                    zJ = true;
                } else {
                    a0Var = null;
                    if (i <= 1) {
                        synchronized (kVar) {
                            if (kVar.f3945l != 0) {
                                a0Var = kVar.f3938b;
                            }
                        }
                    }
                    if (a0Var != null) {
                        fVar.i = a0Var;
                    } else {
                        jVar = fVar.f3918d;
                        zJ = jVar != null ? nVar.j() : nVar.j();
                    }
                    zJ = true;
                }
            } else if (fVar.i != null) {
                zJ = true;
            } else {
                a0Var = null;
                if (i <= 1) {
                    synchronized (kVar) {
                        if (kVar.f3945l != 0) {
                            a0Var = kVar.f3938b;
                        }
                    }
                }
                if (a0Var != null) {
                    fVar.i = a0Var;
                } else {
                    jVar = fVar.f3918d;
                    if (jVar != null) {
                    }
                }
                zJ = true;
            }
            if (!zJ) {
                return true;
            }
        } else if ((iOException instanceof SocketTimeoutException) && !z4) {
            fVar = iVar.f3928r;
            i.b(fVar);
            i = fVar.f3919f;
            if (i != 0 && fVar.f3920g == 0 && fVar.h == 0) {
                zJ = false;
            } else if (fVar.i != null) {
                zJ = true;
            } else {
                a0Var = null;
                if (i <= 1 && fVar.f3920g <= 1 && fVar.h <= 0 && (kVar = fVar.f3917c.f3929s) != null) {
                    synchronized (kVar) {
                        if (kVar.f3945l != 0 && cd.b.a(kVar.f3938b.f1547a.i, fVar.f3916b.i)) {
                            a0Var = kVar.f3938b;
                        }
                    }
                }
                if (a0Var != null) {
                    fVar.i = a0Var;
                } else {
                    jVar = fVar.f3918d;
                    if ((jVar != null || !jVar.d()) && (nVar = fVar.e) != null) {
                    }
                }
                zJ = true;
            }
            if (!zJ) {
                return true;
            }
        }
        return false;
    }

    public a(s sVar) {
        this.f4533b = sVar;
    }
}
