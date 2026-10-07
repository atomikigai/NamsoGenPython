package l3;

import android.util.Log;
import android.widget.Toast;
import app.namso_gen.spacehowen.R;
import com.android.billingclient.api.Purchase;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements o3.m, androidx.activity.result.b, o3.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f6700a;

    public /* synthetic */ u(y yVar) {
        this.f6700a = yVar;
    }

    @Override // o3.m
    public void b(o3.e eVar, List list) {
        jc.i.e(eVar, "billingResult");
        jc.i.e(list, "purchases");
        if (eVar.f7495a == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                if (purchase.b() == 1 && purchase.a().contains("proxy_100_mb")) {
                    this.f6700a.h0(purchase);
                }
            }
        }
    }

    @Override // o3.l
    public void d(o3.e eVar, h6.o0 o0Var) {
        o3.h hVarA;
        jc.i.e(eVar, "billingResult");
        if (eVar.f7495a != 0) {
            Log.e("PremiumDialog", "queryProductDetails error: " + eVar.f7497c);
            return;
        }
        List list = (List) o0Var.f5061b;
        jc.i.d(list, "getProductDetailsList(...)");
        o3.k kVar = (o3.k) vb.i.a0(list);
        y yVar = this.f6700a;
        yVar.f6741z0 = kVar;
        String str = (kVar == null || (hVarA = kVar.a()) == null) ? null : hVarA.f7498a;
        if (str != null) {
            yVar.F0 = str;
            androidx.fragment.app.w wVarG = yVar.g();
            if (wVarG != null) {
                wVarG.runOnUiThread(new androidx.webkit.b(12, yVar, str));
            }
        }
    }

    @Override // androidx.activity.result.b
    public void e(Object obj) {
        int iIntValue = ((s4.b) obj).f8393b.intValue();
        y yVar = this.f6700a;
        if (iIntValue == -1) {
            yVar.i0();
            return;
        }
        FirebaseAuth firebaseAuth = yVar.f6739x0;
        if (firebaseAuth == null) {
            jc.i.i("auth");
            throw null;
        }
        if (firebaseAuth.f2702f == null) {
            Toast.makeText(yVar.U(), yVar.v(R.string.premium_proxy_sign_in_required), 0).show();
            yVar.b0(true, false);
        }
    }
}
