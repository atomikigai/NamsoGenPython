package l3;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.w f6746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jc.q f6747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c3.j f6748d;

    public /* synthetic */ z(int i, androidx.fragment.app.w wVar, c3.j jVar, jc.q qVar) {
        this.f6745a = i;
        this.f6746b = wVar;
        this.f6747c = qVar;
        this.f6748d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6745a) {
            case 0:
                jc.q qVar = this.f6747c;
                qVar.f5776a = null;
                r7.g.E(qVar, this.f6748d, this.f6746b);
                break;
            case 1:
                androidx.fragment.app.w wVar = this.f6746b;
                if (!wVar.getSharedPreferences("app_settings", 0).getBoolean("is_premium_cached", false)) {
                    androidx.fragment.app.i0 i0VarP = wVar.p();
                    jc.i.d(i0VarP, "getSupportFragmentManager(...)");
                    androidx.fragment.app.s sVarY = i0VarP.y("SubscriptionDialog");
                    m3.b bVar = sVarY instanceof m3.b ? (m3.b) sVarY : null;
                    if (bVar == null || !bVar.y()) {
                        m3.b bVar2 = new m3.b();
                        Bundle bundle = new Bundle();
                        bundle.putString("arg_reason", "free_proxy");
                        bVar2.Y(bundle);
                        bVar2.e0(i0VarP, "SubscriptionDialog");
                    }
                    break;
                } else if (!wVar.isFinishing() && !wVar.isDestroyed()) {
                    androidx.fragment.app.i0 i0VarP2 = wVar.p();
                    jc.i.d(i0VarP2, "getSupportFragmentManager(...)");
                    b0 b0Var = new b0(1, wVar, this.f6748d, this.f6747c);
                    i iVar = new i();
                    iVar.f6571w0 = b0Var;
                    iVar.e0(i0VarP2, "FreeProxyDialog");
                    break;
                }
                break;
            default:
                androidx.fragment.app.w wVar2 = this.f6746b;
                if (!wVar2.isFinishing() && !wVar2.isDestroyed()) {
                    androidx.fragment.app.i0 i0VarP3 = wVar2.p();
                    jc.i.d(i0VarP3, "getSupportFragmentManager(...)");
                    b0 b0Var2 = new b0(0, wVar2, this.f6748d, this.f6747c);
                    y yVar = new y();
                    yVar.f6738w0 = b0Var2;
                    yVar.e0(i0VarP3, "PremiumDialog");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z(jc.q qVar, c3.j jVar, androidx.fragment.app.w wVar) {
        this.f6745a = 0;
        this.f6747c = qVar;
        this.f6748d = jVar;
        this.f6746b = wVar;
    }
}
