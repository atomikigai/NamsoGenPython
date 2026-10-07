package u1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f8784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f8786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, yb.d dVar) {
        super(dVar);
        this.f8786c = fVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f8785b = obj;
        this.f8787d |= Integer.MIN_VALUE;
        return f.C(this.f8786c, null, this);
    }
}
