package yc;

import rc.b0;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f10700c;

    public i(Runnable runnable, long j4, m mVar) {
        super(j4, mVar);
        this.f10700c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10700c.run();
        } finally {
            this.f10699b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f10700c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(b0.l(runnable));
        sb2.append(", ");
        sb2.append(this.f10698a);
        sb2.append(", ");
        sb2.append(this.f10699b);
        sb2.append(']');
        return sb2.toString();
    }
}
