package o3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzcz;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzu;
import h6.o0;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends b {
    public final Context C;
    public volatile int D;
    public volatile zzau E;
    public volatile k9.b F;
    public volatile ScheduledExecutorService G;

    public u(wa.d dVar, Context context, androidx.emoji2.text.f fVar) {
        super(dVar, context, fVar);
        this.D = 0;
        this.C = context;
    }

    public final zzcz b0(int i) {
        if (i0()) {
            return zzu.zza(new ea.j(this, i));
        }
        zzc.zzn("BillingClientTesting", "Billing Override Service is not ready.");
        c0(28, zzie.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, x.a(-1, "Billing Override Service connection is disconnected."));
        return zzcu.zza(0);
    }

    public final void c0(int i, zzie zzieVar, e eVar) {
        int i10 = v.f7529a;
        zzhx zzhxVarB = v.b(zzieVar, i, eVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzhxVarB, "ApiFailure should not be null");
        this.h.t(zzhxVarB);
    }

    public final void d0(int i) {
        int i10 = v.f7529a;
        zzib zzibVarC = v.c(i, zzil.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzibVarC, "ApiSuccess should not be null");
        o0 o0Var = this.h;
        o0Var.getClass();
        try {
            o0Var.z(zzibVarC, (zzis) o0Var.f5061b);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void e0(int i, p0.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        zzcz zzczVarB0 = b0(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.G == null) {
                    this.G = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.G;
            } catch (Throwable th) {
                throw th;
            }
        }
        zzcz zzczVarZzb = zzcu.zzb(zzczVarB0, 28500L, timeUnit, scheduledExecutorService);
        f7.k kVar = new f7.k();
        kVar.f3638a = i;
        kVar.f3639b = aVar;
        kVar.f3640c = runnable;
        kVar.f3641d = this;
        zzcu.zzc(zzczVarZzb, kVar, A());
    }

    public final synchronized boolean i0() {
        return (this.D != 2 || this.E == null || this.F == null) ? false : true;
    }

    @Override // o3.b
    public final void t(h2.a aVar, a aVar2) {
        e0(3, new n0.d(aVar2, 3), new b3.b(this, aVar, aVar2, 10, false));
    }

    @Override // o3.b
    public final void u(final i6.e eVar, final f fVar) {
        e0(4, new p0.a() { // from class: o3.s
            @Override // p0.a
            public final void accept(Object obj) {
                String str = eVar.f5226b;
                fVar.a((e) obj, str);
            }
        }, new b3.b(this, eVar, fVar, 9, false));
    }

    @Override // o3.b
    public final void v() {
        synchronized (this) {
            d0(27);
            try {
                try {
                    if (this.F != null && this.E != null) {
                        zzc.zzm("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.C.unbindService(this.F);
                        this.F = new k9.b(this, 1);
                    }
                    this.E = null;
                    if (this.G != null) {
                        this.G.shutdownNow();
                        this.G = null;
                    }
                } catch (RuntimeException e) {
                    zzc.zzo("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
                }
                this.D = 3;
            } catch (Throwable th) {
                this.D = 3;
                throw th;
            }
        }
        super.v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o3.b
    public final e w(Activity activity, com.bumptech.glide.manager.q qVar) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) b0(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            c0(28, zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, x.f7545r);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e4) {
            if (e4 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            c0(28, zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, x.f7545r);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e4);
        }
        if (iIntValue > 0) {
            e eVarA = x.a(iIntValue, "Billing override value was set by a license tester.");
            c0(2, zzie.LICENSE_TESTER_BILLING_OVERRIDE, eVarA);
            a0(eVarA);
            return eVarA;
        }
        try {
            return super.w(activity, qVar);
        } catch (Exception e10) {
            zzie zzieVar = zzie.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            e eVar = x.h;
            c0(2, zzieVar, eVar);
            zzc.zzo("BillingClientTesting", "An internal error occurred.", e10);
            return eVar;
        }
    }

    @Override // o3.b
    public final void x(a4.b bVar, l lVar) {
        e0(7, new n0.d(lVar, 2), new b3.b(this, bVar, lVar, 8, false));
    }

    @Override // o3.b
    public final void z(c cVar) {
        synchronized (this) {
            if (i0()) {
                zzc.zzm("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                d0(26);
            } else if (this.D == 1) {
                zzc.zzn("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            } else if (this.D == 3) {
                zzc.zzn("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                c0(26, zzie.BILLING_CLIENT_CLOSED, x.a(-1, "Billing Override Service connection is disconnected."));
            } else {
                this.D = 1;
                zzc.zzm("BillingClientTesting", "Starting Billing Override Service setup.");
                this.F = new k9.b(this, 1);
                Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                Context context = this.C;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                zzie zzieVar = zzie.REASON_UNSPECIFIED;
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    zzieVar = zzie.INTENT_SERVICE_NOT_FOUND;
                } else {
                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                    if (serviceInfo != null) {
                        String str = serviceInfo.packageName;
                        String str2 = serviceInfo.name;
                        if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                            zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                            zzc.zzn("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                        } else {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            if (context.bindService(intent2, this.F, 1)) {
                                zzc.zzm("BillingClientTesting", "Billing Override Service was bonded successfully.");
                            } else {
                                zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                                zzc.zzn("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                            }
                        }
                    }
                }
                this.D = 0;
                zzc.zzm("BillingClientTesting", "Billing Override Service unavailable on device.");
                c0(26, zzieVar, x.a(2, "Billing Override Service unavailable on device."));
            }
        }
        I(cVar, 0);
    }

    public u(wa.d dVar, Context context, n nVar, androidx.emoji2.text.f fVar) {
        super(dVar, context, nVar, fVar);
        this.D = 0;
        this.C = context;
    }
}
