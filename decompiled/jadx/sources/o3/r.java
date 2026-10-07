package o3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzal;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzij;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjm;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import h6.o0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f7522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbi f7523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbi f7524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7525d;
    public final /* synthetic */ b e;

    public /* synthetic */ r(b bVar, c cVar, int i) {
        this.e = bVar;
        zzbl zzblVar = bVar.B;
        this.f7523b = zzbi.zzc(zzblVar);
        this.f7524c = zzbi.zzc(zzblVar);
        this.f7522a = cVar;
        this.f7525d = i;
    }

    public final Long a(boolean z4) {
        if (z4) {
            zzbi zzbiVar = this.f7523b;
            if (!zzbiVar.zzg()) {
                return null;
            }
            zzbiVar.zzf();
            return Long.valueOf(zzbiVar.zza(TimeUnit.MILLISECONDS));
        }
        zzbi zzbiVar2 = this.f7524c;
        if (!zzbiVar2.zzg()) {
            return null;
        }
        zzbiVar2.zzf();
        return Long.valueOf(zzbiVar2.zza(TimeUnit.MILLISECONDS));
    }

    public final void b(e eVar, zzie zzieVar, String str, boolean z4) {
        try {
            zzic zzicVarZzc = zzig.zzc();
            zzicVarZzc.zzo(eVar.f7495a);
            zzicVarZzc.zzl(eVar.f7497c);
            zzicVarZzc.zzn(zzieVar);
            if (str != null) {
                zzicVarZzc.zza(str);
            }
            Long lA = a(z4);
            b bVar = this.e;
            if (!z4) {
                zzjm zzjmVarZzc = zzjo.zzc();
                zzjmVarZzc.zza(zzicVarZzc);
                if (lA != null) {
                    zzjmVarZzc.zzl(lA.longValue());
                }
                bVar.h.x((zzjo) zzjmVarZzc.zze());
                return;
            }
            zzjt zzjtVarZzc = zzjv.zzc();
            int i = this.f7525d;
            zzjtVarZzc.zza(i > 0);
            zzjtVarZzc.zzl(i);
            if (lA != null) {
                zzjtVarZzc.zzm(lA.longValue());
            }
            zzhv zzhvVarZzc = zzhx.zzc();
            zzhvVarZzc.zzl(zzicVarZzc);
            zzhvVarZzc.zzp(6);
            zzhvVarZzc.zzo(zzjtVarZzc);
            bVar.E((zzhx) zzhvVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(e eVar) {
        b bVar = this.e;
        synchronized (bVar.f7470a) {
            try {
                if (bVar.f7471b == 3) {
                    return;
                }
                try {
                    this.f7522a.q(eVar);
                } catch (Throwable th) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z4;
        boolean z10;
        zzc.zzn("BillingClient", "Billing service died.");
        try {
            b bVar = this.e;
            synchronized (bVar.f7470a) {
                z4 = true;
                z10 = bVar.f7471b == 1;
            }
            if (z10) {
                o0 o0Var = bVar.h;
                zzhv zzhvVarZzc = zzhx.zzc();
                zzhvVarZzc.zzp(6);
                zzic zzicVarZzc = zzig.zzc();
                zzicVarZzc.zzn(zzie.BINDING_DIED);
                zzhvVarZzc.zzl(zzicVarZzc);
                zzjt zzjtVarZzc = zzjv.zzc();
                int i = this.f7525d;
                if (i <= 0) {
                    z4 = false;
                }
                zzjtVarZzc.zza(z4);
                zzjtVarZzc.zzl(i);
                zzhvVarZzc.zzo(zzjtVarZzc);
                o0Var.t((zzhx) zzhvVarZzc.zze());
            } else {
                o0 o0Var2 = bVar.h;
                zzij zzijVarZzd = zzij.zzd();
                o0Var2.getClass();
                try {
                    zzjg zzjgVarZzc = zzji.zzc();
                    zzjgVarZzc.zzn((zzis) o0Var2.f5061b);
                    zzjgVarZzc.zzm(zzijVarZzd);
                    ((ea.e) o0Var2.f5062c).e((zzji) zzjgVarZzc.zze());
                } catch (Throwable th) {
                    zzc.zzo("BillingLogger", "Unable to log.", th);
                }
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
        b bVar2 = this.e;
        synchronized (bVar2.f7470a) {
            if (bVar2.f7471b != 3 && bVar2.f7471b != 0) {
                bVar2.H(0);
                bVar2.J();
                try {
                    this.f7522a.r();
                } catch (Throwable th3) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzc.zzm("BillingClient", "Billing service connected.");
        b bVar = this.e;
        synchronized (bVar.f7470a) {
            try {
                if (bVar.f7471b == 3) {
                    return;
                }
                bVar.i = zzal.zzs(iBinder);
                if (b.B(new d6.m(this, 3), 30000L, new androidx.activity.i(this, 27), bVar.N(), bVar.A()) == null) {
                    int i = this.f7525d;
                    e eVarQ = bVar.Q();
                    bVar.G(i, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, eVarQ);
                    c(eVarQ);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z4;
        boolean z10;
        zzc.zzn("BillingClient", "Billing service disconnected.");
        try {
            b bVar = this.e;
            synchronized (bVar.f7470a) {
                z4 = true;
                z10 = bVar.f7471b == 1;
            }
            if (z10) {
                o0 o0Var = bVar.h;
                zzhv zzhvVarZzc = zzhx.zzc();
                zzhvVarZzc.zzp(6);
                zzic zzicVarZzc = zzig.zzc();
                zzicVarZzc.zzn(zzie.SERVICE_DISCONNECTED);
                zzhvVarZzc.zzl(zzicVarZzc);
                zzjt zzjtVarZzc = zzjv.zzc();
                int i = this.f7525d;
                if (i <= 0) {
                    z4 = false;
                }
                zzjtVarZzc.zza(z4);
                zzjtVarZzc.zzl(i);
                zzhvVarZzc.zzo(zzjtVarZzc);
                o0Var.t((zzhx) zzhvVarZzc.zze());
            } else {
                o0 o0Var2 = bVar.h;
                zzjs zzjsVarZzd = zzjs.zzd();
                o0Var2.getClass();
                if (zzjsVarZzd != null) {
                    try {
                        zzjg zzjgVarZzc = zzji.zzc();
                        zzjgVarZzc.zzn((zzis) o0Var2.f5061b);
                        zzjgVarZzc.zzp(zzjsVarZzd);
                        ((ea.e) o0Var2.f5062c).e((zzji) zzjgVarZzc.zze());
                    } catch (Throwable th) {
                        zzc.zzo("BillingLogger", "Unable to log.", th);
                    }
                }
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
        zzbi zzbiVar = this.f7524c;
        zzbiVar.zzd();
        zzbiVar.zze();
        b bVar2 = this.e;
        synchronized (bVar2.f7470a) {
            try {
                if (bVar2.f7471b == 3) {
                    return;
                }
                bVar2.H(0);
                try {
                    this.f7522a.r();
                } catch (Throwable th3) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
