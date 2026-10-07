package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f1006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1007d;
    public final HashSet e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1009g;
    public final o0 h;

    public w0(int i, int i10, o0 o0Var, m0.f fVar) {
        s sVar = o0Var.f949c;
        this.f1007d = new ArrayList();
        this.e = new HashSet();
        this.f1008f = false;
        this.f1009g = false;
        this.f1004a = i;
        this.f1005b = i10;
        this.f1006c = sVar;
        fVar.a(new a4.b(this, 4));
        this.h = o0Var;
    }

    public final void a() {
        HashSet hashSet = this.e;
        if (this.f1008f) {
            return;
        }
        this.f1008f = true;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m0.f fVar = (m0.f) obj;
            synchronized (fVar) {
                try {
                    if (!fVar.f6966a) {
                        fVar.f6966a = true;
                        fVar.f6968c = true;
                        m0.e eVar = fVar.f6967b;
                        if (eVar != null) {
                            try {
                                eVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (fVar) {
                                    fVar.f6968c = false;
                                    fVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (fVar) {
                            fVar.f6968c = false;
                            fVar.notifyAll();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b() {
        if (!this.f1009g) {
            if (i0.D(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1009g = true;
            ArrayList arrayList = this.f1007d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i10) {
        int iD = u.e.d(i10);
        s sVar = this.f1006c;
        if (iD == 0) {
            if (this.f1004a != 1) {
                if (i0.D(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + sVar + " mFinalState = " + q1.a.C(this.f1004a) + " -> " + q1.a.C(i) + ". ");
                }
                this.f1004a = i;
                return;
            }
            return;
        }
        if (iD == 1) {
            if (this.f1004a == 1) {
                if (i0.D(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + sVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + q1.a.B(this.f1005b) + " to ADDING.");
                }
                this.f1004a = 2;
                this.f1005b = 2;
                return;
            }
            return;
        }
        if (iD != 2) {
            return;
        }
        if (i0.D(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + sVar + " mFinalState = " + q1.a.C(this.f1004a) + " -> REMOVED. mLifecycleImpact  = " + q1.a.B(this.f1005b) + " to REMOVING.");
        }
        this.f1004a = 1;
        this.f1005b = 3;
    }

    public final void d() {
        if (this.f1005b == 2) {
            o0 o0Var = this.h;
            s sVar = o0Var.f949c;
            View viewFindFocus = sVar.P.findFocus();
            if (viewFindFocus != null) {
                sVar.o().f958k = viewFindFocus;
                if (i0.D(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + sVar);
                }
            }
            View viewV = this.f1006c.V();
            if (viewV.getParent() == null) {
                o0Var.b();
                viewV.setAlpha(0.0f);
            }
            if (viewV.getAlpha() == 0.0f && viewV.getVisibility() == 0) {
                viewV.setVisibility(4);
            }
            p pVar = sVar.S;
            viewV.setAlpha(pVar == null ? 1.0f : pVar.f957j);
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + q1.a.C(this.f1004a) + "} {mLifecycleImpact = " + q1.a.B(this.f1005b) + "} {mFragment = " + this.f1006c + "}";
    }
}
