package g0;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f4147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f4148b;

    public l(Resources resources, Resources.Theme theme) {
        this.f4147a = resources;
        this.f4148b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f4147a.equals(lVar.f4147a) && p0.b.a(this.f4148b, lVar.f4148b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return p0.b.b(this.f4147a, this.f4148b);
    }
}
