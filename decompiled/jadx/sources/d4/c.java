package d4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements w3.x, w3.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2864a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2866c;

    public c(Bitmap bitmap, x3.a aVar) {
        p4.f.c(bitmap, "Bitmap must not be null");
        this.f2865b = bitmap;
        p4.f.c(aVar, "BitmapPool must not be null");
        this.f2866c = aVar;
    }

    public static c c(Bitmap bitmap, x3.a aVar) {
        if (bitmap == null) {
            return null;
        }
        return new c(bitmap, aVar);
    }

    @Override // w3.u
    public final void a() {
        switch (this.f2864a) {
            case 0:
                ((Bitmap) this.f2865b).prepareToDraw();
                break;
            default:
                w3.x xVar = (w3.x) this.f2866c;
                if (xVar instanceof w3.u) {
                    ((w3.u) xVar).a();
                }
                break;
        }
    }

    @Override // w3.x
    public final void b() {
        switch (this.f2864a) {
            case 0:
                ((x3.a) this.f2866c).c((Bitmap) this.f2865b);
                break;
            default:
                ((w3.x) this.f2866c).b();
                break;
        }
    }

    @Override // w3.x
    public final int d() {
        switch (this.f2864a) {
            case 0:
                return p4.n.c((Bitmap) this.f2865b);
            default:
                return ((w3.x) this.f2866c).d();
        }
    }

    @Override // w3.x
    public final Class e() {
        switch (this.f2864a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // w3.x
    public final Object get() {
        switch (this.f2864a) {
            case 0:
                return (Bitmap) this.f2865b;
            default:
                return new BitmapDrawable((Resources) this.f2865b, (Bitmap) ((w3.x) this.f2866c).get());
        }
    }

    public c(Resources resources, w3.x xVar) {
        p4.f.c(resources, "Argument must not be null");
        this.f2865b = resources;
        p4.f.c(xVar, "Argument must not be null");
        this.f2866c = xVar;
    }
}
