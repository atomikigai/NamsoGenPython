package k3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f5924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ac.c cVar) {
        super(cVar);
        this.f5924b = eVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f5923a = obj;
        this.f5925c |= Integer.MIN_VALUE;
        return this.f5924b.c(null, 0, this);
    }
}
