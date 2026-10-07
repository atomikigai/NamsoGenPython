package w;

import java.util.ArrayList;
import x.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public d[] f9443q0 = new d[4];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f9444r0 = 0;

    public final void R(int i, ArrayList arrayList, n nVar) {
        for (int i10 = 0; i10 < this.f9444r0; i10++) {
            d dVar = this.f9443q0[i10];
            ArrayList arrayList2 = nVar.f9999a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i11 = 0; i11 < this.f9444r0; i11++) {
            x.h.b(this.f9443q0[i11], i, arrayList, nVar);
        }
    }

    public void S() {
    }
}
