package h3;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import app.namso_gen.spacehowen.R;
import com.android.billingclient.api.Purchase;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements o3.m, o3.l, o3.f, androidx.activity.result.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f4715a;

    public /* synthetic */ h0(e1 e1Var) {
        this.f4715a = e1Var;
    }

    @Override // o3.f
    public void a(o3.e eVar, String str) {
        jc.i.e(eVar, "billingResult");
        jc.i.e(str, "<unused var>");
        if (eVar.f7495a == 0) {
            Log.d("Billing", "Compra acreditada y consumida exitosamente.");
            new Handler(Looper.getMainLooper()).postDelayed(new k0(this.f4715a, 0), 500L);
            return;
        }
        Log.e("Billing", "Error al consumir compra: " + eVar.f7495a + " - " + eVar.f7497c);
    }

    @Override // o3.m
    public void b(o3.e eVar, List list) {
        jc.i.e(eVar, "billingResult");
        jc.i.e(list, "purchasesList");
        if (eVar.f7495a != 0) {
            Log.e("Billing", "Error al consultar compras pendientes: " + eVar.f7497c);
            return;
        }
        Log.d("Coins", "clearPendingPurchases: " + list.size() + " compra(s) INAPP");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            Log.d("Coins", "  pendiente: token=" + purchase.c() + " state=" + purchase.b() + " products=" + purchase.a());
            if (purchase.b() == 1) {
                ArrayList arrayListA = purchase.a();
                e1 e1Var = this.f4715a;
                if (arrayListA.contains(e1Var.f4679t0)) {
                    rc.b0.q(androidx.lifecycle.i0.e(e1Var.x()), null, new a2.g(e1Var, purchase, null, 6), 3);
                }
            }
        }
    }

    @Override // o3.l
    public void d(o3.e eVar, h6.o0 o0Var) {
        jc.i.e(eVar, "billingResult");
        int i = eVar.f7495a;
        e1 e1Var = this.f4715a;
        if (i != 0) {
            Toast.makeText(e1Var.U(), e1Var.v(R.string.error_product_details), 0).show();
            return;
        }
        List list = (List) o0Var.f5061b;
        jc.i.d(list, "getProductDetailsList(...)");
        if (list.isEmpty()) {
            return;
        }
        h6.o0 o0VarE = com.bumptech.glide.manager.q.e();
        h6.o0 o0Var2 = new h6.o0(18, false);
        o0Var2.o((o3.k) list.get(0));
        o0VarE.f5061b = new ArrayList(jd.d.D(o0Var2.c()));
        com.bumptech.glide.manager.q qVarB = o0VarE.b();
        o3.b bVar = e1Var.f4678s0;
        if (bVar != null) {
            bVar.w(e1Var.T(), qVarB);
        } else {
            jc.i.i("billingClient");
            throw null;
        }
    }

    @Override // androidx.activity.result.b
    public void e(Object obj) {
        s4.b bVar = (s4.b) obj;
        jc.i.b(bVar);
        int iIntValue = bVar.f8393b.intValue();
        e1 e1Var = this.f4715a;
        if (iIntValue != -1) {
            Toast.makeText(e1Var.U(), e1Var.v(R.string.error_sign_in), 0).show();
            return;
        }
        v9.n nVar = FirebaseAuth.getInstance().f2702f;
        if (nVar != null) {
            rc.b0.q(androidx.lifecycle.i0.e(e1Var.x()), null, new a2.g(e1Var, nVar, null, 8), 3);
        }
    }
}
