package bd;

import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.j f1636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.b f1637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1639d;
    public final a5.f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f1641g;
    public boolean h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f1642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f1643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Proxy f1644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f1645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SocketFactory f1646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f1647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f1648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nd.c f1649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f1650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1652t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1653u;

    public r() {
        a3.j jVar = new a3.j();
        jVar.f108b = new ArrayDeque();
        jVar.f109c = new ArrayDeque();
        jVar.f110d = new ArrayDeque();
        this.f1636a = jVar;
        this.f1637b = new a4.b(6);
        this.f1638c = new ArrayList();
        this.f1639d = new ArrayList();
        this.e = new a5.f(6);
        this.f1640f = true;
        b bVar = b.f1550a;
        this.f1641g = bVar;
        this.h = true;
        this.i = true;
        this.f1642j = b.f1551b;
        this.f1643k = b.f1552c;
        this.f1645m = bVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        jc.i.d(socketFactory, "getDefault()");
        this.f1646n = socketFactory;
        this.f1647o = s.M;
        this.f1648p = s.L;
        this.f1649q = nd.c.f7404a;
        this.f1650r = e.f1574c;
        this.f1651s = 10000;
        this.f1652t = 10000;
        this.f1653u = 10000;
    }
}
