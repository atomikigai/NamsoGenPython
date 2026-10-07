package g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import fa.c1;
import java.util.WeakHashMap;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4062d;

    public /* synthetic */ n(Object obj, int i) {
        this.f4061c = i;
        this.f4062d = obj;
    }

    @Override // fa.c1, q0.f1
    public void b() {
        int i = this.f4061c;
        Object obj = this.f4062d;
        switch (i) {
            case 0:
                ((m) obj).f4060b.G.setVisibility(0);
                break;
            case 1:
                u uVar = (u) obj;
                uVar.G.setVisibility(0);
                if (uVar.G.getParent() instanceof View) {
                    View view = (View) uVar.G.getParent();
                    WeakHashMap weakHashMap = v0.f7946a;
                    q0.h0.c(view);
                }
                break;
        }
    }

    @Override // q0.f1
    public final void c() {
        int i = this.f4061c;
        Object obj = this.f4062d;
        switch (i) {
            case 0:
                u uVar = ((m) obj).f4060b;
                uVar.G.setAlpha(1.0f);
                uVar.J.d(null);
                uVar.J = null;
                break;
            case 1:
                u uVar2 = (u) obj;
                uVar2.G.setAlpha(1.0f);
                uVar2.J.d(null);
                uVar2.J = null;
                break;
            default:
                u uVar3 = (u) ((aa.c) obj).f264c;
                uVar3.G.setVisibility(8);
                PopupWindow popupWindow = uVar3.H;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (uVar3.G.getParent() instanceof View) {
                    View view = (View) uVar3.G.getParent();
                    WeakHashMap weakHashMap = v0.f7946a;
                    q0.h0.c(view);
                }
                uVar3.G.e();
                uVar3.J.d(null);
                uVar3.J = null;
                ViewGroup viewGroup = uVar3.L;
                WeakHashMap weakHashMap2 = v0.f7946a;
                q0.h0.c(viewGroup);
                break;
        }
    }
}
