package w8;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f9782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c5.a f9783x;

    public p(Context context, e eVar, o oVar, c5.a aVar) {
        super(context, eVar);
        this.f9782w = oVar;
        oVar.f9781b = this;
        this.f9783x = aVar;
        aVar.f1774a = this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        Rect bounds = getBounds();
        float fB = b();
        o oVar = this.f9782w;
        oVar.f9780a.a();
        oVar.a(canvas, bounds, fB);
        o oVar2 = this.f9782w;
        Paint paint = this.f9778t;
        oVar2.c(canvas, paint);
        int i = 0;
        while (true) {
            c5.a aVar = this.f9783x;
            int[] iArr = (int[]) aVar.f1776c;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            float[] fArr = (float[]) aVar.f1775b;
            int i10 = i * 2;
            this.f9782w.b(canvas, paint, fArr[i10], fArr[i10 + 1], iArr[i]);
            i++;
        }
    }

    @Override // w8.n
    public final boolean f(boolean z4, boolean z10, boolean z11) {
        boolean zF = super.f(z4, z10, z11);
        if (!isRunning()) {
            this.f9783x.b();
        }
        a aVar = this.f9773c;
        ContentResolver contentResolver = this.f9771a.getContentResolver();
        aVar.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z4 && z11) {
            this.f9783x.i();
        }
        return zF;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f9782w.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f9782w.e();
    }
}
