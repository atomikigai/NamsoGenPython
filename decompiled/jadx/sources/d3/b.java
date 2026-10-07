package d3;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2.j f2803c;

    public /* synthetic */ b(u2.j jVar, int i) {
        this.f2802b = i;
        this.f2803c = jVar;
    }

    @Override // d3.c
    public final void b() {
        switch (this.f2802b) {
            case 0:
                u2.j jVar = this.f2803c;
                WorkDatabase workDatabase = jVar.f8821o;
                workDatabase.c();
                try {
                    ArrayList arrayListK = workDatabase.x().k();
                    int size = arrayListK.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListK.get(i);
                        i++;
                        c.a(jVar, (String) obj);
                    }
                    workDatabase.q();
                    workDatabase.n();
                    u2.d.a(jVar.f8820n, jVar.f8821o, jVar.f8823q);
                    return;
                } catch (Throwable th) {
                    workDatabase.n();
                    throw th;
                }
            default:
                u2.j jVar2 = this.f2803c;
                WorkDatabase workDatabase2 = jVar2.f8821o;
                workDatabase2.c();
                try {
                    ArrayList arrayListJ = workDatabase2.x().j();
                    int size2 = arrayListJ.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayListJ.get(i10);
                        i10++;
                        c.a(jVar2, (String) obj2);
                    }
                    workDatabase2.q();
                    return;
                } finally {
                    workDatabase2.n();
                }
        }
    }
}
