package r0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static k a(int i, int i10, int i11, int i12, boolean z4) {
        return new k(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i10, i11, i12, z4));
    }

    public static Object b(int i, float f10, float f11, float f12) {
        return AccessibilityNodeInfo.RangeInfo.obtain(i, f10, f11, f12);
    }

    public static Bundle c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtras();
    }
}
