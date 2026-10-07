package pb;

import android.view.View;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import ic.l;
import jc.i;
import jc.j;
import ub.k;
import z0.y;
import zc.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i) {
        super(1);
        this.f7837a = i;
        this.f7838b = obj;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        switch (this.f7837a) {
            case 0:
                View view = (View) obj;
                i.e(view, "view");
                ChipNavigationBar chipNavigationBar = (ChipNavigationBar) this.f7838b;
                int id2 = view.getId();
                int i = ChipNavigationBar.L;
                chipNavigationBar.o(id2, true);
                return k.f9073a;
            case 1:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    uc.i iVar = ((y) this.f7838b).f10949f;
                    z0.g gVar = new z0.g(th);
                    iVar.getClass();
                    iVar.g(null, gVar);
                }
                Object obj2 = y.f10944u;
                y yVar = (y) this.f7838b;
                synchronized (obj2) {
                    y.f10943t.remove(yVar.c().getAbsolutePath());
                }
                return k.f9073a;
            default:
                ((h) this.f7838b).b();
                return k.f9073a;
        }
    }
}
