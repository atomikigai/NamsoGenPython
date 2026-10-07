package o4;

import java.security.MessageDigest;
import u3.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7557b;

    public d(Object obj) {
        p4.f.c(obj, "Argument must not be null");
        this.f7557b = obj;
    }

    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f7557b.toString().getBytes(f.f8847a));
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f7557b.equals(((d) obj).f7557b);
        }
        return false;
    }

    @Override // u3.f
    public final int hashCode() {
        return this.f7557b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f7557b + '}';
    }
}
