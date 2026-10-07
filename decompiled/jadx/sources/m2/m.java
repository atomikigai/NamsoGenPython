package m2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import q0.d0;
import q0.j0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Cloneable {
    public static final int[] E = {2, 1, 3, 4};
    public static final wa.d F = new wa.d();
    public static final ThreadLocal G = new ThreadLocal();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f7008v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f7009w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6999a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7000b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7001c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f7002d = null;
    public final ArrayList e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f7003f = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public gb.r f7004r = new gb.r(6);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public gb.r f7005s = new gb.r(6);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f7006t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f7007u = E;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f7010x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7011y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7012z = false;
    public boolean A = false;
    public ArrayList B = null;
    public ArrayList C = new ArrayList();
    public wa.d D = F;

    public static void b(gb.r rVar, View view, s sVar) {
        r.e eVar = (r.e) rVar.f4493a;
        r.e eVar2 = (r.e) rVar.f4496d;
        SparseArray sparseArray = (SparseArray) rVar.f4494b;
        r.h hVar = (r.h) rVar.f4495c;
        eVar.put(view, sVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap weakHashMap = v0.f7946a;
        String strK = j0.k(view);
        if (strK != null) {
            if (eVar2.containsKey(strK)) {
                eVar2.put(strK, null);
            } else {
                eVar2.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (hVar.c(itemIdAtPosition) < 0) {
                    d0.r(view, true);
                    hVar.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) hVar.b(itemIdAtPosition);
                if (view2 != null) {
                    d0.r(view2, false);
                    hVar.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static r.e n() {
        ThreadLocal threadLocal = G;
        r.e eVar = (r.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        r.e eVar2 = new r.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public static boolean s(s sVar, s sVar2, String str) {
        Object obj = sVar.f7023a.get(str);
        Object obj2 = sVar2.f7023a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(wa.d dVar) {
        if (dVar == null) {
            this.D = F;
        } else {
            this.D = dVar;
        }
    }

    public void C(long j4) {
        this.f7000b = j4;
    }

    public final void D() {
        if (this.f7011y == 0) {
            ArrayList arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((l) arrayList2.get(i)).d();
                }
            }
            this.A = false;
        }
        this.f7011y++;
    }

    public String E(String str) {
        StringBuilder sbB = u.e.b(str);
        sbB.append(getClass().getSimpleName());
        sbB.append("@");
        sbB.append(Integer.toHexString(hashCode()));
        sbB.append(": ");
        String string = sbB.toString();
        if (this.f7001c != -1) {
            string = q1.a.l(u.e.c(string, "dur("), this.f7001c, ") ");
        }
        if (this.f7000b != -1) {
            string = q1.a.l(u.e.c(string, "dly("), this.f7000b, ") ");
        }
        if (this.f7002d != null) {
            StringBuilder sbC = u.e.c(string, "interp(");
            sbC.append(this.f7002d);
            sbC.append(") ");
            string = sbC.toString();
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f7003f;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strH = da.v.h(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    strH = da.v.h(strH, ", ");
                }
                StringBuilder sbB2 = u.e.b(strH);
                sbB2.append(arrayList.get(i));
                strH = sbB2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (i10 > 0) {
                    strH = da.v.h(strH, ", ");
                }
                StringBuilder sbB3 = u.e.b(strH);
                sbB3.append(arrayList2.get(i10));
                strH = sbB3.toString();
            }
        }
        return da.v.h(strH, ")");
    }

    public void a(l lVar) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.add(lVar);
    }

    public abstract void c(s sVar);

    public final void d(View view, boolean z4) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            s sVar = new s(view);
            if (z4) {
                f(sVar);
            } else {
                c(sVar);
            }
            sVar.f7025c.add(this);
            e(sVar);
            if (z4) {
                b(this.f7004r, view, sVar);
            } else {
                b(this.f7005s, view, sVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), z4);
            }
        }
    }

    public abstract void f(s sVar);

    public final void g(ViewGroup viewGroup, boolean z4) {
        h(z4);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f7003f;
        if (size <= 0 && arrayList2.size() <= 0) {
            d(viewGroup, z4);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                s sVar = new s(viewFindViewById);
                if (z4) {
                    f(sVar);
                } else {
                    c(sVar);
                }
                sVar.f7025c.add(this);
                e(sVar);
                if (z4) {
                    b(this.f7004r, viewFindViewById, sVar);
                } else {
                    b(this.f7005s, viewFindViewById, sVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = (View) arrayList2.get(i10);
            s sVar2 = new s(view);
            if (z4) {
                f(sVar2);
            } else {
                c(sVar2);
            }
            sVar2.f7025c.add(this);
            e(sVar2);
            if (z4) {
                b(this.f7004r, view, sVar2);
            } else {
                b(this.f7005s, view, sVar2);
            }
        }
    }

    public final void h(boolean z4) {
        if (z4) {
            ((r.e) this.f7004r.f4493a).clear();
            ((SparseArray) this.f7004r.f4494b).clear();
            ((r.h) this.f7004r.f4495c).a();
        } else {
            ((r.e) this.f7005s.f4493a).clear();
            ((SparseArray) this.f7005s.f4494b).clear();
            ((r.h) this.f7005s.f4495c).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.C = new ArrayList();
            mVar.f7004r = new gb.r(6);
            mVar.f7005s = new gb.r(6);
            mVar.f7008v = null;
            mVar.f7009w = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator j(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public void k(ViewGroup viewGroup, gb.r rVar, gb.r rVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorJ;
        int i;
        int i10;
        View view;
        s sVar;
        Animator animator;
        s sVar2;
        r.e eVarN = n();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar3 = (s) arrayList.get(i11);
            s sVar4 = (s) arrayList2.get(i11);
            if (sVar3 != null && !sVar3.f7025c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f7025c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null) && ((sVar3 == null || sVar4 == null || q(sVar3, sVar4)) && (animatorJ = j(viewGroup, sVar3, sVar4)) != null)) {
                String str = this.f6999a;
                if (sVar4 != null) {
                    view = sVar4.f7024b;
                    String[] strArrO = o();
                    if (strArrO != null && strArrO.length > 0) {
                        sVar2 = new s(view);
                        s sVar5 = (s) ((r.e) rVar2.f4493a).get(view);
                        i = size;
                        if (sVar5 != null) {
                            int i12 = 0;
                            while (i12 < strArrO.length) {
                                String str2 = strArrO[i12];
                                sVar2.f7023a.put(str2, sVar5.f7023a.get(str2));
                                i12++;
                                i11 = i11;
                                sVar5 = sVar5;
                            }
                        }
                        i10 = i11;
                        int i13 = eVarN.f8100c;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= i13) {
                                animator = animatorJ;
                                break;
                            }
                            k kVar = (k) eVarN.get((Animator) eVarN.f(i14));
                            if (kVar.f6997c != null && kVar.f6995a == view && kVar.f6996b.equals(str) && kVar.f6997c.equals(sVar2)) {
                                animator = null;
                                break;
                            }
                            i14++;
                        }
                    } else {
                        i = size;
                        i10 = i11;
                        animator = animatorJ;
                        sVar2 = null;
                    }
                    animatorJ = animator;
                    sVar = sVar2;
                } else {
                    i = size;
                    i10 = i11;
                    view = sVar3.f7024b;
                    sVar = null;
                }
                if (animatorJ != null) {
                    v vVar = t.f7026a;
                    a0 a0Var = new a0(viewGroup);
                    k kVar2 = new k();
                    kVar2.f6995a = view;
                    kVar2.f6996b = str;
                    kVar2.f6997c = sVar;
                    kVar2.f6998d = a0Var;
                    kVar2.e = this;
                    eVarN.put(animatorJ, kVar2);
                    this.C.add(animatorJ);
                }
            } else {
                i = size;
                i10 = i11;
            }
            i11 = i10 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator2 = (Animator) this.C.get(sparseIntArray.keyAt(i15));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i15)) - Long.MAX_VALUE));
            }
        }
    }

    public final void l() {
        int i = this.f7011y - 1;
        this.f7011y = i;
        if (i == 0) {
            ArrayList arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((l) arrayList2.get(i10)).c(this);
                }
            }
            for (int i11 = 0; i11 < ((r.h) this.f7004r.f4495c).g(); i11++) {
                View view = (View) ((r.h) this.f7004r.f4495c).h(i11);
                if (view != null) {
                    WeakHashMap weakHashMap = v0.f7946a;
                    d0.r(view, false);
                }
            }
            for (int i12 = 0; i12 < ((r.h) this.f7005s.f4495c).g(); i12++) {
                View view2 = (View) ((r.h) this.f7005s.f4495c).h(i12);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = v0.f7946a;
                    d0.r(view2, false);
                }
            }
            this.A = true;
        }
    }

    public final s m(View view, boolean z4) {
        a aVar = this.f7006t;
        if (aVar != null) {
            return aVar.m(view, z4);
        }
        ArrayList arrayList = z4 ? this.f7008v : this.f7009w;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            s sVar = (s) arrayList.get(i);
            if (sVar == null) {
                return null;
            }
            if (sVar.f7024b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (s) (z4 ? this.f7009w : this.f7008v).get(i);
        }
        return null;
    }

    public String[] o() {
        return null;
    }

    public final s p(View view, boolean z4) {
        a aVar = this.f7006t;
        if (aVar != null) {
            return aVar.p(view, z4);
        }
        return (s) ((r.e) (z4 ? this.f7004r : this.f7005s).f4493a).get(view);
    }

    public boolean q(s sVar, s sVar2) {
        if (sVar != null && sVar2 != null) {
            String[] strArrO = o();
            if (strArrO != null) {
                for (String str : strArrO) {
                    if (s(sVar, sVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = sVar.f7023a.keySet().iterator();
                while (it.hasNext()) {
                    if (s(sVar, sVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean r(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f7003f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view);
    }

    public void t(View view) {
        if (this.A) {
            return;
        }
        r.e eVarN = n();
        int i = eVarN.f8100c;
        v vVar = t.f7026a;
        WindowId windowId = view.getWindowId();
        for (int i10 = i - 1; i10 >= 0; i10--) {
            k kVar = (k) eVarN.j(i10);
            if (kVar.f6995a != null && kVar.f6998d.f6980a.equals(windowId)) {
                ((Animator) eVarN.f(i10)).pause();
            }
        }
        ArrayList arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.B.clone();
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((l) arrayList2.get(i11)).a();
            }
        }
        this.f7012z = true;
    }

    public final String toString() {
        return E("");
    }

    public void u(l lVar) {
        ArrayList arrayList = this.B;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(lVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
    }

    public void v(View view) {
        if (this.f7012z) {
            if (!this.A) {
                r.e eVarN = n();
                int i = eVarN.f8100c;
                v vVar = t.f7026a;
                WindowId windowId = view.getWindowId();
                for (int i10 = i - 1; i10 >= 0; i10--) {
                    k kVar = (k) eVarN.j(i10);
                    if (kVar.f6995a != null && kVar.f6998d.f6980a.equals(windowId)) {
                        ((Animator) eVarN.f(i10)).resume();
                    }
                }
                ArrayList arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((l) arrayList2.get(i11)).e();
                    }
                }
            }
            this.f7012z = false;
        }
    }

    public void w() {
        D();
        r.e eVarN = n();
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (eVarN.containsKey(animator)) {
                D();
                if (animator != null) {
                    animator.addListener(new j(this, eVarN));
                    long j4 = this.f7001c;
                    if (j4 >= 0) {
                        animator.setDuration(j4);
                    }
                    long j10 = this.f7000b;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f7002d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new g6.m(this, 5));
                    animator.start();
                }
            }
        }
        this.C.clear();
        l();
    }

    public void x(long j4) {
        this.f7001c = j4;
    }

    public void z(TimeInterpolator timeInterpolator) {
        this.f7002d = timeInterpolator;
    }

    public void B() {
    }

    public void e(s sVar) {
    }

    public void y(com.bumptech.glide.d dVar) {
    }
}
