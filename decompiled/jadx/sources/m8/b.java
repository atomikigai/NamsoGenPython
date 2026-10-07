package m8;

import a2.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import app.namso_gen.spacehowen.R;
import com.bumptech.glide.d;
import g0.i;
import g0.n;
import g6.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.p;
import n2.e;
import w8.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p {
    public static final int[] J = {R.attr.state_indeterminate};
    public static final int[] K = {R.attr.state_error};
    public static final int[][] L = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int M = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public ColorStateList A;
    public PorterDuff.Mode B;
    public int C;
    public int[] D;
    public boolean E;
    public CharSequence F;
    public CompoundButton.OnCheckedChangeListener G;
    public final e H;
    public final c I;
    public final LinkedHashSet e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f7073f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f7074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7076t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7077u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f7078v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f7079w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f7080x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7081y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f7082z;

    public b(Context context, AttributeSet attributeSet) {
        super(i9.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.e = new LinkedHashSet();
        this.f7073f = new LinkedHashSet();
        Context context2 = getContext();
        e eVar = new e(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = n.f4149a;
        Drawable drawableA = i.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        eVar.f7177a = drawableA;
        drawableA.setCallback(eVar.f7176f);
        new h4.b(eVar.f7177a.getConstantState(), 1);
        this.H = eVar;
        this.I = new c(this, 2);
        Context context3 = getContext();
        this.f7079w = u0.c.a(this);
        this.f7082z = getSuperButtonTintList();
        setSupportButtonTintList(null);
        u8.n.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = d8.a.f3030v;
        u8.n.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        l lVar = new l(context3, typedArrayObtainStyledAttributes);
        this.f7080x = lVar.u(2);
        if (this.f7079w != null && a.a.m(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == M && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f7079w = d.r(context3, R.drawable.mtrl_checkbox_button);
                this.f7081y = true;
                if (this.f7080x == null) {
                    this.f7080x = d.r(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.A = android.support.v4.media.session.a.g(context3, lVar, 3);
        this.B = u8.n.h(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f7075s = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f7076t = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f7077u = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f7078v = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        lVar.I();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.C;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7074r == null) {
            int iQ = com.bumptech.glide.c.q(this, R.attr.colorControlActivated);
            int iQ2 = com.bumptech.glide.c.q(this, R.attr.colorError);
            int iQ3 = com.bumptech.glide.c.q(this, R.attr.colorSurface);
            int iQ4 = com.bumptech.glide.c.q(this, R.attr.colorOnSurface);
            this.f7074r = new ColorStateList(L, new int[]{com.bumptech.glide.c.x(1.0f, iQ3, iQ2), com.bumptech.glide.c.x(1.0f, iQ3, iQ), com.bumptech.glide.c.x(0.54f, iQ3, iQ4), com.bumptech.glide.c.x(0.38f, iQ3, iQ4), com.bumptech.glide.c.x(0.38f, iQ3, iQ4)});
        }
        return this.f7074r;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f7082z;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        m mVar;
        Drawable drawableMutate = this.f7079w;
        ColorStateList colorStateList3 = this.f7082z;
        PorterDuff.Mode modeB = u0.b.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                i0.b.i(drawableMutate, modeB);
            }
        }
        this.f7079w = drawableMutate;
        Drawable drawableMutate2 = this.f7080x;
        ColorStateList colorStateList4 = this.A;
        PorterDuff.Mode mode = this.B;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                i0.b.i(drawableMutate2, mode);
            }
        }
        this.f7080x = drawableMutate2;
        if (this.f7081y) {
            e eVar = this.H;
            if (eVar != null) {
                n2.d dVar = eVar.f7173b;
                Drawable drawable = eVar.f7177a;
                c cVar = this.I;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (cVar.f9729a == null) {
                        cVar.f9729a = new n2.b(cVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(cVar.f9729a);
                }
                ArrayList arrayList = eVar.e;
                if (arrayList != null && cVar != null) {
                    arrayList.remove(cVar);
                    if (eVar.e.size() == 0 && (mVar = eVar.f7175d) != null) {
                        dVar.f7170b.removeListener(mVar);
                        eVar.f7175d = null;
                    }
                }
                Drawable drawable2 = eVar.f7177a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (cVar.f9729a == null) {
                        cVar.f9729a = new n2.b(cVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(cVar.f9729a);
                } else if (cVar != null) {
                    if (eVar.e == null) {
                        eVar.e = new ArrayList();
                    }
                    if (!eVar.e.contains(cVar)) {
                        eVar.e.add(cVar);
                        if (eVar.f7175d == null) {
                            eVar.f7175d = new m(eVar, 6);
                        }
                        dVar.f7170b.addListener(eVar.f7175d);
                    }
                }
            }
            Drawable drawable3 = this.f7079w;
            if ((drawable3 instanceof AnimatedStateListDrawable) && eVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, eVar, false);
                ((AnimatedStateListDrawable) this.f7079w).addTransition(R.id.indeterminate, R.id.unchecked, eVar, false);
            }
        }
        Drawable drawable4 = this.f7079w;
        if (drawable4 != null && (colorStateList2 = this.f7082z) != null) {
            i0.b.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f7080x;
        if (drawable5 != null && (colorStateList = this.A) != null) {
            i0.b.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f7079w;
        Drawable drawable7 = this.f7080x;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f10 = intrinsicWidth / intrinsicHeight;
                if (f10 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f10);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f10 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f7079w;
    }

    public Drawable getButtonIconDrawable() {
        return this.f7080x;
    }

    public ColorStateList getButtonIconTintList() {
        return this.A;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.B;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f7082z;
    }

    public int getCheckedState() {
        return this.C;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f7078v;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.C == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7075s && this.f7082z == null && this.A == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, J);
        }
        if (this.f7077u) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K);
        }
        for (int i10 = 0; i10 < iArrOnCreateDrawableState.length; i10++) {
            int i11 = iArrOnCreateDrawableState[i10];
            if (i11 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i11 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i10] = 16842912;
            }
            this.D = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.D = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f7076t || !TextUtils.isEmpty(getText()) || (drawableA = u0.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (u8.n.f(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            i0.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f7077u) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f7078v));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCheckedState(aVar.f7072a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f7072a = getCheckedState();
        return aVar;
    }

    @Override // l.p, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(d.r(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f7080x = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(d.r(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.A == colorStateList) {
            return;
        }
        this.A = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.B == mode) {
            return;
        }
        this.B = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f7082z == colorStateList) {
            return;
        }
        this.f7082z = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z4) {
        this.f7076t = z4;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        setCheckedState(z4 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.C != i) {
            this.C = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && this.F == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.E) {
                return;
            }
            this.E = true;
            LinkedHashSet linkedHashSet = this.f7073f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw q1.a.g(it);
                }
            }
            if (this.C != 2 && (onCheckedChangeListener = this.G) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i10 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.E = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f7078v = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z4) {
        if (this.f7077u == z4) {
            return;
        }
        this.f7077u = z4;
        refreshDrawableState();
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.G = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.F = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f7075s = z4;
        if (z4) {
            u0.b.c(this, getMaterialThemeColorsTintList());
        } else {
            u0.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // l.p, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f7079w = drawable;
        this.f7081y = false;
        a();
    }
}
