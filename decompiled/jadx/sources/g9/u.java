package g9;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import com.firebase.ui.auth.ui.phone.CountryListSpinner;
import l.c2;
import l.m0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4402b;

    public /* synthetic */ u(Object obj, int i) {
        this.f4401a = i;
        this.f4402b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        Object item;
        switch (this.f4401a) {
            case 0:
                w wVar = (w) this.f4402b;
                c2 c2Var = wVar.e;
                if (i < 0) {
                    item = !c2Var.K.isShowing() ? null : c2Var.f6244c.getSelectedItem();
                } else {
                    item = wVar.getAdapter().getItem(i);
                }
                w.a(wVar, item);
                AdapterView.OnItemClickListener onItemClickListener = wVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c2Var.K.isShowing() ? null : c2Var.f6244c.getSelectedView();
                        i = !c2Var.K.isShowing() ? -1 : c2Var.f6244c.getSelectedItemPosition();
                        j4 = !c2Var.K.isShowing() ? Long.MIN_VALUE : c2Var.f6244c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c2Var.f6244c, view, i, j4);
                }
                c2Var.dismiss();
                break;
            case 1:
                m0 m0Var = (m0) this.f4402b;
                m0Var.R.setSelection(i);
                if (m0Var.R.getOnItemClickListener() != null) {
                    m0Var.R.performItemClick(view, i, m0Var.O.getItemId(i));
                }
                m0Var.dismiss();
                break;
            case 2:
                ((SearchView) this.f4402b).n(i);
                break;
            default:
                CountryListSpinner countryListSpinner = (CountryListSpinner) this.f4402b;
                s4.a aVar = (s4.a) countryListSpinner.f1941t.getItem(i);
                if (aVar != null) {
                    countryListSpinner.e(aVar.f8391c, aVar.f8390b);
                }
                countryListSpinner.f1944w.dismiss();
                break;
        }
    }
}
