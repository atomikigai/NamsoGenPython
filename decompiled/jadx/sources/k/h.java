package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements y, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f5851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f5852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f5853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f5854d;
    public x e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f5855f;

    public h(ContextWrapper contextWrapper) {
        this.f5851a = contextWrapper;
        this.f5852b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.y
    public final void b(l lVar, boolean z4) {
        x xVar = this.e;
        if (xVar != null) {
            xVar.b(lVar, z4);
        }
    }

    @Override // k.y
    public final boolean c(n nVar) {
        return false;
    }

    @Override // k.y
    public final boolean d(e0 e0Var) {
        boolean zHasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f5861a;
        if (!zHasVisibleItems) {
            return false;
        }
        m mVar = new m();
        mVar.f5875a = e0Var;
        ea.j jVar = new ea.j(context);
        g.b bVar = (g.b) jVar.f3530b;
        h hVar = new h(bVar.f3968a);
        mVar.f5877c = hVar;
        hVar.e = mVar;
        e0Var.b(hVar, context);
        h hVar2 = mVar.f5877c;
        if (hVar2.f5855f == null) {
            hVar2.f5855f = new g(hVar2);
        }
        bVar.f3981q = hVar2.f5855f;
        bVar.f3982r = mVar;
        View view = e0Var.f5874z;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.f3970c = e0Var.f5873y;
            bVar.f3971d = e0Var.f5872x;
        }
        bVar.f3979o = mVar;
        g.f fVarA = jVar.a();
        mVar.f5876b = fVarA;
        fVarA.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.f5876b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.f5876b.show();
        x xVar = this.e;
        if (xVar == null) {
            return true;
        }
        xVar.h(e0Var);
        return true;
    }

    @Override // k.y
    public final boolean e(n nVar) {
        return false;
    }

    @Override // k.y
    public final void f(x xVar) {
        throw null;
    }

    @Override // k.y
    public final boolean g() {
        return false;
    }

    @Override // k.y
    public final void i() {
        g gVar = this.f5855f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // k.y
    public final void k(Context context, l lVar) {
        if (this.f5851a != null) {
            this.f5851a = context;
            if (this.f5852b == null) {
                this.f5852b = LayoutInflater.from(context);
            }
        }
        this.f5853c = lVar;
        g gVar = this.f5855f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        this.f5853c.q(this.f5855f.getItem(i), this, 0);
    }
}
