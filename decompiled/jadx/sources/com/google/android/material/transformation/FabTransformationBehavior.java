package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import app.namso_gen.spacehowen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e8.a;
import e8.e;
import e8.f;
import h6.o0;
import j9.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jd.l;
import q0.j0;
import q0.v0;
import z9.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f2599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f2600d;
    public final RectF e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f2601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2602g;
    public float h;

    public FabTransformationBehavior() {
        this.f2599c = new Rect();
        this.f2600d = new RectF();
        this.e = new RectF();
        this.f2601f = new int[2];
    }

    public static Pair t(float f10, float f11, boolean z4, o0 o0Var) {
        f fVarD;
        f fVarD2;
        if (f10 == 0.0f || f11 == 0.0f) {
            fVarD = ((e) o0Var.f5061b).d("translationXLinear");
            fVarD2 = ((e) o0Var.f5061b).d("translationYLinear");
        } else if ((!z4 || f11 >= 0.0f) && (z4 || f11 <= 0.0f)) {
            fVarD = ((e) o0Var.f5061b).d("translationXCurveDownwards");
            fVarD2 = ((e) o0Var.f5061b).d("translationYCurveDownwards");
        } else {
            fVarD = ((e) o0Var.f5061b).d("translationXCurveUpwards");
            fVarD2 = ((e) o0Var.f5061b).d("translationYCurveUpwards");
        }
        return new Pair(fVarD, fVarD2);
    }

    public static float w(o0 o0Var, f fVar, float f10) {
        long j4 = fVar.f3500a;
        long j10 = fVar.f3501b;
        f fVarD = ((e) o0Var.f5061b).d("expansion");
        return a.a(f10, 0.0f, fVar.b().getInterpolation((((fVarD.f3500a + fVarD.f3501b) + 17) - j4) / j10));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, b0.b
    public final boolean b(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // b0.b
    public final void c(b0.e eVar) {
        if (eVar.h == 0) {
            eVar.h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet s(View view, View view2, boolean z4, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat;
        int i;
        float f10;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        o0 o0VarY = y(view2.getContext(), z4);
        if (z4) {
            this.f2602g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        WeakHashMap weakHashMap = v0.f7946a;
        float fI = j0.i(view2) - j0.i(view);
        if (z4) {
            if (!z10) {
                view2.setTranslationZ(-fI);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fI);
        }
        ((e) o0VarY.f5061b).d("elevation").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        float fU = u(view, view2, (c) o0VarY.f5062c);
        float fV = v(view, view2, (c) o0VarY.f5062c);
        Pair pairT = t(fU, fV, z4, o0VarY);
        f fVar = (f) pairT.first;
        f fVar2 = (f) pairT.second;
        RectF rectF = this.f2600d;
        if (z4) {
            if (!z10) {
                view2.setTranslationX(-fU);
                view2.setTranslationY(-fV);
            }
            i = 0;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f10 = 0.0f;
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fW = w(o0VarY, fVar, -fU);
            float fW2 = w(o0VarY, fVar2, -fV);
            Rect rect = this.f2599c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.e;
            x(view2, rectF2);
            rectF2.offset(fW, fW2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i = 0;
            f10 = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fU);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fV);
        }
        fVar.a(objectAnimatorOfFloat2);
        fVar2.a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat3);
        rectF.width();
        rectF.height();
        float fU2 = u(view, view2, (c) o0VarY.f5062c);
        float fV2 = v(view, view2, (c) o0VarY.f5062c);
        Pair pairT2 = t(fU2, fV2, z4, o0VarY);
        f fVar3 = (f) pairT2.first;
        f fVar4 = (f) pairT2.second;
        Property property = View.TRANSLATION_X;
        if (!z4) {
            fU2 = this.f2602g;
        }
        float[] fArr = new float[1];
        fArr[i] = fU2;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z4) {
            fV2 = this.h;
        }
        float[] fArr2 = new float[1];
        fArr2[i] = fV2;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        fVar3.a(objectAnimatorOfFloat5);
        fVar4.a(objectAnimatorOfFloat6);
        arrayList.add(objectAnimatorOfFloat5);
        arrayList.add(objectAnimatorOfFloat6);
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = viewFindViewById != null ? viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z4) {
                    if (!z10) {
                        e8.c.f3495a.set(viewGroup, Float.valueOf(f10));
                    }
                    e8.c cVar = e8.c.f3495a;
                    float[] fArr3 = new float[1];
                    fArr3[i] = 1.0f;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar, fArr3);
                } else {
                    e8.c cVar2 = e8.c.f3495a;
                    float[] fArr4 = new float[1];
                    fArr4[i] = f10;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar2, fArr4);
                }
                ((e) o0VarY.f5061b).d("contentFade").a(objectAnimatorOfFloat4);
                arrayList.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        l.u(animatorSet, arrayList);
        animatorSet.addListener(new b(z4, view2, view));
        int size = arrayList2.size();
        for (int i10 = i; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    public final float u(View view, View view2, c cVar) {
        RectF rectF = this.f2600d;
        x(view, rectF);
        rectF.offset(this.f2602g, this.h);
        RectF rectF2 = this.e;
        x(view2, rectF2);
        cVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float v(View view, View view2, c cVar) {
        RectF rectF = this.f2600d;
        x(view, rectF);
        rectF.offset(this.f2602g, this.h);
        RectF rectF2 = this.e;
        x(view2, rectF2);
        cVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void x(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f2601f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract o0 y(Context context, boolean z4);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2599c = new Rect();
        this.f2600d = new RectF();
        this.e = new RectF();
        this.f2601f = new int[2];
    }
}
