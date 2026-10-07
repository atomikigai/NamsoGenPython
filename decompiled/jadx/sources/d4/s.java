package d4;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements u3.e {
    @Override // u3.e
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // u3.e
    public final int b(ByteBuffer byteBuffer, x3.f fVar) {
        AtomicReference atomicReference = p4.b.f7790a;
        return c(new p4.a(byteBuffer), fVar);
    }

    @Override // u3.e
    public final int c(InputStream inputStream, x3.f fVar) throws Throwable {
        int iE;
        h1.g gVar = new h1.g(inputStream);
        h1.c cVarC = gVar.c("Orientation");
        if (cVarC == null) {
            iE = 1;
        } else {
            try {
                iE = cVarC.e(gVar.f4603f);
            } catch (NumberFormatException unused) {
                iE = 1;
            }
        }
        if (iE == 0) {
            return -1;
        }
        return iE;
    }

    @Override // u3.e
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
