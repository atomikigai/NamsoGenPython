package ac;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rc.k;
import rc.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends a {
    private final yb.i _context;
    private transient yb.d intercepted;

    public c(yb.d dVar, yb.i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // yb.d
    public yb.i getContext() {
        yb.i iVar = this._context;
        jc.i.b(iVar);
        return iVar;
    }

    public final yb.d intercepted() {
        yb.d dVar = this.intercepted;
        if (dVar != null) {
            return dVar;
        }
        yb.f fVar = (yb.f) getContext().H(yb.e.f10673a);
        yb.d hVar = fVar != null ? new wc.h((x) fVar, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // ac.a
    public void releaseIntercepted() {
        yb.d dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            yb.g gVarH = getContext().H(yb.e.f10673a);
            jc.i.b(gVarH);
            wc.h hVar = (wc.h) dVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wc.h.f9930s;
            while (atomicReferenceFieldUpdater.get(hVar) == wc.a.f9917d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            k kVar = obj instanceof k ? (k) obj : null;
            if (kVar != null) {
                kVar.o();
            }
        }
        this.intercepted = b.f281a;
    }

    public c(yb.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
