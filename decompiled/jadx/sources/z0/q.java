package z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public jc.q f10908d;
    public y e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f10909f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f10910r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10911s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, ac.c cVar) {
        super(cVar);
        this.f10910r = rVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f10909f = obj;
        this.f10911s |= Integer.MIN_VALUE;
        return this.f10910r.a(null, this);
    }
}
