package androidx.activity;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f328a;

    @Override // androidx.lifecycle.p
    public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        if (lVar != androidx.lifecycle.l.ON_DESTROY) {
            return;
        }
        if (f328a == 0) {
            try {
                f328a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f328a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f328a == 1) {
            throw null;
        }
    }
}
