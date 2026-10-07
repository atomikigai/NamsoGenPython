package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import app.namso_gen.spacehowen.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static k2 f6326g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f6327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f6328b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f6329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6330d;
    public bd.v e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f6325f = PorterDuff.Mode.SRC_IN;
    public static final j2 h = new j2(6);

    public static synchronized k2 b() {
        try {
            if (f6326g == null) {
                f6326g = new k2();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6326g;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        j2 j2Var = h;
        j2Var.getClass();
        int i10 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) j2Var.get(Integer.valueOf(mode.hashCode() + i10));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f6329c == null) {
            this.f6329c = new TypedValue();
        }
        TypedValue typedValue = this.f6329c;
        context.getResources().getValue(i, typedValue, true);
        long j4 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            r.h hVar = (r.h) this.f6328b.get(context);
            drawableNewDrawable = null;
            if (hVar != null && (weakReference = (WeakReference) hVar.b(j4)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    hVar.f(j4);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableI = null;
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableI = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131230778)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableI = bd.v.i(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableI = bd.v.i(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableI = bd.v.i(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableI == null) {
            return layerDrawableI;
        }
        layerDrawableI.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableI.getConstantState();
                if (constantState2 != null) {
                    r.h hVar2 = (r.h) this.f6328b.get(context);
                    if (hVar2 == null) {
                        hVar2 = new r.h();
                        this.f6328b.put(context, hVar2);
                    }
                    hVar2.e(j4, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableI;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized Drawable d(Context context, int i, boolean z4) {
        Drawable drawableA;
        try {
            if (!this.f6330d) {
                this.f6330d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof n2.o) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f6330d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = e0.k.getDrawable(context, i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, z4, drawableA);
            }
            if (drawableA != null) {
                l1.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        r.l lVar;
        WeakHashMap weakHashMap = this.f6327a;
        ColorStateList colorStateListK = null;
        colorStateList = (weakHashMap == null || (lVar = (r.l) weakHashMap.get(context)) == null) ? null : (ColorStateList) lVar.b(i);
        if (colorStateList == null) {
            bd.v vVar = this.e;
            if (vVar != null) {
                colorStateListK = vVar.k(context, i);
            }
            if (colorStateListK != null) {
                if (this.f6327a == null) {
                    this.f6327a = new WeakHashMap();
                }
                r.l lVar2 = (r.l) this.f6327a.get(context);
                if (lVar2 == null) {
                    lVar2 = new r.l();
                    this.f6327a.put(context, lVar2);
                }
                lVar2.a(i, colorStateListK);
            }
            colorStateList = colorStateListK;
        }
        return colorStateList;
    }

    public final Drawable g(Context context, int i, boolean z4, Drawable drawable) {
        boolean z10;
        int iRound;
        ColorStateList colorStateListF = f(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            int[] iArr = l1.f6340a;
            Drawable drawableMutate = drawable.mutate();
            i0.b.h(drawableMutate, colorStateListF);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                i0.b.i(drawableMutate, mode);
            }
            return drawableMutate;
        }
        bd.v vVar = this.e;
        int i10 = R.attr.colorControlNormal;
        if (vVar != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = y2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = r.f6403b;
                bd.v.p(drawableFindDrawableByLayerId, iC, mode2);
                bd.v.p(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), y2.c(context, R.attr.colorControlNormal), mode2);
                bd.v.p(layerDrawable.findDrawableByLayerId(android.R.id.progress), y2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = y2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = r.f6403b;
                bd.v.p(drawableFindDrawableByLayerId2, iB, mode3);
                bd.v.p(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), y2.c(context, R.attr.colorControlActivated), mode3);
                bd.v.p(layerDrawable2.findDrawableByLayerId(android.R.id.progress), y2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        bd.v vVar2 = this.e;
        boolean z11 = false;
        if (vVar2 != null) {
            PorterDuff.Mode mode4 = r.f6403b;
            if (bd.v.c((int[]) vVar2.f1682c, i)) {
                z10 = true;
                iRound = -1;
            } else {
                if (bd.v.c((int[]) vVar2.f1683d, i)) {
                    i10 = R.attr.colorControlActivated;
                } else {
                    boolean zC = bd.v.c((int[]) vVar2.e, i);
                    i10 = android.R.attr.colorBackground;
                    if (zC) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131230798) {
                        iRound = Math.round(40.8f);
                        i10 = android.R.attr.colorForeground;
                        z10 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            z10 = false;
                            i10 = 0;
                        }
                        iRound = -1;
                    }
                }
                z10 = true;
                iRound = -1;
            }
            if (z10) {
                int[] iArr2 = l1.f6340a;
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(r.c(y2.c(context, i10), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z11 = true;
            }
        }
        if (z11 || !z4) {
            return drawable;
        }
        return null;
    }
}
