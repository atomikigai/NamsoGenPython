package x1;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f10113a;

    public j(k kVar) {
        this.f10113a = kVar;
    }

    @Override // x1.k0
    public final void b(RecyclerView recyclerView, int i, int i10) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        k kVar = this.f10113a;
        int i11 = kVar.f10114a;
        int iComputeVerticalScrollRange = kVar.f10129s.computeVerticalScrollRange();
        int i12 = kVar.f10128r;
        kVar.f10130t = iComputeVerticalScrollRange - i12 > 0 && i12 >= i11;
        int iComputeHorizontalScrollRange = kVar.f10129s.computeHorizontalScrollRange();
        int i13 = kVar.f10127q;
        boolean z4 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= i11;
        kVar.f10131u = z4;
        boolean z10 = kVar.f10130t;
        if (!z10 && !z4) {
            if (kVar.f10132v != 0) {
                kVar.f(0);
                return;
            }
            return;
        }
        if (z10) {
            float f10 = i12;
            kVar.f10122l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
            kVar.f10121k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (kVar.f10131u) {
            float f11 = iComputeHorizontalScrollOffset;
            float f12 = i13;
            kVar.f10125o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
            kVar.f10124n = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = kVar.f10132v;
        if (i14 == 0 || i14 == 1) {
            kVar.f(1);
        }
    }
}
