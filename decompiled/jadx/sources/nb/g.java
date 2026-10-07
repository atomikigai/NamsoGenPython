package nb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f7394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ac.c cVar) {
        super(cVar);
        this.f7394b = hVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f7393a = obj;
        this.f7395c |= Integer.MIN_VALUE;
        return this.f7394b.c(null, null, this);
    }
}
