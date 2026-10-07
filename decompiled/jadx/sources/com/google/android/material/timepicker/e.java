package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.namso_gen.spacehowen.R;
import b9.j;
import java.util.WeakHashMap;
import q0.d0;
import q0.e0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends ConstraintLayout {
    public final androidx.activity.d D;
    public int E;
    public final b9.g F;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        b9.g gVar = new b9.g();
        this.F = gVar;
        b9.h hVar = new b9.h(0.5f);
        j jVarE = gVar.f1454a.f1440a.e();
        jVarE.e = hVar;
        jVarE.f1473f = hVar;
        jVarE.f1474g = hVar;
        jVarE.h = hVar;
        gVar.setShapeAppearanceModel(jVarE.a());
        this.F.k(ColorStateList.valueOf(-1));
        b9.g gVar2 = this.F;
        WeakHashMap weakHashMap = v0.f7946a;
        d0.q(this, gVar2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d8.a.B, R.attr.materialClockStyle, 0);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.D = new androidx.activity.d(this, 7);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = v0.f7946a;
            view.setId(e0.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            androidx.activity.d dVar = this.D;
            handler.removeCallbacks(dVar);
            handler.post(dVar);
        }
    }

    public abstract void m();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            androidx.activity.d dVar = this.D;
            handler.removeCallbacks(dVar);
            handler.post(dVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.F.k(ColorStateList.valueOf(i));
    }
}
