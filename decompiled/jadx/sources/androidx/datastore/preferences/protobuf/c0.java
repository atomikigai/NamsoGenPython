package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d0 {
    @Override // androidx.datastore.preferences.protobuf.d0
    public final void a(long j4, Object obj) {
        ((b) ((u) n1.f688d.i(j4, obj))).f609a = false;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final void b(Object obj, long j4, Object obj2) {
        m1 m1Var = n1.f688d;
        u uVarA = (u) m1Var.i(j4, obj);
        u uVar = (u) m1Var.i(j4, obj2);
        int size = uVarA.size();
        int size2 = uVar.size();
        if (size > 0 && size2 > 0) {
            if (!((b) uVarA).f609a) {
                uVarA = uVarA.a(size2 + size);
            }
            uVarA.addAll(uVar);
        }
        if (size > 0) {
            uVar = uVarA;
        }
        n1.o(obj, j4, uVar);
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final List c(long j4, Object obj) {
        u uVar = (u) n1.f688d.i(j4, obj);
        if (((b) uVar).f609a) {
            return uVar;
        }
        int size = uVar.size();
        u uVarA = uVar.a(size == 0 ? 10 : size * 2);
        n1.o(obj, j4, uVarA);
        return uVarA;
    }
}
