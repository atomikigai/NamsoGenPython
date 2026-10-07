package g9;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4425b;

    public /* synthetic */ z(Object obj, int i) {
        this.f4424a = i;
        this.f4425b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f4424a) {
            case 0:
                TextInputLayout textInputLayout = (TextInputLayout) this.f4425b;
                textInputLayout.u(!textInputLayout.K0, false);
                if (textInputLayout.f2567v) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.D) {
                    textInputLayout.v(editable);
                }
                break;
            case 1:
                break;
            case 2:
                l3.i iVar = (l3.i) this.f4425b;
                String string = editable != null ? editable.toString() : null;
                if (string == null) {
                    string = "";
                }
                iVar.g0(string);
                break;
            default:
                l3.y yVar = (l3.y) this.f4425b;
                String string2 = editable != null ? editable.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                l3.y.f0(yVar, string2);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        int i12 = this.f4424a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        switch (this.f4424a) {
            case 1:
                SearchView searchView = (SearchView) this.f4425b;
                Editable text = searchView.A.getText();
                searchView.f503j0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.v(!zIsEmpty);
                int i12 = 8;
                if (searchView.f502i0 && !searchView.f495b0 && zIsEmpty) {
                    searchView.F.setVisibility(8);
                    i12 = 0;
                }
                searchView.H.setVisibility(i12);
                searchView.r();
                searchView.u();
                charSequence.toString();
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i, int i10, int i11, CharSequence charSequence) {
    }
}
