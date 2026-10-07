package androidx.viewpager2.adapter;

import a2.g;
import android.os.SystemClock;
import android.view.ViewParent;
import androidx.fragment.app.i0;
import androidx.fragment.app.s;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import gb.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import lb.q;
import lb.u;
import nb.f;
import r.h;
import rc.b0;
import rc.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1199d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1200f;

    public c(z9.c cVar, x xVar, a4.b bVar, f fVar, u uVar) {
        this.f1197b = xVar;
        this.f1198c = bVar;
        this.f1199d = fVar;
        this.e = uVar;
        int i = qc.a.f8058d;
        this.f1196a = qd.b.E(SystemClock.elapsedRealtime(), qc.c.MILLISECONDS);
        b();
        this.f1200f = new k(this, 1);
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public void b() {
        u uVar = (u) this.e;
        int i = uVar.e + 1;
        uVar.e = i;
        String strA = i == 0 ? uVar.f6949d : uVar.a();
        String str = uVar.f6949d;
        int i10 = uVar.e;
        uVar.f6947b.getClass();
        q qVar = new q(System.currentTimeMillis() * 1000, strA, str, i10);
        uVar.f6950f = qVar;
        b0.q(b0.b((x) this.f1197b), null, new g(this, qVar, null, 19), 3);
    }

    public void c(boolean z4) {
        int currentItem;
        s sVar;
        d dVar = (d) this.f1200f;
        ib.c cVar = dVar.f1204j;
        h hVar = dVar.f1202f;
        i0 i0Var = dVar.e;
        if (!i0Var.H() && ((ViewPager2) this.e).getScrollState() == 0 && hVar.g() != 0 && (currentItem = ((ViewPager2) this.e).getCurrentItem()) < 5) {
            long j4 = currentItem;
            if ((j4 != this.f1196a || z4) && (sVar = (s) hVar.b(j4)) != null && sVar.y()) {
                this.f1196a = j4;
                i0Var.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0Var);
                ArrayList arrayList = new ArrayList();
                int i = 0;
                s sVar2 = null;
                for (int i10 = 0; i10 < hVar.g(); i10++) {
                    long jD = hVar.d(i10);
                    s sVar3 = (s) hVar.h(i10);
                    if (sVar3.y()) {
                        if (jD != this.f1196a) {
                            aVar.l(sVar3, m.f1068d);
                            cVar.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = ((CopyOnWriteArrayList) cVar.f5256b).iterator();
                            if (it.hasNext()) {
                                throw q1.a.g(it);
                            }
                            arrayList.add(arrayList2);
                        } else {
                            sVar2 = sVar3;
                        }
                        boolean z10 = jD == this.f1196a;
                        if (sVar3.M != z10) {
                            sVar3.M = z10;
                        }
                    }
                }
                if (sVar2 != null) {
                    aVar.l(sVar2, m.e);
                    cVar.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = ((CopyOnWriteArrayList) cVar.f5256b).iterator();
                    if (it2.hasNext()) {
                        throw q1.a.g(it2);
                    }
                    arrayList.add(arrayList3);
                }
                if (aVar.f817a.isEmpty()) {
                    return;
                }
                aVar.f();
                Collections.reverse(arrayList);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    cVar.getClass();
                    ib.c.p((List) obj);
                }
            }
        }
    }

    public c(d dVar) {
        this.f1200f = dVar;
        this.f1196a = -1L;
    }
}
