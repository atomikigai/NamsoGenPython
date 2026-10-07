package z0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3.h f10891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h3.h hVar, yb.d dVar) {
        super(dVar);
        this.f10891c = hVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f10889a = obj;
        this.f10890b |= Integer.MIN_VALUE;
        return this.f10891c.c(null, this);
    }
}
