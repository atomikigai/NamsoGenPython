package z7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f11339b;

    public /* synthetic */ s0(a1 a1Var, int i) {
        this.f11338a = i;
        this.f11339b = a1Var;
    }

    public void a(String str, Bundle bundle) {
        String string;
        a1 a1Var = this.f11339b;
        q0 q0Var = a1Var.f11006s;
        z0 z0Var = a1Var.f11008u;
        a1.f(z0Var);
        z0Var.c();
        if (a1Var.b()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        a1.d(q0Var);
        q0Var.F.h(string);
        a1.d(q0Var);
        p0 p0Var = q0Var.G;
        a1Var.f11012y.getClass();
        p0Var.b(System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b() {
        switch (this.f11338a) {
            case 0:
                a1 a1Var = this.f11339b;
                boolean z4 = false;
                try {
                    p7.b bVarA = p7.c.a(a1Var.f11000a);
                    if (bVarA == null) {
                        i0 i0Var = a1Var.f11007t;
                        a1.f(i0Var);
                        i0Var.f11198y.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        a1Var = a1Var;
                    } else {
                        int i = bVarA.f(128, "com.android.vending").versionCode;
                        a1Var = i;
                        if (i >= 80837300) {
                            z4 = true;
                            a1Var = i;
                        }
                    }
                    break;
                } catch (Exception e) {
                    i0 i0Var2 = a1Var.f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11198y.c(e, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z4;
            default:
                a1 a1Var2 = this.f11339b;
                if (TextUtils.isEmpty(a1Var2.f11001b)) {
                    i0 i0Var3 = a1Var2.f11007t;
                    a1.f(i0Var3);
                    if (Log.isLoggable(i0Var3.o(), 3)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public boolean c() {
        q0 q0Var = this.f11339b.f11006s;
        a1.d(q0Var);
        return q0Var.G.a() > 0;
    }

    public boolean d() {
        if (!c()) {
            return false;
        }
        a1 a1Var = this.f11339b;
        a1Var.f11012y.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        q0 q0Var = a1Var.f11006s;
        a1.d(q0Var);
        return jCurrentTimeMillis - q0Var.G.a() > a1Var.f11005r.h(null, z.S);
    }

    public s0(z2 z2Var) {
        this.f11338a = 0;
        this.f11339b = z2Var.f11517w;
    }
}
