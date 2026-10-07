package z7;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11254d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f11255f;

    public m(a1 a1Var, String str, String str2, String str3, long j4, Bundle bundle) {
        p pVar;
        com.google.android.gms.common.internal.i0.e(str2);
        com.google.android.gms.common.internal.i0.e(str3);
        this.f11251a = str2;
        this.f11252b = str3;
        this.f11253c = true == TextUtils.isEmpty(str) ? null : str;
        this.f11254d = j4;
        this.e = 0L;
        if (bundle.isEmpty()) {
            pVar = new p(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    i0 i0Var = a1Var.f11007t;
                    a1.f(i0Var);
                    i0Var.f11190f.b("Param name can't be null");
                    it.remove();
                } else {
                    d3 d3Var = a1Var.f11010w;
                    a1.d(d3Var);
                    Object objG = d3Var.g(bundle2.get(next), next);
                    if (objG == null) {
                        i0 i0Var2 = a1Var.f11007t;
                        a1.f(i0Var2);
                        i0Var2.f11193t.c(a1Var.f11011x.e(next), "Param value can't be null");
                        it.remove();
                    } else {
                        d3 d3Var2 = a1Var.f11010w;
                        a1.d(d3Var2);
                        d3Var2.u(bundle2, next, objG);
                    }
                }
            }
            pVar = new p(bundle2);
        }
        this.f11255f = pVar;
    }

    public final m a(a1 a1Var, long j4) {
        return new m(a1Var, this.f11253c, this.f11251a, this.f11252b, this.f11254d, j4, this.f11255f);
    }

    public final String toString() {
        return q1.a.m(u3.b.e("Event{appId='", this.f11251a, "', name='", this.f11252b, "', params="), this.f11255f.toString(), "}");
    }

    public m(a1 a1Var, String str, String str2, String str3, long j4, long j10, p pVar) {
        com.google.android.gms.common.internal.i0.e(str2);
        com.google.android.gms.common.internal.i0.e(str3);
        com.google.android.gms.common.internal.i0.i(pVar);
        this.f11251a = str2;
        this.f11252b = str3;
        this.f11253c = true == TextUtils.isEmpty(str) ? null : str;
        this.f11254d = j4;
        this.e = j10;
        if (j10 != 0 && j10 > j4) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11193t.d(i0.k(str2), "Event created with reverse previous/current timestamps. appId, name", i0.k(str3));
        }
        this.f11255f = pVar;
    }
}
