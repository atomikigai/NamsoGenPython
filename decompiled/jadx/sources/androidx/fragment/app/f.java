package androidx.fragment.app;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements a4.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f865b;

    public /* synthetic */ f(Object obj, Object obj2) {
        this.f864a = obj;
        this.f865b = obj2;
    }

    public void c() {
        a3.c cVar = (a3.c) this.f864a;
        if (cVar != null) {
            try {
                ((g.u) this.f865b).f4105v.unregisterReceiver(cVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f864a = null;
        }
    }

    public void d() {
        w0 w0Var = (w0) this.f864a;
        m0.f fVar = (m0.f) this.f865b;
        HashSet hashSet = w0Var.e;
        if (hashSet.remove(fVar) && hashSet.isEmpty()) {
            w0Var.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof j0.a)) {
            return menuItem;
        }
        j0.a aVar = (j0.a) menuItem;
        if (((r.k) this.f865b) == null) {
            this.f865b = new r.k(0);
        }
        MenuItem menuItem2 = (MenuItem) ((r.k) this.f865b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k.s sVar = new k.s((Context) this.f864a, aVar);
        ((r.k) this.f865b).put(aVar, sVar);
        return sVar;
    }

    public abstract void h();

    @Override // a4.y
    public a4.x i(a4.e0 e0Var) {
        Context context = (Context) this.f864a;
        Class cls = (Class) this.f865b;
        return new b4.d(context, e0Var.a(File.class, cls), e0Var.a(Uri.class, cls), cls);
    }

    public void j() {
        c();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((a3.c) this.f864a) == null) {
            this.f864a = new a3.c(this, 1);
        }
        ((g.u) this.f865b).f4105v.registerReceiver((a3.c) this.f864a, intentFilterE);
    }

    public f(Context context) {
        this.f864a = context;
    }

    public f(g.u uVar) {
        this.f865b = uVar;
    }
}
