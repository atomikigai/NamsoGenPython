package x1;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f10150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f10152c;

    public final l0 a(int i) {
        SparseArray sparseArray = this.f10150a;
        l0 l0Var = (l0) sparseArray.get(i);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0();
        sparseArray.put(i, l0Var2);
        return l0Var2;
    }
}
