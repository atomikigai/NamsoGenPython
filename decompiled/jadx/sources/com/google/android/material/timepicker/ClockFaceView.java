package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import e0.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q0.v0;
import z.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends e implements d {
    public final ClockHandView G;
    public final Rect H;
    public final RectF I;
    public final Rect J;
    public final SparseArray K;
    public final c L;
    public final int[] M;
    public final float[] N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final String[] S;
    public float T;
    public final ColorStateList U;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = new Rect();
        this.I = new RectF();
        this.J = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.K = sparseArray;
        this.N = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d8.a.h, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListH = android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 1);
        this.U = colorStateListH;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.G = clockHandView;
        this.O = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListH.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListH.getDefaultColor());
        this.M = new int[]{colorForState, colorForState, colorStateListH.getDefaultColor()};
        clockHandView.f2581c.add(this);
        int defaultColor = k.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListH2 = android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListH2 != null ? colorStateListH2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.L = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.S = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z4 = false;
        for (int i = 0; i < Math.max(this.S.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.S.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.S[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i10 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                z4 = i10 > 1 ? true : z4;
                v0.l(textView, this.L);
                textView.setTextColor(this.U);
            }
        }
        ClockHandView clockHandView2 = this.G;
        if (clockHandView2.f2580b && !z4) {
            clockHandView2.f2590x = 1;
        }
        clockHandView2.f2580b = z4;
        clockHandView2.invalidate();
        this.P = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.Q = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.R = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        m mVar = new m();
        mVar.b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i10 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i10 == null) {
                    i10 = 1;
                }
                if (!map.containsKey(i10)) {
                    map.put(i10, new ArrayList());
                }
                ((List) map.get(i10)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.E * 0.66f) : this.E;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                z.i iVar = mVar.e(((View) it.next()).getId()).f10785d;
                iVar.f10824z = R.id.circle_center;
                iVar.A = iRound;
                iVar.B = size;
                size += 360.0f / list.size();
            }
        }
        mVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.K;
            if (i11 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i11)).setVisibility(0);
            i11++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.G.f2584r;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.K;
            int size = sparseArray.size();
            rect = this.H;
            rectF = this.I;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f10) {
                    textView = textView2;
                    f10 = fHeight;
                }
            }
            i++;
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextView textView3 = (TextView) sparseArray.get(i10);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.J;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.M, this.N, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) n5.c.a(1, this.S.length, 1).f7282a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        super.onLayout(z4, i, i10, i11, i12);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.R / Math.max(Math.max(this.P / displayMetrics.heightPixels, this.Q / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
