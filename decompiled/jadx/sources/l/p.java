package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class p extends CheckBox implements u0.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.d f6380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd.n f6381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f6382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f6383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z2.a(context);
        y2.a(getContext(), this);
        f2.d dVar = new f2.d(this);
        this.f6380a = dVar;
        dVar.e(attributeSet, i);
        fd.n nVar = new fd.n(this);
        this.f6381b = nVar;
        nVar.l(attributeSet, i);
        w0 w0Var = new w0(this);
        this.f6382c = w0Var;
        w0Var.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private u getEmojiTextViewHelper() {
        if (this.f6383d == null) {
            this.f6383d = new u(this);
        }
        return this.f6383d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        fd.n nVar = this.f6381b;
        if (nVar != null) {
            nVar.a();
        }
        w0 w0Var = this.f6382c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        f2.d dVar = this.f6380a;
        if (dVar != null) {
            dVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        fd.n nVar = this.f6381b;
        if (nVar != null) {
            return nVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fd.n nVar = this.f6381b;
        if (nVar != null) {
            return nVar.i();
        }
        return null;
    }

    @Override // u0.u
    public ColorStateList getSupportButtonTintList() {
        f2.d dVar = this.f6380a;
        if (dVar != null) {
            return (ColorStateList) dVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        f2.d dVar = this.f6380a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f3584f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6382c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6382c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fd.n nVar = this.f6381b;
        if (nVar != null) {
            nVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fd.n nVar = this.f6381b;
        if (nVar != null) {
            nVar.o(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        f2.d dVar = this.f6380a;
        if (dVar != null) {
            if (dVar.f3582c) {
                dVar.f3582c = false;
            } else {
                dVar.f3582c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f6382c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f6382c;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((fa.c1) getEmojiTextViewHelper().f6428b.f3489b).u(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fd.n nVar = this.f6381b;
        if (nVar != null) {
            nVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fd.n nVar = this.f6381b;
        if (nVar != null) {
            nVar.u(mode);
        }
    }

    @Override // u0.u
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        f2.d dVar = this.f6380a;
        if (dVar != null) {
            dVar.e = colorStateList;
            dVar.f3580a = true;
            dVar.a();
        }
    }

    @Override // u0.u
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        f2.d dVar = this.f6380a;
        if (dVar != null) {
            dVar.f3584f = mode;
            dVar.f3581b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f6382c;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f6382c;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(com.bumptech.glide.d.r(getContext(), i));
    }
}
