package w8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9785d;
    public float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Path f9786f;

    public q(u uVar) {
        super(uVar);
        this.f9784c = 300.0f;
    }

    @Override // w8.o
    public final void a(Canvas canvas, Rect rect, float f10) {
        this.f9784c = rect.width();
        u uVar = (u) this.f9780a;
        float f11 = uVar.f9743a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - uVar.f9743a) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (uVar.i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f9781b.d() && uVar.e == 1) || (this.f9781b.c() && uVar.f9747f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f9781b.d() || this.f9781b.c()) {
            canvas.translate(0.0f, ((f10 - 1.0f) * uVar.f9743a) / 2.0f);
        }
        float f12 = this.f9784c;
        canvas.clipRect((-f12) / 2.0f, (-f11) / 2.0f, f12 / 2.0f, f11 / 2.0f);
        this.f9785d = uVar.f9743a * f10;
        this.e = uVar.f9744b * f10;
    }

    @Override // w8.o
    public final void b(Canvas canvas, Paint paint, float f10, float f11, int i) {
        if (f10 == f11) {
            return;
        }
        float f12 = this.f9784c;
        float f13 = (-f12) / 2.0f;
        float f14 = ((f10 * f12) + f13) - (this.e * 2.0f);
        float f15 = (f11 * f12) + f13;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.save();
        canvas.clipPath(this.f9786f);
        float f16 = this.f9785d;
        RectF rectF = new RectF(f14, (-f16) / 2.0f, f15, f16 / 2.0f);
        float f17 = this.e;
        canvas.drawRoundRect(rectF, f17, f17, paint);
        canvas.restore();
    }

    @Override // w8.o
    public final void c(Canvas canvas, Paint paint) {
        int iC = com.bumptech.glide.c.c(((u) this.f9780a).f9746d, this.f9781b.f9779u);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iC);
        Path path = new Path();
        this.f9786f = path;
        float f10 = this.f9784c;
        float f11 = this.f9785d;
        RectF rectF = new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f);
        float f12 = this.e;
        path.addRoundRect(rectF, f12, f12, Path.Direction.CCW);
        canvas.drawPath(this.f9786f, paint);
    }

    @Override // w8.o
    public final int d() {
        return ((u) this.f9780a).f9743a;
    }

    @Override // w8.o
    public final int e() {
        return -1;
    }
}
