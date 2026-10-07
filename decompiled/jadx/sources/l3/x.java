package l3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f6735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, ac.c cVar) {
        super(cVar);
        this.f6735b = yVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f6734a = obj;
        this.f6736c |= Integer.MIN_VALUE;
        return y.g0(this.f6735b, this);
    }
}
