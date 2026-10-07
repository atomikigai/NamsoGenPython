package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f4115b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f4116c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f4117d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f4118f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f4119g = {"android.widget.", "android.view.", "android.webkit."};
    public static final r.k h = new r.k(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f4120a = new Object[2];

    public l.n a(Context context, AttributeSet attributeSet) {
        return new l.n(context, attributeSet);
    }

    public l.o b(Context context, AttributeSet attributeSet) {
        return new l.o(context, attributeSet, app.namso_gen.spacehowen.R.attr.buttonStyle);
    }

    public l.p c(Context context, AttributeSet attributeSet) {
        return new l.p(context, attributeSet, app.namso_gen.spacehowen.R.attr.checkboxStyle);
    }

    public l.a0 d(Context context, AttributeSet attributeSet) {
        return new l.a0(context, attributeSet);
    }

    public z0 e(Context context, AttributeSet attributeSet) {
        return new z0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        r.k kVar = h;
        Constructor constructor = (Constructor) kVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f4115b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f4120a);
    }
}
