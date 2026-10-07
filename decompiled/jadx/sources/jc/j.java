package jc;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j implements g, Serializable {
    private final int arity;

    public j(int i) {
        this.arity = i;
    }

    @Override // jc.g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        r.f5777a.getClass();
        String strA = s.a(this);
        i.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
