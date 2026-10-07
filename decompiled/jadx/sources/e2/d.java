package e2;

import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3228d;

    public d(int i, int i10, String str, String str2) {
        i.e(str, "from");
        i.e(str2, "to");
        this.f3225a = i;
        this.f3226b = i10;
        this.f3227c = str;
        this.f3228d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        i.e(dVar, "other");
        int i = this.f3225a - dVar.f3225a;
        return i == 0 ? this.f3226b - dVar.f3226b : i;
    }
}
