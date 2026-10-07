package ea;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f3522c;

    public g(i iVar, f fVar) {
        this.f3522c = iVar;
        this.f3520a = iVar.U(fVar.f3518a + 4);
        this.f3521b = fVar.f3519b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i | i10) < 0 || i10 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f3521b;
        if (i11 <= 0) {
            return -1;
        }
        if (i10 > i11) {
            i10 = i11;
        }
        int i12 = this.f3520a;
        i iVar = this.f3522c;
        iVar.H(i12, bArr, i, i10);
        this.f3520a = iVar.U(this.f3520a + i10);
        this.f3521b -= i10;
        return i10;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f3521b == 0) {
            return -1;
        }
        i iVar = this.f3522c;
        iVar.f3524a.seek(this.f3520a);
        int i = iVar.f3524a.read();
        this.f3520a = iVar.U(this.f3520a + 1);
        this.f3521b--;
        return i;
    }
}
