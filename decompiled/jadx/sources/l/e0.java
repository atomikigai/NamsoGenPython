package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends z {
    public final d0 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f6260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f6261g;
    public PorterDuff.Mode h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6262j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.f6261g = null;
        this.h = null;
        this.i = false;
        this.f6262j = false;
        this.e = d0Var;
    }

    @Override // l.z
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        d0 d0Var = this.e;
        Context context = d0Var.getContext();
        int[] iArr = f.a.f3557g;
        a2.l lVarG = a2.l.G(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) lVarG.f44c;
        q0.v0.k(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) lVarG.f44c, R.attr.seekBarStyle);
        Drawable drawableV = lVarG.v(0);
        if (drawableV != null) {
            d0Var.setThumb(drawableV);
        }
        Drawable drawableU = lVarG.u(1);
        Drawable drawable = this.f6260f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f6260f = drawableU;
        if (drawableU != null) {
            drawableU.setCallback(d0Var);
            i0.c.b(drawableU, q0.e0.d(d0Var));
            if (drawableU.isStateful()) {
                drawableU.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.h = l1.b(typedArray.getInt(3, -1), this.h);
            this.f6262j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f6261g = lVarG.t(2);
            this.i = true;
        }
        lVarG.I();
        f();
    }

    public final void f() {
        Drawable drawable = this.f6260f;
        if (drawable != null) {
            if (this.i || this.f6262j) {
                Drawable drawableMutate = drawable.mutate();
                this.f6260f = drawableMutate;
                if (this.i) {
                    i0.b.h(drawableMutate, this.f6261g);
                }
                if (this.f6262j) {
                    i0.b.i(this.f6260f, this.h);
                }
                if (this.f6260f.isStateful()) {
                    this.f6260f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f6260f != null) {
            d0 d0Var = this.e;
            int max = d0Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f6260f.getIntrinsicWidth();
                int intrinsicHeight = this.f6260f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f6260f.setBounds(-i, -i10, i, i10);
                float width = ((d0Var.getWidth() - d0Var.getPaddingLeft()) - d0Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(d0Var.getPaddingLeft(), d0Var.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f6260f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
