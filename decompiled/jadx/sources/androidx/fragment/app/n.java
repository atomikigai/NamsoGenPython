package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a5.b f940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.b f943d;
    public final /* synthetic */ s e;

    public n(s sVar, a5.b bVar, AtomicReference atomicReference, e0 e0Var, androidx.activity.result.b bVar2) {
        this.e = sVar;
        this.f940a = bVar;
        this.f941b = atomicReference;
        this.f942c = e0Var;
        this.f943d = bVar2;
    }

    public final void a() {
        StringBuilder sb2 = new StringBuilder("fragment_");
        s sVar = this.e;
        sb2.append(sVar.e);
        sb2.append("_rq#");
        sb2.append(sVar.f974c0.getAndIncrement());
        String string = sb2.toString();
        s sVar2 = (s) this.f940a.f188b;
        v vVar = sVar2.D;
        this.f941b.set((vVar != null ? vVar.f1000t.f373w : sVar2.T().f373w).c(string, sVar, this.f942c, this.f943d));
    }
}
