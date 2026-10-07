package ac;

import jc.r;
import jc.s;
import yb.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends a implements jc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f287a;

    public h(yb.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != j.f10674a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
        this.f287a = 2;
    }

    @Override // jc.g
    public final int getArity() {
        return this.f287a;
    }

    @Override // yb.d
    public final yb.i getContext() {
        return j.f10674a;
    }

    @Override // ac.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        r.f5777a.getClass();
        String strA = s.a(this);
        jc.i.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
