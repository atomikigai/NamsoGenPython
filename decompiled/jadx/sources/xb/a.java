package xb;

import ic.l;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l[] f10356a;

    public /* synthetic */ a(l[] lVarArr) {
        this.f10356a = lVarArr;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        for (l lVar : this.f10356a) {
            int iF = jd.l.f((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            if (iF != 0) {
                return iF;
            }
        }
        return 0;
    }
}
