package q0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f7930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f7931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f7932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f7933d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f7930a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f7931b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f7932c = declaredField3;
            declaredField3.setAccessible(true);
            f7933d = true;
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
        }
    }
}
