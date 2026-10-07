package mc;

import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        char c10 = this.f7099a;
        char c11 = this.f7100b;
        if (i.f(c10, c11) > 0) {
            c cVar = (c) obj;
            if (i.f(cVar.f7099a, cVar.f7100b) > 0) {
                return true;
            }
        }
        c cVar2 = (c) obj;
        return c10 == cVar2.f7099a && c11 == cVar2.f7100b;
    }

    public final int hashCode() {
        char c10 = this.f7099a;
        char c11 = this.f7100b;
        if (i.f(c10, c11) > 0) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f7099a + ".." + this.f7100b;
    }
}
