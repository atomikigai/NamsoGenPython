package d4;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f2899b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(u3.f.f8847a);

    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f2899b);
    }

    @Override // d4.d
    public final Bitmap c(x3.a aVar, Bitmap bitmap, int i, int i10) {
        return y.b(aVar, bitmap, i, i10);
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    @Override // u3.f
    public final int hashCode() {
        return 1572326941;
    }
}
