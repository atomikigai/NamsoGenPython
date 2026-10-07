package a2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f34a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public uc.c f36c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f37d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, yb.d dVar) {
        super(dVar);
        this.f37d = kVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f34a = obj;
        this.f35b |= Integer.MIN_VALUE;
        return this.f37d.c(null, this);
    }
}
