package t8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import app.namso_gen.spacehowen.R;
import b9.v;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b9.k f8638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b9.g f8639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f8640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f8641d;
    public LayerDrawable e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8642f;
    public float h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f8644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animator f8646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e8.e f8647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e8.e f8648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f8649o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8651q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FloatingActionButton f8653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a5.b f8654t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b0.f f8659y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final j1.a f8637z = e8.a.f3493c;
    public static final int A = R.attr.motionDurationLong2;
    public static final int B = R.attr.motionEasingEmphasizedInterpolator;
    public static final int C = R.attr.motionDurationMedium1;
    public static final int D = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] E = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] F = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] G = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] I = {android.R.attr.state_enabled};
    public static final int[] J = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8643g = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f8650p = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8652r = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f8655u = new Rect();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f8656v = new RectF();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f8657w = new RectF();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Matrix f8658x = new Matrix();

    public j(FloatingActionButton floatingActionButton, a5.b bVar) {
        this.f8653s = floatingActionButton;
        this.f8654t = bVar;
        q5.d dVar = new q5.d(6);
        l lVar = (l) this;
        dVar.e(E, d(new h(lVar, 1)));
        dVar.e(F, d(new h(lVar, 0)));
        dVar.e(G, d(new h(lVar, 0)));
        dVar.e(H, d(new h(lVar, 0)));
        dVar.e(I, d(new h(lVar, 2)));
        dVar.e(J, d(new g(lVar)));
        this.f8649o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f8637z);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f8653s.getDrawable();
        if (drawable == null || this.f8651q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f8656v;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f11 = this.f8651q;
        RectF rectF2 = this.f8657w;
        rectF2.set(0.0f, 0.0f, f11, f11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f12 = this.f8651q / 2.0f;
        matrix.postScale(f10, f10, f12, f12);
    }

    public final AnimatorSet b(e8.e eVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f8653s;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        eVar.d("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        eVar.d("scale").a(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            f fVar = new f();
            fVar.f8631a = new FloatEvaluator();
            objectAnimatorOfFloat2.setEvaluator(fVar);
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        eVar.d("scale").a(objectAnimatorOfFloat3);
        if (i == 26) {
            f fVar2 = new f();
            fVar2.f8631a = new FloatEvaluator();
            objectAnimatorOfFloat3.setEvaluator(fVar2);
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f8658x;
        a(f12, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new e8.d(), new d(this), new Matrix(matrix));
        eVar.d("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        jd.l.u(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12, int i, int i10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f8653s;
        valueAnimatorOfFloat.addUpdateListener(new e(this, floatingActionButton.getAlpha(), f10, floatingActionButton.getScaleX(), f11, floatingActionButton.getScaleY(), this.f8650p, f12, new Matrix(this.f8658x)));
        arrayList.add(valueAnimatorOfFloat);
        jd.l.u(animatorSet, arrayList);
        animatorSet.setDuration(android.support.v4.media.session.a.v(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(android.support.v4.media.session.a.w(floatingActionButton.getContext(), i10, e8.a.f3492b));
        return animatorSet;
    }

    public abstract float e();

    public void f(Rect rect) {
        int iMax = this.f8642f ? Math.max((this.f8645k - this.f8653s.getSizeDimension()) / 2, 0) : 0;
        float fE = this.f8643g ? e() + this.f8644j : 0.0f;
        int iMax2 = Math.max(iMax, (int) Math.ceil(fE));
        int iMax3 = Math.max(iMax, (int) Math.ceil(fE * 1.5f));
        rect.set(iMax2, iMax3, iMax2, iMax3);
    }

    public abstract void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i);

    public abstract void h();

    public abstract void i();

    public abstract void j(int[] iArr);

    public abstract void k(float f10, float f11, float f12);

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.f8640c;
        if (drawable != null) {
            i0.b.h(drawable, z8.a.b(colorStateList));
        }
    }

    public final void n(b9.k kVar) {
        this.f8638a = kVar;
        b9.g gVar = this.f8639b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f8640c;
        if (obj instanceof v) {
            ((v) obj).setShapeAppearanceModel(kVar);
        }
        a aVar = this.f8641d;
        if (aVar != null) {
            aVar.f8616o = kVar;
            aVar.invalidateSelf();
        }
    }

    public abstract boolean o();

    public abstract void p();

    public final void q() {
        Rect rect = this.f8655u;
        f(rect);
        qd.b.j(this.e, "Didn't initialize content background");
        boolean zO = o();
        a5.b bVar = this.f8654t;
        if (zO) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.e;
            if (layerDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(layerDrawable);
            } else {
                bVar.getClass();
            }
        }
        int i = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        FloatingActionButton floatingActionButton = (FloatingActionButton) bVar.f188b;
        floatingActionButton.f2483w.set(i, i10, i11, i12);
        int i13 = floatingActionButton.f2480t;
        floatingActionButton.setPadding(i + i13, i10 + i13, i11 + i13, i12 + i13);
    }

    public final void l() {
    }
}
