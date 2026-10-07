package b2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f1351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h2.b f1352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f1354d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ac.c cVar) {
        super(cVar);
        this.f1354d = dVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f1353c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f1354d.e(null, null, this);
    }
}
