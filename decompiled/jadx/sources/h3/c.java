package h3;

import android.content.Context;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;
import app.namso_gen.spacehowen.CheckerHistoryActivity;
import app.namso_gen.spacehowen.R;
import java.net.URLEncoder;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4637b;

    public /* synthetic */ c(Object obj, int i) {
        this.f4636a = i;
        this.f4637b = obj;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        o3.h hVarA;
        int i = this.f4636a;
        int i10 = 1;
        int i11 = 0;
        yb.d dVar = null;
        ub.k kVar = ub.k.f9073a;
        Object obj2 = this.f4637b;
        switch (i) {
            case 0:
                CheckerHistoryActivity checkerHistoryActivity = (CheckerHistoryActivity) obj2;
                i3.a aVar = (i3.a) obj;
                int i12 = CheckerHistoryActivity.Q;
                jc.i.e(aVar, "batch");
                ea.j jVar = new ea.j((Context) checkerHistoryActivity, R.style.MyDialogTheme);
                String string = checkerHistoryActivity.getString(R.string.ldc_history_delete_confirm_title);
                g.b bVar = (g.b) jVar.f3530b;
                bVar.f3971d = string;
                bVar.f3972f = checkerHistoryActivity.getString(R.string.ldc_history_delete_confirm_message);
                jVar.k(checkerHistoryActivity.getString(R.string.btn_delete), new e(i11, checkerHistoryActivity, aVar));
                jVar.h(checkerHistoryActivity.getString(R.string.btn_cancel), null);
                g.f fVarA = jVar.a();
                fVarA.setOnShowListener(new f(fVarA, i11));
                fVarA.show();
                return kVar;
            case 1:
                i3.f fVar = (i3.f) obj;
                jc.i.e(fVar, "note");
                ((a2) obj2).b0(fVar);
                return kVar;
            case 2:
                u2 u2Var = (u2) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    ProgressBar progressBar = u2Var.f4859h0;
                    if (progressBar == null) {
                        jc.i.i("loader");
                        throw null;
                    }
                    progressBar.setVisibility(8);
                    Button button = u2Var.f4858g0;
                    if (button == null) {
                        jc.i.i("btnShorten");
                        throw null;
                    }
                    button.setEnabled(true);
                    Toast.makeText(u2Var.U(), u2Var.v(R.string.error_shorten), 0).show();
                }
                return kVar;
            case 3:
                c3 c3Var = (c3) obj2;
                int iIntValue = ((Integer) obj).intValue();
                n nVar = c3Var.f4650f0;
                if (nVar == null) {
                    jc.i.i("mailAdapter");
                    throw null;
                }
                StringBuilder sbN = q1.a.n("https://api.catchmail.io/api/v1/message/", ((f1) nVar.e.get(iIntValue)).f4692a, "?mailbox=");
                sbN.append(URLEncoder.encode(c3Var.f4652h0, "UTF-8"));
                r3.g gVar = new r3.g(sbN.toString(), new b3(c3Var, i11), new b3(c3Var, i10));
                gVar.f8017y = c3Var;
                fa.w wVar = c3Var.f4651g0;
                if (wVar != null) {
                    wVar.a(gVar);
                    return kVar;
                }
                jc.i.i("requestQueue");
                throw null;
            case 4:
                l3.y yVar = (l3.y) obj2;
                k3.m mVar = (k3.m) obj;
                jc.i.e(mVar, "country");
                if (!yVar.E0) {
                    if (yVar.D0 <= 0) {
                        String str = yVar.F0;
                        if (str == null) {
                            o3.k kVar2 = yVar.f6741z0;
                            str = (kVar2 == null || (hVarA = kVar2.a()) == null) ? null : hVarA.f7498a;
                        }
                        String strW = str != null ? yVar.w(R.string.premium_proxy_buy_pack_format, str) : yVar.v(R.string.premium_proxy_buy_pack);
                        jc.i.b(strW);
                        ea.j jVar2 = new ea.j(yVar.U(), R.style.KryptProxyDialog);
                        jVar2.l(R.string.premium_proxy_title);
                        jVar2.f(R.string.premium_proxy_no_mb);
                        jVar2.k(strW, new o0(yVar, 2));
                        jVar2.g(R.string.cancel, null);
                        jVar2.m();
                    } else {
                        yVar.E0 = true;
                        rc.b0.q(androidx.lifecycle.i0.e(yVar.x()), null, new a2.g(yVar, mVar, dVar, 18), 3);
                    }
                }
                return kVar;
            case 5:
                return obj == ((vb.c) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 6:
                h2.b bVar2 = (h2.b) obj;
                jc.i.e(bVar2, "db");
                ((h6.m) obj2).f5034g = bVar2;
                return kVar;
            default:
                y1.a aVar2 = (y1.a) obj;
                jc.i.e(aVar2, "config");
                return ((y1.v) obj2).g(aVar2);
        }
    }
}
