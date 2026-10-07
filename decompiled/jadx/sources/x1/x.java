package x1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f10247b;

    public /* synthetic */ x(RecyclerView recyclerView, int i) {
        this.f10246a = i;
        this.f10247b = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        int i = this.f10246a;
        RecyclerView recyclerView = this.f10247b;
        switch (i) {
            case 0:
                if (recyclerView.F && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.D) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.I) {
                        recyclerView.p();
                    } else {
                        recyclerView.H = true;
                    }
                    break;
                }
                break;
            default:
                e0 e0Var = recyclerView.f1132a0;
                if (e0Var != null) {
                    i iVar = (i) e0Var;
                    long j4 = iVar.f10045d;
                    ArrayList arrayList = iVar.h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = iVar.f10096j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = iVar.f10097k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = iVar.i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z4 = false;
                    } else {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            int i11 = i10 + 1;
                            w0 w0Var = (w0) obj;
                            View view = w0Var.f10230a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            iVar.f10103q.add(w0Var);
                            viewPropertyAnimatorAnimate.setDuration(j4).alpha(0.0f).setListener(new d(iVar, w0Var, viewPropertyAnimatorAnimate, view)).start();
                            i10 = i11;
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z10 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            iVar.f10099m.add(arrayList5);
                            arrayList2.clear();
                            c cVar = new c(iVar, arrayList5, 0);
                            if (z10) {
                                cVar.run();
                            } else {
                                View view2 = ((h) arrayList5.get(0)).f10078a.f10230a;
                                WeakHashMap weakHashMap = q0.v0.f7946a;
                                q0.d0.n(view2, cVar, j4);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            iVar.f10100n.add(arrayList6);
                            arrayList3.clear();
                            c cVar2 = new c(iVar, arrayList6, 1);
                            if (z10) {
                                cVar2.run();
                            } else {
                                View view3 = ((g) arrayList6.get(0)).f10065a.f10230a;
                                WeakHashMap weakHashMap2 = q0.v0.f7946a;
                                q0.d0.n(view3, cVar2, j4);
                            }
                        }
                        if (zIsEmpty4) {
                            z4 = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            iVar.f10098l.add(arrayList7);
                            arrayList4.clear();
                            c cVar3 = new c(iVar, arrayList7, 2);
                            if (z10 && zIsEmpty2 && zIsEmpty3) {
                                cVar3.run();
                                z4 = false;
                            } else {
                                if (z10) {
                                    j4 = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? iVar.e : 0L, zIsEmpty3 ? 0L : iVar.f10046f) + j4;
                                z4 = false;
                                View view4 = ((w0) arrayList7.get(0)).f10230a;
                                WeakHashMap weakHashMap3 = q0.v0.f7946a;
                                q0.d0.n(view4, cVar3, jMax);
                            }
                        }
                    }
                } else {
                    z4 = false;
                }
                recyclerView.f1167y0 = z4;
                break;
        }
    }
}
