package z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f10916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f10918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y yVar, ac.c cVar) {
        super(cVar);
        this.f10918c = yVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f10917b = obj;
        this.f10919d |= Integer.MIN_VALUE;
        return this.f10918c.e(this);
    }
}
