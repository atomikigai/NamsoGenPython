package t8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import app.namso_gen.spacehowen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends j {
    public StateListAnimator K;

    @Override // t8.j
    public final float e() {
        return this.f8653s.getElevation();
    }

    @Override // t8.j
    public final void f(Rect rect) {
        if (((FloatingActionButton) this.f8654t.f188b).f2482v) {
            super.f(rect);
            return;
        }
        if (this.f8642f) {
            FloatingActionButton floatingActionButton = this.f8653s;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i = this.f8645k;
            if (sizeDimension < i) {
                int sizeDimension2 = (i - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // t8.j
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        b9.k kVar = this.f8638a;
        kVar.getClass();
        k kVar2 = new k(kVar);
        this.f8639b = kVar2;
        kVar2.setTintList(colorStateList);
        if (mode != null) {
            this.f8639b.setTintMode(mode);
        }
        b9.g gVar = this.f8639b;
        FloatingActionButton floatingActionButton = this.f8653s;
        gVar.i(floatingActionButton.getContext());
        if (i > 0) {
            Context context = floatingActionButton.getContext();
            b9.k kVar3 = this.f8638a;
            kVar3.getClass();
            a aVar = new a(kVar3);
            int color = e0.k.getColor(context, R.color.design_fab_stroke_top_outer_color);
            int color2 = e0.k.getColor(context, R.color.design_fab_stroke_top_inner_color);
            int color3 = e0.k.getColor(context, R.color.design_fab_stroke_end_inner_color);
            int color4 = e0.k.getColor(context, R.color.design_fab_stroke_end_outer_color);
            aVar.i = color;
            aVar.f8611j = color2;
            aVar.f8612k = color3;
            aVar.f8613l = color4;
            float f10 = i;
            if (aVar.h != f10) {
                aVar.h = f10;
                aVar.f8606b.setStrokeWidth(f10 * 1.3333f);
                aVar.f8615n = true;
                aVar.invalidateSelf();
            }
            if (colorStateList != null) {
                aVar.f8614m = colorStateList.getColorForState(aVar.getState(), aVar.f8614m);
            }
            aVar.f8617p = colorStateList;
            aVar.f8615n = true;
            aVar.invalidateSelf();
            this.f8641d = aVar;
            a aVar2 = this.f8641d;
            aVar2.getClass();
            b9.g gVar2 = this.f8639b;
            gVar2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{aVar2, gVar2});
        } else {
            this.f8641d = null;
            layerDrawable = this.f8639b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(z8.a.b(colorStateList2), layerDrawable, null);
        this.f8640c = rippleDrawable;
        this.e = rippleDrawable;
    }

    @Override // t8.j
    public final void i() {
        q();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // t8.j
    public final void k(float f10, float f11, float f12) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f8653s;
        if (floatingActionButton.getStateListAnimator() == this.K) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(j.E, r(f10, f12));
            stateListAnimator.addState(j.F, r(f10, f11));
            stateListAnimator.addState(j.G, r(f10, f11));
            stateListAnimator.addState(j.H, r(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L));
            if (i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(j.f8637z);
            stateListAnimator.addState(j.I, animatorSet);
            stateListAnimator.addState(j.J, r(0.0f, 0.0f));
            this.K = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // t8.j
    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.f8640c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(z8.a.b(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // t8.j
    public final boolean o() {
        if (((FloatingActionButton) this.f8654t.f188b).f2482v) {
            return true;
        }
        return this.f8642f && this.f8653s.getSizeDimension() < this.f8645k;
    }

    public final AnimatorSet r(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f8653s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(j.f8637z);
        return animatorSet;
    }

    @Override // t8.j
    public final void h() {
    }

    @Override // t8.j
    public final void p() {
    }

    @Override // t8.j
    public final void j(int[] iArr) {
    }
}
