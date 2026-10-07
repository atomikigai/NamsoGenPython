package x1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends androidx.emoji2.text.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(h0 h0Var, int i) {
        super(h0Var);
        this.f10217d = i;
    }

    @Override // androidx.emoji2.text.g
    public final int d(View view) {
        int right;
        int i;
        switch (this.f10217d) {
            case 0:
                i0 i0Var = (i0) view.getLayoutParams();
                ((h0) this.f766b).getClass();
                right = view.getRight() + ((i0) view.getLayoutParams()).f10106b.right;
                i = ((ViewGroup.MarginLayoutParams) i0Var).rightMargin;
                break;
            default:
                i0 i0Var2 = (i0) view.getLayoutParams();
                ((h0) this.f766b).getClass();
                right = view.getBottom() + ((i0) view.getLayoutParams()).f10106b.bottom;
                i = ((ViewGroup.MarginLayoutParams) i0Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // androidx.emoji2.text.g
    public final int e(View view) {
        int measuredWidth;
        int i;
        switch (this.f10217d) {
            case 0:
                i0 i0Var = (i0) view.getLayoutParams();
                ((h0) this.f766b).getClass();
                Rect rect = ((i0) view.getLayoutParams()).f10106b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) i0Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) i0Var).rightMargin;
                break;
            default:
                i0 i0Var2 = (i0) view.getLayoutParams();
                ((h0) this.f766b).getClass();
                Rect rect2 = ((i0) view.getLayoutParams()).f10106b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) i0Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) i0Var2).bottomMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // androidx.emoji2.text.g
    public final int f(View view) {
        int measuredHeight;
        int i;
        switch (this.f10217d) {
            case 0:
                i0 i0Var = (i0) view.getLayoutParams();
                ((h0) this.f766b).getClass();
                Rect rect = ((i0) view.getLayoutParams()).f10106b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) i0Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) i0Var).bottomMargin;
                break;
            default:
                i0 i0Var2 = (i0) view.getLayoutParams();
                ((h0) this.f766b).getClass();
                Rect rect2 = ((i0) view.getLayoutParams()).f10106b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) i0Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) i0Var2).rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // androidx.emoji2.text.g
    public final int g(View view) {
        int left;
        int i;
        switch (this.f10217d) {
            case 0:
                i0 i0Var = (i0) view.getLayoutParams();
                ((h0) this.f766b).getClass();
                left = view.getLeft() - ((i0) view.getLayoutParams()).f10106b.left;
                i = ((ViewGroup.MarginLayoutParams) i0Var).leftMargin;
                break;
            default:
                i0 i0Var2 = (i0) view.getLayoutParams();
                ((h0) this.f766b).getClass();
                left = view.getTop() - ((i0) view.getLayoutParams()).f10106b.top;
                i = ((ViewGroup.MarginLayoutParams) i0Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // androidx.emoji2.text.g
    public final int h() {
        switch (this.f10217d) {
            case 0:
                return ((h0) this.f766b).f10092n;
            default:
                return ((h0) this.f766b).f10093o;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int i() {
        int i;
        int iD;
        switch (this.f10217d) {
            case 0:
                h0 h0Var = (h0) this.f766b;
                i = h0Var.f10092n;
                iD = h0Var.D();
                break;
            default:
                h0 h0Var2 = (h0) this.f766b;
                i = h0Var2.f10093o;
                iD = h0Var2.B();
                break;
        }
        return i - iD;
    }

    @Override // androidx.emoji2.text.g
    public final int j() {
        switch (this.f10217d) {
            case 0:
                return ((h0) this.f766b).D();
            default:
                return ((h0) this.f766b).B();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int k() {
        switch (this.f10217d) {
            case 0:
                return ((h0) this.f766b).f10090l;
            default:
                return ((h0) this.f766b).f10091m;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int l() {
        switch (this.f10217d) {
            case 0:
                return ((h0) this.f766b).f10091m;
            default:
                return ((h0) this.f766b).f10090l;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int m() {
        switch (this.f10217d) {
            case 0:
                return ((h0) this.f766b).C();
            default:
                return ((h0) this.f766b).E();
        }
    }

    @Override // androidx.emoji2.text.g
    public final int n() {
        int iC;
        int iD;
        switch (this.f10217d) {
            case 0:
                h0 h0Var = (h0) this.f766b;
                iC = h0Var.f10092n - h0Var.C();
                iD = h0Var.D();
                break;
            default:
                h0 h0Var2 = (h0) this.f766b;
                iC = h0Var2.f10093o - h0Var2.E();
                iD = h0Var2.B();
                break;
        }
        return iC - iD;
    }

    @Override // androidx.emoji2.text.g
    public final int o(View view) {
        switch (this.f10217d) {
            case 0:
                h0 h0Var = (h0) this.f766b;
                Rect rect = (Rect) this.f767c;
                h0Var.I(view, rect);
                return rect.right;
            default:
                h0 h0Var2 = (h0) this.f766b;
                Rect rect2 = (Rect) this.f767c;
                h0Var2.I(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.g
    public final int p(View view) {
        switch (this.f10217d) {
            case 0:
                h0 h0Var = (h0) this.f766b;
                Rect rect = (Rect) this.f767c;
                h0Var.I(view, rect);
                return rect.left;
            default:
                h0 h0Var2 = (h0) this.f766b;
                Rect rect2 = (Rect) this.f767c;
                h0Var2.I(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.g
    public final void q(int i) {
        switch (this.f10217d) {
            case 0:
                ((h0) this.f766b).M(i);
                break;
            default:
                ((h0) this.f766b).N(i);
                break;
        }
    }
}
