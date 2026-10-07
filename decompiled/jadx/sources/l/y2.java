package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f6490a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f6491b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f6492c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f6493d = {R.attr.state_pressed};
    public static final int[] e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f6494f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f6495g = new int[1];

    public static void a(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f.a.f3558j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList colorStateListD = d(context, i);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f6491b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = f6490a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        int iC = c(context, i);
        return h0.a.d(iC, Math.round(Color.alpha(iC) * f10));
    }

    public static int c(Context context, int i) {
        int[] iArr = f6495g;
        iArr[0] = i;
        a2.l lVarF = a2.l.F(context, null, iArr);
        try {
            return ((TypedArray) lVarF.f44c).getColor(0, 0);
        } finally {
            lVarF.I();
        }
    }

    public static ColorStateList d(Context context, int i) {
        int[] iArr = f6495g;
        iArr[0] = i;
        a2.l lVarF = a2.l.F(context, null, iArr);
        try {
            return lVarF.t(0);
        } finally {
            lVarF.I();
        }
    }
}
