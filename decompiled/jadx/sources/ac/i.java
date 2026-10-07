package ac;

import jc.r;
import jc.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends c implements jc.g {
    private final int arity;

    public i(int i, yb.d dVar) {
        super(dVar);
        this.arity = i;
    }

    @Override // jc.g
    public int getArity() {
        return this.arity;
    }

    @Override // ac.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        r.f5777a.getClass();
        String strA = s.a(this);
        jc.i.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
