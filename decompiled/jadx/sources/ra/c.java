package ra;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8237b;

    public c(String str, Map map) {
        this.f8236a = str;
        this.f8237b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8236a.equals(cVar.f8236a) && this.f8237b.equals(cVar.f8237b);
    }

    public final int hashCode() {
        return this.f8237b.hashCode() + (this.f8236a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f8236a + ", properties=" + this.f8237b.values() + "}";
    }
}
