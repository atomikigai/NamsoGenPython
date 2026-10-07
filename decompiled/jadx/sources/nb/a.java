package nb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f7372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zc.a f7373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f7375d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ac.c cVar) {
        super(cVar);
        this.f7375d = bVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f7374c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f7375d.b(this);
    }
}
