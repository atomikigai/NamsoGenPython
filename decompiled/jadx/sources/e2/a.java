package e2;

import ac.i;
import ic.l;
import ic.p;
import rc.a0;
import ub.k;
import y1.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3213d;
    public final /* synthetic */ l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, v vVar, yb.d dVar, boolean z4, boolean z10) {
        super(2, dVar);
        this.f3211b = vVar;
        this.f3212c = z4;
        this.f3213d = z10;
        this.e = lVar;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        return new a(this.e, this.f3211b, dVar, this.f3212c, this.f3213d);
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((a0) obj, (yb.d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        zb.a aVar = zb.a.f11555a;
        int i = this.f3210a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r7.g.G(obj);
            return obj;
        }
        r7.g.G(obj);
        l lVar = this.e;
        v vVar = this.f3211b;
        boolean z4 = this.f3213d;
        boolean z10 = this.f3212c;
        c cVar = new c(lVar, vVar, null, z4, z10);
        this.f3210a = 1;
        Object objR = vVar.r(z10, cVar, this);
        return objR == aVar ? aVar : objR;
    }
}
