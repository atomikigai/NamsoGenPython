package h3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f4613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(e1 e1Var, ac.c cVar) {
        super(cVar);
        this.f4613b = e1Var;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f4612a = obj;
        this.f4614c |= Integer.MIN_VALUE;
        return this.f4613b.j0(this);
    }
}
