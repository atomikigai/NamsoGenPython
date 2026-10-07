package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.activity.i;
import androidx.fragment.app.a0;
import androidx.fragment.app.i0;
import androidx.fragment.app.o0;
import androidx.fragment.app.s;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import app.namso_gen.spacehowen.MainActivity;
import h3.a2;
import h3.v;
import h3.w1;
import h3.x2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import q0.e0;
import q0.g0;
import q0.v0;
import r.f;
import r.h;
import x1.w0;
import x1.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f1201d;
    public final i0 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f1202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f1203g;
    public final h h;
    public c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ib.c f1204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1206l;

    public d(MainActivity mainActivity) {
        i0 i0VarP = mainActivity.p();
        t tVar = mainActivity.f366d;
        this.f1202f = new h();
        this.f1203g = new h();
        this.h = new h();
        ib.c cVar = new ib.c(6, false);
        cVar.f5256b = new CopyOnWriteArrayList();
        this.f1204j = cVar;
        this.f1205k = false;
        this.f1206l = false;
        this.e = i0VarP;
        this.f1201d = tVar;
        if (this.f10251a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f10252b = true;
    }

    public static void k(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public static boolean l(long j4) {
        return j4 >= 0 && j4 < ((long) 5);
    }

    @Override // x1.z
    public final long b(int i) {
        return i;
    }

    @Override // x1.z
    public final void d(RecyclerView recyclerView) {
        if (this.i != null) {
            throw new IllegalArgumentException();
        }
        final c cVar = new c(this);
        this.i = cVar;
        ViewPager2 viewPager2A = c.a(recyclerView);
        cVar.e = viewPager2A;
        a aVar = new a(cVar, 0);
        cVar.f1197b = aVar;
        ((ArrayList) viewPager2A.f1210c.f1193b).add(aVar);
        b bVar = new b(cVar, 0);
        cVar.f1198c = bVar;
        this.f10251a.registerObserver(bVar);
        p pVar = new p() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
            @Override // androidx.lifecycle.p
            public final void a(r rVar, l lVar) {
                cVar.c(false);
            }
        };
        cVar.f1199d = pVar;
        this.f1201d.a(pVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // x1.z
    public final void e(w0 w0Var, int i) {
        s vVar;
        Bundle bundle;
        e eVar = (e) w0Var;
        long j4 = eVar.e;
        FrameLayout frameLayout = (FrameLayout) eVar.f10230a;
        int id2 = frameLayout.getId();
        Long lN = n(id2);
        h hVar = this.h;
        if (lN != null && lN.longValue() != j4) {
            p(lN.longValue());
            hVar.f(lN.longValue());
        }
        hVar.e(j4, Integer.valueOf(id2));
        long j10 = i;
        h hVar2 = this.f1202f;
        if (hVar2.c(j10) < 0) {
            if (i == 0) {
                vVar = new v();
            } else if (i == 1) {
                vVar = new l3.t();
            } else if (i == 2) {
                vVar = new w1();
            } else if (i != 3) {
                vVar = i != 4 ? new v() : new x2();
            } else {
                vVar = new a2();
            }
            androidx.fragment.app.r rVar = (androidx.fragment.app.r) this.f1203g.b(j10);
            if (vVar.C != null) {
                throw new IllegalStateException("Fragment already added");
            }
            if (rVar == null || (bundle = rVar.f967a) == null) {
                bundle = null;
            }
            vVar.f971b = bundle;
            hVar2.e(j10, vVar);
        }
        WeakHashMap weakHashMap = v0.f7946a;
        if (g0.b(frameLayout)) {
            o(eVar);
        }
        m();
    }

    @Override // x1.z
    public final w0 f(ViewGroup viewGroup) {
        int i = e.f1207u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = v0.f7946a;
        frameLayout.setId(e0.a());
        frameLayout.setSaveEnabled(false);
        return new e(frameLayout);
    }

    @Override // x1.z
    public final void g(RecyclerView recyclerView) {
        c cVar = this.i;
        cVar.getClass();
        ViewPager2 viewPager2A = c.a(recyclerView);
        ((ArrayList) viewPager2A.f1210c.f1193b).remove((a) cVar.f1197b);
        d dVar = (d) cVar.f1200f;
        dVar.f10251a.unregisterObserver((b) cVar.f1198c);
        dVar.f1201d.f((p) cVar.f1199d);
        cVar.e = null;
        this.i = null;
    }

    @Override // x1.z
    public final /* bridge */ /* synthetic */ boolean h(w0 w0Var) {
        return true;
    }

    @Override // x1.z
    public final void i(w0 w0Var) {
        o((e) w0Var);
        m();
    }

    @Override // x1.z
    public final void j(w0 w0Var) {
        Long lN = n(((FrameLayout) ((e) w0Var).f10230a).getId());
        if (lN != null) {
            p(lN.longValue());
            this.h.f(lN.longValue());
        }
    }

    public final void m() {
        h hVar;
        h hVar2;
        s sVar;
        View view;
        if (!this.f1206l || this.e.H()) {
            return;
        }
        f fVar = new f(0);
        int i = 0;
        while (true) {
            hVar = this.f1202f;
            int iG = hVar.g();
            hVar2 = this.h;
            if (i >= iG) {
                break;
            }
            long jD = hVar.d(i);
            if (!l(jD)) {
                fVar.add(Long.valueOf(jD));
                hVar2.f(jD);
            }
            i++;
        }
        if (!this.f1205k) {
            this.f1206l = false;
            for (int i10 = 0; i10 < hVar.g(); i10++) {
                long jD2 = hVar.d(i10);
                if (hVar2.c(jD2) < 0 && ((sVar = (s) hVar.b(jD2)) == null || (view = sVar.P) == null || view.getParent() == null)) {
                    fVar.add(Long.valueOf(jD2));
                }
            }
        }
        r.a aVar = new r.a(fVar);
        while (aVar.hasNext()) {
            p(((Long) aVar.next()).longValue());
        }
    }

    public final Long n(int i) {
        Long lValueOf = null;
        int i10 = 0;
        while (true) {
            h hVar = this.h;
            if (i10 >= hVar.g()) {
                return lValueOf;
            }
            if (((Integer) hVar.h(i10)).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(hVar.d(i10));
            }
            i10++;
        }
    }

    public final void o(final e eVar) {
        s sVar = (s) this.f1202f.b(eVar.e);
        if (sVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) eVar.f10230a;
        View view = sVar.P;
        if (!sVar.y() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zY = sVar.y();
        i0 i0Var = this.e;
        if (zY && view == null) {
            ((CopyOnWriteArrayList) i0Var.f884k.f263b).add(new a0(new aa.c(this, sVar, frameLayout)));
            return;
        }
        if (sVar.y() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                k(view, frameLayout);
                return;
            }
            return;
        }
        if (sVar.y()) {
            k(view, frameLayout);
            return;
        }
        if (i0Var.H()) {
            if (i0Var.A) {
                return;
            }
            this.f1201d.a(new p() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$1
                @Override // androidx.lifecycle.p
                public final void a(r rVar, l lVar) {
                    d dVar = this.f1188b;
                    if (dVar.e.H()) {
                        return;
                    }
                    rVar.l().f(this);
                    e eVar2 = eVar;
                    FrameLayout frameLayout2 = (FrameLayout) eVar2.f10230a;
                    WeakHashMap weakHashMap = v0.f7946a;
                    if (g0.b(frameLayout2)) {
                        dVar.o(eVar2);
                    }
                }
            });
            return;
        }
        ((CopyOnWriteArrayList) i0Var.f884k.f263b).add(new a0(new aa.c(this, sVar, frameLayout)));
        ib.c cVar = this.f1204j;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) cVar.f5256b).iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        try {
            if (sVar.M) {
                sVar.M = false;
            }
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0Var);
            aVar.h(0, sVar, "f" + eVar.e, 1);
            aVar.l(sVar, m.f1068d);
            aVar.f();
            this.i.c(false);
        } finally {
            ib.c.p(arrayList);
        }
    }

    public final void p(long j4) {
        Bundle bundleO;
        ViewParent parent;
        h hVar = this.f1202f;
        s sVar = (s) hVar.b(j4);
        if (sVar == null) {
            return;
        }
        View view = sVar.P;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zL = l(j4);
        h hVar2 = this.f1203g;
        if (!zL) {
            hVar2.f(j4);
        }
        if (!sVar.y()) {
            hVar.f(j4);
            return;
        }
        i0 i0Var = this.e;
        if (i0Var.H()) {
            this.f1206l = true;
            return;
        }
        boolean zY = sVar.y();
        ib.c cVar = this.f1204j;
        if (zY && l(j4)) {
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) cVar.f5256b).iterator();
            if (it.hasNext()) {
                throw q1.a.g(it);
            }
            o0 o0Var = (o0) ((HashMap) i0Var.f879c.f44c).get(sVar.e);
            androidx.fragment.app.r rVar = null;
            if (o0Var != null) {
                s sVar2 = o0Var.f949c;
                if (sVar2.equals(sVar)) {
                    if (sVar2.f969a > -1 && (bundleO = o0Var.o()) != null) {
                        rVar = new androidx.fragment.app.r(bundleO);
                    }
                    ib.c.p(arrayList);
                    hVar2.e(j4, rVar);
                }
            }
            i0Var.Y(new IllegalStateException(q1.a.k("Fragment ", sVar, " is not currently in the FragmentManager")));
            throw null;
        }
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) cVar.f5256b).iterator();
        if (it2.hasNext()) {
            throw q1.a.g(it2);
        }
        try {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0Var);
            aVar.j(sVar);
            aVar.f();
            hVar.f(j4);
        } finally {
            ib.c.p(arrayList2);
        }
    }

    public final void q(Parcelable parcelable) {
        h hVar = this.f1203g;
        if (hVar.g() == 0) {
            h hVar2 = this.f1202f;
            if (hVar2.g() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        long j4 = Long.parseLong(str.substring(2));
                        i0 i0Var = this.e;
                        i0Var.getClass();
                        String string = bundle.getString(str);
                        s sVar = null;
                        if (string != null) {
                            s sVarN = i0Var.f879c.n(string);
                            if (sVarN == null) {
                                i0Var.Y(new IllegalStateException(da.v.j("Fragment no longer exists for key ", str, ": unique id ", string)));
                                throw null;
                            }
                            sVar = sVarN;
                        }
                        hVar2.e(j4, sVar);
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                        long j10 = Long.parseLong(str.substring(2));
                        androidx.fragment.app.r rVar = (androidx.fragment.app.r) bundle.getParcelable(str);
                        if (l(j10)) {
                            hVar.e(j10, rVar);
                        }
                    }
                }
                if (hVar2.g() == 0) {
                    return;
                }
                this.f1206l = true;
                this.f1205k = true;
                m();
                final Handler handler = new Handler(Looper.getMainLooper());
                final i iVar = new i(this, 5);
                this.f1201d.a(new p() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$4
                    @Override // androidx.lifecycle.p
                    public final void a(r rVar2, l lVar) {
                        if (lVar == l.ON_DESTROY) {
                            handler.removeCallbacks(iVar);
                            rVar2.l().f(this);
                        }
                    }
                });
                handler.postDelayed(iVar, 10000L);
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }
}
