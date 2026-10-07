package f4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.l;
import h4.g;
import p4.f;
import w3.u;
import w3.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements x, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f3592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3593b;

    public d(Drawable drawable, int i) {
        this.f3593b = i;
        f.c(drawable, "Argument must not be null");
        this.f3592a = drawable;
    }

    @Override // w3.u
    public void a() {
        switch (this.f3593b) {
            case 1:
                ((g) ((h4.c) this.f3592a).f4934a.f4933b).f4958l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f3592a;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof h4.c) {
                    ((g) ((h4.c) drawable).f4934a.f4933b).f4958l.prepareToDraw();
                }
                break;
        }
    }

    @Override // w3.x
    public final void b() {
        x3.f fVar;
        x3.f fVar2;
        x3.f fVar3;
        switch (this.f3593b) {
            case 0:
                break;
            default:
                h4.c cVar = (h4.c) this.f3592a;
                cVar.stop();
                cVar.f4937d = true;
                g gVar = (g) cVar.f4934a.f4933b;
                l lVar = gVar.f4953d;
                gVar.f4952c.clear();
                Bitmap bitmap = gVar.f4958l;
                if (bitmap != null) {
                    gVar.e.c(bitmap);
                    gVar.f4958l = null;
                }
                gVar.f4954f = false;
                h4.e eVar = gVar.i;
                if (eVar != null) {
                    lVar.k(eVar);
                    gVar.i = null;
                }
                h4.e eVar2 = gVar.f4957k;
                if (eVar2 != null) {
                    lVar.k(eVar2);
                    gVar.f4957k = null;
                }
                h4.e eVar3 = gVar.f4959m;
                if (eVar3 != null) {
                    lVar.k(eVar3);
                    gVar.f4959m = null;
                }
                t3.d dVar = gVar.f4950a;
                aa.c cVar2 = dVar.f8581c;
                dVar.f8587l = null;
                byte[] bArr = dVar.i;
                if (bArr != null && (fVar3 = (x3.f) cVar2.f264c) != null) {
                    fVar3.g(bArr);
                }
                int[] iArr = dVar.f8585j;
                if (iArr != null && (fVar2 = (x3.f) cVar2.f264c) != null) {
                    fVar2.g(iArr);
                }
                Bitmap bitmap2 = dVar.f8588m;
                if (bitmap2 != null) {
                    ((x3.a) cVar2.f263b).c(bitmap2);
                }
                dVar.f8588m = null;
                dVar.f8582d = null;
                dVar.f8594s = null;
                byte[] bArr2 = dVar.e;
                if (bArr2 != null && (fVar = (x3.f) cVar2.f264c) != null) {
                    fVar.g(bArr2);
                }
                gVar.f4956j = true;
                break;
        }
    }

    @Override // w3.x
    public final int d() {
        switch (this.f3593b) {
            case 0:
                Drawable drawable = this.f3592a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                g gVar = (g) ((h4.c) this.f3592a).f4934a.f4933b;
                t3.d dVar = gVar.f4950a;
                return (dVar.f8585j.length * 4) + dVar.f8582d.limit() + dVar.i.length + gVar.f4960n;
        }
    }

    @Override // w3.x
    public final Class e() {
        switch (this.f3593b) {
            case 0:
                return this.f3592a.getClass();
            default:
                return h4.c.class;
        }
    }

    @Override // w3.x
    public final Object get() {
        Drawable drawable = this.f3592a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    private final void c() {
    }
}
