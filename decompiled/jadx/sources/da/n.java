package da;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f3119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3121c;

    public n(p pVar, long j4, String str) {
        this.f3121c = pVar;
        this.f3119a = j4;
        this.f3120b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        p pVar = this.f3121c;
        u uVar = pVar.f3135n;
        if (uVar != null && uVar.e.get()) {
            return null;
        }
        ((ea.a) pVar.i.f3510b).l(this.f3120b, this.f3119a);
        return null;
    }
}
