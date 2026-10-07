package l;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f6370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f6371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f6372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f6373d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f6370a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f6371b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f6372c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f6373d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
