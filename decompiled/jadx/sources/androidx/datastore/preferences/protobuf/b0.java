package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f610c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, long j4, int i) {
        List list = (List) n1.f688d.i(j4, obj);
        if (list.isEmpty()) {
            List zVar = list instanceof a0 ? new z(i) : new ArrayList(i);
            n1.o(obj, j4, zVar);
            return zVar;
        }
        if (f610c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            n1.o(obj, j4, arrayList);
            return arrayList;
        }
        if (!(list instanceof i1)) {
            return list;
        }
        z zVar2 = new z(list.size() + i);
        zVar2.addAll((i1) list);
        n1.o(obj, j4, zVar2);
        return zVar2;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void a(long j4, Object obj) {
        Object objUnmodifiableList;
        List list = (List) n1.f688d.i(j4, obj);
        if (list instanceof a0) {
            objUnmodifiableList = ((a0) list).e();
        } else if (f610c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        n1.o(obj, j4, objUnmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void b(Object obj, long j4, Object obj2) {
        List list = (List) n1.f688d.i(j4, obj2);
        List listD = d(obj, j4, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        n1.o(obj, j4, list);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final List c(long j4, Object obj) {
        return d(obj, j4, 10);
    }
}
