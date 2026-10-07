package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements k.y {
    public int A;
    public boolean B;
    public f D;
    public f E;
    public h F;
    public g G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f6306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k.l f6307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f6308d;
    public k.x e;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k.a0 f6311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i f6312t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f6313u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6314v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6317y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6318z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6309f = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6310r = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray C = new SparseBooleanArray();
    public final a5.b H = new a5.b(this, 18);

    public j(Context context) {
        this.f6305a = context;
        this.f6308d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(k.n nVar, View view, ViewGroup viewGroup) {
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            k.z zVar = view instanceof k.z ? (k.z) view : (k.z) this.f6308d.inflate(this.f6310r, viewGroup, false);
            zVar.c(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) zVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f6311s);
            if (this.G == null) {
                this.G = new g(this);
            }
            actionMenuItemView.setPopupCallback(this.G);
            actionView = (View) zVar;
        }
        actionView.setVisibility(nVar.N ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof l)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.y
    public final void b(k.l lVar, boolean z4) {
        h();
        f fVar = this.E;
        if (fVar != null && fVar.b()) {
            fVar.i.dismiss();
        }
        k.x xVar = this.e;
        if (xVar != null) {
            xVar.b(lVar, z4);
        }
    }

    @Override // k.y
    public final boolean c(k.n nVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.y
    public final boolean d(k.e0 e0Var) {
        boolean z4;
        if (e0Var.hasVisibleItems()) {
            k.e0 e0Var2 = e0Var;
            while (true) {
                k.l lVar = e0Var2.K;
                if (lVar == this.f6307c) {
                    break;
                }
                e0Var2 = (k.e0) lVar;
            }
            k.n nVar = e0Var2.L;
            ViewGroup viewGroup = (ViewGroup) this.f6311s;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof k.z) && ((k.z) childAt).getItemData() == nVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                e0Var.L.getClass();
                int size = e0Var.f5865f.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z4 = false;
                        break;
                    }
                    MenuItem item = e0Var.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z4 = true;
                        break;
                    }
                    i10++;
                }
                f fVar = new f(this, this.f6306b, e0Var, view);
                this.E = fVar;
                fVar.f5908g = z4;
                k.t tVar = fVar.i;
                if (tVar != null) {
                    tVar.o(z4);
                }
                f fVar2 = this.E;
                if (!fVar2.b()) {
                    if (fVar2.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    fVar2.d(0, 0, false, false);
                }
                k.x xVar = this.e;
                if (xVar != null) {
                    xVar.h(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // k.y
    public final boolean e(k.n nVar) {
        return false;
    }

    @Override // k.y
    public final void f(k.x xVar) {
        throw null;
    }

    @Override // k.y
    public final boolean g() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z4;
        j jVar = this;
        k.l lVar = jVar.f6307c;
        if (lVar != null) {
            arrayListL = lVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i10 = jVar.A;
        int i11 = jVar.f6318z;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) jVar.f6311s;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i = 2;
            z4 = true;
            if (i12 >= size) {
                break;
            }
            k.n nVar = (k.n) arrayListL.get(i12);
            int i15 = nVar.J;
            if ((i15 & 2) == 2) {
                i13++;
            } else if ((i15 & 1) == 1) {
                i14++;
            } else {
                z10 = true;
            }
            if (jVar.B && nVar.N) {
                i10 = 0;
            }
            i12++;
        }
        if (jVar.f6315w && (z10 || i14 + i13 > i10)) {
            i10--;
        }
        int i16 = i10 - i13;
        SparseBooleanArray sparseBooleanArray = jVar.C;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = 0;
        while (i17 < size) {
            k.n nVar2 = (k.n) arrayListL.get(i17);
            int i19 = nVar2.J;
            boolean z11 = (i19 & 2) == i ? z4 : false;
            int i20 = nVar2.f5879b;
            if (z11) {
                View viewA = jVar.a(nVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                if (i20 != 0) {
                    sparseBooleanArray.put(i20, z4);
                }
                nVar2.f(z4);
            } else {
                if ((i19 & 1) == z4) {
                    boolean z12 = sparseBooleanArray.get(i20);
                    boolean z13 = ((i16 > 0 || z12) && i11 > 0) ? z4 : false;
                    if (z13) {
                        View viewA2 = jVar.a(nVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i11 -= measuredWidth2;
                        if (i18 == 0) {
                            i18 = measuredWidth2;
                        }
                        z13 &= i11 + i18 > 0;
                    }
                    if (z13 && i20 != 0) {
                        sparseBooleanArray.put(i20, true);
                    } else if (z12) {
                        sparseBooleanArray.put(i20, false);
                        for (int i21 = 0; i21 < i17; i21++) {
                            k.n nVar3 = (k.n) arrayListL.get(i21);
                            if (nVar3.f5879b == i20) {
                                if ((nVar3.I & 32) == 32) {
                                    i16++;
                                }
                                nVar3.f(false);
                            }
                        }
                    }
                    if (z13) {
                        i16--;
                    }
                    nVar2.f(z13);
                } else {
                    nVar2.f(false);
                }
                i17++;
                i = 2;
                jVar = this;
                z4 = true;
            }
            i17++;
            i = 2;
            jVar = this;
            z4 = true;
        }
        return z4;
    }

    public final boolean h() {
        Object obj;
        h hVar = this.F;
        if (hVar != null && (obj = this.f6311s) != null) {
            ((View) obj).removeCallbacks(hVar);
            this.F = null;
            return true;
        }
        f fVar = this.D;
        if (fVar == null) {
            return false;
        }
        if (fVar.b()) {
            fVar.i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.y
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f6311s;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            k.l lVar = this.f6307c;
            if (lVar != null) {
                lVar.i();
                ArrayList arrayListL = this.f6307c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    k.n nVar = (k.n) arrayListL.get(i10);
                    if ((nVar.I & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        k.n itemData = childAt instanceof k.z ? ((k.z) childAt).getItemData() : null;
                        View viewA = a(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f6311s).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f6312t) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f6311s).requestLayout();
        k.l lVar2 = this.f6307c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f5868t;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                k.o oVar = ((k.n) arrayList2.get(i11)).L;
            }
        }
        k.l lVar3 = this.f6307c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f5869u;
        }
        if (this.f6315w && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((k.n) arrayList.get(0)).N;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f6312t == null) {
                this.f6312t = new i(this, this.f6305a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f6312t.getParent();
            if (viewGroup3 != this.f6311s) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f6312t);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f6311s;
                i iVar = this.f6312t;
                actionMenuView.getClass();
                l lVarJ = ActionMenuView.j();
                lVarJ.f6333a = true;
                actionMenuView.addView(iVar, lVarJ);
            }
        } else {
            i iVar2 = this.f6312t;
            if (iVar2 != null) {
                Object parent = iVar2.getParent();
                Object obj = this.f6311s;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f6312t);
                }
            }
        }
        ((ActionMenuView) this.f6311s).setOverflowReserved(this.f6315w);
    }

    public final boolean j() {
        f fVar = this.D;
        return fVar != null && fVar.b();
    }

    @Override // k.y
    public final void k(Context context, k.l lVar) {
        this.f6306b = context;
        LayoutInflater.from(context);
        this.f6307c = lVar;
        Resources resources = context.getResources();
        if (!this.f6316x) {
            this.f6315w = true;
        }
        int i = 2;
        this.f6317y = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i = 4;
        } else if (i10 >= 360) {
            i = 3;
        }
        this.A = i;
        int measuredWidth = this.f6317y;
        if (this.f6315w) {
            if (this.f6312t == null) {
                i iVar = new i(this, this.f6305a);
                this.f6312t = iVar;
                if (this.f6314v) {
                    iVar.setImageDrawable(this.f6313u);
                    this.f6313u = null;
                    this.f6314v = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f6312t.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f6312t.getMeasuredWidth();
        } else {
            this.f6312t = null;
        }
        this.f6318z = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        k.l lVar;
        if (!this.f6315w || j() || (lVar = this.f6307c) == null || this.f6311s == null || this.F != null) {
            return false;
        }
        lVar.i();
        if (lVar.f5869u.isEmpty()) {
            return false;
        }
        h hVar = new h(this, new f(this, this.f6306b, this.f6307c, this.f6312t));
        this.F = hVar;
        ((View) this.f6311s).post(hVar);
        return true;
    }
}
