package r0;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8117a;

    public k(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f8117a = collectionItemInfo;
    }

    public static k a(int i, int i10, int i11, int i12, boolean z4) {
        return new k(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i10, i11, i12, false, z4));
    }
}
