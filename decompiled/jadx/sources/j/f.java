package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f5594b;

    public f(Context context, a aVar) {
        this.f5593a = context;
        this.f5594b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f5594b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f5594b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new b0(this.f5593a, this.f5594b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f5594b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f5594b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f5594b.f5581a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f5594b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f5594b.f5582b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f5594b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f5594b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f5594b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f5594b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f5594b.f5581a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f5594b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z4) {
        this.f5594b.p(z4);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f5594b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f5594b.n(i);
    }
}
