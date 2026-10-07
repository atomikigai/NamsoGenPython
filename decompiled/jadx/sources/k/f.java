package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.n0;
import app.namso_gen.spacehowen.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.e2;
import l.f2;
import l.i2;
import l.r1;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public boolean G;
    public x H;
    public ViewTreeObserver I;
    public PopupWindow.OnDismissListener J;
    public boolean K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5838d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f5839f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f5847y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f5848z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f5840r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f5841s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f5842t = new d(this, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n0 f5843u = new n0(this, 2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a5.b f5844v = new a5.b(this, 17);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5845w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5846x = 0;
    public boolean F = false;

    public f(Context context, View view, int i, boolean z4) {
        this.f5836b = context;
        this.f5847y = view;
        this.f5838d = i;
        this.e = z4;
        WeakHashMap weakHashMap = v0.f7946a;
        this.A = q0.e0.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f5837c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f5839f = new Handler();
    }

    @Override // k.c0
    public final boolean a() {
        ArrayList arrayList = this.f5841s;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f5833a.K.isShowing();
    }

    @Override // k.y
    public final void b(l lVar, boolean z4) {
        ArrayList arrayList = this.f5841s;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lVar == ((e) arrayList.get(i)).f5834b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i10 = i + 1;
        if (i10 < arrayList.size()) {
            ((e) arrayList.get(i10)).f5834b.c(false);
        }
        e eVar = (e) arrayList.remove(i);
        l lVar2 = eVar.f5834b;
        i2 i2Var = eVar.f5833a;
        l.y yVar = i2Var.K;
        lVar2.r(this);
        if (this.K) {
            e2.b(yVar, null);
            yVar.setAnimationStyle(0);
        }
        i2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.A = ((e) arrayList.get(size2 - 1)).f5835c;
        } else {
            View view = this.f5847y;
            WeakHashMap weakHashMap = v0.f7946a;
            this.A = q0.e0.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((e) arrayList.get(0)).f5834b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.H;
        if (xVar != null) {
            xVar.b(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.I;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.I.removeGlobalOnLayoutListener(this.f5842t);
            }
            this.I = null;
        }
        this.f5848z.removeOnAttachStateChangeListener(this.f5843u);
        this.J.onDismiss();
    }

    @Override // k.y
    public final boolean d(e0 e0Var) {
        ArrayList arrayList = this.f5841s;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e eVar = (e) obj;
            if (e0Var == eVar.f5834b) {
                eVar.f5833a.f6244c.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        l(e0Var);
        x xVar = this.H;
        if (xVar != null) {
            xVar.h(e0Var);
        }
        return true;
    }

    @Override // k.c0
    public final void dismiss() {
        ArrayList arrayList = this.f5841s;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i = size - 1; i >= 0; i--) {
                e eVar = eVarArr[i];
                if (eVar.f5833a.K.isShowing()) {
                    eVar.f5833a.dismiss();
                }
            }
        }
    }

    @Override // k.y
    public final void f(x xVar) {
        this.H = xVar;
    }

    @Override // k.y
    public final boolean g() {
        return false;
    }

    @Override // k.c0
    public final void h() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f5840r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((l) obj);
        }
        arrayList.clear();
        View view = this.f5847y;
        this.f5848z = view;
        if (view != null) {
            boolean z4 = this.I == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.I = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f5842t);
            }
            this.f5848z.addOnAttachStateChangeListener(this.f5843u);
        }
    }

    @Override // k.y
    public final void i() {
        ArrayList arrayList = this.f5841s;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((e) obj).f5833a.f6244c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.c0
    public final r1 j() {
        ArrayList arrayList = this.f5841s;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) arrayList.get(arrayList.size() - 1)).f5833a.f6244c;
    }

    @Override // k.t
    public final void l(l lVar) {
        lVar.b(this, this.f5836b);
        if (a()) {
            u(lVar);
        } else {
            this.f5840r.add(lVar);
        }
    }

    @Override // k.t
    public final void n(View view) {
        if (this.f5847y != view) {
            this.f5847y = view;
            int i = this.f5845w;
            WeakHashMap weakHashMap = v0.f7946a;
            this.f5846x = Gravity.getAbsoluteGravity(i, q0.e0.d(view));
        }
    }

    @Override // k.t
    public final void o(boolean z4) {
        this.F = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f5841s;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i);
            if (!eVar.f5833a.K.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (eVar != null) {
            eVar.f5834b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.t
    public final void p(int i) {
        if (this.f5845w != i) {
            this.f5845w = i;
            View view = this.f5847y;
            WeakHashMap weakHashMap = v0.f7946a;
            this.f5846x = Gravity.getAbsoluteGravity(i, q0.e0.d(view));
        }
    }

    @Override // k.t
    public final void q(int i) {
        this.B = true;
        this.D = i;
    }

    @Override // k.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.J = onDismissListener;
    }

    @Override // k.t
    public final void s(boolean z4) {
        this.G = z4;
    }

    @Override // k.t
    public final void t(int i) {
        this.C = true;
        this.E = i;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:111:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x010a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:70:0x0168  */
    /* JADX WARN: Code duplicated, block: B:74:0x0170  */
    /* JADX WARN: Code duplicated, block: B:75:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0181  */
    /* JADX WARN: Code duplicated, block: B:81:0x0194  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c1 A[PHI: r5
      0x01c1: PHI (r5v17 int) = (r5v9 int), (r5v18 int) binds: [B:89:0x01c3, B:87:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e1  */
    public final void u(l lVar) {
        boolean z4;
        int i;
        e eVar;
        View childAt;
        Rect rect;
        Rect rect2;
        int i10;
        l.y yVar;
        r1 r1Var;
        int[] iArr;
        Rect rect3;
        int i11;
        boolean z10;
        int[] iArr2;
        int[] iArr3;
        int i12;
        int i13;
        int width;
        Method method;
        MenuItem item;
        i iVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f5836b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        i iVar2 = new i(lVar, layoutInflaterFrom, this.e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.F) {
            iVar2.f5858c = true;
        } else if (a()) {
            int size = lVar.f5865f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item2 = lVar.getItem(i14);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i14++;
            }
            iVar2.f5858c = z4;
        }
        int iM = t.m(iVar2, context, this.f5837c);
        i2 i2Var = new i2(context, null, this.f5838d, 0);
        i2Var.N = this.f5844v;
        i2Var.A = this;
        i2Var.K.setOnDismissListener(this);
        i2Var.f6255z = this.f5847y;
        i2Var.f6252w = this.f5846x;
        i2Var.J = true;
        i2Var.K.setFocusable(true);
        i2Var.K.setInputMethodMode(2);
        i2Var.p(iVar2);
        i2Var.r(iM);
        i2Var.f6252w = this.f5846x;
        ArrayList arrayList = this.f5841s;
        if (arrayList.size() > 0) {
            eVar = (e) arrayList.get(arrayList.size() - 1);
            l lVar2 = eVar.f5834b;
            int size2 = lVar2.f5865f.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    item = null;
                    break;
                }
                item = lVar2.getItem(i15);
                if (item.hasSubMenu() && lVar == item.getSubMenu()) {
                    break;
                } else {
                    i15++;
                }
            }
            if (item == null) {
                i = 1;
                childAt = null;
            } else {
                r1 r1Var2 = eVar.f5833a.f6244c;
                ListAdapter adapter = r1Var2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    iVar = (i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    iVar = (i) adapter;
                    headersCount = 0;
                }
                int count = iVar.getCount();
                i = 1;
                int i16 = 0;
                while (true) {
                    if (i16 >= count) {
                        i16 = -1;
                        break;
                    } else if (item == iVar.getItem(i16)) {
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i16 != -1 && (firstVisiblePosition = (i16 + headersCount) - r1Var2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < r1Var2.getChildCount()) {
                    childAt = r1Var2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i10 = Build.VERSION.SDK_INT;
                yVar = i2Var.K;
                if (i10 <= 28) {
                    method = i2.O;
                    if (method != null) {
                        try {
                            method.invoke(yVar, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    f2.a(yVar, false);
                }
                e2.a(i2Var.K, null);
                r1Var = ((e) arrayList.get(arrayList.size() - 1)).f5833a.f6244c;
                iArr = new int[2];
                r1Var.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.f5848z.getWindowVisibleDisplayFrame(rect3);
                if (this.A == i) {
                    if (r1Var.getWidth() + iArr[0] + iM > rect3.right) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                } else if (iArr[0] - iM < 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i11 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.A = i11;
                if (Build.VERSION.SDK_INT >= 26) {
                    i2Var.f6255z = childAt;
                    i13 = 0;
                    i12 = 0;
                } else {
                    iArr2 = new int[2];
                    this.f5847y.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f5846x & 7) == 5) {
                        iArr2[0] = this.f5847y.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    i12 = iArr3[0] - iArr2[0];
                    i13 = iArr3[1] - iArr2[1];
                }
                if ((this.f5846x & 5) == 5) {
                    if (z10) {
                        width = i12 + iM;
                    } else {
                        iM = childAt.getWidth();
                        width = i12 - iM;
                    }
                } else if (z10) {
                    width = i12 + childAt.getWidth();
                } else {
                    width = i12 - iM;
                }
                i2Var.f6246f = width;
                i2Var.f6251v = true;
                i2Var.f6250u = true;
                i2Var.i(i13);
            } else {
                if (this.B) {
                    i2Var.f6246f = this.D;
                }
                if (this.C) {
                    i2Var.i(this.E);
                }
                rect = this.f5901a;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                i2Var.I = rect2;
            }
            arrayList.add(new e(i2Var, lVar, this.A));
            i2Var.h();
            r1 r1Var3 = i2Var.f6244c;
            r1Var3.setOnKeyListener(this);
            if (eVar == null || !this.G || lVar.f5872x == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) r1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(lVar.f5872x);
            r1Var3.addHeaderView(frameLayout, null, false);
            i2Var.h();
            return;
        }
        i = 1;
        eVar = null;
        childAt = null;
        if (childAt != null) {
            i10 = Build.VERSION.SDK_INT;
            yVar = i2Var.K;
            if (i10 <= 28) {
                method = i2.O;
                if (method != null) {
                    method.invoke(yVar, Boolean.FALSE);
                }
            } else {
                f2.a(yVar, false);
            }
            e2.a(i2Var.K, null);
            r1Var = ((e) arrayList.get(arrayList.size() - 1)).f5833a.f6244c;
            iArr = new int[2];
            r1Var.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f5848z.getWindowVisibleDisplayFrame(rect3);
            if (this.A == i) {
                if (r1Var.getWidth() + iArr[0] + iM > rect3.right) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (i11 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.A = i11;
            if (Build.VERSION.SDK_INT >= 26) {
                i2Var.f6255z = childAt;
                i13 = 0;
                i12 = 0;
            } else {
                iArr2 = new int[2];
                this.f5847y.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f5846x & 7) == 5) {
                    iArr2[0] = this.f5847y.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                i12 = iArr3[0] - iArr2[0];
                i13 = iArr3[1] - iArr2[1];
            }
            if ((this.f5846x & 5) == 5) {
                if (z10) {
                    width = i12 + iM;
                } else {
                    iM = childAt.getWidth();
                    width = i12 - iM;
                }
            } else if (z10) {
                width = i12 + childAt.getWidth();
            } else {
                width = i12 - iM;
            }
            i2Var.f6246f = width;
            i2Var.f6251v = true;
            i2Var.f6250u = true;
            i2Var.i(i13);
        } else {
            if (this.B) {
                i2Var.f6246f = this.D;
            }
            if (this.C) {
                i2Var.i(this.E);
            }
            rect = this.f5901a;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            i2Var.I = rect2;
        }
        arrayList.add(new e(i2Var, lVar, this.A));
        i2Var.h();
        r1 r1Var4 = i2Var.f6244c;
        r1Var4.setOnKeyListener(this);
        if (eVar == null) {
        }
    }
}
