package g7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4261c;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f4261c = bArr;
    }

    @Override // g7.n
    public final byte[] I() {
        return this.f4261c;
    }
}
