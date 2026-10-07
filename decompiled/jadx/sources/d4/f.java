package d4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements u3.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2876b;

    public f(int i) {
        this.f2875a = i;
        switch (i) {
            case 1:
                this.f2876b = new f(2);
                break;
            case 2:
                this.f2876b = new r7.j();
                break;
            default:
                this.f2876b = new f(2);
                break;
        }
    }

    @Override // u3.k
    public final w3.x a(Object obj, int i, int i10, u3.i iVar) {
        switch (this.f2875a) {
            case 0:
                return ((f) this.f2876b).c(ImageDecoder.createSource((ByteBuffer) obj), i, i10, iVar);
            case 1:
                return ((f) this.f2876b).c(ImageDecoder.createSource(p4.b.b((InputStream) obj)), i, i10, iVar);
            default:
                return c(a5.f.e(obj), i, i10, iVar);
        }
    }

    @Override // u3.k
    public final /* bridge */ /* synthetic */ boolean b(Object obj, u3.i iVar) {
        switch (this.f2875a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a5.f.e(obj);
                break;
        }
        return true;
    }

    public c c(ImageDecoder.Source source, int i, int i10, u3.i iVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new c4.b(i, i10, iVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i10 + "]");
        }
        return new c(bitmapDecodeBitmap, (r7.j) this.f2876b);
    }
}
