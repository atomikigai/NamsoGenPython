package vb;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends n {
    public static void W(Iterable iterable, AbstractCollection abstractCollection) {
        jc.i.e(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static void X(ArrayList arrayList, ic.l lVar) {
        int iR;
        int iR2 = j.R(arrayList);
        int i = 0;
        if (iR2 >= 0) {
            int i10 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                    if (i10 != i) {
                        arrayList.set(i10, obj);
                    }
                    i10++;
                }
                if (i == iR2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i10;
        }
        if (i >= arrayList.size() || i > (iR = j.R(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(iR);
            if (iR == i) {
                return;
            } else {
                iR--;
            }
        }
    }
}
