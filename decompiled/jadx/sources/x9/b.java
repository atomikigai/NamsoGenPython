package x9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f10316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f10317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10318d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f10319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f10320g;

    public b(String str, Set set, Set set2, int i, int i10, e eVar, Set set3) {
        this.f10315a = str;
        this.f10316b = Collections.unmodifiableSet(set);
        this.f10317c = Collections.unmodifiableSet(set2);
        this.f10318d = i;
        this.e = i10;
        this.f10319f = eVar;
        this.f10320g = Collections.unmodifiableSet(set3);
    }

    public static a a(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static b b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            jd.d.f(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new t4.f(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f10316b.toArray()) + ">{" + this.f10318d + ", type=" + this.e + ", deps=" + Arrays.toString(this.f10317c.toArray()) + "}";
    }
}
