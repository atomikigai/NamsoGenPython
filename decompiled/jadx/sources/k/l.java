package k;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import q0.x0;
import q0.y0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class l implements Menu {
    public static final int[] J = {1, 4, 5, 3, 2, 0};
    public n G;
    public boolean I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f5862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5864d;
    public j e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f5865f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f5866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f5868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f5869u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5870v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f5872x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f5873y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f5874z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5871w = 0;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public final ArrayList E = new ArrayList();
    public final CopyOnWriteArrayList F = new CopyOnWriteArrayList();
    public boolean H = false;

    public l(Context context) {
        boolean zB;
        boolean z4 = false;
        this.f5861a = context;
        Resources resources = context.getResources();
        this.f5862b = resources;
        this.f5865f = new ArrayList();
        this.f5866r = new ArrayList();
        this.f5867s = true;
        this.f5868t = new ArrayList();
        this.f5869u = new ArrayList();
        this.f5870v = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = y0.f7965a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = x0.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z4 = true;
            }
        }
        this.f5864d = z4;
    }

    public final n a(int i, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i14 = (J[i13] << 16) | (65535 & i11);
        n nVar = new n(this, i, i10, i11, i14, charSequence, this.f5871w);
        ArrayList arrayList = this.f5865f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((n) arrayList.get(size)).f5881d <= i14) {
                i12 = size + 1;
                arrayList.add(i12, nVar);
                p(true);
                return nVar;
            }
        }
        i12 = 0;
        arrayList.add(i12, nVar);
        p(true);
        return nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.f5861a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n nVarA = a(i, i10, i11, resolveInfo.loadLabel(packageManager));
            nVarA.setIcon(resolveInfo.loadIcon(packageManager));
            nVarA.f5883r = intent2;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = nVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.F.add(new WeakReference(yVar));
        yVar.k(context, this);
        this.f5870v = true;
    }

    public final void c(boolean z4) {
        if (this.D) {
            return;
        }
        this.D = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.F;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.b(this, z4);
            }
        }
        this.D = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.G;
        if (nVar != null) {
            d(nVar);
        }
        this.f5865f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f5873y = null;
        this.f5872x = null;
        this.f5874z = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.F;
        boolean zE = false;
        if (!copyOnWriteArrayList.isEmpty() && this.G == nVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                y yVar = (y) weakReference.get();
                if (yVar != null) {
                    zE = yVar.e(nVar);
                    if (zE) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zE) {
                this.G = null;
            }
        }
        return zE;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.e;
        return jVar != null && jVar.g(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.F;
        boolean zC = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar != null) {
                zC = yVar.c(nVar);
                if (zC) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zC) {
            this.G = nVar;
        }
        return zC;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f5865f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f5878a == i) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (menuItemFindItem = nVar.f5891z.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final n g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.E;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean zN = n();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            char c10 = zN ? nVar.f5886u : nVar.f5884s;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zN && c10 == '\b' && i == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f5865f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f5865f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = (n) arrayList.get(i10);
                if (nVar.hasSubMenu()) {
                    nVar.f5891z.h(list, i, keyEvent);
                }
                char c10 = zN ? nVar.f5886u : nVar.f5884s;
                if ((modifiers & 69647) == ((zN ? nVar.f5887v : nVar.f5885t) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (zN && c10 == '\b' && i == 67)) && nVar.isEnabled()) {
                        list.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.I) {
            return true;
        }
        ArrayList arrayList = this.f5865f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((n) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f5870v) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.F;
            boolean zG = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG |= yVar.g();
                }
            }
            ArrayList arrayList = this.f5868t;
            ArrayList arrayList2 = this.f5869u;
            if (zG) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    n nVar = (n) arrayListL.get(i);
                    if ((nVar.I & 32) == 32) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f5870v = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z4 = this.f5867s;
        ArrayList arrayList = this.f5866r;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f5865f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            n nVar = (n) arrayList2.get(i);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f5867s = false;
        this.f5870v = true;
        return arrayList;
    }

    public boolean m() {
        return this.H;
    }

    public boolean n() {
        return this.f5863c;
    }

    public boolean o() {
        return this.f5864d;
    }

    public final void p(boolean z4) {
        if (this.A) {
            this.B = true;
            if (z4) {
                this.C = true;
                return;
            }
            return;
        }
        if (z4) {
            this.f5867s = true;
            this.f5870v = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.F;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.i();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i10) {
        return q(findItem(i), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i10) {
        n nVarG = g(i, keyEvent);
        boolean zQ = nVarG != null ? q(nVarG, null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, y yVar, int i) {
        o oVar;
        boolean zExpandActionView;
        o oVar2;
        boolean z4;
        e0 e0Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        y yVar2;
        n nVar = (n) menuItem;
        boolean zD = false;
        if (nVar == null || !nVar.isEnabled()) {
            return false;
        }
        l lVar = nVar.f5890y;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = nVar.A;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(nVar)) && !lVar.e(lVar, nVar)) {
            Intent intent = nVar.f5883r;
            if (intent != null) {
                try {
                    lVar.f5861a.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    oVar = nVar.L;
                    if (oVar == null) {
                    }
                    zExpandActionView = false;
                    oVar2 = nVar.L;
                    if (oVar2 == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (nVar.e()) {
                        zExpandActionView |= nVar.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (nVar.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!nVar.hasSubMenu()) {
                            e0 e0Var2 = new e0(this.f5861a, this, nVar);
                            nVar.f5891z = e0Var2;
                            e0Var2.setHeaderTitle(nVar.e);
                        }
                        e0Var = nVar.f5891z;
                        if (z4) {
                            oVar2.f5892a.onPrepareSubMenu(e0Var);
                        }
                        copyOnWriteArrayList = this.F;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (yVar != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                yVar2 = (y) weakReference.get();
                                if (yVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zD) {
                                    zD = yVar2.d(e0Var);
                                }
                            }
                        }
                        zExpandActionView |= zD;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!nVar.hasSubMenu()) {
                            e0 e0Var3 = new e0(this.f5861a, this, nVar);
                            nVar.f5891z = e0Var3;
                            e0Var3.setHeaderTitle(nVar.e);
                        }
                        e0Var = nVar.f5891z;
                        if (z4) {
                            oVar2.f5892a.onPrepareSubMenu(e0Var);
                        }
                        copyOnWriteArrayList = this.F;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zD = yVar != null ? yVar.d(e0Var) : false;
                            while (r8.hasNext()) {
                                yVar2 = (y) weakReference.get();
                                if (yVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zD) {
                                    zD = yVar2.d(e0Var);
                                }
                            }
                        }
                        zExpandActionView |= zD;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                oVar = nVar.L;
                if (oVar == null && oVar.f5892a.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        oVar2 = nVar.L;
        if (oVar2 == null && oVar2.f5892a.hasSubMenu()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (nVar.e()) {
            zExpandActionView |= nVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (nVar.hasSubMenu() || z4) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!nVar.hasSubMenu()) {
                e0 e0Var4 = new e0(this.f5861a, this, nVar);
                nVar.f5891z = e0Var4;
                e0Var4.setHeaderTitle(nVar.e);
            }
            e0Var = nVar.f5891z;
            if (z4) {
                oVar2.f5892a.onPrepareSubMenu(e0Var);
            }
            copyOnWriteArrayList = this.F;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (yVar != null) {
                }
                while (r8.hasNext()) {
                    yVar2 = (y) weakReference.get();
                    if (yVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zD) {
                        zD = yVar2.d(e0Var);
                    }
                }
            }
            zExpandActionView |= zD;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.F;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f5865f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((n) arrayList.get(i11)).f5879b == i) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((n) arrayList.get(i11)).f5879b != i) {
                    break;
                }
                if (i11 >= 0 && i11 < arrayList.size()) {
                    arrayList.remove(i11);
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f5865f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((n) arrayList.get(i10)).f5878a == i) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i10);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f5865f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).s(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 <= 0 || (menuItemFindItem = findItem(i10)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z4, boolean z10) {
        ArrayList arrayList = this.f5865f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f5879b == i) {
                nVar.I = (nVar.I & (-5)) | (z10 ? 4 : 0);
                nVar.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.H = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z4) {
        ArrayList arrayList = this.f5865f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f5879b == i) {
                nVar.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z4) {
        ArrayList arrayList = this.f5865f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f5879b == i) {
                int i11 = nVar.I;
                int i12 = (i11 & (-9)) | (z4 ? 0 : 8);
                nVar.I = i12;
                if (i11 != i12) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f5863c = z4;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f5865f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f5865f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f5874z = view;
            this.f5872x = null;
            this.f5873y = null;
        } else {
            if (i > 0) {
                this.f5872x = this.f5862b.getText(i);
            } else if (charSequence != null) {
                this.f5872x = charSequence;
            }
            if (i10 > 0) {
                this.f5873y = e0.k.getDrawable(this.f5861a, i10);
            } else if (drawable != null) {
                this.f5873y = drawable;
            }
            this.f5874z = null;
        }
        p(false);
    }

    public final void v() {
        this.A = false;
        if (this.B) {
            this.B = false;
            p(this.C);
        }
    }

    public final void w() {
        if (this.A) {
            return;
        }
        this.A = true;
        this.B = false;
        this.C = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f5862b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f5862b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, CharSequence charSequence) {
        return a(i, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, CharSequence charSequence) {
        n nVarA = a(i, i10, i11, charSequence);
        e0 e0Var = new e0(this.f5861a, this, nVarA);
        nVarA.f5891z = e0Var;
        e0Var.setHeaderTitle(nVarA.e);
        return e0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, int i12) {
        return a(i, i10, i11, this.f5862b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, int i12) {
        return addSubMenu(i, i10, i11, this.f5862b.getString(i12));
    }

    public l k() {
        return this;
    }
}
