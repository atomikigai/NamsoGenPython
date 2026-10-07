package l5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i5.b f6830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6831b;

    public l(i5.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f6830a = bVar;
        this.f6831b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f6830a.equals(lVar.f6830a)) {
            return Arrays.equals(this.f6831b, lVar.f6831b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6830a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6831b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f6830a + ", bytes=[...]}";
    }
}
