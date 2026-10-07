package e2;

import java.util.ArrayList;
import java.util.List;
import jc.i;
import pc.o;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3242d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public g(String str, boolean z4, List list, List list2) {
        i.e(str, "name");
        i.e(list, "columns");
        this.f3239a = str;
        this.f3240b = z4;
        this.f3241c = list;
        this.f3242d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.f3242d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            String str = gVar.f3239a;
            if (this.f3240b == gVar.f3240b && i.a(this.f3241c, gVar.f3241c) && i.a(this.f3242d, gVar.f3242d)) {
                String str2 = this.f3239a;
                return o.e0(str2, "index_", false) ? o.e0(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3239a;
        return this.f3242d.hashCode() + ((this.f3241c.hashCode() + ((((o.e0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f3240b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Index {\n            |   name = '");
        sb2.append(this.f3239a);
        sb2.append("',\n            |   unique = '");
        sb2.append(this.f3240b);
        sb2.append("',\n            |   columns = {");
        pc.h.V(vb.i.e0(this.f3241c, ",", null, null, null, 62));
        pc.h.V("},");
        k kVar = k.f9073a;
        sb2.append(kVar);
        sb2.append("\n            |   orders = {");
        pc.h.V(vb.i.e0(this.f3242d, ",", null, null, null, 62));
        pc.h.V(" }");
        sb2.append(kVar);
        sb2.append("\n            |}\n        ");
        return pc.h.V(pc.h.X(sb2.toString()));
    }

    public g(String str, List list) {
        i.e(list, "columns");
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add("ASC");
        }
        this(str, false, list, arrayList);
    }
}
