package q0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends v1 {
    public static Field e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f7934f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f7935g = null;
    public static boolean h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f7936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h0.c f7937d;

    public r1() {
        this.f7936c = i();
    }

    private static WindowInsets i() {
        if (!f7934f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            f7934f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!h) {
            try {
                f7935g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = f7935g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // q0.v1
    public d2 b() {
        a();
        d2 d2VarG = d2.g(null, this.f7936c);
        h0.c[] cVarArr = this.f7952b;
        b2 b2Var = d2VarG.f7892a;
        b2Var.o(cVarArr);
        b2Var.q(this.f7937d);
        return d2VarG;
    }

    @Override // q0.v1
    public void e(h0.c cVar) {
        this.f7937d = cVar;
    }

    @Override // q0.v1
    public void g(h0.c cVar) {
        WindowInsets windowInsets = this.f7936c;
        if (windowInsets != null) {
            this.f7936c = windowInsets.replaceSystemWindowInsets(cVar.f4545a, cVar.f4546b, cVar.f4547c, cVar.f4548d);
        }
    }

    public r1(d2 d2Var) {
        super(d2Var);
        this.f7936c = d2Var.f();
    }
}
