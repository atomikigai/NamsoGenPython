package l;

import android.content.Context;
import android.view.View;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k.w {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6265l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f6266m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, k.l lVar, View view) {
        super(context, lVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f6266m = jVar;
        this.f5907f = 8388613;
        a5.b bVar = jVar.H;
        this.h = bVar;
        k.t tVar = this.i;
        if (tVar != null) {
            tVar.f(bVar);
        }
    }

    @Override // k.w
    public final void c() {
        switch (this.f6265l) {
            case 0:
                j jVar = this.f6266m;
                jVar.E = null;
                jVar.getClass();
                super.c();
                break;
            default:
                j jVar2 = this.f6266m;
                k.l lVar = jVar2.f6307c;
                if (lVar != null) {
                    lVar.c(true);
                }
                jVar2.D = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, k.e0 e0Var, View view) {
        super(context, e0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f6266m = jVar;
        if ((e0Var.L.I & 32) != 32) {
            View view2 = jVar.f6312t;
            this.e = view2 == null ? (View) jVar.f6311s : view2;
        }
        a5.b bVar = jVar.H;
        this.h = bVar;
        k.t tVar = this.i;
        if (tVar != null) {
            tVar.f(bVar);
        }
    }
}
