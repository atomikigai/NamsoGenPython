package ta;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzqu;
import e6.n2;
import java.io.IOException;
import java.io.StringWriter;
import x1.h0;
import x1.h1;
import x1.i0;
import z7.a1;
import z7.q0;
import z7.t2;
import z7.x1;
import z7.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements u8.g, h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8662a;

    public /* synthetic */ c(Object obj) {
        this.f8662a = obj;
    }

    @Override // x1.h1
    public int a(View view) {
        return (view.getTop() - ((i0) view.getLayoutParams()).f10106b.top) - ((ViewGroup.MarginLayoutParams) ((i0) view.getLayoutParams())).topMargin;
    }

    @Override // x1.h1
    public int b() {
        return ((h0) this.f8662a).E();
    }

    @Override // x1.h1
    public int c() {
        h0 h0Var = (h0) this.f8662a;
        return h0Var.f10093o - h0Var.B();
    }

    @Override // x1.h1
    public View d(int i) {
        return ((h0) this.f8662a).u(i);
    }

    public void e(Bundle bundle) {
        n2 n2Var = (n2) this.f8662a;
        n2Var.f3352b.putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            n2Var.f3354d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
    }

    public String f(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            e eVar = (e) this.f8662a;
            f fVar = new f(stringWriter, eVar.f8666a, eVar.f8667b, eVar.f8668c, eVar.f8669d);
            fVar.h(obj);
            fVar.j();
            fVar.f8671b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // x1.h1
    public int g(View view) {
        return view.getBottom() + ((i0) view.getLayoutParams()).f10106b.bottom + ((ViewGroup.MarginLayoutParams) ((i0) view.getLayoutParams())).bottomMargin;
    }

    public String h() {
        return ((Bundle) this.f8662a).getString("com.google.firebase.auth.KEY_PROVIDER_ID");
    }

    public void i(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f8662a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void j() {
        t2 t2Var = (t2) this.f8662a;
        t2Var.c();
        a1 a1Var = (a1) t2Var.f159a;
        q0 q0Var = a1Var.f11006s;
        a1.d(q0Var);
        a1Var.f11012y.getClass();
        if (q0Var.k(System.currentTimeMillis())) {
            q0 q0Var2 = a1Var.f11006s;
            a1.d(q0Var2);
            q0Var2.f11313v.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                z7.i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11198y.b("Detected application was in foreground");
                a1Var.f11012y.getClass();
                l(System.currentTimeMillis(), false);
            }
        }
    }

    public void k(long j4, boolean z4) {
        t2 t2Var = (t2) this.f8662a;
        t2Var.c();
        t2Var.g();
        a1 a1Var = (a1) t2Var.f159a;
        q0 q0Var = a1Var.f11006s;
        a1.d(q0Var);
        if (q0Var.k(j4)) {
            q0 q0Var2 = a1Var.f11006s;
            a1.d(q0Var2);
            q0Var2.f11313v.a(true);
            zzqu.zzc();
            if (a1Var.f11005r.l(null, z.f11463j0)) {
                a1Var.j().j();
            }
        }
        q0 q0Var3 = a1Var.f11006s;
        a1.d(q0Var3);
        q0Var3.f11316y.b(j4);
        q0 q0Var4 = a1Var.f11006s;
        a1.d(q0Var4);
        if (q0Var4.f11313v.b()) {
            l(j4, z4);
        }
    }

    public void l(long j4, boolean z4) {
        t2 t2Var = (t2) this.f8662a;
        t2Var.c();
        a1 a1Var = (a1) t2Var.f159a;
        if (a1Var.b()) {
            q0 q0Var = a1Var.f11006s;
            a1.d(q0Var);
            q0Var.f11316y.b(j4);
            a1Var.f11012y.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            z7.i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11198y.c(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j10 = j4 / 1000;
            Long lValueOf = Long.valueOf(j10);
            x1 x1Var = a1Var.A;
            a1.e(x1Var);
            x1Var.t(j4, lValueOf, "auto", "_sid");
            q0 q0Var2 = a1Var.f11006s;
            a1.d(q0Var2);
            q0Var2.f11317z.b(j10);
            q0 q0Var3 = a1Var.f11006s;
            a1.d(q0Var3);
            q0Var3.f11313v.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            if (a1Var.f11005r.l(null, z.f11448a0) && z4) {
                bundle.putLong("_aib", 1L);
            }
            x1 x1Var2 = a1Var.A;
            a1.e(x1Var2);
            x1Var2.l(bundle, "auto", "_s", j4);
            zzos.zzc();
            if (a1Var.f11005r.l(null, z.f11454d0)) {
                q0 q0Var4 = a1Var.f11006s;
                a1.d(q0Var4);
                String strG = q0Var4.E.g();
                if (TextUtils.isEmpty(strG)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strG);
                x1 x1Var3 = a1Var.A;
                a1.e(x1Var3);
                x1Var3.l(bundle2, "auto", "_ssr", j4);
            }
        }
    }

    public c() {
        n2 n2Var = new n2();
        this.f8662a = n2Var;
        n2Var.f3354d.add("B3EEABB8EE11C2BE770B684D95219ECB");
    }
}
