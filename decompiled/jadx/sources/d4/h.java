package d4;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f2878b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(u3.f.f8847a);

    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f2878b);
    }

    @Override // d4.d
    public final Bitmap c(x3.a aVar, Bitmap bitmap, int i, int i10) {
        Paint paint = y.f2911a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i10) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return y.b(aVar, bitmap, i, i10);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // u3.f
    public final int hashCode() {
        return -670243078;
    }
}
