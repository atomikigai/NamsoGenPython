package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends c2 implements o0 {
    public CharSequence N;
    public ListAdapter O;
    public final Rect P;
    public int Q;
    public final /* synthetic */ p0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.R = p0Var;
        this.P = new Rect();
        this.f6255z = p0Var;
        this.J = true;
        this.K.setFocusable(true);
        this.A = new g9.u(this, 1);
    }

    @Override // l.o0
    public final CharSequence d() {
        return this.N;
    }

    @Override // l.o0
    public final void f(CharSequence charSequence) {
        this.N = charSequence;
    }

    @Override // l.o0
    public final void k(int i) {
        this.Q = i;
    }

    @Override // l.o0
    public final void n(int i, int i10) {
        ViewTreeObserver viewTreeObserver;
        y yVar = this.K;
        boolean zIsShowing = yVar.isShowing();
        s();
        yVar.setInputMethodMode(2);
        h();
        r1 r1Var = this.f6244c;
        r1Var.setChoiceMode(1);
        h0.d(r1Var, i);
        h0.c(r1Var, i10);
        p0 p0Var = this.R;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        r1 r1Var2 = this.f6244c;
        if (yVar.isShowing() && r1Var2 != null) {
            r1Var2.setListSelectionHidden(false);
            r1Var2.setSelection(selectedItemPosition);
            if (r1Var2.getChoiceMode() != 0) {
                r1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = p0Var.getViewTreeObserver()) == null) {
            return;
        }
        k.d dVar = new k.d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        yVar.setOnDismissListener(new l0(this, dVar));
    }

    @Override // l.c2, l.o0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.O = listAdapter;
    }

    public final void s() {
        int i;
        p0 p0Var = this.R;
        Rect rect = p0Var.f6391s;
        y yVar = this.K;
        Drawable background = yVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i = p3.a(p0Var) ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = p0Var.getPaddingLeft();
        int paddingRight = p0Var.getPaddingRight();
        int width = p0Var.getWidth();
        int i10 = p0Var.f6390r;
        if (i10 == -2) {
            int iA = p0Var.a((SpinnerAdapter) this.O, yVar.getBackground());
            int i11 = (p0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i11) {
                iA = i11;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i10);
        }
        this.f6246f = p3.a(p0Var) ? (((width - paddingRight) - this.e) - this.Q) + i : paddingLeft + this.Q + i;
    }
}
