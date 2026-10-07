package fa;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f3696b;

    public c0(String str, byte[] bArr) {
        this.f3695a = str;
        this.f3696b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a1) {
            a1 a1Var = (a1) obj;
            c0 c0Var = (c0) a1Var;
            if (this.f3695a.equals(c0Var.f3695a)) {
                if (Arrays.equals(this.f3696b, a1Var instanceof c0 ? ((c0) a1Var).f3696b : c0Var.f3696b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3695a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3696b);
    }

    public final String toString() {
        return "File{filename=" + this.f3695a + ", contents=" + Arrays.toString(this.f3696b) + "}";
    }
}
