package q0;

import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f7914a;

    public k(DisplayCutout displayCutout) {
        this.f7914a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return p0.b.a(this.f7914a, ((k) obj).f7914a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f7914a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f7914a + "}";
    }
}
