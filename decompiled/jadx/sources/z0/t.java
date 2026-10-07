package z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f10920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f10922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, ac.c cVar) {
        super(cVar);
        this.f10922c = yVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f10921b = obj;
        this.f10923d |= Integer.MIN_VALUE;
        return this.f10922c.f(this);
    }
}
