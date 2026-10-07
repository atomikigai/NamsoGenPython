package a2;

import y1.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f62a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f63b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f64c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f65d;
    public final /* synthetic */ v e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, ac.c cVar) {
        super(cVar);
        this.e = vVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f65d = obj;
        this.f66f |= Integer.MIN_VALUE;
        return this.e.e(null, this);
    }
}
