package n2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import fa.c1;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final PorterDuff.Mode f7220u = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f7221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f7222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorFilter f7223d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7224f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float[] f7225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Matrix f7226s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f7227t;

    public o() {
        this.f7224f = true;
        this.f7225r = new float[9];
        this.f7226s = new Matrix();
        this.f7227t = new Rect();
        m mVar = new m();
        mVar.f7212c = null;
        mVar.f7213d = f7220u;
        mVar.f7211b = new l();
        this.f7221b = mVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f7177a;
        if (drawable == null) {
            return false;
        }
        i0.b.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f7227t;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f7223d;
        if (colorFilter == null) {
            colorFilter = this.f7222c;
        }
        Matrix matrix = this.f7226s;
        canvas.getMatrix(matrix);
        float[] fArr = this.f7225r;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && i0.c.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        m mVar = this.f7221b;
        Bitmap bitmap = mVar.f7214f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != mVar.f7214f.getHeight()) {
            mVar.f7214f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            mVar.f7217k = true;
        }
        if (this.f7224f) {
            m mVar2 = this.f7221b;
            if (mVar2.f7217k || mVar2.f7215g != mVar2.f7212c || mVar2.h != mVar2.f7213d || mVar2.f7216j != mVar2.e || mVar2.i != mVar2.f7211b.getRootAlpha()) {
                m mVar3 = this.f7221b;
                mVar3.f7214f.eraseColor(0);
                Canvas canvas2 = new Canvas(mVar3.f7214f);
                l lVar = mVar3.f7211b;
                lVar.a(lVar.f7203g, l.f7197p, canvas2, iMin, iMin2);
                m mVar4 = this.f7221b;
                mVar4.f7215g = mVar4.f7212c;
                mVar4.h = mVar4.f7213d;
                mVar4.i = mVar4.f7211b.getRootAlpha();
                mVar4.f7216j = mVar4.e;
                mVar4.f7217k = false;
            }
        } else {
            m mVar5 = this.f7221b;
            mVar5.f7214f.eraseColor(0);
            Canvas canvas3 = new Canvas(mVar5.f7214f);
            l lVar2 = mVar5.f7211b;
            lVar2.a(lVar2.f7203g, l.f7197p, canvas3, iMin, iMin2);
        }
        m mVar6 = this.f7221b;
        if (mVar6.f7211b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (mVar6.f7218l == null) {
                Paint paint2 = new Paint();
                mVar6.f7218l = paint2;
                paint2.setFilterBitmap(true);
            }
            mVar6.f7218l.setAlpha(mVar6.f7211b.getRootAlpha());
            mVar6.f7218l.setColorFilter(colorFilter);
            paint = mVar6.f7218l;
        }
        canvas.drawBitmap(mVar6.f7214f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f7177a;
        return drawable != null ? i0.a.a(drawable) : this.f7221b.f7211b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f7177a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f7221b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7177a;
        return drawable != null ? i0.b.c(drawable) : this.f7223d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f7177a != null) {
            return new n(this.f7177a.getConstantState());
        }
        this.f7221b.f7210a = getChangingConfigurations();
        return this.f7221b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f7177a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f7221b.f7211b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f7177a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f7221b.f7211b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f7177a;
        return drawable != null ? i0.a.d(drawable) : this.f7221b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        m mVar = this.f7221b;
        if (mVar == null) {
            return false;
        }
        l lVar = mVar.f7211b;
        if (lVar.f7208n == null) {
            lVar.f7208n = Boolean.valueOf(lVar.f7203g.a());
        }
        if (lVar.f7208n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f7221b.f7212c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            m mVar = this.f7221b;
            m mVar2 = new m();
            mVar2.f7212c = null;
            mVar2.f7213d = f7220u;
            if (mVar != null) {
                mVar2.f7210a = mVar.f7210a;
                l lVar = new l(mVar.f7211b);
                mVar2.f7211b = lVar;
                if (mVar.f7211b.e != null) {
                    lVar.e = new Paint(mVar.f7211b.e);
                }
                if (mVar.f7211b.f7201d != null) {
                    mVar2.f7211b.f7201d = new Paint(mVar.f7211b.f7201d);
                }
                mVar2.f7212c = mVar.f7212c;
                mVar2.f7213d = mVar.f7213d;
                mVar2.e = mVar.e;
            }
            this.f7221b = mVar2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z4;
        PorterDuff.Mode mode;
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.f7221b;
        ColorStateList colorStateList = mVar.f7212c;
        if (colorStateList == null || (mode = mVar.f7213d) == null) {
            z4 = false;
        } else {
            this.f7222c = a(colorStateList, mode);
            invalidateSelf();
            z4 = true;
        }
        l lVar = mVar.f7211b;
        if (lVar.f7208n == null) {
            lVar.f7208n = Boolean.valueOf(lVar.f7203g.a());
        }
        if (lVar.f7208n.booleanValue()) {
            boolean zB = mVar.f7211b.f7203g.b(iArr);
            mVar.f7217k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f7221b.f7211b.getRootAlpha() != i) {
            this.f7221b.f7211b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            i0.a.e(drawable, z4);
        } else {
            this.f7221b.e = z4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7223d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            jd.l.w(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            i0.b.h(drawable, colorStateList);
            return;
        }
        m mVar = this.f7221b;
        if (mVar.f7212c != colorStateList) {
            mVar.f7212c = colorStateList;
            this.f7222c = a(colorStateList, mVar.f7213d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            i0.b.i(drawable, mode);
            return;
        }
        m mVar = this.f7221b;
        if (mVar.f7213d != mode) {
            mVar.f7213d = mode;
            this.f7222c = a(mVar.f7212c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z10) {
        Drawable drawable = this.f7177a;
        return drawable != null ? drawable.setVisible(z4, z10) : super.setVisible(z4, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c10;
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            i0.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.f7221b;
        mVar.f7211b = new l();
        TypedArray typedArrayF = g0.b.f(resources, theme, attributeSet, a.f7162a);
        m mVar2 = this.f7221b;
        l lVar = mVar2.f7211b;
        int i11 = !g0.b.c(xmlPullParser, "tintMode") ? -1 : typedArrayF.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        mVar2.f7213d = mode;
        ColorStateList colorStateListA = null;
        int i12 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayF.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i13 >= 28 && i13 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayF.getResources();
                int resourceId = typedArrayF.getResourceId(1, 0);
                ThreadLocal threadLocal = g0.c.f4133a;
                try {
                    colorStateListA = g0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            mVar2.f7212c = colorStateList;
        }
        boolean z4 = mVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z4 = typedArrayF.getBoolean(5, z4);
        }
        mVar2.e = z4;
        float f10 = lVar.f7204j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = typedArrayF.getFloat(7, f10);
        }
        lVar.f7204j = f10;
        float f11 = lVar.f7205k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = typedArrayF.getFloat(8, f11);
        }
        lVar.f7205k = f11;
        if (lVar.f7204j <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            lVar.h = typedArrayF.getDimension(3, lVar.h);
            float dimension = typedArrayF.getDimension(2, lVar.i);
            lVar.i = dimension;
            if (lVar.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = lVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayF.getFloat(4, alpha);
                }
                lVar.setAlpha(alpha);
                String string = typedArrayF.getString(0);
                if (string != null) {
                    lVar.f7207m = string;
                    lVar.f7209o.put(string, lVar);
                }
                typedArrayF.recycle();
                mVar.f7210a = getChangingConfigurations();
                mVar.f7217k = true;
                m mVar3 = this.f7221b;
                l lVar2 = mVar3.f7211b;
                ArrayDeque arrayDeque = new ArrayDeque();
                i iVar = lVar2.f7203g;
                r.e eVar = lVar2.f7209o;
                arrayDeque.push(iVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z10 = true;
                while (eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        i iVar2 = (i) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            h hVar = new h();
                            hVar.e = 0.0f;
                            hVar.f7180g = 1.0f;
                            hVar.h = 1.0f;
                            hVar.i = 0.0f;
                            hVar.f7181j = 1.0f;
                            hVar.f7182k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            hVar.f7183l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            hVar.f7184m = join2;
                            hVar.f7185n = 4.0f;
                            TypedArray typedArrayF2 = g0.b.f(resources, theme, attributeSet, a.f7164c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayF2.getString(0);
                                if (string2 != null) {
                                    hVar.f7195b = string2;
                                }
                                String string3 = typedArrayF2.getString(2);
                                if (string3 != null) {
                                    hVar.f7194a = c1.o(string3);
                                }
                                hVar.f7179f = g0.b.b(typedArrayF2, xmlPullParser, theme, "fillColor", 1);
                                float f12 = hVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = typedArrayF2.getFloat(12, f12);
                                }
                                hVar.h = f12;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayF2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = hVar.f7183l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                hVar.f7183l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayF2.getInt(9, -1) : -1;
                                Paint.Join join3 = hVar.f7184m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                hVar.f7184m = join;
                                float f13 = hVar.f7185n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = typedArrayF2.getFloat(10, f13);
                                }
                                hVar.f7185n = f13;
                                hVar.f7178d = g0.b.b(typedArrayF2, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = hVar.f7180g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = typedArrayF2.getFloat(11, f14);
                                }
                                hVar.f7180g = f14;
                                float f15 = hVar.e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = typedArrayF2.getFloat(4, f15);
                                }
                                hVar.e = f15;
                                float f16 = hVar.f7181j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = typedArrayF2.getFloat(6, f16);
                                }
                                hVar.f7181j = f16;
                                float f17 = hVar.f7182k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = typedArrayF2.getFloat(7, f17);
                                }
                                hVar.f7182k = f17;
                                float f18 = hVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = typedArrayF2.getFloat(5, f18);
                                }
                                hVar.i = f18;
                                int i16 = hVar.f7196c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = typedArrayF2.getInt(13, i16);
                                }
                                hVar.f7196c = i16;
                            }
                            typedArrayF2.recycle();
                            iVar2.f7187b.add(hVar);
                            if (hVar.getPathName() != null) {
                                eVar.put(hVar.getPathName(), hVar);
                            }
                            mVar3.f7210a = mVar3.f7210a;
                            z10 = false;
                            c10 = '\b';
                        } else {
                            c10 = '\b';
                            if ("clip-path".equals(name)) {
                                g gVar = new g();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayF3 = g0.b.f(resources, theme, attributeSet, a.f7165d);
                                    String string4 = typedArrayF3.getString(0);
                                    if (string4 != null) {
                                        gVar.f7195b = string4;
                                    }
                                    String string5 = typedArrayF3.getString(1);
                                    if (string5 != null) {
                                        gVar.f7194a = c1.o(string5);
                                    }
                                    gVar.f7196c = !g0.b.c(xmlPullParser, "fillType") ? 0 : typedArrayF3.getInt(2, 0);
                                    typedArrayF3.recycle();
                                }
                                iVar2.f7187b.add(gVar);
                                if (gVar.getPathName() != null) {
                                    eVar.put(gVar.getPathName(), gVar);
                                }
                                mVar3.f7210a = mVar3.f7210a;
                            } else if ("group".equals(name)) {
                                i iVar3 = new i();
                                TypedArray typedArrayF4 = g0.b.f(resources, theme, attributeSet, a.f7163b);
                                float f19 = iVar3.f7188c;
                                if (g0.b.c(xmlPullParser, "rotation")) {
                                    f19 = typedArrayF4.getFloat(5, f19);
                                }
                                iVar3.f7188c = f19;
                                iVar3.f7189d = typedArrayF4.getFloat(1, iVar3.f7189d);
                                iVar3.e = typedArrayF4.getFloat(2, iVar3.e);
                                float f20 = iVar3.f7190f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f20 = typedArrayF4.getFloat(3, f20);
                                }
                                iVar3.f7190f = f20;
                                float f21 = iVar3.f7191g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f21 = typedArrayF4.getFloat(4, f21);
                                }
                                iVar3.f7191g = f21;
                                float f22 = iVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f22 = typedArrayF4.getFloat(6, f22);
                                }
                                iVar3.h = f22;
                                float f23 = iVar3.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f23 = typedArrayF4.getFloat(7, f23);
                                }
                                iVar3.i = f23;
                                String string6 = typedArrayF4.getString(0);
                                if (string6 != null) {
                                    iVar3.f7193k = string6;
                                }
                                iVar3.c();
                                typedArrayF4.recycle();
                                iVar2.f7187b.add(iVar3);
                                arrayDeque.push(iVar3);
                                if (iVar3.getGroupName() != null) {
                                    eVar.put(iVar3.getGroupName(), iVar3);
                                }
                                mVar3.f7210a = mVar3.f7210a;
                            }
                        }
                        i10 = 1;
                    } else {
                        i = depth;
                        c10 = '\b';
                        i10 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i12 = i10;
                    depth = i;
                }
                if (!z10) {
                    this.f7222c = a(mVar.f7212c, mVar.f7213d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public o(m mVar) {
        this.f7224f = true;
        this.f7225r = new float[9];
        this.f7226s = new Matrix();
        this.f7227t = new Rect();
        this.f7221b = mVar;
        this.f7222c = a(mVar.f7212c, mVar.f7213d);
    }
}
