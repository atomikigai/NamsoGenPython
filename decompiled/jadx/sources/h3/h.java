package h3;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import app.namso_gen.spacehowen.CheckerHistoryActivity;
import app.namso_gen.spacehowen.NotificationHistoryActivity;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements uc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4714b;

    public /* synthetic */ h(Object obj, int i) {
        this.f4713a = i;
        this.f4714b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // uc.c
    public final Object c(Object obj, yb.d dVar) throws Throwable {
        z0.n nVar;
        switch (this.f4713a) {
            case 0:
                List list = (List) obj;
                CheckerHistoryActivity checkerHistoryActivity = (CheckerHistoryActivity) this.f4714b;
                n nVar2 = checkerHistoryActivity.N;
                if (nVar2 == null) {
                    jc.i.i("adapter");
                    throw null;
                }
                jc.i.e(list, "newItems");
                nVar2.e = list;
                nVar2.c();
                TextView textView = checkerHistoryActivity.L;
                if (textView != null) {
                    textView.setVisibility(list.isEmpty() ? 0 : 8);
                    return ub.k.f9073a;
                }
                jc.i.i("emptyView");
                throw null;
            case 1:
                List list2 = (List) obj;
                a2 a2Var = (a2) this.f4714b;
                n nVar3 = a2Var.f4617h0;
                if (nVar3 == null) {
                    jc.i.i("adapter");
                    throw null;
                }
                jc.i.e(list2, "newNotes");
                nVar3.e = list2;
                nVar3.c();
                View view = a2Var.f4616g0;
                if (view != null) {
                    view.setVisibility(list2.isEmpty() ? 0 : 8);
                    return ub.k.f9073a;
                }
                jc.i.i("emptyView");
                throw null;
            case 2:
                List list3 = (List) obj;
                NotificationHistoryActivity notificationHistoryActivity = (NotificationHistoryActivity) this.f4714b;
                g2 g2Var = notificationHistoryActivity.M;
                if (g2Var == null) {
                    jc.i.i("adapter");
                    throw null;
                }
                jc.i.e(list3, "newItems");
                g2Var.e = list3;
                g2Var.c();
                TextView textView2 = notificationHistoryActivity.L;
                if (textView2 != null) {
                    textView2.setVisibility(list3.isEmpty() ? 0 : 8);
                    return ub.k.f9073a;
                }
                jc.i.i("emptyView");
                throw null;
            case 3:
                List list4 = (List) obj;
                x2 x2Var = (x2) this.f4714b;
                z2 z2Var = x2Var.f4896h0;
                if (z2Var == null) {
                    jc.i.i("adapter");
                    throw null;
                }
                ArrayList arrayList = z2Var.f4924f;
                LinkedHashSet linkedHashSet = z2Var.f4925g;
                jc.i.e(list4, "newItems");
                ArrayList arrayList2 = new ArrayList(vb.k.U(list4));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((i3.q) it.next()).f5196a);
                }
                linkedHashSet.retainAll(vb.i.q0(arrayList2));
                arrayList.clear();
                arrayList.addAll(list4);
                z2Var.c();
                z2Var.e.invoke(Integer.valueOf(linkedHashSet.size()));
                boolean zIsEmpty = list4.isEmpty();
                TextView textView3 = (TextView) x2Var.V().findViewById(R.id.textEmptyState);
                RecyclerView recyclerView = (RecyclerView) x2Var.V().findViewById(R.id.recyclerTempMailEmails);
                textView3.setVisibility(zIsEmpty ? 0 : 8);
                recyclerView.setVisibility(zIsEmpty ? 8 : 0);
                return ub.k.f9073a;
            case 4:
                ((jc.q) this.f4714b).f5776a = obj;
                throw new vc.a(this);
            default:
                if (dVar instanceof z0.n) {
                    nVar = (z0.n) dVar;
                    int i = nVar.f10890b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nVar.f10890b = i - Integer.MIN_VALUE;
                    } else {
                        nVar = new z0.n(this, dVar);
                    }
                } else {
                    nVar = new z0.n(this, dVar);
                }
                Object obj2 = nVar.f10889a;
                zb.a aVar = zb.a.f11555a;
                int i10 = nVar.f10890b;
                if (i10 == 0) {
                    r7.g.G(obj2);
                    uc.c cVar = (uc.c) this.f4714b;
                    z0.z zVar = (z0.z) obj;
                    if (zVar instanceof z0.h) {
                        throw ((z0.h) zVar).f10878a;
                    }
                    if (zVar instanceof z0.g) {
                        throw ((z0.g) zVar).f10877a;
                    }
                    if (!(zVar instanceof z0.b)) {
                        if (zVar instanceof z0.a0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new androidx.datastore.preferences.protobuf.d1();
                    }
                    Object obj3 = ((z0.b) zVar).f10863a;
                    nVar.f10890b = 1;
                    if (cVar.c(obj3, nVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj2);
                }
                return ub.k.f9073a;
        }
    }
}
