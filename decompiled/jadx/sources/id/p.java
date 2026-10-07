package id;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements gd.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f5311g = cd.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = cd.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.k f5312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gd.f f5313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f5314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile w f5315d;
    public final bd.t e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f5316f;

    public p(bd.s sVar, fd.k kVar, gd.f fVar, o oVar) {
        jc.i.e(oVar, "http2Connection");
        this.f5312a = kVar;
        this.f5313b = fVar;
        this.f5314c = oVar;
        List list = sVar.D;
        bd.t tVar = bd.t.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(tVar) ? tVar : bd.t.HTTP_2;
    }

    @Override // gd.d
    public final void a(bd.v vVar) throws IOException {
        int i;
        w wVar;
        boolean z4;
        if (this.f5315d != null) {
            return;
        }
        boolean z10 = ((bb.b) vVar.e) != null;
        bd.m mVar = (bd.m) vVar.f1683d;
        ArrayList arrayList = new ArrayList(mVar.size() + 4);
        arrayList.add(new b(b.f5260f, (String) vVar.f1681b));
        od.i iVar = b.f5261g;
        bd.o oVar = (bd.o) vVar.f1682c;
        jc.i.e(oVar, "url");
        String strB = oVar.b();
        String strD = oVar.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new b(iVar, strB));
        String strD2 = ((bd.m) vVar.f1683d).d("Host");
        if (strD2 != null) {
            arrayList.add(new b(b.i, strD2));
        }
        arrayList.add(new b(b.h, oVar.f1626a));
        int size = mVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strG = mVar.g(i10);
            Locale locale = Locale.US;
            jc.i.d(locale, "US");
            String lowerCase = strG.toLowerCase(locale);
            jc.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f5311g.contains(lowerCase) || (lowerCase.equals("te") && jc.i.a(mVar.i(i10), "trailers"))) {
                arrayList.add(new b(lowerCase, mVar.i(i10)));
            }
        }
        o oVar2 = this.f5314c;
        oVar2.getClass();
        boolean z11 = !z10;
        synchronized (oVar2.H) {
            synchronized (oVar2) {
                try {
                    if (oVar2.e > 1073741823) {
                        oVar2.o(8);
                    }
                    if (oVar2.f5301f) {
                        throw new a();
                    }
                    i = oVar2.e;
                    oVar2.e = i + 2;
                    wVar = new w(i, oVar2, z11, false, null);
                    z4 = !z10 || oVar2.E >= oVar2.F || wVar.e >= wVar.f5340f;
                    if (wVar.h()) {
                        oVar2.f5298b.put(Integer.valueOf(i), wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oVar2.H.B(z11, i, arrayList);
        }
        if (z4) {
            oVar2.H.flush();
        }
        this.f5315d = wVar;
        if (this.f5316f) {
            w wVar2 = this.f5315d;
            jc.i.b(wVar2);
            wVar2.e(9);
            throw new IOException("Canceled");
        }
        w wVar3 = this.f5315d;
        jc.i.b(wVar3);
        v vVar2 = wVar3.f5343k;
        long j4 = this.f5313b.f4540g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVar2.g(j4);
        w wVar4 = this.f5315d;
        jc.i.b(wVar4);
        wVar4.f5344l.g(this.f5313b.h);
    }

    @Override // gd.d
    public final void b() {
        w wVar = this.f5315d;
        jc.i.b(wVar);
        wVar.f().close();
    }

    @Override // gd.d
    public final od.t c(bd.v vVar, long j4) {
        w wVar = this.f5315d;
        jc.i.b(wVar);
        return wVar.f();
    }

    @Override // gd.d
    public final void cancel() {
        this.f5316f = true;
        w wVar = this.f5315d;
        if (wVar != null) {
            wVar.e(9);
        }
    }

    @Override // gd.d
    public final bd.w d(boolean z4) throws IOException {
        bd.m mVar;
        w wVar = this.f5315d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.f5343k.h();
            while (wVar.f5341g.isEmpty() && wVar.f5345m == 0) {
                try {
                    try {
                        wVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    wVar.f5343k.k();
                    throw th;
                }
            }
            wVar.f5343k.k();
            if (wVar.f5341g.isEmpty()) {
                IOException iOException = wVar.f5346n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = wVar.f5345m;
                da.v.p(i);
                throw new b0(i);
            }
            Object objRemoveFirst = wVar.f5341g.removeFirst();
            jc.i.d(objRemoveFirst, "headersQueue.removeFirst()");
            mVar = (bd.m) objRemoveFirst;
        }
        bd.t tVar = this.e;
        jc.i.e(tVar, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = mVar.size();
        bb.b bVarB = null;
        for (int i10 = 0; i10 < size; i10++) {
            String strG = mVar.g(i10);
            String strI = mVar.i(i10);
            if (jc.i.a(strG, ":status")) {
                bVarB = com.bumptech.glide.c.B("HTTP/1.1 " + strI);
            } else if (!h.contains(strG)) {
                jc.i.e(strG, "name");
                jc.i.e(strI, "value");
                arrayList.add(strG);
                arrayList.add(pc.g.B0(strI).toString());
            }
        }
        if (bVarB == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        bd.w wVar2 = new bd.w();
        wVar2.f1687b = tVar;
        wVar2.f1688c = bVarB.f1524b;
        wVar2.f1689d = (String) bVarB.f1525c;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        bd.l lVar = new bd.l(0);
        ArrayList arrayList2 = lVar.f1617a;
        jc.i.e(arrayList2, "<this>");
        jc.i.e(strArr, "elements");
        arrayList2.addAll(vb.h.H(strArr));
        wVar2.f1690f = lVar;
        if (z4 && wVar2.f1688c == 100) {
            return null;
        }
        return wVar2;
    }

    @Override // gd.d
    public final fd.k e() {
        return this.f5312a;
    }

    @Override // gd.d
    public final void f() {
        this.f5314c.flush();
    }

    @Override // gd.d
    public final od.v g(bd.x xVar) {
        w wVar = this.f5315d;
        jc.i.b(wVar);
        return wVar.i;
    }

    @Override // gd.d
    public final long h(bd.x xVar) {
        if (gd.e.a(xVar)) {
            return cd.b.j(xVar);
        }
        return 0L;
    }
}
