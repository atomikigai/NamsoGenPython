package d4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f2879b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(u3.f.f8847a);

    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f2879b);
    }

    @Override // d4.d
    public final Bitmap c(x3.a aVar, Bitmap bitmap, int i, int i10) {
        Bitmap bitmapH;
        Lock lock = y.f2914d;
        int iMin = Math.min(i, i10);
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f10 / width, f10 / height);
        float f12 = width * fMax;
        float f13 = fMax * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap.Config configC = y.c(bitmap);
        if (configC.equals(bitmap.getConfig())) {
            bitmapH = bitmap;
        } else {
            bitmapH = aVar.h(bitmap.getWidth(), bitmap.getHeight(), configC);
            new Canvas(bitmapH).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapH2 = aVar.h(iMin, iMin, y.c(bitmap));
        bitmapH2.setHasAlpha(true);
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapH2);
            canvas.drawCircle(f11, f11, f11, y.f2912b);
            canvas.drawBitmap(bitmapH, (Rect) null, rectF, y.f2913c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapH.equals(bitmap)) {
                aVar.c(bitmapH);
            }
            return bitmapH2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // u3.f
    public final int hashCode() {
        return 1101716364;
    }
}
