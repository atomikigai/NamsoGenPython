package u1;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8779a;

    public b(List list) {
        i.e(list, "topics");
        this.f8779a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        List list = this.f8779a;
        int size = list.size();
        List list2 = ((b) obj).f8779a;
        if (size != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    public final int hashCode() {
        return Objects.hash(this.f8779a);
    }

    public final String toString() {
        return "Topics=" + this.f8779a;
    }
}
