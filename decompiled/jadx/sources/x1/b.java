package x1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta.c f10021a;
    public View e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10024d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d6.e f10022b = new d6.e(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10023c = new ArrayList();

    public b(ta.c cVar) {
        this.f10021a = cVar;
    }

    public final void a(View view, boolean z4, int i) {
        RecyclerView recyclerView = (RecyclerView) this.f10021a.f8662a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f10022b.e(childCount, z4);
        if (z4) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        w0 w0VarM = RecyclerView.M(view);
        z zVar = recyclerView.f1164x;
        if (zVar != null && w0VarM != null) {
            zVar.i(w0VarM);
        }
        ArrayList arrayList = recyclerView.N;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s2.g) recyclerView.N.get(size)).getClass();
                i0 i0Var = (i0) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) i0Var).width != -1 || ((ViewGroup.MarginLayoutParams) i0Var).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z4) {
        RecyclerView recyclerView = (RecyclerView) this.f10021a.f8662a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f10022b.e(childCount, z4);
        if (z4) {
            i(view);
        }
        w0 w0VarM = RecyclerView.M(view);
        if (w0VarM != null) {
            if (!w0VarM.j() && !w0VarM.o()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(w0VarM);
                throw new IllegalArgumentException(u3.b.a(recyclerView, sb2));
            }
            if (RecyclerView.M0) {
                Log.d("RecyclerView", "reAttach " + w0VarM);
            }
            w0VarM.f10236j &= -257;
        } else if (RecyclerView.L0) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(childCount);
            throw new IllegalArgumentException(u3.b.a(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int iF = f(i);
        this.f10022b.g(iF);
        RecyclerView recyclerView = (RecyclerView) this.f10021a.f8662a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            w0 w0VarM = RecyclerView.M(childAt);
            if (w0VarM != null) {
                if (w0VarM.j() && !w0VarM.o()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(w0VarM);
                    throw new IllegalArgumentException(u3.b.a(recyclerView, sb2));
                }
                if (RecyclerView.M0) {
                    Log.d("RecyclerView", "tmpDetach " + w0VarM);
                }
                w0VarM.a(256);
            }
        } else if (RecyclerView.L0) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(iF);
            throw new IllegalArgumentException(u3.b.a(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return ((RecyclerView) this.f10021a.f8662a).getChildAt(f(i));
    }

    public final int e() {
        return ((RecyclerView) this.f10021a.f8662a).getChildCount() - this.f10023c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) this.f10021a.f8662a).getChildCount();
        int i10 = i;
        while (i10 < childCount) {
            d6.e eVar = this.f10022b;
            int iB = i - (i10 - eVar.b(i10));
            if (iB == 0) {
                while (eVar.d(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += iB;
        }
        return -1;
    }

    public final View g(int i) {
        return ((RecyclerView) this.f10021a.f8662a).getChildAt(i);
    }

    public final int h() {
        return ((RecyclerView) this.f10021a.f8662a).getChildCount();
    }

    public final void i(View view) {
        this.f10023c.add(view);
        w0 w0VarM = RecyclerView.M(view);
        if (w0VarM != null) {
            View view2 = w0VarM.f10230a;
            RecyclerView recyclerView = (RecyclerView) this.f10021a.f8662a;
            int i = w0VarM.f10243q;
            if (i != -1) {
                w0VarM.f10242p = i;
            } else {
                WeakHashMap weakHashMap = q0.v0.f7946a;
                w0VarM.f10242p = q0.d0.c(view2);
            }
            if (recyclerView.P()) {
                w0VarM.f10243q = 4;
                recyclerView.F0.add(w0VarM);
            } else {
                WeakHashMap weakHashMap2 = q0.v0.f7946a;
                q0.d0.s(view2, 4);
            }
        }
    }

    public final void j(View view) {
        w0 w0VarM;
        if (!this.f10023c.remove(view) || (w0VarM = RecyclerView.M(view)) == null) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) this.f10021a.f8662a;
        int i = w0VarM.f10242p;
        if (recyclerView.P()) {
            w0VarM.f10243q = i;
            recyclerView.F0.add(w0VarM);
        } else {
            View view2 = w0VarM.f10230a;
            WeakHashMap weakHashMap = q0.v0.f7946a;
            q0.d0.s(view2, i);
        }
        w0VarM.f10242p = 0;
    }

    public final String toString() {
        return this.f10022b.toString() + ", hidden list:" + this.f10023c.size();
    }
}
