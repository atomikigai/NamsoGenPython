package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.d f6397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd.n f6398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f6399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f6400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        z2.a(context);
        y2.a(getContext(), this);
        w0 w0Var = new w0(this);
        this.f6399c = w0Var;
        w0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        w0Var.b();
        fd.n nVar = new fd.n(this);
        this.f6398b = nVar;
        nVar.l(attributeSet, R.attr.checkedTextViewStyle);
        this.f6397a = new f2.d(this);
        Context context2 = getContext();
        int[] iArr = f.a.f3560l;
        a2.l lVarG = a2.l.G(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) lVarG.f44c;
        q0.v0.k(this, getContext(), iArr, attributeSet, (TypedArray) lVarG.f44c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(com.bumptech.glide.d.r(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(com.bumptech.glide.d.r(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(com.bumptech.glide.d.r(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(lVarG.t(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(l1.b(typedArray.getInt(3, -1), null));
            }
            lVarG.I();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            lVarG.I();
            throw th;
        }
    }

    private u getEmojiTextViewHelper() {
        if (this.f6400d == null) {
            this.f6400d = new u(this);
        }
        return this.f6400d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w0 w0Var = this.f6399c;
        if (w0Var != null) {
            w0Var.b();
        }
        fd.n nVar = this.f6398b;
        if (nVar != null) {
            nVar.a();
        }
        f2.d dVar = this.f6397a;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return jd.d.M(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        fd.n nVar = this.f6398b;
        if (nVar != null) {
            return nVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fd.n nVar = this.f6398b;
        if (nVar != null) {
            return nVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        f2.d dVar = this.f6397a;
        if (dVar != null) {
            return (ColorStateList) dVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        f2.d dVar = this.f6397a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f3584f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6399c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6399c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        n9.b.u(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fd.n nVar = this.f6398b;
        if (nVar != null) {
            nVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fd.n nVar = this.f6398b;
        if (nVar != null) {
            nVar.o(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        f2.d dVar = this.f6397a;
        if (dVar != null) {
            if (dVar.f3582c) {
                dVar.f3582c = false;
            } else {
                dVar.f3582c = true;
                dVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f6399c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f6399c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jd.d.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fd.n nVar = this.f6398b;
        if (nVar != null) {
            nVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fd.n nVar = this.f6398b;
        if (nVar != null) {
            nVar.u(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        f2.d dVar = this.f6397a;
        if (dVar != null) {
            dVar.e = colorStateList;
            dVar.f3580a = true;
            dVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        f2.d dVar = this.f6397a;
        if (dVar != null) {
            dVar.f3584f = mode;
            dVar.f3581b = true;
            dVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f6399c;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f6399c;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w0 w0Var = this.f6399c;
        if (w0Var != null) {
            w0Var.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(com.bumptech.glide.d.r(getContext(), i));
    }
}
