package b9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f1478m = new h(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.bumptech.glide.c f1479a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.bumptech.glide.c f1480b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.c f1481c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.c f1482d = new i();
    public c e = new a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f1483f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f1484g = new a(0.0f);
    public c h = new a(0.0f);
    public e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f1485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f1486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f1487l;

    public k() {
        int i = 0;
        this.i = new e(i);
        this.f1485j = new e(i);
        this.f1486k = new e(i);
        this.f1487l = new e(i);
    }

    public static j a(Context context, int i, int i10, c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i10 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i10);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(d8.a.D);
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i12 = typedArrayObtainStyledAttributes.getInt(3, i11);
            int i13 = typedArrayObtainStyledAttributes.getInt(4, i11);
            int i14 = typedArrayObtainStyledAttributes.getInt(2, i11);
            int i15 = typedArrayObtainStyledAttributes.getInt(1, i11);
            c cVarC = c(typedArrayObtainStyledAttributes, 5, cVar);
            c cVarC2 = c(typedArrayObtainStyledAttributes, 8, cVarC);
            c cVarC3 = c(typedArrayObtainStyledAttributes, 9, cVarC);
            c cVarC4 = c(typedArrayObtainStyledAttributes, 7, cVarC);
            c cVarC5 = c(typedArrayObtainStyledAttributes, 6, cVarC);
            j jVar = new j();
            jVar.f1469a = com.bumptech.glide.d.f(i12);
            jVar.e = cVarC2;
            jVar.f1470b = com.bumptech.glide.d.f(i13);
            jVar.f1473f = cVarC3;
            jVar.f1471c = com.bumptech.glide.d.f(i14);
            jVar.f1474g = cVarC4;
            jVar.f1472d = com.bumptech.glide.d.f(i15);
            jVar.h = cVarC5;
            return jVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i10) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d8.a.f3032x, i, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i10 = typedValuePeekValue.type;
            if (i10 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i10 == 6) {
                return new h(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z4 = this.f1487l.getClass().equals(e.class) && this.f1485j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f1486k.getClass().equals(e.class);
        float fA = this.e.a(rectF);
        return z4 && ((this.f1483f.a(rectF) > fA ? 1 : (this.f1483f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f1484g.a(rectF) > fA ? 1 : (this.f1484g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f1480b instanceof i) && (this.f1479a instanceof i) && (this.f1481c instanceof i) && (this.f1482d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f1469a = this.f1479a;
        jVar.f1470b = this.f1480b;
        jVar.f1471c = this.f1481c;
        jVar.f1472d = this.f1482d;
        jVar.e = this.e;
        jVar.f1473f = this.f1483f;
        jVar.f1474g = this.f1484g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f1475j = this.f1485j;
        jVar.f1476k = this.f1486k;
        jVar.f1477l = this.f1487l;
        return jVar;
    }
}
