package ua;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9048a;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f9048a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f9048a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) {
        int i11;
        if (i >= 0 && i <= bArr.length && i10 >= 0 && (i11 = i + i10) <= bArr.length && i11 >= 0) {
            this.f9048a += (long) i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
