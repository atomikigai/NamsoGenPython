package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends androidx.fragment.app.f implements Menu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f5817c;

    public b0(Context context, l lVar) {
        super(context);
        if (lVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f5817c = lVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f5817c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f5817c.addIntentOptions(i, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = g(menuItemArr2[i13]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f5817c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        r.k kVar = (r.k) this.f865b;
        if (kVar != null) {
            kVar.clear();
        }
        this.f5817c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f5817c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return g(this.f5817c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return g(this.f5817c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f5817c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f5817c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i10) {
        return this.f5817c.performIdentifierAction(i, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i10) {
        return this.f5817c.performShortcut(i, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((r.k) this.f865b) != null) {
            int i10 = 0;
            while (true) {
                r.k kVar = (r.k) this.f865b;
                if (i10 >= kVar.f8100c) {
                    break;
                }
                if (((j0.a) kVar.f(i10)).getGroupId() == i) {
                    ((r.k) this.f865b).h(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f5817c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((r.k) this.f865b) != null) {
            int i10 = 0;
            while (true) {
                r.k kVar = (r.k) this.f865b;
                if (i10 >= kVar.f8100c) {
                    break;
                }
                if (((j0.a) kVar.f(i10)).getItemId() == i) {
                    ((r.k) this.f865b).h(i10);
                    break;
                }
                i10++;
            }
        }
        this.f5817c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z4, boolean z10) {
        this.f5817c.setGroupCheckable(i, z4, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z4) {
        this.f5817c.setGroupEnabled(i, z4);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z4) {
        this.f5817c.setGroupVisible(i, z4);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f5817c.setQwertyMode(z4);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f5817c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f5817c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return g(this.f5817c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, CharSequence charSequence) {
        return this.f5817c.addSubMenu(i, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, CharSequence charSequence) {
        return g(this.f5817c.a(i, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, int i12) {
        return this.f5817c.addSubMenu(i, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, int i12) {
        return g(this.f5817c.add(i, i10, i11, i12));
    }
}
