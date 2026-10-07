package q0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w1 extends b2 {
    public static boolean h = false;
    public static Method i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Class f7956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f7957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f7958l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f7959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h0.c[] f7960d;
    public h0.c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d2 f7961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h0.c f7962g;

    public w1(d2 d2Var, WindowInsets windowInsets) {
        super(d2Var);
        this.e = null;
        this.f7959c = windowInsets;
    }

    private h0.c r(int i10, boolean z4) {
        h0.c cVarA = h0.c.e;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVarA = h0.c.a(cVarA, s(i11, z4));
            }
        }
        return cVarA;
    }

    private h0.c t() {
        d2 d2Var = this.f7961f;
        return d2Var != null ? d2Var.f7892a.h() : h0.c.e;
    }

    private h0.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && f7956j != null && f7957k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f7957k.get(f7958l.get(objInvoke));
                if (rect != null) {
                    return h0.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f7956j = cls;
            f7957k = cls.getDeclaredField("mVisibleInsets");
            f7958l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f7957k.setAccessible(true);
            f7958l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        h = true;
    }

    @Override // q0.b2
    public void d(View view) {
        h0.c cVarU = u(view);
        if (cVarU == null) {
            cVarU = h0.c.e;
        }
        w(cVarU);
    }

    @Override // q0.b2
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f7962g, ((w1) obj).f7962g);
        }
        return false;
    }

    @Override // q0.b2
    public h0.c f(int i10) {
        return r(i10, false);
    }

    @Override // q0.b2
    public final h0.c j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.f7959c;
            this.e = h0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // q0.b2
    public d2 l(int i10, int i11, int i12, int i13) {
        v1 t1Var;
        d2 d2VarG = d2.g(null, this.f7959c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            t1Var = new u1(d2VarG);
        } else {
            t1Var = i14 >= 29 ? new t1(d2VarG) : new r1(d2VarG);
        }
        t1Var.g(d2.e(j(), i10, i11, i12, i13));
        t1Var.e(d2.e(h(), i10, i11, i12, i13));
        return t1Var.b();
    }

    @Override // q0.b2
    public boolean n() {
        return this.f7959c.isRound();
    }

    @Override // q0.b2
    public void o(h0.c[] cVarArr) {
        this.f7960d = cVarArr;
    }

    @Override // q0.b2
    public void p(d2 d2Var) {
        this.f7961f = d2Var;
    }

    public h0.c s(int i10, boolean z4) {
        h0.c cVarH;
        int i11;
        if (i10 == 1) {
            return z4 ? h0.c.b(0, Math.max(t().f4546b, j().f4546b), 0, 0) : h0.c.b(0, j().f4546b, 0, 0);
        }
        if (i10 == 2) {
            if (z4) {
                h0.c cVarT = t();
                h0.c cVarH2 = h();
                return h0.c.b(Math.max(cVarT.f4545a, cVarH2.f4545a), 0, Math.max(cVarT.f4547c, cVarH2.f4547c), Math.max(cVarT.f4548d, cVarH2.f4548d));
            }
            h0.c cVarJ = j();
            d2 d2Var = this.f7961f;
            cVarH = d2Var != null ? d2Var.f7892a.h() : null;
            int iMin = cVarJ.f4548d;
            if (cVarH != null) {
                iMin = Math.min(iMin, cVarH.f4548d);
            }
            return h0.c.b(cVarJ.f4545a, 0, cVarJ.f4547c, iMin);
        }
        h0.c cVar = h0.c.e;
        if (i10 == 8) {
            h0.c[] cVarArr = this.f7960d;
            cVarH = cVarArr != null ? cVarArr[jd.l.m(8)] : null;
            if (cVarH != null) {
                return cVarH;
            }
            h0.c cVarJ2 = j();
            h0.c cVarT2 = t();
            int i12 = cVarJ2.f4548d;
            if (i12 > cVarT2.f4548d) {
                return h0.c.b(0, 0, 0, i12);
            }
            h0.c cVar2 = this.f7962g;
            return (cVar2 == null || cVar2.equals(cVar) || (i11 = this.f7962g.f4548d) <= cVarT2.f4548d) ? cVar : h0.c.b(0, 0, 0, i11);
        }
        if (i10 == 16) {
            return i();
        }
        if (i10 == 32) {
            return g();
        }
        if (i10 == 64) {
            return k();
        }
        if (i10 != 128) {
            return cVar;
        }
        d2 d2Var2 = this.f7961f;
        k kVarE = d2Var2 != null ? d2Var2.f7892a.e() : e();
        if (kVarE == null) {
            return cVar;
        }
        int i13 = Build.VERSION.SDK_INT;
        return h0.c.b(i13 >= 28 ? j.d(kVarE.f7914a) : 0, i13 >= 28 ? j.f(kVarE.f7914a) : 0, i13 >= 28 ? j.e(kVarE.f7914a) : 0, i13 >= 28 ? j.c(kVarE.f7914a) : 0);
    }

    public void w(h0.c cVar) {
        this.f7962g = cVar;
    }
}
