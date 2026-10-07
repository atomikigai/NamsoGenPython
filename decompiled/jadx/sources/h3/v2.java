package h3;

import android.R;
import android.os.Bundle;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v2 implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f4880b;

    public /* synthetic */ v2(x2 x2Var, int i) {
        this.f4879a = i;
        this.f4880b = x2Var;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        switch (this.f4879a) {
            case 0:
                i3.q qVar = (i3.q) obj;
                jc.i.e(qVar, "item");
                String str = qVar.f5196a;
                Bundle bundle = new Bundle();
                bundle.putString("email", str);
                c3 c3Var = new c3();
                c3Var.Y(bundle);
                androidx.fragment.app.i0 i0VarP = this.f4880b.T().p();
                i0VarP.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0VarP);
                aVar.k(R.id.content, c3Var, null);
                aVar.c();
                aVar.e(false);
                break;
            default:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                x2 x2Var = this.f4880b;
                TextView textView = x2Var.k0;
                if (textView == null) {
                    jc.i.i("textSelectionInfo");
                    throw null;
                }
                textView.setText(iIntValue == 0 ? x2Var.v(app.namso_gen.spacehowen.R.string.tmph_select_hint) : x2Var.w(app.namso_gen.spacehowen.R.string.tmph_selected_count, num));
                TextView textView2 = x2Var.f4899l0;
                if (textView2 == null) {
                    jc.i.i("btnDeleteSelected");
                    throw null;
                }
                textView2.setEnabled(iIntValue > 0);
                break;
                break;
        }
        return ub.k.f9073a;
    }
}
