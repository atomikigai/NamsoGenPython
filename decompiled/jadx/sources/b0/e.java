package b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f1319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1322d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1324g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f1326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f1327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f1331p;

    public e() {
        super(-2, -2);
        this.f1320b = false;
        this.f1321c = 0;
        this.f1322d = 0;
        this.e = -1;
        this.f1323f = -1;
        this.f1324g = 0;
        this.h = 0;
        this.f1331p = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f1328m;
        }
        if (i != 1) {
            return false;
        }
        return this.f1329n;
    }

    public final void b(b bVar) {
        b bVar2 = this.f1319a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.e();
            }
            this.f1319a = bVar;
            this.f1320b = true;
            if (bVar != null) {
                bVar.c(this);
            }
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        b bVar;
        super(context, attributeSet);
        this.f1320b = false;
        this.f1321c = 0;
        this.f1322d = 0;
        this.e = -1;
        this.f1323f = -1;
        this.f1324g = 0;
        this.h = 0;
        this.f1331p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f1b);
        this.f1321c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f1323f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f1322d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f1324g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f1320b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.E;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.E;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.G;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.F);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(u3.b.b("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f1319a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f1319a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f1320b = false;
        this.f1321c = 0;
        this.f1322d = 0;
        this.e = -1;
        this.f1323f = -1;
        this.f1324g = 0;
        this.h = 0;
        this.f1331p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1320b = false;
        this.f1321c = 0;
        this.f1322d = 0;
        this.e = -1;
        this.f1323f = -1;
        this.f1324g = 0;
        this.h = 0;
        this.f1331p = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1320b = false;
        this.f1321c = 0;
        this.f1322d = 0;
        this.e = -1;
        this.f1323f = -1;
        this.f1324g = 0;
        this.h = 0;
        this.f1331p = new Rect();
    }
}
