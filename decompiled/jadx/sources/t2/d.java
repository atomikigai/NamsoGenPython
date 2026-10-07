package t2;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f8538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8539b;

    public d(Uri uri, boolean z4) {
        this.f8538a = uri;
        this.f8539b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f8539b == dVar.f8539b && this.f8538a.equals(dVar.f8538a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8538a.hashCode() * 31) + (this.f8539b ? 1 : 0);
    }
}
