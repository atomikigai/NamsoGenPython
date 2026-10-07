package h1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f4570a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final void d(long j4) throws IOException {
        int i = this.f4572c;
        if (i > j4) {
            this.f4572c = 0;
            this.f4570a.reset();
        } else {
            j4 -= (long) i;
        }
        c((int) j4);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f4570a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
