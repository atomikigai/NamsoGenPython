package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import k.o;
import k.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ i E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f5598a;
    public boolean h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f5605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f5606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f5608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f5610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5615u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f5618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f5619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f5620z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5599b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5600c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5601d = 0;
    public int e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5602f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5603g = true;

    public h(i iVar, Menu menu) {
        this.E = iVar;
        this.f5598a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f5624c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        i iVar = this.E;
        Context context = iVar.f5624c;
        boolean z4 = false;
        menuItem.setChecked(this.f5613s).setVisible(this.f5614t).setEnabled(this.f5615u).setCheckable(this.f5612r >= 1).setTitleCondensed(this.f5606l).setIcon(this.f5607m);
        int i = this.f5616v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f5619y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (iVar.f5625d == null) {
                iVar.f5625d = i.a(context);
            }
            Object obj = iVar.f5625d;
            String str = this.f5619y;
            g gVar = new g();
            gVar.f5596a = obj;
            Class<?> cls = obj.getClass();
            try {
                gVar.f5597b = cls.getMethod(str, g.f5595c);
                menuItem.setOnMenuItemClickListener(gVar);
            } catch (Exception e) {
                StringBuilder sbN = q1.a.n("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbN.append(cls.getName());
                InflateException inflateException = new InflateException(sbN.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f5612r >= 2) {
            if (menuItem instanceof k.n) {
                k.n nVar = (k.n) menuItem;
                nVar.I = (nVar.I & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                j0.a aVar = sVar.f5899c;
                try {
                    if (sVar.f5900d == null) {
                        sVar.f5900d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f5900d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e4) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e4);
                }
            }
        }
        String str2 = this.f5618x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, i.e, iVar.f5622a));
            z4 = true;
        }
        int i10 = this.f5617w;
        if (i10 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i10);
            }
        }
        o oVar = this.f5620z;
        if (oVar != null) {
            if (menuItem instanceof j0.a) {
                ((j0.a) menuItem).a(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z10 = menuItem instanceof j0.a;
        if (z10) {
            ((j0.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            q0.o.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z10) {
            ((j0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            q0.o.m(menuItem, charSequence2);
        }
        char c10 = this.f5608n;
        int i11 = this.f5609o;
        if (z10) {
            ((j0.a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            q0.o.g(menuItem, c10, i11);
        }
        char c11 = this.f5610p;
        int i12 = this.f5611q;
        if (z10) {
            ((j0.a) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            q0.o.k(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z10) {
                ((j0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                q0.o.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z10) {
                ((j0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                q0.o.i(menuItem, colorStateList);
            }
        }
    }
}
