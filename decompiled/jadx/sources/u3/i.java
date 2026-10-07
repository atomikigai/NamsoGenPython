package u3;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.c f8852b = new p4.c(0);

    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            p4.c cVar = this.f8852b;
            if (i >= cVar.f8100c) {
                return;
            }
            h hVar = (h) cVar.f(i);
            Object objJ = this.f8852b.j(i);
            g gVar = hVar.f8849b;
            if (hVar.f8851d == null) {
                hVar.f8851d = hVar.f8850c.getBytes(f.f8847a);
            }
            gVar.f(hVar.f8851d, objJ, messageDigest);
            i++;
        }
    }

    public final Object c(h hVar) {
        p4.c cVar = this.f8852b;
        return cVar.containsKey(hVar) ? cVar.get(hVar) : hVar.f8848a;
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f8852b.equals(((i) obj).f8852b);
        }
        return false;
    }

    @Override // u3.f
    public final int hashCode() {
        return this.f8852b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f8852b + '}';
    }
}
