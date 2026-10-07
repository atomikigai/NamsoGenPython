package m2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f7026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f7027b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f7026a = new w();
        } else {
            f7026a = new v();
        }
        f7027b = new b(Float.class, "translationAlpha", 5);
        new b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i10, int i11, int i12) {
        f7026a.J(view, i, i10, i11, i12);
    }
}
