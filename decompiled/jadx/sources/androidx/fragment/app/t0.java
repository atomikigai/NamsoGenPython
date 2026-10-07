package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements androidx.lifecycle.h, f2.e, androidx.lifecycle.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.t0 f990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.s0 f991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.t f992d = null;
    public com.bumptech.glide.manager.r e = null;

    public t0(s sVar, androidx.lifecycle.t0 t0Var) {
        this.f989a = sVar;
        this.f990b = t0Var;
    }

    public final void a(androidx.lifecycle.l lVar) {
        this.f992d.d(lVar);
    }

    public final void b() {
        if (this.f992d == null) {
            this.f992d = new androidx.lifecycle.t(this);
            this.e = new com.bumptech.glide.manager.r(this);
        }
    }

    @Override // androidx.lifecycle.h
    public final androidx.lifecycle.s0 c() {
        Application application;
        s sVar = this.f989a;
        androidx.lifecycle.s0 s0VarC = sVar.c();
        if (!s0VarC.equals(sVar.f970a0)) {
            this.f991c = s0VarC;
            return s0VarC;
        }
        if (this.f991c == null) {
            Context applicationContext = sVar.U().getApplicationContext();
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
            this.f991c = new androidx.lifecycle.m0(application, this, sVar.f977f);
        }
        return this.f991c;
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 f() {
        b();
        return this.f990b;
    }

    @Override // f2.e
    public final f2.d h() {
        b();
        return (f2.d) this.e.f1939d;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t l() {
        b();
        return this.f992d;
    }
}
