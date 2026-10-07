package w8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9749d;
    public float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f9750f;

    public f(j jVar) {
        super(jVar);
        this.f9748c = 1;
    }

    @Override // w8.o
    public final void a(Canvas canvas, Rect rect, float f10) {
        float fWidth = rect.width() / g();
        float fHeight = rect.height() / g();
        j jVar = (j) this.f9780a;
        float f11 = (jVar.f9763g / 2.0f) + jVar.h;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        this.f9748c = jVar.i == 0 ? 1 : -1;
        int i = jVar.f9743a;
        this.f9749d = i * f10;
        this.e = jVar.f9744b * f10;
        this.f9750f = (jVar.f9763g - i) / 2.0f;
        if ((this.f9781b.d() && jVar.e == 2) || (this.f9781b.c() && jVar.f9747f == 1)) {
            this.f9750f = (((1.0f - f10) * jVar.f9743a) / 2.0f) + this.f9750f;
        } else if ((this.f9781b.d() && jVar.e == 1) || (this.f9781b.c() && jVar.f9747f == 2)) {
            this.f9750f -= ((1.0f - f10) * jVar.f9743a) / 2.0f;
        }
    }

    @Override // w8.o
    public final void b(Canvas canvas, Paint paint, float f10, float f11, int i) {
        if (f10 == f11) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f9749d);
        float f12 = this.f9748c;
        float f13 = f10 * 360.0f * f12;
        float f14 = (f11 >= f10 ? f11 - f10 : (1.0f + f11) - f10) * 360.0f * f12;
        float f15 = this.f9750f;
        float f16 = -f15;
        canvas.drawArc(new RectF(f16, f16, f15, f15), f13, f14, false, paint);
        if (this.e <= 0.0f || Math.abs(f14) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        f(canvas, paint, this.f9749d, this.e, f13);
        f(canvas, paint, this.f9749d, this.e, f13 + f14);
    }

    @Override // w8.o
    public final void c(Canvas canvas, Paint paint) {
        int iC = com.bumptech.glide.c.c(((j) this.f9780a).f9746d, this.f9781b.f9779u);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iC);
        paint.setStrokeWidth(this.f9749d);
        float f10 = this.f9750f;
        float f11 = -f10;
        canvas.drawArc(new RectF(f11, f11, f10, f10), 0.0f, 360.0f, false, paint);
    }

    @Override // w8.o
    public final int d() {
        return g();
    }

    @Override // w8.o
    public final int e() {
        return g();
    }

    public final void f(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        canvas.save();
        canvas.rotate(f12);
        float f13 = this.f9750f;
        float f14 = f10 / 2.0f;
        canvas.drawRoundRect(new RectF(f13 - f14, f11, f13 + f14, -f11), f11, f11, paint);
        canvas.restore();
    }

    public final int g() {
        e eVar = this.f9780a;
        return (((j) eVar).h * 2) + ((j) eVar).f9763g;
    }
}
