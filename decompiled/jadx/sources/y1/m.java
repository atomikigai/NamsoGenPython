package y1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o6.h0 f10492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o6.h0 h0Var, ac.c cVar) {
        super(cVar);
        this.f10492b = h0Var;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f10491a = obj;
        this.f10493c |= Integer.MIN_VALUE;
        this.f10492b.a(null, this);
        return zb.a.f11555a;
    }
}
