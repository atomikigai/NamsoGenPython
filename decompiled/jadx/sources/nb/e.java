package nb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f7385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f7387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7388d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ac.c cVar) {
        super(cVar);
        this.f7387c = fVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f7386b = obj;
        this.f7388d |= Integer.MIN_VALUE;
        return this.f7387c.b(this);
    }
}
