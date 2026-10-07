package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.namso_gen.spacehowen.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.u0, androidx.lifecycle.h, f2.e {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Object f968e0 = new Object();
    public boolean A;
    public int B;
    public i0 C;
    public v D;
    public s F;
    public int G;
    public int H;
    public String I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean N;
    public ViewGroup O;
    public View P;
    public boolean Q;
    public p S;
    public boolean T;
    public LayoutInflater U;
    public boolean V;
    public t0 Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseArray f973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f975d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f977f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s f978r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f980t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f982v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f984x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f985y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f986z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f969a = -1;
    public String e = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f979s = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f981u = null;
    public i0 E = new i0();
    public boolean M = true;
    public boolean R = true;
    public androidx.lifecycle.m W = androidx.lifecycle.m.e;
    public final androidx.lifecycle.y Z = new androidx.lifecycle.y();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final AtomicInteger f974c0 = new AtomicInteger();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ArrayList f976d0 = new ArrayList();
    public androidx.lifecycle.t X = new androidx.lifecycle.t(this);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public com.bumptech.glide.manager.r f972b0 = new com.bumptech.glide.manager.r(this);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public androidx.lifecycle.m0 f970a0 = null;

    public void A(int i, int i10, Intent intent) {
        if (i0.D(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public void B(Context context) {
        this.N = true;
        v vVar = this.D;
        if ((vVar == null ? null : vVar.e) != null) {
            this.N = true;
        }
    }

    public void C(Bundle bundle) {
        this.N = true;
        W(bundle);
        i0 i0Var = this.E;
        if (i0Var.f886m >= 1) {
            return;
        }
        i0Var.f898y = false;
        i0Var.f899z = false;
        i0Var.F.i = false;
        i0Var.p(1);
    }

    public View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void E() {
        this.N = true;
    }

    public void F() {
        this.N = true;
    }

    public void G() {
        this.N = true;
    }

    public LayoutInflater H(Bundle bundle) {
        v vVar = this.D;
        if (vVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        w wVar = vVar.f1000t;
        LayoutInflater layoutInflaterCloneInContext = wVar.getLayoutInflater().cloneInContext(wVar);
        layoutInflaterCloneInContext.setFactory2(this.E.f881f);
        return layoutInflaterCloneInContext;
    }

    public void I() {
        this.N = true;
    }

    public void K() {
        this.N = true;
    }

    public void L() {
        this.N = true;
    }

    public void N(Bundle bundle) {
        this.N = true;
    }

    public void O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.E.J();
        this.A = true;
        this.Y = new t0(this, f());
        View viewD = D(layoutInflater, viewGroup, bundle);
        this.P = viewD;
        if (viewD == null) {
            if (this.Y.f992d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.Y = null;
            return;
        }
        this.Y.b();
        View view = this.P;
        t0 t0Var = this.Y;
        jc.i.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, t0Var);
        View view2 = this.P;
        t0 t0Var2 = this.Y;
        jc.i.e(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, t0Var2);
        View view3 = this.P;
        t0 t0Var3 = this.Y;
        jc.i.e(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, t0Var3);
        this.Z.j(this.Y);
    }

    public final void P() {
        this.N = true;
        for (s sVar : this.E.f879c.x()) {
            if (sVar != null) {
                sVar.P();
            }
        }
    }

    public final void Q() {
        for (s sVar : this.E.f879c.x()) {
            if (sVar != null) {
                sVar.Q();
            }
        }
    }

    public final void R() {
        for (s sVar : this.E.f879c.x()) {
            if (sVar != null) {
                sVar.R();
            }
        }
    }

    public final androidx.activity.result.c S(androidx.activity.result.b bVar, com.bumptech.glide.d dVar) {
        a5.b bVar2 = new a5.b(this, 4);
        if (this.f969a > 1) {
            throw new IllegalStateException(q1.a.k("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        n nVar = new n(this, bVar2, atomicReference, (e0) dVar, bVar);
        if (this.f969a >= 0) {
            nVar.a();
        } else {
            this.f976d0.add(nVar);
        }
        return new o(atomicReference);
    }

    public final w T() {
        w wVarG = g();
        if (wVarG != null) {
            return wVarG;
        }
        throw new IllegalStateException(q1.a.k("Fragment ", this, " not attached to an activity."));
    }

    public final Context U() {
        Context contextR = r();
        if (contextR != null) {
            return contextR;
        }
        throw new IllegalStateException(q1.a.k("Fragment ", this, " not attached to a context."));
    }

    public final View V() {
        View view = this.P;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(q1.a.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void W(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.E.P(parcelable);
        i0 i0Var = this.E;
        i0Var.f898y = false;
        i0Var.f899z = false;
        i0Var.F.i = false;
        i0Var.p(1);
    }

    public final void X(int i, int i10, int i11, int i12) {
        if (this.S == null && i == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        o().f952b = i;
        o().f953c = i10;
        o().f954d = i11;
        o().e = i12;
    }

    public final void Y(Bundle bundle) {
        i0 i0Var = this.C;
        if (i0Var != null) {
            if (i0Var == null ? false : i0Var.H()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f977f = bundle;
    }

    public final void Z(Intent intent) {
        v vVar = this.D;
        if (vVar == null) {
            throw new IllegalStateException(q1.a.k("Fragment ", this, " not attached to Activity"));
        }
        e0.k.startActivity(vVar.f997f, intent, null);
    }

    public final void a0(IntentSender intentSender, int i, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.D == null) {
            throw new IllegalStateException(q1.a.k("Fragment ", this, " not attached to Activity"));
        }
        if (i0.D(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: null options: null");
        }
        i0 i0VarT = t();
        if (i0VarT.f894u == null) {
            v vVar = i0VarT.f887n;
            if (i == -1) {
                d0.a.c(vVar.e, intentSender, i, null, 0, 0, 0, null);
                return;
            } else {
                vVar.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
        }
        jc.i.e(intentSender, "intentSender");
        androidx.activity.result.h hVar = new androidx.activity.result.h(intentSender, null, 0, 0);
        i0VarT.f896w.addLast(new f0(this.e, i));
        if (i0.D(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        i0VarT.f894u.a(hVar);
    }

    @Override // androidx.lifecycle.h
    public final androidx.lifecycle.s0 c() {
        Application application;
        if (this.C == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f970a0 == null) {
            Context applicationContext = U().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && i0.D(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + U().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f970a0 = new androidx.lifecycle.m0(application, this, this.f977f);
        }
        return this.f970a0;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 f() {
        if (this.C == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (s() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.C.F.f911f;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) map.get(this.e);
        if (t0Var != null) {
            return t0Var;
        }
        androidx.lifecycle.t0 t0Var2 = new androidx.lifecycle.t0();
        map.put(this.e, t0Var2);
        return t0Var2;
    }

    @Override // f2.e
    public final f2.d h() {
        return (f2.d) this.f972b0.f1939d;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t l() {
        return this.X;
    }

    public qd.b m() {
        return new m(this);
    }

    public void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.G));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.H));
        printWriter.print(" mTag=");
        printWriter.println(this.I);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f969a);
        printWriter.print(" mWho=");
        printWriter.print(this.e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f982v);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f983w);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f984x);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f985y);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.J);
        printWriter.print(" mDetached=");
        printWriter.print(this.K);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.M);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.L);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.R);
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.C);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.D);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.F);
        }
        if (this.f977f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f977f);
        }
        if (this.f971b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f971b);
        }
        if (this.f973c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f973c);
        }
        if (this.f975d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f975d);
        }
        s sVarN = this.f978r;
        if (sVarN == null) {
            i0 i0Var = this.C;
            sVarN = (i0Var == null || (str2 = this.f979s) == null) ? null : i0Var.f879c.n(str2);
        }
        if (sVarN != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(sVarN);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f980t);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        p pVar = this.S;
        printWriter.println(pVar == null ? false : pVar.f951a);
        p pVar2 = this.S;
        if ((pVar2 == null ? 0 : pVar2.f952b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            p pVar3 = this.S;
            printWriter.println(pVar3 == null ? 0 : pVar3.f952b);
        }
        p pVar4 = this.S;
        if ((pVar4 == null ? 0 : pVar4.f953c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            p pVar5 = this.S;
            printWriter.println(pVar5 == null ? 0 : pVar5.f953c);
        }
        p pVar6 = this.S;
        if ((pVar6 == null ? 0 : pVar6.f954d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            p pVar7 = this.S;
            printWriter.println(pVar7 == null ? 0 : pVar7.f954d);
        }
        p pVar8 = this.S;
        if ((pVar8 == null ? 0 : pVar8.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            p pVar9 = this.S;
            printWriter.println(pVar9 != null ? pVar9.e : 0);
        }
        if (this.O != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.O);
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.P);
        }
        if (r() != null) {
            new h6.o0(this, f()).e(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.E + ":");
        this.E.r(da.v.h(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final p o() {
        if (this.S == null) {
            p pVar = new p();
            Object obj = f968e0;
            pVar.f956g = obj;
            pVar.h = obj;
            pVar.i = obj;
            pVar.f957j = 1.0f;
            pVar.f958k = null;
            this.S = pVar;
        }
        return this.S;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.N = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        T().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.N = true;
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final w g() {
        v vVar = this.D;
        if (vVar == null) {
            return null;
        }
        return vVar.e;
    }

    public final i0 q() {
        if (this.D != null) {
            return this.E;
        }
        throw new IllegalStateException(q1.a.k("Fragment ", this, " has not been attached yet."));
    }

    public final Context r() {
        v vVar = this.D;
        if (vVar == null) {
            return null;
        }
        return vVar.f997f;
    }

    public final int s() {
        androidx.lifecycle.m mVar = this.W;
        return (mVar == androidx.lifecycle.m.f1066b || this.F == null) ? mVar.ordinal() : Math.min(mVar.ordinal(), this.F.s());
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.D == null) {
            throw new IllegalStateException(q1.a.k("Fragment ", this, " not attached to Activity"));
        }
        i0 i0VarT = t();
        if (i0VarT.f893t != null) {
            i0VarT.f896w.addLast(new f0(this.e, i));
            i0VarT.f893t.a(intent);
        } else {
            v vVar = i0VarT.f887n;
            if (i == -1) {
                e0.k.startActivity(vVar.f997f, intent, null);
            } else {
                vVar.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
    }

    public final i0 t() {
        i0 i0Var = this.C;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException(q1.a.k("Fragment ", this, " not associated with a fragment manager."));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.e);
        if (this.G != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.G));
        }
        if (this.I != null) {
            sb2.append(" tag=");
            sb2.append(this.I);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final Resources u() {
        return U().getResources();
    }

    public final String v(int i) {
        return u().getString(i);
    }

    public final String w(int i, Object... objArr) {
        return u().getString(i, objArr);
    }

    public final t0 x() {
        t0 t0Var = this.Y;
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final boolean y() {
        return this.D != null && this.f982v;
    }

    public void z(Bundle bundle) {
        this.N = true;
    }

    public void J(Bundle bundle) {
    }

    public void M(Bundle bundle, View view) {
    }
}
