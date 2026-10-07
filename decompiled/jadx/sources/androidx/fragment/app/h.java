package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f869b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f870c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f871d = false;
    public boolean e = false;

    public h(ViewGroup viewGroup) {
        this.f868a = viewGroup;
    }

    public static h f(ViewGroup viewGroup, z9.c cVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof h) {
            return (h) tag;
        }
        cVar.getClass();
        h hVar = new h(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, hVar);
        return hVar;
    }

    public final void a(int i, int i10, o0 o0Var) {
        synchronized (this.f869b) {
            try {
                m0.f fVar = new m0.f();
                w0 w0VarD = d(o0Var.f949c);
                if (w0VarD != null) {
                    w0VarD.c(i, i10);
                    return;
                }
                w0 w0Var = new w0(i, i10, o0Var, fVar);
                this.f869b.add(w0Var);
                w0Var.f1007d.add(new v0(this, w0Var, 0));
                w0Var.f1007d.add(new v0(this, w0Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList, boolean z4) {
        int i;
        boolean z10;
        int i10;
        int size = arrayList.size();
        boolean z11 = false;
        w0 w0Var = null;
        int i11 = 0;
        w0 w0Var2 = null;
        while (true) {
            i = 2;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            w0 w0Var3 = (w0) obj;
            int iC = q1.a.c(w0Var3.f1006c.P);
            int iD = u.e.d(w0Var3.f1004a);
            if (iD != 0) {
                if (iD != 1) {
                    if (iD == 2 || iD == 3) {
                    }
                } else if (iC != 2) {
                    w0Var2 = w0Var3;
                }
            }
            if (iC == 2 && w0Var == null) {
                w0Var = w0Var3;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            w0 w0Var4 = (w0) obj2;
            m0.f fVar = new m0.f();
            w0Var4.d();
            HashSet hashSet = w0Var4.e;
            hashSet.add(fVar);
            e eVar = new e(w0Var4, fVar);
            eVar.f862d = z11;
            eVar.f861c = z4;
            arrayList2.add(eVar);
            m0.f fVar2 = new m0.f();
            w0Var4.d();
            hashSet.add(fVar2);
            boolean z12 = (!z4 ? w0Var4 == w0Var2 : w0Var4 == w0Var) ? z11 : true;
            g gVar = new g(w0Var4, fVar2);
            int i13 = w0Var4.f1004a;
            s sVar = w0Var4.f1006c;
            if (i13 == 2) {
                if (z4) {
                    sVar.getClass();
                } else {
                    sVar.getClass();
                }
                if (z4) {
                    sVar.getClass();
                } else {
                    sVar.getClass();
                }
            } else if (z4) {
                sVar.getClass();
            } else {
                sVar.getClass();
            }
            if (z12) {
                if (z4) {
                    sVar.getClass();
                } else {
                    sVar.getClass();
                }
            }
            arrayList3.add(gVar);
            w0Var4.f1007d.add(new a3.e(this, arrayList4, w0Var4));
            z11 = false;
        }
        HashMap map = new HashMap();
        int size3 = arrayList3.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList3.get(i14);
            i14++;
            w0 w0Var5 = (w0) ((g) obj3).f864a;
            q1.a.c(w0Var5.f1006c.P);
            int i15 = w0Var5.f1004a;
        }
        int size4 = arrayList3.size();
        int i16 = 0;
        while (i16 < size4) {
            Object obj4 = arrayList3.get(i16);
            i16++;
            g gVar2 = (g) obj4;
            map.put((w0) gVar2.f864a, Boolean.FALSE);
            gVar2.d();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f868a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        int size5 = arrayList2.size();
        boolean z13 = false;
        int i17 = 0;
        while (i17 < size5) {
            Object obj5 = arrayList2.get(i17);
            i17++;
            e eVar2 = (e) obj5;
            w0 w0Var6 = (w0) eVar2.f864a;
            int iC2 = q1.a.c(w0Var6.f1006c.P);
            int i18 = w0Var6.f1004a;
            if (iC2 == i18 || !(iC2 == i || i18 == i)) {
                z10 = zContainsValue;
                i10 = i;
                eVar2.d();
                zContainsValue = z10;
                viewGroup = viewGroup;
                i = i10;
            } else {
                aa.c cVarK = eVar2.k(context);
                if (cVarK == null) {
                    eVar2.d();
                } else {
                    Animator animator = (Animator) cVarK.f264c;
                    if (animator == null) {
                        arrayList5.add(eVar2);
                    } else {
                        w0 w0Var7 = (w0) eVar2.f864a;
                        i10 = i;
                        s sVar2 = w0Var7.f1006c;
                        z10 = zContainsValue;
                        if (Boolean.TRUE.equals(map.get(w0Var7))) {
                            if (i0.D(i10)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + sVar2 + " as this Fragment was involved in a Transition.");
                            }
                            eVar2.d();
                            zContainsValue = z10;
                            viewGroup = viewGroup;
                            i = i10;
                        } else {
                            boolean z14 = w0Var7.f1004a == 3;
                            if (z14) {
                                arrayList4.remove(w0Var7);
                            }
                            View view = sVar2.P;
                            viewGroup.startViewTransition(view);
                            ViewGroup viewGroup2 = viewGroup;
                            animator.addListener(new c(viewGroup2, view, z14, w0Var7, eVar2));
                            animator.setTarget(view);
                            animator.start();
                            ((m0.f) eVar2.f865b).a(new e7.i(animator, 6));
                            zContainsValue = z10;
                            viewGroup = viewGroup2;
                            i = i10;
                            z13 = true;
                        }
                    }
                }
                z10 = zContainsValue;
                i10 = i;
                zContainsValue = z10;
                viewGroup = viewGroup;
                i = i10;
            }
        }
        boolean z15 = zContainsValue;
        int i19 = i;
        ViewGroup viewGroup3 = viewGroup;
        int size6 = arrayList5.size();
        int i20 = 0;
        while (i20 < size6) {
            Object obj6 = arrayList5.get(i20);
            i20++;
            e eVar3 = (e) obj6;
            w0 w0Var8 = (w0) eVar3.f864a;
            s sVar3 = w0Var8.f1006c;
            if (z15) {
                if (i0.D(i19)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + sVar3 + " as Animations cannot run alongside Transitions.");
                }
                eVar3.d();
            } else if (z13) {
                if (i0.D(i19)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + sVar3 + " as Animations cannot run alongside Animators.");
                }
                eVar3.d();
            } else {
                View view2 = sVar3.P;
                aa.c cVarK2 = eVar3.k(context);
                cVarK2.getClass();
                Animation animation = (Animation) cVarK2.f263b;
                animation.getClass();
                if (w0Var8.f1004a != 1) {
                    view2.startAnimation(animation);
                    eVar3.d();
                } else {
                    viewGroup3.startViewTransition(view2);
                    x xVar = new x(animation, viewGroup3, view2);
                    xVar.setAnimationListener(new d(viewGroup3, view2, eVar3));
                    view2.startAnimation(xVar);
                }
                ((m0.f) eVar3.f865b).a(new a2.l(view2, viewGroup3, eVar3, 2));
            }
        }
        int size7 = arrayList4.size();
        int i21 = 0;
        while (i21 < size7) {
            Object obj7 = arrayList4.get(i21);
            i21++;
            w0 w0Var9 = (w0) obj7;
            q1.a.a(w0Var9.f1006c.P, w0Var9.f1004a);
        }
        arrayList4.clear();
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.f868a;
        WeakHashMap weakHashMap = q0.v0.f7946a;
        if (!q0.g0.b(viewGroup)) {
            e();
            this.f871d = false;
            return;
        }
        synchronized (this.f869b) {
            try {
                if (!this.f869b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f870c);
                    this.f870c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        w0 w0Var = (w0) obj;
                        if (i0.D(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + w0Var);
                        }
                        w0Var.a();
                        if (!w0Var.f1009g) {
                            this.f870c.add(w0Var);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f869b);
                    this.f869b.clear();
                    this.f870c.addAll(arrayList2);
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        ((w0) obj2).d();
                    }
                    b(arrayList2, this.f871d);
                    this.f871d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final w0 d(s sVar) {
        ArrayList arrayList = this.f869b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w0 w0Var = (w0) obj;
            if (w0Var.f1006c.equals(sVar) && !w0Var.f1008f) {
                return w0Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f868a;
        WeakHashMap weakHashMap = q0.v0.f7946a;
        boolean zB = q0.g0.b(viewGroup);
        synchronized (this.f869b) {
            try {
                g();
                ArrayList arrayList = this.f869b;
                int size = arrayList.size();
                int i = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((w0) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.f870c);
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    w0 w0Var = (w0) obj2;
                    if (i0.D(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zB) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f868a + " is not attached to window. ";
                        }
                        sb2.append(str2);
                        sb2.append("Cancelling running operation ");
                        sb2.append(w0Var);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    w0Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.f869b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    w0 w0Var2 = (w0) obj3;
                    if (i0.D(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: ");
                        if (zB) {
                            str = "";
                        } else {
                            str = "Container " + this.f868a + " is not attached to window. ";
                        }
                        sb3.append(str);
                        sb3.append("Cancelling pending operation ");
                        sb3.append(w0Var2);
                        Log.v("FragmentManager", sb3.toString());
                    }
                    w0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f869b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w0 w0Var = (w0) obj;
            if (w0Var.f1005b == 2) {
                w0Var.c(q1.a.b(w0Var.f1006c.V().getVisibility()), 1);
            }
        }
    }
}
