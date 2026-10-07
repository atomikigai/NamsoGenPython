package m2;

import android.view.View;
import fa.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f7028c = true;

    public float H(View view) {
        if (f7028c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f7028c = false;
            }
        }
        return view.getAlpha();
    }

    public void I(View view, float f10) {
        if (f7028c) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f7028c = false;
            }
        }
        view.setAlpha(f10);
    }
}
