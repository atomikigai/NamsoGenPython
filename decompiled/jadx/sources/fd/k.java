package fd;

import androidx.lifecycle.j0;
import bd.a0;
import bd.s;
import bd.t;
import bd.u;
import da.v;
import id.o;
import id.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import od.p;
import od.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends id.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f3938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Socket f3939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f3940d;
    public bd.k e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f3941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f3942g;
    public p h;
    public od.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3948o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f3949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f3950q;

    public k(l lVar, a0 a0Var) {
        jc.i.e(lVar, "connectionPool");
        jc.i.e(a0Var, "route");
        this.f3938b = a0Var;
        this.f3948o = 1;
        this.f3949p = new ArrayList();
        this.f3950q = Long.MAX_VALUE;
    }

    public static void d(s sVar, a0 a0Var, IOException iOException) {
        jc.i.e(a0Var, "failedRoute");
        jc.i.e(iOException, "failure");
        if (a0Var.f1548b.type() != Proxy.Type.DIRECT) {
            bd.a aVar = a0Var.f1547a;
            aVar.h.connectFailed(aVar.i.f(), a0Var.f1548b.address(), iOException);
        }
        ib.c cVar = sVar.K;
        synchronized (cVar) {
            ((LinkedHashSet) cVar.f5256b).add(a0Var);
        }
    }

    @Override // id.h
    public final synchronized void a(o oVar, id.a0 a0Var) {
        jc.i.e(a0Var, "settings");
        this.f3948o = (a0Var.f5257a & 16) != 0 ? a0Var.f5258b[4] : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    @Override // id.h
    public final void b(w wVar) {
        wVar.c(null, 8);
    }

    public final void c(int i, int i10, int i11, boolean z4, i iVar) throws Throwable {
        if (this.f3941f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3938b.f1547a.f1546k;
        b bVar = new b(list);
        bd.a aVar = this.f3938b.f1547a;
        if (aVar.f1541c == null) {
            if (!list.contains(bd.i.f1598f)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3938b.f1547a.i.f1629d;
            jd.n nVar = jd.n.f5799a;
            if (!jd.n.f5799a.h(str)) {
                throw new m(new UnknownServiceException(v.i("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.f1545j.contains(t.H2_PRIOR_KNOWLEDGE)) {
            throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        m mVar = null;
        while (true) {
            try {
                a0 a0Var = this.f3938b;
                if (a0Var.f1547a.f1541c != null && a0Var.f1548b.type() == Proxy.Type.HTTP) {
                    f(i, i10, i11, iVar);
                    if (this.f3939c != null) {
                        break;
                    } else {
                        break;
                    }
                }
                e(i, i10, iVar);
                g(bVar, iVar);
                jc.i.e(this.f3938b.f1549c, "inetSocketAddress");
                break;
            } catch (IOException e) {
                Socket socket = this.f3940d;
                if (socket != null) {
                    cd.b.e(socket);
                }
                Socket socket2 = this.f3939c;
                if (socket2 != null) {
                    cd.b.e(socket2);
                }
                this.f3940d = null;
                this.f3939c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f3941f = null;
                this.f3942g = null;
                this.f3948o = 1;
                jc.i.e(this.f3938b.f1549c, "inetSocketAddress");
                if (mVar == null) {
                    mVar = new m(e);
                } else {
                    p3.a.a(mVar.f3955a, e);
                    mVar.f3956b = e;
                }
                if (!z4) {
                    throw mVar;
                }
                bVar.f3898c = true;
                if (!bVar.f3897b) {
                    throw mVar;
                }
                if (e instanceof ProtocolException) {
                    throw mVar;
                }
                if (e instanceof InterruptedIOException) {
                    throw mVar;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw mVar;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw mVar;
                }
                if (!(e instanceof SSLException)) {
                    throw mVar;
                }
            }
        }
        a0 a0Var2 = this.f3938b;
        if (a0Var2.f1547a.f1541c != null && a0Var2.f1548b.type() == Proxy.Type.HTTP && this.f3939c == null) {
            throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f3950q = System.nanoTime();
    }

    public final void e(int i, int i10, i iVar) throws IOException {
        Socket socketCreateSocket;
        a0 a0Var = this.f3938b;
        Proxy proxy = a0Var.f1548b;
        bd.a aVar = a0Var.f1547a;
        Proxy.Type type = proxy.type();
        int i11 = type == null ? -1 : j.f3937a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            socketCreateSocket = aVar.f1540b.createSocket();
            jc.i.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f3939c = socketCreateSocket;
        jc.i.e(this.f3938b.f1549c, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i10);
        try {
            jd.n nVar = jd.n.f5799a;
            jd.n.f5799a.e(socketCreateSocket, this.f3938b.f1549c, i);
            try {
                this.h = new p(jd.l.y(socketCreateSocket));
                this.i = new od.o(jd.l.x(socketCreateSocket));
            } catch (NullPointerException e) {
                if (jc.i.a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e4) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3938b.f1549c);
            connectException.initCause(e4);
            throw connectException;
        }
    }

    public final void f(int i, int i10, int i11, i iVar) throws IOException {
        u uVar = new u();
        a0 a0Var = this.f3938b;
        bd.o oVar = a0Var.f1547a.i;
        jc.i.e(oVar, "url");
        uVar.f1677c = oVar;
        uVar.h("CONNECT", null);
        bd.a aVar = a0Var.f1547a;
        uVar.f("Host", cd.b.v(aVar.i, true));
        uVar.f("Proxy-Connection", "Keep-Alive");
        uVar.f("User-Agent", "okhttp/4.12.0");
        bd.v vVarA = uVar.a();
        bd.l lVar = new bd.l(0);
        qd.b.i("Proxy-Authenticate");
        qd.b.k("OkHttp-Preemptive", "Proxy-Authenticate");
        lVar.c("Proxy-Authenticate");
        lVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
        lVar.b();
        aVar.f1543f.getClass();
        bd.o oVar2 = (bd.o) vVarA.f1682c;
        e(i, i10, iVar);
        String str = "CONNECT " + cd.b.v(oVar2, true) + " HTTP/1.1";
        p pVar = this.h;
        jc.i.b(pVar);
        od.o oVar3 = this.i;
        jc.i.b(oVar3);
        ab.a aVar2 = new ab.a(null, this, pVar, oVar3);
        x xVarA = pVar.f7753a.a();
        long j4 = i10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVarA.g(j4);
        oVar3.f7750a.a().g(i11);
        aVar2.k((bd.m) vVarA.f1683d, str);
        aVar2.b();
        bd.w wVarD = aVar2.d(false);
        jc.i.b(wVarD);
        wVarD.f1686a = vVarA;
        bd.x xVarA2 = wVarD.a();
        int i12 = xVarA2.f1699d;
        long j10 = cd.b.j(xVarA2);
        if (j10 != -1) {
            hd.d dVarJ = aVar2.j(j10);
            cd.b.t(dVarJ, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            dVarJ.close();
        }
        if (i12 != 200) {
            if (i12 != 407) {
                throw new IOException(v.f(i12, "Unexpected response code for CONNECT: "));
            }
            aVar.f1543f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f7754b.d() || !oVar3.f7751b.d()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(b bVar, i iVar) throws Throwable {
        t tVarG = t.HTTP_1_1;
        bd.a aVar = this.f3938b.f1547a;
        SSLSocketFactory sSLSocketFactory = aVar.f1541c;
        if (sSLSocketFactory == null) {
            List list = aVar.f1545j;
            t tVar = t.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(tVar)) {
                this.f3940d = this.f3939c;
                this.f3941f = tVarG;
                return;
            } else {
                this.f3940d = this.f3939c;
                this.f3941f = tVar;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            jc.i.b(sSLSocketFactory);
            Socket socket = this.f3939c;
            bd.o oVar = aVar.i;
            int i = 1;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, oVar.f1629d, oVar.e, true);
            jc.i.c(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                bd.i iVarA = bVar.a(sSLSocket2);
                if (iVarA.f1600b) {
                    jd.n nVar = jd.n.f5799a;
                    jd.n.f5799a.d(sSLSocket2, aVar.i.f1629d, aVar.f1545j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                jc.i.d(session, "sslSocketSession");
                bd.k kVarK = p3.a.k(session);
                HostnameVerifier hostnameVerifier = aVar.f1542d;
                jc.i.b(hostnameVerifier);
                if (hostnameVerifier.verify(aVar.i.f1629d, session)) {
                    bd.e eVar = aVar.e;
                    jc.i.b(eVar);
                    this.e = new bd.k(kVarK.f1613a, kVarK.f1614b, kVarK.f1615c, new bd.d(eVar, kVarK, aVar, i));
                    eVar.a(aVar.i.f1629d, new j0(this, 5));
                    if (iVarA.f1600b) {
                        jd.n nVar2 = jd.n.f5799a;
                        strF = jd.n.f5799a.f(sSLSocket2);
                    }
                    this.f3940d = sSLSocket2;
                    this.h = new p(jd.l.y(sSLSocket2));
                    this.i = new od.o(jd.l.x(sSLSocket2));
                    if (strF != null) {
                        tVarG = a.a.g(strF);
                    }
                    this.f3941f = tVarG;
                    jd.n nVar3 = jd.n.f5799a;
                    jd.n.f5799a.a(sSLSocket2);
                    if (this.f3941f == t.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List listA = kVarK.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar.i.f1629d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                jc.i.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                sb2.append(aVar.i.f1629d);
                sb2.append(" not verified:\n              |    certificate: ");
                bd.e eVar2 = bd.e.f1574c;
                sb2.append(jd.l.t(x509Certificate));
                sb2.append("\n              |    DN: ");
                sb2.append(x509Certificate.getSubjectDN().getName());
                sb2.append("\n              |    subjectAltNames: ");
                sb2.append(vb.i.f0(nd.c.a(x509Certificate, 7), nd.c.a(x509Certificate, 2)));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(pc.h.X(sb2.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    jd.n nVar4 = jd.n.f5799a;
                    jd.n.f5799a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    cd.b.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean h(bd.a aVar, List list) {
        bd.k kVar;
        bd.o oVar = aVar.i;
        byte[] bArr = cd.b.f1822a;
        int i = 0;
        if (this.f3949p.size() < this.f3948o && !this.f3943j) {
            a0 a0Var = this.f3938b;
            bd.a aVar2 = a0Var.f1547a;
            bd.a aVar3 = a0Var.f1547a;
            if (aVar2.a(aVar)) {
                String str = oVar.f1629d;
                String str2 = oVar.f1629d;
                if (!jc.i.a(str, aVar3.i.f1629d)) {
                    if (this.f3942g != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            a0 a0Var2 = (a0) it.next();
                            Proxy.Type type = a0Var2.f1548b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && a0Var.f1548b.type() == type2 && jc.i.a(a0Var.f1549c, a0Var2.f1549c)) {
                                if (aVar.f1542d != nd.c.f7404a) {
                                    break;
                                }
                                byte[] bArr2 = cd.b.f1822a;
                                bd.o oVar2 = aVar3.i;
                                if (oVar.e != oVar2.e) {
                                    break;
                                }
                                if (!jc.i.a(str2, oVar2.f1629d)) {
                                    if (!this.f3944k && (kVar = this.e) != null) {
                                        List listA = kVar.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            jc.i.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            if (!nd.c.c(str2, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    bd.e eVar = aVar.e;
                                    jc.i.b(eVar);
                                    bd.k kVar2 = this.e;
                                    jc.i.b(kVar2);
                                    List listA2 = kVar2.a();
                                    jc.i.e(str2, "hostname");
                                    jc.i.e(listA2, "peerCertificates");
                                    eVar.a(str2, new bd.d(eVar, listA2, str2, i));
                                    return true;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z4) {
        long j4;
        byte[] bArr = cd.b.f1822a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f3939c;
        jc.i.b(socket);
        Socket socket2 = this.f3940d;
        jc.i.b(socket2);
        p pVar = this.h;
        jc.i.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        o oVar = this.f3942g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f5301f) {
                    return false;
                }
                return oVar.f5309y >= oVar.f5308x || jNanoTime < oVar.f5310z;
            }
        }
        synchronized (this) {
            j4 = jNanoTime - this.f3950q;
        }
        if (j4 < 10000000000L || !z4) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !pVar.c();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final gd.d j(s sVar, gd.f fVar) {
        int i = fVar.f4540g;
        Socket socket = this.f3940d;
        jc.i.b(socket);
        p pVar = this.h;
        jc.i.b(pVar);
        od.o oVar = this.i;
        jc.i.b(oVar);
        o oVar2 = this.f3942g;
        if (oVar2 != null) {
            return new id.p(sVar, this, fVar, oVar2);
        }
        socket.setSoTimeout(i);
        x xVarA = pVar.f7753a.a();
        long j4 = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        xVarA.g(j4);
        oVar.f7750a.a().g(fVar.h);
        return new ab.a(sVar, this, pVar, oVar);
    }

    public final synchronized void k() {
        this.f3943j = true;
    }

    public final void l() throws SocketException {
        int i;
        Socket socket = this.f3940d;
        jc.i.b(socket);
        p pVar = this.h;
        jc.i.b(pVar);
        od.o oVar = this.i;
        jc.i.b(oVar);
        socket.setSoTimeout(0);
        ed.d dVar = ed.d.i;
        bd.v vVar = new bd.v(dVar);
        String str = this.f3938b.f1547a.i.f1629d;
        jc.i.e(str, "peerName");
        vVar.f1683d = socket;
        String str2 = cd.b.f1827g + ' ' + str;
        jc.i.e(str2, "<set-?>");
        vVar.f1681b = str2;
        vVar.e = pVar;
        vVar.f1684f = oVar;
        vVar.f1685g = this;
        o oVar2 = new o(vVar);
        this.f3942g = oVar2;
        id.a0 a0Var = o.K;
        this.f3948o = (a0Var.f5257a & 16) != 0 ? a0Var.f5258b[4] : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        id.x xVar = oVar2.H;
        synchronized (xVar) {
            try {
                if (xVar.f5351d) {
                    throw new IOException("closed");
                }
                Logger logger = id.x.f5347f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(cd.b.h(">> CONNECTION " + id.f.f5280a.b(), new Object[0]));
                }
                xVar.f5348a.x(id.f.f5280a);
                xVar.f5348a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        id.x xVar2 = oVar2.H;
        id.a0 a0Var2 = oVar2.A;
        synchronized (xVar2) {
            try {
                jc.i.e(a0Var2, "settings");
                if (xVar2.f5351d) {
                    throw new IOException("closed");
                }
                xVar2.g(0, Integer.bitCount(a0Var2.f5257a) * 6, 4, 0);
                int i10 = 0;
                while (i10 < 10) {
                    boolean z4 = true;
                    if (((1 << i10) & a0Var2.f5257a) == 0) {
                        z4 = false;
                    }
                    if (z4) {
                        if (i10 != 4) {
                            i = i10 != 7 ? i10 : 4;
                        } else {
                            i = 3;
                        }
                        xVar2.f5348a.writeShort(i);
                        xVar2.f5348a.writeInt(a0Var2.f5258b[i10]);
                    }
                    i10++;
                }
                xVar2.f5348a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iA = oVar2.A.a();
        if (iA != 65535) {
            oVar2.H.H(0, iA - 65535);
        }
        dVar.e().c(new ed.b(oVar2.f5299c, oVar2.I, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        a0 a0Var = this.f3938b;
        sb2.append(a0Var.f1547a.i.f1629d);
        sb2.append(':');
        sb2.append(a0Var.f1547a.i.e);
        sb2.append(", proxy=");
        sb2.append(a0Var.f1548b);
        sb2.append(" hostAddress=");
        sb2.append(a0Var.f1549c);
        sb2.append(" cipherSuite=");
        bd.k kVar = this.e;
        if (kVar == null || (obj = kVar.f1614b) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f3941f);
        sb2.append('}');
        return sb2.toString();
    }
}
