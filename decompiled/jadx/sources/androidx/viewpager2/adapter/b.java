package androidx.viewpager2.adapter;

import androidx.recyclerview.widget.RecyclerView;
import fd.n;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.d0;
import q0.v0;
import x1.b0;
import x1.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1195b;

    public /* synthetic */ b(Object obj, int i) {
        this.f1194a = i;
        this.f1195b = obj;
    }

    @Override // x1.b0
    public final void a() {
        switch (this.f1194a) {
            case 0:
                ((c) this.f1195b).c(true);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f1195b;
                recyclerView.k(null);
                recyclerView.f1155s0.f10197f = true;
                recyclerView.Y(true);
                if (!recyclerView.e.k()) {
                    recyclerView.requestLayout();
                }
                break;
        }
    }

    @Override // x1.b0
    public final void b(int i) {
        switch (this.f1194a) {
            case 0:
                a();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f1195b;
                recyclerView.k(null);
                n nVar = recyclerView.e;
                ArrayList arrayList = (ArrayList) nVar.f3961f;
                arrayList.add(nVar.m(4, i, 1));
                nVar.f3957a |= 4;
                if (arrayList.size() == 1) {
                    if (RecyclerView.Q0 && recyclerView.E && recyclerView.D) {
                        x xVar = recyclerView.f1156t;
                        WeakHashMap weakHashMap = v0.f7946a;
                        d0.m(recyclerView, xVar);
                    } else {
                        recyclerView.L = true;
                        recyclerView.requestLayout();
                    }
                }
                break;
        }
    }
}
