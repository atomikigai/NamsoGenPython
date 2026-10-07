package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends qd.b implements androidx.lifecycle.u0, androidx.lifecycle.r, l0 {
    public final w e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f997f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i0 f999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w f1000t;

    public v(w wVar) {
        this.f1000t = wVar;
        Handler handler = new Handler();
        this.f999s = new i0();
        this.e = wVar;
        this.f997f = wVar;
        this.f998r = handler;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 f() {
        return this.f1000t.f();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t l() {
        return this.f1000t.F;
    }

    @Override // qd.b
    public final View y(int i) {
        return this.f1000t.findViewById(i);
    }

    @Override // qd.b
    public final boolean z() {
        Window window = this.f1000t.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.l0
    public final void a() {
    }
}
