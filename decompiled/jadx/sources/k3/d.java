package k3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f5928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ac.c cVar) {
        super(cVar);
        this.f5928c = eVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f5927b = obj;
        this.f5929d |= Integer.MIN_VALUE;
        return this.f5928c.d(null, null, this);
    }
}
