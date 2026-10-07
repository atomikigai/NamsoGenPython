package z7;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f11070d;
    public final /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11071f;

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, Object obj4, long j4, int i) {
        this.f11067a = i;
        this.f11071f = obj;
        this.f11068b = obj2;
        this.f11069c = obj3;
        this.e = obj4;
        this.f11070d = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11067a) {
            case 0:
                String str = (String) this.f11069c;
                z2 z2Var = ((e1) this.f11071f).f11104a;
                String str2 = (String) this.f11068b;
                if (str2 != null) {
                    b2 b2Var = new b2((String) this.e, str2, this.f11070d);
                    z2Var.zzaB().c();
                    String str3 = z2Var.O;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    z2Var.O = str;
                    z2Var.N = b2Var;
                } else {
                    z2Var.zzaB().c();
                    String str4 = z2Var.O;
                    if (str4 == null || str4.equals(str)) {
                        z2Var.O = str;
                        z2Var.N = null;
                    }
                }
                break;
            case 1:
                x1 x1Var = (x1) this.f11071f;
                String str5 = (String) this.f11068b;
                String str6 = (String) this.f11069c;
                x1Var.t(this.f11070d, this.e, str5, str6);
                break;
            default:
                d2 d2Var = (d2) this.f11071f;
                Bundle bundle = (Bundle) this.f11068b;
                b2 b2Var2 = (b2) this.f11069c;
                b2 b2Var3 = (b2) this.e;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                d3 d3Var = ((a1) d2Var.f159a).f11010w;
                a1.d(d3Var);
                d2Var.g(b2Var2, b2Var3, this.f11070d, true, d3Var.h0("screen_view", bundle, null, false));
                break;
        }
    }
}
