package d3;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3.a f2839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b3.a f2840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3.j f2841c;

    static {
        t2.m.f("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, u2.b bVar, a2.l lVar) {
        this.f2840b = bVar;
        this.f2839a = lVar;
        this.f2841c = workDatabase.x();
    }
}
