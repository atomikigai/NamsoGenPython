package z7;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f11290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f11291c;

    public /* synthetic */ o1(x1 x1Var, Bundle bundle, int i) {
        this.f11289a = i;
        this.f11291c = x1Var;
        this.f11290b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11289a) {
            case 0:
                x1 x1Var = this.f11291c;
                q3.e eVar = x1Var.f11434y;
                a1 a1Var = (a1) x1Var.f159a;
                Bundle bundle = this.f11290b;
                if (bundle == null) {
                    q0 q0Var = a1Var.f11006s;
                    a1.d(q0Var);
                    q0Var.H.i(new Bundle());
                    break;
                } else {
                    q0 q0Var2 = a1Var.f11006s;
                    d3 d3Var = a1Var.f11010w;
                    i0 i0Var = a1Var.f11007t;
                    a1.d(q0Var2);
                    Bundle bundleG = q0Var2.H.g();
                    Iterator<String> it = bundle.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            a1.d(d3Var);
                            d3 d3Var2 = ((a1) a1Var.f11005r.f159a).f11010w;
                            a1.d(d3Var2);
                            int i = d3Var2.N(201500000) ? 100 : 25;
                            if (bundleG.size() > i) {
                                int i10 = 0;
                                for (String str : new TreeSet(bundleG.keySet())) {
                                    i10++;
                                    if (i10 > i) {
                                        bundleG.remove(str);
                                    }
                                }
                                a1.d(d3Var);
                                d3.t(eVar, null, 26, null, null, 0);
                                a1.f(i0Var);
                                i0Var.f11195v.b("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                            q0 q0Var3 = a1Var.f11006s;
                            a1.d(q0Var3);
                            q0Var3.H.i(bundleG);
                            k2 k2VarN = a1Var.n();
                            k2VarN.c();
                            k2VarN.d();
                            k2VarN.p(new b3.b(k2VarN, k2VarN.m(false), bundleG, 29));
                            break;
                        } else {
                            String next = it.next();
                            Object obj = bundle.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                a1.d(d3Var);
                                if (d3.L(obj)) {
                                    d3.t(eVar, null, 27, null, null, 0);
                                }
                                a1.f(i0Var);
                                i0Var.f11195v.d(next, "Invalid default event parameter type. Name, value", obj);
                            } else if (d3.O(next)) {
                                a1.f(i0Var);
                                i0Var.f11195v.c(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                bundleG.remove(next);
                            } else {
                                a1.d(d3Var);
                                if (d3Var.H("param", next, 100, obj)) {
                                    d3Var.u(bundleG, next, obj);
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                x1 x1Var2 = this.f11291c;
                x1Var2.c();
                x1Var2.d();
                Bundle bundle2 = this.f11290b;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                com.google.android.gms.common.internal.i0.e(string);
                com.google.android.gms.common.internal.i0.e(string2);
                com.google.android.gms.common.internal.i0.i(bundle2.get("value"));
                a1 a1Var2 = (a1) x1Var2.f159a;
                boolean zB = a1Var2.b();
                d3 d3Var3 = a1Var2.f11010w;
                if (!zB) {
                    i0 i0Var2 = a1Var2.f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11198y.b("Conditional property not set since app measurement is disabled");
                } else {
                    a3 a3Var = new a3(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                    try {
                        a1.d(d3Var3);
                        bundle2.getString("app_id");
                        q qVarI0 = d3Var3.i0(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        a1.d(d3Var3);
                        bundle2.getString("app_id");
                        q qVarI1 = d3Var3.i0(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        a1.d(d3Var3);
                        bundle2.getString("app_id");
                        a1Var2.n().h(new c(bundle2.getString("app_id"), string2, a3Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), qVarI1, bundle2.getLong("trigger_timeout"), qVarI0, bundle2.getLong("time_to_live"), d3Var3.i0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            default:
                x1 x1Var3 = this.f11291c;
                x1Var3.c();
                x1Var3.d();
                Bundle bundle3 = this.f11290b;
                String string3 = bundle3.getString("name");
                com.google.android.gms.common.internal.i0.e(string3);
                a1 a1Var3 = (a1) x1Var3.f159a;
                if (!a1Var3.b()) {
                    i0 i0Var3 = a1Var3.f11007t;
                    a1.f(i0Var3);
                    i0Var3.f11198y.b("Conditional property not cleared since app measurement is disabled");
                } else {
                    a3 a3Var2 = new a3(0L, null, string3, "");
                    try {
                        d3 d3Var4 = a1Var3.f11010w;
                        a1.d(d3Var4);
                        bundle3.getString("app_id");
                        a1Var3.n().h(new c(bundle3.getString("app_id"), "", a3Var2, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), d3Var4.i0(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
        }
    }
}
