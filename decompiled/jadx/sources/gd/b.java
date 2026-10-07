package gd;

import bd.m;
import bd.p;
import bd.v;
import bd.w;
import bd.x;
import bd.z;
import fd.k;
import java.io.IOException;
import java.net.ProtocolException;
import jc.i;
import od.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {
    @Override // bd.p
    public final x a(f fVar) throws Throwable {
        w wVarD;
        IOException iOException;
        fd.e eVar = fVar.f4538d;
        i.b(eVar);
        fd.i iVar = (fd.i) eVar.f3912b;
        d dVar = (d) eVar.f3914d;
        k kVar = (k) eVar.e;
        v vVar = fVar.e;
        bb.b bVar = (bb.b) vVar.e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                dVar.a(vVar);
                boolean z4 = true;
                try {
                    if (!android.support.v4.media.session.a.u((String) vVar.f1681b) || bVar == null) {
                        iVar.f(eVar, true, false, null);
                        wVarD = null;
                    } else {
                        if ("100-continue".equalsIgnoreCase(((m) vVar.f1683d).d("Expect"))) {
                            try {
                                dVar.f();
                                wVarD = eVar.d(true);
                            } catch (IOException e) {
                                eVar.e(e);
                                throw e;
                            }
                        } else {
                            wVarD = null;
                        }
                        if (wVarD == null) {
                            i.b(bVar);
                            long j4 = bVar.f1524b;
                            o oVar = new o(new fd.c(eVar, dVar.c(vVar, j4), j4));
                            byte[] bArr = (byte[]) bVar.f1526d;
                            int i = bVar.f1524b;
                            if (oVar.f7752c) {
                                throw new IllegalStateException("closed");
                            }
                            oVar.f7751b.S(i, bArr);
                            oVar.c();
                            oVar.close();
                        } else {
                            iVar.f(eVar, true, false, null);
                            if (kVar.f3942g == null) {
                                z4 = false;
                            }
                            if (!z4) {
                                dVar.e().k();
                            }
                        }
                    }
                    try {
                        dVar.b();
                        iOException = null;
                        if (wVarD == null) {
                            try {
                                wVarD = eVar.d(false);
                                i.b(wVarD);
                            } catch (IOException e4) {
                                if (iOException == null) {
                                    throw e4;
                                }
                                p3.a.a(iOException, e4);
                                throw iOException;
                            }
                        }
                        wVarD.f1686a = vVar;
                        wVarD.e = kVar.e;
                        wVarD.f1693k = jCurrentTimeMillis;
                        wVarD.f1694l = System.currentTimeMillis();
                        x xVarA = wVarD.a();
                        int i10 = xVarA.f1699d;
                        if (i10 == 100 || (102 <= i10 && i10 < 200)) {
                            w wVarD2 = eVar.d(false);
                            i.b(wVarD2);
                            wVarD2.f1686a = vVar;
                            wVarD2.e = kVar.e;
                            wVarD2.f1693k = jCurrentTimeMillis;
                            wVarD2.f1694l = System.currentTimeMillis();
                            xVarA = wVarD2.a();
                            i10 = xVarA.f1699d;
                        }
                        w wVarG = xVarA.g();
                        try {
                            String strC = x.c(xVarA, "Content-Type");
                            long jH = dVar.h(xVarA);
                            wVarG.f1691g = new g(strC, jH, new od.p(new fd.d(eVar, dVar.g(xVarA), jH)));
                            x xVarA2 = wVarG.a();
                            if ("close".equalsIgnoreCase(((m) xVarA2.f1696a.f1683d).d("Connection")) || "close".equalsIgnoreCase(x.c(xVarA2, "Connection"))) {
                                dVar.e().k();
                            }
                            if (i10 == 204 || i10 == 205) {
                                z zVar = xVarA2.f1701r;
                                if ((zVar != null ? zVar.c() : -1L) > 0) {
                                    StringBuilder sb2 = new StringBuilder("HTTP ");
                                    sb2.append(i10);
                                    sb2.append(" had non-zero Content-Length: ");
                                    z zVar2 = xVarA2.f1701r;
                                    sb2.append(zVar2 != null ? Long.valueOf(zVar2.c()) : null);
                                    throw new ProtocolException(sb2.toString());
                                }
                            }
                            return xVarA2;
                        } catch (IOException e10) {
                            eVar.e(e10);
                            throw e10;
                        }
                    } catch (IOException e11) {
                        eVar.e(e11);
                        throw e11;
                    }
                } catch (IOException e12) {
                    e = e12;
                    if (!(e instanceof id.a) || !eVar.f3911a) {
                        throw e;
                    }
                    iOException = e;
                }
            } catch (IOException e13) {
                eVar.e(e13);
                throw e13;
            }
        } catch (IOException e14) {
            e = e14;
            wVarD = null;
            if (!(e instanceof id.a)) {
                throw e;
            }
            throw e;
        }
    }
}
