package z7;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzrd;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends v2 {
    public final s5.j d(String str) throws Throwable {
        zzrd.zzc();
        a1 a1Var = (a1) this.f159a;
        g gVar = a1Var.f11005r;
        i0 i0Var = a1Var.f11007t;
        s5.j jVar = null;
        if (gVar.l(null, z.f11466l0)) {
            a1.f(i0Var);
            i0Var.f11198y.b("sgtm feature flag enabled.");
            z2 z2Var = this.f11411b;
            j jVar2 = z2Var.f11509c;
            z2.D(jVar2);
            h1 h1VarW = jVar2.w(str);
            if (h1VarW == null) {
                return new s5.j(e(str), 25);
            }
            if (h1VarW.E()) {
                a1.f(i0Var);
                i0Var.f11198y.b("sgtm upload enabled in manifest.");
                v0 v0Var = z2Var.f11507a;
                z2.D(v0Var);
                zzff zzffVarN = v0Var.n(h1VarW.J());
                if (zzffVarN != null) {
                    String strZzj = zzffVarN.zzj();
                    if (!TextUtils.isEmpty(strZzj)) {
                        String strZzi = zzffVarN.zzi();
                        a1.f(i0Var);
                        i0Var.f11198y.d(strZzj, "sgtm configured with upload_url, server_info", true != TextUtils.isEmpty(strZzi) ? "N" : "Y");
                        if (TextUtils.isEmpty(strZzi)) {
                            jVar = new s5.j(strZzj, 25);
                        } else {
                            HashMap map = new HashMap();
                            map.put("x-google-sgtm-server-info", strZzi);
                            jVar = new s5.j(25, strZzj, map);
                        }
                    }
                }
            }
            if (jVar != null) {
                return jVar;
            }
        }
        return new s5.j(e(str), 25);
    }

    public final String e(String str) {
        v0 v0Var = this.f11411b.f11507a;
        z2.D(v0Var);
        v0Var.c();
        v0Var.j(str);
        String str2 = (String) v0Var.f11403w.get(str);
        if (TextUtils.isEmpty(str2)) {
            return (String) z.f11477r.a(null);
        }
        Uri uri = Uri.parse((String) z.f11477r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(str2 + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }
}
