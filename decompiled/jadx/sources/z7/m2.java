package z7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends w2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f11257d;
    public final p0 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0 f11258f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p0 f11259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p0 f11260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p0 f11261t;

    public m2(z2 z2Var) {
        super(z2Var);
        this.f11257d = new HashMap();
        q0 q0Var = ((a1) this.f159a).f11006s;
        a1.d(q0Var);
        this.e = new p0(q0Var, "last_delete_stale", 0L);
        q0 q0Var2 = ((a1) this.f159a).f11006s;
        a1.d(q0Var2);
        this.f11258f = new p0(q0Var2, "backoff", 0L);
        q0 q0Var3 = ((a1) this.f159a).f11006s;
        a1.d(q0Var3);
        this.f11259r = new p0(q0Var3, "last_upload", 0L);
        q0 q0Var4 = ((a1) this.f159a).f11006s;
        a1.d(q0Var4);
        this.f11260s = new p0(q0Var4, "last_upload_attempt", 0L);
        q0 q0Var5 = ((a1) this.f159a).f11006s;
        a1.d(q0Var5);
        this.f11261t = new p0(q0Var5, "midnight_offset", 0L);
    }

    public final Pair g(String str) {
        l2 l2Var;
        b6.a aVarA;
        c();
        a1 a1Var = (a1) this.f159a;
        n7.b bVar = a1Var.f11012y;
        Context context = a1Var.f11000a;
        g gVar = a1Var.f11005r;
        bVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f11257d;
        l2 l2Var2 = (l2) map.get(str);
        if (l2Var2 != null && jElapsedRealtime < l2Var2.f11250c) {
            return new Pair(l2Var2.f11248a, Boolean.valueOf(l2Var2.f11249b));
        }
        long jH = gVar.h(str, z.f11449b) + jElapsedRealtime;
        try {
            long jH2 = gVar.h(str, z.f11451c);
            if (jH2 > 0) {
                try {
                    aVarA = b6.b.a(context);
                } catch (PackageManager.NameNotFoundException unused) {
                    aVarA = null;
                    if (l2Var2 != null && jElapsedRealtime < l2Var2.f11250c + jH2) {
                        return new Pair(l2Var2.f11248a, Boolean.valueOf(l2Var2.f11249b));
                    }
                }
            } else {
                aVarA = b6.b.a(context);
            }
            if (aVarA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = aVarA.f1406a;
            l2Var = str2 != null ? new l2(aVarA.f1407b, str2, jH) : new l2(aVarA.f1407b, "", jH);
            map.put(str, l2Var);
            return new Pair(l2Var.f11248a, Boolean.valueOf(l2Var.f11249b));
        } catch (Exception e) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11197x.c(e, "Unable to get advertising id");
            l2Var = new l2(false, "", jH);
        }
    }

    public final String h(String str, boolean z4) {
        c();
        String str2 = z4 ? (String) g(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestK = d3.k();
        if (messageDigestK == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestK.digest(str2.getBytes())));
    }

    @Override // z7.w2
    public final void f() {
    }
}
