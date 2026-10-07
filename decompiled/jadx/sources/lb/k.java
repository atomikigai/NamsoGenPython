package lb;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f6919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f6920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f6921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6922d;
    public final /* synthetic */ l e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6923f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ac.c cVar) {
        super(cVar);
        this.e = lVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f6922d = obj;
        this.f6923f |= Integer.MIN_VALUE;
        return l.a(this.e, null, this);
    }
}
