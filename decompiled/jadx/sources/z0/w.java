package z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f10932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10935d;
    public final /* synthetic */ y e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10936f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, ac.c cVar) {
        super(cVar);
        this.e = yVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f10935d = obj;
        this.f10936f |= Integer.MIN_VALUE;
        return this.e.i(null, null, this);
    }
}
