package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import gb.r;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a implements k.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f5588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContextView f5589d;
    public aa.c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f5590f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k.l f5592s;

    @Override // j.a
    public final void a() {
        if (this.f5591r) {
            return;
        }
        this.f5591r = true;
        this.e.D(this);
    }

    @Override // j.a
    public final View b() {
        WeakReference weakReference = this.f5590f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // j.a
    public final k.l c() {
        return this.f5592s;
    }

    @Override // j.a
    public final MenuInflater d() {
        return new i(this.f5589d.getContext());
    }

    @Override // j.a
    public final CharSequence e() {
        return this.f5589d.getSubtitle();
    }

    @Override // j.a
    public final CharSequence f() {
        return this.f5589d.getTitle();
    }

    @Override // k.j
    public final boolean g(k.l lVar, MenuItem menuItem) {
        return ((r) this.e.f263b).n(this, menuItem);
    }

    @Override // j.a
    public final void h() {
        this.e.E(this, this.f5592s);
    }

    @Override // j.a
    public final boolean i() {
        return this.f5589d.D;
    }

    @Override // k.j
    public final void j(k.l lVar) {
        h();
        l.j jVar = this.f5589d.f457d;
        if (jVar != null) {
            jVar.l();
        }
    }

    @Override // j.a
    public final void k(View view) {
        this.f5589d.setCustomView(view);
        this.f5590f = view != null ? new WeakReference(view) : null;
    }

    @Override // j.a
    public final void l(int i) {
        m(this.f5588c.getString(i));
    }

    @Override // j.a
    public final void m(CharSequence charSequence) {
        this.f5589d.setSubtitle(charSequence);
    }

    @Override // j.a
    public final void n(int i) {
        o(this.f5588c.getString(i));
    }

    @Override // j.a
    public final void o(CharSequence charSequence) {
        this.f5589d.setTitle(charSequence);
    }

    @Override // j.a
    public final void p(boolean z4) {
        this.f5582b = z4;
        this.f5589d.setTitleOptional(z4);
    }
}
