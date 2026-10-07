package d1;

import ic.l;
import java.util.Map;
import jc.i;
import jc.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2790a = new a(1);

    @Override // ic.l
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "entry");
        return "  " + ((d) entry.getKey()).f2797a + " = " + entry.getValue();
    }
}
