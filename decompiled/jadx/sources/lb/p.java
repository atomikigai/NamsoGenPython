package lb;

import h6.o0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f6932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f6933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f6934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f6935d;
    public /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f6936f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6937r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o0 o0Var, ac.c cVar) {
        super(cVar);
        this.f6936f = o0Var;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f6937r |= Integer.MIN_VALUE;
        return this.f6936f.a(null, this);
    }
}
