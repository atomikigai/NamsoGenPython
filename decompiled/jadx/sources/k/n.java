package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements j0.a {
    public MenuItem.OnMenuItemClickListener A;
    public CharSequence B;
    public CharSequence C;
    public int J;
    public View K;
    public o L;
    public MenuItem.OnActionExpandListener M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5881d;
    public CharSequence e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f5882f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Intent f5883r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public char f5884s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public char f5886u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f5888w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l f5890y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e0 f5891z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5885t = 4096;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5887v = 4096;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5889x = 0;
    public ColorStateList D = null;
    public PorterDuff.Mode E = null;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public int I = 16;
    public boolean N = false;

    public n(l lVar, int i, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f5890y = lVar;
        this.f5878a = i10;
        this.f5879b = i;
        this.f5880c = i11;
        this.f5881d = i12;
        this.e = charSequence;
        this.J = i13;
    }

    public static void c(int i, int i10, String str, StringBuilder sb2) {
        if ((i & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // j0.a
    public final j0.a a(o oVar) {
        this.K = null;
        this.L = oVar;
        this.f5890y.p(true);
        o oVar2 = this.L;
        if (oVar2 != null) {
            oVar2.f5893b = new a4.b(this, 17);
            oVar2.f5892a.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // j0.a
    public final o b() {
        return this.L;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.J & 8) == 0) {
            return false;
        }
        if (this.K == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.M;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f5890y.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.H && (this.F || this.G)) {
            drawable = drawable.mutate();
            if (this.F) {
                i0.b.h(drawable, this.D);
            }
            if (this.G) {
                i0.b.i(drawable, this.E);
            }
            this.H = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.J & 8) == 0) {
            return false;
        }
        if (this.K == null && (oVar = this.L) != null) {
            this.K = oVar.a(this);
        }
        return this.K != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.M;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f5890y.f(this);
        }
        return false;
    }

    public final void f(boolean z4) {
        if (z4) {
            this.I |= 32;
        } else {
            this.I &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.K;
        if (view != null) {
            return view;
        }
        o oVar = this.L;
        if (oVar == null) {
            return null;
        }
        View viewA = oVar.a(this);
        this.K = viewA;
        return viewA;
    }

    @Override // j0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f5887v;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f5886u;
    }

    @Override // j0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f5879b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f5888w;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f5889x;
        if (i == 0) {
            return null;
        }
        Drawable drawableR = com.bumptech.glide.d.r(this.f5890y.f5861a, i);
        this.f5889x = 0;
        this.f5888w = drawableR;
        return d(drawableR);
    }

    @Override // j0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.D;
    }

    @Override // j0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.E;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f5883r;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f5878a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // j0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f5885t;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f5884s;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f5880c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f5891z;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5882f;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // j0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f5891z != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.N;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.I & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.I & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.I & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.L;
        if (oVar == null || !oVar.f5892a.overridesItemVisibility()) {
            return (this.I & 8) == 0;
        }
        return (this.I & 8) == 0 && this.L.f5892a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.K = view;
        this.L = null;
        if (view != null && view.getId() == -1 && (i = this.f5878a) > 0) {
            view.setId(i);
        }
        l lVar = this.f5890y;
        lVar.f5870v = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f5886u == c10) {
            return this;
        }
        this.f5886u = Character.toLowerCase(c10);
        this.f5890y.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i = this.I;
        int i10 = (z4 ? 1 : 0) | (i & (-2));
        this.I = i10;
        if (i != i10) {
            this.f5890y.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i = this.I;
        int i10 = i & 4;
        l lVar = this.f5890y;
        if (i10 == 0) {
            int i11 = (i & (-3)) | (z4 ? 2 : 0);
            this.I = i11;
            if (i != i11) {
                lVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = lVar.f5865f;
        int size = arrayList.size();
        lVar.w();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f5879b == this.f5879b && (nVar.I & 4) != 0 && nVar.isCheckable()) {
                boolean z10 = nVar == this;
                int i13 = nVar.I;
                int i14 = (z10 ? 2 : 0) | (i13 & (-3));
                nVar.I = i14;
                if (i13 != i14) {
                    nVar.f5890y.p(false);
                }
            }
        }
        lVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.I |= 16;
        } else {
            this.I &= -17;
        }
        this.f5890y.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f5889x = 0;
        this.f5888w = drawable;
        this.H = true;
        this.f5890y.p(false);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.D = colorStateList;
        this.F = true;
        this.H = true;
        this.f5890y.p(false);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.E = mode;
        this.G = true;
        this.H = true;
        this.f5890y.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f5883r = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f5884s == c10) {
            return this;
        }
        this.f5884s = c10;
        this.f5890y.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.M = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f5884s = c10;
        this.f5886u = Character.toLowerCase(c11);
        this.f5890y.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i10 = i & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.J = i;
        l lVar = this.f5890y;
        lVar.f5870v = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.f5890y.p(false);
        e0 e0Var = this.f5891z;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5882f = charSequence;
        this.f5890y.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i = this.I;
        int i10 = (z4 ? 0 : 8) | (i & (-9));
        this.I = i10;
        if (i != i10) {
            l lVar = this.f5890y;
            lVar.f5867s = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // j0.a, android.view.MenuItem
    public final j0.a setContentDescription(CharSequence charSequence) {
        this.B = charSequence;
        this.f5890y.p(false);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final j0.a setTooltipText(CharSequence charSequence) {
        this.C = charSequence;
        this.f5890y.p(false);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i) {
        if (this.f5886u == c10 && this.f5887v == i) {
            return this;
        }
        this.f5886u = Character.toLowerCase(c10);
        this.f5887v = KeyEvent.normalizeMetaState(i);
        this.f5890y.p(false);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i) {
        if (this.f5884s == c10 && this.f5885t == i) {
            return this;
        }
        this.f5884s = c10;
        this.f5885t = KeyEvent.normalizeMetaState(i);
        this.f5890y.p(false);
        return this;
    }

    @Override // j0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i, int i10) {
        this.f5884s = c10;
        this.f5885t = KeyEvent.normalizeMetaState(i);
        this.f5886u = Character.toLowerCase(c11);
        this.f5887v = KeyEvent.normalizeMetaState(i10);
        this.f5890y.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f5888w = null;
        this.f5889x = i;
        this.H = true;
        this.f5890y.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f5890y.f5861a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i10;
        l lVar = this.f5890y;
        Context context = lVar.f5861a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.K = viewInflate;
        this.L = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i10 = this.f5878a) > 0) {
            viewInflate.setId(i10);
        }
        lVar.f5870v = true;
        lVar.p(true);
        return this;
    }
}
