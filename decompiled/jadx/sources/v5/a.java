package v5;

import android.util.SparseArray;
import da.v;
import i5.c;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f9169a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f9170b;

    static {
        HashMap map = new HashMap();
        f9170b = map;
        map.put(c.f5209a, 0);
        map.put(c.f5210b, 1);
        map.put(c.f5211c, 2);
        for (c cVar : map.keySet()) {
            f9169a.append(((Integer) f9170b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f9170b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i) {
        c cVar = (c) f9169a.get(i);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(v.f(i, "Unknown Priority for value "));
    }
}
