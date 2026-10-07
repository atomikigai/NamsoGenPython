package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import b9.k;
import b9.v;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbbs;
import h3.q2;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import l.p;
import n8.a;
import n8.b;
import n8.c;
import n8.d;
import n8.e;
import o0.i;
import q0.d0;
import q0.e0;
import q0.j0;
import q0.v0;
import u8.g;
import u8.h;
import u8.l;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends p implements d, v, h {
    public static final Rect I = new Rect();
    public static final int[] J = {R.attr.state_selected};
    public static final int[] K = {R.attr.state_checkable};
    public int A;
    public int B;
    public CharSequence C;
    public final c D;
    public boolean E;
    public final Rect F;
    public final RectF G;
    public final a H;
    public e e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InsetDrawable f2390f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RippleDrawable f2391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View.OnClickListener f2392s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f2393t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g f2394u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2395v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2397x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2398y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2399z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(i9.a.a(context, attributeSet, app.namso_gen.spacehowen.R.attr.chipStyle, app.namso_gen.spacehowen.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, app.namso_gen.spacehowen.R.attr.chipStyle);
        this.F = new Rect();
        this.G = new RectF();
        this.H = new a(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        e eVar = new e(context2, attributeSet);
        Context context3 = eVar.f7334p0;
        int[] iArr = d8.a.e;
        TypedArray typedArrayG = n.g(context3, attributeSet, iArr, app.namso_gen.spacehowen.R.attr.chipStyle, app.namso_gen.spacehowen.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.P0 = typedArrayG.hasValue(37);
        Context context4 = eVar.f7334p0;
        ColorStateList colorStateListH = android.support.v4.media.session.a.h(context4, typedArrayG, 24);
        if (eVar.I != colorStateListH) {
            eVar.I = colorStateListH;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList colorStateListH2 = android.support.v4.media.session.a.h(context4, typedArrayG, 11);
        if (eVar.J != colorStateListH2) {
            eVar.J = colorStateListH2;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = typedArrayG.getDimension(19, 0.0f);
        if (eVar.K != dimension) {
            eVar.K = dimension;
            eVar.invalidateSelf();
            eVar.v();
        }
        if (typedArrayG.hasValue(12)) {
            eVar.B(typedArrayG.getDimension(12, 0.0f));
        }
        eVar.G(android.support.v4.media.session.a.h(context4, typedArrayG, 22));
        eVar.H(typedArrayG.getDimension(23, 0.0f));
        eVar.Q(android.support.v4.media.session.a.h(context4, typedArrayG, 36));
        String text = typedArrayG.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(eVar.P, text);
        l lVar = eVar.f7340v0;
        if (!zEquals) {
            eVar.P = text;
            lVar.e = true;
            eVar.invalidateSelf();
            eVar.v();
        }
        y8.d dVar = (!typedArrayG.hasValue(0) || (resourceId = typedArrayG.getResourceId(0, 0)) == 0) ? null : new y8.d(context4, resourceId);
        dVar.f10630k = typedArrayG.getDimension(1, dVar.f10630k);
        lVar.b(dVar, context4);
        int i = typedArrayG.getInt(3, 0);
        if (i == 1) {
            eVar.M0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            eVar.M0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            eVar.M0 = TextUtils.TruncateAt.END;
        }
        eVar.F(typedArrayG.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.F(typedArrayG.getBoolean(15, false));
        }
        eVar.C(android.support.v4.media.session.a.j(context4, typedArrayG, 14));
        if (typedArrayG.hasValue(17)) {
            eVar.E(android.support.v4.media.session.a.h(context4, typedArrayG, 17));
        }
        eVar.D(typedArrayG.getDimension(16, -1.0f));
        eVar.N(typedArrayG.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.N(typedArrayG.getBoolean(26, false));
        }
        eVar.I(android.support.v4.media.session.a.j(context4, typedArrayG, 25));
        eVar.M(android.support.v4.media.session.a.h(context4, typedArrayG, 30));
        eVar.K(typedArrayG.getDimension(28, 0.0f));
        eVar.x(typedArrayG.getBoolean(6, false));
        eVar.A(typedArrayG.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.A(typedArrayG.getBoolean(8, false));
        }
        eVar.y(android.support.v4.media.session.a.j(context4, typedArrayG, 7));
        if (typedArrayG.hasValue(9)) {
            eVar.z(android.support.v4.media.session.a.h(context4, typedArrayG, 9));
        }
        eVar.f7325f0 = e8.e.a(context4, typedArrayG, 39);
        eVar.f7326g0 = e8.e.a(context4, typedArrayG, 33);
        float dimension2 = typedArrayG.getDimension(21, 0.0f);
        if (eVar.f7327h0 != dimension2) {
            eVar.f7327h0 = dimension2;
            eVar.invalidateSelf();
            eVar.v();
        }
        eVar.P(typedArrayG.getDimension(35, 0.0f));
        eVar.O(typedArrayG.getDimension(34, 0.0f));
        float dimension3 = typedArrayG.getDimension(41, 0.0f);
        if (eVar.k0 != dimension3) {
            eVar.k0 = dimension3;
            eVar.invalidateSelf();
            eVar.v();
        }
        float dimension4 = typedArrayG.getDimension(40, 0.0f);
        if (eVar.f7330l0 != dimension4) {
            eVar.f7330l0 = dimension4;
            eVar.invalidateSelf();
            eVar.v();
        }
        eVar.L(typedArrayG.getDimension(29, 0.0f));
        eVar.J(typedArrayG.getDimension(27, 0.0f));
        float dimension5 = typedArrayG.getDimension(13, 0.0f);
        if (eVar.f7333o0 != dimension5) {
            eVar.f7333o0 = dimension5;
            eVar.invalidateSelf();
            eVar.v();
        }
        eVar.O0 = typedArrayG.getDimensionPixelSize(4, f.API_PRIORITY_OTHER);
        typedArrayG.recycle();
        n.a(context2, attributeSet, app.namso_gen.spacehowen.R.attr.chipStyle, app.namso_gen.spacehowen.R.style.Widget_MaterialComponents_Chip_Action);
        n.b(context2, attributeSet, iArr, app.namso_gen.spacehowen.R.attr.chipStyle, app.namso_gen.spacehowen.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, app.namso_gen.spacehowen.R.attr.chipStyle, app.namso_gen.spacehowen.R.style.Widget_MaterialComponents_Chip_Action);
        this.f2399z = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.B = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(n.d(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.j(j0.i(this));
        n.a(context2, attributeSet, app.namso_gen.spacehowen.R.attr.chipStyle, app.namso_gen.spacehowen.R.style.Widget_MaterialComponents_Chip_Action);
        n.b(context2, attributeSet, iArr, app.namso_gen.spacehowen.R.attr.chipStyle, app.namso_gen.spacehowen.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, app.namso_gen.spacehowen.R.attr.chipStyle, app.namso_gen.spacehowen.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.D = new c(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new b(this));
        }
        setChecked(this.f2395v);
        setText(eVar.P);
        setEllipsize(eVar.M0);
        g();
        if (!this.e.N0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f2399z) {
            setMinHeight(this.B);
        }
        this.A = e0.d(this);
        super.setOnCheckedChangeListener(new q2(this, 1));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.G;
        rectF.setEmpty();
        if (c() && this.f2392s != null) {
            e eVar = this.e;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.T()) {
                float f10 = eVar.f7333o0 + eVar.f7332n0 + eVar.Z + eVar.f7331m0 + eVar.f7330l0;
                if (i0.c.a(eVar) == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i10 = (int) closeIconTouchBounds.top;
        int i11 = (int) closeIconTouchBounds.right;
        int i12 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.F;
        rect.set(i, i10, i11, i12);
        return rect;
    }

    private y8.d getTextAppearance() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7340v0.f9039g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z4) {
        if (this.f2397x != z4) {
            this.f2397x = z4;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z4) {
        if (this.f2396w != z4) {
            this.f2396w = z4;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.B = i;
        if (!this.f2399z) {
            InsetDrawable insetDrawable = this.f2390f;
            if (insetDrawable == null) {
                int[] iArr = z8.a.f11521a;
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f2390f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = z8.a.f11521a;
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.e.K));
        int iMax2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f2390f;
            if (insetDrawable2 == null) {
                int[] iArr3 = z8.a.f11521a;
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f2390f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = z8.a.f11521a;
                    e();
                    return;
                }
                return;
            }
        }
        int i10 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i11 = iMax > 0 ? iMax / 2 : 0;
        if (this.f2390f != null) {
            Rect rect = new Rect();
            this.f2390f.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                int[] iArr5 = z8.a.f11521a;
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f2390f = new InsetDrawable((Drawable) this.e, i10, i11, i10, i11);
        int[] iArr6 = z8.a.f11521a;
        e();
    }

    public final boolean c() {
        e eVar = this.e;
        if (eVar == null) {
            return false;
        }
        Object obj = eVar.W;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof i0.h) {
            obj = null;
        }
        return obj != null;
    }

    public final void d() {
        e eVar;
        if (!c() || (eVar = this.e) == null || !eVar.V || this.f2392s == null) {
            v0.l(this, null);
            this.E = false;
        } else {
            v0.l(this, this.D);
            this.E = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.E) {
            return super.dispatchHoverEvent(motionEvent);
        }
        c cVar = this.D;
        AccessibilityManager accessibilityManager = cVar.h;
        int i10 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x4 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Chip chip = cVar.f7319q;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x4, y10)) {
                    i10 = 1;
                }
                int i11 = cVar.f10370m;
                if (i11 != i10) {
                    cVar.f10370m = i10;
                    cVar.q(i10, 128);
                    cVar.q(i11, 256);
                    return true;
                }
            } else if (action == 10 && (i = cVar.f10370m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    cVar.f10370m = Integer.MIN_VALUE;
                    cVar.q(Integer.MIN_VALUE, 128);
                    cVar.q(i, 256);
                    return true;
                }
            } else if (super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.E) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c cVar = this.D;
        cVar.getClass();
        boolean zM = false;
        int i10 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case zzbbs.zzt.zzm /* 21 */:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i11 = 33;
                                } else if (keyCode == 21) {
                                    i11 = 17;
                                } else if (keyCode != 22) {
                                    i11 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z4 = false;
                                while (i10 < repeatCount && cVar.m(i11, null)) {
                                    i10++;
                                    z4 = true;
                                }
                                zM = z4;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = cVar.f10369l;
                                if (i != Integer.MIN_VALUE) {
                                    chip = cVar.f7319q;
                                    if (i == 0) {
                                        chip.performClick();
                                    } else if (i == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.f2392s;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.E) {
                                            chip.D.q(1, 1);
                                        }
                                    }
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = cVar.f10369l;
                    if (i != Integer.MIN_VALUE) {
                        chip = cVar.f7319q;
                        if (i == 0) {
                            chip.performClick();
                        } else if (i == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.f2392s;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.E) {
                                chip.D.q(1, 1);
                            }
                        }
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = cVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = cVar.m(1, null);
            }
        }
        if (!zM || cVar.f10369l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i10;
        super.drawableStateChanged();
        e eVar = this.e;
        boolean zW = false;
        if (eVar != null && e.u(eVar.W)) {
            e eVar2 = this.e;
            ?? IsEnabled = isEnabled();
            if (this.f2398y) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i11 = i;
            if (this.f2397x) {
                i11 = i + 1;
            }
            int i12 = i11;
            if (this.f2396w) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.f2398y) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.f2397x) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.f2396w) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            if (!Arrays.equals(eVar2.J0, iArr)) {
                eVar2.J0 = iArr;
                if (eVar2.T()) {
                    zW = eVar2.w(eVar2.getState(), iArr);
                }
            }
        }
        if (zW) {
            invalidate();
        }
    }

    public final void e() {
        this.f2391r = new RippleDrawable(z8.a.b(this.e.O), getBackgroundDrawable(), null);
        this.e.getClass();
        RippleDrawable rippleDrawable = this.f2391r;
        WeakHashMap weakHashMap = v0.f7946a;
        d0.q(this, rippleDrawable);
        f();
    }

    public final void f() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.e) == null) {
            return;
        }
        int iR = (int) (eVar.r() + eVar.f7333o0 + eVar.f7330l0);
        e eVar2 = this.e;
        int iQ = (int) (eVar2.q() + eVar2.f7327h0 + eVar2.k0);
        if (this.f2390f != null) {
            Rect rect = new Rect();
            this.f2390f.getPadding(rect);
            iQ += rect.left;
            iR += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = v0.f7946a;
        e0.k(this, iQ, paddingTop, iR, paddingBottom);
    }

    public final void g() {
        TextPaint paint = getPaint();
        e eVar = this.e;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        y8.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.H);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.C)) {
            return this.C;
        }
        e eVar = this.e;
        if (eVar == null || !eVar.f7321b0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f2402s.f8989d) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2390f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7323d0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7324e0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.J;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.e;
        if (eVar != null) {
            return Math.max(0.0f, eVar.s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7333o0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.e;
        if (eVar == null || (drawable = eVar.R) == 0) {
            return null;
        }
        if (!(drawable instanceof i0.h)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.T;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.S;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.K;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7327h0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.M;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.N;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.e;
        if (eVar == null || (drawable = eVar.W) == 0) {
            return null;
        }
        if (!(drawable instanceof i0.h)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7320a0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7332n0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.Z;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7331m0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.Y;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.M0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.E) {
            c cVar = this.D;
            if (cVar.f10369l == 1 || cVar.f10368k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public e8.e getHideMotionSpec() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7326g0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7329j0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7328i0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.O;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.e.f1454a.f1440a;
    }

    public e8.e getShowMotionSpec() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7325f0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.f7330l0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.k0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bumptech.glide.d.A(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, J);
        }
        e eVar = this.e;
        if (eVar != null && eVar.f7321b0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i, Rect rect) {
        super.onFocusChanged(z4, i, rect);
        if (this.E) {
            c cVar = this.D;
            int i10 = cVar.f10369l;
            if (i10 != Integer.MIN_VALUE) {
                cVar.j(i10);
            }
            if (z4) {
                cVar.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        e eVar = this.e;
        int i10 = 0;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f7321b0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (!chipGroup.f9024c) {
                i = -1;
                break;
            }
            i = 0;
            while (true) {
                if (i10 >= chipGroup.getChildCount()) {
                    i = -1;
                    break;
                }
                View childAt = chipGroup.getChildAt(i10);
                if ((childAt instanceof Chip) && chipGroup.getChildAt(i10).getVisibility() == 0) {
                    if (((Chip) childAt) == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                i10++;
            }
            Object tag = getTag(app.namso_gen.spacehowen.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) r0.k.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, isChecked()).f8117a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.A != i) {
            this.A = i;
            f();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f2396w) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z4 = true;
                }
                z4 = false;
            } else {
                if (this.f2396w) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f2392s;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.E) {
                        this.D.q(1, 1);
                    }
                    z4 = true;
                }
                setCloseIconPressed(false);
            }
            z4 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z4 = true;
        } else {
            z4 = false;
        }
        return z4 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2391r) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2391r) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.p, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z4) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.x(z4);
        }
    }

    public void setCheckableResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.x(eVar.f7334p0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        e eVar = this.e;
        if (eVar == null) {
            this.f2395v = z4;
        } else if (eVar.f7321b0) {
            super.setChecked(z4);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z4) {
        setCheckedIconVisible(z4);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.y(com.bumptech.glide.d.r(eVar.f7334p0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.z(e0.k.getColorStateList(eVar.f7334p0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.A(eVar.f7334p0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.e;
        if (eVar == null || eVar.J == colorStateList) {
            return;
        }
        eVar.J = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateList;
        e eVar = this.e;
        if (eVar == null || eVar.J == (colorStateList = e0.k.getColorStateList(eVar.f7334p0, i))) {
            return;
        }
        eVar.J = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.B(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.B(eVar.f7334p0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.e;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.L0 = new WeakReference(null);
            }
            this.e = eVar;
            eVar.N0 = false;
            eVar.L0 = new WeakReference(this);
            b(this.B);
        }
    }

    public void setChipEndPadding(float f10) {
        e eVar = this.e;
        if (eVar == null || eVar.f7333o0 == f10) {
            return;
        }
        eVar.f7333o0 = f10;
        eVar.invalidateSelf();
        eVar.v();
    }

    public void setChipEndPaddingResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            float dimension = eVar.f7334p0.getResources().getDimension(i);
            if (eVar.f7333o0 != dimension) {
                eVar.f7333o0 = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z4) {
        setChipIconVisible(z4);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.C(com.bumptech.glide.d.r(eVar.f7334p0, i));
        }
    }

    public void setChipIconSize(float f10) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.D(f10);
        }
    }

    public void setChipIconSizeResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.D(eVar.f7334p0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.E(e0.k.getColorStateList(eVar.f7334p0, i));
        }
    }

    public void setChipIconVisible(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.F(eVar.f7334p0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f10) {
        e eVar = this.e;
        if (eVar == null || eVar.K == f10) {
            return;
        }
        eVar.K = f10;
        eVar.invalidateSelf();
        eVar.v();
    }

    public void setChipMinHeightResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            float dimension = eVar.f7334p0.getResources().getDimension(i);
            if (eVar.K != dimension) {
                eVar.K = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        e eVar = this.e;
        if (eVar == null || eVar.f7327h0 == f10) {
            return;
        }
        eVar.f7327h0 = f10;
        eVar.invalidateSelf();
        eVar.v();
    }

    public void setChipStartPaddingResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            float dimension = eVar.f7334p0.getResources().getDimension(i);
            if (eVar.f7327h0 != dimension) {
                eVar.f7327h0 = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.G(e0.k.getColorStateList(eVar.f7334p0, i));
        }
    }

    public void setChipStrokeWidth(float f10) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.H(f10);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.H(eVar.f7334p0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.I(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.e;
        if (eVar == null || eVar.f7320a0 == charSequence) {
            return;
        }
        String str = o0.b.f7438b;
        Locale locale = Locale.getDefault();
        int i = i.f7451a;
        o0.b bVar = o0.h.a(locale) == 1 ? o0.b.e : o0.b.f7440d;
        bVar.getClass();
        ea.e eVar2 = o0.g.f7447a;
        eVar.f7320a0 = bVar.c(charSequence);
        eVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z4) {
        setCloseIconVisible(z4);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f10) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.J(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.J(eVar.f7334p0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.I(com.bumptech.glide.d.r(eVar.f7334p0, i));
        }
        d();
    }

    public void setCloseIconSize(float f10) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.K(f10);
        }
    }

    public void setCloseIconSizeResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.K(eVar.f7334p0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.L(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.L(eVar.f7334p0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.M(e0.k.getColorStateList(eVar.f7334p0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // l.p, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // l.p, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i10, i11, i12);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        e eVar = this.e;
        if (eVar != null) {
            eVar.j(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e eVar = this.e;
        if (eVar != null) {
            eVar.M0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        this.f2399z = z4;
        b(this.B);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(e8.e eVar) {
        e eVar2 = this.e;
        if (eVar2 != null) {
            eVar2.f7326g0 = eVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.f7326g0 = e8.e.b(eVar.f7334p0, i);
        }
    }

    public void setIconEndPadding(float f10) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.O(f10);
        }
    }

    public void setIconEndPaddingResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.O(eVar.f7334p0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f10) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.P(f10);
        }
    }

    public void setIconStartPaddingResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.P(eVar.f7334p0.getResources().getDimension(i));
        }
    }

    @Override // u8.h
    public void setInternalOnCheckedChangeListener(g gVar) {
        this.f2394u = gVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        e eVar = this.e;
        if (eVar != null) {
            eVar.O0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2393t = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2392s = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.Q(colorStateList);
        }
        this.e.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.Q(e0.k.getColorStateList(eVar.f7334p0, i));
            this.e.getClass();
            e();
        }
    }

    @Override // b9.v
    public void setShapeAppearanceModel(k kVar) {
        this.e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(e8.e eVar) {
        e eVar2 = this.e;
        if (eVar2 != null) {
            eVar2.f7325f0 = eVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.f7325f0 = e8.e.b(eVar.f7334p0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z4) {
        if (!z4) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z4);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        e eVar = this.e;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(eVar.N0 ? null : charSequence, bufferType);
        e eVar2 = this.e;
        if (eVar2 == null || TextUtils.equals(eVar2.P, charSequence)) {
            return;
        }
        eVar2.P = charSequence;
        eVar2.f7340v0.e = true;
        eVar2.invalidateSelf();
        eVar2.v();
    }

    public void setTextAppearance(y8.d dVar) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.f7340v0.b(dVar, eVar.f7334p0);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f10) {
        e eVar = this.e;
        if (eVar == null || eVar.f7330l0 == f10) {
            return;
        }
        eVar.f7330l0 = f10;
        eVar.invalidateSelf();
        eVar.v();
    }

    public void setTextEndPaddingResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            float dimension = eVar.f7334p0.getResources().getDimension(i);
            if (eVar.f7330l0 != dimension) {
                eVar.f7330l0 = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f10) {
        super.setTextSize(i, f10);
        e eVar = this.e;
        if (eVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f10, getResources().getDisplayMetrics());
            l lVar = eVar.f7340v0;
            y8.d dVar = lVar.f9039g;
            if (dVar != null) {
                dVar.f10630k = fApplyDimension;
                lVar.f9034a.setTextSize(fApplyDimension);
                eVar.a();
            }
        }
        g();
    }

    public void setTextStartPadding(float f10) {
        e eVar = this.e;
        if (eVar == null || eVar.k0 == f10) {
            return;
        }
        eVar.k0 = f10;
        eVar.invalidateSelf();
        eVar.v();
    }

    public void setTextStartPaddingResource(int i) {
        e eVar = this.e;
        if (eVar != null) {
            float dimension = eVar.f7334p0.getResources().getDimension(i);
            if (eVar.k0 != dimension) {
                eVar.k0 = dimension;
                eVar.invalidateSelf();
                eVar.v();
            }
        }
    }

    public void setCloseIconVisible(boolean z4) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.N(z4);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z4) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.A(z4);
        }
    }

    public void setChipIconVisible(boolean z4) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.F(z4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        e eVar = this.e;
        if (eVar != null) {
            Context context2 = eVar.f7334p0;
            eVar.f7340v0.b(new y8.d(context2, i), context2);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        e eVar = this.e;
        if (eVar != null) {
            Context context = eVar.f7334p0;
            eVar.f7340v0.b(new y8.d(context, i), context);
        }
        g();
    }
}
