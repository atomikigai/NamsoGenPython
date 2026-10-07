package mc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f7109d = new e(1, 0, 1);

    public final boolean d(int i) {
        return this.f7106a <= i && i <= this.f7107b;
    }

    @Override // mc.d
    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f7106a == eVar.f7106a && this.f7107b == eVar.f7107b;
    }

    @Override // mc.d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f7106a * 31) + this.f7107b;
    }

    @Override // mc.d
    public final boolean isEmpty() {
        return this.f7106a > this.f7107b;
    }

    @Override // mc.d
    public final String toString() {
        return this.f7106a + ".." + this.f7107b;
    }
}
