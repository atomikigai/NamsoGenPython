package bd;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1617a;

    public l(int i) {
        switch (i) {
            case 1:
                this.f1617a = new ArrayList();
                break;
            default:
                this.f1617a = new ArrayList(20);
                break;
        }
    }

    public void a(String str, String str2) {
        jc.i.e(str, "name");
        jc.i.e(str2, "value");
        ArrayList arrayList = this.f1617a;
        arrayList.add(str);
        arrayList.add(pc.g.B0(str2).toString());
    }

    public m b() {
        return new m((String[]) this.f1617a.toArray(new String[0]));
    }

    public void c(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1617a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}
