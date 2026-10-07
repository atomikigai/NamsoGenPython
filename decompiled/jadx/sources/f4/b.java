package f4;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import u3.i;
import u3.k;
import w3.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3589b;

    public /* synthetic */ b(c cVar, int i) {
        this.f3588a = i;
        this.f3589b = cVar;
    }

    @Override // u3.k
    public final x a(Object obj, int i, int i10, i iVar) {
        switch (this.f3588a) {
            case 0:
                return c.a(ImageDecoder.createSource((ByteBuffer) obj), i, i10, iVar);
            default:
                return c.a(ImageDecoder.createSource(p4.b.b((InputStream) obj)), i, i10, iVar);
        }
    }

    @Override // u3.k
    public final boolean b(Object obj, i iVar) throws IOException {
        switch (this.f3588a) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeQ = n9.b.q(this.f3589b.f3590a, (ByteBuffer) obj);
                return imageHeaderParser$ImageTypeQ == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeQ == ImageHeaderParser$ImageType.ANIMATED_AVIF);
            default:
                c cVar = this.f3589b;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeP = n9.b.p(cVar.f3590a, (InputStream) obj, cVar.f3591b);
                return imageHeaderParser$ImageTypeP == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeP == ImageHeaderParser$ImageType.ANIMATED_AVIF);
        }
    }
}
