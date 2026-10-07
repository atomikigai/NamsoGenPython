package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aa.c f947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2.l f948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f950d = false;
    public int e = -1;

    public o0(aa.c cVar, a2.l lVar, s sVar) {
        this.f947a = cVar;
        this.f948b = lVar;
        this.f949c = sVar;
    }

    public final void a() {
        boolean zD = i0.D(3);
        s sVar = this.f949c;
        if (zD) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + sVar);
        }
        Bundle bundle = sVar.f971b;
        sVar.E.J();
        sVar.f969a = 3;
        sVar.N = false;
        sVar.z(bundle);
        if (!sVar.N) {
            throw new x0(q1.a.k("Fragment ", sVar, " did not call through to super.onActivityCreated()"));
        }
        if (i0.D(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + sVar);
        }
        View view = sVar.P;
        if (view != null) {
            Bundle bundle2 = sVar.f971b;
            SparseArray<Parcelable> sparseArray = sVar.f973c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                sVar.f973c = null;
            }
            if (sVar.P != null) {
                sVar.Y.e.e(sVar.f975d);
                sVar.f975d = null;
            }
            sVar.N = false;
            sVar.N(bundle2);
            if (!sVar.N) {
                throw new x0(q1.a.k("Fragment ", sVar, " did not call through to super.onViewStateRestored()"));
            }
            if (sVar.P != null) {
                sVar.Y.a(androidx.lifecycle.l.ON_CREATE);
            }
        }
        sVar.f971b = null;
        i0 i0Var = sVar.E;
        i0Var.f898y = false;
        i0Var.f899z = false;
        i0Var.F.i = false;
        i0Var.p(4);
        this.f947a.g(false);
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.f948b.f43b;
        s sVar = this.f949c;
        ViewGroup viewGroup = sVar.O;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(sVar);
            for (int i = iIndexOf - 1; i >= 0; i--) {
                s sVar2 = (s) arrayList.get(i);
                if (sVar2.O == viewGroup && (view2 = sVar2.P) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                s sVar3 = (s) arrayList.get(iIndexOf);
                if (sVar3.O == viewGroup && (view = sVar3.P) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        sVar.O.addView(sVar.P, iIndexOfChild);
    }

    public final void c() {
        boolean zD = i0.D(3);
        s sVar = this.f949c;
        if (zD) {
            Log.d("FragmentManager", "moveto ATTACHED: " + sVar);
        }
        s sVar2 = sVar.f978r;
        o0 o0Var = null;
        a2.l lVar = this.f948b;
        if (sVar2 != null) {
            o0 o0Var2 = (o0) ((HashMap) lVar.f44c).get(sVar2.e);
            if (o0Var2 == null) {
                throw new IllegalStateException("Fragment " + sVar + " declared target fragment " + sVar.f978r + " that does not belong to this FragmentManager!");
            }
            sVar.f979s = sVar.f978r.e;
            sVar.f978r = null;
            o0Var = o0Var2;
        } else {
            String str = sVar.f979s;
            if (str != null && (o0Var = (o0) ((HashMap) lVar.f44c).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(sVar);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(q1.a.m(sb2, sVar.f979s, " that does not belong to this FragmentManager!"));
            }
        }
        if (o0Var != null) {
            o0Var.k();
        }
        i0 i0Var = sVar.C;
        sVar.D = i0Var.f887n;
        sVar.F = i0Var.f889p;
        aa.c cVar = this.f947a;
        cVar.m(false);
        ArrayList arrayList = sVar.f976d0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((n) obj).a();
        }
        arrayList.clear();
        sVar.E.b(sVar.D, sVar.m(), sVar);
        sVar.f969a = 0;
        sVar.N = false;
        sVar.B(sVar.D.f997f);
        if (!sVar.N) {
            throw new x0(q1.a.k("Fragment ", sVar, " did not call through to super.onAttach()"));
        }
        Iterator it = sVar.C.f885l.iterator();
        while (it.hasNext()) {
            ((l0) it.next()).a();
        }
        i0 i0Var2 = sVar.E;
        i0Var2.f898y = false;
        i0Var2.f899z = false;
        i0Var2.F.i = false;
        i0Var2.p(0);
        cVar.h(false);
    }

    public final int d() {
        w0 w0Var;
        s sVar = this.f949c;
        if (sVar.C == null) {
            return sVar.f969a;
        }
        int iMin = this.e;
        int iOrdinal = sVar.W.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (sVar.f984x) {
            if (sVar.f985y) {
                iMin = Math.max(this.e, 2);
                View view = sVar.P;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, sVar.f969a) : Math.min(iMin, 1);
            }
        }
        if (!sVar.f982v) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = sVar.O;
        if (viewGroup != null) {
            h hVarF = h.f(viewGroup, sVar.t().B());
            w0 w0VarD = hVarF.d(sVar);
            int i10 = w0VarD != null ? w0VarD.f1005b : 0;
            ArrayList arrayList = hVarF.f870c;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    w0Var = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                w0Var = (w0) obj;
                if (w0Var.f1006c.equals(sVar) && !w0Var.f1008f) {
                    break;
                }
            }
            i = (w0Var == null || !(i10 == 0 || i10 == 1)) ? i10 : w0Var.f1005b;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (sVar.f983w) {
            iMin = sVar.B > 0 ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (sVar.Q && sVar.f969a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (i0.D(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + sVar);
        }
        return iMin;
    }

    public final void e() {
        boolean zD = i0.D(3);
        final s sVar = this.f949c;
        if (zD) {
            Log.d("FragmentManager", "moveto CREATED: " + sVar);
        }
        if (sVar.V) {
            sVar.W(sVar.f971b);
            sVar.f969a = 1;
            return;
        }
        aa.c cVar = this.f947a;
        cVar.n(false);
        Bundle bundle = sVar.f971b;
        sVar.E.J();
        sVar.f969a = 1;
        sVar.N = false;
        sVar.X.a(new androidx.lifecycle.p() { // from class: androidx.fragment.app.Fragment$5
            @Override // androidx.lifecycle.p
            public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
                View view;
                if (lVar != androidx.lifecycle.l.ON_STOP || (view = sVar.P) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        sVar.f972b0.e(bundle);
        sVar.C(bundle);
        sVar.V = true;
        if (!sVar.N) {
            throw new x0(q1.a.k("Fragment ", sVar, " did not call through to super.onCreate()"));
        }
        sVar.X.d(androidx.lifecycle.l.ON_CREATE);
        cVar.i(false);
    }

    public final void f() {
        String resourceName;
        s sVar = this.f949c;
        if (sVar.f984x) {
            return;
        }
        if (i0.D(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + sVar);
        }
        LayoutInflater layoutInflaterH = sVar.H(sVar.f971b);
        sVar.U = layoutInflaterH;
        ViewGroup viewGroup = sVar.O;
        if (viewGroup == null) {
            int i = sVar.H;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException(q1.a.k("Cannot create fragment ", sVar, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) sVar.C.f888o.y(i);
                if (viewGroup == null && !sVar.f986z) {
                    try {
                        resourceName = sVar.u().getResourceName(sVar.H);
                    } catch (Resources.NotFoundException unused) {
                        resourceName = "unknown";
                    }
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(sVar.H) + " (" + resourceName + ") for fragment " + sVar);
                }
            }
        }
        sVar.O = viewGroup;
        sVar.O(layoutInflaterH, viewGroup, sVar.f971b);
        View view = sVar.P;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            sVar.P.setTag(R.id.fragment_container_view_tag, sVar);
            if (viewGroup != null) {
                b();
            }
            if (sVar.J) {
                sVar.P.setVisibility(8);
            }
            View view2 = sVar.P;
            WeakHashMap weakHashMap = q0.v0.f7946a;
            if (q0.g0.b(view2)) {
                q0.h0.c(sVar.P);
            } else {
                View view3 = sVar.P;
                view3.addOnAttachStateChangeListener(new n0(view3, 0));
            }
            sVar.M(sVar.f971b, sVar.P);
            sVar.E.p(2);
            this.f947a.t(sVar, sVar.P, false);
            int visibility = sVar.P.getVisibility();
            sVar.o().f957j = sVar.P.getAlpha();
            if (sVar.O != null && visibility == 0) {
                View viewFindFocus = sVar.P.findFocus();
                if (viewFindFocus != null) {
                    sVar.o().f958k = viewFindFocus;
                    if (i0.D(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + sVar);
                    }
                }
                sVar.P.setAlpha(0.0f);
            }
        }
        sVar.f969a = 2;
    }

    public final void g() {
        s sVarN;
        boolean zD = i0.D(3);
        s sVar = this.f949c;
        if (zD) {
            Log.d("FragmentManager", "movefrom CREATED: " + sVar);
        }
        boolean zIsChangingConfigurations = true;
        int i = 0;
        boolean z4 = sVar.f983w && sVar.B <= 0;
        a2.l lVar = this.f948b;
        if (!z4) {
            k0 k0Var = (k0) lVar.f45d;
            if (!((k0Var.f910d.containsKey(sVar.e) && k0Var.f912g) ? k0Var.h : true)) {
                String str = sVar.f979s;
                if (str != null && (sVarN = lVar.n(str)) != null && sVarN.L) {
                    sVar.f978r = sVarN;
                }
                sVar.f969a = 0;
                return;
            }
        }
        v vVar = sVar.D;
        if (vVar != null) {
            zIsChangingConfigurations = ((k0) lVar.f45d).h;
        } else {
            w wVar = vVar.f997f;
            if (wVar != null) {
                zIsChangingConfigurations = true ^ wVar.isChangingConfigurations();
            }
        }
        if (z4 || zIsChangingConfigurations) {
            k0 k0Var2 = (k0) lVar.f45d;
            HashMap map = k0Var2.f911f;
            HashMap map2 = k0Var2.e;
            if (i0.D(3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + sVar);
            }
            k0 k0Var3 = (k0) map2.get(sVar.e);
            if (k0Var3 != null) {
                k0Var3.b();
                map2.remove(sVar.e);
            }
            androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) map.get(sVar.e);
            if (t0Var != null) {
                t0Var.a();
                map.remove(sVar.e);
            }
        }
        sVar.E.k();
        sVar.X.d(androidx.lifecycle.l.ON_DESTROY);
        sVar.f969a = 0;
        sVar.N = false;
        sVar.V = false;
        sVar.E();
        if (!sVar.N) {
            throw new x0(q1.a.k("Fragment ", sVar, " did not call through to super.onDestroy()"));
        }
        this.f947a.j(false);
        ArrayList arrayListS = lVar.s();
        int size = arrayListS.size();
        while (i < size) {
            Object obj = arrayListS.get(i);
            i++;
            o0 o0Var = (o0) obj;
            if (o0Var != null) {
                s sVar2 = o0Var.f949c;
                if (sVar.e.equals(sVar2.f979s)) {
                    sVar2.f978r = sVar;
                    sVar2.f979s = null;
                }
            }
        }
        String str2 = sVar.f979s;
        if (str2 != null) {
            sVar.f978r = lVar.n(str2);
        }
        lVar.E(this);
    }

    public final void h() {
        View view;
        boolean zD = i0.D(3);
        s sVar = this.f949c;
        if (zD) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + sVar);
        }
        ViewGroup viewGroup = sVar.O;
        if (viewGroup != null && (view = sVar.P) != null) {
            viewGroup.removeView(view);
        }
        sVar.E.p(1);
        if (sVar.P != null) {
            t0 t0Var = sVar.Y;
            t0Var.b();
            if (t0Var.f992d.f1093d.compareTo(androidx.lifecycle.m.f1067c) >= 0) {
                sVar.Y.a(androidx.lifecycle.l.ON_DESTROY);
            }
        }
        sVar.f969a = 1;
        sVar.N = false;
        sVar.F();
        if (!sVar.N) {
            throw new x0(q1.a.k("Fragment ", sVar, " did not call through to super.onDestroyView()"));
        }
        r.l lVar = ((m1.b) new a2.l(sVar.f(), m1.b.f6978f).q(m1.b.class)).f6979d;
        int i = lVar.f8103c;
        for (int i10 = 0; i10 < i; i10++) {
            ((m1.a) lVar.f8102b[i10]).k();
        }
        sVar.A = false;
        this.f947a.u(false);
        sVar.O = null;
        sVar.P = null;
        sVar.Y = null;
        sVar.Z.j(null);
        sVar.f985y = false;
    }

    public final void i() {
        boolean zD = i0.D(3);
        s sVar = this.f949c;
        if (zD) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + sVar);
        }
        sVar.f969a = -1;
        sVar.N = false;
        sVar.G();
        sVar.U = null;
        if (!sVar.N) {
            throw new x0(q1.a.k("Fragment ", sVar, " did not call through to super.onDetach()"));
        }
        i0 i0Var = sVar.E;
        if (!i0Var.A) {
            i0Var.k();
            sVar.E = new i0();
        }
        this.f947a.k(false);
        sVar.f969a = -1;
        sVar.D = null;
        sVar.F = null;
        sVar.C = null;
        if (!sVar.f983w || sVar.B > 0) {
            k0 k0Var = (k0) this.f948b.f45d;
            if (!((k0Var.f910d.containsKey(sVar.e) && k0Var.f912g) ? k0Var.h : true)) {
                return;
            }
        }
        if (i0.D(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + sVar);
        }
        sVar.X = new androidx.lifecycle.t(sVar);
        sVar.f972b0 = new com.bumptech.glide.manager.r(sVar);
        sVar.f970a0 = null;
        sVar.e = UUID.randomUUID().toString();
        sVar.f982v = false;
        sVar.f983w = false;
        sVar.f984x = false;
        sVar.f985y = false;
        sVar.f986z = false;
        sVar.B = 0;
        sVar.C = null;
        sVar.E = new i0();
        sVar.D = null;
        sVar.G = 0;
        sVar.H = 0;
        sVar.I = null;
        sVar.J = false;
        sVar.K = false;
    }

    public final void j() {
        s sVar = this.f949c;
        if (sVar.f984x && sVar.f985y && !sVar.A) {
            if (i0.D(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + sVar);
            }
            LayoutInflater layoutInflaterH = sVar.H(sVar.f971b);
            sVar.U = layoutInflaterH;
            sVar.O(layoutInflaterH, null, sVar.f971b);
            View view = sVar.P;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                sVar.P.setTag(R.id.fragment_container_view_tag, sVar);
                if (sVar.J) {
                    sVar.P.setVisibility(8);
                }
                sVar.M(sVar.f971b, sVar.P);
                sVar.E.p(2);
                this.f947a.t(sVar, sVar.P, false);
                sVar.f969a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z4 = this.f950d;
        s sVar = this.f949c;
        if (z4) {
            if (i0.D(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + sVar);
                return;
            }
            return;
        }
        try {
            this.f950d = true;
            while (true) {
                int iD = d();
                int i = sVar.f969a;
                if (iD == i) {
                    if (sVar.T) {
                        if (sVar.P != null && (viewGroup = sVar.O) != null) {
                            h hVarF = h.f(viewGroup, sVar.t().B());
                            if (sVar.J) {
                                if (i0.D(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + sVar);
                                }
                                hVarF.a(3, 1, this);
                            } else {
                                if (i0.D(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + sVar);
                                }
                                hVarF.a(2, 1, this);
                            }
                        }
                        i0 i0Var = sVar.C;
                        if (i0Var != null && sVar.f982v && i0.E(sVar)) {
                            i0Var.f897x = true;
                        }
                        sVar.T = false;
                    }
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            sVar.f969a = 1;
                            break;
                        case 2:
                            sVar.f985y = false;
                            sVar.f969a = 2;
                            break;
                        case 3:
                            if (i0.D(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + sVar);
                            }
                            if (sVar.P != null && sVar.f973c == null) {
                                p();
                            }
                            if (sVar.P != null && (viewGroup3 = sVar.O) != null) {
                                h hVarF2 = h.f(viewGroup3, sVar.t().B());
                                if (i0.D(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + sVar);
                                }
                                hVarF2.a(1, 3, this);
                            }
                            sVar.f969a = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            sVar.f969a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (sVar.P != null && (viewGroup2 = sVar.O) != null) {
                                h hVarF3 = h.f(viewGroup2, sVar.t().B());
                                int iB = q1.a.b(sVar.P.getVisibility());
                                if (i0.D(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + sVar);
                                }
                                hVarF3.a(iB, 2, this);
                            }
                            sVar.f969a = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            sVar.f969a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
            }
        } finally {
            this.f950d = false;
        }
    }

    public final void l() {
        boolean zD = i0.D(3);
        s sVar = this.f949c;
        if (zD) {
            Log.d("FragmentManager", "movefrom RESUMED: " + sVar);
        }
        sVar.E.p(5);
        if (sVar.P != null) {
            sVar.Y.a(androidx.lifecycle.l.ON_PAUSE);
        }
        sVar.X.d(androidx.lifecycle.l.ON_PAUSE);
        sVar.f969a = 6;
        sVar.N = true;
        this.f947a.l(false);
    }

    public final void m(ClassLoader classLoader) {
        s sVar = this.f949c;
        Bundle bundle = sVar.f971b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        sVar.f973c = sVar.f971b.getSparseParcelableArray("android:view_state");
        sVar.f975d = sVar.f971b.getBundle("android:view_registry_state");
        String string = sVar.f971b.getString("android:target_state");
        sVar.f979s = string;
        if (string != null) {
            sVar.f980t = sVar.f971b.getInt("android:target_req_state", 0);
        }
        boolean z4 = sVar.f971b.getBoolean("android:user_visible_hint", true);
        sVar.R = z4;
        if (z4) {
            return;
        }
        sVar.Q = true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public final void n() {
        boolean zRequestFocus;
        String str;
        boolean zD = i0.D(3);
        s sVar = this.f949c;
        if (zD) {
            Log.d("FragmentManager", "moveto RESUMED: " + sVar);
        }
        p pVar = sVar.S;
        View view = pVar == null ? null : pVar.f958k;
        if (view != null) {
            if (view == sVar.P) {
                zRequestFocus = view.requestFocus();
                if (i0.D(2)) {
                    StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb2.append(view);
                    sb2.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb2.append(str);
                    sb2.append(" on Fragment ");
                    sb2.append(sVar);
                    sb2.append(" resulting in focused view ");
                    sb2.append(sVar.P.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == sVar.P) {
                            zRequestFocus = view.requestFocus();
                            if (i0.D(2)) {
                                StringBuilder sb3 = new StringBuilder("requestFocus: Restoring focused view ");
                                sb3.append(view);
                                sb3.append(" ");
                                if (zRequestFocus) {
                                    str = "succeeded";
                                } else {
                                    str = "failed";
                                }
                                sb3.append(str);
                                sb3.append(" on Fragment ");
                                sb3.append(sVar);
                                sb3.append(" resulting in focused view ");
                                sb3.append(sVar.P.findFocus());
                                Log.v("FragmentManager", sb3.toString());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        sVar.o().f958k = null;
        sVar.E.J();
        sVar.E.u(true);
        sVar.f969a = 7;
        sVar.N = false;
        sVar.I();
        if (!sVar.N) {
            throw new x0(q1.a.k("Fragment ", sVar, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.t tVar = sVar.X;
        androidx.lifecycle.l lVar = androidx.lifecycle.l.ON_RESUME;
        tVar.d(lVar);
        if (sVar.P != null) {
            sVar.Y.f992d.d(lVar);
        }
        i0 i0Var = sVar.E;
        i0Var.f898y = false;
        i0Var.f899z = false;
        i0Var.F.i = false;
        i0Var.p(7);
        this.f947a.o(false);
        sVar.f971b = null;
        sVar.f973c = null;
        sVar.f975d = null;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        s sVar = this.f949c;
        sVar.J(bundle);
        sVar.f972b0.f(bundle);
        j0 j0VarQ = sVar.E.Q();
        if (j0VarQ != null) {
            bundle.putParcelable("android:support:fragments", j0VarQ);
        }
        this.f947a.q(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (sVar.P != null) {
            p();
        }
        if (sVar.f973c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", sVar.f973c);
        }
        if (sVar.f975d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", sVar.f975d);
        }
        if (!sVar.R) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", sVar.R);
        }
        return bundle;
    }

    public final void p() {
        s sVar = this.f949c;
        if (sVar.P == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        sVar.P.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            sVar.f973c = sparseArray;
        }
        Bundle bundle = new Bundle();
        sVar.Y.e.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        sVar.f975d = bundle;
    }

    public final void q() {
        boolean zD = i0.D(3);
        s sVar = this.f949c;
        if (zD) {
            Log.d("FragmentManager", "moveto STARTED: " + sVar);
        }
        sVar.E.J();
        sVar.E.u(true);
        sVar.f969a = 5;
        sVar.N = false;
        sVar.K();
        if (!sVar.N) {
            throw new x0(q1.a.k("Fragment ", sVar, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.t tVar = sVar.X;
        androidx.lifecycle.l lVar = androidx.lifecycle.l.ON_START;
        tVar.d(lVar);
        if (sVar.P != null) {
            sVar.Y.f992d.d(lVar);
        }
        i0 i0Var = sVar.E;
        i0Var.f898y = false;
        i0Var.f899z = false;
        i0Var.F.i = false;
        i0Var.p(5);
        this.f947a.r(false);
    }

    public final void r() {
        boolean zD = i0.D(3);
        s sVar = this.f949c;
        if (zD) {
            Log.d("FragmentManager", "movefrom STARTED: " + sVar);
        }
        i0 i0Var = sVar.E;
        i0Var.f899z = true;
        i0Var.F.i = true;
        i0Var.p(4);
        if (sVar.P != null) {
            sVar.Y.a(androidx.lifecycle.l.ON_STOP);
        }
        sVar.X.d(androidx.lifecycle.l.ON_STOP);
        sVar.f969a = 4;
        sVar.N = false;
        sVar.L();
        if (!sVar.N) {
            throw new x0(q1.a.k("Fragment ", sVar, " did not call through to super.onStop()"));
        }
        this.f947a.s(false);
    }

    public o0(aa.c cVar, a2.l lVar, ClassLoader classLoader, c0 c0Var, m0 m0Var) {
        this.f947a = cVar;
        this.f948b = lVar;
        s sVarA = c0Var.a(m0Var.f928a);
        this.f949c = sVarA;
        Bundle bundle = m0Var.f936u;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        sVarA.Y(bundle);
        sVarA.e = m0Var.f929b;
        sVarA.f984x = m0Var.f930c;
        sVarA.f986z = true;
        sVarA.G = m0Var.f931d;
        sVarA.H = m0Var.e;
        sVarA.I = m0Var.f932f;
        sVarA.L = m0Var.f933r;
        sVarA.f983w = m0Var.f934s;
        sVarA.K = m0Var.f935t;
        sVarA.J = m0Var.f937v;
        sVarA.W = androidx.lifecycle.m.values()[m0Var.f938w];
        Bundle bundle2 = m0Var.f939x;
        if (bundle2 != null) {
            sVarA.f971b = bundle2;
        } else {
            sVarA.f971b = new Bundle();
        }
        if (i0.D(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + sVarA);
        }
    }

    public o0(aa.c cVar, a2.l lVar, s sVar, m0 m0Var) {
        this.f947a = cVar;
        this.f948b = lVar;
        this.f949c = sVar;
        sVar.f973c = null;
        sVar.f975d = null;
        sVar.B = 0;
        sVar.f985y = false;
        sVar.f982v = false;
        s sVar2 = sVar.f978r;
        sVar.f979s = sVar2 != null ? sVar2.e : null;
        sVar.f978r = null;
        Bundle bundle = m0Var.f939x;
        if (bundle != null) {
            sVar.f971b = bundle;
        } else {
            sVar.f971b = new Bundle();
        }
    }
}
