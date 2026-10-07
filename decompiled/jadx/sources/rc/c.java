package rc;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends f1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8259s = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer");
    private volatile Object _disposer;
    public final k e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m0 f8260f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f8261r;

    public c(e eVar, k kVar) {
        this.f8261r = eVar;
        this.e = kVar;
    }

    @Override // ic.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((Throwable) obj);
        return ub.k.f9073a;
    }

    @Override // rc.f1
    public final void m(Throwable th) {
        k kVar = this.e;
        if (th != null) {
            kVar.getClass();
            i6.e eVarC = kVar.C(new s(false, th), null);
            if (eVarC != null) {
                kVar.i(eVarC);
                d dVar = (d) f8259s.get(this);
                if (dVar != null) {
                    dVar.d();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f8267b;
        e eVar = this.f8261r;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            e0[] e0VarArr = eVar.f8268a;
            ArrayList arrayList = new ArrayList(e0VarArr.length);
            for (e0 e0Var : e0VarArr) {
                arrayList.add(e0Var.g());
            }
            kVar.resumeWith(arrayList);
        }
    }
}
