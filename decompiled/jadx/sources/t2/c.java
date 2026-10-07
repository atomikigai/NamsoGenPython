package t2;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8535d;
    public boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8532a = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8536f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8537g = -1;
    public e h = new e();

    static {
        e eVar = new e();
        c cVar = new c();
        cVar.f8532a = 1;
        cVar.f8536f = -1L;
        cVar.f8537g = -1L;
        new HashSet();
        cVar.f8533b = false;
        cVar.f8534c = false;
        cVar.f8532a = 1;
        cVar.f8535d = false;
        cVar.e = false;
        cVar.h = eVar;
        cVar.f8536f = -1L;
        cVar.f8537g = -1L;
        i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8533b == cVar.f8533b && this.f8534c == cVar.f8534c && this.f8535d == cVar.f8535d && this.e == cVar.e && this.f8536f == cVar.f8536f && this.f8537g == cVar.f8537g && this.f8532a == cVar.f8532a) {
            return this.h.equals(cVar.h);
        }
        return false;
    }

    public final int hashCode() {
        int iD = ((((((((u.e.d(this.f8532a) * 31) + (this.f8533b ? 1 : 0)) * 31) + (this.f8534c ? 1 : 0)) * 31) + (this.f8535d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j4 = this.f8536f;
        int i10 = (iD + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j10 = this.f8537g;
        return this.h.f8540a.hashCode() + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }
}
