package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(v0 v0Var) {
        t tVar = (t) this;
        int i = tVar.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iC = v0Var.c(this);
        tVar.memoizedSerializedSize = iC;
        return iC;
    }

    public abstract void c(j jVar);
}
