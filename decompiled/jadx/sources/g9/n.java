package g9;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f4350a;

    public n(p pVar) {
        this.f4350a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f4350a;
        m mVar = pVar.G;
        if (pVar.D == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.D;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (pVar.D.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.D.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.D = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        pVar.b().l(pVar.D);
        pVar.j(pVar.b());
    }
}
