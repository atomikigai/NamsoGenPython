package n0;

import h6.o0;
import java.util.ArrayList;
import o3.l;
import r.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements p0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7137b;

    public /* synthetic */ d(Object obj, int i) {
        this.f7136a = i;
        this.f7137b = obj;
    }

    @Override // p0.a
    public final void accept(Object obj) {
        switch (this.f7136a) {
            case 0:
                e eVar = (e) obj;
                if (eVar == null) {
                    eVar = new e(-3);
                }
                ((o0) this.f7137b).m(eVar);
                return;
            case 1:
                e eVar2 = (e) obj;
                synchronized (f.f7142c) {
                    try {
                        k kVar = f.f7143d;
                        ArrayList arrayList = (ArrayList) kVar.get((String) this.f7137b);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((String) this.f7137b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((p0.a) arrayList.get(i)).accept(eVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                o0 o0Var = new o0(19, new ArrayList(), new ArrayList());
                ((l) this.f7137b).d((o3.e) obj, o0Var);
                return;
            default:
                ((o3.a) this.f7137b).a((o3.e) obj);
                return;
        }
    }
}
