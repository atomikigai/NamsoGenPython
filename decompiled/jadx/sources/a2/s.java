package a2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f67a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f68b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f69c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f70d;
    public final /* synthetic */ v e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, ac.c cVar) {
        super(cVar);
        this.e = vVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f70d = obj;
        this.f71f |= Integer.MIN_VALUE;
        return this.e.f(false, this);
    }
}
