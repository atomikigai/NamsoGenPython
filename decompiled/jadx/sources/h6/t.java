package h6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f5081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double[] f5082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[] f5083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f5084d;
    public int e;

    public t(a2.l lVar) {
        ArrayList arrayList = (ArrayList) lVar.f44c;
        int size = arrayList.size();
        this.f5081a = (String[]) ((ArrayList) lVar.f43b).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.f5082b = dArr;
        ArrayList arrayList2 = (ArrayList) lVar.f45d;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i10 = 0; i10 < size3; i10++) {
            dArr2[i10] = ((Double) arrayList2.get(i10)).doubleValue();
        }
        this.f5083c = dArr2;
        this.f5084d = new int[size];
        this.e = 0;
    }
}
