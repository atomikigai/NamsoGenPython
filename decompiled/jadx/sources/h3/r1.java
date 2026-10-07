package h3;

import android.util.Log;
import android.widget.Toast;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import com.android.billingclient.api.Purchase;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Purchase f4825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(Purchase purchase, MainActivity mainActivity, yb.d dVar, int i) {
        super(2, dVar);
        this.f4823a = i;
        this.f4825c = purchase;
        this.f4826d = mainActivity;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f4823a) {
            case 0:
                return new r1(this.f4825c, this.f4826d, dVar, 0);
            case 1:
                return new r1(this.f4825c, this.f4826d, dVar, 1);
            default:
                return new r1(this.f4825c, this.f4826d, dVar, 2);
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        rc.a0 a0Var = (rc.a0) obj;
        yb.d dVar = (yb.d) obj2;
        switch (this.f4823a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((r1) create(a0Var, dVar)).invokeSuspend(ub.k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        int i = this.f4823a;
        ub.k kVar = ub.k.f9073a;
        MainActivity mainActivity = this.f4826d;
        Purchase purchase = this.f4825c;
        switch (i) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                int i10 = this.f4824b;
                if (i10 == 0) {
                    r7.g.G(obj);
                    k3.e eVar = k3.e.f5930a;
                    String strC = purchase.c();
                    jc.i.d(strC, "getPurchaseToken(...)");
                    this.f4824b = 1;
                    obj = k3.e.f5930a.d(strC, "monthly_subscription", this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                }
                Boolean bool = (Boolean) obj;
                String str = mainActivity.W;
                StringBuilder sb2 = new StringBuilder("checkSubscriptionStatus: verifySubscription=");
                sb2.append(bool);
                sb2.append(" (token=");
                String strC2 = purchase.c();
                jc.i.d(strC2, "getPurchaseToken(...)");
                sb2.append(pc.g.A0(12, strC2));
                sb2.append("...)");
                Log.d(str, sb2.toString());
                boolean z4 = !jc.i.a(bool, Boolean.FALSE);
                mainActivity.Y = z4;
                mainActivity.y(z4);
                mainActivity.A();
                mainActivity.runOnUiThread(new o1(mainActivity, 4));
                return kVar;
            case 1:
                zb.a aVar2 = zb.a.f11555a;
                int i11 = this.f4824b;
                if (i11 == 0) {
                    r7.g.G(obj);
                    k3.e eVar2 = k3.e.f5930a;
                    String strC3 = purchase.c();
                    jc.i.d(strC3, "getPurchaseToken(...)");
                    this.f4824b = 1;
                    obj = k3.e.f5930a.d(strC3, "monthly_subscription", this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                }
                Boolean bool2 = (Boolean) obj;
                String str2 = mainActivity.W;
                StringBuilder sb3 = new StringBuilder("handlePurchaseUpdates: verifySubscription=");
                sb3.append(bool2);
                sb3.append(" (token=");
                String strC4 = purchase.c();
                jc.i.d(strC4, "getPurchaseToken(...)");
                sb3.append(pc.g.A0(12, strC4));
                sb3.append("...)");
                Log.d(str2, sb3.toString());
                if (jc.i.a(bool2, Boolean.FALSE)) {
                    mainActivity.Y = false;
                    mainActivity.y(false);
                    return kVar;
                }
                mainActivity.Y = true;
                mainActivity.y(true);
                mainActivity.S = null;
                mainActivity.A();
                Toast.makeText(mainActivity, mainActivity.getString(R.string.subscription_activated), 0).show();
                return kVar;
            default:
                zb.a aVar3 = zb.a.f11555a;
                int i12 = this.f4824b;
                if (i12 == 0) {
                    r7.g.G(obj);
                    k3.e eVar3 = k3.e.f5930a;
                    String strC5 = purchase.c();
                    jc.i.d(strC5, "getPurchaseToken(...)");
                    this.f4824b = 1;
                    obj = k3.e.f5930a.d(strC5, "monthly_subscription", this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r7.g.G(obj);
                }
                Boolean bool3 = (Boolean) obj;
                String str3 = mainActivity.W;
                StringBuilder sb4 = new StringBuilder("onResume: verifySubscription=");
                sb4.append(bool3);
                sb4.append(" (token=");
                String strC6 = purchase.c();
                jc.i.d(strC6, "getPurchaseToken(...)");
                sb4.append(pc.g.A0(12, strC6));
                sb4.append("...)");
                Log.d(str3, sb4.toString());
                boolean z10 = !jc.i.a(bool3, Boolean.FALSE);
                mainActivity.Y = z10;
                mainActivity.y(z10);
                mainActivity.runOnUiThread(new o1(mainActivity, 5));
                return kVar;
        }
    }
}
