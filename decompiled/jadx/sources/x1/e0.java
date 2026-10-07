package x1;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q3.e f10042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f10043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10045d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10046f;

    public static void b(w0 w0Var) {
        RecyclerView recyclerView;
        int i = w0Var.f10236j;
        if (w0Var.f() || (i & 4) != 0 || (recyclerView = w0Var.f10244r) == null) {
            return;
        }
        recyclerView.J(w0Var);
    }

    public abstract boolean a(w0 w0Var, w0 w0Var2, q0.s sVar, q0.s sVar2);

    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x007c, please report this as an issue */
    public final void c(w0 w0Var) {
        q3.e eVar = this.f10042a;
        if (eVar != null) {
            RecyclerView recyclerView = (RecyclerView) eVar.f7990a;
            boolean z4 = true;
            w0Var.n(true);
            View view = w0Var.f10230a;
            if (w0Var.h != null && w0Var.i == null) {
                w0Var.h = null;
            }
            w0Var.i = null;
            if ((w0Var.f10236j & 16) != 0) {
                return;
            }
            n0 n0Var = recyclerView.f1135c;
            recyclerView.k0();
            b bVar = recyclerView.f1140f;
            d6.e eVar2 = bVar.f10022b;
            ta.c cVar = bVar.f10021a;
            int i = bVar.f10024d;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    bVar.f10024d = 2;
                    int iIndexOfChild = ((RecyclerView) cVar.f8662a).indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        bVar.j(view);
                    } else if (eVar2.d(iIndexOfChild)) {
                        eVar2.g(iIndexOfChild);
                        bVar.j(view);
                        cVar.i(iIndexOfChild);
                    } else {
                        bVar.f10024d = 0;
                    }
                    bVar.f10024d = 0;
                    if (z4) {
                        w0 w0VarM = RecyclerView.M(view);
                        n0Var.l(w0VarM);
                        n0Var.i(w0VarM);
                        if (RecyclerView.M0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.l0(!z4);
                    if (z4 && w0Var.j()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    bVar.f10024d = 0;
                    throw th;
                }
            }
            if (bVar.e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z4 = false;
            if (z4) {
                w0 w0VarM2 = RecyclerView.M(view);
                n0Var.l(w0VarM2);
                n0Var.i(w0VarM2);
                if (RecyclerView.M0) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.l0(!z4);
            if (z4) {
            }
        }
    }

    public abstract void d(w0 w0Var);

    public abstract void e();

    public abstract boolean f();
}
