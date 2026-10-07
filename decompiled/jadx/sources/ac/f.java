package ac;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f284c;

    public /* synthetic */ f(Method method, Method method2, Method method3) {
        this.f282a = method;
        this.f283b = method2;
        this.f284c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
