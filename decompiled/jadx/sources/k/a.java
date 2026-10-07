package k;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements j0.a {
    public int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f5801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f5802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f5803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f5804d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f5805f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f5807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f5808t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f5809u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f5810v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f5811w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f5812x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5813y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5814z;

    @Override // j0.a
    public final j0.a a(o oVar) {
        throw new UnsupportedOperationException();
    }

    @Override // j0.a
    public final o b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f5807s;
        if (drawable != null) {
            if (this.f5813y || this.f5814z) {
                this.f5807s = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f5807s = drawableMutate;
                if (this.f5813y) {
                    i0.b.h(drawableMutate, this.f5811w);
                }
                if (this.f5814z) {
                    i0.b.i(this.f5807s, this.f5812x);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // j0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f5806r;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f5805f;
    }

    @Override // j0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f5809u;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f5807s;
    }

    @Override // j0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f5811w;
    }

    @Override // j0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f5812x;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f5803c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // j0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f5804d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f5801a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5802b;
        return charSequence != null ? charSequence : this.f5801a;
    }

    @Override // j0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f5810v;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.A & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.A & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.A & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.A & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f5805f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        this.A = (z4 ? 1 : 0) | (this.A & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        this.A = (z4 ? 2 : 0) | (this.A & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f5809u = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        this.A = (z4 ? 16 : 0) | (this.A & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f5807s = drawable;
        c();
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f5811w = colorStateList;
        this.f5813y = true;
        c();
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f5812x = mode;
        this.f5814z = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f5803c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f5804d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f5804d = c10;
        this.f5805f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f5801a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5802b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f5810v = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        this.A = (this.A & 8) | (z4 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i) {
        this.f5805f = Character.toLowerCase(c10);
        this.f5806r = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final j0.a setContentDescription(CharSequence charSequence) {
        this.f5809u = charSequence;
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i) {
        this.f5804d = c10;
        this.e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f5801a = this.f5808t.getResources().getString(i);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final j0.a setTooltipText(CharSequence charSequence) {
        this.f5810v = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f5807s = e0.k.getDrawable(this.f5808t, i);
        c();
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i, int i10) {
        this.f5804d = c10;
        this.e = KeyEvent.normalizeMetaState(i);
        this.f5805f = Character.toLowerCase(c11);
        this.f5806r = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
