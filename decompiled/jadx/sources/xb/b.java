package xb;

import java.util.Comparator;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f10357b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f10358c = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10359a;

    public /* synthetic */ b(int i) {
        this.f10359a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10359a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                i.e(comparable, "a");
                i.e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                i.e(comparable3, "a");
                i.e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f10359a) {
            case 0:
                return f10358c;
            default:
                return f10357b;
        }
    }
}
