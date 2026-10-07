package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class c2 implements k.c0 {
    public static final Method L;
    public static final Method M;
    public AdapterView.OnItemClickListener A;
    public AdapterView.OnItemSelectedListener B;
    public final Handler G;
    public Rect I;
    public boolean J;
    public final y K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f6243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r1 f6244c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6246f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6247r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6249t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6250u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6251v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2 f6254y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f6255z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6245d = -2;
    public int e = -2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6248s = 1002;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6252w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f6253x = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    public final z1 C = new z1(this, 1);
    public final d6.l D = new d6.l(this, 1);
    public final b2 E = new b2(this);
    public final z1 F = new z1(this, 0);
    public final Rect H = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                L = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public c2(Context context, AttributeSet attributeSet, int i, int i10) {
        int resourceId;
        this.f6242a = context;
        this.G = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f3563o, i, 0);
        this.f6246f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f6247r = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f6249t = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        y yVar = new y(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f3567s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            u0.m.c(yVar, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        yVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : com.bumptech.glide.d.r(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.K = yVar;
        yVar.setInputMethodMode(1);
    }

    @Override // k.c0
    public final boolean a() {
        return this.K.isShowing();
    }

    public final int b() {
        return this.f6246f;
    }

    public final void c(int i) {
        this.f6246f = i;
    }

    @Override // k.c0
    public final void dismiss() {
        y yVar = this.K;
        yVar.dismiss();
        yVar.setContentView(null);
        this.f6244c = null;
        this.G.removeCallbacks(this.C);
    }

    public final Drawable e() {
        return this.K.getBackground();
    }

    public final void g(Drawable drawable) {
        this.K.setBackgroundDrawable(drawable);
    }

    @Override // k.c0
    public final void h() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        r1 r1Var;
        r1 r1Var2 = this.f6244c;
        Context context = this.f6242a;
        y yVar = this.K;
        if (r1Var2 == null) {
            r1 r1VarQ = q(context, !this.J);
            this.f6244c = r1VarQ;
            r1VarQ.setAdapter(this.f6243b);
            this.f6244c.setOnItemClickListener(this.A);
            this.f6244c.setFocusable(true);
            this.f6244c.setFocusableInTouchMode(true);
            this.f6244c.setOnItemSelectedListener(new h3.b0(this, 2));
            this.f6244c.setOnScrollListener(this.E);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.B;
            if (onItemSelectedListener != null) {
                this.f6244c.setOnItemSelectedListener(onItemSelectedListener);
            }
            yVar.setContentView(this.f6244c);
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.H;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i = rect.bottom + i10;
            if (!this.f6249t) {
                this.f6247r = -i10;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = x1.a(yVar, this.f6255z, this.f6247r, yVar.getInputMethodMode() == 2);
        int i11 = this.f6245d;
        if (i11 == -1) {
            paddingBottom = iA + i;
        } else {
            int i12 = this.e;
            if (i12 != -2) {
                iMakeMeasureSpec = i12 != -1 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f6244c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f6244c.getPaddingBottom() + this.f6244c.getPaddingTop() + i : 0);
        }
        boolean z4 = yVar.getInputMethodMode() == 2;
        u0.m.d(yVar, this.f6248s);
        if (yVar.isShowing()) {
            View view = this.f6255z;
            WeakHashMap weakHashMap = q0.v0.f7946a;
            if (q0.g0.b(view)) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f6255z.getWidth();
                }
                if (i11 == -1) {
                    i11 = z4 ? paddingBottom : -1;
                    if (z4) {
                        yVar.setWidth(this.e == -1 ? -1 : 0);
                        yVar.setHeight(0);
                    } else {
                        yVar.setWidth(this.e == -1 ? -1 : 0);
                        yVar.setHeight(-1);
                    }
                } else if (i11 == -2) {
                    i11 = paddingBottom;
                }
                yVar.setOutsideTouchable(true);
                View view2 = this.f6255z;
                int i13 = this.f6246f;
                int i14 = this.f6247r;
                if (width < 0) {
                    width = -1;
                }
                yVar.update(view2, i13, i14, width, i11 < 0 ? -1 : i11);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f6255z.getWidth();
        }
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = paddingBottom;
        }
        yVar.setWidth(width2);
        yVar.setHeight(i11);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = L;
            if (method != null) {
                try {
                    method.invoke(yVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            y1.b(yVar, true);
        }
        yVar.setOutsideTouchable(true);
        yVar.setTouchInterceptor(this.D);
        if (this.f6251v) {
            u0.m.c(yVar, this.f6250u);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = M;
            if (method2 != null) {
                try {
                    method2.invoke(yVar, this.I);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            y1.a(yVar, this.I);
        }
        u0.l.a(yVar, this.f6255z, this.f6246f, this.f6247r, this.f6252w);
        this.f6244c.setSelection(-1);
        if ((!this.J || this.f6244c.isInTouchMode()) && (r1Var = this.f6244c) != null) {
            r1Var.setListSelectionHidden(true);
            r1Var.requestLayout();
        }
        if (this.J) {
            return;
        }
        this.G.post(this.F);
    }

    public final void i(int i) {
        this.f6247r = i;
        this.f6249t = true;
    }

    @Override // k.c0
    public final r1 j() {
        return this.f6244c;
    }

    public final int o() {
        if (this.f6249t) {
            return this.f6247r;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        a2 a2Var = this.f6254y;
        if (a2Var == null) {
            this.f6254y = new a2(this, 0);
        } else {
            ListAdapter listAdapter2 = this.f6243b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(a2Var);
            }
        }
        this.f6243b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f6254y);
        }
        r1 r1Var = this.f6244c;
        if (r1Var != null) {
            r1Var.setAdapter(this.f6243b);
        }
    }

    public r1 q(Context context, boolean z4) {
        return new r1(context, z4);
    }

    public final void r(int i) {
        Drawable background = this.K.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.H;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
