package n5;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7282a;

    public /* synthetic */ c(Object obj) {
        this.f7282a = obj;
    }

    public static c a(int i, int i10, int i11) {
        return new c(AccessibilityNodeInfo.CollectionInfo.obtain(i, i10, false, i11));
    }

    @Override // tb.a
    public Object get() {
        return this.f7282a;
    }
}
