package r3;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8139a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8140b;

    public f(a aVar, int i) {
        this.f8140b = aVar;
        ((ByteArrayOutputStream) this).buf = aVar.a(Math.max(i, 256));
    }

    public void c(int i) {
        a aVar = (a) this.f8140b;
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] bArrA = aVar.a((i10 + i) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
        aVar.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrA;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f8139a) {
            case 0:
                ((a) this.f8140b).b(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public void finalize() throws Throwable {
        switch (this.f8139a) {
            case 0:
                ((a) this.f8140b).b(((ByteArrayOutputStream) this).buf);
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString() {
        switch (this.f8139a) {
            case 1:
                int i = ((ByteArrayOutputStream) this).count;
                if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                    i--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i, ((s3.d) this.f8140b).f8385b.name());
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            default:
                return super.toString();
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i10) {
        switch (this.f8139a) {
            case 0:
                synchronized (this) {
                    c(i10);
                    super.write(bArr, i, i10);
                }
                return;
            default:
                super.write(bArr, i, i10);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s3.d dVar, int i) {
        super(i);
        this.f8140b = dVar;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        switch (this.f8139a) {
            case 0:
                synchronized (this) {
                    c(1);
                    super.write(i);
                }
                return;
            default:
                super.write(i);
                return;
        }
    }
}
