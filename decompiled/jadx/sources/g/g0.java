package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends j.a implements k.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k.l f4023d;
    public aa.c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f4024f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h0 f4025r;

    public g0(h0 h0Var, Context context, aa.c cVar) {
        this.f4025r = h0Var;
        this.f4022c = context;
        this.e = cVar;
        k.l lVar = new k.l(context);
        lVar.f5871w = 1;
        this.f4023d = lVar;
        lVar.e = this;
    }

    @Override // j.a
    public final void a() {
        h0 h0Var = this.f4025r;
        if (h0Var.i != this) {
            return;
        }
        if (h0Var.f4040p) {
            h0Var.f4034j = this;
            h0Var.f4035k = this.e;
        } else {
            this.e.D(this);
        }
        this.e = null;
        h0Var.t(false);
        ActionBarContextView actionBarContextView = h0Var.f4032f;
        if (actionBarContextView.f463v == null) {
            actionBarContextView.e();
        }
        h0Var.f4030c.setHideOnContentScrollEnabled(h0Var.f4045u);
        h0Var.i = null;
    }

    @Override // j.a
    public final View b() {
        WeakReference weakReference = this.f4024f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.a
    public final k.l c() {
        return this.f4023d;
    }

    @Override // j.a
    public final MenuInflater d() {
        return new j.i(this.f4022c);
    }

    @Override // j.a
    public final CharSequence e() {
        return this.f4025r.f4032f.getSubtitle();
    }

    @Override // j.a
    public final CharSequence f() {
        return this.f4025r.f4032f.getTitle();
    }

    @Override // k.j
    public final boolean g(k.l lVar, MenuItem menuItem) {
        aa.c cVar = this.e;
        if (cVar != null) {
            return ((gb.r) cVar.f263b).n(this, menuItem);
        }
        return false;
    }

    @Override // j.a
    public final void h() {
        if (this.f4025r.i != this) {
            return;
        }
        k.l lVar = this.f4023d;
        lVar.w();
        try {
            this.e.E(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // j.a
    public final boolean i() {
        return this.f4025r.f4032f.D;
    }

    @Override // k.j
    public final void j(k.l lVar) {
        if (this.e == null) {
            return;
        }
        h();
        l.j jVar = this.f4025r.f4032f.f457d;
        if (jVar != null) {
            jVar.l();
        }
    }

    @Override // j.a
    public final void k(View view) {
        this.f4025r.f4032f.setCustomView(view);
        this.f4024f = new WeakReference(view);
    }

    @Override // j.a
    public final void l(int i) {
        m(this.f4025r.f4028a.getResources().getString(i));
    }

    @Override // j.a
    public final void m(CharSequence charSequence) {
        this.f4025r.f4032f.setSubtitle(charSequence);
    }

    @Override // j.a
    public final void n(int i) {
        o(this.f4025r.f4028a.getResources().getString(i));
    }

    @Override // j.a
    public final void o(CharSequence charSequence) {
        this.f4025r.f4032f.setTitle(charSequence);
    }

    @Override // j.a
    public final void p(boolean z4) {
        this.f5582b = z4;
        this.f4025r.f4032f.setTitleOptional(z4);
    }
}
