package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class o extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.n f6375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f6376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f6377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z2.a(context);
        y2.a(getContext(), this);
        fd.n nVar = new fd.n(this);
        this.f6375a = nVar;
        nVar.l(attributeSet, i);
        w0 w0Var = new w0(this);
        this.f6376b = w0Var;
        w0Var.f(attributeSet, i);
        w0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private u getEmojiTextViewHelper() {
        if (this.f6377c == null) {
            this.f6377c = new u(this);
        }
        return this.f6377c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fd.n nVar = this.f6375a;
        if (nVar != null) {
            nVar.a();
        }
        w0 w0Var = this.f6376b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p3.f6396b) {
            return super.getAutoSizeMaxTextSize();
        }
        w0 w0Var = this.f6376b;
        if (w0Var != null) {
            return Math.round(w0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (p3.f6396b) {
            return super.getAutoSizeMinTextSize();
        }
        w0 w0Var = this.f6376b;
        if (w0Var != null) {
            return Math.round(w0Var.i.f6275d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (p3.f6396b) {
            return super.getAutoSizeStepGranularity();
        }
        w0 w0Var = this.f6376b;
        if (w0Var != null) {
            return Math.round(w0Var.i.f6274c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (p3.f6396b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w0 w0Var = this.f6376b;
        return w0Var != null ? w0Var.i.f6276f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (p3.f6396b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        w0 w0Var = this.f6376b;
        if (w0Var != null) {
            return w0Var.i.f6272a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return jd.d.M(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        fd.n nVar = this.f6375a;
        if (nVar != null) {
            return nVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fd.n nVar = this.f6375a;
        if (nVar != null) {
            return nVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6376b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6376b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        super.onLayout(z4, i, i10, i11, i12);
        w0 w0Var = this.f6376b;
        if (w0Var == null || p3.f6396b) {
            return;
        }
        w0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        w0 w0Var = this.f6376b;
        if (w0Var != null) {
            g1 g1Var = w0Var.i;
            if (p3.f6396b || !g1Var.f()) {
                return;
            }
            g1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i10, int i11, int i12) {
        if (p3.f6396b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i10, i11, i12);
            return;
        }
        w0 w0Var = this.f6376b;
        if (w0Var != null) {
            w0Var.i(i, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (p3.f6396b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        w0 w0Var = this.f6376b;
        if (w0Var != null) {
            w0Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (p3.f6396b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        w0 w0Var = this.f6376b;
        if (w0Var != null) {
            w0Var.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fd.n nVar = this.f6375a;
        if (nVar != null) {
            nVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fd.n nVar = this.f6375a;
        if (nVar != null) {
            nVar.o(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jd.d.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((fa.c1) getEmojiTextViewHelper().f6428b.f3489b).u(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z4) {
        w0 w0Var = this.f6376b;
        if (w0Var != null) {
            w0Var.f6449a.setAllCaps(z4);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fd.n nVar = this.f6375a;
        if (nVar != null) {
            nVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fd.n nVar = this.f6375a;
        if (nVar != null) {
            nVar.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f6376b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f6376b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w0 w0Var = this.f6376b;
        if (w0Var != null) {
            w0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f10) {
        boolean z4 = p3.f6396b;
        if (z4) {
            super.setTextSize(i, f10);
            return;
        }
        w0 w0Var = this.f6376b;
        if (w0Var != null) {
            g1 g1Var = w0Var.i;
            if (z4 || g1Var.f()) {
                return;
            }
            g1Var.g(i, f10);
        }
    }
}
