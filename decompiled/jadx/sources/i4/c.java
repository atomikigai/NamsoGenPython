package i4;

import java.util.ArrayList;
import k4.e;
import u3.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5203a;

    public c(int i) {
        switch (i) {
            case 1:
                this.f5203a = new ArrayList();
                break;
            default:
                this.f5203a = new ArrayList();
                break;
        }
    }

    public synchronized l a(Class cls) {
        int size = this.f5203a.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) this.f5203a.get(i);
            if (eVar.f5984a.isAssignableFrom(cls)) {
                return eVar.f5985b;
            }
        }
        return null;
    }

    public synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.f5203a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            b bVar = (b) obj;
            if ((bVar.f5200a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f5201b)) && !arrayList.contains(bVar.f5201b)) {
                arrayList.add(bVar.f5201b);
            }
        }
        return arrayList;
    }
}
