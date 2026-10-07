package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.v4.media.session.a;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import d9.i;
import java.util.WeakHashMap;
import q0.e0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f2512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f2513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f2514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2515d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2514c = a.w(context, R.attr.motionEasingEmphasizedInterpolator, e8.a.f3492b);
    }

    public final boolean a(int i, int i10, int i11) {
        boolean z4;
        if (i != getOrientation()) {
            setOrientation(i);
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f2512a.getPaddingTop() == i10 && this.f2512a.getPaddingBottom() == i11) {
            return z4;
        }
        TextView textView = this.f2512a;
        WeakHashMap weakHashMap = v0.f7946a;
        if (e0.g(textView)) {
            e0.k(textView, e0.f(textView), i10, e0.e(textView), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f2513b;
    }

    public TextView getMessageView() {
        return this.f2512a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2512a = (TextView) findViewById(R.id.snackbar_text);
        this.f2513b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f2512a.getLayout();
        boolean z4 = layout != null && layout.getLineCount() > 1;
        if (!z4 || this.f2515d <= 0 || this.f2513b.getMeasuredWidth() <= this.f2515d) {
            if (!z4) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i10);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f2515d = i;
    }
}
