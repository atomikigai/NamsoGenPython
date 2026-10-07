package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.webkit.TracingConfig;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbbs;
import f7.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import s5.j;
import w.a;
import w.e;
import w.g;
import w.h;
import x.i;
import x.k;
import x.o;
import z.b;
import z.c;
import z.d;
import z.m;
import z.n;
import z.q;
import z.r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static r C;
    public int A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f554d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f555f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f558t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m f559u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f560v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap f562x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SparseArray f563y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final z.e f564z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f551a = new SparseArray();
        this.f552b = new ArrayList(4);
        this.f553c = new e();
        this.f554d = 0;
        this.e = 0;
        this.f555f = f.API_PRIORITY_OTHER;
        this.f556r = f.API_PRIORITY_OTHER;
        this.f557s = true;
        this.f558t = 257;
        this.f559u = null;
        this.f560v = null;
        this.f561w = -1;
        this.f562x = new HashMap();
        this.f563y = new SparseArray();
        this.f564z = new z.e(this, this);
        this.A = 0;
        this.B = 0;
        i(attributeSet, 0);
    }

    public static d g() {
        d dVar = new d(-2, -2);
        dVar.f10725a = -1;
        dVar.f10727b = -1;
        dVar.f10729c = -1.0f;
        dVar.f10731d = true;
        dVar.e = -1;
        dVar.f10734f = -1;
        dVar.f10736g = -1;
        dVar.h = -1;
        dVar.i = -1;
        dVar.f10740j = -1;
        dVar.f10742k = -1;
        dVar.f10743l = -1;
        dVar.f10745m = -1;
        dVar.f10747n = -1;
        dVar.f10749o = -1;
        dVar.f10751p = -1;
        dVar.f10753q = 0;
        dVar.f10754r = 0.0f;
        dVar.f10755s = -1;
        dVar.f10756t = -1;
        dVar.f10757u = -1;
        dVar.f10758v = -1;
        dVar.f10759w = Integer.MIN_VALUE;
        dVar.f10760x = Integer.MIN_VALUE;
        dVar.f10761y = Integer.MIN_VALUE;
        dVar.f10762z = Integer.MIN_VALUE;
        dVar.A = Integer.MIN_VALUE;
        dVar.B = Integer.MIN_VALUE;
        dVar.C = Integer.MIN_VALUE;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f10726a0 = true;
        dVar.f10728b0 = true;
        dVar.f10730c0 = false;
        dVar.f10732d0 = false;
        dVar.f10733e0 = false;
        dVar.f10735f0 = -1;
        dVar.f10737g0 = -1;
        dVar.f10738h0 = -1;
        dVar.f10739i0 = -1;
        dVar.f10741j0 = Integer.MIN_VALUE;
        dVar.k0 = Integer.MIN_VALUE;
        dVar.f10744l0 = 0.5f;
        dVar.f10752p0 = new w.d();
        return dVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static r getSharedValues() {
        if (C == null) {
            r rVar = new r();
            new SparseIntArray();
            new HashMap();
            C = rVar;
        }
        return C;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f552b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((b) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        int i13 = Integer.parseInt(strArrSplit[2]);
                        int i14 = (int) ((i11 / 1080.0f) * width);
                        int i15 = (int) ((i12 / 1920.0f) * height);
                        int i16 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i14;
                        float f11 = i15;
                        float f12 = i14 + ((int) ((i13 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i15 + i16;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f557s = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f10725a = -1;
        dVar.f10727b = -1;
        dVar.f10729c = -1.0f;
        dVar.f10731d = true;
        dVar.e = -1;
        dVar.f10734f = -1;
        dVar.f10736g = -1;
        dVar.h = -1;
        dVar.i = -1;
        dVar.f10740j = -1;
        dVar.f10742k = -1;
        dVar.f10743l = -1;
        dVar.f10745m = -1;
        dVar.f10747n = -1;
        dVar.f10749o = -1;
        dVar.f10751p = -1;
        dVar.f10753q = 0;
        dVar.f10754r = 0.0f;
        dVar.f10755s = -1;
        dVar.f10756t = -1;
        dVar.f10757u = -1;
        dVar.f10758v = -1;
        dVar.f10759w = Integer.MIN_VALUE;
        dVar.f10760x = Integer.MIN_VALUE;
        dVar.f10761y = Integer.MIN_VALUE;
        dVar.f10762z = Integer.MIN_VALUE;
        dVar.A = Integer.MIN_VALUE;
        dVar.B = Integer.MIN_VALUE;
        dVar.C = Integer.MIN_VALUE;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f10726a0 = true;
        dVar.f10728b0 = true;
        dVar.f10730c0 = false;
        dVar.f10732d0 = false;
        dVar.f10733e0 = false;
        dVar.f10735f0 = -1;
        dVar.f10737g0 = -1;
        dVar.f10738h0 = -1;
        dVar.f10739i0 = -1;
        dVar.f10741j0 = Integer.MIN_VALUE;
        dVar.k0 = Integer.MIN_VALUE;
        dVar.f10744l0 = 0.5f;
        dVar.f10752p0 = new w.d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f10854b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i10 = c.f10724a.get(index);
            switch (i10) {
                case 1:
                    dVar.V = typedArrayObtainStyledAttributes.getInt(index, dVar.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10751p);
                    dVar.f10751p = resourceId;
                    if (resourceId == -1) {
                        dVar.f10751p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    dVar.f10753q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f10753q);
                    break;
                case 4:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, dVar.f10754r) % 360.0f;
                    dVar.f10754r = f10;
                    if (f10 < 0.0f) {
                        dVar.f10754r = (360.0f - f10) % 360.0f;
                    }
                    break;
                case 5:
                    dVar.f10725a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f10725a);
                    break;
                case 6:
                    dVar.f10727b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f10727b);
                    break;
                case 7:
                    dVar.f10729c = typedArrayObtainStyledAttributes.getFloat(index, dVar.f10729c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.e);
                    dVar.e = resourceId2;
                    if (resourceId2 == -1) {
                        dVar.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10734f);
                    dVar.f10734f = resourceId3;
                    if (resourceId3 == -1) {
                        dVar.f10734f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10736g);
                    dVar.f10736g = resourceId4;
                    if (resourceId4 == -1) {
                        dVar.f10736g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.h);
                    dVar.h = resourceId5;
                    if (resourceId5 == -1) {
                        dVar.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.i);
                    dVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        dVar.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10740j);
                    dVar.f10740j = resourceId7;
                    if (resourceId7 == -1) {
                        dVar.f10740j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10742k);
                    dVar.f10742k = resourceId8;
                    if (resourceId8 == -1) {
                        dVar.f10742k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10743l);
                    dVar.f10743l = resourceId9;
                    if (resourceId9 == -1) {
                        dVar.f10743l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10745m);
                    dVar.f10745m = resourceId10;
                    if (resourceId10 == -1) {
                        dVar.f10745m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10755s);
                    dVar.f10755s = resourceId11;
                    if (resourceId11 == -1) {
                        dVar.f10755s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10756t);
                    dVar.f10756t = resourceId12;
                    if (resourceId12 == -1) {
                        dVar.f10756t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10757u);
                    dVar.f10757u = resourceId13;
                    if (resourceId13 == -1) {
                        dVar.f10757u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10758v);
                    dVar.f10758v = resourceId14;
                    if (resourceId14 == -1) {
                        dVar.f10758v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    dVar.f10759w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f10759w);
                    break;
                case 22:
                    dVar.f10760x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f10760x);
                    break;
                case 23:
                    dVar.f10761y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f10761y);
                    break;
                case 24:
                    dVar.f10762z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f10762z);
                    break;
                case 25:
                    dVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.A);
                    break;
                case 26:
                    dVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.B);
                    break;
                case 27:
                    dVar.W = typedArrayObtainStyledAttributes.getBoolean(index, dVar.W);
                    break;
                case 28:
                    dVar.X = typedArrayObtainStyledAttributes.getBoolean(index, dVar.X);
                    break;
                case 29:
                    dVar.E = typedArrayObtainStyledAttributes.getFloat(index, dVar.E);
                    break;
                case 30:
                    dVar.F = typedArrayObtainStyledAttributes.getFloat(index, dVar.F);
                    break;
                case 31:
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    dVar.L = i11;
                    if (i11 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    dVar.M = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        dVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.N) == -2) {
                            dVar.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        dVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.P) == -2) {
                            dVar.P = -2;
                        }
                    }
                    break;
                case 35:
                    dVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, dVar.R));
                    dVar.L = 2;
                    break;
                case 36:
                    try {
                        dVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.O) == -2) {
                            dVar.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        dVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.Q) == -2) {
                            dVar.Q = -2;
                        }
                    }
                    break;
                case 38:
                    dVar.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, dVar.S));
                    dVar.M = 2;
                    break;
                default:
                    switch (i10) {
                        case 44:
                            m.i(dVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            dVar.H = typedArrayObtainStyledAttributes.getFloat(index, dVar.H);
                            break;
                        case 46:
                            dVar.I = typedArrayObtainStyledAttributes.getFloat(index, dVar.I);
                            break;
                        case 47:
                            dVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            dVar.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            dVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.T);
                            break;
                        case 50:
                            dVar.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.U);
                            break;
                        case 51:
                            dVar.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10747n);
                            dVar.f10747n = resourceId15;
                            if (resourceId15 == -1) {
                                dVar.f10747n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f10749o);
                            dVar.f10749o = resourceId16;
                            if (resourceId16 == -1) {
                                dVar.f10749o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            dVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.D);
                            break;
                        case 55:
                            dVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.C);
                            break;
                        default:
                            switch (i10) {
                                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                                    m.h(dVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    m.h(dVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    dVar.Z = typedArrayObtainStyledAttributes.getInt(index, dVar.Z);
                                    break;
                                case 67:
                                    dVar.f10731d = typedArrayObtainStyledAttributes.getBoolean(index, dVar.f10731d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        dVar.a();
        return dVar;
    }

    public int getMaxHeight() {
        return this.f556r;
    }

    public int getMaxWidth() {
        return this.f555f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.f554d;
    }

    public int getOptimizationLevel() {
        return this.f553c.D0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f553c;
        if (eVar.f9380j == null) {
            int id3 = getId();
            if (id3 != -1) {
                eVar.f9380j = getContext().getResources().getResourceEntryName(id3);
            } else {
                eVar.f9380j = "parent";
            }
        }
        if (eVar.f9378h0 == null) {
            eVar.f9378h0 = eVar.f9380j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f9378h0);
        }
        ArrayList arrayList = eVar.f9403q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w.d dVar = (w.d) obj;
            View view = dVar.f9375f0;
            if (view != null) {
                if (dVar.f9380j == null && (id2 = view.getId()) != -1) {
                    dVar.f9380j = getContext().getResources().getResourceEntryName(id2);
                }
                if (dVar.f9378h0 == null) {
                    dVar.f9378h0 = dVar.f9380j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f9378h0);
                }
            }
        }
        eVar.n(sb2);
        return sb2.toString();
    }

    public final w.d h(View view) {
        if (view == this) {
            return this.f553c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof d) {
            return ((d) view.getLayoutParams()).f10752p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof d) {
            return ((d) view.getLayoutParams()).f10752p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        e eVar = this.f553c;
        eVar.f9375f0 = this;
        z.e eVar2 = this.f564z;
        eVar.f9407u0 = eVar2;
        eVar.f9405s0.f9980f = eVar2;
        this.f551a.put(getId(), this);
        this.f559u = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f10854b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.f554d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f554d);
                } else if (index == 17) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f555f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f555f);
                } else if (index == 15) {
                    this.f556r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f556r);
                } else if (index == 113) {
                    this.f558t = typedArrayObtainStyledAttributes.getInt(index, this.f558t);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f560v = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        m mVar = new m();
                        this.f559u = mVar;
                        mVar.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f559u = null;
                    }
                    this.f561w = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.D0 = this.f558t;
        u.c.f8724p = eVar.W(512);
    }

    public final void j(int i) {
        String str;
        Context context = getContext();
        j jVar = new j(20, false);
        jVar.f8445b = new SparseArray();
        jVar.f8446c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            l lVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                jVar.u(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                lVar = new l(context, xml);
                                ((SparseArray) jVar.f8445b).put(lVar.f3642a, lVar);
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                z.f fVar = new z.f(context, xml);
                                if (lVar != null) {
                                    ((ArrayList) lVar.f3644c).add(fVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
        this.f560v = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x030c  */
    /* JADX WARN: Code duplicated, block: B:162:0x032a  */
    /* JADX WARN: Code duplicated, block: B:164:0x032d  */
    /* JADX WARN: Code duplicated, block: B:168:0x034c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0368  */
    /* JADX WARN: Code duplicated, block: B:403:0x0399 A[SYNTHETIC] */
    public final void k(e eVar, int i, int i10, int i11) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i12;
        char c10;
        boolean z4;
        int i13;
        int i14;
        ArrayList arrayList;
        z.e eVar2;
        int i15;
        boolean zT;
        int i16;
        int i17;
        z.e eVar3;
        int i18;
        boolean z10;
        z.e eVar4;
        k kVar;
        x.m mVar;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z11;
        int size;
        int i26;
        int size2;
        int i27;
        o oVar;
        o oVar2;
        int mode = View.MeasureSpec.getMode(i10);
        int size3 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size4 = View.MeasureSpec.getSize(i11);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i28 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        z.e eVar5 = this.f564z;
        eVar5.f10764b = iMax3;
        eVar5.f10765c = iMax4;
        eVar5.f10766d = paddingWidth;
        eVar5.e = i28;
        eVar5.f10767f = i10;
        eVar5.f10768g = i11;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i29 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i30 = size3 - paddingWidth;
        int i31 = size4 - i28;
        int i32 = eVar5.e;
        int i33 = eVar5.f10766d;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f554d);
                iMin = iMax;
            } else {
                iMin = i30;
            }
            i29 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f554d);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i29 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.f555f - i33, i30);
            i29 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.e);
                iMin2 = iMax2;
            } else {
                iMin2 = i31;
            }
            i12 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f556r - i32, i31);
            i12 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.e);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i12 = 2;
        }
        int iQ = eVar.q();
        x.e eVar6 = eVar.f9405s0;
        int[] iArr = eVar.C;
        int i34 = iMin;
        if (i34 == iQ && iMin2 == eVar.k()) {
            c10 = 1;
        } else {
            eVar6.f9978c = true;
            c10 = 1;
        }
        eVar.Y = 0;
        eVar.Z = 0;
        iArr[0] = this.f555f - i33;
        iArr[c10] = this.f556r - i32;
        eVar.f9368b0 = 0;
        eVar.f9370c0 = 0;
        eVar.M(i29);
        eVar.O(i34);
        eVar.N(i12);
        eVar.L(iMin2);
        int i35 = this.f554d - i33;
        if (i35 < 0) {
            eVar.f9368b0 = 0;
        } else {
            eVar.f9368b0 = i35;
        }
        int i36 = this.e - i32;
        if (i36 < 0) {
            eVar.f9370c0 = 0;
        } else {
            eVar.f9370c0 = i36;
        }
        eVar.f9410x0 = iMax5;
        eVar.f9411y0 = iMax3;
        q5.d dVar = eVar.f9404r0;
        e eVar7 = (e) dVar.f8041c;
        ArrayList arrayList2 = (ArrayList) dVar.f8039a;
        z.e eVar8 = eVar.f9407u0;
        int size5 = eVar.f9403q0.size();
        int iQ2 = eVar.q();
        int iK = eVar.k();
        boolean zC = w.j.c(i, 128);
        boolean z12 = zC || w.j.c(i, 64);
        if (z12) {
            int i37 = 0;
            while (true) {
                if (i37 < size5) {
                    boolean z13 = z12;
                    w.d dVar2 = (w.d) eVar.f9403q0.get(i37);
                    int i38 = i37;
                    int[] iArr2 = dVar2.f9392p0;
                    i13 = size5;
                    boolean z14 = (iArr2[0] == 3) && (iArr2[1] == 3) && dVar2.W > 0.0f;
                    if ((dVar2.x() && z14) || ((dVar2.y() && z14) || (dVar2 instanceof g) || dVar2.x() || dVar2.y())) {
                        i14 = 1073741824;
                        z4 = false;
                    } else {
                        i37 = i38 + 1;
                        z12 = z13;
                        size5 = i13;
                    }
                } else {
                    z4 = z12;
                    i13 = size5;
                    i14 = 1073741824;
                }
            }
        } else {
            z4 = z12;
            i13 = size5;
            i14 = 1073741824;
        }
        boolean z15 = z4 & ((mode == i14 && mode2 == i14) || zC);
        if (z15) {
            int iMin3 = Math.min(iArr[0], i30);
            int iMin4 = Math.min(iArr[1], i31);
            int i39 = 1073741824;
            if (mode == 1073741824) {
                if (eVar.q() != iMin3) {
                    eVar.O(iMin3);
                    eVar6.f9977b = true;
                }
                i39 = 1073741824;
            }
            if (mode2 == i39 && eVar.k() != iMin4) {
                eVar.L(iMin4);
                eVar6.f9977b = true;
            }
            if (mode == i39 && mode2 == i39) {
                ArrayList arrayList3 = eVar6.e;
                e eVar9 = eVar6.f9976a;
                if (eVar6.f9977b || eVar6.f9978c) {
                    ArrayList arrayList4 = eVar9.f9403q0;
                    int size6 = arrayList4.size();
                    int i40 = 0;
                    while (i40 < size6) {
                        Object obj = arrayList4.get(i40);
                        int i41 = i40 + 1;
                        w.d dVar3 = (w.d) obj;
                        dVar3.h();
                        dVar3.f9365a = false;
                        dVar3.f9371d.n();
                        dVar3.e.m();
                        arrayList4 = arrayList4;
                        i40 = i41;
                    }
                    eVar9.h();
                    i21 = 0;
                    eVar9.f9365a = false;
                    eVar9.f9371d.n();
                    eVar9.e.m();
                    eVar6.f9978c = false;
                } else {
                    i21 = 0;
                }
                eVar6.b(eVar6.f9979d);
                eVar9.Y = i21;
                int[] iArr3 = eVar9.f9392p0;
                eVar9.Z = i21;
                int iJ = eVar9.j(i21);
                int iJ2 = eVar9.j(1);
                if (eVar6.f9977b) {
                    eVar6.c();
                }
                int iR = eVar9.r();
                eVar2 = eVar8;
                int iS = eVar9.s();
                arrayList = arrayList2;
                eVar9.f9371d.h.d(iR);
                eVar9.e.h.d(iS);
                eVar6.g();
                if (iJ == 2 || iJ2 == 2) {
                    if (zC) {
                        int size7 = arrayList3.size();
                        i22 = iR;
                        int i42 = 0;
                        while (i42 < size7) {
                            Object obj2 = arrayList3.get(i42);
                            i42++;
                            if (!((o) obj2).k()) {
                                zC = false;
                                break;
                            }
                        }
                    } else {
                        i22 = iR;
                    }
                    if (zC && iJ == 2) {
                        eVar9.M(1);
                        eVar9.O(eVar6.d(eVar9, 0));
                        eVar9.f9371d.e.d(eVar9.q());
                    }
                    if (zC && iJ2 == 2) {
                        i23 = 1;
                        eVar9.N(1);
                        eVar9.L(eVar6.d(eVar9, 1));
                        eVar9.e.e.d(eVar9.k());
                    }
                    i24 = iArr3[0];
                    if (i24 != i23 || i24 == 4) {
                        int iQ3 = eVar9.q() + i22;
                        eVar9.f9371d.i.d(iQ3);
                        eVar9.f9371d.e.d(iQ3 - i22);
                        eVar6.g();
                        i25 = iArr3[1];
                        if (i25 != 1 || i25 == 4) {
                            int iK2 = eVar9.k() + iS;
                            eVar9.e.i.d(iK2);
                            eVar9.e.e.d(iK2 - iS);
                        }
                        eVar6.g();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    size = arrayList3.size();
                    i26 = 0;
                    while (i26 < size) {
                        Object obj3 = arrayList3.get(i26);
                        i26++;
                        oVar2 = (o) obj3;
                        if (oVar2.f10004b == eVar9 || oVar2.f10008g) {
                            oVar2.e();
                        }
                    }
                    size2 = arrayList3.size();
                    i27 = 0;
                    while (true) {
                        if (i27 < size2) {
                            zT = true;
                            break;
                        }
                        Object obj4 = arrayList3.get(i27);
                        i27++;
                        oVar = (o) obj4;
                        if (!z11 || oVar.f10004b != eVar9) {
                            if (oVar.h.f9988j || ((!oVar.i.f9988j && !(oVar instanceof i)) || (!oVar.e.f9988j && !(oVar instanceof x.c) && !(oVar instanceof i)))) {
                                zT = false;
                                break;
                            }
                        }
                    }
                    eVar9.M(iJ);
                    eVar9.N(iJ2);
                    i15 = 2;
                    i20 = 1073741824;
                } else {
                    i22 = iR;
                }
                i23 = 1;
                i24 = iArr3[0];
                if (i24 != i23) {
                    int iQ4 = eVar9.q() + i22;
                    eVar9.f9371d.i.d(iQ4);
                    eVar9.f9371d.e.d(iQ4 - i22);
                    eVar6.g();
                    i25 = iArr3[1];
                    if (i25 != 1) {
                        int iK3 = eVar9.k() + iS;
                        eVar9.e.i.d(iK3);
                        eVar9.e.e.d(iK3 - iS);
                    } else {
                        int iK4 = eVar9.k() + iS;
                        eVar9.e.i.d(iK4);
                        eVar9.e.e.d(iK4 - iS);
                    }
                    eVar6.g();
                    z11 = true;
                } else {
                    int iQ5 = eVar9.q() + i22;
                    eVar9.f9371d.i.d(iQ5);
                    eVar9.f9371d.e.d(iQ5 - i22);
                    eVar6.g();
                    i25 = iArr3[1];
                    if (i25 != 1) {
                        int iK5 = eVar9.k() + iS;
                        eVar9.e.i.d(iK5);
                        eVar9.e.e.d(iK5 - iS);
                    } else {
                        int iK6 = eVar9.k() + iS;
                        eVar9.e.i.d(iK6);
                        eVar9.e.e.d(iK6 - iS);
                    }
                    eVar6.g();
                    z11 = true;
                }
                size = arrayList3.size();
                i26 = 0;
                while (i26 < size) {
                    Object obj5 = arrayList3.get(i26);
                    i26++;
                    oVar2 = (o) obj5;
                    if (oVar2.f10004b == eVar9) {
                    }
                    oVar2.e();
                }
                size2 = arrayList3.size();
                i27 = 0;
                while (true) {
                    if (i27 < size2) {
                        zT = true;
                        break;
                    }
                    Object obj6 = arrayList3.get(i27);
                    i27++;
                    oVar = (o) obj6;
                    if (!z11) {
                    }
                    if (oVar.h.f9988j) {
                    }
                    zT = false;
                    break;
                }
                eVar9.M(iJ);
                eVar9.N(iJ2);
                i15 = 2;
                i20 = 1073741824;
            } else {
                z15 = z15;
                arrayList = arrayList2;
                eVar2 = eVar8;
                e eVar10 = eVar6.f9976a;
                if (eVar6.f9977b) {
                    ArrayList arrayList5 = eVar10.f9403q0;
                    int size8 = arrayList5.size();
                    int i43 = 0;
                    while (i43 < size8) {
                        Object obj7 = arrayList5.get(i43);
                        i43++;
                        w.d dVar4 = (w.d) obj7;
                        dVar4.h();
                        dVar4.f9365a = false;
                        k kVar2 = dVar4.f9371d;
                        ArrayList arrayList6 = arrayList5;
                        kVar2.e.f9988j = false;
                        kVar2.f10008g = false;
                        kVar2.n();
                        x.m mVar2 = dVar4.e;
                        mVar2.e.f9988j = false;
                        mVar2.f10008g = false;
                        mVar2.m();
                        arrayList5 = arrayList6;
                    }
                    i19 = 0;
                    eVar10.h();
                    eVar10.f9365a = false;
                    k kVar3 = eVar10.f9371d;
                    kVar3.e.f9988j = false;
                    kVar3.f10008g = false;
                    kVar3.n();
                    x.m mVar3 = eVar10.e;
                    mVar3.e.f9988j = false;
                    mVar3.f10008g = false;
                    mVar3.m();
                    eVar6.c();
                } else {
                    i19 = 0;
                }
                eVar6.b(eVar6.f9979d);
                eVar10.Y = i19;
                eVar10.Z = i19;
                eVar10.f9371d.h.d(i19);
                eVar10.e.h.d(i19);
                i20 = 1073741824;
                if (mode == 1073741824) {
                    zT = eVar.T(i19, zC);
                    i15 = 1;
                } else {
                    i15 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= eVar.T(1, zC);
                    i15++;
                }
            }
            if (zT) {
                eVar.P(mode == i20, mode2 == i20);
            }
        } else {
            z15 = z15;
            arrayList = arrayList2;
            eVar2 = eVar8;
            i15 = 0;
            zT = false;
        }
        if (zT && i15 == 2) {
            return;
        }
        int i44 = eVar.D0;
        if (i13 > 0) {
            int size9 = eVar.f9403q0.size();
            boolean zW = eVar.W(64);
            z.e eVar11 = eVar.f9407u0;
            for (int i45 = 0; i45 < size9; i45++) {
                w.d dVar5 = (w.d) eVar.f9403q0.get(i45);
                if (!(dVar5 instanceof h) && !(dVar5 instanceof a) && !dVar5.F && (!zW || (kVar = dVar5.f9371d) == null || (mVar = dVar5.e) == null || !kVar.e.f9988j || !mVar.e.f9988j)) {
                    int iJ3 = dVar5.j(0);
                    int iJ4 = dVar5.j(1);
                    boolean z16 = iJ3 == 3 && dVar5.f9394r != 1 && iJ4 == 3 && dVar5.f9395s != 1;
                    if (!z16 && eVar.W(1) && !(dVar5 instanceof g)) {
                        if (iJ3 == 3 && dVar5.f9394r == 0 && iJ4 != 3 && !dVar5.x()) {
                            z16 = true;
                        }
                        if (iJ4 == 3 && dVar5.f9395s == 0 && iJ3 != 3 && !dVar5.x()) {
                            z16 = true;
                        }
                        if ((iJ3 == 3 || iJ4 == 3) && dVar5.W > 0.0f) {
                            z16 = true;
                        }
                    }
                    if (!z16) {
                        dVar.h(0, dVar5, eVar11);
                    }
                }
            }
            ConstraintLayout constraintLayout = eVar11.f10763a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.f552b;
            for (int i46 = 0; i46 < childCount2; i46++) {
                constraintLayout.getChildAt(i46);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i47 = 0; i47 < size10; i47++) {
                    ((b) arrayList7.get(i47)).getClass();
                }
            }
        }
        dVar.k(eVar);
        int size11 = arrayList.size();
        if (i13 > 0) {
            dVar.j(eVar, 0, iQ2, iK);
        }
        if (size11 > 0) {
            int[] iArr4 = eVar.f9392p0;
            boolean z17 = iArr4[0] == 2;
            boolean z18 = iArr4[1] == 2;
            int iMax7 = Math.max(eVar.q(), eVar7.f9368b0);
            int iMax8 = Math.max(eVar.k(), eVar7.f9370c0);
            int i48 = 0;
            boolean zH = false;
            while (i48 < size11) {
                ArrayList arrayList8 = arrayList;
                w.d dVar6 = (w.d) arrayList8.get(i48);
                if (dVar6 instanceof g) {
                    int iQ6 = dVar6.q();
                    int iK7 = dVar6.k();
                    z10 = z18;
                    eVar4 = eVar2;
                    boolean zH2 = zH | dVar.h(1, dVar6, eVar4);
                    int iQ7 = dVar6.q();
                    boolean z19 = zH2;
                    int iK8 = dVar6.k();
                    if (iQ7 != iQ6) {
                        dVar6.O(iQ7);
                        if (z17 && dVar6.r() + dVar6.U > iMax7) {
                            iMax7 = Math.max(iMax7, dVar6.i(4).e() + dVar6.r() + dVar6.U);
                        }
                        z19 = true;
                    }
                    if (iK8 != iK7) {
                        dVar6.L(iK8);
                        if (z10 && dVar6.s() + dVar6.V > iMax8) {
                            iMax8 = Math.max(iMax8, dVar6.i(5).e() + dVar6.s() + dVar6.V);
                        }
                        z19 = true;
                    }
                    zH = z19 | ((g) dVar6).f9435y0;
                } else {
                    z10 = z18;
                    eVar4 = eVar2;
                }
                i48++;
                eVar2 = eVar4;
                arrayList = arrayList8;
                z18 = z10;
            }
            boolean z20 = z18;
            ArrayList arrayList9 = arrayList;
            int i49 = 0;
            while (true) {
                z.e eVar12 = eVar2;
                if (i49 >= 2) {
                    break;
                }
                int i50 = 0;
                while (i50 < size11) {
                    w.d dVar7 = (w.d) arrayList9.get(i50);
                    if ((!(dVar7 instanceof w.i) || (dVar7 instanceof g)) && !(dVar7 instanceof h)) {
                        i16 = size11;
                        if (dVar7.f9377g0 != 8 && ((!z15 || !dVar7.f9371d.e.f9988j || !dVar7.e.e.f9988j) && !(dVar7 instanceof g))) {
                            int iQ8 = dVar7.q();
                            int iK9 = dVar7.k();
                            i17 = i50;
                            int i51 = dVar7.f9366a0;
                            zH |= dVar.h(i49 == 1 ? 2 : 1, dVar7, eVar12);
                            eVar3 = eVar12;
                            int iQ9 = dVar7.q();
                            i18 = i49;
                            int iK10 = dVar7.k();
                            if (iQ9 != iQ8) {
                                dVar7.O(iQ9);
                                if (z17 && dVar7.r() + dVar7.U > iMax7) {
                                    iMax7 = Math.max(iMax7, dVar7.i(4).e() + dVar7.r() + dVar7.U);
                                }
                                zH = true;
                            }
                            if (iK10 != iK9) {
                                dVar7.L(iK10);
                                if (z20 && dVar7.s() + dVar7.V > iMax8) {
                                    iMax8 = Math.max(iMax8, dVar7.i(5).e() + dVar7.s() + dVar7.V);
                                }
                                zH = true;
                            }
                            if (dVar7.E && i51 != dVar7.f9366a0) {
                                zH = true;
                            }
                        }
                        i50 = i17 + 1;
                        size11 = i16;
                        eVar12 = eVar3;
                        i49 = i18;
                    } else {
                        i16 = size11;
                    }
                    eVar3 = eVar12;
                    i18 = i49;
                    i17 = i50;
                    i50 = i17 + 1;
                    size11 = i16;
                    eVar12 = eVar3;
                    i49 = i18;
                }
                int i52 = size11;
                eVar2 = eVar12;
                int i53 = i49;
                if (!zH) {
                    break;
                }
                int i54 = i53 + 1;
                dVar.j(eVar, i54, iQ2, iK);
                i49 = i54;
                size11 = i52;
                zH = false;
            }
        }
        eVar.D0 = i44;
        u.c.f8724p = eVar.W(512);
    }

    public final void l(w.d dVar, d dVar2, SparseArray sparseArray, int i, int i10) {
        View view = (View) this.f551a.get(i);
        w.d dVar3 = (w.d) sparseArray.get(i);
        if (dVar3 == null || view == null || !(view.getLayoutParams() instanceof d)) {
            return;
        }
        dVar2.f10730c0 = true;
        if (i10 == 6) {
            d dVar4 = (d) view.getLayoutParams();
            dVar4.f10730c0 = true;
            dVar4.f10752p0.E = true;
        }
        dVar.i(6).b(dVar3.i(i10), dVar2.D, dVar2.C, true);
        dVar.E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            d dVar = (d) childAt.getLayoutParams();
            w.d dVar2 = dVar.f10752p0;
            if (childAt.getVisibility() != 8 || dVar.f10732d0 || dVar.f10733e0 || zIsInEditMode) {
                int iR = dVar2.r();
                int iS = dVar2.s();
                childAt.layout(iR, iS, dVar2.q() + iR, dVar2.k() + iS);
            }
        }
        ArrayList arrayList = this.f552b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((b) arrayList.get(i14)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:128:0x0231  */
    /* JADX WARN: Code duplicated, block: B:167:0x033c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0346  */
    /* JADX WARN: Code duplicated, block: B:172:0x0354  */
    /* JADX WARN: Code duplicated, block: B:179:0x0372  */
    /* JADX WARN: Code duplicated, block: B:181:0x037c  */
    /* JADX WARN: Code duplicated, block: B:182:0x038c  */
    /* JADX WARN: Code duplicated, block: B:184:0x0394  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:192:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:194:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:197:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:204:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:206:0x0409  */
    /* JADX WARN: Code duplicated, block: B:208:0x040d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0416  */
    /* JADX WARN: Code duplicated, block: B:211:0x0420  */
    /* JADX WARN: Code duplicated, block: B:214:0x0427  */
    /* JADX WARN: Code duplicated, block: B:217:0x042f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0554  */
    @Override // android.view.View
    public void onMeasure(int i, int i10) {
        boolean z4;
        int i11;
        boolean z10;
        w.d dVar;
        int i12;
        w.d dVar2;
        int i13;
        int i14;
        int i15;
        w.d dVar3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        w.d dVar4;
        int i22;
        int i23;
        int i24;
        w.d dVar5;
        d dVar6;
        int i25;
        int i26;
        int i27;
        w.d dVar7;
        int i28;
        float f10;
        w.d dVar8;
        w.d dVar9;
        int i29;
        w.d dVar10;
        int i30;
        int i31;
        int i32;
        int i33;
        float fAbs;
        int i34;
        byte b10;
        SparseArray sparseArray;
        ArrayList arrayList;
        String str;
        int iF;
        int i35;
        w.d dVar11;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.A == i) {
            int i36 = constraintLayout.B;
        }
        int i37 = 1;
        int i38 = 0;
        if (!constraintLayout.f557s) {
            int childCount = constraintLayout.getChildCount();
            for (int i39 = 0; i39 < childCount; i39++) {
                if (constraintLayout.getChildAt(i39).isLayoutRequested()) {
                    constraintLayout.f557s = true;
                    break;
                }
            }
        }
        constraintLayout.A = i;
        constraintLayout.B = i10;
        boolean z11 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        e eVar = constraintLayout.f553c;
        eVar.f9408v0 = z11;
        if (constraintLayout.f557s) {
            constraintLayout.f557s = false;
            int childCount2 = constraintLayout.getChildCount();
            int i40 = 0;
            while (true) {
                if (i40 >= childCount2) {
                    z4 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i40).isLayoutRequested()) {
                        z4 = true;
                        break;
                    }
                    i40++;
                }
            }
            if (z4) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i41 = 0; i41 < childCount3; i41++) {
                    w.d dVarH = constraintLayout.h(constraintLayout.getChildAt(i41));
                    if (dVarH != null) {
                        dVarH.C();
                    }
                }
                SparseArray sparseArray2 = constraintLayout.f551a;
                if (zIsInEditMode) {
                    int i42 = 0;
                    while (i42 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i42);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i35 = i37;
                                try {
                                    if (constraintLayout.f562x == null) {
                                        constraintLayout.f562x = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout.f562x.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i35 = i37;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 != 0) {
                                View viewFindViewById = (View) sparseArray2.get(id2);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id2)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                dVar11 = viewFindViewById == constraintLayout ? eVar : viewFindViewById == null ? null : ((d) viewFindViewById.getLayoutParams()).f10752p0;
                            }
                            dVar11.f9378h0 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            i35 = i37;
                        }
                        i42++;
                        i37 = i35;
                    }
                }
                int i43 = i37;
                if (constraintLayout.f561w != -1) {
                    for (int i44 = 0; i44 < childCount3; i44++) {
                        constraintLayout.getChildAt(i44).getId();
                    }
                }
                m mVar = constraintLayout.f559u;
                if (mVar != null) {
                    mVar.a(constraintLayout);
                }
                eVar.f9403q0.clear();
                ArrayList arrayList2 = constraintLayout.f552b;
                int size = arrayList2.size();
                if (size > 0) {
                    int i45 = 0;
                    while (i45 < size) {
                        b bVar = (b) arrayList2.get(i45);
                        HashMap map = bVar.f10723r;
                        if (bVar.isInEditMode()) {
                            bVar.setIds(bVar.e);
                        }
                        w.i iVar = bVar.f10721d;
                        if (iVar == null) {
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                        } else {
                            iVar.f9444r0 = i38;
                            Arrays.fill(iVar.f9443q0, (Object) null);
                            int i46 = i38;
                            while (i46 < bVar.f10719b) {
                                int i47 = bVar.f10718a[i46];
                                View view = (View) sparseArray2.get(i47);
                                if (view == null && (iF = bVar.f(constraintLayout, (str = (String) map.get(Integer.valueOf(i47))))) != 0) {
                                    bVar.f10718a[i46] = iF;
                                    map.put(Integer.valueOf(iF), str);
                                    view = (View) sparseArray2.get(iF);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    w.i iVar2 = bVar.f10721d;
                                    w.d dVarH2 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (dVarH2 != iVar2 && dVarH2 != null) {
                                        int i48 = iVar2.f9444r0 + 1;
                                        w.d[] dVarArr = iVar2.f9443q0;
                                        if (i48 > dVarArr.length) {
                                            iVar2.f9443q0 = (w.d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        w.d[] dVarArr2 = iVar2.f9443q0;
                                        int i49 = iVar2.f9444r0;
                                        dVarArr2[i49] = dVarH2;
                                        iVar2.f9444r0 = i49 + 1;
                                    }
                                }
                                i46++;
                                sparseArray2 = sparseArray2;
                                arrayList2 = arrayList2;
                            }
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                            bVar.f10721d.S();
                        }
                        i45++;
                        sparseArray2 = sparseArray;
                        arrayList2 = arrayList;
                        i38 = 0;
                    }
                }
                int i50 = 2;
                for (int i51 = 0; i51 < childCount3; i51++) {
                    constraintLayout.getChildAt(i51);
                }
                SparseArray sparseArray3 = constraintLayout.f563y;
                sparseArray3.clear();
                sparseArray3.put(0, eVar);
                sparseArray3.put(constraintLayout.getId(), eVar);
                for (int i52 = 0; i52 < childCount3; i52++) {
                    View childAt2 = constraintLayout.getChildAt(i52);
                    sparseArray3.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i53 = 0;
                while (i53 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i53);
                    w.d dVarH3 = constraintLayout.h(childAt3);
                    if (dVarH3 == null) {
                        i11 = i53;
                        z10 = z4;
                        i31 = i50;
                    } else {
                        d dVar12 = (d) childAt3.getLayoutParams();
                        eVar.f9403q0.add(dVarH3);
                        w.d dVar13 = dVarH3.T;
                        if (dVar13 != null) {
                            ((e) dVar13).f9403q0.remove(dVarH3);
                            dVarH3.C();
                        }
                        dVarH3.T = eVar;
                        dVar12.a();
                        dVarH3.f9377g0 = childAt3.getVisibility();
                        dVarH3.f9375f0 = childAt3;
                        if (childAt3 instanceof b) {
                            ((b) childAt3).h(dVarH3, eVar.f9408v0);
                        }
                        if (dVar12.f10732d0) {
                            h hVar = (h) dVarH3;
                            int i54 = dVar12.f10746m0;
                            int i55 = dVar12.f10748n0;
                            float f11 = dVar12.f10750o0;
                            if (f11 == -1.0f) {
                                b10 = -1;
                                if (i54 != -1) {
                                    if (i54 > -1) {
                                        hVar.f9437q0 = -1.0f;
                                        hVar.f9438r0 = i54;
                                        hVar.f9439s0 = -1;
                                    }
                                } else if (i55 != -1 && i55 > -1) {
                                    hVar.f9437q0 = -1.0f;
                                    hVar.f9438r0 = -1;
                                    hVar.f9439s0 = i55;
                                    i11 = i53;
                                    z10 = z4;
                                    i31 = i50;
                                }
                                i11 = i53;
                                z10 = z4;
                                i31 = i50;
                            } else if (f11 > -1.0f) {
                                hVar.f9437q0 = f11;
                                b10 = -1;
                                hVar.f9438r0 = -1;
                                hVar.f9439s0 = -1;
                                i11 = i53;
                                z10 = z4;
                                i31 = i50;
                            } else {
                                i11 = i53;
                                z10 = z4;
                                i31 = i50;
                            }
                        } else {
                            int i56 = dVar12.f10735f0;
                            int i57 = dVar12.f10737g0;
                            int i58 = dVar12.f10738h0;
                            int i59 = dVar12.f10739i0;
                            int i60 = dVar12.f10741j0;
                            int i61 = dVar12.k0;
                            i11 = i53;
                            float f12 = dVar12.f10744l0;
                            int i62 = dVar12.f10751p;
                            z10 = z4;
                            if (i62 != -1) {
                                w.d dVar14 = (w.d) sparseArray3.get(i62);
                                if (dVar14 != null) {
                                    float f13 = dVar12.f10754r;
                                    dVarH3.v(7, 7, dVar12.f10753q, 0, dVar14);
                                    dVarH3.D = f13;
                                }
                                constraintLayout = this;
                                dVar7 = dVarH3;
                                dVar6 = dVar12;
                                i16 = 4;
                                i15 = 2;
                            } else {
                                if (i56 != -1) {
                                    w.d dVar15 = (w.d) sparseArray3.get(i56);
                                    if (dVar15 != null) {
                                        dVar = dVarH3;
                                        i12 = 2;
                                        dVar.v(2, 2, ((ViewGroup.MarginLayoutParams) dVar12).leftMargin, i60, dVar15);
                                    } else {
                                        dVar = dVarH3;
                                        i12 = 2;
                                    }
                                } else {
                                    dVar = dVarH3;
                                    i12 = 2;
                                    if (i57 != -1 && (dVar2 = (w.d) sparseArray3.get(i57)) != null) {
                                        dVar.v(2, 4, ((ViewGroup.MarginLayoutParams) dVar12).leftMargin, i60, dVar2);
                                        i13 = 2;
                                        i14 = 4;
                                    }
                                    if (i58 != -1) {
                                        dVar10 = (w.d) sparseArray3.get(i58);
                                        if (dVar10 != null) {
                                            dVar.v(i14, i13, ((ViewGroup.MarginLayoutParams) dVar12).rightMargin, i61, dVar10);
                                        }
                                        i15 = i13;
                                    } else {
                                        i15 = i13;
                                        if (i59 != -1 && (dVar3 = (w.d) sparseArray3.get(i59)) != null) {
                                            dVar.v(i14, i14, ((ViewGroup.MarginLayoutParams) dVar12).rightMargin, i61, dVar3);
                                        }
                                    }
                                    i16 = i14;
                                    i17 = dVar12.i;
                                    if (i17 != -1) {
                                        dVar9 = (w.d) sparseArray3.get(i17);
                                        if (dVar9 != null) {
                                            i29 = 3;
                                            dVar.v(3, 3, ((ViewGroup.MarginLayoutParams) dVar12).topMargin, dVar12.f10760x, dVar9);
                                        } else {
                                            i29 = 3;
                                        }
                                        i20 = i29;
                                        i21 = 5;
                                        i19 = -1;
                                    } else {
                                        i18 = dVar12.f10740j;
                                        i19 = -1;
                                        if (i18 != -1 || (dVar4 = (w.d) sparseArray3.get(i18)) == null) {
                                            i20 = 3;
                                            i21 = 5;
                                        } else {
                                            dVar.v(3, 5, ((ViewGroup.MarginLayoutParams) dVar12).topMargin, dVar12.f10760x, dVar4);
                                            i20 = 3;
                                            i21 = 5;
                                        }
                                    }
                                    i22 = dVar12.f10742k;
                                    if (i22 != i19) {
                                        dVar8 = (w.d) sparseArray3.get(i22);
                                        if (dVar8 != null) {
                                            int i63 = i20;
                                            dVar.v(i21, i63, ((ViewGroup.MarginLayoutParams) dVar12).bottomMargin, dVar12.f10762z, dVar8);
                                            i23 = i63;
                                        } else {
                                            i23 = i20;
                                        }
                                    } else {
                                        i23 = i20;
                                        i24 = dVar12.f10743l;
                                        if (i24 != i19 && (dVar5 = (w.d) sparseArray3.get(i24)) != null) {
                                            dVar.v(i21, i21, ((ViewGroup.MarginLayoutParams) dVar12).bottomMargin, dVar12.f10762z, dVar5);
                                        }
                                    }
                                    dVar6 = dVar12;
                                    i25 = dVar6.f10745m;
                                    if (i25 != -1) {
                                        constraintLayout = this;
                                        dVar7 = dVar;
                                        constraintLayout.l(dVar7, dVar6, sparseArray3, i25, 6);
                                    } else {
                                        i26 = dVar6.f10747n;
                                        if (i26 != -1) {
                                            constraintLayout = this;
                                            dVar7 = dVar;
                                            constraintLayout.l(dVar7, dVar6, sparseArray3, i26, i23);
                                        } else {
                                            i27 = dVar6.f10749o;
                                            constraintLayout = this;
                                            dVar7 = dVar;
                                            i28 = i21;
                                            if (i27 != -1) {
                                                constraintLayout.l(dVar7, dVar6, sparseArray3, i27, i28);
                                            }
                                        }
                                        if (f12 >= 0.0f) {
                                            dVar7.f9372d0 = f12;
                                        }
                                        f10 = dVar6.F;
                                        if (f10 >= 0.0f) {
                                            dVar7.f9373e0 = f10;
                                        }
                                    }
                                    if (f12 >= 0.0f) {
                                        dVar7.f9372d0 = f12;
                                    }
                                    f10 = dVar6.F;
                                    if (f10 >= 0.0f) {
                                        dVar7.f9373e0 = f10;
                                    }
                                }
                                i13 = i12;
                                i14 = 4;
                                if (i58 != -1) {
                                    dVar10 = (w.d) sparseArray3.get(i58);
                                    if (dVar10 != null) {
                                        dVar.v(i14, i13, ((ViewGroup.MarginLayoutParams) dVar12).rightMargin, i61, dVar10);
                                    }
                                    i15 = i13;
                                } else {
                                    i15 = i13;
                                    if (i59 != -1) {
                                        dVar.v(i14, i14, ((ViewGroup.MarginLayoutParams) dVar12).rightMargin, i61, dVar3);
                                    }
                                }
                                i16 = i14;
                                i17 = dVar12.i;
                                if (i17 != -1) {
                                    dVar9 = (w.d) sparseArray3.get(i17);
                                    if (dVar9 != null) {
                                        i29 = 3;
                                        dVar.v(3, 3, ((ViewGroup.MarginLayoutParams) dVar12).topMargin, dVar12.f10760x, dVar9);
                                    } else {
                                        i29 = 3;
                                    }
                                    i20 = i29;
                                    i21 = 5;
                                    i19 = -1;
                                } else {
                                    i18 = dVar12.f10740j;
                                    i19 = -1;
                                    if (i18 != -1) {
                                        i20 = 3;
                                        i21 = 5;
                                    } else {
                                        i20 = 3;
                                        i21 = 5;
                                    }
                                }
                                i22 = dVar12.f10742k;
                                if (i22 != i19) {
                                    dVar8 = (w.d) sparseArray3.get(i22);
                                    if (dVar8 != null) {
                                        int i64 = i20;
                                        dVar.v(i21, i64, ((ViewGroup.MarginLayoutParams) dVar12).bottomMargin, dVar12.f10762z, dVar8);
                                        i23 = i64;
                                    } else {
                                        i23 = i20;
                                    }
                                } else {
                                    i23 = i20;
                                    i24 = dVar12.f10743l;
                                    if (i24 != i19) {
                                        dVar.v(i21, i21, ((ViewGroup.MarginLayoutParams) dVar12).bottomMargin, dVar12.f10762z, dVar5);
                                    }
                                }
                                dVar6 = dVar12;
                                i25 = dVar6.f10745m;
                                if (i25 != -1) {
                                    constraintLayout = this;
                                    dVar7 = dVar;
                                    constraintLayout.l(dVar7, dVar6, sparseArray3, i25, 6);
                                } else {
                                    i26 = dVar6.f10747n;
                                    if (i26 != -1) {
                                        constraintLayout = this;
                                        dVar7 = dVar;
                                        constraintLayout.l(dVar7, dVar6, sparseArray3, i26, i23);
                                    } else {
                                        i27 = dVar6.f10749o;
                                        constraintLayout = this;
                                        dVar7 = dVar;
                                        i28 = i21;
                                        if (i27 != -1) {
                                            constraintLayout.l(dVar7, dVar6, sparseArray3, i27, i28);
                                        }
                                    }
                                    if (f12 >= 0.0f) {
                                        dVar7.f9372d0 = f12;
                                    }
                                    f10 = dVar6.F;
                                    if (f10 >= 0.0f) {
                                        dVar7.f9373e0 = f10;
                                    }
                                }
                                if (f12 >= 0.0f) {
                                    dVar7.f9372d0 = f12;
                                }
                                f10 = dVar6.F;
                                if (f10 >= 0.0f) {
                                    dVar7.f9373e0 = f10;
                                }
                            }
                            if (zIsInEditMode && ((i34 = dVar6.T) != -1 || dVar6.U != -1)) {
                                int i65 = dVar6.U;
                                dVar7.Y = i34;
                                dVar7.Z = i65;
                            }
                            if (dVar6.f10726a0) {
                                dVar7.M(i43);
                                dVar7.O(((ViewGroup.MarginLayoutParams) dVar6).width);
                                if (((ViewGroup.MarginLayoutParams) dVar6).width == -2) {
                                    dVar7.M(i50);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) dVar6).width == -1) {
                                if (dVar6.W) {
                                    dVar7.M(3);
                                } else {
                                    dVar7.M(4);
                                }
                                dVar7.i(i15).f9364g = ((ViewGroup.MarginLayoutParams) dVar6).leftMargin;
                                dVar7.i(i16).f9364g = ((ViewGroup.MarginLayoutParams) dVar6).rightMargin;
                            } else {
                                dVar7.M(3);
                                dVar7.O(0);
                            }
                            if (dVar6.f10728b0) {
                                i30 = -1;
                                dVar7.N(1);
                                dVar7.L(((ViewGroup.MarginLayoutParams) dVar6).height);
                                if (((ViewGroup.MarginLayoutParams) dVar6).height == -2) {
                                    dVar7.N(2);
                                }
                            } else {
                                i30 = -1;
                                if (((ViewGroup.MarginLayoutParams) dVar6).height == -1) {
                                    if (dVar6.X) {
                                        dVar7.N(3);
                                    } else {
                                        dVar7.N(4);
                                    }
                                    dVar7.i(3).f9364g = ((ViewGroup.MarginLayoutParams) dVar6).topMargin;
                                    dVar7.i(5).f9364g = ((ViewGroup.MarginLayoutParams) dVar6).bottomMargin;
                                } else {
                                    dVar7.N(3);
                                    dVar7.L(0);
                                }
                            }
                            String str2 = dVar6.G;
                            if (str2 == null || str2.length() == 0) {
                                dVar7.W = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i32 = i30;
                                    i33 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i32 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i30;
                                    i33 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i33);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i33, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f14 = Float.parseFloat(strSubstring3);
                                            float f15 = Float.parseFloat(strSubstring4);
                                            if (f14 <= 0.0f || f15 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i32 == 1 ? Math.abs(f15 / f14) : Math.abs(f14 / f15);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    dVar7.W = fAbs;
                                    dVar7.X = i32;
                                }
                            }
                            float f16 = dVar6.H;
                            float[] fArr = dVar7.k0;
                            fArr[0] = f16;
                            i43 = 1;
                            fArr[1] = dVar6.I;
                            dVar7.f9379i0 = dVar6.J;
                            dVar7.f9381j0 = dVar6.K;
                            int i66 = dVar6.Z;
                            if (i66 >= 0 && i66 <= 3) {
                                dVar7.f9393q = i66;
                            }
                            int i67 = dVar6.L;
                            int i68 = dVar6.N;
                            int i69 = dVar6.P;
                            float f17 = dVar6.R;
                            dVar7.f9394r = i67;
                            dVar7.f9397u = i68;
                            if (i69 == Integer.MAX_VALUE) {
                                i69 = 0;
                            }
                            dVar7.f9398v = i69;
                            dVar7.f9399w = f17;
                            if (f17 > 0.0f && f17 < 1.0f && i67 == 0) {
                                dVar7.f9394r = 2;
                            }
                            int i70 = dVar6.M;
                            int i71 = dVar6.O;
                            int i72 = dVar6.Q;
                            float f18 = dVar6.S;
                            dVar7.f9395s = i70;
                            dVar7.f9400x = i71;
                            if (i72 == Integer.MAX_VALUE) {
                                i72 = 0;
                            }
                            dVar7.f9401y = i72;
                            dVar7.f9402z = f18;
                            if (f18 <= 0.0f || f18 >= 1.0f || i70 != 0) {
                                i31 = 2;
                            } else {
                                i31 = 2;
                                dVar7.f9395s = 2;
                            }
                        }
                    }
                    i53 = i11 + 1;
                    i50 = i31;
                    z4 = z10;
                }
            }
            if (z4) {
                eVar.f9404r0.k(eVar);
            }
        }
        constraintLayout.k(eVar, constraintLayout.f558t, i, i10);
        int iQ = eVar.q();
        int iK = eVar.k();
        boolean z12 = eVar.E0;
        boolean z13 = eVar.F0;
        z.e eVar2 = constraintLayout.f564z;
        int i73 = eVar2.e;
        int iResolveSizeAndState = View.resolveSizeAndState(iQ + eVar2.f10766d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iK + i73, i10, 0) & 16777215;
        int iMin = Math.min(constraintLayout.f555f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.f556r, iResolveSizeAndState2);
        if (z12) {
            iMin |= 16777216;
        }
        if (z13) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        w.d dVarH = h(view);
        if ((view instanceof z.o) && !(dVarH instanceof h)) {
            d dVar = (d) view.getLayoutParams();
            h hVar = new h();
            dVar.f10752p0 = hVar;
            dVar.f10732d0 = true;
            hVar.S(dVar.V);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.i();
            ((d) view.getLayoutParams()).f10733e0 = true;
            ArrayList arrayList = this.f552b;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.f551a.put(view.getId(), view);
        this.f557s = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f551a.remove(view.getId());
        w.d dVarH = h(view);
        this.f553c.f9403q0.remove(dVarH);
        dVarH.C();
        this.f552b.remove(view);
        this.f557s = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f557s = true;
        super.requestLayout();
    }

    public void setConstraintSet(m mVar) {
        this.f559u = mVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id2 = getId();
        SparseArray sparseArray = this.f551a;
        sparseArray.remove(id2);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f556r) {
            return;
        }
        this.f556r = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f555f) {
            return;
        }
        this.f555f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f554d) {
            return;
        }
        this.f554d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(n nVar) {
        j jVar = this.f560v;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f558t = i;
        e eVar = this.f553c;
        eVar.D0 = i;
        u.c.f8724p = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f551a = new SparseArray();
        this.f552b = new ArrayList(4);
        this.f553c = new e();
        this.f554d = 0;
        this.e = 0;
        this.f555f = f.API_PRIORITY_OTHER;
        this.f556r = f.API_PRIORITY_OTHER;
        this.f557s = true;
        this.f558t = 257;
        this.f559u = null;
        this.f560v = null;
        this.f561w = -1;
        this.f562x = new HashMap();
        this.f563y = new SparseArray();
        this.f564z = new z.e(this, this);
        this.A = 0;
        this.B = 0;
        i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(layoutParams);
        dVar.f10725a = -1;
        dVar.f10727b = -1;
        dVar.f10729c = -1.0f;
        dVar.f10731d = true;
        dVar.e = -1;
        dVar.f10734f = -1;
        dVar.f10736g = -1;
        dVar.h = -1;
        dVar.i = -1;
        dVar.f10740j = -1;
        dVar.f10742k = -1;
        dVar.f10743l = -1;
        dVar.f10745m = -1;
        dVar.f10747n = -1;
        dVar.f10749o = -1;
        dVar.f10751p = -1;
        dVar.f10753q = 0;
        dVar.f10754r = 0.0f;
        dVar.f10755s = -1;
        dVar.f10756t = -1;
        dVar.f10757u = -1;
        dVar.f10758v = -1;
        dVar.f10759w = Integer.MIN_VALUE;
        dVar.f10760x = Integer.MIN_VALUE;
        dVar.f10761y = Integer.MIN_VALUE;
        dVar.f10762z = Integer.MIN_VALUE;
        dVar.A = Integer.MIN_VALUE;
        dVar.B = Integer.MIN_VALUE;
        dVar.C = Integer.MIN_VALUE;
        dVar.D = 0;
        dVar.E = 0.5f;
        dVar.F = 0.5f;
        dVar.G = null;
        dVar.H = -1.0f;
        dVar.I = -1.0f;
        dVar.J = 0;
        dVar.K = 0;
        dVar.L = 0;
        dVar.M = 0;
        dVar.N = 0;
        dVar.O = 0;
        dVar.P = 0;
        dVar.Q = 0;
        dVar.R = 1.0f;
        dVar.S = 1.0f;
        dVar.T = -1;
        dVar.U = -1;
        dVar.V = -1;
        dVar.W = false;
        dVar.X = false;
        dVar.Y = null;
        dVar.Z = 0;
        dVar.f10726a0 = true;
        dVar.f10728b0 = true;
        dVar.f10730c0 = false;
        dVar.f10732d0 = false;
        dVar.f10733e0 = false;
        dVar.f10735f0 = -1;
        dVar.f10737g0 = -1;
        dVar.f10738h0 = -1;
        dVar.f10739i0 = -1;
        dVar.f10741j0 = Integer.MIN_VALUE;
        dVar.k0 = Integer.MIN_VALUE;
        dVar.f10744l0 = 0.5f;
        dVar.f10752p0 = new w.d();
        return dVar;
    }
}
