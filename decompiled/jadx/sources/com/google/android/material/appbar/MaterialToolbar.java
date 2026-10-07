package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import app.namso_gen.spacehowen.R;
import b0.h;
import b9.g;
import com.bumptech.glide.d;
import i0.b;
import i9.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import k.l;
import q0.d0;
import q0.j0;
import q0.v0;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] k0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Integer f2323f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f2324g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f2325h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ImageView.ScaleType f2326i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Boolean f2327j0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayG = n.g(context2, attributeSet, d8.a.A, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayG.hasValue(2)) {
            setNavigationIconTint(typedArrayG.getColor(2, -1));
        }
        this.f2324g0 = typedArrayG.getBoolean(4, false);
        this.f2325h0 = typedArrayG.getBoolean(3, false);
        int i = typedArrayG.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = k0;
            if (i < scaleTypeArr.length) {
                this.f2326i0 = scaleTypeArr[i];
            }
        }
        if (typedArrayG.hasValue(0)) {
            this.f2327j0 = Boolean.valueOf(typedArrayG.getBoolean(0, false));
        }
        typedArrayG.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : q8.a.a(background);
        if (colorStateListValueOf != null) {
            g gVar = new g();
            gVar.k(colorStateListValueOf);
            gVar.i(context2);
            WeakHashMap weakHashMap = v0.f7946a;
            gVar.j(j0.i(this));
            d0.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2326i0;
    }

    public Integer getNavigationIconTint() {
        return this.f2323f0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z4 = menu instanceof l;
        if (z4) {
            ((l) menu).w();
        }
        super.m(i);
        if (z4) {
            ((l) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            d.A(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z4, i, i10, i11, i12);
        h hVar = n.f9042c;
        ImageView imageView2 = null;
        if (this.f2324g0 || this.f2325h0) {
            ArrayList arrayListE = n.e(this, getTitle());
            TextView textView = arrayListE.isEmpty() ? null : (TextView) Collections.min(arrayListE, hVar);
            ArrayList arrayListE2 = n.e(this, getSubtitle());
            TextView textView2 = arrayListE2.isEmpty() ? null : (TextView) Collections.max(arrayListE2, hVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i13 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i13 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i13 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f2324g0 && textView != null) {
                    v(textView, pair);
                }
                if (this.f2325h0 && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                View childAt2 = getChildAt(i15);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f2327j0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2326i0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).j(f10);
        }
    }

    public void setLogoAdjustViewBounds(boolean z4) {
        Boolean bool = this.f2327j0;
        if (bool == null || bool.booleanValue() != z4) {
            this.f2327j0 = Boolean.valueOf(z4);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2326i0 != scaleType) {
            this.f2326i0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f2323f0 != null) {
            drawable = drawable.mutate();
            b.g(drawable, this.f2323f0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f2323f0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z4) {
        if (this.f2325h0 != z4) {
            this.f2325h0 = z4;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z4) {
        if (this.f2324g0 != z4) {
            this.f2324g0 = z4;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i10 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i10 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i10, textView.getBottom());
    }
}
