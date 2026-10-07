package com.google.android.material.button;

import a4.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import app.namso_gen.spacehowen.R;
import b9.k;
import com.google.android.material.datepicker.j;
import com.google.android.material.timepicker.f;
import i9.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k8.d;
import k8.e;
import n5.c;
import q0.d0;
import q0.e0;
import q0.v0;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f2378v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f2380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f2381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f2382d;
    public Integer[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2383f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public HashSet f2387u;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f2379a = new ArrayList();
        this.f2380b = new b(this, 18);
        this.f2381c = new LinkedHashSet();
        this.f2382d = new d(this);
        this.f2383f = false;
        this.f2387u = new HashSet();
        TypedArray typedArrayG = n.g(getContext(), attributeSet, d8.a.f3027s, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayG.getBoolean(3, false));
        this.f2386t = typedArrayG.getResourceId(1, -1);
        this.f2385s = typedArrayG.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayG.getBoolean(0, true));
        typedArrayG.recycle();
        WeakHashMap weakHashMap = v0.f7946a;
        d0.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && c(i10)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = v0.f7946a;
            materialButton.setId(e0.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f2380b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                q0.n.g(layoutParams2, 0);
                q0.n.h(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                q0.n.h(layoutParams2, 0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            q0.n.g(layoutParams3, 0);
            q0.n.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f2377z);
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f2379a.add(new e(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f1483f, shapeAppearanceModel.f1484g));
        materialButton.setEnabled(isEnabled());
        v0.l(materialButton, new j(this, 2));
    }

    public final void b(int i, boolean z4) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f2387u);
        if (z4 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f2384r && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z4 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f2385s || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f2387u;
        this.f2387u = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.f2383f = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f2383f = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.f2381c.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2382d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        e eVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                b9.j jVarE = materialButton.getShapeAppearanceModel().e();
                e eVar2 = (e) this.f2379a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z4 = getOrientation() == 0;
                    b9.a aVar = e.e;
                    if (i == firstVisibleChildIndex) {
                        eVar = z4 ? n.f(this) ? new e(aVar, aVar, eVar2.f6088b, eVar2.f6089c) : new e(eVar2.f6087a, eVar2.f6090d, aVar, aVar) : new e(eVar2.f6087a, aVar, eVar2.f6088b, aVar);
                    } else if (i != lastVisibleChildIndex) {
                        eVar2 = null;
                    } else if (z4) {
                        eVar = n.f(this) ? new e(eVar2.f6087a, eVar2.f6090d, aVar, aVar) : new e(aVar, aVar, eVar2.f6088b, eVar2.f6089c);
                    } else {
                        eVar = new e(aVar, eVar2.f6090d, aVar, eVar2.f6089c);
                    }
                    eVar2 = eVar;
                }
                if (eVar2 == null) {
                    jVarE.e = new b9.a(0.0f);
                    jVarE.f1473f = new b9.a(0.0f);
                    jVarE.f1474g = new b9.a(0.0f);
                    jVarE.h = new b9.a(0.0f);
                } else {
                    jVarE.e = eVar2.f6087a;
                    jVarE.h = eVar2.f6090d;
                    jVarE.f1473f = eVar2.f6088b;
                    jVarE.f1474g = eVar2.f6089c;
                }
                materialButton.setShapeAppearanceModel(jVarE.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f2384r || this.f2387u.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f2387u.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = ((MaterialButton) getChildAt(i)).getId();
            if (this.f2387u.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i10) {
        Integer[] numArr = this.e;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i10;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f2386t;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c.a(1, getVisibleButtonCount(), this.f2384r ? 1 : 2).f7282a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        e();
        a();
        super.onMeasure(i, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f2379a.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z4);
        }
    }

    public void setSelectionRequired(boolean z4) {
        this.f2385s = z4;
    }

    public void setSingleSelection(boolean z4) {
        if (this.f2384r != z4) {
            this.f2384r = z4;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f2384r ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
