package z7;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzib;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements g1 {
    public static volatile a1 S;
    public final x1 A;
    public final u B;
    public final a2 C;
    public final String D;
    public d0 E;
    public k2 F;
    public l G;
    public c0 H;
    public Boolean J;
    public long K;
    public volatile Boolean L;
    public final Boolean M;
    public final Boolean N;
    public volatile boolean O;
    public int P;
    public final long R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11003d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f11004f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f11005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q0 f11006s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i0 f11007t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z0 f11008u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t2 f11009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d3 f11010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e0 f11011x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n7.b f11012y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d2 f11013z;
    public boolean I = false;
    public final AtomicInteger Q = new AtomicInteger(0);

    public a1(n1 n1Var) {
        Bundle bundle;
        Context context = n1Var.f11273a;
        v vVar = new v(24);
        this.f11004f = vVar;
        k1.f11236k = vVar;
        this.f11000a = context;
        this.f11001b = n1Var.f11274b;
        this.f11002c = n1Var.f11275c;
        this.f11003d = n1Var.f11276d;
        this.e = n1Var.h;
        this.L = n1Var.e;
        this.D = n1Var.f11279j;
        this.O = true;
        zzcl zzclVar = n1Var.f11278g;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.M = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.N = (Boolean) obj2;
            }
        }
        zzib.zzd(context);
        this.f11012y = n7.b.f7302a;
        Long l2 = n1Var.i;
        this.R = l2 != null ? l2.longValue() : System.currentTimeMillis();
        g gVar = new g(this);
        gVar.f11134c = e.f11086b;
        this.f11005r = gVar;
        q0 q0Var = new q0(this);
        q0Var.f();
        this.f11006s = q0Var;
        i0 i0Var = new i0(this);
        i0Var.f();
        this.f11007t = i0Var;
        d3 d3Var = new d3(this);
        d3Var.f();
        this.f11010w = d3Var;
        this.f11011x = new e0(new s0(this, 1));
        this.B = new u(this);
        d2 d2Var = new d2(this);
        d2Var.e();
        this.f11013z = d2Var;
        x1 x1Var = new x1(this);
        x1Var.e();
        this.A = x1Var;
        t2 t2Var = new t2(this);
        t2Var.e();
        this.f11009v = t2Var;
        a2 a2Var = new a2(this);
        a2Var.f();
        this.C = a2Var;
        z0 z0Var = new z0(this);
        z0Var.f();
        this.f11008u = z0Var;
        zzcl zzclVar2 = n1Var.f11278g;
        boolean z4 = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            e(x1Var);
            if (((a1) x1Var.f159a).f11000a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((a1) x1Var.f159a).f11000a.getApplicationContext();
                if (x1Var.f11424c == null) {
                    x1Var.f11424c = new gb.k(x1Var, 2);
                }
                if (z4) {
                    application.unregisterActivityLifecycleCallbacks(x1Var.f11424c);
                    application.registerActivityLifecycleCallbacks(x1Var.f11424c);
                    i0 i0Var2 = ((a1) x1Var.f159a).f11007t;
                    f(i0Var2);
                    i0Var2.f11198y.b("Registered activity lifecycle callback");
                }
            }
        } else {
            f(i0Var);
            i0Var.f11193t.b("Application context is not an Application");
        }
        z0Var.l(new y9.j(4, this, n1Var));
    }

    public static final void d(a4.l lVar) {
        if (lVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void e(m0 m0Var) {
        if (m0Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!m0Var.f11256b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(m0Var.getClass())));
        }
    }

    public static final void f(f1 f1Var) {
        if (f1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!f1Var.f11115b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(f1Var.getClass())));
        }
    }

    public static a1 m(Context context, zzcl zzclVar, Long l2) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        com.google.android.gms.common.internal.i0.i(context);
        com.google.android.gms.common.internal.i0.i(context.getApplicationContext());
        if (S == null) {
            synchronized (a1.class) {
                try {
                    if (S == null) {
                        S = new a1(new n1(context, zzclVar, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.i0.i(S);
            S.L = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.i0.i(S);
        return S;
    }

    public final void a() {
        this.Q.incrementAndGet();
    }

    public final boolean b() {
        return g() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    public final boolean c() {
        d3 d3Var;
        boolean z4;
        boolean z10;
        String strH;
        c0 c0VarJ;
        c0 c0VarJ2;
        ServiceInfo serviceInfo;
        if (!this.I) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        z0 z0Var = this.f11008u;
        f(z0Var);
        z0Var.c();
        Boolean bool = this.J;
        n7.b bVar = this.f11012y;
        if (bool == null || this.K == 0) {
            bVar.getClass();
            this.K = SystemClock.elapsedRealtime();
            d3Var = this.f11010w;
            d(d3Var);
            z4 = true;
            if (d3Var.K("android.permission.INTERNET") || !d3Var.K("android.permission.ACCESS_NETWORK_STATE")) {
                z10 = false;
            } else {
                Context context = this.f11000a;
                if (!p7.c.a(context).h() && !this.f11005r.p()) {
                    if (d3.Q(context)) {
                        try {
                            PackageManager packageManager = context.getPackageManager();
                            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null && serviceInfo.enabled) {
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                    z10 = false;
                }
                z10 = true;
            }
            this.J = Boolean.valueOf(z10);
            if (z10) {
                strH = j().h();
                c0VarJ = j();
                c0VarJ.d();
                if (!d3Var.D(strH, c0VarJ.f11056x)) {
                    c0VarJ2 = j();
                    c0VarJ2.d();
                    if (TextUtils.isEmpty(c0VarJ2.f11056x)) {
                        z4 = false;
                    }
                }
                this.J = Boolean.valueOf(z4);
            }
        } else if (!bool.booleanValue()) {
            bVar.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.K) > 1000) {
                bVar.getClass();
                this.K = SystemClock.elapsedRealtime();
                d3Var = this.f11010w;
                d(d3Var);
                z4 = true;
                if (d3Var.K("android.permission.INTERNET")) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                this.J = Boolean.valueOf(z10);
                if (z10) {
                    strH = j().h();
                    c0VarJ = j();
                    c0VarJ.d();
                    if (!d3Var.D(strH, c0VarJ.f11056x)) {
                        c0VarJ2 = j();
                        c0VarJ2.d();
                        if (TextUtils.isEmpty(c0VarJ2.f11056x)) {
                            z4 = false;
                        }
                    }
                    this.J = Boolean.valueOf(z4);
                }
            }
        }
        return this.J.booleanValue();
    }

    public final int g() {
        z0 z0Var = this.f11008u;
        f(z0Var);
        z0Var.c();
        if (this.f11005r.n()) {
            return 1;
        }
        Boolean bool = this.N;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        z0 z0Var2 = this.f11008u;
        f(z0Var2);
        z0Var2.c();
        if (!this.O) {
            return 8;
        }
        q0 q0Var = this.f11006s;
        d(q0Var);
        q0Var.c();
        Boolean boolValueOf = q0Var.g().contains("measurement_enabled") ? Boolean.valueOf(q0Var.g().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        g gVar = this.f11005r;
        v vVar = ((a1) gVar.f159a).f11004f;
        Boolean boolK = gVar.k("firebase_analytics_collection_enabled");
        if (boolK != null) {
            return boolK.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.M;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.L == null || this.L.booleanValue()) ? 0 : 7;
    }

    public final u h() {
        u uVar = this.B;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final l i() {
        f(this.G);
        return this.G;
    }

    public final c0 j() {
        e(this.H);
        return this.H;
    }

    public final d0 k() {
        e(this.E);
        return this.E;
    }

    public final e0 l() {
        return this.f11011x;
    }

    public final k2 n() {
        e(this.F);
        return this.F;
    }

    @Override // z7.g1
    public final i0 zzaA() {
        i0 i0Var = this.f11007t;
        f(i0Var);
        return i0Var;
    }

    @Override // z7.g1
    public final z0 zzaB() {
        z0 z0Var = this.f11008u;
        f(z0Var);
        return z0Var;
    }

    @Override // z7.g1
    public final Context zzaw() {
        return this.f11000a;
    }

    @Override // z7.g1
    public final n7.a zzax() {
        return this.f11012y;
    }

    @Override // z7.g1
    public final v zzay() {
        return this.f11004f;
    }
}
