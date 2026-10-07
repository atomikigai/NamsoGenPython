package h4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable implements f, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4937d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4938f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Paint f4941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Rect f4942u;
    public boolean e = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4939r = -1;

    public c(b bVar) {
        this.f4934a = bVar;
    }

    public final void a() {
        p4.f.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f4937d);
        g gVar = (g) this.f4934a.f4933b;
        if (gVar.f4950a.f8587l.f8569c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f4935b) {
            return;
        }
        this.f4935b = true;
        ArrayList arrayList = gVar.f4952c;
        if (gVar.f4956j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !gVar.f4954f) {
            gVar.f4954f = true;
            gVar.f4956j = false;
            gVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f4937d) {
            return;
        }
        if (this.f4940s) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f4942u == null) {
                this.f4942u = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f4942u);
            this.f4940s = false;
        }
        g gVar = (g) this.f4934a.f4933b;
        e eVar = gVar.i;
        Bitmap bitmap = eVar != null ? eVar.f4949r : gVar.f4958l;
        if (this.f4942u == null) {
            this.f4942u = new Rect();
        }
        Rect rect = this.f4942u;
        if (this.f4941t == null) {
            this.f4941t = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f4941t);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f4934a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((g) this.f4934a.f4933b).f4962p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((g) this.f4934a.f4933b).f4961o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f4935b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4940s = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f4941t == null) {
            this.f4941t = new Paint(2);
        }
        this.f4941t.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4941t == null) {
            this.f4941t = new Paint(2);
        }
        this.f4941t.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z10) {
        p4.f.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f4937d);
        this.e = z4;
        if (!z4) {
            this.f4935b = false;
            g gVar = (g) this.f4934a.f4933b;
            ArrayList arrayList = gVar.f4952c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                gVar.f4954f = false;
            }
        } else if (this.f4936c) {
            a();
        }
        return super.setVisible(z4, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f4936c = true;
        this.f4938f = 0;
        if (this.e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f4936c = false;
        this.f4935b = false;
        g gVar = (g) this.f4934a.f4933b;
        ArrayList arrayList = gVar.f4952c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            gVar.f4954f = false;
        }
    }
}
