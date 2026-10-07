package ta;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements sa.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f8664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f8665g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f8667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f8668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8669d;
    public static final a e = new a(0);
    public static final d h = new d();

    /* JADX WARN: Type inference failed for: r0v1, types: [ta.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ta.b] */
    static {
        final int i = 0;
        f8664f = new ra.f() { // from class: ta.b
            @Override // ra.a
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((ra.g) obj2).f((String) obj);
                        break;
                    default:
                        ((ra.g) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i10 = 1;
        f8665g = new ra.f() { // from class: ta.b
            @Override // ra.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((ra.g) obj2).f((String) obj);
                        break;
                    default:
                        ((ra.g) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public e() {
        HashMap map = new HashMap();
        this.f8666a = map;
        HashMap map2 = new HashMap();
        this.f8667b = map2;
        this.f8668c = e;
        this.f8669d = false;
        map2.put(String.class, f8664f);
        map.remove(String.class);
        map2.put(Boolean.class, f8665g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final sa.a a(Class cls, ra.d dVar) {
        this.f8666a.put(cls, dVar);
        this.f8667b.remove(cls);
        return this;
    }
}
