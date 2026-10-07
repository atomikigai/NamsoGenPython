package z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f10931d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, ac.c cVar) {
        super(cVar);
        this.f10931d = yVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f10930c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f10931d.h(this);
    }
}
