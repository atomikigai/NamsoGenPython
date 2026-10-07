package g1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f4175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f4176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4177c = true;

    public i(EditText editText) {
        this.f4175a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l lVarA = l.a();
            if (editableText == null) {
                length = 0;
            } else {
                lVarA.getClass();
                length = editableText.length();
            }
            lVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        EditText editText = this.f4175a;
        if (editText.isInEditMode() || !this.f4177c || l.f771j == null || i10 > i11 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = l.a().b();
        if (iB != 0) {
            if (iB == 1) {
                l.a().e((Spannable) charSequence, i, i11 + i);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        l lVarA = l.a();
        if (this.f4176b == null) {
            this.f4176b = new h(editText);
        }
        lVarA.f(this.f4176b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }
}
