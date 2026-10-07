package com.ismaeldivita.chipnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.protobuf.d1;
import app.namso_gen.spacehowen.R;
import com.google.android.material.datepicker.n;
import ic.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.i;
import org.xmlpull.v1.XmlPullParserException;
import pb.a;
import pb.b;
import pb.d;
import pb.f;
import pb.g;
import rb.c;
import sb.e;
import sb.h;
import vb.k;
import vb.r;
import vb.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class ChipNavigationBar extends ConstraintLayout {
    public static final /* synthetic */ int L = 0;
    public a D;
    public b E;
    public int F;
    public boolean G;
    public final qb.b H;
    public Long I;
    public int J;
    public final LinkedHashMap K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipNavigationBar(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        i.e(context, "context");
        this.J = -1;
        this.K = new LinkedHashMap();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f7840b);
        i.d(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…leable.ChipNavigationBar)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(7, -1);
        float dimension = typedArrayObtainStyledAttributes.getDimension(8, 0.0f);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(2, false);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        int i = typedArrayObtainStyledAttributes.getInt(9, 0);
        a aVar = a.f7834a;
        if (i != 0 && i == 1) {
            aVar = a.f7835b;
        }
        int i10 = typedArrayObtainStyledAttributes.getInt(4, -1);
        Integer numValueOf = i10 < 0 ? null : Integer.valueOf(i10);
        this.I = numValueOf != null ? Long.valueOf(numValueOf.intValue()) : null;
        this.H = new qb.b(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setMenuOrientation(aVar);
        if (resourceId >= 0) {
            setMenuResource(resourceId);
        }
        setMinimumExpandedWidth((int) dimension);
        final c cVar = new c(z4, z10, z11, z12);
        final rb.a aVar2 = new rb.a(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: rb.b
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                i.d(view, "v");
                i.d(windowInsets, "insets");
                cVar.b(view, windowInsets, aVar2);
                return windowInsets;
            }
        });
        if (isAttachedToWindow()) {
            requestApplyInsets();
        } else {
            addOnAttachStateChangeListener(new rb.d(0));
        }
        m();
        setClickable(true);
    }

    private final Flow getHorizontalFlow() {
        Flow flow = new Flow(getContext());
        flow.setOrientation(0);
        flow.setHorizontalStyle(0);
        flow.setHorizontalAlign(0);
        flow.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return flow;
    }

    private final View getSelectedItem() {
        Object next;
        jc.a aVar = new jc.a(this, 2);
        while (aVar.hasNext()) {
            next = aVar.next();
            if (((View) next).isSelected()) {
                return (View) next;
            }
        }
        next = null;
        return (View) next;
    }

    private final Flow getVerticalFlow() {
        Flow flow = new Flow(getContext());
        flow.setOrientation(1);
        flow.setHorizontalAlign(0);
        flow.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return flow;
    }

    public final int getSelectedItemId() {
        View selectedItem = getSelectedItem();
        if (selectedItem == null) {
            return -1;
        }
        return selectedItem.getId();
    }

    public final void m() {
        this.G = false;
        a aVar = this.D;
        if (aVar == null) {
            i.i("orientationMode");
            throw null;
        }
        if (aVar == a.f7835b) {
            int childCount = getChildCount();
            int i = 0;
            while (i < childCount) {
                int i10 = i + 1;
                View childAt = getChildAt(i);
                i.d(childAt, "getChildAt(i)");
                childAt.setMinimumWidth(0);
                h hVar = childAt instanceof h ? (h) childAt : null;
                if (hVar != null) {
                    hVar.c();
                }
                i = i10;
            }
        }
    }

    public final e n(int i) {
        Object next;
        oc.c cVar = new oc.c(new oc.d(new oc.d(this, 3), 0));
        while (cVar.hasNext()) {
            next = cVar.next();
            if (((e) next).getId() == i) {
                return (e) next;
            }
        }
        next = null;
        return (e) next;
    }

    public final void o(int i, boolean z4) {
        b bVar;
        View selectedItem = getSelectedItem();
        if (selectedItem != null && selectedItem.getId() == i) {
            return;
        }
        if (selectedItem != null) {
            selectedItem.setSelected(false);
        }
        e eVarN = n(i);
        if (eVarN == null) {
            return;
        }
        AutoTransition autoTransition = new AutoTransition();
        Long l2 = this.I;
        if (l2 != null) {
            autoTransition.setDuration(l2.longValue());
        }
        TransitionManager.beginDelayedTransition(this, autoTransition);
        eVarN.setSelected(true);
        if (!z4 || (bVar = this.E) == null) {
            return;
        }
        ((l) ((a4.b) bVar).f113b).invoke(Integer.valueOf(i));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws XmlPullParserException, IOException {
        ArrayList parcelableArrayList;
        Map linkedHashMap;
        e eVarN;
        ArrayList parcelableArrayList2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        Bundle bundle = gVar.f7845a;
        super.onRestoreInstanceState(gVar.getSuperState());
        if ((bundle == null ? -1 : bundle.getInt("menuId")) != -1) {
            setMenuResource(bundle == null ? -1 : bundle.getInt("menuId"));
        }
        int i = 0;
        if ((bundle == null ? -1 : bundle.getInt("selectedItem")) != -1) {
            o(bundle != null ? bundle.getInt("selectedItem") : -1, false);
        }
        LinkedHashMap linkedHashMap2 = null;
        if (bundle == null ? false : bundle.getBoolean("expanded")) {
            this.G = true;
            a aVar = this.D;
            if (aVar == null) {
                i.i("orientationMode");
                throw null;
            }
            if (aVar == a.f7835b) {
                int childCount = getChildCount();
                int i10 = 0;
                while (i10 < childCount) {
                    int i11 = i10 + 1;
                    View childAt = getChildAt(i10);
                    i.d(childAt, "getChildAt(i)");
                    childAt.setMinimumWidth(this.F);
                    h hVar = childAt instanceof h ? (h) childAt : null;
                    if (hVar != null) {
                        hVar.d();
                    }
                    i10 = i11;
                }
            }
        } else {
            m();
        }
        if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("badges")) == null) {
            linkedHashMap = null;
        } else {
            int iA = t.A(k.U(parcelableArrayList));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            int size = parcelableArrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = parcelableArrayList.get(i12);
                i12++;
                pb.e eVar = (pb.e) obj;
                linkedHashMap.put(Integer.valueOf(eVar.f7841a), Integer.valueOf(eVar.f7842b));
            }
        }
        Map map = r.f9298a;
        if (linkedHashMap == null) {
            linkedHashMap = map;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            LinkedHashMap linkedHashMap3 = this.K;
            if (iIntValue2 > 0) {
                linkedHashMap3.put(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                e eVarN2 = n(iIntValue);
                if (eVarN2 != null) {
                    eVarN2.b(iIntValue2);
                }
            } else {
                linkedHashMap3.put(Integer.valueOf(iIntValue), 0);
                e eVarN3 = n(iIntValue);
                if (eVarN3 != null) {
                    int i13 = e.f8473a;
                    eVarN3.b(0);
                }
            }
        }
        if (bundle != null && (parcelableArrayList2 = bundle.getParcelableArrayList("enabled")) != null) {
            int iA2 = t.A(k.U(parcelableArrayList2));
            linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
            int size2 = parcelableArrayList2.size();
            while (i < size2) {
                Object obj2 = parcelableArrayList2.get(i);
                i++;
                f fVar = (f) obj2;
                linkedHashMap2.put(Integer.valueOf(fVar.f7843a), Boolean.valueOf(fVar.f7844b));
            }
        }
        if (linkedHashMap2 != null) {
            map = linkedHashMap2;
        }
        for (Map.Entry entry2 : map.entrySet()) {
            int iIntValue3 = ((Number) entry2.getKey()).intValue();
            boolean zBooleanValue = ((Boolean) entry2.getValue()).booleanValue();
            if (!zBooleanValue && (eVarN = n(iIntValue3)) != null) {
                eVarN.setEnabled(zBooleanValue);
            }
        }
        if ((bundle == null ? -1L : bundle.getLong("animationDuration")) >= 0) {
            setDuration(bundle != null ? bundle.getLong("animationDuration") : -1L);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        g gVar = new g(parcelableOnSaveInstanceState);
        gVar.f7845a = bundle;
        bundle.putInt("menuId", this.J);
        bundle.putInt("selectedItem", getSelectedItemId());
        LinkedHashMap linkedHashMap = this.K;
        i.e(linkedHashMap, "value");
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new pb.e(((Number) entry.getKey()).intValue(), ((Number) entry.getValue()).intValue()));
        }
        Bundle bundle2 = gVar.f7845a;
        if (bundle2 != null) {
            bundle2.putParcelableArrayList("badges", new ArrayList<>(arrayList));
        }
        boolean z4 = this.G;
        Bundle bundle3 = gVar.f7845a;
        if (bundle3 != null) {
            bundle3.putBoolean("expanded", z4);
        }
        Map linkedHashMap2 = new LinkedHashMap();
        jc.a aVar = new jc.a(this, 2);
        while (aVar.hasNext()) {
            View view = (View) aVar.next();
            i.e(view, "it");
            ub.f fVar = new ub.f(Integer.valueOf(view.getId()), Boolean.valueOf(view.isEnabled()));
            linkedHashMap2.put(fVar.f9065a, fVar.f9066b);
        }
        int size = linkedHashMap2.size();
        if (size == 0) {
            linkedHashMap2 = r.f9298a;
        } else if (size == 1) {
            linkedHashMap2 = t.E(linkedHashMap2);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            arrayList2.add(new f(((Number) entry2.getKey()).intValue(), ((Boolean) entry2.getValue()).booleanValue()));
        }
        Bundle bundle4 = gVar.f7845a;
        if (bundle4 != null) {
            bundle4.putParcelableArrayList("enabled", new ArrayList<>(arrayList2));
        }
        Long l2 = this.I;
        long jLongValue = l2 == null ? -1L : l2.longValue();
        Bundle bundle5 = gVar.f7845a;
        if (bundle5 == null) {
            return gVar;
        }
        bundle5.putLong("animationDuration", jLongValue);
        return gVar;
    }

    public final void setDuration(long j4) {
        this.I = Long.valueOf(j4);
    }

    public final void setMenuOrientation(a aVar) {
        i.e(aVar, "menuOrientation");
        this.D = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void setMenuResource(int i) throws XmlPullParserException, IOException {
        ?? r10;
        String str;
        int i10;
        Flow horizontalFlow;
        e dVar;
        XmlResourceParser xmlResourceParser;
        Context context;
        AttributeSet attributeSet;
        ArrayList arrayList;
        String str2;
        int i11;
        int i12;
        PorterDuff.Mode mode;
        this.J = i;
        Context context2 = getContext();
        i.d(context2, "context");
        qb.b bVar = this.H;
        i.e(bVar, "menuStyle");
        XmlResourceParser layout = context2.getResources().getLayout(i);
        i.d(layout, "context.resources.getLayout(menuRes)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
        int eventType = layout.getEventType();
        do {
            r10 = 1;
            str = "menu";
            i10 = 2;
            if (eventType == 2) {
                String name = layout.getName();
                if (!i.a(name, "menu")) {
                    throw new IllegalArgumentException(i.h(name, "Expecting menu, got ").toString());
                }
                break;
            }
            eventType = layout.next();
        } while (eventType != 1);
        i.d(attributeSetAsAttributeSet, "attrs");
        ArrayList arrayList2 = new ArrayList();
        int eventType2 = layout.getEventType();
        int i13 = 0;
        boolean z4 = false;
        while (!z4) {
            String name2 = layout.getName();
            if (eventType2 == i10 && i.a(name2, "item")) {
                TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSetAsAttributeSet, d.f7839a);
                i.d(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…R.styleable.ChipMenuItem)");
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(i10, i13);
                String str3 = str;
                CharSequence text = typedArrayObtainStyledAttributes.getText(3);
                CharSequence text2 = typedArrayObtainStyledAttributes.getText(4);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(i13, i13);
                i12 = i13;
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(r10, r10);
                int color = typedArrayObtainStyledAttributes.getColor(6, jd.d.z(context2, R.attr.colorAccent));
                int i14 = typedArrayObtainStyledAttributes.getInt(7, -1);
                xmlResourceParser = layout;
                if (i14 == 3) {
                    mode = PorterDuff.Mode.SRC_OVER;
                } else if (i14 == 5) {
                    mode = PorterDuff.Mode.SRC_IN;
                } else if (i14 != 9) {
                    switch (i14) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 15:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.ADD;
                            break;
                        default:
                            mode = null;
                            break;
                    }
                } else {
                    mode = PorterDuff.Mode.SRC_ATOP;
                }
                int color2 = typedArrayObtainStyledAttributes.getColor(8, typedArrayObtainStyledAttributes.getColor(6, jd.d.z(context2, R.attr.colorAccent)));
                PorterDuff.Mode mode2 = mode;
                int color3 = typedArrayObtainStyledAttributes.getColor(6, jd.d.z(context2, R.attr.colorAccent));
                context = context2;
                attributeSet = attributeSetAsAttributeSet;
                int color4 = typedArrayObtainStyledAttributes.getColor(5, Color.argb((int) (((double) Color.alpha(color3)) * 0.15d), Color.red(color3), Color.green(color3), Color.blue(color3)));
                arrayList = arrayList2;
                i.d(text, "getText(R.styleable.ChipMenuItem_android_title)");
                str2 = str3;
                i11 = 2;
                qb.a aVar = new qb.a(resourceId, text, text2, resourceId2, z10, mode2, color, color2, color4, bVar);
                typedArrayObtainStyledAttributes.recycle();
                arrayList.add(aVar);
            } else {
                xmlResourceParser = layout;
                context = context2;
                attributeSet = attributeSetAsAttributeSet;
                arrayList = arrayList2;
                str2 = str;
                i11 = i10;
                i12 = i13;
                if (eventType2 == 3 && i.a(name2, str2)) {
                    z4 = true;
                } else if (eventType2 == 1) {
                    throw new RuntimeException("Unexpected end of document");
                }
            }
            eventType2 = xmlResourceParser.next();
            str = str2;
            arrayList2 = arrayList;
            i10 = i11;
            i13 = i12;
            context2 = context;
            layout = xmlResourceParser;
            attributeSetAsAttributeSet = attributeSet;
            r10 = 1;
        }
        ArrayList arrayList3 = arrayList2;
        int i15 = i13;
        pb.c cVar = new pb.c(this, 0);
        removeAllViews();
        int size = arrayList3.size();
        while (i13 < size) {
            Object obj = arrayList3.get(i13);
            i13++;
            qb.a aVar2 = (qb.a) obj;
            a aVar3 = this.D;
            if (aVar3 == null) {
                i.i("orientationMode");
                throw null;
            }
            int iOrdinal = aVar3.ordinal();
            if (iOrdinal == 0) {
                Context context3 = getContext();
                i.d(context3, "context");
                dVar = new sb.d(context3);
            } else {
                if (iOrdinal != 1) {
                    throw new d1();
                }
                Context context4 = getContext();
                i.d(context4, "context");
                dVar = new h(context4);
            }
            dVar.a(aVar2);
            dVar.setOnClickListener(new n(cVar, 13));
            addView(dVar);
        }
        a aVar4 = this.D;
        if (aVar4 == null) {
            i.i("orientationMode");
            throw null;
        }
        int iOrdinal2 = aVar4.ordinal();
        if (iOrdinal2 == 0) {
            horizontalFlow = getHorizontalFlow();
        } else {
            if (iOrdinal2 != 1) {
                throw new d1();
            }
            horizontalFlow = getVerticalFlow();
        }
        ArrayList arrayList4 = new ArrayList(k.U(arrayList3));
        int size2 = arrayList3.size();
        int i16 = i15;
        while (i16 < size2) {
            Object obj2 = arrayList3.get(i16);
            i16++;
            arrayList4.add(Integer.valueOf(((qb.a) obj2).f8045a));
        }
        horizontalFlow.setReferencedIds(vb.i.m0(arrayList4));
        addView(horizontalFlow);
    }

    public final void setMinimumExpandedWidth(int i) {
        this.F = i;
    }

    public final void setOnItemSelectedListener(b bVar) {
        i.e(bVar, "listener");
        this.E = bVar;
    }

    public final void setOnItemSelectedListener(l lVar) {
        i.e(lVar, "block");
        setOnItemSelectedListener(new a4.b(lVar, 26));
    }
}
