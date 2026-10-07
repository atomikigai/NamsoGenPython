package q;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f7876a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z4) {
        if (!z4) {
            return f10;
        }
        return (float) (((1.0d - f7876a) * ((double) f11)) + ((double) f10));
    }

    public static float b(float f10, float f11, boolean z4) {
        if (!z4) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - f7876a) * ((double) f11)) + ((double) (f10 * 1.5f)));
    }
}
