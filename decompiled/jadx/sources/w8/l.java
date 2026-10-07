package w8;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends n {
    public static final k B = new k();
    public boolean A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f9764w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e1.f f9765x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e1.e f9766y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f9767z;

    public l(Context context, e eVar, o oVar) {
        super(context, eVar);
        this.A = false;
        this.f9764w = oVar;
        oVar.f9781b = this;
        e1.f fVar = new e1.f();
        this.f9765x = fVar;
        fVar.f3204b = 1.0f;
        fVar.f3205c = false;
        fVar.f3203a = Math.sqrt(50.0f);
        fVar.f3205c = false;
        e1.e eVar2 = new e1.e(this);
        this.f9766y = eVar2;
        eVar2.f3200k = fVar;
        if (this.f9777s != 1.0f) {
            this.f9777s = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            o oVar = this.f9764w;
            oVar.f9780a.a();
            oVar.a(canvas, bounds, fB);
            o oVar2 = this.f9764w;
            Paint paint = this.f9778t;
            oVar2.c(canvas, paint);
            int iC = com.bumptech.glide.c.c(this.f9772b.f9745c[0], this.f9779u);
            this.f9764w.b(canvas, paint, 0.0f, this.f9767z, iC);
            canvas.restore();
        }
    }

    @Override // w8.n
    public final boolean f(boolean z4, boolean z10, boolean z11) {
        boolean zF = super.f(z4, z10, z11);
        a aVar = this.f9773c;
        ContentResolver contentResolver = this.f9771a.getContentResolver();
        aVar.getClass();
        float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f10 == 0.0f) {
            this.A = true;
            return zF;
        }
        this.A = false;
        float f11 = 50.0f / f10;
        e1.f fVar = this.f9765x;
        fVar.getClass();
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        fVar.f3203a = Math.sqrt(f11);
        fVar.f3205c = false;
        return zF;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f9764w.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f9764w.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f9766y.b();
        this.f9767z = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z4 = this.A;
        e1.e eVar = this.f9766y;
        if (z4) {
            eVar.b();
            this.f9767z = i / 10000.0f;
            invalidateSelf();
            return true;
        }
        eVar.f3194b = this.f9767z * 10000.0f;
        eVar.f3195c = true;
        float f10 = i;
        if (eVar.f3197f) {
            eVar.f3201l = f10;
            return true;
        }
        if (eVar.f3200k == null) {
            eVar.f3200k = new e1.f(f10);
        }
        e1.f fVar = eVar.f3200k;
        double d10 = f10;
        fVar.i = d10;
        double d11 = (float) d10;
        if (d11 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d11 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(eVar.h * 0.75f);
        fVar.f3206d = dAbs;
        fVar.e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z10 = eVar.f3197f;
        if (!z10 && !z10) {
            eVar.f3197f = true;
            if (!eVar.f3195c) {
                k kVar = eVar.e;
                l lVar = eVar.f3196d;
                kVar.getClass();
                eVar.f3194b = lVar.f9767z * 10000.0f;
            }
            float f11 = eVar.f3194b;
            if (f11 > Float.MAX_VALUE || f11 < -3.4028235E38f) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            ThreadLocal threadLocal = e1.b.f3180f;
            if (threadLocal.get() == null) {
                threadLocal.set(new e1.b());
            }
            e1.b bVar = (e1.b) threadLocal.get();
            ArrayList arrayList = bVar.f3182b;
            if (arrayList.size() == 0) {
                if (bVar.f3184d == null) {
                    bVar.f3184d = new a2.l(bVar.f3183c);
                }
                a2.l lVar2 = bVar.f3184d;
                ((Choreographer) lVar2.f44c).postFrameCallback((e1.a) lVar2.f45d);
            }
            if (!arrayList.contains(eVar)) {
                arrayList.add(eVar);
                return true;
            }
        }
        return true;
    }
}
