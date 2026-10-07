package o3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.h0;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzaz;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzcz;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import h6.o0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class b extends a.a {
    public final Long A;
    public final zzbl B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7473d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile h0 f7474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f7475g;
    public final o0 h;
    public volatile zzam i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile r f7476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7477k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7487u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7488v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7489w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wa.d f7490x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f7491y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ExecutorService f7492z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7470a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f7471b = 0;
    public final Handler e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7478l = 0;

    public b(wa.d dVar, Context context, n nVar, androidx.emoji2.text.f fVar) {
        long jNextLong = new Random().nextLong();
        this.A = Long.valueOf(jNextLong);
        this.B = zzaz.zza();
        this.f7472c = "8.0.0";
        String strT = T();
        this.f7473d = strT;
        this.f7475g = context.getApplicationContext();
        zziq zziqVarZzc = zzis.zzc();
        zziqVarZzc.zzs("8.0.0");
        if (strT != null) {
            zziqVarZzc.zzt(strT);
        }
        zziqVarZzc.zzq(this.f7475g.getPackageName());
        zziqVarZzc.zzn(jNextLong);
        zziqVarZzc.zzr(false);
        zziqVarZzc.zza(Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.f7475g.getPackageManager().getPackageInfo(this.f7475g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        this.h = new o0(this.f7475g, (zzis) zziqVarZzc.zze());
        if (nVar == null) {
            zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f7474f = new h0(this.f7475g, nVar, this.h);
        this.f7490x = dVar;
        this.f7491y = false;
        this.f7475g.getPackageName();
    }

    public static Future B(Callable callable, long j4, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new a3.e(futureSubmit, runnable, 18, false), (long) (j4 * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            zzc.zzo("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public static void M(b bVar, int i) {
        if (i != 0) {
            bVar.H(0);
            return;
        }
        synchronized (bVar.f7470a) {
            try {
                if (bVar.f7471b == 3) {
                    return;
                }
                bVar.H(2);
                h0 h0Var = bVar.f7474f != null ? bVar.f7474f : null;
                if (h0Var != null) {
                    boolean z4 = bVar.f7487u;
                    y yVar = (y) h0Var.e;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    h0Var.f2114a = z4;
                    y yVar2 = (y) h0Var.f2118f;
                    Context context = (Context) h0Var.f2115b;
                    yVar2.a(context, intentFilter2);
                    if (h0Var.f2114a) {
                        yVar.b(context, intentFilter);
                    } else {
                        yVar.a(context, intentFilter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String T() {
        try {
            return (String) p3.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final synchronized ExecutorService A() {
        try {
            if (this.f7492z == null) {
                this.f7492z = Executors.newFixedThreadPool(zzc.zza, new da.x(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7492z;
    }

    public final void C(a aVar, e eVar, zzie zzieVar, Exception exc) {
        zzc.zzo("BillingClient", "Error in acknowledge purchase!", exc);
        X(zzieVar, 3, eVar, v.a(exc));
        aVar.a(eVar);
    }

    public final void D(f fVar, String str, e eVar, zzie zzieVar, String str2, Exception exc) {
        zzc.zzo("BillingClient", str2, exc);
        X(zzieVar, 4, eVar, v.a(exc));
        fVar.a(eVar, str);
    }

    public final void E(zzhx zzhxVar) {
        try {
            o0 o0Var = this.h;
            int i = this.f7478l;
            o0Var.getClass();
            try {
                zziq zziqVar = (zziq) ((zzis) o0Var.f5061b).zzm();
                zziqVar.zzm(i);
                o0Var.f5061b = (zzis) zziqVar.zze();
                o0Var.t(zzhxVar);
            } catch (Throwable th) {
                zzc.zzo("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public final void F(zzib zzibVar) {
        try {
            o0 o0Var = this.h;
            int i = this.f7478l;
            o0Var.getClass();
            try {
                zziq zziqVar = (zziq) ((zzis) o0Var.f5061b).zzm();
                zziqVar.zzm(i);
                zzis zzisVar = (zzis) zziqVar.zze();
                o0Var.f5061b = zzisVar;
                try {
                    o0Var.z(zzibVar, zzisVar);
                } catch (Throwable th) {
                    zzc.zzo("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                zzc.zzo("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            zzc.zzo("BillingClient", "Unable to log.", th3);
        }
    }

    public final void G(int i, zzie zzieVar, e eVar) {
        try {
            int i10 = v.f7529a;
            zzhv zzhvVar = (zzhv) v.b(zzieVar, 6, eVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED).zzm();
            zzjt zzjtVarZzc = zzjv.zzc();
            zzjtVarZzc.zza(i > 0);
            zzjtVarZzc.zzl(i);
            zzhvVar.zzo(zzjtVarZzc);
            E((zzhx) zzhvVar.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void H(int i) {
        String str;
        String str2;
        synchronized (this.f7470a) {
            try {
                if (this.f7471b == 3) {
                    return;
                }
                int i10 = this.f7471b;
                if (i10 == 0) {
                    str = "DISCONNECTED";
                } else if (i10 != 1) {
                    str = i10 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i == 0) {
                    str2 = "DISCONNECTED";
                } else if (i != 1) {
                    str2 = i != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                zzc.zzm("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f7471b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I(c cVar, int i) {
        zzie zzieVar;
        e eVarP;
        e eVar;
        synchronized (this.f7470a) {
            try {
                if (L()) {
                    eVarP = P(i);
                } else {
                    if (this.f7471b == 1) {
                        zzc.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
                        zzie zzieVar2 = zzie.BILLING_CLIENT_CONNECTING;
                        eVar = x.f7534d;
                        G(i, zzieVar2, eVar);
                    } else if (this.f7471b == 3) {
                        zzc.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        zzie zzieVar3 = zzie.BILLING_CLIENT_CLOSED;
                        eVar = x.f7537j;
                        G(i, zzieVar3, eVar);
                    } else {
                        H(1);
                        if (i == 0) {
                            i = 0;
                        }
                        J();
                        zzc.zzm("BillingClient", "Starting in-app billing setup.");
                        this.f7476j = new r(this, cVar, i);
                        zzbi zzbiVar = this.f7476j.f7523b;
                        zzbiVar.zzd();
                        zzbiVar.zze();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f7475g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            zzieVar = zzie.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzieVar = zzie.INVALID_PHONESKY_PACKAGE;
                                    zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f7472c);
                                    synchronized (this.f7470a) {
                                        try {
                                            if (this.f7471b == 2) {
                                                eVarP = P(i);
                                            } else if (this.f7471b != 1) {
                                                zzc.zzn("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                zzie zzieVar4 = zzie.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                eVar = x.f7537j;
                                                G(i, zzieVar4, eVar);
                                            } else {
                                                r rVar = this.f7476j;
                                                if ((i <= 0 || Build.VERSION.SDK_INT < 29) ? this.f7475g.bindService(intent2, rVar, 1) : this.f7475g.bindService(intent2, 1, A(), rVar)) {
                                                    zzc.zzm("BillingClient", "Service was bonded successfully.");
                                                    eVarP = null;
                                                } else {
                                                    zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                                                    zzc.zzn("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                zzieVar = zzie.INVALID_PHONESKY_PACKAGE;
                                zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        H(0);
                        zzc.zzm("BillingClient", "Billing service unavailable on device.");
                        e eVar2 = x.f7532b;
                        G(i, zzieVar, eVar2);
                        eVarP = eVar2;
                    }
                    eVarP = eVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (eVarP != null) {
            cVar.q(eVarP);
        }
    }

    public final void J() {
        synchronized (this.f7470a) {
            if (this.f7476j != null) {
                try {
                    this.f7475g.unbindService(this.f7476j);
                    this.i = null;
                    this.f7476j = null;
                } catch (Throwable th) {
                    try {
                        zzc.zzo("BillingClient", "There was an exception while unbinding service!", th);
                        this.i = null;
                        this.f7476j = null;
                    } catch (Throwable th2) {
                        this.i = null;
                        this.f7476j = null;
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean K() {
        zzbi zzbiVarZzb = zzbi.zzb(this.B);
        long jZza = 30000;
        for (int i = 1; i <= 3; i++) {
            try {
                long jMax = Math.max(0L, jZza);
                if (jMax <= 0) {
                    zzc.zzn("BillingClient", "No time remaining for reconnection attempt.");
                    return L();
                }
                int i10 = ((e) R(i).get(jMax, TimeUnit.MILLISECONDS)).f7495a;
                if (i10 == 0) {
                    zzc.zzm("BillingClient", "Reconnection succeeded with result: " + i10);
                    return L();
                }
                zzc.zzn("BillingClient", "Reconnection failed with result: " + i10);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jZza = 30000 - zzbiVarZzb.zza(timeUnit);
                long jPow = ((long) Math.pow(2.0d, i - 1)) * 1000;
                if (jZza < jPow) {
                    zzc.zzn("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return L();
                }
                if (i < 3 && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jZza = 30000 - zzbiVarZzb.zza(timeUnit);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        zzc.zzo("BillingClient", "Error sleeping during reconnection attempt: ", e);
                    }
                }
            } catch (Exception e4) {
                if (e4 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                zzc.zzo("BillingClient", "Error during reconnection attempt: ", e4);
            }
        }
        zzc.zzn("BillingClient", "Max retries reached.");
        return L();
    }

    public final boolean L() {
        boolean z4;
        synchronized (this.f7470a) {
            try {
                z4 = false;
                if (this.f7471b == 2 && this.i != null && this.f7476j != null) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    public final Handler N() {
        return Looper.myLooper() == null ? this.e : new Handler(Looper.myLooper());
    }

    public final f7.k O(e eVar, zzie zzieVar, String str, Exception exc) {
        zzc.zzo("BillingClient", str, exc);
        X(zzieVar, 7, eVar, v.a(exc));
        return new f7.k(eVar.f7495a, eVar.f7497c, new ArrayList(), new ArrayList());
    }

    public final e P(int i) {
        zzc.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzhz zzhzVarZzc = zzib.zzc();
        zzhzVarZzc.zzo(6);
        zzjt zzjtVarZzc = zzjv.zzc();
        zzjtVarZzc.zzn(true);
        zzjtVarZzc.zza(i > 0);
        zzjtVarZzc.zzl(i);
        zzhzVarZzc.zzn(zzjtVarZzc);
        F((zzib) zzhzVarZzc.zze());
        return x.i;
    }

    public final e Q() {
        int[] iArr = {0, 3};
        synchronized (this.f7470a) {
            for (int i = 0; i < 2; i++) {
                if (this.f7471b == iArr[i]) {
                    return x.f7537j;
                }
            }
            return x.h;
        }
    }

    public final zzcz R(int i) {
        zzc.zzm("BillingClient", "Already connected or not opted into auto reconnection.");
        return zzcu.zza(x.i);
    }

    public final void S() {
        if (TextUtils.isEmpty(null)) {
            this.f7475g.getPackageName();
        }
    }

    public final o0 U(e eVar, zzie zzieVar, String str, Exception exc) {
        X(zzieVar, 9, eVar, v.a(exc));
        zzc.zzo("BillingClient", str, exc);
        return new o0(eVar, null, 21, false);
    }

    public final void V(int i, zzie zzieVar, e eVar) {
        try {
            int i10 = v.f7529a;
            E(v.b(zzieVar, i, eVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void W(zzie zzieVar, e eVar, long j4) {
        try {
            int i = v.f7529a;
            try {
                this.h.u(v.b(zzieVar, 2, eVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f7478l, j4);
            } catch (Throwable th) {
                zzc.zzo("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public final void X(zzie zzieVar, int i, e eVar, String str) {
        try {
            int i10 = v.f7529a;
            E(v.b(zzieVar, i, eVar, str, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void Y(zzie zzieVar, e eVar, long j4, boolean z4) {
        try {
            int i = v.f7529a;
            try {
                this.h.w(v.b(zzieVar, 2, eVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f7478l, j4, z4);
            } catch (Throwable th) {
                zzc.zzo("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public final void Z(zzie zzieVar, e eVar, String str, long j4, boolean z4) {
        try {
            int i = v.f7529a;
            try {
                this.h.w(v.b(zzieVar, 2, eVar, str, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f7478l, j4, z4);
            } catch (Throwable th) {
                zzc.zzo("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public final void a0(e eVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.e.post(new a3.e(this, eVar, 17, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t(h2.a aVar, a aVar2) {
        if (B(new q(this, aVar2, aVar, 0), 30000L, new a3.e(this, aVar2, 16, 0 == true ? 1 : 0), N(), A()) == null) {
            e eVarQ = Q();
            V(3, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, eVarQ);
            aVar2.a(eVarQ);
        }
    }

    public void u(i6.e eVar, f fVar) {
        if (B(new q(this, fVar, eVar, 1), 30000L, new b3.b(this, fVar, eVar, 7, false), N(), A()) == null) {
            e eVarQ = Q();
            V(4, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, eVarQ);
            fVar.a(eVarQ, eVar.f5226b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #5 {, blocks: (B:20:0x004f, B:22:0x0053), top: B:50:0x004f, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void v() {
        ExecutorService executorService;
        try {
            int i = v.f7529a;
            F(v.c(12, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f7470a) {
            try {
                if (this.f7474f != null) {
                    h0 h0Var = this.f7474f;
                    y yVar = (y) h0Var.e;
                    Context context = (Context) h0Var.f2115b;
                    yVar.c(context);
                    ((y) h0Var.f2118f).c(context);
                    try {
                        zzc.zzm("BillingClient", "Unbinding from service.");
                        J();
                    } catch (Throwable th2) {
                        zzc.zzo("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                    }
                    try {
                        synchronized (this) {
                            executorService = this.f7492z;
                            if (executorService != null) {
                                executorService.shutdownNow();
                                this.f7492z = null;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            zzc.zzo("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th3);
                        } catch (Throwable th4) {
                            H(3);
                            throw th4;
                        }
                    }
                    H(3);
                } else {
                    zzc.zzm("BillingClient", "Unbinding from service.");
                    J();
                    synchronized (this) {
                        executorService = this.f7492z;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.f7492z = null;
                        }
                        H(3);
                    }
                }
            } catch (Throwable th5) {
                zzc.zzo("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th5);
            }
            throw th;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r10v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v11 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v12 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v16 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v21 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v8 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v12 ??, new type: android.os.Bundle
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v34 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: o3.h
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: o3.h
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v5 ??, new type: o3.h
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v5 ??, new type: o3.h
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v7 ??, new type: o3.h
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v7 ??, new type: o3.h
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: java.lang.Object
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public o3.e w(android.app.Activity r31, com.bumptech.glide.manager.q r32) {
        /*
            Method dump skipped, instruction units count: 1920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.b.w(android.app.Activity, com.bumptech.glide.manager.q):o3.e");
    }

    public void x(a4.b bVar, l lVar) {
        if (B(new q(this, lVar, bVar, 2), 30000L, new a3.e(this, lVar, 19, false), N(), A()) == null) {
            e eVarQ = Q();
            V(7, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, eVarQ);
            lVar.d(eVarQ, new o0(19, zzbt.zzk(), zzbt.zzk()));
        }
    }

    public final void y(ib.c cVar, m mVar) {
        if (B(new q(this, mVar, (String) cVar.f5256b, 3), 30000L, new a3.e(this, mVar, 20, false), N(), A()) == null) {
            e eVarQ = Q();
            V(9, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, eVarQ);
            mVar.b(eVarQ, zzbt.zzk());
        }
    }

    public void z(c cVar) {
        I(cVar, 0);
    }

    public b(wa.d dVar, Context context, androidx.emoji2.text.f fVar) {
        long jNextLong = new Random().nextLong();
        this.A = Long.valueOf(jNextLong);
        this.B = zzaz.zza();
        this.f7472c = "8.0.0";
        String strT = T();
        this.f7473d = strT;
        this.f7475g = context.getApplicationContext();
        zziq zziqVarZzc = zzis.zzc();
        zziqVarZzc.zzs("8.0.0");
        if (strT != null) {
            zziqVarZzc.zzt(strT);
        }
        zziqVarZzc.zzq(this.f7475g.getPackageName());
        zziqVarZzc.zzn(jNextLong);
        zziqVarZzc.zzr(false);
        zziqVarZzc.zza(Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.f7475g.getPackageManager().getPackageInfo(this.f7475g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        this.h = new o0(this.f7475g, (zzis) zziqVarZzc.zze());
        zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f7474f = new h0(this.f7475g, null, this.h);
        this.f7490x = dVar;
        this.f7475g.getPackageName();
    }
}
