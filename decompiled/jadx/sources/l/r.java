package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f6403b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static r f6404c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k2 f6405a;

    public static synchronized r a() {
        try {
            if (f6404c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6404c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return k2.e(i, mode);
    }

    public static synchronized void d() {
        if (f6404c == null) {
            r rVar = new r();
            f6404c = rVar;
            rVar.f6405a = k2.b();
            k2 k2Var = f6404c.f6405a;
            bd.v vVar = new bd.v();
            synchronized (k2Var) {
                k2Var.e = vVar;
            }
        }
    }

    public static void e(Drawable drawable, bd.h hVar, int[] iArr) {
        PorterDuff.Mode mode = k2.f6325f;
        int[] state = drawable.getState();
        int[] iArr2 = l1.f6340a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = hVar.f1595b;
        if (!z4 && !hVar.f1594a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z4 ? (ColorStateList) hVar.f1596c : null;
        PorterDuff.Mode mode2 = hVar.f1594a ? (PorterDuff.Mode) hVar.f1597d : k2.f6325f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = k2.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f6405a.c(context, i);
    }
}
