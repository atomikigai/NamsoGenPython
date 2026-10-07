package x9;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f10332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10333b;

    public h(q qVar, boolean z4) {
        this.f10332a = qVar;
        this.f10333b = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f10332a.equals(this.f10332a) && hVar.f10333b == this.f10333b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10332a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f10333b).hashCode();
    }
}
