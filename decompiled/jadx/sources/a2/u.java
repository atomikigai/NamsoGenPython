package a2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f77a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f78b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ic.l f79c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f80d;
    public /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f81f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f82r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, ac.c cVar) {
        super(cVar);
        this.f81f = vVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f82r |= Integer.MIN_VALUE;
        return this.f81f.b(null, null, this);
    }
}
