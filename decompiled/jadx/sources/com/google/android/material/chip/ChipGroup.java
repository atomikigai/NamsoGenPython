package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import app.namso_gen.spacehowen.R;
import h6.o0;
import ib.c;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import n8.f;
import n8.g;
import n8.h;
import n8.i;
import q0.d0;
import q0.v0;
import u8.a;
import u8.e;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends e {
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2400f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f2401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f2402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i f2404u;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        Context contextA = i9.a.a(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextA, attributeSet, R.attr.chipGroupStyle);
        this.f9024c = false;
        TypedArray typedArrayObtainStyledAttributes = contextA.getTheme().obtainStyledAttributes(attributeSet, d8.a.f3021m, 0, 0);
        this.f9022a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f9023b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        a aVar = new a();
        this.f2402s = aVar;
        i iVar = new i(this);
        this.f2404u = iVar;
        TypedArray typedArrayG = n.g(getContext(), attributeSet, d8.a.f3016f, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayG.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayG.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayG.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayG.getBoolean(5, false));
        setSingleSelection(typedArrayG.getBoolean(6, false));
        setSelectionRequired(typedArrayG.getBoolean(4, false));
        this.f2403t = typedArrayG.getResourceId(0, -1);
        typedArrayG.recycle();
        aVar.f8988c = new c(this, 26);
        super.setOnHierarchyChangeListener(iVar);
        WeakHashMap weakHashMap = v0.f7946a;
        d0.s(this, 1);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof Chip) && getChildAt(i10).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof f);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f2402s.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f2402s.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.e;
    }

    public int getChipSpacingVertical() {
        return this.f2400f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f2403t;
        if (i != -1) {
            a aVar = this.f2402s;
            u8.h hVar = (u8.h) aVar.f8986a.get(Integer.valueOf(i));
            if (hVar != null && aVar.a(hVar)) {
                aVar.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) n5.c.a(getRowCount(), this.f9024c ? getVisibleChipCount() : -1, this.f2402s.f8989d ? 1 : 2).f7282a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.e != i) {
            this.e = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f2400f != i) {
            this.f2400f = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(g gVar) {
        if (gVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new o0(this, gVar, 14, false));
        }
    }

    public void setOnCheckedStateChangeListener(h hVar) {
        this.f2401r = hVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2404u.f7345a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z4) {
        this.f2402s.e = z4;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // u8.e
    public void setSingleLine(boolean z4) {
        super.setSingleLine(z4);
    }

    public void setSingleSelection(boolean z4) {
        a aVar = this.f2402s;
        if (aVar.f8989d != z4) {
            aVar.f8989d = z4;
            boolean zIsEmpty = aVar.f8987b.isEmpty();
            Iterator it = aVar.f8986a.values().iterator();
            while (it.hasNext()) {
                aVar.e((u8.h) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            aVar.d();
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
