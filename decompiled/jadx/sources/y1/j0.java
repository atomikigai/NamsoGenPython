package y1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s5.j f10464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f10466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, ac.c cVar) {
        super(cVar);
        this.f10466c = l0Var;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f10465b = obj;
        this.f10467d |= Integer.MIN_VALUE;
        return this.f10466c.f(this);
    }
}
