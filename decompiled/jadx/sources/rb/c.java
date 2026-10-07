package rb;

import android.view.View;
import android.view.WindowInsets;
import ic.q;
import jc.i;
import jc.j;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends j implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f8244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z4, boolean z10, boolean z11, boolean z12) {
        super(3);
        this.f8244a = z4;
        this.f8245b = z10;
        this.f8246c = z11;
        this.f8247d = z12;
    }

    @Override // ic.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        WindowInsets windowInsets = (WindowInsets) obj2;
        a aVar = (a) obj3;
        i.e(view, "view");
        i.e(windowInsets, "windowInsets");
        i.e(aVar, "initialPadding");
        int i = aVar.f8238a;
        Integer numValueOf = Integer.valueOf(windowInsets.getSystemWindowInsetLeft());
        if (!this.f8244a) {
            numValueOf = null;
        }
        int iIntValue = i + (numValueOf == null ? 0 : numValueOf.intValue());
        int i10 = aVar.f8239b;
        Integer numValueOf2 = Integer.valueOf(windowInsets.getSystemWindowInsetTop());
        if (!this.f8245b) {
            numValueOf2 = null;
        }
        int iIntValue2 = i10 + (numValueOf2 == null ? 0 : numValueOf2.intValue());
        int i11 = aVar.f8240c;
        Integer numValueOf3 = Integer.valueOf(windowInsets.getSystemWindowInsetRight());
        if (!this.f8246c) {
            numValueOf3 = null;
        }
        int iIntValue3 = i11 + (numValueOf3 == null ? 0 : numValueOf3.intValue());
        int i12 = aVar.f8241d;
        Integer numValueOf4 = this.f8247d ? Integer.valueOf(windowInsets.getSystemWindowInsetBottom()) : null;
        view.setPadding(iIntValue, iIntValue2, iIntValue3, i12 + (numValueOf4 != null ? numValueOf4.intValue() : 0));
        return k.f9073a;
    }
}
