package f7;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcs;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.tasks.Task;
import da.x;
import h6.k0;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import o3.u;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements zzcs {
    public static k e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3641d;

    public k(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f3638a = i;
        this.f3641d = str;
        this.f3639b = arrayList;
        this.f3640c = arrayList2;
    }

    public static synchronized k b(Context context) {
        try {
            if (e == null) {
                zze.zza();
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new x("MessengerIpcClient", 3)));
                k kVar = new k();
                kVar.f3641d = new h(kVar);
                kVar.f3638a = 1;
                kVar.f3640c = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                kVar.f3639b = context.getApplicationContext();
                e = kVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f3641d) {
            try {
                if (this.f3638a != 0) {
                    i0.j((HandlerThread) this.f3639b, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f3639b) == null) {
                    k0.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f3639b = handlerThread;
                    handlerThread.start();
                    this.f3640c = new zzftd(((HandlerThread) this.f3639b).getLooper());
                    k0.k("Looper thread started.");
                } else {
                    k0.k("Resuming the looper thread");
                    this.f3641d.notifyAll();
                }
                this.f3638a++;
                looper = ((HandlerThread) this.f3639b).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public synchronized Task c(i iVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(iVar);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 9);
                sb2.append("Queueing ");
                sb2.append(strValueOf);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            if (!((h) this.f3641d).d(iVar)) {
                h hVar = new h(this);
                this.f3641d = hVar;
                hVar.d(iVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return iVar.f3635b.getTask();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public void zza(Throwable th) {
        u uVar = (u) this.f3641d;
        if (th instanceof TimeoutException) {
            uVar.c0(28, zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, o3.x.f7545r);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            uVar.c0(28, zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, o3.x.f7545r);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.f3640c).run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        u uVar = (u) this.f3641d;
        if (iIntValue <= 0) {
            ((Runnable) this.f3640c).run();
            return;
        }
        int i = this.f3638a;
        int iIntValue2 = num.intValue();
        uVar.getClass();
        o3.e eVarA = o3.x.a(iIntValue2, "Billing override value was set by a license tester.");
        uVar.c0(i, zzie.LICENSE_TESTER_BILLING_OVERRIDE, eVarA);
        ((p0.a) this.f3639b).accept(eVarA);
    }

    public k(zzcfk zzcfkVar) throws g6.f {
        this.f3640c = zzcfkVar.getLayoutParams();
        ViewParent parent = zzcfkVar.getParent();
        this.f3639b = zzcfkVar.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new g6.f("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f3641d = viewGroup;
        this.f3638a = viewGroup.indexOfChild(zzcfkVar.zzF());
        viewGroup.removeView(zzcfkVar.zzF());
        zzcfkVar.zzaq(true);
    }
}
