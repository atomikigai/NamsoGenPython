package e2;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import jc.i;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f3245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f3246d;

    public h(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        i.e(abstractSet, "foreignKeys");
        this.f3243a = str;
        this.f3244b = map;
        this.f3245c = abstractSet;
        this.f3246d = abstractSet2;
    }

    public static final h a(i2.d dVar, String str) {
        return com.bumptech.glide.c.D(new b2.a(dVar), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f3243a.equals(hVar.f3243a) || !this.f3244b.equals(hVar.f3244b) || !i.a(this.f3245c, hVar.f3245c)) {
            return false;
        }
        Set set2 = this.f3246d;
        if (set2 == null || (set = hVar.f3246d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f3245c.hashCode() + ((this.f3244b.hashCode() + (this.f3243a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f3243a);
        sb2.append("',\n            |    columns = {");
        sb2.append(com.bumptech.glide.d.m(vb.i.i0(this.f3244b.values(), new b0.h(3))));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(com.bumptech.glide.d.m(this.f3245c));
        sb2.append("\n            |    indices = {");
        Set set = this.f3246d;
        sb2.append(com.bumptech.glide.d.m(set != null ? vb.i.i0(set, new b0.h(4)) : q.f9297a));
        sb2.append("\n            |}\n        ");
        return pc.h.X(sb2.toString());
    }
}
