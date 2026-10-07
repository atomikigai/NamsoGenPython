package q3;

import android.os.Bundle;
import android.text.TextUtils;
import z7.a1;
import z7.b2;
import z7.d2;
import z7.i0;
import z7.k2;
import z7.x1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f8002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8004d;

    public /* synthetic */ j(Object obj, Object obj2, long j4, int i) {
        this.f8001a = i;
        this.f8004d = obj;
        this.f8003c = obj2;
        this.f8002b = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8001a) {
            case 0:
                k kVar = (k) this.f8004d;
                kVar.f8005a.a((String) this.f8003c, this.f8002b);
                kVar.f8005a.b(kVar.toString());
                break;
            case 1:
                x1 x1Var = (x1) this.f8003c;
                Bundle bundle = (Bundle) this.f8004d;
                if (!TextUtils.isEmpty(((a1) x1Var.f159a).j().h())) {
                    i0 i0Var = ((a1) x1Var.f159a).f11007t;
                    a1.f(i0Var);
                    i0Var.f11195v.b("Using developer consent only; google app id found");
                } else {
                    x1Var.q(bundle, 0, this.f8002b);
                }
                break;
            default:
                d2 d2Var = (d2) this.f8004d;
                d2Var.h((b2) this.f8003c, false, this.f8002b);
                d2Var.e = null;
                k2 k2VarN = ((a1) d2Var.f159a).n();
                k2VarN.c();
                k2VarN.d();
                k2VarN.p(new y9.j(9, k2VarN, (Object) null));
                break;
        }
    }

    public /* synthetic */ j(x1 x1Var, Bundle bundle, long j4) {
        this.f8001a = 1;
        this.f8003c = x1Var;
        this.f8004d = bundle;
        this.f8002b = j4;
    }
}
