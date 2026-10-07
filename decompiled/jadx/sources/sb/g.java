package sb;

import android.view.ViewGroup;
import ic.l;
import jc.i;
import jc.j;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f8477b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i) {
        super(1);
        this.f8476a = i;
        this.f8477b = hVar;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        switch (this.f8476a) {
            case 0:
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) obj;
                i.e(marginLayoutParams, "$this$updateLayoutParams");
                marginLayoutParams.setMarginStart(this.f8477b.f8483s);
                break;
            default:
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) obj;
                i.e(marginLayoutParams2, "$this$updateLayoutParams");
                h hVar = this.f8477b;
                marginLayoutParams2.setMarginStart(hVar.f8483s);
                marginLayoutParams2.setMarginEnd(hVar.f8483s);
                break;
        }
        return k.f9073a;
    }
}
