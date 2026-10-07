package fd;

import bd.a0;
import bd.o;
import id.b0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f3915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bd.a f3916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f3917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ea.j f3918d;
    public n e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3920g;
    public int h;
    public a0 i;

    public f(l lVar, bd.a aVar, i iVar) {
        jc.i.e(lVar, "connectionPool");
        this.f3915a = lVar;
        this.f3916b = aVar;
        this.f3917c = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0266  */
    /* JADX WARN: Code duplicated, block: B:117:0x0281  */
    /* JADX WARN: Code duplicated, block: B:119:0x028d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0296  */
    /* JADX WARN: Code duplicated, block: B:122:0x029c  */
    /* JADX WARN: Code duplicated, block: B:131:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:132:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x0141  */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.List] */
    public final k a(int i, int i10, int i11, boolean z4, boolean z10) throws IOException {
        a0 a0Var;
        ea.j jVar;
        n nVar;
        ArrayList arrayList;
        ea.j jVar2;
        bd.a aVar;
        Proxy proxy;
        String hostAddress;
        int port;
        List listD;
        boolean zContains;
        k kVar;
        ib.c cVar;
        Socket socketH;
        while (!this.f3917c.f3934x) {
            k kVar2 = this.f3917c.f3929s;
            if (kVar2 != null) {
                synchronized (kVar2) {
                    try {
                        socketH = (kVar2.f3943j || !b(kVar2.f3938b.f1547a.i)) ? this.f3917c.h() : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3917c.f3929s == null) {
                    if (socketH != null) {
                        cd.b.e(socketH);
                    }
                    this.f3919f = 0;
                    this.f3920g = 0;
                    this.h = 0;
                    if (this.f3915a.a(this.f3916b, this.f3917c, null, false)) {
                        kVar2 = this.f3917c.f3929s;
                        jc.i.b(kVar2);
                    } else {
                        a0Var = this.i;
                        try {
                            if (a0Var != null) {
                                this.i = null;
                            } else {
                                jVar = this.f3918d;
                                if (jVar == null && jVar.d()) {
                                    ea.j jVar3 = this.f3918d;
                                    jc.i.b(jVar3);
                                    if (!jVar3.d()) {
                                        throw new NoSuchElementException();
                                    }
                                    ArrayList arrayList2 = (ArrayList) jVar3.f3530b;
                                    int i12 = jVar3.f3529a;
                                    jVar3.f3529a = i12 + 1;
                                    a0Var = (a0) arrayList2.get(i12);
                                } else {
                                    nVar = this.e;
                                    if (nVar == null) {
                                        bd.a aVar2 = this.f3916b;
                                        i iVar = this.f3917c;
                                        nVar = new n(aVar2, iVar.f3923a.K, iVar);
                                        this.e = nVar;
                                    }
                                    if (nVar.j()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (nVar.f3957a < ((List) nVar.f3960d).size()) {
                                        aVar = (bd.a) nVar.f3958b;
                                        if (nVar.f3957a < ((List) nVar.f3960d).size()) {
                                            throw new SocketException("No route to " + aVar.i.f1629d + "; exhausted proxy configurations: " + ((List) nVar.f3960d));
                                        }
                                        List list = (List) nVar.f3960d;
                                        int i13 = nVar.f3957a;
                                        nVar.f3957a = i13 + 1;
                                        proxy = (Proxy) list.get(i13);
                                        ArrayList arrayList3 = new ArrayList();
                                        nVar.e = arrayList3;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            o oVar = aVar.i;
                                            hostAddress = oVar.f1629d;
                                            port = oVar.e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            if (address == null) {
                                                hostAddress = inetSocketAddress.getHostName();
                                                jc.i.d(hostAddress, "hostName");
                                            } else {
                                                hostAddress = address.getHostAddress();
                                                jc.i.d(hostAddress, "address.hostAddress");
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
                                        } else {
                                            byte[] bArr = cd.b.f1822a;
                                            jc.i.e(hostAddress, "<this>");
                                            pc.f fVar = cd.b.f1826f;
                                            fVar.getClass();
                                            if (fVar.f7863a.matcher(hostAddress).matches()) {
                                                listD = jd.d.D(InetAddress.getByName(hostAddress));
                                            } else {
                                                aVar.f1539a.getClass();
                                                try {
                                                    InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                                                    jc.i.d(allByName, "getAllByName(hostname)");
                                                    List listT = vb.h.T(allByName);
                                                    if (listT.isEmpty()) {
                                                        throw new UnknownHostException(aVar.f1539a + " returned no addresses for " + hostAddress);
                                                    }
                                                    listD = listT;
                                                } catch (NullPointerException e) {
                                                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                                                    unknownHostException.initCause(e);
                                                    throw unknownHostException;
                                                }
                                            }
                                            Iterator it = listD.iterator();
                                            while (it.hasNext()) {
                                                arrayList3.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = nVar.e.iterator();
                                        while (it2.hasNext()) {
                                            a0 a0Var2 = new a0((bd.a) nVar.f3958b, proxy, (InetSocketAddress) it2.next());
                                            ib.c cVar2 = (ib.c) nVar.f3959c;
                                            synchronized (cVar2) {
                                                zContains = ((LinkedHashSet) cVar2.f5256b).contains(a0Var2);
                                            }
                                            if (zContains) {
                                                ((ArrayList) nVar.f3961f).add(a0Var2);
                                            } else {
                                                arrayList.add(a0Var2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        vb.o.W((ArrayList) nVar.f3961f, arrayList);
                                        ((ArrayList) nVar.f3961f).clear();
                                    }
                                    jVar2 = new ea.j(arrayList);
                                    this.f3918d = jVar2;
                                    if (!this.f3917c.f3934x) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f3915a.a(this.f3916b, this.f3917c, arrayList, false)) {
                                        kVar2 = this.f3917c.f3929s;
                                        jc.i.b(kVar2);
                                    } else {
                                        if (jVar2.d()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i14 = jVar2.f3529a;
                                        jVar2.f3529a = i14 + 1;
                                        a0Var = (a0) arrayList.get(i14);
                                        kVar = new k(this.f3915a, a0Var);
                                        this.f3917c.f3936z = kVar;
                                        kVar.c(i, i10, i11, z4, this.f3917c);
                                        this.f3917c.f3936z = null;
                                        cVar = this.f3917c.f3923a.K;
                                        synchronized (cVar) {
                                            ((LinkedHashSet) cVar.f5256b).remove(a0Var);
                                        }
                                        if (this.f3915a.a(this.f3916b, this.f3917c, arrayList, true)) {
                                            kVar2 = this.f3917c.f3929s;
                                            jc.i.b(kVar2);
                                            this.i = a0Var;
                                            Socket socket = kVar.f3940d;
                                            jc.i.b(socket);
                                            cd.b.e(socket);
                                        } else {
                                            synchronized (kVar) {
                                                l lVar = this.f3915a;
                                                lVar.getClass();
                                                byte[] bArr2 = cd.b.f1822a;
                                                ((ConcurrentLinkedQueue) lVar.e).add(kVar);
                                                ((ed.c) lVar.f3953c).c((ed.b) lVar.f3954d, 0L);
                                                this.f3917c.a(kVar);
                                            }
                                            kVar2 = kVar;
                                        }
                                    }
                                }
                            }
                            kVar.c(i, i10, i11, z4, this.f3917c);
                            this.f3917c.f3936z = null;
                            cVar = this.f3917c.f3923a.K;
                            synchronized (cVar) {
                                ((LinkedHashSet) cVar.f5256b).remove(a0Var);
                                if (this.f3915a.a(this.f3916b, this.f3917c, arrayList, true)) {
                                    kVar2 = this.f3917c.f3929s;
                                    jc.i.b(kVar2);
                                    this.i = a0Var;
                                    Socket socket2 = kVar.f3940d;
                                    jc.i.b(socket2);
                                    cd.b.e(socket2);
                                } else {
                                    synchronized (kVar) {
                                        l lVar2 = this.f3915a;
                                        lVar2.getClass();
                                        byte[] bArr3 = cd.b.f1822a;
                                        ((ConcurrentLinkedQueue) lVar2.e).add(kVar);
                                        ((ed.c) lVar2.f3953c).c((ed.b) lVar2.f3954d, 0L);
                                        this.f3917c.a(kVar);
                                        kVar2 = kVar;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.f3917c.f3936z = null;
                            throw th2;
                        }
                        arrayList = null;
                        kVar = new k(this.f3915a, a0Var);
                        this.f3917c.f3936z = kVar;
                    }
                } else if (socketH != null) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                this.f3919f = 0;
                this.f3920g = 0;
                this.h = 0;
                if (this.f3915a.a(this.f3916b, this.f3917c, null, false)) {
                    kVar2 = this.f3917c.f3929s;
                    jc.i.b(kVar2);
                } else {
                    a0Var = this.i;
                    if (a0Var != null) {
                        this.i = null;
                    } else {
                        jVar = this.f3918d;
                        if (jVar == null) {
                        }
                        nVar = this.e;
                        if (nVar == null) {
                            bd.a aVar3 = this.f3916b;
                            i iVar2 = this.f3917c;
                            nVar = new n(aVar3, iVar2.f3923a.K, iVar2);
                            this.e = nVar;
                        }
                        if (nVar.j()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (nVar.f3957a < ((List) nVar.f3960d).size()) {
                            aVar = (bd.a) nVar.f3958b;
                            if (nVar.f3957a < ((List) nVar.f3960d).size()) {
                                throw new SocketException("No route to " + aVar.i.f1629d + "; exhausted proxy configurations: " + ((List) nVar.f3960d));
                            }
                            List list2 = (List) nVar.f3960d;
                            int i15 = nVar.f3957a;
                            nVar.f3957a = i15 + 1;
                            proxy = (Proxy) list2.get(i15);
                            ArrayList arrayList4 = new ArrayList();
                            nVar.e = arrayList4;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                o oVar2 = aVar.i;
                                hostAddress = oVar2.f1629d;
                                port = oVar2.e;
                            } else {
                                o oVar3 = aVar.i;
                                hostAddress = oVar3.f1629d;
                                port = oVar3.e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            vb.o.W((ArrayList) nVar.f3961f, arrayList);
                            ((ArrayList) nVar.f3961f).clear();
                        }
                        jVar2 = new ea.j(arrayList);
                        this.f3918d = jVar2;
                        if (!this.f3917c.f3934x) {
                            throw new IOException("Canceled");
                        }
                        if (this.f3915a.a(this.f3916b, this.f3917c, arrayList, false)) {
                            kVar2 = this.f3917c.f3929s;
                            jc.i.b(kVar2);
                        } else {
                            if (jVar2.d()) {
                                throw new NoSuchElementException();
                            }
                            int i16 = jVar2.f3529a;
                            jVar2.f3529a = i16 + 1;
                            a0Var = (a0) arrayList.get(i16);
                            kVar = new k(this.f3915a, a0Var);
                            this.f3917c.f3936z = kVar;
                            kVar.c(i, i10, i11, z4, this.f3917c);
                            this.f3917c.f3936z = null;
                            cVar = this.f3917c.f3923a.K;
                            synchronized (cVar) {
                                ((LinkedHashSet) cVar.f5256b).remove(a0Var);
                                if (this.f3915a.a(this.f3916b, this.f3917c, arrayList, true)) {
                                    kVar2 = this.f3917c.f3929s;
                                    jc.i.b(kVar2);
                                    this.i = a0Var;
                                    Socket socket3 = kVar.f3940d;
                                    jc.i.b(socket3);
                                    cd.b.e(socket3);
                                } else {
                                    synchronized (kVar) {
                                        l lVar3 = this.f3915a;
                                        lVar3.getClass();
                                        byte[] bArr4 = cd.b.f1822a;
                                        ((ConcurrentLinkedQueue) lVar3.e).add(kVar);
                                        ((ed.c) lVar3.f3953c).c((ed.b) lVar3.f3954d, 0L);
                                        this.f3917c.a(kVar);
                                        kVar2 = kVar;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    kVar = new k(this.f3915a, a0Var);
                    this.f3917c.f3936z = kVar;
                    kVar.c(i, i10, i11, z4, this.f3917c);
                    this.f3917c.f3936z = null;
                    cVar = this.f3917c.f3923a.K;
                    synchronized (cVar) {
                        ((LinkedHashSet) cVar.f5256b).remove(a0Var);
                        if (this.f3915a.a(this.f3916b, this.f3917c, arrayList, true)) {
                            kVar2 = this.f3917c.f3929s;
                            jc.i.b(kVar2);
                            this.i = a0Var;
                            Socket socket4 = kVar.f3940d;
                            jc.i.b(socket4);
                            cd.b.e(socket4);
                        } else {
                            synchronized (kVar) {
                                l lVar4 = this.f3915a;
                                lVar4.getClass();
                                byte[] bArr5 = cd.b.f1822a;
                                ((ConcurrentLinkedQueue) lVar4.e).add(kVar);
                                ((ed.c) lVar4.f3953c).c((ed.b) lVar4.f3954d, 0L);
                                this.f3917c.a(kVar);
                                kVar2 = kVar;
                            }
                        }
                    }
                }
            }
            if (kVar2.i(z10)) {
                return kVar2;
            }
            kVar2.k();
            if (this.i == null) {
                ea.j jVar4 = this.f3918d;
                if (jVar4 != null ? jVar4.d() : true) {
                    continue;
                } else {
                    n nVar2 = this.e;
                    if (!(nVar2 != null ? nVar2.j() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(o oVar) {
        jc.i.e(oVar, "url");
        o oVar2 = this.f3916b.i;
        return oVar.e == oVar2.e && jc.i.a(oVar.f1629d, oVar2.f1629d);
    }

    public final void c(IOException iOException) {
        jc.i.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof b0) && ((b0) iOException).f5265a == 8) {
            this.f3919f++;
        } else if (iOException instanceof id.a) {
            this.f3920g++;
        } else {
            this.h++;
        }
    }
}
