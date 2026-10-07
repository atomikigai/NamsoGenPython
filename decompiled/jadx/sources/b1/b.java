package b1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f1338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f1340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ac.c cVar2) {
        super(cVar2);
        this.f1340c = cVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f1339b = obj;
        this.f1341d |= Integer.MIN_VALUE;
        return this.f1340c.a(null, this);
    }
}
