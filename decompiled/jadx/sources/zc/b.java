package zc;

import ic.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends jc.j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f11558b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i) {
        super(1);
        this.f11557a = i;
        this.f11558b = dVar;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        switch (this.f11557a) {
            case 0:
                this.f11558b.d(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f11561s;
                d dVar = this.f11558b;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.d(null);
                break;
        }
        return k.f9073a;
    }
}
