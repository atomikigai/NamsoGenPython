package l3;

import android.widget.Toast;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f6518b;

    public /* synthetic */ b(i iVar, int i) {
        this.f6517a = i;
        this.f6518b = iVar;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        switch (this.f6517a) {
            case 0:
                n3.c cVar = (n3.c) obj;
                jc.i.e(cVar, "entry");
                i iVar = this.f6518b;
                iVar.f0();
                Toast.makeText(iVar.U(), iVar.w(R.string.free_proxy_assigned, cVar.f7247b, Integer.valueOf(cVar.f7248c)), 0).show();
                b0 b0Var = iVar.f6571w0;
                if (b0Var != null) {
                    b0Var.invoke(cVar);
                }
                iVar.b0(false, false);
                break;
            default:
                d dVar = (d) obj;
                jc.i.e(dVar, "country");
                this.f6518b.h0(dVar);
                break;
        }
        return ub.k.f9073a;
    }
}
