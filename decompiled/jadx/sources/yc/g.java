package yc;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rc.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f10697c;

    @Override // rc.x
    public final void S(yb.i iVar, Runnable runnable) {
        b bVar = this.f10697c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f10683s;
        bVar.d(runnable, j.f10706g);
    }
}
