package d3;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2.j f2800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f2801c;

    public a(u2.j jVar, UUID uuid) {
        this.f2800b = jVar;
        this.f2801c = uuid;
    }

    @Override // d3.c
    public final void b() {
        u2.j jVar = this.f2800b;
        WorkDatabase workDatabase = jVar.f8821o;
        workDatabase.c();
        try {
            c.a(jVar, this.f2801c.toString());
            workDatabase.q();
            workDatabase.n();
            u2.d.a(jVar.f8820n, jVar.f8821o, jVar.f8823q);
        } catch (Throwable th) {
            workDatabase.n();
            throw th;
        }
    }
}
