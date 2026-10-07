package n2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f implements Animatable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g6.m f7175d = null;
    public ArrayList e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f7176f = new c(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f7173b = new d();

    public e(Context context, int i) {
        this.f7174c = context;
    }

    @Override // n2.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            i0.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            return i0.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f7173b;
        dVar.f7169a.draw(canvas);
        if (dVar.f7170b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f7177a;
        return drawable != null ? i0.a.a(drawable) : this.f7173b.f7169a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f7173b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7177a;
        return drawable != null ? i0.b.c(drawable) : this.f7173b.f7169a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f7177a != null) {
            return new h4.b(this.f7177a.getConstantState(), 1);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f7177a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f7173b.f7169a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f7177a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f7173b.f7169a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7177a;
        return drawable != null ? drawable.getOpacity() : this.f7173b.f7169a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        d dVar;
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            i0.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f7173b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayF = g0.b.f(resources, theme, attributeSet, a.e);
                    int resourceId = typedArrayF.getResourceId(0, 0);
                    if (resourceId != 0) {
                        o oVar = new o();
                        ThreadLocal threadLocal = g0.n.f4149a;
                        oVar.f7177a = g0.i.a(resources, resourceId, theme);
                        new n(oVar.f7177a.getConstantState());
                        oVar.f7224f = false;
                        oVar.setCallback(this.f7176f);
                        o oVar2 = dVar.f7169a;
                        if (oVar2 != null) {
                            oVar2.setCallback(null);
                        }
                        dVar.f7169a = oVar;
                    }
                    typedArrayF.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f7166f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f7174c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(dVar.f7169a.f7221b.f7211b.f7209o.get(string));
                        if (dVar.f7171c == null) {
                            dVar.f7171c = new ArrayList();
                            dVar.f7172d = new r.e(0);
                        }
                        dVar.f7171c.add(animatorLoadAnimator);
                        dVar.f7172d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f7170b == null) {
            dVar.f7170b = new AnimatorSet();
        }
        dVar.f7170b.playTogether(dVar.f7171c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f7177a;
        return drawable != null ? i0.a.d(drawable) : this.f7173b.f7169a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f7177a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f7173b.f7170b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f7177a;
        return drawable != null ? drawable.isStateful() : this.f7173b.f7169a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f7173b.f7169a.setBounds(rect);
        }
    }

    @Override // n2.f, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f7177a;
        return drawable != null ? drawable.setLevel(i) : this.f7173b.f7169a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f7177a;
        return drawable != null ? drawable.setState(iArr) : this.f7173b.f7169a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f7173b.f7169a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            i0.a.e(drawable, z4);
        } else {
            this.f7173b.f7169a.setAutoMirrored(z4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7173b.f7169a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            jd.l.w(drawable, i);
        } else {
            this.f7173b.f7169a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            i0.b.h(drawable, colorStateList);
        } else {
            this.f7173b.f7169a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            i0.b.i(drawable, mode);
        } else {
            this.f7173b.f7169a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z10) {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            return drawable.setVisible(z4, z10);
        }
        this.f7173b.f7169a.setVisible(z4, z10);
        return super.setVisible(z4, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f7173b;
        if (dVar.f7170b.isStarted()) {
            return;
        }
        dVar.f7170b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f7177a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f7173b.f7170b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
