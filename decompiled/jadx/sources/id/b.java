package id;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final od.i f5259d;
    public static final od.i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final od.i f5260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final od.i f5261g;
    public static final od.i h;
    public static final od.i i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od.i f5262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od.i f5263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5264c;

    static {
        od.i iVar = od.i.f7735d;
        f5259d = z9.c.l(":");
        e = z9.c.l(":status");
        f5260f = z9.c.l(":method");
        f5261g = z9.c.l(":path");
        h = z9.c.l(":scheme");
        i = z9.c.l(":authority");
    }

    public b(od.i iVar, od.i iVar2) {
        jc.i.e(iVar, "name");
        jc.i.e(iVar2, "value");
        this.f5262a = iVar;
        this.f5263b = iVar2;
        this.f5264c = iVar2.a() + iVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jc.i.a(this.f5262a, bVar.f5262a) && jc.i.a(this.f5263b, bVar.f5263b);
    }

    public final int hashCode() {
        return this.f5263b.hashCode() + (this.f5262a.hashCode() * 31);
    }

    public final String toString() {
        return this.f5262a.h() + ": " + this.f5263b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(z9.c.l(str), z9.c.l(str2));
        jc.i.e(str, "name");
        jc.i.e(str2, "value");
        od.i iVar = od.i.f7735d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(od.i iVar, String str) {
        this(iVar, z9.c.l(str));
        jc.i.e(iVar, "name");
        jc.i.e(str, "value");
        od.i iVar2 = od.i.f7735d;
    }
}
