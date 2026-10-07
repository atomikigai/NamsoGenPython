package w3;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3.f f9478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f9480c;

    public a(u3.f fVar, r rVar, ReferenceQueue referenceQueue) {
        super(rVar, referenceQueue);
        p4.f.c(fVar, "Argument must not be null");
        this.f9478a = fVar;
        boolean z4 = rVar.f9565a;
        this.f9480c = null;
        this.f9479b = z4;
    }
}
