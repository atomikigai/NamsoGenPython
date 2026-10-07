package h3;

import android.widget.Toast;
import app.namso_gen.spacehowen.R;
import app.namso_gen.spacehowen.SettingsActivity;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j2 implements androidx.activity.result.b, o3.n, o3.l, o3.m, o3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f4743a;

    public /* synthetic */ j2(SettingsActivity settingsActivity) {
        this.f4743a = settingsActivity;
    }

    @Override // o3.a
    public void a(o3.e eVar) {
        int i = SettingsActivity.f1300e0;
        jc.i.e(eVar, "billingResult");
        if (eVar.f7495a == 0) {
            SettingsActivity settingsActivity = this.f4743a;
            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.subscription_activated), 0).show();
        }
    }

    @Override // o3.m
    public void b(o3.e eVar, List list) {
        yb.d dVar;
        Object next;
        int i = SettingsActivity.f1300e0;
        jc.i.e(eVar, "billingResult");
        jc.i.e(list, "purchases");
        if (eVar.f7495a == 0) {
            Iterator it = list.iterator();
            while (true) {
                dVar = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Purchase purchase = (Purchase) next;
                if (purchase.b() == 1 && purchase.f1835c.optBoolean("acknowledged", true) && purchase.a().contains("monthly_subscription")) {
                    break;
                }
            }
            Purchase purchase2 = (Purchase) next;
            SettingsActivity settingsActivity = this.f4743a;
            if (purchase2 != null) {
                rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.g(purchase2, settingsActivity, dVar, 14), 3);
            } else {
                settingsActivity.O = false;
                settingsActivity.runOnUiThread(new p2(settingsActivity, 0));
            }
        }
    }

    @Override // o3.l
    public void d(o3.e eVar, h6.o0 o0Var) {
        k4.b bVar;
        ArrayList arrayList;
        int i = SettingsActivity.f1300e0;
        jc.i.e(eVar, "billingResult");
        List list = (List) o0Var.f5061b;
        if (eVar.f7495a == 0) {
            jc.i.d(list, "getProductDetailsList(...)");
            if (list.isEmpty()) {
                return;
            }
            o3.k kVar = (o3.k) list.get(0);
            SettingsActivity settingsActivity = this.f4743a;
            settingsActivity.N = kVar;
            o3.j jVarV = SettingsActivity.v(kVar);
            o3.i iVar = (jVarV == null || (bVar = jVarV.f7505b) == null || (arrayList = bVar.f5977a) == null) ? null : (o3.i) vb.i.a0(arrayList);
            String str = iVar != null ? iVar.f7502a : null;
            if (str != null) {
                String string = settingsActivity.getString(R.string.sub_price_per_month, str);
                jc.i.d(string, "getString(...)");
                String string2 = settingsActivity.getString(R.string.sub_btn_subscribe_format, string);
                jc.i.d(string2, "getString(...)");
                settingsActivity.runOnUiThread(new androidx.webkit.b(5, settingsActivity, string2));
            }
        }
    }

    @Override // androidx.activity.result.b
    public void e(Object obj) {
        s4.b bVar = (s4.b) obj;
        int i = SettingsActivity.f1300e0;
        jc.i.b(bVar);
        int iIntValue = bVar.f8393b.intValue();
        SettingsActivity settingsActivity = this.f4743a;
        if (iIntValue == -1) {
            settingsActivity.recreate();
        } else {
            Toast.makeText(settingsActivity, settingsActivity.getString(R.string.error_something_went_wrong), 0).show();
        }
    }

    @Override // o3.n
    public void j(o3.e eVar, List list) {
        int i = SettingsActivity.f1300e0;
        jc.i.e(eVar, "billingResult");
        if (eVar.f7495a != 0 || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            if (purchase.b() == 1 && purchase.a().contains("monthly_subscription")) {
                SettingsActivity settingsActivity = this.f4743a;
                rc.b0.q(androidx.lifecycle.i0.e(settingsActivity), null, new a2.e(purchase, settingsActivity, settingsActivity.getSharedPreferences("app_settings", 0), null, 4), 3);
                if (purchase.f1835c.optBoolean("acknowledged", true)) {
                    Toast.makeText(settingsActivity, settingsActivity.getString(R.string.subscription_activated), 0).show();
                } else {
                    String strC = purchase.c();
                    if (strC == null) {
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                    h2.a aVar = new h2.a();
                    aVar.f4607a = strC;
                    o3.b bVar = settingsActivity.M;
                    if (bVar == null) {
                        jc.i.i("billingClient");
                        throw null;
                    }
                    bVar.t(aVar, new j2(settingsActivity));
                }
            }
        }
    }
}
