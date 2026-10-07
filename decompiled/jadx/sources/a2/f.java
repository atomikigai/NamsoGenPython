package a2;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f14b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f15c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public jc.q f16d;
    public yb.i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jc.q f17f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f19s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f20t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ac.c cVar) {
        super(cVar);
        this.f20t = hVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f19s = obj;
        this.f21u |= Integer.MIN_VALUE;
        return this.f20t.J(false, null, this);
    }
}
