package jb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5742a;

    public g(g gVar) {
        this.f5742a = gVar.f5742a;
    }

    public void a(long j4) {
        if (j4 >= 0) {
            this.f5742a = j4;
            return;
        }
        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j4 + " is an invalid argument");
    }

    public g() {
        this.f5742a = kb.h.i;
    }
}
