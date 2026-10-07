package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import app.namso_gen.spacehowen.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public boolean A;
    public boolean B;
    public ArrayList C;
    public ArrayList D;
    public ArrayList E;
    public k0 F;
    public final androidx.activity.i G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f878b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f880d;
    public ArrayList e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.activity.b0 f882g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final aa.c f884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v f887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public qd.b f888o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s f889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public s f890q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f891r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z9.c f892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.activity.result.d f893t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.activity.result.d f894u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.activity.result.d f895v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayDeque f896w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f897x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f898y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f899z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f877a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.l f879c = new a2.l(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f881f = new z(this);
    public final b0 h = new b0(this);
    public final AtomicInteger i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f883j = Collections.synchronizedMap(new HashMap());

    public i0() {
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new wa.d(this);
        this.f884k = new aa.c(this);
        this.f885l = new CopyOnWriteArrayList();
        this.f886m = -1;
        this.f891r = new c0(this);
        this.f892s = new z9.c();
        this.f896w = new ArrayDeque();
        this.G = new androidx.activity.i(this, 3);
    }

    public static boolean D(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean E(s sVar) {
        sVar.getClass();
        a2.l lVar = sVar.E.f879c;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) lVar.f44c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var.f949c);
            } else {
                arrayList.add(null);
            }
        }
        int size = arrayList.size();
        boolean zE = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            s sVar2 = (s) obj;
            if (sVar2 != null) {
                zE = E(sVar2);
            }
            if (zE) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(s sVar) {
        if (sVar == null) {
            return true;
        }
        if (sVar.M) {
            return sVar.C == null || F(sVar.F);
        }
        return false;
    }

    public static boolean G(s sVar) {
        if (sVar == null) {
            return true;
        }
        i0 i0Var = sVar.C;
        return sVar.equals(i0Var.f890q) && G(i0Var.f889p);
    }

    public static void W(s sVar) {
        if (D(2)) {
            Log.v("FragmentManager", "show: " + sVar);
        }
        if (sVar.J) {
            sVar.J = false;
            sVar.T = !sVar.T;
        }
    }

    public final c0 A() {
        s sVar = this.f889p;
        return sVar != null ? sVar.C.A() : this.f891r;
    }

    public final z9.c B() {
        s sVar = this.f889p;
        return sVar != null ? sVar.C.B() : this.f892s;
    }

    public final void C(s sVar) {
        if (D(2)) {
            Log.v("FragmentManager", "hide: " + sVar);
        }
        if (sVar.J) {
            return;
        }
        sVar.J = true;
        sVar.T = true ^ sVar.T;
        V(sVar);
    }

    public final boolean H() {
        return this.f898y || this.f899z;
    }

    public final void I(int i, boolean z4) {
        v vVar;
        if (this.f887n == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i != this.f886m) {
            this.f886m = i;
            a2.l lVar = this.f879c;
            HashMap map = (HashMap) lVar.f44c;
            ArrayList arrayList = (ArrayList) lVar.f43b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                o0 o0Var = (o0) map.get(((s) obj).e);
                if (o0Var != null) {
                    o0Var.k();
                }
            }
            for (o0 o0Var2 : map.values()) {
                if (o0Var2 != null) {
                    o0Var2.k();
                    s sVar = o0Var2.f949c;
                    if (sVar.f983w && sVar.B <= 0) {
                        lVar.E(o0Var2);
                    }
                }
            }
            X();
            if (this.f897x && (vVar = this.f887n) != null && this.f886m == 7) {
                vVar.f1000t.e();
                this.f897x = false;
            }
        }
    }

    public final void J() {
        if (this.f887n == null) {
            return;
        }
        this.f898y = false;
        this.f899z = false;
        this.F.i = false;
        for (s sVar : this.f879c.x()) {
            if (sVar != null) {
                sVar.E.J();
            }
        }
    }

    public final void K() {
        s(new h0(this, -1, 0), false);
    }

    public final boolean L() {
        u(false);
        t(true);
        s sVar = this.f890q;
        if (sVar != null && sVar.q().L()) {
            return true;
        }
        boolean zM = M(this.C, this.D, -1, 0);
        if (zM) {
            this.f878b = true;
            try {
                O(this.C, this.D);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        Z();
        q();
        ((HashMap) this.f879c.f44c).values().removeAll(Collections.singleton(null));
        return zM;
    }

    public final boolean M(ArrayList arrayList, ArrayList arrayList2, int i, int i10) {
        int size;
        a aVar;
        ArrayList arrayList3 = this.f880d;
        if (arrayList3 == null) {
            return false;
        }
        if (i < 0 && (i10 & 1) == 0) {
            int size2 = arrayList3.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(this.f880d.remove(size2));
            arrayList2.add(Boolean.TRUE);
            return true;
        }
        if (i >= 0) {
            size = arrayList3.size() - 1;
            while (size >= 0) {
                a aVar2 = (a) this.f880d.get(size);
                if (i >= 0 && i == aVar2.f832s) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return false;
            }
            if ((i10 & 1) != 0) {
                do {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    aVar = (a) this.f880d.get(size);
                    if (i < 0) {
                        break;
                    }
                } while (i == aVar.f832s);
            }
        } else {
            size = -1;
        }
        if (size == this.f880d.size() - 1) {
            return false;
        }
        for (int size3 = this.f880d.size() - 1; size3 > size; size3--) {
            arrayList.add(this.f880d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void N(s sVar) {
        if (D(2)) {
            Log.v("FragmentManager", "remove: " + sVar + " nesting=" + sVar.B);
        }
        boolean z4 = sVar.B > 0;
        if (sVar.K && z4) {
            return;
        }
        a2.l lVar = this.f879c;
        synchronized (((ArrayList) lVar.f43b)) {
            ((ArrayList) lVar.f43b).remove(sVar);
        }
        sVar.f982v = false;
        if (E(sVar)) {
            this.f897x = true;
        }
        sVar.f983w = true;
        V(sVar);
    }

    public final void O(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i < size) {
            if (!((a) arrayList.get(i)).f829p) {
                if (i10 != i) {
                    w(arrayList, arrayList2, i10, i);
                }
                i10 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((a) arrayList.get(i10)).f829p) {
                        i10++;
                    }
                }
                w(arrayList, arrayList2, i, i10);
                i = i10 - 1;
            }
            i++;
        }
        if (i10 != size) {
            w(arrayList, arrayList2, i10, size);
        }
    }

    public final void P(Parcelable parcelable) {
        aa.c cVar;
        int i;
        int i10;
        o0 o0Var;
        if (parcelable == null) {
            return;
        }
        j0 j0Var = (j0) parcelable;
        if (j0Var.f901a == null) {
            return;
        }
        a2.l lVar = this.f879c;
        ((HashMap) lVar.f44c).clear();
        ArrayList arrayList = j0Var.f901a;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            cVar = this.f884k;
            i = 2;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            m0 m0Var = (m0) obj;
            if (m0Var != null) {
                s sVar = (s) this.F.f910d.get(m0Var.f929b);
                if (sVar != null) {
                    if (D(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + sVar);
                    }
                    o0Var = new o0(cVar, lVar, sVar, m0Var);
                } else {
                    o0Var = new o0(this.f884k, this.f879c, this.f887n.f997f.getClassLoader(), A(), m0Var);
                }
                s sVar2 = o0Var.f949c;
                sVar2.C = this;
                if (D(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + sVar2.e + "): " + sVar2);
                }
                o0Var.m(this.f887n.f997f.getClassLoader());
                lVar.D(o0Var);
                o0Var.e = this.f886m;
            }
        }
        k0 k0Var = this.F;
        k0Var.getClass();
        ArrayList arrayList2 = new ArrayList(k0Var.f910d.values());
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            s sVar3 = (s) obj2;
            if (((HashMap) lVar.f44c).get(sVar3.e) == null) {
                if (D(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + sVar3 + " that was not found in the set of active Fragments " + j0Var.f901a);
                }
                this.F.c(sVar3);
                sVar3.C = this;
                o0 o0Var2 = new o0(cVar, lVar, sVar3);
                o0Var2.e = 1;
                o0Var2.k();
                sVar3.f983w = true;
                o0Var2.k();
            }
        }
        ArrayList arrayList3 = j0Var.f902b;
        ((ArrayList) lVar.f43b).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                String str = (String) obj3;
                s sVarN = lVar.n(str);
                if (sVarN == null) {
                    throw new IllegalStateException(da.v.i("No instantiated fragment for (", str, ")"));
                }
                if (D(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + sVarN);
                }
                lVar.g(sVarN);
            }
        }
        s sVar4 = null;
        if (j0Var.f903c != null) {
            this.f880d = new ArrayList(j0Var.f903c.length);
            int i14 = 0;
            while (true) {
                b[] bVarArr = j0Var.f903c;
                if (i14 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i14];
                int[] iArr = bVar.f834a;
                a aVar = new a(this);
                int i15 = 0;
                int i16 = 0;
                while (i15 < iArr.length) {
                    p0 p0Var = new p0();
                    int i17 = i15 + 1;
                    int i18 = i;
                    p0Var.f959a = iArr[i15];
                    if (D(i18)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i16 + " base fragment #" + iArr[i17]);
                    }
                    String str2 = (String) bVar.f835b.get(i16);
                    if (str2 != null) {
                        p0Var.f960b = lVar.n(str2);
                    } else {
                        p0Var.f960b = sVar4;
                    }
                    p0Var.f964g = androidx.lifecycle.m.values()[bVar.f836c[i16]];
                    p0Var.h = androidx.lifecycle.m.values()[bVar.f837d[i16]];
                    int i19 = iArr[i17];
                    p0Var.f961c = i19;
                    int i20 = iArr[i15 + 2];
                    p0Var.f962d = i20;
                    int i21 = i15 + 4;
                    int i22 = iArr[i15 + 3];
                    p0Var.e = i22;
                    i15 += 5;
                    int i23 = iArr[i21];
                    p0Var.f963f = i23;
                    aVar.f818b = i19;
                    aVar.f819c = i20;
                    aVar.f820d = i22;
                    aVar.e = i23;
                    aVar.b(p0Var);
                    i16++;
                    i = i18;
                    sVar4 = null;
                }
                int i24 = i;
                aVar.f821f = bVar.e;
                aVar.i = bVar.f838f;
                aVar.f832s = bVar.f839r;
                aVar.f822g = true;
                aVar.f823j = bVar.f840s;
                aVar.f824k = bVar.f841t;
                aVar.f825l = bVar.f842u;
                aVar.f826m = bVar.f843v;
                aVar.f827n = bVar.f844w;
                aVar.f828o = bVar.f845x;
                aVar.f829p = bVar.f846y;
                aVar.d(1);
                if (D(i24)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i14 + " (index " + aVar.f832s + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new u0());
                    aVar.i("  ", printWriter, false);
                    printWriter.close();
                }
                this.f880d.add(aVar);
                i14++;
                i = i24;
                sVar4 = null;
            }
            i10 = 0;
        } else {
            i10 = 0;
            this.f880d = null;
        }
        this.i.set(j0Var.f904d);
        String str3 = j0Var.e;
        if (str3 != null) {
            s sVarN2 = lVar.n(str3);
            this.f890q = sVarN2;
            n(sVarN2);
        }
        ArrayList arrayList4 = j0Var.f905f;
        if (arrayList4 != null) {
            for (int i25 = i10; i25 < arrayList4.size(); i25++) {
                Bundle bundle = (Bundle) j0Var.f906r.get(i25);
                bundle.setClassLoader(this.f887n.f997f.getClassLoader());
                this.f883j.put(arrayList4.get(i25), bundle);
            }
        }
        this.f896w = new ArrayDeque(j0Var.f907s);
    }

    public final j0 Q() {
        int i;
        ArrayList arrayList;
        b[] bVarArr;
        int size;
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            h hVar = (h) it.next();
            if (hVar.e) {
                hVar.e = false;
                hVar.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((h) it2.next()).e();
        }
        u(true);
        this.f898y = true;
        this.F.i = true;
        a2.l lVar = this.f879c;
        lVar.getClass();
        HashMap map = (HashMap) lVar.f44c;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (o0 o0Var : map.values()) {
            if (o0Var != null) {
                s sVar = o0Var.f949c;
                m0 m0Var = new m0(sVar);
                if (sVar.f969a <= -1 || m0Var.f939x != null) {
                    m0Var.f939x = sVar.f971b;
                } else {
                    Bundle bundleO = o0Var.o();
                    m0Var.f939x = bundleO;
                    if (sVar.f979s != null) {
                        if (bundleO == null) {
                            m0Var.f939x = new Bundle();
                        }
                        m0Var.f939x.putString("android:target_state", sVar.f979s);
                        int i10 = sVar.f980t;
                        if (i10 != 0) {
                            m0Var.f939x.putInt("android:target_req_state", i10);
                        }
                    }
                }
                arrayList2.add(m0Var);
                if (D(2)) {
                    Log.v("FragmentManager", "Saved state of " + sVar + ": " + m0Var.f939x);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (D(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        a2.l lVar2 = this.f879c;
        synchronized (((ArrayList) lVar2.f43b)) {
            try {
                if (((ArrayList) lVar2.f43b).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) lVar2.f43b).size());
                    ArrayList arrayList3 = (ArrayList) lVar2.f43b;
                    int size2 = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList3.get(i11);
                        i11++;
                        s sVar2 = (s) obj;
                        arrayList.add(sVar2.e);
                        if (D(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + sVar2.e + "): " + sVar2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList4 = this.f880d;
        if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
            bVarArr = null;
        } else {
            bVarArr = new b[size];
            for (i = 0; i < size; i++) {
                bVarArr[i] = new b((a) this.f880d.get(i));
                if (D(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f880d.get(i));
                }
            }
        }
        j0 j0Var = new j0();
        j0Var.e = null;
        ArrayList arrayList5 = new ArrayList();
        j0Var.f905f = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        j0Var.f906r = arrayList6;
        j0Var.f901a = arrayList2;
        j0Var.f902b = arrayList;
        j0Var.f903c = bVarArr;
        j0Var.f904d = this.i.get();
        s sVar3 = this.f890q;
        if (sVar3 != null) {
            j0Var.e = sVar3.e;
        }
        arrayList5.addAll(this.f883j.keySet());
        arrayList6.addAll(this.f883j.values());
        j0Var.f907s = new ArrayList(this.f896w);
        return j0Var;
    }

    public final void R() {
        synchronized (this.f877a) {
            try {
                if (this.f877a.size() == 1) {
                    this.f887n.f998r.removeCallbacks(this.G);
                    this.f887n.f998r.post(this.G);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void S(s sVar, boolean z4) {
        ViewGroup viewGroupZ = z(sVar);
        if (viewGroupZ == null || !(viewGroupZ instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupZ).setDrawDisappearingViewsLast(!z4);
    }

    public final void T(s sVar, androidx.lifecycle.m mVar) {
        if (sVar.equals(this.f879c.n(sVar.e)) && (sVar.D == null || sVar.C == this)) {
            sVar.W = mVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + sVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void U(s sVar) {
        if (sVar != null) {
            if (!sVar.equals(this.f879c.n(sVar.e)) || (sVar.D != null && sVar.C != this)) {
                throw new IllegalArgumentException("Fragment " + sVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        s sVar2 = this.f890q;
        this.f890q = sVar;
        n(sVar2);
        n(this.f890q);
    }

    public final void V(s sVar) {
        ViewGroup viewGroupZ = z(sVar);
        if (viewGroupZ != null) {
            p pVar = sVar.S;
            if ((pVar == null ? 0 : pVar.e) + (pVar == null ? 0 : pVar.f954d) + (pVar == null ? 0 : pVar.f953c) + (pVar == null ? 0 : pVar.f952b) > 0) {
                if (viewGroupZ.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupZ.setTag(R.id.visible_removing_fragment_view_tag, sVar);
                }
                s sVar2 = (s) viewGroupZ.getTag(R.id.visible_removing_fragment_view_tag);
                p pVar2 = sVar.S;
                boolean z4 = pVar2 != null ? pVar2.f951a : false;
                if (sVar2.S == null) {
                    return;
                }
                sVar2.o().f951a = z4;
            }
        }
    }

    public final void X() {
        ArrayList arrayListS = this.f879c.s();
        int size = arrayListS.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListS.get(i);
            i++;
            o0 o0Var = (o0) obj;
            s sVar = o0Var.f949c;
            if (sVar.Q) {
                if (this.f878b) {
                    this.B = true;
                } else {
                    sVar.Q = false;
                    o0Var.k();
                }
            }
        }
    }

    public final void Y(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new u0());
        v vVar = this.f887n;
        if (vVar == null) {
            try {
                r("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            vVar.f1000t.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e4) {
            Log.e("FragmentManager", "Failed dumping state", e4);
            throw illegalStateException;
        }
    }

    public final void Z() {
        synchronized (this.f877a) {
            try {
                if (!this.f877a.isEmpty()) {
                    this.h.a(true);
                    return;
                }
                b0 b0Var = this.h;
                ArrayList arrayList = this.f880d;
                b0Var.a((arrayList != null ? arrayList.size() : 0) > 0 && G(this.f889p));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o0 a(s sVar) {
        if (D(2)) {
            Log.v("FragmentManager", "add: " + sVar);
        }
        o0 o0VarF = f(sVar);
        sVar.C = this;
        a2.l lVar = this.f879c;
        lVar.D(o0VarF);
        if (!sVar.K) {
            lVar.g(sVar);
            sVar.f983w = false;
            if (sVar.P == null) {
                sVar.T = false;
            }
            if (E(sVar)) {
                this.f897x = true;
            }
        }
        return o0VarF;
    }

    public final void b(v vVar, qd.b bVar, s sVar) {
        if (this.f887n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f887n = vVar;
        this.f888o = bVar;
        this.f889p = sVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f885l;
        if (sVar != null) {
            copyOnWriteArrayList.add(new d0(sVar));
        } else if (vVar != null) {
            copyOnWriteArrayList.add(vVar);
        }
        if (this.f889p != null) {
            Z();
        }
        if (vVar != null) {
            androidx.activity.b0 b0VarM = vVar.f1000t.m();
            this.f882g = b0VarM;
            b0VarM.a(sVar != null ? sVar : vVar, this.h);
        }
        if (sVar != null) {
            k0 k0Var = sVar.C.F;
            HashMap map = k0Var.e;
            k0 k0Var2 = (k0) map.get(sVar.e);
            if (k0Var2 == null) {
                k0Var2 = new k0(k0Var.f912g);
                map.put(sVar.e, k0Var2);
            }
            this.F = k0Var2;
        } else if (vVar != null) {
            this.F = (k0) new a2.l(vVar.f1000t.f(), k0.f909j).q(k0.class);
        } else {
            this.F = new k0(false);
        }
        this.F.i = H();
        this.f879c.f45d = this.F;
        v vVar2 = this.f887n;
        if (vVar2 != null) {
            androidx.activity.h hVar = vVar2.f1000t.f373w;
            String strB = u3.b.b("FragmentManager:", sVar != null ? q1.a.m(new StringBuilder(), sVar.e, ":") : "");
            this.f893t = hVar.d(da.v.h(strB, "StartActivityForResult"), new e0(3), new a5.b(this, 5));
            this.f894u = hVar.d(da.v.h(strB, "StartIntentSenderForResult"), new e0(0), new e7.i(this, 7));
            this.f895v = hVar.d(da.v.h(strB, "RequestPermissions"), new e0(1), new ib.c(this, 5));
        }
    }

    public final void c(s sVar) {
        if (D(2)) {
            Log.v("FragmentManager", "attach: " + sVar);
        }
        if (sVar.K) {
            sVar.K = false;
            if (sVar.f982v) {
                return;
            }
            this.f879c.g(sVar);
            if (D(2)) {
                Log.v("FragmentManager", "add from attach: " + sVar);
            }
            if (E(sVar)) {
                this.f897x = true;
            }
        }
    }

    public final void d() {
        this.f878b = false;
        this.D.clear();
        this.C.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListS = this.f879c.s();
        int size = arrayListS.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListS.get(i);
            i++;
            ViewGroup viewGroup = ((o0) obj).f949c.O;
            if (viewGroup != null) {
                hashSet.add(h.f(viewGroup, B()));
            }
        }
        return hashSet;
    }

    public final o0 f(s sVar) {
        String str = sVar.e;
        a2.l lVar = this.f879c;
        o0 o0Var = (o0) ((HashMap) lVar.f44c).get(str);
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0(this.f884k, lVar, sVar);
        o0Var2.m(this.f887n.f997f.getClassLoader());
        o0Var2.e = this.f886m;
        return o0Var2;
    }

    public final void g(s sVar) {
        if (D(2)) {
            Log.v("FragmentManager", "detach: " + sVar);
        }
        if (sVar.K) {
            return;
        }
        sVar.K = true;
        if (sVar.f982v) {
            if (D(2)) {
                Log.v("FragmentManager", "remove from detach: " + sVar);
            }
            a2.l lVar = this.f879c;
            synchronized (((ArrayList) lVar.f43b)) {
                ((ArrayList) lVar.f43b).remove(sVar);
            }
            sVar.f982v = false;
            if (E(sVar)) {
                this.f897x = true;
            }
            V(sVar);
        }
    }

    public final void h() {
        for (s sVar : this.f879c.x()) {
            if (sVar != null) {
                sVar.N = true;
                sVar.E.h();
            }
        }
    }

    public final boolean i() {
        if (this.f886m >= 1) {
            for (s sVar : this.f879c.x()) {
                if (sVar != null) {
                    if (!sVar.J ? sVar.E.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f886m < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (s sVar : this.f879c.x()) {
            if (sVar != null && F(sVar)) {
                if (!sVar.J ? sVar.E.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(sVar);
                    z4 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                s sVar2 = (s) this.e.get(i);
                if (arrayList == null || !arrayList.contains(sVar2)) {
                    sVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z4;
    }

    public final void k() {
        this.A = true;
        u(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((h) it.next()).e();
        }
        p(-1);
        this.f887n = null;
        this.f888o = null;
        this.f889p = null;
        if (this.f882g != null) {
            Iterator it2 = this.h.f848b.iterator();
            while (it2.hasNext()) {
                ((androidx.activity.c) it2.next()).cancel();
            }
            this.f882g = null;
        }
        androidx.activity.result.d dVar = this.f893t;
        if (dVar != null) {
            dVar.b();
            this.f894u.b();
            this.f895v.b();
        }
    }

    public final boolean l() {
        if (this.f886m >= 1) {
            for (s sVar : this.f879c.x()) {
                if (sVar != null) {
                    if (!sVar.J ? sVar.E.l() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void m() {
        if (this.f886m < 1) {
            return;
        }
        for (s sVar : this.f879c.x()) {
            if (sVar != null && !sVar.J) {
                sVar.E.m();
            }
        }
    }

    public final void n(s sVar) {
        if (sVar != null) {
            if (sVar.equals(this.f879c.n(sVar.e))) {
                sVar.C.getClass();
                boolean zG = G(sVar);
                Boolean bool = sVar.f981u;
                if (bool == null || bool.booleanValue() != zG) {
                    sVar.f981u = Boolean.valueOf(zG);
                    i0 i0Var = sVar.E;
                    i0Var.Z();
                    i0Var.n(i0Var.f890q);
                }
            }
        }
    }

    public final boolean o() {
        boolean z4 = false;
        if (this.f886m < 1) {
            return false;
        }
        for (s sVar : this.f879c.x()) {
            if (sVar != null && F(sVar)) {
                if (!sVar.J ? sVar.E.o() : false) {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final void p(int i) {
        try {
            this.f878b = true;
            for (o0 o0Var : ((HashMap) this.f879c.f44c).values()) {
                if (o0Var != null) {
                    o0Var.e = i;
                }
            }
            I(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((h) it.next()).e();
            }
            this.f878b = false;
            u(true);
        } catch (Throwable th) {
            this.f878b = false;
            throw th;
        }
    }

    public final void q() {
        if (this.B) {
            this.B = false;
            X();
        }
    }

    public final void r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strH = da.v.h(str, "    ");
        a2.l lVar = this.f879c;
        ArrayList arrayList = (ArrayList) lVar.f43b;
        String strH2 = da.v.h(str, "    ");
        HashMap map = (HashMap) lVar.f44c;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (o0 o0Var : map.values()) {
                printWriter.print(str);
                if (o0Var != null) {
                    s sVar = o0Var.f949c;
                    printWriter.println(sVar);
                    sVar.n(strH2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                s sVar2 = (s) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(sVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                s sVar3 = (s) this.e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(sVar3.toString());
            }
        }
        ArrayList arrayList3 = this.f880d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) this.f880d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.i(strH, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f877a) {
            try {
                int size4 = this.f877a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (g0) this.f877a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f887n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f888o);
        if (this.f889p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f889p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f886m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f898y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f899z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.A);
        if (this.f897x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f897x);
        }
    }

    public final void s(g0 g0Var, boolean z4) {
        if (!z4) {
            if (this.f887n == null) {
                if (!this.A) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (H()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f877a) {
            try {
                if (this.f887n == null) {
                    if (!z4) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f877a.add(g0Var);
                    R();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(boolean z4) {
        if (this.f878b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f887n == null) {
            if (!this.A) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f887n.f998r.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4 && H()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.C == null) {
            this.C = new ArrayList();
            this.D = new ArrayList();
        }
        this.f878b = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        s sVar = this.f889p;
        if (sVar != null) {
            sb2.append(sVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f889p)));
            sb2.append("}");
        } else {
            v vVar = this.f887n;
            if (vVar != null) {
                sb2.append(vVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f887n)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final boolean u(boolean z4) {
        boolean zA;
        t(z4);
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.C;
            ArrayList arrayList2 = this.D;
            synchronized (this.f877a) {
                try {
                    if (this.f877a.isEmpty()) {
                        zA = false;
                    } else {
                        int size = this.f877a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((g0) this.f877a.get(i)).a(arrayList, arrayList2);
                        }
                        this.f877a.clear();
                        this.f887n.f998r.removeCallbacks(this.G);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!zA) {
                Z();
                q();
                ((HashMap) this.f879c.f44c).values().removeAll(Collections.singleton(null));
                return z10;
            }
            z10 = true;
            this.f878b = true;
            try {
                O(this.C, this.D);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
    }

    public final void v(a aVar, boolean z4) {
        if (z4 && (this.f887n == null || this.A)) {
            return;
        }
        t(z4);
        aVar.a(this.C, this.D);
        this.f878b = true;
        try {
            O(this.C, this.D);
            d();
            Z();
            q();
            ((HashMap) this.f879c.f44c).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    public final void w(ArrayList arrayList, ArrayList arrayList2, int i, int i10) {
        ViewGroup viewGroup;
        boolean z4;
        int i11;
        boolean z10;
        int i12;
        int i13;
        a2.l lVar = this.f879c;
        boolean z11 = ((a) arrayList.get(i)).f829p;
        ArrayList arrayList3 = this.E;
        if (arrayList3 == null) {
            this.E = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.E.addAll(lVar.x());
        s sVar = this.f890q;
        int i14 = i;
        boolean z12 = false;
        while (true) {
            int i15 = 1;
            if (i14 >= i10) {
                boolean z13 = z11;
                this.E.clear();
                if (!z13 && this.f886m >= 1) {
                    for (int i16 = i; i16 < i10; i16++) {
                        ArrayList arrayList4 = ((a) arrayList.get(i16)).f817a;
                        int size = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj = arrayList4.get(i17);
                            i17++;
                            s sVar2 = ((p0) obj).f960b;
                            if (sVar2 != null && sVar2.C != null) {
                                lVar.D(f(sVar2));
                            }
                        }
                    }
                }
                for (int i18 = i; i18 < i10; i18++) {
                    a aVar = (a) arrayList.get(i18);
                    if (((Boolean) arrayList2.get(i18)).booleanValue()) {
                        aVar.d(-1);
                        i0 i0Var = aVar.f830q;
                        ArrayList arrayList5 = aVar.f817a;
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            p0 p0Var = (p0) arrayList5.get(size2);
                            s sVar3 = p0Var.f960b;
                            if (sVar3 != null) {
                                if (sVar3.S != null) {
                                    sVar3.o().f951a = true;
                                }
                                int i19 = aVar.f821f;
                                int i20 = 8194;
                                if (i19 != 4097) {
                                    i20 = i19 != 4099 ? i19 != 8194 ? 0 : 4097 : 4099;
                                }
                                if (sVar3.S != null || i20 != 0) {
                                    sVar3.o();
                                    sVar3.S.f955f = i20;
                                }
                                sVar3.o();
                                sVar3.S.getClass();
                            }
                            switch (p0Var.f959a) {
                                case 1:
                                    sVar3.X(p0Var.f961c, p0Var.f962d, p0Var.e, p0Var.f963f);
                                    i0Var.S(sVar3, true);
                                    i0Var.N(sVar3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p0Var.f959a);
                                case 3:
                                    sVar3.X(p0Var.f961c, p0Var.f962d, p0Var.e, p0Var.f963f);
                                    i0Var.a(sVar3);
                                    break;
                                case 4:
                                    sVar3.X(p0Var.f961c, p0Var.f962d, p0Var.e, p0Var.f963f);
                                    i0Var.getClass();
                                    W(sVar3);
                                    break;
                                case 5:
                                    sVar3.X(p0Var.f961c, p0Var.f962d, p0Var.e, p0Var.f963f);
                                    i0Var.S(sVar3, true);
                                    i0Var.C(sVar3);
                                    break;
                                case 6:
                                    sVar3.X(p0Var.f961c, p0Var.f962d, p0Var.e, p0Var.f963f);
                                    i0Var.c(sVar3);
                                    break;
                                case 7:
                                    sVar3.X(p0Var.f961c, p0Var.f962d, p0Var.e, p0Var.f963f);
                                    i0Var.S(sVar3, true);
                                    i0Var.g(sVar3);
                                    break;
                                case 8:
                                    i0Var.U(null);
                                    break;
                                case 9:
                                    i0Var.U(sVar3);
                                    break;
                                case 10:
                                    i0Var.T(sVar3, p0Var.f964g);
                                    break;
                            }
                        }
                    } else {
                        aVar.d(1);
                        i0 i0Var2 = aVar.f830q;
                        ArrayList arrayList6 = aVar.f817a;
                        int size3 = arrayList6.size();
                        for (int i21 = 0; i21 < size3; i21++) {
                            p0 p0Var2 = (p0) arrayList6.get(i21);
                            s sVar4 = p0Var2.f960b;
                            if (sVar4 != null) {
                                if (sVar4.S != null) {
                                    sVar4.o().f951a = false;
                                }
                                int i22 = aVar.f821f;
                                if (sVar4.S != null || i22 != 0) {
                                    sVar4.o();
                                    sVar4.S.f955f = i22;
                                }
                                sVar4.o();
                                sVar4.S.getClass();
                            }
                            switch (p0Var2.f959a) {
                                case 1:
                                    sVar4.X(p0Var2.f961c, p0Var2.f962d, p0Var2.e, p0Var2.f963f);
                                    i0Var2.S(sVar4, false);
                                    i0Var2.a(sVar4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + p0Var2.f959a);
                                case 3:
                                    sVar4.X(p0Var2.f961c, p0Var2.f962d, p0Var2.e, p0Var2.f963f);
                                    i0Var2.N(sVar4);
                                    break;
                                case 4:
                                    sVar4.X(p0Var2.f961c, p0Var2.f962d, p0Var2.e, p0Var2.f963f);
                                    i0Var2.C(sVar4);
                                    break;
                                case 5:
                                    sVar4.X(p0Var2.f961c, p0Var2.f962d, p0Var2.e, p0Var2.f963f);
                                    i0Var2.S(sVar4, false);
                                    W(sVar4);
                                    break;
                                case 6:
                                    sVar4.X(p0Var2.f961c, p0Var2.f962d, p0Var2.e, p0Var2.f963f);
                                    i0Var2.g(sVar4);
                                    break;
                                case 7:
                                    sVar4.X(p0Var2.f961c, p0Var2.f962d, p0Var2.e, p0Var2.f963f);
                                    i0Var2.S(sVar4, false);
                                    i0Var2.c(sVar4);
                                    break;
                                case 8:
                                    i0Var2.U(sVar4);
                                    break;
                                case 9:
                                    i0Var2.U(null);
                                    break;
                                case 10:
                                    i0Var2.T(sVar4, p0Var2.h);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
                for (int i23 = i; i23 < i10; i23++) {
                    a aVar2 = (a) arrayList.get(i23);
                    if (zBooleanValue) {
                        for (int size4 = aVar2.f817a.size() - 1; size4 >= 0; size4--) {
                            s sVar5 = ((p0) aVar2.f817a.get(size4)).f960b;
                            if (sVar5 != null) {
                                f(sVar5).k();
                            }
                        }
                    } else {
                        ArrayList arrayList7 = aVar2.f817a;
                        int size5 = arrayList7.size();
                        int i24 = 0;
                        while (i24 < size5) {
                            Object obj2 = arrayList7.get(i24);
                            i24++;
                            s sVar6 = ((p0) obj2).f960b;
                            if (sVar6 != null) {
                                f(sVar6).k();
                            }
                        }
                    }
                }
                I(this.f886m, true);
                HashSet<h> hashSet = new HashSet();
                for (int i25 = i; i25 < i10; i25++) {
                    ArrayList arrayList8 = ((a) arrayList.get(i25)).f817a;
                    int size6 = arrayList8.size();
                    int i26 = 0;
                    while (i26 < size6) {
                        Object obj3 = arrayList8.get(i26);
                        i26++;
                        s sVar7 = ((p0) obj3).f960b;
                        if (sVar7 != null && (viewGroup = sVar7.O) != null) {
                            hashSet.add(h.f(viewGroup, B()));
                        }
                    }
                }
                for (h hVar : hashSet) {
                    hVar.f871d = zBooleanValue;
                    synchronized (hVar.f869b) {
                        try {
                            hVar.g();
                            hVar.e = false;
                            for (int size7 = hVar.f869b.size() - 1; size7 >= 0; size7--) {
                                w0 w0Var = (w0) hVar.f869b.get(size7);
                                int iC = q1.a.c(w0Var.f1006c.P);
                                if (w0Var.f1004a == 2 && iC != 2) {
                                    w0Var.f1006c.getClass();
                                    hVar.e = false;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    hVar.c();
                }
                for (int i27 = i; i27 < i10; i27++) {
                    a aVar3 = (a) arrayList.get(i27);
                    if (((Boolean) arrayList2.get(i27)).booleanValue() && aVar3.f832s >= 0) {
                        aVar3.f832s = -1;
                    }
                    aVar3.getClass();
                }
                return;
            }
            a aVar4 = (a) arrayList.get(i14);
            if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                z4 = z11;
                i11 = i14;
                int i28 = 1;
                ArrayList arrayList9 = this.E;
                ArrayList arrayList10 = aVar4.f817a;
                int size8 = arrayList10.size() - 1;
                while (size8 >= 0) {
                    p0 p0Var3 = (p0) arrayList10.get(size8);
                    int i29 = p0Var3.f959a;
                    if (i29 != i28) {
                        if (i29 != 3) {
                            switch (i29) {
                                case 6:
                                    arrayList9.add(p0Var3.f960b);
                                    break;
                                case 8:
                                    sVar = null;
                                    break;
                                case 9:
                                    sVar = p0Var3.f960b;
                                    break;
                                case 10:
                                    p0Var3.h = p0Var3.f964g;
                                    break;
                            }
                        } else {
                            arrayList9.add(p0Var3.f960b);
                        }
                        size8--;
                        i28 = 1;
                    }
                    arrayList9.remove(p0Var3.f960b);
                    size8--;
                    i28 = 1;
                }
            } else {
                ArrayList arrayList11 = this.E;
                ArrayList arrayList12 = aVar4.f817a;
                int i30 = 0;
                while (i30 < arrayList12.size()) {
                    p0 p0Var4 = (p0) arrayList12.get(i30);
                    int i31 = p0Var4.f959a;
                    if (i31 != i15) {
                        int i32 = i15;
                        z10 = z11;
                        if (i31 != 2) {
                            if (i31 == 3 || i31 == 6) {
                                arrayList11.remove(p0Var4.f960b);
                                s sVar8 = p0Var4.f960b;
                                if (sVar8 == sVar) {
                                    arrayList12.add(i30, new p0(9, sVar8));
                                    i30++;
                                    i13 = i14;
                                    i12 = i32;
                                    sVar = null;
                                }
                            } else if (i31 == 7) {
                                i12 = i32;
                            } else if (i31 == 8) {
                                arrayList12.add(i30, new p0(9, sVar));
                                i30++;
                                sVar = p0Var4.f960b;
                            }
                            i13 = i14;
                            i12 = i32;
                        } else {
                            s sVar9 = p0Var4.f960b;
                            int i33 = sVar9.H;
                            int size9 = arrayList11.size() - 1;
                            int i34 = 0;
                            while (size9 >= 0) {
                                int i35 = size9;
                                s sVar10 = (s) arrayList11.get(size9);
                                int i36 = i14;
                                if (sVar10.H == i33) {
                                    if (sVar10 == sVar9) {
                                        i34 = i32;
                                    } else {
                                        if (sVar10 == sVar) {
                                            arrayList12.add(i30, new p0(9, sVar10));
                                            i30++;
                                            sVar = null;
                                        }
                                        p0 p0Var5 = new p0(3, sVar10);
                                        p0Var5.f961c = p0Var4.f961c;
                                        p0Var5.e = p0Var4.e;
                                        p0Var5.f962d = p0Var4.f962d;
                                        p0Var5.f963f = p0Var4.f963f;
                                        arrayList12.add(i30, p0Var5);
                                        arrayList11.remove(sVar10);
                                        i30++;
                                        sVar = sVar;
                                    }
                                }
                                size9 = i35 - 1;
                                i14 = i36;
                            }
                            i13 = i14;
                            if (i34 != 0) {
                                arrayList12.remove(i30);
                                i30--;
                                i12 = i32;
                            } else {
                                i12 = i32;
                                p0Var4.f959a = i12;
                                arrayList11.add(sVar9);
                            }
                        }
                        i30 += i12;
                        i15 = i12;
                        z11 = z10;
                        i14 = i13;
                    } else {
                        z10 = z11;
                        i12 = i15;
                    }
                    i13 = i14;
                    arrayList11.add(p0Var4.f960b);
                    i30 += i12;
                    i15 = i12;
                    z11 = z10;
                    i14 = i13;
                }
                z4 = z11;
                i11 = i14;
            }
            z12 = z12 || aVar4.f822g;
            i14 = i11 + 1;
            z11 = z4;
        }
    }

    public final s x(int i) {
        a2.l lVar = this.f879c;
        ArrayList arrayList = (ArrayList) lVar.f43b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s sVar = (s) arrayList.get(size);
            if (sVar != null && sVar.G == i) {
                return sVar;
            }
        }
        for (o0 o0Var : ((HashMap) lVar.f44c).values()) {
            if (o0Var != null) {
                s sVar2 = o0Var.f949c;
                if (sVar2.G == i) {
                    return sVar2;
                }
            }
        }
        return null;
    }

    public final s y(String str) {
        a2.l lVar = this.f879c;
        ArrayList arrayList = (ArrayList) lVar.f43b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s sVar = (s) arrayList.get(size);
            if (sVar != null && str.equals(sVar.I)) {
                return sVar;
            }
        }
        for (o0 o0Var : ((HashMap) lVar.f44c).values()) {
            if (o0Var != null) {
                s sVar2 = o0Var.f949c;
                if (str.equals(sVar2.I)) {
                    return sVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup z(s sVar) {
        ViewGroup viewGroup = sVar.O;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (sVar.H <= 0 || !this.f888o.z()) {
            return null;
        }
        View viewY = this.f888o.y(sVar.H);
        if (viewY instanceof ViewGroup) {
            return (ViewGroup) viewY;
        }
        return null;
    }
}
