package e2;

import da.v;
import java.util.List;
import jc.i;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3238d;
    public final List e;

    public f(String str, String str2, String str3, List list, List list2) {
        i.e(str, "referenceTable");
        i.e(str2, "onDelete");
        i.e(str3, "onUpdate");
        i.e(list, "columnNames");
        i.e(list2, "referenceColumnNames");
        this.f3235a = str;
        this.f3236b = str2;
        this.f3237c = str3;
        this.f3238d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (i.a(this.f3235a, fVar.f3235a) && i.a(this.f3236b, fVar.f3236b) && i.a(this.f3237c, fVar.f3237c) && i.a(this.f3238d, fVar.f3238d)) {
            return i.a(this.e, fVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.f3238d.hashCode() + v.d(v.d(this.f3235a.hashCode() * 31, 31, this.f3236b), 31, this.f3237c)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb2.append(this.f3235a);
        sb2.append("',\n            |   onDelete = '");
        sb2.append(this.f3236b);
        sb2.append("',\n            |   onUpdate = '");
        sb2.append(this.f3237c);
        sb2.append("',\n            |   columnNames = {");
        pc.h.V(vb.i.e0(vb.i.h0(this.f3238d), ",", null, null, null, 62));
        pc.h.V("},");
        k kVar = k.f9073a;
        sb2.append(kVar);
        sb2.append("\n            |   referenceColumnNames = {");
        pc.h.V(vb.i.e0(vb.i.h0(this.e), ",", null, null, null, 62));
        pc.h.V(" }");
        sb2.append(kVar);
        sb2.append("\n            |}\n        ");
        return pc.h.V(pc.h.X(sb2.toString()));
    }
}
