package g9;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import l.z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends q0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputLayout f4320d;

    public a0(TextInputLayout textInputLayout) {
        this.f4320d = textInputLayout;
    }

    @Override // q0.c
    public final void d(View view, r0.l lVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f8119a;
        this.f7886a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f4320d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z4 = textInputLayout.E0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        y yVar = textInputLayout.f2540b;
        z0 z0Var = yVar.f4416b;
        if (z0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(z0Var);
            accessibilityNodeInfo.setTraversalAfter(z0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(yVar.f4418d);
        }
        if (!zIsEmpty) {
            lVar.p(text);
        } else if (!TextUtils.isEmpty(string)) {
            lVar.p(string);
            if (!z4 && placeholderText != null) {
                lVar.p(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            lVar.p(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            if (Build.VERSION.SDK_INT >= 26) {
                lVar.l(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                lVar.p(string);
            }
            lVar.o(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z10) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        z0 z0Var2 = textInputLayout.f2565u.f4399y;
        if (z0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(z0Var2);
        }
        textInputLayout.f2542c.b().m(lVar);
    }

    @Override // q0.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f4320d.f2542c.b().n(accessibilityEvent);
    }
}
