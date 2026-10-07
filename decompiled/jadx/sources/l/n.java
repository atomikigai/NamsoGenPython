package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class n extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f6365d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.n f6366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f6367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f6368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, app.namso_gen.spacehowen.R.attr.autoCompleteTextViewStyle);
        z2.a(context);
        y2.a(getContext(), this);
        a2.l lVarG = a2.l.G(getContext(), attributeSet, f6365d, app.namso_gen.spacehowen.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) lVarG.f44c).hasValue(0)) {
            setDropDownBackgroundDrawable(lVarG.u(0));
        }
        lVarG.I();
        fd.n nVar = new fd.n(this);
        this.f6366a = nVar;
        nVar.l(attributeSet, app.namso_gen.spacehowen.R.attr.autoCompleteTextViewStyle);
        w0 w0Var = new w0(this);
        this.f6367b = w0Var;
        w0Var.f(attributeSet, app.namso_gen.spacehowen.R.attr.autoCompleteTextViewStyle);
        w0Var.b();
        z zVar = new z(this);
        this.f6368c = zVar;
        zVar.b(attributeSet, app.namso_gen.spacehowen.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = zVar.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fd.n nVar = this.f6366a;
        if (nVar != null) {
            nVar.a();
        }
        w0 w0Var = this.f6367b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return jd.d.M(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        fd.n nVar = this.f6366a;
        if (nVar != null) {
            return nVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fd.n nVar = this.f6366a;
        if (nVar != null) {
            return nVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6367b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6367b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        n9.b.u(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f6368c.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fd.n nVar = this.f6366a;
        if (nVar != null) {
            nVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fd.n nVar = this.f6366a;
        if (nVar != null) {
            nVar.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f6367b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f6367b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jd.d.O(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(com.bumptech.glide.d.r(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f6368c.d(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f6368c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fd.n nVar = this.f6366a;
        if (nVar != null) {
            nVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fd.n nVar = this.f6366a;
        if (nVar != null) {
            nVar.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f6367b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f6367b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w0 w0Var = this.f6367b;
        if (w0Var != null) {
            w0Var.g(context, i);
        }
    }
}
