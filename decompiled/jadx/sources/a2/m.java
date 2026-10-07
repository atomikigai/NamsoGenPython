package a2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f46a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f47b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f48c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ac.c cVar) {
        super(cVar);
        this.f48c = nVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f47b = obj;
        this.f49d |= Integer.MIN_VALUE;
        return this.f48c.a(this);
    }
}
