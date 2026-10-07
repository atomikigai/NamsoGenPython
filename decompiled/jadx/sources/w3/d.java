package w3;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements u3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3.f f9495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u3.f f9496c;

    public d(u3.f fVar, u3.f fVar2) {
        this.f9495b = fVar;
        this.f9496c = fVar2;
    }

    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        this.f9495b.a(messageDigest);
        this.f9496c.a(messageDigest);
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f9495b.equals(dVar.f9495b) && this.f9496c.equals(dVar.f9496c)) {
                return true;
            }
        }
        return false;
    }

    @Override // u3.f
    public final int hashCode() {
        return this.f9496c.hashCode() + (this.f9495b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f9495b + ", signature=" + this.f9496c + '}';
    }
}
