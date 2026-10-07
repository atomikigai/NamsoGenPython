package uc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a2.k f9085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.k f9088d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a2.k kVar, yb.d dVar) {
        super(dVar);
        this.f9088d = kVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f9087c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f9088d.c(null, this);
    }
}
