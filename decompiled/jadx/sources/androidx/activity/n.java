package androidx.activity;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends Dialog implements androidx.lifecycle.r, f2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t f377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.manager.r f378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f379c;

    public n(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, i);
        this.f378b = new com.bumptech.glide.manager.r(this);
        this.f379c = new b0(new d(this, 2));
    }

    public static void a(n nVar) {
        super.onBackPressed();
    }

    @Override // f2.e
    public final f2.d h() {
        return (f2.d) this.f378b.f1939d;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t l() {
        androidx.lifecycle.t tVar = this.f377a;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f377a = tVar2;
        return tVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f379c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            jc.i.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            b0 b0Var = this.f379c;
            b0Var.getClass();
            b0Var.e = onBackInvokedDispatcher;
            b0Var.c(b0Var.f344g);
        }
        this.f378b.e(bundle);
        androidx.lifecycle.t tVar = this.f377a;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f377a = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        jc.i.d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f378b.f(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.t tVar = this.f377a;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f377a = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.t tVar = this.f377a;
        if (tVar == null) {
            tVar = new androidx.lifecycle.t(this);
            this.f377a = tVar;
        }
        tVar.d(androidx.lifecycle.l.ON_DESTROY);
        this.f377a = null;
        super.onStop();
    }
}
