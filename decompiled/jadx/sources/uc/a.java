package uc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vc.k f9076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q3.e f9078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q3.e eVar, yb.d dVar) {
        super(dVar);
        this.f9078c = eVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f9077b = obj;
        this.f9079d |= Integer.MIN_VALUE;
        return this.f9078c.d(null, this);
    }
}
