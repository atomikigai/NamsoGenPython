package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends l implements SubMenu {
    public final l K;
    public final n L;

    public e0(Context context, l lVar, n nVar) {
        super(context);
        this.K = lVar;
        this.L = nVar;
    }

    @Override // k.l
    public final boolean d(n nVar) {
        return this.K.d(nVar);
    }

    @Override // k.l
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.K.e(lVar, menuItem);
    }

    @Override // k.l
    public final boolean f(n nVar) {
        return this.K.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.L;
    }

    @Override // k.l
    public final String j() {
        n nVar = this.L;
        int i = nVar != null ? nVar.f5878a : 0;
        if (i == 0) {
            return null;
        }
        return da.v.f(i, "android:menu:actionviewstates:");
    }

    @Override // k.l
    public final l k() {
        return this.K.k();
    }

    @Override // k.l
    public final boolean m() {
        return this.K.m();
    }

    @Override // k.l
    public final boolean n() {
        return this.K.n();
    }

    @Override // k.l
    public final boolean o() {
        return this.K.o();
    }

    @Override // k.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.K.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.L.setIcon(drawable);
        return this;
    }

    @Override // k.l, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.K.setQwertyMode(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.L.setIcon(i);
        return this;
    }
}
