package y1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f10456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f10458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10459d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f10460f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0 f10461r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10462s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, ac.c cVar) {
        super(cVar);
        this.f10461r = l0Var;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f10460f = obj;
        this.f10462s |= Integer.MIN_VALUE;
        return l0.d(this.f10461r, null, 0, this);
    }
}
