package m2;

import android.view.ViewGroup;
import android.view.WindowId;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f6980a;

    public a0(ViewGroup viewGroup) {
        this.f6980a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a0) && ((a0) obj).f6980a.equals(this.f6980a);
    }

    public final int hashCode() {
        return this.f6980a.hashCode();
    }
}
