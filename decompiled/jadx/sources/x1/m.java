package x1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0.h f10145f = new b0.h(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f10146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f10149d;

    public static w0 c(RecyclerView recyclerView, int i, long j4) {
        int iH = recyclerView.f1140f.h();
        for (int i10 = 0; i10 < iH; i10++) {
            w0 w0VarM = RecyclerView.M(recyclerView.f1140f.g(i10));
            if (w0VarM.f10232c == i && !w0VarM.f()) {
                return null;
            }
        }
        n0 n0Var = recyclerView.f1135c;
        try {
            recyclerView.T();
            w0 w0VarK = n0Var.k(i, j4);
            if (w0VarK != null) {
                if (!w0VarK.e() || w0VarK.f()) {
                    n0Var.a(w0VarK, false);
                } else {
                    n0Var.h(w0VarK.f10230a);
                }
            }
            return w0VarK;
        } finally {
            recyclerView.U(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i10) {
        if (recyclerView.D) {
            if (RecyclerView.L0 && !this.f10146a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f10147b == 0) {
                this.f10147b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        androidx.datastore.preferences.protobuf.h hVar = recyclerView.f1153r0;
        hVar.f648a = i;
        hVar.f649b = i10;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    public final void b(long j4) {
        l lVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        l lVar2;
        ArrayList arrayList = this.f10149d;
        ArrayList arrayList2 = this.f10146a;
        int size = arrayList2.size();
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i10);
            int windowVisibility = recyclerView3.getWindowVisibility();
            androidx.datastore.preferences.protobuf.h hVar = recyclerView3.f1153r0;
            if (windowVisibility == 0) {
                hVar.c(recyclerView3, false);
                i += hVar.f650c;
            }
        }
        arrayList.ensureCapacity(i);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                androidx.datastore.preferences.protobuf.h hVar2 = recyclerView4.f1153r0;
                int iAbs = Math.abs(hVar2.f649b) + Math.abs(hVar2.f648a);
                for (int i13 = 0; i13 < hVar2.f650c * 2; i13 += 2) {
                    if (i11 >= arrayList.size()) {
                        lVar2 = new l();
                        arrayList.add(lVar2);
                    } else {
                        lVar2 = (l) arrayList.get(i11);
                    }
                    int[] iArr = (int[]) hVar2.f651d;
                    int i14 = iArr[i13 + 1];
                    lVar2.f10137a = i14 <= iAbs;
                    lVar2.f10138b = iAbs;
                    lVar2.f10139c = i14;
                    lVar2.f10140d = recyclerView4;
                    lVar2.e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, f10145f);
        for (int i15 = 0; i15 < arrayList.size() && (recyclerView = (lVar = (l) arrayList.get(i15)).f10140d) != null; i15++) {
            w0 w0VarC = c(recyclerView, lVar.e, lVar.f10137a ? Long.MAX_VALUE : j4);
            if (w0VarC != null && w0VarC.f10231b != null && w0VarC.e() && !w0VarC.f() && (recyclerView2 = (RecyclerView) w0VarC.f10231b.get()) != null) {
                if (recyclerView2.O && recyclerView2.f1140f.h() != 0) {
                    n0 n0Var = recyclerView2.f1135c;
                    e0 e0Var = recyclerView2.f1132a0;
                    if (e0Var != null) {
                        e0Var.e();
                    }
                    h0 h0Var = recyclerView2.f1166y;
                    if (h0Var != null) {
                        h0Var.h0(n0Var);
                        recyclerView2.f1166y.i0(n0Var);
                    }
                    n0Var.f10154a.clear();
                    n0Var.f();
                }
                androidx.datastore.preferences.protobuf.h hVar3 = recyclerView2.f1153r0;
                hVar3.c(recyclerView2, true);
                if (hVar3.f650c != 0) {
                    try {
                        int i16 = m0.n.f6974a;
                        m0.m.a("RV Nested Prefetch");
                        s0 s0Var = recyclerView2.f1155s0;
                        z zVar = recyclerView2.f1164x;
                        s0Var.f10196d = 1;
                        s0Var.e = zVar.a();
                        s0Var.f10198g = false;
                        s0Var.h = false;
                        s0Var.i = false;
                        for (int i17 = 0; i17 < hVar3.f650c * 2; i17 += 2) {
                            c(recyclerView2, ((int[]) hVar3.f651d)[i17], j4);
                        }
                        m0.m.b();
                    } catch (Throwable th) {
                        int i18 = m0.n.f6974a;
                        m0.m.b();
                        throw th;
                    }
                }
            }
            lVar.f10137a = false;
            lVar.f10138b = 0;
            lVar.f10139c = 0;
            lVar.f10140d = null;
            lVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f10146a;
        try {
            int i = m0.n.f6974a;
            m0.m.a("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f10148c);
                }
            }
            this.f10147b = 0L;
        } finally {
            this.f10147b = 0L;
            int i11 = m0.n.f6974a;
            m0.m.b();
        }
    }
}
