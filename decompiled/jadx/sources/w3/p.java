package w3;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements u3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9561d;
    public final Class e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f9562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u3.f f9563g;
    public final Map h;
    public final u3.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9564j;

    public p(Object obj, u3.f fVar, int i, int i10, Map map, Class cls, Class cls2, u3.i iVar) {
        p4.f.c(obj, "Argument must not be null");
        this.f9559b = obj;
        this.f9563g = fVar;
        this.f9560c = i;
        this.f9561d = i10;
        p4.f.c(map, "Argument must not be null");
        this.h = map;
        p4.f.c(cls, "Resource class must not be null");
        this.e = cls;
        p4.f.c(cls2, "Transcode class must not be null");
        this.f9562f = cls2;
        p4.f.c(iVar, "Argument must not be null");
        this.i = iVar;
    }

    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f9559b.equals(pVar.f9559b) && this.f9563g.equals(pVar.f9563g) && this.f9561d == pVar.f9561d && this.f9560c == pVar.f9560c && this.h.equals(pVar.h) && this.e.equals(pVar.e) && this.f9562f.equals(pVar.f9562f) && this.i.equals(pVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // u3.f
    public final int hashCode() {
        if (this.f9564j == 0) {
            int iHashCode = this.f9559b.hashCode();
            this.f9564j = iHashCode;
            int iHashCode2 = ((((this.f9563g.hashCode() + (iHashCode * 31)) * 31) + this.f9560c) * 31) + this.f9561d;
            this.f9564j = iHashCode2;
            int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
            this.f9564j = iHashCode3;
            int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
            this.f9564j = iHashCode4;
            int iHashCode5 = this.f9562f.hashCode() + (iHashCode4 * 31);
            this.f9564j = iHashCode5;
            this.f9564j = this.i.f8852b.hashCode() + (iHashCode5 * 31);
        }
        return this.f9564j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f9559b + ", width=" + this.f9560c + ", height=" + this.f9561d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f9562f + ", signature=" + this.f9563g + ", hashCode=" + this.f9564j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
