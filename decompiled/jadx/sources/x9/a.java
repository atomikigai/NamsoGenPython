package x9;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10309a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f10310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f10311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10312d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f10313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f10314g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f10310b = hashSet;
        this.f10311c = new HashSet();
        this.f10312d = 0;
        this.e = 0;
        this.f10314g = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            jd.d.f(cls2, "Null interface");
            this.f10310b.add(q.a(cls2));
        }
    }

    public final void a(i iVar) {
        if (this.f10310b.contains(iVar.f10334a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f10311c.add(iVar);
    }

    public final b b() {
        if (this.f10313f != null) {
            return new b(this.f10309a, new HashSet(this.f10310b), new HashSet(this.f10311c), this.f10312d, this.e, this.f10313f, this.f10314g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void c(int i) {
        if (!(this.f10312d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f10312d = i;
    }
}
