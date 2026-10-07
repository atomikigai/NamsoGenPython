package androidx.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import app.namso_gen.spacehowen.R;
import h6.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends d0.i implements u0, androidx.lifecycle.h, f2.e {
    public final CopyOnWriteArrayList A;
    public final CopyOnWriteArrayList B;
    public boolean C;
    public boolean D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g7.i f364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.t f366d;
    public final com.bumptech.glide.manager.r e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f367f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m0 f368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b0 f369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f370t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.bumptech.glide.manager.r f371u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicInteger f372v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f374x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArrayList f375y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CopyOnWriteArrayList f376z;

    public m() {
        this.f2760a = new androidx.lifecycle.t(this);
        this.f364b = new g7.i();
        this.f365c = new o0(new d(this, 0));
        androidx.lifecycle.t tVar = new androidx.lifecycle.t(this);
        this.f366d = tVar;
        com.bumptech.glide.manager.r rVar = new com.bumptech.glide.manager.r((f2.e) this);
        f2.d dVar = (f2.d) rVar.f1939d;
        this.e = rVar;
        this.f369s = null;
        l lVar = new l(this);
        this.f370t = lVar;
        this.f371u = new com.bumptech.glide.manager.r(lVar, new a2.d(this, 1));
        this.f372v = new AtomicInteger();
        this.f373w = new h(this);
        this.f374x = new CopyOnWriteArrayList();
        this.f375y = new CopyOnWriteArrayList();
        this.f376z = new CopyOnWriteArrayList();
        this.A = new CopyOnWriteArrayList();
        this.B = new CopyOnWriteArrayList();
        this.C = false;
        this.D = false;
        tVar.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$2
            @Override // androidx.lifecycle.p
            public final void a(androidx.lifecycle.r rVar2, androidx.lifecycle.l lVar2) {
                if (lVar2 == androidx.lifecycle.l.ON_STOP) {
                    Window window = this.f324a.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        tVar.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.p
            public final void a(androidx.lifecycle.r rVar2, androidx.lifecycle.l lVar2) {
                if (lVar2 == androidx.lifecycle.l.ON_DESTROY) {
                    this.f325a.f364b.f4248b = null;
                    if (!this.f325a.isChangingConfigurations()) {
                        this.f325a.f().a();
                    }
                    l lVar3 = this.f325a.f370t;
                    m mVar = lVar3.f363d;
                    mVar.getWindow().getDecorView().removeCallbacks(lVar3);
                    mVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar3);
                }
            }
        });
        tVar.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.p
            public final void a(androidx.lifecycle.r rVar2, androidx.lifecycle.l lVar2) {
                m mVar = this.f326a;
                if (mVar.f367f == null) {
                    k kVar = (k) mVar.getLastNonConfigurationInstance();
                    if (kVar != null) {
                        mVar.f367f = kVar.f359a;
                    }
                    if (mVar.f367f == null) {
                        mVar.f367f = new t0();
                    }
                }
                mVar.f366d.f(this);
            }
        });
        rVar.d();
        androidx.lifecycle.m mVar = tVar.f1093d;
        if (mVar != androidx.lifecycle.m.f1066b && mVar != androidx.lifecycle.m.f1067c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (dVar.d() == null) {
            k0 k0Var = new k0(dVar, this);
            dVar.f("androidx.lifecycle.internal.SavedStateHandlesProvider", k0Var);
            tVar.a(new SavedStateHandleAttacher(k0Var));
        }
        dVar.f("android:support:activity-result", new e(this, 0));
        j(new d.a() { // from class: androidx.activity.f
            @Override // d.a
            public final void a() {
                m mVar2 = this.f352a;
                Bundle bundleC = ((f2.d) mVar2.e.f1939d).c("android:support:activity-result");
                if (bundleC != null) {
                    h hVar = mVar2.f373w;
                    HashMap map = hVar.f397b;
                    HashMap map2 = hVar.f396a;
                    Bundle bundle = hVar.f401g;
                    ArrayList<Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    hVar.f399d = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    bundle.putAll(bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                    for (int i = 0; i < stringArrayList.size(); i++) {
                        String str = stringArrayList.get(i);
                        if (map.containsKey(str)) {
                            Integer num = (Integer) map.remove(str);
                            if (!bundle.containsKey(str)) {
                                map2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        num2.intValue();
                        String str2 = stringArrayList.get(i);
                        map2.put(num2, str2);
                        hVar.f397b.put(str2, num2);
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        this.f370t.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.h
    public final s0 c() {
        if (this.f368r == null) {
            this.f368r = new m0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f368r;
    }

    @Override // androidx.lifecycle.h
    public final a4.l d() {
        l1.b bVar = new l1.b(l1.a.f6509b);
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f159a;
        if (getApplication() != null) {
            linkedHashMap.put(q0.f1084a, getApplication());
        }
        linkedHashMap.put(i0.f1054a, this);
        linkedHashMap.put(i0.f1055b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(i0.f1056c, getIntent().getExtras());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.u0
    public final t0 f() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f367f == null) {
            k kVar = (k) getLastNonConfigurationInstance();
            if (kVar != null) {
                this.f367f = kVar.f359a;
            }
            if (this.f367f == null) {
                this.f367f = new t0();
            }
        }
        return this.f367f;
    }

    @Override // f2.e
    public final f2.d h() {
        return (f2.d) this.e.f1939d;
    }

    public final void j(d.a aVar) {
        g7.i iVar = this.f364b;
        iVar.getClass();
        if (((m) iVar.f4248b) != null) {
            aVar.a();
        }
        ((CopyOnWriteArraySet) iVar.f4247a).add(aVar);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t l() {
        return this.f366d;
    }

    public final b0 m() {
        if (this.f369s == null) {
            this.f369s = new b0(new i(this, 0));
            this.f366d.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$6
                @Override // androidx.lifecycle.p
                public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
                    if (lVar != androidx.lifecycle.l.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    b0 b0Var = this.f327a.f369s;
                    OnBackInvokedDispatcher onBackInvokedDispatcherA = j.a((m) rVar);
                    b0Var.getClass();
                    jc.i.e(onBackInvokedDispatcherA, "invoker");
                    b0Var.e = onBackInvokedDispatcherA;
                    b0Var.c(b0Var.f344g);
                }
            });
        }
        return this.f369s;
    }

    public final void n() {
        View decorView = getWindow().getDecorView();
        jc.i.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        jc.i.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        jc.i.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        jc.i.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        jc.i.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final androidx.activity.result.c o(androidx.activity.result.b bVar, com.bumptech.glide.d dVar) {
        return this.f373w.c("activity_rq#" + this.f372v.getAndIncrement(), this, dVar, bVar);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i10, Intent intent) {
        if (this.f373w.a(i, i10, intent)) {
            return;
        }
        super.onActivityResult(i, i10, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f374x.iterator();
        while (it.hasNext()) {
            ((p0.a) it.next()).accept(configuration);
        }
    }

    @Override // d0.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.e.e(bundle);
        g7.i iVar = this.f364b;
        iVar.getClass();
        iVar.f4248b = this;
        Iterator it = ((CopyOnWriteArraySet) iVar.f4247a).iterator();
        while (it.hasNext()) {
            ((d.a) it.next()).a();
        }
        super.onCreate(bundle);
        int i = g0.f1047b;
        e0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f365c.f5062c).iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f365c.f5062c).iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4) {
        if (this.C) {
            return;
        }
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((p0.a) it.next()).accept(new b9.e(9));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f376z.iterator();
        while (it.hasNext()) {
            ((p0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f365c.f5062c).iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4) {
        if (this.D) {
            return;
        }
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((p0.a) it.next()).accept(new wa.d());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f365c.f5062c).iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f373w.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        k kVar;
        t0 t0Var = this.f367f;
        if (t0Var == null && (kVar = (k) getLastNonConfigurationInstance()) != null) {
            t0Var = kVar.f359a;
        }
        if (t0Var == null) {
            return null;
        }
        k kVar2 = new k();
        kVar2.f359a = t0Var;
        return kVar2;
    }

    @Override // d0.i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.t tVar = this.f366d;
        if (tVar != null) {
            tVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.e.f(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f375y.iterator();
        while (it.hasNext()) {
            ((p0.a) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (gb.p.b()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            com.bumptech.glide.manager.r rVar = this.f371u;
            synchronized (rVar.f1938c) {
                try {
                    rVar.f1937b = true;
                    ArrayList arrayList = (ArrayList) rVar.f1939d;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ic.a) obj).a();
                    }
                    ((ArrayList) rVar.f1939d).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        n();
        this.f370t.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        n();
        this.f370t.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z4, Configuration configuration) {
        this.C = true;
        try {
            super.onMultiWindowModeChanged(z4, configuration);
            this.C = false;
            Iterator it = this.A.iterator();
            while (it.hasNext()) {
                ((p0.a) it.next()).accept(new b9.e(9));
            }
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z4, Configuration configuration) {
        this.D = true;
        try {
            super.onPictureInPictureModeChanged(z4, configuration);
            this.D = false;
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                ((p0.a) it.next()).accept(new wa.d());
            }
        } catch (Throwable th) {
            this.D = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        this.f370t.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
