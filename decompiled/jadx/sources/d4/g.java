package d4;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f2877b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(u3.f.f8847a);

    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f2877b);
    }

    @Override // d4.d
    public final Bitmap c(x3.a aVar, Bitmap bitmap, int i, int i10) {
        float width;
        float height;
        Paint paint = y.f2911a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i10 > bitmap.getHeight() * i) {
            width = i10 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i10 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapH = aVar.h(i, i10, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapH.setHasAlpha(bitmap.hasAlpha());
        y.a(bitmap, bitmapH, matrix);
        return bitmapH;
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        return obj instanceof g;
    }

    @Override // u3.f
    public final int hashCode() {
        return -599754482;
    }
}
