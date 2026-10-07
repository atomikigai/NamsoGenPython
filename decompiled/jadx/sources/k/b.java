package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.u1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends u1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5815u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ View f5816v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f5816v = actionMenuItemView;
    }

    @Override // l.u1
    public final c0 b() {
        l.f fVar;
        switch (this.f5815u) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f5816v).f427x;
                if (cVar == null || (fVar = ((l.g) cVar).f6269a.E) == null) {
                    return null;
                }
                return fVar.a();
            default:
                l.f fVar2 = ((l.i) this.f5816v).f6292d.D;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    @Override // l.u1
    public final boolean c() {
        c0 c0VarB;
        switch (this.f5815u) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f5816v;
                k kVar = actionMenuItemView.f425v;
                return kVar != null && kVar.a(actionMenuItemView.f422s) && (c0VarB = b()) != null && c0VarB.a();
            default:
                ((l.i) this.f5816v).f6292d.l();
                return true;
        }
    }

    @Override // l.u1
    public boolean d() {
        switch (this.f5815u) {
            case 1:
                l.j jVar = ((l.i) this.f5816v).f6292d;
                if (jVar.F != null) {
                    return false;
                }
                jVar.h();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l.i iVar, l.i iVar2) {
        super(iVar2);
        this.f5816v = iVar;
    }
}
