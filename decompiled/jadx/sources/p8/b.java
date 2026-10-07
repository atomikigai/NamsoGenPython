package p8;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import app.namso_gen.spacehowen.R;
import b9.g;
import e0.k;
import ea.j;
import g.f;
import j.d;
import java.util.WeakHashMap;
import q0.j0;
import q0.v0;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f7830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f7831d;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context) {
        TypedValue typedValueL = a.a.l(context, R.attr.materialAlertDialogTheme);
        int i = typedValueL == null ? 0 : typedValueL.data;
        Context contextA = i9.a.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        contextA = i != 0 ? new d(contextA, i) : contextA;
        TypedValue typedValueL2 = a.a.l(context, R.attr.materialAlertDialogTheme);
        super(contextA, typedValueL2 == null ? 0 : typedValueL2.data);
        ContextThemeWrapper contextThemeWrapper = ((g.b) this.f3530b).f3968a;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        n.a(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = d8.a.f3024p;
        n.b(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (contextThemeWrapper.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.f7831d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        TypedValue typedValueN = a.a.n(contextThemeWrapper, b.class.getCanonicalName(), R.attr.colorSurface);
        int i10 = typedValueN.resourceId;
        int color = i10 != 0 ? k.getColor(contextThemeWrapper, i10) : typedValueN.data;
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color2 = typedArrayObtainStyledAttributes2.getColor(4, color);
        typedArrayObtainStyledAttributes2.recycle();
        g gVar = new g(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        gVar.i(contextThemeWrapper);
        gVar.k(ColorStateList.valueOf(color2));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((g.b) this.f3530b).f3968a.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                b9.j jVarE = gVar.f1454a.f1440a.e();
                jVarE.e = new b9.a(dimension);
                jVarE.f1473f = new b9.a(dimension);
                jVarE.f1474g = new b9.a(dimension);
                jVarE.h = new b9.a(dimension);
                gVar.setShapeAppearanceModel(jVarE.a());
            }
        }
        this.f7830c = gVar;
    }

    @Override // ea.j
    public final f a() {
        f fVarA = super.a();
        Window window = fVarA.getWindow();
        View decorView = window.getDecorView();
        g gVar = this.f7830c;
        if (gVar != null) {
            WeakHashMap weakHashMap = v0.f7946a;
            gVar.j(j0.i(decorView));
        }
        Rect rect = this.f7831d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) gVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(fVarA, rect));
        return fVarA;
    }

    @Override // ea.j
    public final j f(int i) {
        throw null;
    }

    @Override // ea.j
    public final j g(int i, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // ea.j
    public final j h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // ea.j
    public final j i(int i, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // ea.j
    public final j j(int i, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // ea.j
    public final j k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // ea.j
    public final j l(int i) {
        throw null;
    }

    public final void n() {
        super.j(android.R.string.ok, null);
    }

    public final void o() {
        super.l(R.string.fui_title_confirm_recover_password);
    }
}
