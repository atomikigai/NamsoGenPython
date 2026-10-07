package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import fa.c1;
import java.util.WeakHashMap;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f4021d;

    public /* synthetic */ f0(h0 h0Var, int i) {
        this.f4020c = i;
        this.f4021d = h0Var;
    }

    @Override // q0.f1
    public final void c() {
        View view;
        int i = this.f4020c;
        h0 h0Var = this.f4021d;
        switch (i) {
            case 0:
                if (h0Var.f4039o && (view = h0Var.f4033g) != null) {
                    view.setTranslationY(0.0f);
                    h0Var.f4031d.setTranslationY(0.0f);
                }
                h0Var.f4031d.setVisibility(8);
                h0Var.f4031d.setTransitioning(false);
                h0Var.f4043s = null;
                aa.c cVar = h0Var.f4035k;
                if (cVar != null) {
                    cVar.D(h0Var.f4034j);
                    h0Var.f4034j = null;
                    h0Var.f4035k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = h0Var.f4030c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = v0.f7946a;
                    q0.h0.c(actionBarOverlayLayout);
                }
                break;
            default:
                h0Var.f4043s = null;
                h0Var.f4031d.requestLayout();
                break;
        }
    }
}
