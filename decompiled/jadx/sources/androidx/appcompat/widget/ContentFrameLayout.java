package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import g.u;
import k.l;
import l.f;
import l.i1;
import l.i3;
import l.j;
import l.j1;
import q0.e1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f489d;
    public TypedValue e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f490f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i1 f492s;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f491r = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f490f == null) {
            this.f490f = new TypedValue();
        }
        return this.f490f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f488c == null) {
            this.f488c = new TypedValue();
        }
        return this.f488c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f489d == null) {
            this.f489d = new TypedValue();
        }
        return this.f489d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f486a == null) {
            this.f486a = new TypedValue();
        }
        return this.f486a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f487b == null) {
            this.f487b = new TypedValue();
        }
        return this.f487b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i1 i1Var = this.f492s;
        if (i1Var != null) {
            i1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        j jVar;
        super.onDetachedFromWindow();
        i1 i1Var = this.f492s;
        if (i1Var != null) {
            u uVar = (u) ((a4.b) i1Var).f113b;
            j1 j1Var = uVar.C;
            if (j1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((i3) actionBarOverlayLayout.e).f6293a.f513a;
                if (actionMenuView != null && (jVar = actionMenuView.E) != null) {
                    jVar.h();
                    f fVar = jVar.E;
                    if (fVar != null && fVar.b()) {
                        fVar.i.dismiss();
                    }
                }
            }
            if (uVar.H != null) {
                uVar.f4106w.getDecorView().removeCallbacks(uVar.I);
                if (uVar.H.isShowing()) {
                    try {
                        uVar.H.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                uVar.H = null;
            }
            e1 e1Var = uVar.J;
            if (e1Var != null) {
                e1Var.b();
            }
            l lVar = uVar.D(0).h;
            if (lVar != null) {
                lVar.c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        int iMakeMeasureSpec;
        boolean z4;
        int iMakeMeasureSpec2;
        int i11;
        int i12;
        float fraction;
        int i13;
        int i14;
        float fraction2;
        int i15;
        int i16;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z10 = true;
        boolean z11 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i10);
        Rect rect = this.f491r;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i;
            z4 = false;
        } else {
            TypedValue typedValue = z11 ? this.f489d : this.f488c;
            if (typedValue == null || (i15 = typedValue.type) == 0) {
                iMakeMeasureSpec = i;
                z4 = false;
            } else {
                if (i15 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i15 == 6) {
                        int i17 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i17, i17);
                    } else {
                        i16 = 0;
                    }
                    if (i16 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z4 = true;
                    } else {
                        iMakeMeasureSpec = i;
                        z4 = false;
                    }
                }
                i16 = (int) fraction3;
                if (i16 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z4 = true;
                } else {
                    iMakeMeasureSpec = i;
                    z4 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i10;
        } else {
            TypedValue typedValue2 = z11 ? this.e : this.f490f;
            if (typedValue2 == null || (i13 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i10;
            } else {
                if (i13 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i13 == 6) {
                        int i18 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i18, i18);
                    } else {
                        i14 = 0;
                    }
                    if (i14 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i10;
                    }
                }
                i14 = (int) fraction2;
                if (i14 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i10;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z4 || mode != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            TypedValue typedValue3 = z11 ? this.f487b : this.f486a;
            if (typedValue3 == null || (i11 = typedValue3.type) == 0) {
                z10 = false;
            } else {
                if (i11 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i11 == 6) {
                        int i19 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i19, i19);
                    } else {
                        i12 = 0;
                    }
                    if (i12 > 0) {
                        i12 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i12) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    } else {
                        z10 = false;
                    }
                }
                i12 = (int) fraction;
                if (i12 > 0) {
                    i12 -= rect.left + rect.right;
                }
                if (measuredWidth < i12) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else {
                    z10 = false;
                }
            }
        }
        if (z10) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(i1 i1Var) {
        this.f492s = i1Var;
    }
}
