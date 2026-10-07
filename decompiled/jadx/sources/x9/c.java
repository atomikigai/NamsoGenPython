package x9;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public interface c {
    default Object a(Class cls) {
        return f(q.a(cls));
    }

    default Set b(q qVar) {
        return (Set) e(qVar).get();
    }

    ya.b c(q qVar);

    default ya.b d(Class cls) {
        return c(q.a(cls));
    }

    ya.b e(q qVar);

    default Object f(q qVar) {
        ya.b bVarC = c(qVar);
        if (bVarC == null) {
            return null;
        }
        return bVarC.get();
    }

    default o g(Class cls) {
        return h(q.a(cls));
    }

    o h(q qVar);
}
