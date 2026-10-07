package d4;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements u3.m {
    @Override // u3.m
    public final w3.x b(Context context, w3.x xVar, int i, int i10) {
        if (!p4.n.i(i, i10)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i10 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        x3.a aVar = com.bumptech.glide.b.a(context).f1839a;
        Bitmap bitmap = (Bitmap) xVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(aVar, bitmap, i, i10);
        return bitmap.equals(bitmapC) ? xVar : c.c(bitmapC, aVar);
    }

    public abstract Bitmap c(x3.a aVar, Bitmap bitmap, int i, int i10);
}
