package x1;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f10155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f10157d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m0 f10159g;
    public final /* synthetic */ RecyclerView h;

    public n0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f10154a = arrayList;
        this.f10155b = null;
        this.f10156c = new ArrayList();
        this.f10157d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f10158f = 2;
    }

    public final void a(w0 w0Var, boolean z4) {
        RecyclerView.l(w0Var);
        View view = w0Var.f10230a;
        RecyclerView recyclerView = this.h;
        y0 y0Var = recyclerView.f1169z0;
        if (y0Var != null) {
            x0 x0Var = y0Var.e;
            q0.v0.l(view, x0Var != null ? (q0.c) x0Var.e.remove(view) : null);
        }
        if (z4) {
            ArrayList arrayList = recyclerView.f1168z;
            if (arrayList.size() > 0) {
                throw da.v.e(arrayList, 0);
            }
            z zVar = recyclerView.f1164x;
            if (zVar != null) {
                zVar.j(w0Var);
            }
            if (recyclerView.f1155s0 != null) {
                recyclerView.f1152r.B(w0Var);
            }
            if (RecyclerView.M0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + w0Var);
            }
        }
        w0Var.f10245s = null;
        w0Var.f10244r = null;
        m0 m0VarC = c();
        m0VarC.getClass();
        int i = w0Var.f10234f;
        ArrayList arrayList2 = m0VarC.a(i).f10141a;
        if (((l0) m0VarC.f10150a.get(i)).f10142b <= arrayList2.size()) {
            p3.a.f(view);
        } else {
            if (RecyclerView.L0 && arrayList2.contains(w0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            w0Var.m();
            arrayList2.add(w0Var);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.f1155s0.b()) {
            return !recyclerView.f1155s0.f10198g ? i : recyclerView.e.g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f1155s0.b() + recyclerView.C());
    }

    public final m0 c() {
        if (this.f10159g == null) {
            m0 m0Var = new m0();
            m0Var.f10150a = new SparseArray();
            m0Var.f10151b = 0;
            m0Var.f10152c = Collections.newSetFromMap(new IdentityHashMap());
            this.f10159g = m0Var;
            d();
        }
        return this.f10159g;
    }

    public final void d() {
        RecyclerView recyclerView;
        z zVar;
        m0 m0Var = this.f10159g;
        if (m0Var == null || (zVar = (recyclerView = this.h).f1164x) == null || !recyclerView.D) {
            return;
        }
        m0Var.f10152c.add(zVar);
    }

    public final void e(z zVar, boolean z4) {
        m0 m0Var = this.f10159g;
        if (m0Var != null) {
            SparseArray sparseArray = m0Var.f10150a;
            Set set = m0Var.f10152c;
            set.remove(zVar);
            if (set.size() != 0 || z4) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((l0) sparseArray.get(sparseArray.keyAt(i))).f10141a;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    p3.a.f(((w0) arrayList.get(i10)).f10230a);
                }
            }
        }
    }

    public final void f() {
        ArrayList arrayList = this.f10156c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.R0) {
            androidx.datastore.preferences.protobuf.h hVar = this.h.f1153r0;
            int[] iArr = (int[]) hVar.f651d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            hVar.f650c = 0;
        }
    }

    public final void g(int i) {
        if (RecyclerView.M0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f10156c;
        w0 w0Var = (w0) arrayList.get(i);
        if (RecyclerView.M0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + w0Var);
        }
        a(w0Var, true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        w0 w0VarM = RecyclerView.M(view);
        boolean zJ = w0VarM.j();
        RecyclerView recyclerView = this.h;
        if (zJ) {
            recyclerView.removeDetachedView(view, false);
        }
        if (w0VarM.i()) {
            w0VarM.f10240n.l(w0VarM);
        } else if (w0VarM.p()) {
            w0VarM.f10236j &= -33;
        }
        i(w0VarM);
        if (recyclerView.f1132a0 == null || w0VarM.g()) {
            return;
        }
        recyclerView.f1132a0.d(w0VarM);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00de  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e9 A[LOOP:2: B:64:0x00dc->B:68:0x00e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x00ec A[EDGE_INSN: B:93:0x00ec->B:69:0x00ec BREAK  A[LOOP:1: B:60:0x00c7->B:67:0x00e6, LOOP_LABEL: LOOP:1: B:60:0x00c7->B:67:0x00e6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00ec A[EDGE_INSN: B:95:0x00ec->B:69:0x00ec BREAK  A[LOOP:1: B:60:0x00c7->B:67:0x00e6], SYNTHETIC] */
    public final void i(w0 w0Var) {
        boolean z4;
        boolean z10;
        int i;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView = this.h;
        androidx.datastore.preferences.protobuf.h hVar = recyclerView.f1153r0;
        boolean zI = w0Var.i();
        View view = w0Var.f10230a;
        boolean z11 = false;
        boolean z12 = true;
        if (zI || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(w0Var.i());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.C());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (w0Var.j()) {
            StringBuilder sb3 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb3.append(w0Var);
            throw new IllegalArgumentException(u3.b.a(recyclerView, sb3));
        }
        if (w0Var.o()) {
            throw new IllegalArgumentException(u3.b.a(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((w0Var.f10236j & 16) == 0) {
            WeakHashMap weakHashMap = q0.v0.f7946a;
            if (q0.d0.i(view)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        z zVar = recyclerView.f1164x;
        boolean z13 = zVar != null && z4 && zVar.h(w0Var);
        boolean z14 = RecyclerView.L0;
        ArrayList arrayList = this.f10156c;
        if (z14 && arrayList.contains(w0Var)) {
            StringBuilder sb4 = new StringBuilder("cached view received recycle internal? ");
            sb4.append(w0Var);
            throw new IllegalArgumentException(u3.b.a(recyclerView, sb4));
        }
        if (z13 || w0Var.g()) {
            if (this.f10158f <= 0 || (w0Var.f10236j & 526) != 0) {
                z10 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f10158f && size > 0) {
                    g(0);
                    size--;
                }
                if (RecyclerView.R0 && size > 0) {
                    int i13 = w0Var.f10232c;
                    if (((int[]) hVar.f651d) != null) {
                        int i14 = hVar.f650c * 2;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= i14) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i10 = ((w0) arrayList.get(i)).f10232c;
                                    if (((int[]) hVar.f651d) != null) {
                                        break;
                                    }
                                    i11 = hVar.f650c * 2;
                                    i12 = 0;
                                    while (true) {
                                        if (i12 < i11) {
                                            break loop1;
                                        } else if (((int[]) hVar.f651d)[i12] == i10) {
                                            break;
                                        } else {
                                            i12 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (((int[]) hVar.f651d)[i15] != i13) {
                                i15 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i10 = ((w0) arrayList.get(i)).f10232c;
                            if (((int[]) hVar.f651d) != null) {
                                break;
                                break;
                            }
                            i11 = hVar.f650c * 2;
                            i12 = 0;
                            while (true) {
                                if (i12 < i11) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) hVar.f651d)[i12] == i10) {
                                    break;
                                } else {
                                    i12 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, w0Var);
                z10 = true;
            }
            if (z10) {
                z12 = false;
            } else {
                a(w0Var, true);
            }
            z11 = z10;
        } else {
            if (RecyclerView.M0) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.C());
            }
            z12 = false;
        }
        recyclerView.f1152r.B(w0Var);
        if (z11 || z12 || !z4) {
            return;
        }
        p3.a.f(view);
        w0Var.f10245s = null;
        w0Var.f10244r = null;
    }

    public final void j(View view) {
        e0 e0Var;
        w0 w0VarM = RecyclerView.M(view);
        int i = w0VarM.f10236j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && w0VarM.k() && (e0Var = recyclerView.f1132a0) != null) {
            i iVar = (i) e0Var;
            if (w0VarM.c().isEmpty() && iVar.f10095g && !w0VarM.f()) {
                if (this.f10155b == null) {
                    this.f10155b = new ArrayList();
                }
                w0VarM.f10240n = this;
                w0VarM.f10241o = true;
                this.f10155b.add(w0VarM);
                return;
            }
        }
        if (w0VarM.f() && !w0VarM.h() && !recyclerView.f1164x.f10252b) {
            throw new IllegalArgumentException(u3.b.a(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        w0VarM.f10240n = this;
        w0VarM.f10241o = false;
        this.f10154a.add(w0VarM);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0202  */
    /* JADX WARN: Code duplicated, block: B:121:0x0204  */
    /* JADX WARN: Code duplicated, block: B:191:0x036a A[EDGE_INSN: B:191:0x036a->B:192:0x036b BREAK  A[LOOP:3: B:186:0x0352->B:190:0x0367]] */
    /* JADX WARN: Code duplicated, block: B:276:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:278:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:279:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:282:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:283:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:285:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:287:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:291:0x0513  */
    /* JADX WARN: Code duplicated, block: B:293:0x0519  */
    /* JADX WARN: Code duplicated, block: B:296:0x0526  */
    /* JADX WARN: Code duplicated, block: B:300:0x0558  */
    /* JADX WARN: Code duplicated, block: B:303:0x0561  */
    /* JADX WARN: Code duplicated, block: B:307:0x057d  */
    /* JADX WARN: Code duplicated, block: B:309:0x0581  */
    /* JADX WARN: Code duplicated, block: B:312:0x0592  */
    /* JADX WARN: Code duplicated, block: B:315:0x059f  */
    /* JADX WARN: Code duplicated, block: B:319:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:325:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:327:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:329:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:333:0x05df  */
    /* JADX WARN: Code duplicated, block: B:335:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:337:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:338:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:340:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:341:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:346:0x0607  */
    /* JADX WARN: Code duplicated, block: B:349:0x060c  */
    /* JADX WARN: Code duplicated, block: B:353:0x0615  */
    /* JADX WARN: Code duplicated, block: B:354:0x061f  */
    /* JADX WARN: Code duplicated, block: B:356:0x0625  */
    /* JADX WARN: Code duplicated, block: B:357:0x062f  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b A[EDGE_INSN: B:35:0x007b->B:36:0x007c BREAK  A[LOOP:0: B:14:0x0023->B:20:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:360:0x0635 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:362:0x0638  */
    /* JADX WARN: Instruction removed from duplicated block: B:296:0x0526, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:303:0x0561, please report this as an issue */
    public final w0 k(int i, long j4) {
        boolean z4;
        w0 w0VarF;
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        z zVar;
        boolean z12;
        long nanoTime;
        long j12;
        AccessibilityManager accessibilityManager;
        boolean z13;
        boolean z14;
        boolean z15;
        y0 y0Var;
        x0 x0Var;
        View.AccessibilityDelegate accessibilityDelegateC;
        q0.c cVar;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        i0 i0Var;
        RecyclerView recyclerViewH;
        w0 w0Var;
        int i10;
        View view;
        z zVar2;
        boolean z16;
        int size;
        int iG;
        RecyclerView recyclerView = this.h;
        s0 s0Var = recyclerView.f1155s0;
        if (i < 0 || i >= s0Var.b()) {
            StringBuilder sbD = u3.b.d(i, i, "Invalid item position ", "(", "). Item count:");
            sbD.append(s0Var.b());
            sbD.append(recyclerView.C());
            throw new IndexOutOfBoundsException(sbD.toString());
        }
        if (s0Var.f10198g) {
            ArrayList arrayList2 = this.f10155b;
            if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        if (recyclerView.f1164x.f10252b && (iG = recyclerView.e.g(i, 0)) > 0 && iG < recyclerView.f1164x.a()) {
                            long jB = recyclerView.f1164x.b(iG);
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size) {
                                    w0VarF = null;
                                    break;
                                }
                                w0 w0Var2 = (w0) this.f10155b.get(i12);
                                if (!w0Var2.p() && w0Var2.e == jB) {
                                    w0Var2.a(32);
                                    w0VarF = w0Var2;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            w0VarF = null;
                            break;
                        }
                    } else {
                        w0VarF = (w0) this.f10155b.get(i11);
                        if (!w0VarF.p() && w0VarF.b() == i) {
                            w0VarF.a(32);
                            break;
                        }
                        i11++;
                    }
                }
            } else {
                w0VarF = null;
                break;
            }
            z4 = w0VarF != null;
        } else {
            z4 = false;
            w0VarF = null;
        }
        ArrayList arrayList3 = this.f10154a;
        ArrayList arrayList4 = this.f10156c;
        if (w0VarF == null) {
            int size2 = arrayList3.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size2) {
                    ArrayList arrayList5 = recyclerView.f1140f.f10023c;
                    int size3 = arrayList5.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size3) {
                            z10 = true;
                            view = null;
                            break;
                        }
                        view = (View) arrayList5.get(i14);
                        w0 w0VarM = RecyclerView.M(view);
                        z10 = true;
                        if (w0VarM.b() == i && !w0VarM.f() && !w0VarM.h()) {
                            break;
                        }
                        i14++;
                    }
                    if (view == null) {
                        int size4 = arrayList4.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size4) {
                                w0VarF = null;
                                break;
                            }
                            w0 w0Var3 = (w0) arrayList4.get(i15);
                            if (!w0Var3.f() && w0Var3.b() == i && !w0Var3.d()) {
                                arrayList4.remove(i15);
                                if (RecyclerView.M0) {
                                    Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + w0Var3);
                                }
                                w0VarF = w0Var3;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        w0 w0VarM2 = RecyclerView.M(view);
                        b bVar = recyclerView.f1140f;
                        d6.e eVar = bVar.f10022b;
                        int iIndexOfChild = ((RecyclerView) bVar.f10021a.f8662a).indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        if (!eVar.d(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        eVar.a(iIndexOfChild);
                        bVar.j(view);
                        b bVar2 = recyclerView.f1140f;
                        d6.e eVar2 = bVar2.f10022b;
                        int iIndexOfChild2 = ((RecyclerView) bVar2.f10021a.f8662a).indexOfChild(view);
                        int iB = (iIndexOfChild2 == -1 || eVar2.d(iIndexOfChild2)) ? -1 : iIndexOfChild2 - eVar2.b(iIndexOfChild2);
                        if (iB == -1) {
                            StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb2.append(w0VarM2);
                            throw new IllegalStateException(u3.b.a(recyclerView, sb2));
                        }
                        recyclerView.f1140f.c(iB);
                        j(view);
                        w0VarM2.a(8224);
                        w0VarF = w0VarM2;
                        break;
                    }
                } else {
                    w0 w0Var4 = (w0) arrayList3.get(i13);
                    if (!w0Var4.p() && w0Var4.b() == i && !w0Var4.f() && (s0Var.f10198g || !w0Var4.h())) {
                        w0Var4.a(32);
                        w0VarF = w0Var4;
                        z10 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (w0VarF != null) {
                if (!w0VarF.h()) {
                    int i16 = w0VarF.f10232c;
                    if (i16 < 0 || i16 >= recyclerView.f1164x.a()) {
                        StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb3.append(w0VarF);
                        throw new IndexOutOfBoundsException(u3.b.a(recyclerView, sb3));
                    }
                    if (s0Var.f10198g) {
                        zVar2 = recyclerView.f1164x;
                        if (zVar2.f10252b) {
                        }
                        z16 = z10;
                    } else {
                        recyclerView.f1164x.getClass();
                        if (w0VarF.f10234f != 0) {
                            z16 = false;
                        } else {
                            zVar2 = recyclerView.f1164x;
                            if (zVar2.f10252b || w0VarF.e == zVar2.b(w0VarF.f10232c)) {
                                z16 = z10;
                            } else {
                                z16 = false;
                            }
                        }
                    }
                } else {
                    if (RecyclerView.L0 && !s0Var.f10198g) {
                        throw new IllegalStateException(u3.b.a(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z16 = s0Var.f10198g;
                }
                if (z16) {
                    z4 = z10;
                } else {
                    w0VarF.a(4);
                    if (w0VarF.i()) {
                        recyclerView.removeDetachedView(w0VarF.f10230a, false);
                        w0VarF.f10240n.l(w0VarF);
                    } else if (w0VarF.p()) {
                        w0VarF.f10236j &= -33;
                    }
                    i(w0VarF);
                    w0VarF = null;
                }
            }
        } else {
            z10 = true;
        }
        if (w0VarF == null) {
            int iG2 = recyclerView.e.g(i, 0);
            if (iG2 >= 0) {
                j10 = 3;
                if (iG2 < recyclerView.f1164x.a()) {
                    recyclerView.f1164x.getClass();
                    z zVar3 = recyclerView.f1164x;
                    if (zVar3.f10252b) {
                        long jB2 = zVar3.b(iG2);
                        int size5 = arrayList3.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                i10 = iG2;
                                j11 = 4;
                                int size6 = arrayList4.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        w0 w0Var5 = (w0) arrayList4.get(size6);
                                        if (w0Var5.e != jB2 || w0Var5.d()) {
                                            size6--;
                                        } else {
                                            if (w0Var5.f10234f == 0) {
                                                arrayList4.remove(size6);
                                                w0VarF = w0Var5;
                                                break;
                                            }
                                            g(size6);
                                        }
                                    }
                                    w0VarF = null;
                                    break;
                                }
                            }
                            j11 = 4;
                            w0 w0Var6 = (w0) arrayList3.get(size5);
                            i10 = iG2;
                            long j13 = w0Var6.e;
                            View view2 = w0Var6.f10230a;
                            if (j13 == jB2 && !w0Var6.p()) {
                                if (w0Var6.f10234f == 0) {
                                    w0Var6.a(32);
                                    if (w0Var6.h() && !s0Var.f10198g) {
                                        w0Var6.f10236j = (w0Var6.f10236j & (-15)) | 2;
                                    }
                                    w0VarF = w0Var6;
                                    break;
                                }
                                arrayList3.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                w0 w0VarM3 = RecyclerView.M(view2);
                                w0VarM3.f10240n = null;
                                w0VarM3.f10241o = false;
                                w0VarM3.f10236j &= -33;
                                i(w0VarM3);
                            }
                            size5--;
                            iG2 = i10;
                        }
                        if (w0VarF != null) {
                            w0VarF.f10232c = i10;
                            z4 = z10;
                        }
                    } else {
                        j11 = 4;
                    }
                    if (w0VarF == null) {
                        if (RecyclerView.M0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                        }
                        l0 l0Var = (l0) c().f10150a.get(0);
                        if (l0Var == null) {
                            w0Var = null;
                            break;
                        }
                        ArrayList arrayList6 = l0Var.f10141a;
                        if (!arrayList6.isEmpty()) {
                            int size7 = arrayList6.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    w0Var = null;
                                    break;
                                }
                                if (!((w0) arrayList6.get(size7)).d()) {
                                    w0Var = (w0) arrayList6.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            w0Var = null;
                            break;
                        }
                        if (w0Var != null) {
                            w0Var.m();
                            boolean z17 = RecyclerView.L0;
                        }
                        w0VarF = w0Var;
                    }
                    if (w0VarF == null) {
                        long nanoTime2 = recyclerView.getNanoTime();
                        if (j4 != Long.MAX_VALUE) {
                            long j14 = this.f10159g.a(0).f10143c;
                            if (!((j14 == 0 || j14 + nanoTime2 < j4) ? z10 : false)) {
                                return null;
                            }
                        }
                        z zVar4 = recyclerView.f1164x;
                        zVar4.getClass();
                        try {
                            int i17 = m0.n.f6974a;
                            m0.m.a("RV CreateView");
                            w0VarF = zVar4.f(recyclerView);
                            View view3 = w0VarF.f10230a;
                            if (view3.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            w0VarF.f10234f = 0;
                            m0.m.b();
                            if (RecyclerView.R0 && (recyclerViewH = RecyclerView.H(view3)) != null) {
                                w0VarF.f10231b = new WeakReference(recyclerViewH);
                            }
                            long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                            l0 l0VarA = this.f10159g.a(0);
                            long j15 = l0VarA.f10143c;
                            if (j15 != 0) {
                                nanoTime3 = (nanoTime3 / j11) + ((j15 / j11) * 3);
                            }
                            l0VarA.f10143c = nanoTime3;
                            if (RecyclerView.M0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                            }
                        } catch (Throwable th) {
                            int i18 = m0.n.f6974a;
                            m0.m.b();
                            throw th;
                        }
                    }
                }
            }
            StringBuilder sbD2 = u3.b.d(i, iG2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
            sbD2.append(s0Var.b());
            sbD2.append(recyclerView.C());
            throw new IndexOutOfBoundsException(sbD2.toString());
        }
        j10 = 3;
        j11 = 4;
        View view4 = w0VarF.f10230a;
        if (z4 && !s0Var.f10198g) {
            int i19 = w0VarF.f10236j;
            if ((i19 & 8192) != 0 ? z10 : false) {
                w0VarF.f10236j = i19 & (-8193);
                if (s0Var.f10199j) {
                    e0.b(w0VarF);
                    e0 e0Var = recyclerView.f1132a0;
                    w0VarF.c();
                    e0Var.getClass();
                    q0.s sVar = new q0.s();
                    sVar.a(w0VarF);
                    recyclerView.Z(w0VarF, sVar);
                }
            }
        }
        if (!s0Var.f10198g || !w0VarF.e()) {
            if (w0VarF.e()) {
                if (((w0VarF.f10236j & 2) != 0 ? z10 : false) || w0VarF.f()) {
                }
                layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 == null) {
                    i0Var = (i0) recyclerView.generateDefaultLayoutParams();
                    view4.setLayoutParams(i0Var);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    i0Var = (i0) layoutParams2;
                } else {
                    i0Var = (i0) recyclerView.generateLayoutParams(layoutParams2);
                    view4.setLayoutParams(i0Var);
                }
                i0Var.f10105a = w0VarF;
                if (z4 || !z15) {
                    z14 = false;
                }
                i0Var.f10108d = z14;
                return w0VarF;
            }
            if (RecyclerView.L0 && w0VarF.h()) {
                StringBuilder sb4 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb4.append(w0VarF);
                throw new IllegalStateException(u3.b.a(recyclerView, sb4));
            }
            int iG3 = recyclerView.e.g(i, 0);
            w0VarF.f10245s = null;
            w0VarF.f10244r = recyclerView;
            int i20 = w0VarF.f10234f;
            long nanoTime4 = recyclerView.getNanoTime();
            if (j4 != Long.MAX_VALUE) {
                long j16 = this.f10159g.a(i20).f10144d;
                if (j16 == 0 || j16 + nanoTime4 < j4) {
                    if (w0VarF.j()) {
                        recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    zVar = recyclerView.f1164x;
                    zVar.getClass();
                    if (w0VarF.f10245s == null) {
                        z12 = z10;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        w0VarF.f10232c = iG3;
                        if (zVar.f10252b) {
                            w0VarF.e = zVar.b(iG3);
                        }
                        w0VarF.f10236j = (w0VarF.f10236j & (-520)) | 1;
                        int i21 = m0.n.f6974a;
                        m0.m.a("RV OnBindView");
                    }
                    w0VarF.f10245s = zVar;
                    if (RecyclerView.L0) {
                        if (view4.getParent() == null) {
                            WeakHashMap weakHashMap = q0.v0.f7946a;
                            if (q0.g0.b(view4) != w0VarF.j()) {
                                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + w0VarF.j() + ", attached to window: " + q0.g0.b(view4) + ", holder: " + w0VarF);
                            }
                        }
                        if (view4.getParent() == null) {
                            WeakHashMap weakHashMap2 = q0.v0.f7946a;
                            if (q0.g0.b(view4)) {
                                throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + w0VarF);
                            }
                        }
                    }
                    w0VarF.c();
                    zVar.e(w0VarF, iG3);
                    if (z12) {
                        arrayList = w0VarF.f10237k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        w0VarF.f10236j &= -1025;
                        layoutParams = view4.getLayoutParams();
                        if (layoutParams instanceof i0) {
                            ((i0) layoutParams).f10107c = z10;
                        }
                        int i22 = m0.n.f6974a;
                        m0.m.b();
                    }
                    if (z11) {
                        recyclerView.detachViewFromParent(view4);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    l0 l0VarA2 = this.f10159g.a(w0VarF.f10234f);
                    j12 = l0VarA2.f10144d;
                    if (j12 != 0) {
                        nanoTime = (nanoTime / j11) + ((j12 / j11) * j10);
                    }
                    l0VarA2.f10144d = nanoTime;
                    accessibilityManager = recyclerView.M;
                    if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        WeakHashMap weakHashMap3 = q0.v0.f7946a;
                        z14 = true;
                        if (q0.d0.c(view4) == 0) {
                            q0.d0.s(view4, 1);
                        }
                        y0Var = recyclerView.f1169z0;
                        if (y0Var != null) {
                            x0Var = y0Var.e;
                            if (x0Var != null) {
                                accessibilityDelegateC = q0.v0.c(view4);
                                if (accessibilityDelegateC == null) {
                                    cVar = null;
                                } else if (accessibilityDelegateC instanceof q0.a) {
                                    cVar = ((q0.a) accessibilityDelegateC).f7877a;
                                } else {
                                    cVar = new q0.c(accessibilityDelegateC);
                                }
                                if (cVar != null && cVar != x0Var) {
                                    x0Var.e.put(view4, cVar);
                                }
                            }
                            q0.v0.l(view4, x0Var);
                        }
                    } else {
                        z14 = true;
                    }
                    if (s0Var.f10198g) {
                        w0VarF.f10235g = i;
                    }
                    z15 = z14;
                } else {
                    z15 = false;
                    z14 = z10;
                }
            } else {
                if (w0VarF.j()) {
                    recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                    z11 = z10;
                } else {
                    z11 = false;
                }
                zVar = recyclerView.f1164x;
                zVar.getClass();
                if (w0VarF.f10245s == null) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (z12) {
                    w0VarF.f10232c = iG3;
                    if (zVar.f10252b) {
                        w0VarF.e = zVar.b(iG3);
                    }
                    w0VarF.f10236j = (w0VarF.f10236j & (-520)) | 1;
                    int i23 = m0.n.f6974a;
                    m0.m.a("RV OnBindView");
                }
                w0VarF.f10245s = zVar;
                if (RecyclerView.L0) {
                    if (view4.getParent() == null) {
                        WeakHashMap weakHashMap4 = q0.v0.f7946a;
                        if (q0.g0.b(view4) != w0VarF.j()) {
                            throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + w0VarF.j() + ", attached to window: " + q0.g0.b(view4) + ", holder: " + w0VarF);
                        }
                    }
                    if (view4.getParent() == null) {
                        WeakHashMap weakHashMap5 = q0.v0.f7946a;
                        if (q0.g0.b(view4)) {
                            throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + w0VarF);
                        }
                    }
                }
                w0VarF.c();
                zVar.e(w0VarF, iG3);
                if (z12) {
                    arrayList = w0VarF.f10237k;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    w0VarF.f10236j &= -1025;
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams instanceof i0) {
                        ((i0) layoutParams).f10107c = z10;
                    }
                    int i24 = m0.n.f6974a;
                    m0.m.b();
                }
                if (z11) {
                    recyclerView.detachViewFromParent(view4);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime4;
                l0 l0VarA3 = this.f10159g.a(w0VarF.f10234f);
                j12 = l0VarA3.f10144d;
                if (j12 != 0) {
                    nanoTime = (nanoTime / j11) + ((j12 / j11) * j10);
                }
                l0VarA3.f10144d = nanoTime;
                accessibilityManager = recyclerView.M;
                if (accessibilityManager == null) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (z13) {
                    WeakHashMap weakHashMap6 = q0.v0.f7946a;
                    z14 = true;
                    if (q0.d0.c(view4) == 0) {
                        q0.d0.s(view4, 1);
                    }
                    y0Var = recyclerView.f1169z0;
                    if (y0Var != null) {
                        x0Var = y0Var.e;
                        if (x0Var != null) {
                            accessibilityDelegateC = q0.v0.c(view4);
                            if (accessibilityDelegateC == null) {
                                cVar = null;
                            } else if (accessibilityDelegateC instanceof q0.a) {
                                cVar = ((q0.a) accessibilityDelegateC).f7877a;
                            } else {
                                cVar = new q0.c(accessibilityDelegateC);
                            }
                            if (cVar != null) {
                                x0Var.e.put(view4, cVar);
                            }
                        }
                        q0.v0.l(view4, x0Var);
                    }
                } else {
                    z14 = true;
                }
                if (s0Var.f10198g) {
                    w0VarF.f10235g = i;
                }
                z15 = z14;
            }
            layoutParams2 = view4.getLayoutParams();
            if (layoutParams2 == null) {
                i0Var = (i0) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(i0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                i0Var = (i0) recyclerView.generateLayoutParams(layoutParams2);
                view4.setLayoutParams(i0Var);
            } else {
                i0Var = (i0) layoutParams2;
            }
            i0Var.f10105a = w0VarF;
            if (z4) {
                z14 = false;
            } else {
                z14 = false;
            }
            i0Var.f10108d = z14;
            return w0VarF;
        }
        w0VarF.f10235g = i;
        z14 = z10;
        z15 = false;
        layoutParams2 = view4.getLayoutParams();
        if (layoutParams2 == null) {
            i0Var = (i0) recyclerView.generateDefaultLayoutParams();
            view4.setLayoutParams(i0Var);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            i0Var = (i0) recyclerView.generateLayoutParams(layoutParams2);
            view4.setLayoutParams(i0Var);
        } else {
            i0Var = (i0) layoutParams2;
        }
        i0Var.f10105a = w0VarF;
        if (z4) {
            z14 = false;
        } else {
            z14 = false;
        }
        i0Var.f10108d = z14;
        return w0VarF;
    }

    public final void l(w0 w0Var) {
        if (w0Var.f10241o) {
            this.f10155b.remove(w0Var);
        } else {
            this.f10154a.remove(w0Var);
        }
        w0Var.f10240n = null;
        w0Var.f10241o = false;
        w0Var.f10236j &= -33;
    }

    public final void m() {
        h0 h0Var = this.h.f1166y;
        this.f10158f = this.e + (h0Var != null ? h0Var.f10088j : 0);
        ArrayList arrayList = this.f10156c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f10158f; size--) {
            g(size);
        }
    }
}
