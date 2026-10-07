package h3;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4627b;

    public /* synthetic */ b0(Object obj, int i) {
        this.f4626a = i;
        this.f4627b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j4) {
        l.r1 r1Var;
        switch (this.f4626a) {
            case 0:
                jc.i.e(adapterView, "parent");
                ((c0) this.f4627b).f4642j0 = i;
                return;
            case 1:
                i1 i1Var = (i1) this.f4627b;
                String str = i1Var.f4726g0[i];
                i1Var.f4725f0 = str;
                if (jc.i.a(str, "personalizado")) {
                    EditText editText = i1Var.f4728i0;
                    if (editText != null) {
                        editText.setVisibility(0);
                        return;
                    } else {
                        jc.i.i("personalizado");
                        throw null;
                    }
                }
                EditText editText2 = i1Var.f4728i0;
                if (editText2 == null) {
                    jc.i.i("personalizado");
                    throw null;
                }
                editText2.setVisibility(8);
                EditText editText3 = i1Var.f4728i0;
                if (editText3 != null) {
                    editText3.setText("");
                    return;
                } else {
                    jc.i.i("personalizado");
                    throw null;
                }
            case 2:
                if (i == -1 || (r1Var = ((l.c2) this.f4627b).f6244c) == null) {
                    return;
                }
                r1Var.setListSelectionHidden(false);
                return;
            default:
                ((SearchView) this.f4627b).o(i);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        switch (this.f4626a) {
            case 0:
                jc.i.e(adapterView, "parent");
                break;
        }
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }
}
