package k8;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import app.namso_gen.spacehowen.R;
import b9.f;
import b9.g;
import b9.k;
import b9.v;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import q0.e0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f6069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f6070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6072d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6074g;
    public int h;
    public PorterDuff.Mode i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f6075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f6076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f6077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f6078m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6082q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RippleDrawable f6084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6085t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6079n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6080o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6081p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6083r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f6069a = materialButton;
        this.f6070b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f6084s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f6084s.getNumberOfLayers() > 2 ? (v) this.f6084s.getDrawable(2) : (v) this.f6084s.getDrawable(1);
    }

    public final g b(boolean z4) {
        RippleDrawable rippleDrawable = this.f6084s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f6084s.getDrawable(0)).getDrawable()).getDrawable(!z4 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f6070b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i, int i10) {
        WeakHashMap weakHashMap = v0.f7946a;
        MaterialButton materialButton = this.f6069a;
        int iF = e0.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iE = e0.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.e;
        int i12 = this.f6073f;
        this.f6073f = i10;
        this.e = i;
        if (!this.f6080o) {
            e();
        }
        e0.k(materialButton, iF, (paddingTop + i) - i11, iE, (paddingBottom + i10) - i12);
    }

    public final void e() {
        g gVar = new g(this.f6070b);
        MaterialButton materialButton = this.f6069a;
        gVar.i(materialButton.getContext());
        i0.b.h(gVar, this.f6075j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            i0.b.i(gVar, mode);
        }
        float f10 = this.h;
        ColorStateList colorStateList = this.f6076k;
        gVar.f1454a.f1446j = f10;
        gVar.invalidateSelf();
        f fVar = gVar.f1454a;
        if (fVar.f1443d != colorStateList) {
            fVar.f1443d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f6070b);
        gVar2.setTint(0);
        float f11 = this.h;
        int iQ = this.f6079n ? com.bumptech.glide.c.q(materialButton, R.attr.colorSurface) : 0;
        gVar2.f1454a.f1446j = f11;
        gVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iQ);
        f fVar2 = gVar2.f1454a;
        if (fVar2.f1443d != colorStateListValueOf) {
            fVar2.f1443d = colorStateListValueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f6070b);
        this.f6078m = gVar3;
        i0.b.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(z8.a.b(this.f6077l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f6071c, this.e, this.f6072d, this.f6073f), this.f6078m);
        this.f6084s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g gVarB = b(false);
        if (gVarB != null) {
            gVarB.j(this.f6085t);
            gVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g gVarB = b(false);
        g gVarB2 = b(true);
        if (gVarB != null) {
            float f10 = this.h;
            ColorStateList colorStateList = this.f6076k;
            gVarB.f1454a.f1446j = f10;
            gVarB.invalidateSelf();
            f fVar = gVarB.f1454a;
            if (fVar.f1443d != colorStateList) {
                fVar.f1443d = colorStateList;
                gVarB.onStateChange(gVarB.getState());
            }
            if (gVarB2 != null) {
                float f11 = this.h;
                int iQ = this.f6079n ? com.bumptech.glide.c.q(this.f6069a, R.attr.colorSurface) : 0;
                gVarB2.f1454a.f1446j = f11;
                gVarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iQ);
                f fVar2 = gVarB2.f1454a;
                if (fVar2.f1443d != colorStateListValueOf) {
                    fVar2.f1443d = colorStateListValueOf;
                    gVarB2.onStateChange(gVarB2.getState());
                }
            }
        }
    }
}
