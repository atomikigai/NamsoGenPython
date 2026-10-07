package g8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import app.namso_gen.spacehowen.R;
import b9.g;
import b9.j;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import q0.e0;
import q0.v0;
import u8.k;
import u8.l;
import u8.n;
import y8.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f4284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f4285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f4286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f4287d;
    public final c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f4288f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f4289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f4291t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f4292u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f4293v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WeakReference f4294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WeakReference f4295x;

    public a(Context context) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f4284a = weakReference;
        n.c(context, n.f9041b, "Theme.MaterialComponents");
        this.f4287d = new Rect();
        l lVar = new l(this);
        this.f4286c = lVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = lVar.f9034a;
        textPaint.setTextAlign(align);
        c cVar = new c(context);
        this.e = cVar;
        boolean zE = e();
        b bVar = cVar.f4311b;
        g gVar = new g(b9.k.a(context, zE ? bVar.f4301r.intValue() : bVar.e.intValue(), e() ? bVar.f4302s.intValue() : bVar.f4300f.intValue(), new b9.a(0)).a());
        this.f4285b = gVar;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && lVar.f9039g != (dVar = new d(context2, bVar.f4299d.intValue()))) {
            lVar.b(dVar, context2);
            textPaint.setColor(bVar.f4298c.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i = bVar.f4306w;
        if (i != -2) {
            this.f4290s = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.f4290s = bVar.f4307x;
        }
        lVar.e = true;
        i();
        invalidateSelf();
        lVar.e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(bVar.f4297b.intValue());
        if (gVar.f1454a.f1442c != colorStateListValueOf) {
            gVar.k(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar.f4298c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f4294w;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f4294w.get();
            WeakReference weakReference3 = this.f4295x;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(bVar.E.booleanValue(), false);
    }

    @Override // u8.k
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        c cVar = this.e;
        b bVar = cVar.f4311b;
        b bVar2 = cVar.f4311b;
        String str = bVar.f4304u;
        WeakReference weakReference = this.f4284a;
        if (str == null) {
            if (!f()) {
                return null;
            }
            if (this.f4290s == -2 || d() <= this.f4290s) {
                return NumberFormat.getInstance(bVar2.f4308y).format(d());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(bVar2.f4308y, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f4290s), "+");
        }
        int i = bVar.f4306w;
        if (i == -2 || str == null || str.length() <= i) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.f4295x;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i = this.e.f4311b.f4305v;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f4285b.draw(canvas);
        if (!e() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        l lVar = this.f4286c;
        lVar.f9034a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.f4289r - rect.exactCenterY();
        canvas.drawText(strB, this.f4288f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), lVar.f9034a);
    }

    public final boolean e() {
        return this.e.f4311b.f4304u != null || f();
    }

    public final boolean f() {
        b bVar = this.e.f4311b;
        return bVar.f4304u == null && bVar.f4305v != -1;
    }

    public final void g() {
        Context context = (Context) this.f4284a.get();
        if (context == null) {
            return;
        }
        boolean zE = e();
        c cVar = this.e;
        this.f4285b.setShapeAppearanceModel(b9.k.a(context, zE ? cVar.f4311b.f4301r.intValue() : cVar.f4311b.e.intValue(), e() ? cVar.f4311b.f4302s.intValue() : cVar.f4311b.f4300f.intValue(), new b9.a(0)).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e.f4311b.f4303t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4287d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4287d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.f4294w = new WeakReference(view);
        this.f4295x = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0220  */
    /* JADX WARN: Code duplicated, block: B:101:0x0238  */
    /* JADX WARN: Code duplicated, block: B:104:0x0241  */
    /* JADX WARN: Code duplicated, block: B:105:0x0259  */
    /* JADX WARN: Code duplicated, block: B:108:0x025e  */
    /* JADX WARN: Code duplicated, block: B:111:0x026b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0278  */
    /* JADX WARN: Code duplicated, block: B:117:0x0285  */
    public final void i() {
        float y10;
        float x4;
        float y11;
        float x10;
        float height;
        float width;
        float f10;
        float f11;
        WeakReference weakReference = this.f4284a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f4294w;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f4287d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f4295x;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zE = e();
        c cVar = this.e;
        float f12 = zE ? cVar.f4313d : cVar.f4312c;
        this.f4291t = f12;
        if (f12 != -1.0f) {
            this.f4292u = f12;
            this.f4293v = f12;
        } else {
            this.f4292u = Math.round((e() ? cVar.f4315g : cVar.e) / 2.0f);
            this.f4293v = Math.round((e() ? cVar.h : cVar.f4314f) / 2.0f);
        }
        if (e()) {
            String strB = b();
            float f13 = this.f4292u;
            l lVar = this.f4286c;
            if (lVar.e) {
                lVar.a(strB);
                f10 = lVar.f9036c;
            } else {
                f10 = lVar.f9036c;
            }
            this.f4292u = Math.max(f13, (f10 / 2.0f) + cVar.f4311b.F.intValue());
            float f14 = this.f4293v;
            if (lVar.e) {
                lVar.a(strB);
                f11 = lVar.f9037d;
            } else {
                f11 = lVar.f9037d;
            }
            float fMax = Math.max(f14, (f11 / 2.0f) + cVar.f4311b.G.intValue());
            this.f4293v = fMax;
            this.f4292u = Math.max(this.f4292u, fMax);
        }
        b bVar = cVar.f4311b;
        b bVar2 = cVar.f4311b;
        int i = cVar.f4317k;
        int iIntValue = bVar.I.intValue();
        if (e()) {
            iIntValue = bVar.K.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = e8.a.c(e8.a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue, iIntValue - bVar.N.intValue());
            }
        }
        if (i == 0) {
            iIntValue -= Math.round(this.f4293v);
        }
        int iIntValue2 = bVar.M.intValue() + iIntValue;
        int iIntValue3 = bVar2.D.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f4289r = rect3.bottom - iIntValue2;
        } else {
            this.f4289r = rect3.top + iIntValue2;
        }
        int iIntValue4 = e() ? bVar.J.intValue() : bVar.H.intValue();
        if (i == 1) {
            iIntValue4 += e() ? cVar.f4316j : cVar.i;
        }
        int iIntValue5 = bVar.L.intValue() + iIntValue4;
        int iIntValue6 = bVar2.D.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap weakHashMap = v0.f7946a;
            this.f4288f = e0.d(view) == 0 ? (rect3.left - this.f4292u) + iIntValue5 : (rect3.right + this.f4292u) - iIntValue5;
        } else {
            WeakHashMap weakHashMap2 = v0.f7946a;
            this.f4288f = e0.d(view) == 0 ? (rect3.right + this.f4292u) - iIntValue5 : (rect3.left - this.f4292u) + iIntValue5;
        }
        if (bVar.O.booleanValue()) {
            View viewC = c();
            if (viewC != null) {
                FrameLayout frameLayoutC = c();
                if (frameLayoutC == null || frameLayoutC.getId() != R.id.mtrl_anchor_parent) {
                    y10 = 0.0f;
                    x4 = 0.0f;
                } else if (viewC.getParent() instanceof View) {
                    y10 = viewC.getY();
                    x4 = viewC.getX();
                    viewC = (View) viewC.getParent();
                }
                y11 = viewC.getY() + (this.f4289r - this.f4293v) + y10;
                x10 = viewC.getX() + (this.f4288f - this.f4292u) + x4;
                if (viewC.getParent() instanceof View) {
                    height = ((this.f4289r + this.f4293v) - (((View) viewC.getParent()).getHeight() - viewC.getY())) + y10;
                } else {
                    height = 0.0f;
                }
                if (viewC.getParent() instanceof View) {
                    width = ((this.f4288f + this.f4292u) - (((View) viewC.getParent()).getWidth() - viewC.getX())) + x4;
                } else {
                    width = 0.0f;
                }
                if (y11 < 0.0f) {
                    this.f4289r = Math.abs(y11) + this.f4289r;
                }
                if (x10 < 0.0f) {
                    this.f4288f = Math.abs(x10) + this.f4288f;
                }
                if (height > 0.0f) {
                    this.f4289r -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f4288f -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y12 = view.getY();
                x4 = view.getX();
                View view2 = (View) view.getParent();
                y10 = y12;
                viewC = view2;
                y11 = viewC.getY() + (this.f4289r - this.f4293v) + y10;
                x10 = viewC.getX() + (this.f4288f - this.f4292u) + x4;
                if (viewC.getParent() instanceof View) {
                    height = ((this.f4289r + this.f4293v) - (((View) viewC.getParent()).getHeight() - viewC.getY())) + y10;
                } else {
                    height = 0.0f;
                }
                if (viewC.getParent() instanceof View) {
                    width = ((this.f4288f + this.f4292u) - (((View) viewC.getParent()).getWidth() - viewC.getX())) + x4;
                } else {
                    width = 0.0f;
                }
                if (y11 < 0.0f) {
                    this.f4289r = Math.abs(y11) + this.f4289r;
                }
                if (x10 < 0.0f) {
                    this.f4288f = Math.abs(x10) + this.f4288f;
                }
                if (height > 0.0f) {
                    this.f4289r -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f4288f -= Math.abs(width);
                }
            }
        }
        float f15 = this.f4288f;
        float f16 = this.f4289r;
        float f17 = this.f4292u;
        float f18 = this.f4293v;
        rect2.set((int) (f15 - f17), (int) (f16 - f18), (int) (f15 + f17), (int) (f16 + f18));
        float f19 = this.f4291t;
        g gVar = this.f4285b;
        if (f19 != -1.0f) {
            j jVarE = gVar.f1454a.f1440a.e();
            jVarE.e = new b9.a(f19);
            jVarE.f1473f = new b9.a(f19);
            jVarE.f1474g = new b9.a(f19);
            jVarE.h = new b9.a(f19);
            gVar.setShapeAppearanceModel(jVarE.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        gVar.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, u8.k
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        c cVar = this.e;
        cVar.f4310a.f4303t = i;
        cVar.f4311b.f4303t = i;
        this.f4286c.f9034a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
