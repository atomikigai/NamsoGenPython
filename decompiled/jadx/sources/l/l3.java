package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static l3 f6342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static l3 f6343w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f6345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3 f6347d;
    public final k3 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6348f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6349r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m3 f6350s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6351t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6352u;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.k3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.k3] */
    public l3(View view, CharSequence charSequence) {
        final int i = 0;
        this.f6347d = new Runnable(this) { // from class: l.k3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l3 f6332b;

            {
                this.f6332b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f6332b.c(false);
                        break;
                    default:
                        this.f6332b.a();
                        break;
                }
            }
        };
        final int i10 = 1;
        this.e = new Runnable(this) { // from class: l.k3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l3 f6332b;

            {
                this.f6332b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f6332b.c(false);
                        break;
                    default:
                        this.f6332b.a();
                        break;
                }
            }
        };
        this.f6344a = view;
        this.f6345b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = q0.y0.f7965a;
        this.f6346c = Build.VERSION.SDK_INT >= 28 ? q0.x0.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f6352u = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(l3 l3Var) {
        l3 l3Var2 = f6342v;
        if (l3Var2 != null) {
            l3Var2.f6344a.removeCallbacks(l3Var2.f6347d);
        }
        f6342v = l3Var;
        if (l3Var != null) {
            l3Var.f6344a.postDelayed(l3Var.f6347d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        l3 l3Var = f6343w;
        View view = this.f6344a;
        if (l3Var == this) {
            f6343w = null;
            m3 m3Var = this.f6350s;
            if (m3Var != null) {
                View view2 = (View) m3Var.f6360b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) m3Var.f6359a).getSystemService("window")).removeView(view2);
                }
                this.f6350s = null;
                this.f6352u = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f6342v == this) {
            b(null);
        }
        view.removeCallbacks(this.e);
    }

    public final void c(boolean z4) {
        int height;
        int i;
        int i10;
        int i11;
        long longPressTimeout;
        long j4;
        long j10;
        WeakHashMap weakHashMap = q0.v0.f7946a;
        View view = this.f6344a;
        if (q0.g0.b(view)) {
            b(null);
            l3 l3Var = f6343w;
            if (l3Var != null) {
                l3Var.a();
            }
            f6343w = this;
            this.f6351t = z4;
            Context context = view.getContext();
            m3 m3Var = new m3();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            m3Var.f6362d = layoutParams;
            m3Var.e = new Rect();
            m3Var.f6363f = new int[2];
            m3Var.f6364r = new int[2];
            m3Var.f6359a = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            m3Var.f6360b = viewInflate;
            m3Var.f6361c = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(m3.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) m3Var.f6360b;
            Context context2 = (Context) m3Var.f6359a;
            this.f6350s = m3Var;
            int width = this.f6348f;
            int i12 = this.f6349r;
            boolean z10 = this.f6351t;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) m3Var.f6362d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) m3Var.f6361c).setText(this.f6345b);
            int[] iArr = (int[]) m3Var.f6364r;
            int[] iArr2 = (int[]) m3Var.f6363f;
            Rect rect = (Rect) m3Var.e;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i12 + dimensionPixelOffset2;
                i = i12 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z10 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i13 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i11 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i10 = 0;
                    i11 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i11 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i10 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i14 = iArr2[i10] - iArr[i10];
                iArr2[i10] = i14;
                iArr2[i11] = iArr2[i11] - iArr[i11];
                layoutParams2.x = (i14 + i13) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, i10);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i15 = iArr2[i11];
                int i16 = ((i15 + i) - dimensionPixelOffset3) - measuredHeight;
                int i17 = i15 + height + dimensionPixelOffset3;
                if (z10) {
                    if (i16 >= 0) {
                        layoutParams2.y = i16;
                    } else {
                        layoutParams2.y = i17;
                    }
                } else if (measuredHeight + i17 <= rect.height()) {
                    layoutParams2.y = i17;
                } else {
                    layoutParams2.y = i16;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f6351t) {
                j10 = 2500;
            } else {
                if ((q0.d0.g(view) & 1) == i11) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 15000;
                }
                j10 = j4 - longPressTimeout;
            }
            k3 k3Var = this.e;
            view.removeCallbacks(k3Var);
            view.postDelayed(k3Var, j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f6350s == null || !this.f6351t) {
            View view2 = this.f6344a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f6352u = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f6350s == null) {
                    int x4 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (this.f6352u) {
                        this.f6348f = x4;
                        this.f6349r = y10;
                        this.f6352u = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x4 - this.f6348f);
                        int i = this.f6346c;
                        if (iAbs > i || Math.abs(y10 - this.f6349r) > i) {
                            this.f6348f = x4;
                            this.f6349r = y10;
                            this.f6352u = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f6348f = view.getWidth() / 2;
        this.f6349r = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
