package d6;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzarj;
import com.google.android.gms.internal.ads.zzauq;
import com.google.android.gms.internal.ads.zzauu;
import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfrl;
import com.google.android.gms.internal.ads.zzgei;
import e6.s;
import e6.t;
import h6.r0;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable, zzaux {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2943d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2944f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ExecutorService f2945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zzfpp f2946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f2947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Context f2948u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i6.a f2949v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i6.a f2950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f2951x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2953z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vector f2940a = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f2941b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f2942c = new AtomicReference();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CountDownLatch f2952y = new CountDownLatch(1);

    public h(Context context, i6.a aVar) {
        this.f2947t = context;
        this.f2948u = context;
        this.f2949v = aVar;
        this.f2950w = aVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f2945r = executorServiceNewCachedThreadPool;
        zzbce zzbceVar = zzbcn.zzcx;
        t tVar = t.f3437d;
        boolean zBooleanValue = ((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue();
        this.f2951x = zBooleanValue;
        this.f2946s = zzfpp.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        zzbce zzbceVar2 = zzbcn.zzcu;
        zzbcl zzbclVar = tVar.f3440c;
        this.e = ((Boolean) zzbclVar.zza(zzbceVar2)).booleanValue();
        this.f2944f = ((Boolean) zzbclVar.zza(zzbcn.zzcy)).booleanValue();
        if (((Boolean) zzbclVar.zza(zzbcn.zzcw)).booleanValue()) {
            this.f2953z = 2;
        } else {
            this.f2953z = 1;
        }
        if (!((Boolean) zzbclVar.zza(zzbcn.zzdz)).booleanValue()) {
            this.f2943d = b();
        }
        if (((Boolean) zzbclVar.zza(zzbcn.zzdt)).booleanValue()) {
            zzcaj.zza.execute(this);
            return;
        }
        i6.d dVar = s.f3427f.f3428a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzcaj.zza.execute(this);
        } else {
            run();
        }
    }

    public final String a(Context context) {
        zzaux zzauxVarD;
        if (!c() || (zzauxVarD = d()) == null) {
            return "";
        }
        e();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return zzauxVarD.zzf(context);
    }

    public final boolean b() {
        Context context = this.f2947t;
        e7.i iVar = new e7.i(this, 13);
        return new zzfrl(context, zzfqr.zzb(context, this.f2946s), iVar, ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcv)).booleanValue()).zzd(1);
    }

    public final boolean c() {
        try {
            this.f2952y.await();
            return true;
        } catch (InterruptedException e) {
            i6.h.h("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final zzaux d() {
        return ((!this.e || this.f2943d) ? this.f2953z : 1) == 2 ? (zzaux) this.f2942c.get() : (zzaux) this.f2941b.get();
    }

    public final void e() {
        zzaux zzauxVarD = d();
        Vector<Object[]> vector = this.f2940a;
        if (vector.isEmpty() || zzauxVarD == null) {
            return;
        }
        for (Object[] objArr : vector) {
            int length = objArr.length;
            if (length == 1) {
                zzauxVarD.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzauxVarD.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        vector.clear();
    }

    public final void f(boolean z4) {
        String str = this.f2949v.f5213a;
        Context context = this.f2947t;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        zzarh zzarhVarZza = zzarj.zza();
        zzarhVarZza.zza(z4);
        zzarhVarZza.zzb(str);
        this.f2941b.set(zzavb.zzu(context, new zzauz((zzarj) zzarhVarZza.zzbr())));
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch = this.f2952y;
        try {
            zzbce zzbceVar = zzbcn.zzdz;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                this.f2943d = b();
            }
            boolean z4 = this.f2949v.f5216d;
            boolean z10 = false;
            if (!((Boolean) tVar.f3440c.zza(zzbcn.zzbd)).booleanValue() && z4) {
                z10 = true;
            }
            if (((!this.e || this.f2943d) ? this.f2953z : 1) == 1) {
                f(z10);
                if (this.f2953z == 2) {
                    this.f2945r.execute(new com.bumptech.glide.manager.p(this, z10, 1));
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    Context context = this.f2947t;
                    i6.a aVar = this.f2949v;
                    boolean z11 = this.f2951x;
                    zzarh zzarhVarZza = zzarj.zza();
                    zzarhVarZza.zza(z10);
                    zzarhVarZza.zzb(aVar.f5213a);
                    zzarj zzarjVar = (zzarj) zzarhVarZza.zzbr();
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    zzauu zzauuVarZza = zzauu.zza(context, zzarjVar, z11);
                    this.f2942c.set(zzauuVarZza);
                    if (this.f2944f && !zzauuVarZza.zzr()) {
                        this.f2953z = 1;
                        f(z10);
                    }
                } catch (NullPointerException e) {
                    this.f2953z = 1;
                    f(z10);
                    this.f2946s.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            countDownLatch.countDown();
            this.f2947t = null;
            this.f2949v = null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            this.f2947t = null;
            this.f2949v = null;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zze(Context context, String str, View view, Activity activity) {
        if (!c()) {
            return "";
        }
        zzaux zzauxVarD = d();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzko)).booleanValue()) {
            r0 r0Var = p.C.f2979c;
            r0.h(view, 4);
        }
        if (zzauxVarD == null) {
            return "";
        }
        e();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return zzauxVarD.zze(context, str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzf(Context context) {
        return a(context);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzg(Context context) {
        try {
            return (String) zzgei.zzj(new g(0, this, context), this.f2945r).get(((Integer) t.f3437d.f3440c.zza(zzbcn.zzcO)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzauq.zza(context, this.f2950w.f5213a, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzh(Context context, View view, Activity activity) {
        zzbce zzbceVar = zzbcn.zzkn;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (!((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
            zzaux zzauxVarD = d();
            if (((Boolean) zzbclVar2.zza(zzbcn.zzko)).booleanValue()) {
                r0 r0Var = p.C.f2979c;
                r0.h(view, 2);
            }
            return zzauxVarD != null ? zzauxVarD.zzh(context, view, activity) : "";
        }
        if (!c()) {
            return "";
        }
        zzaux zzauxVarD2 = d();
        if (((Boolean) zzbclVar2.zza(zzbcn.zzko)).booleanValue()) {
            r0 r0Var2 = p.C.f2979c;
            r0.h(view, 2);
        }
        return zzauxVarD2 != null ? zzauxVarD2.zzh(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzk(MotionEvent motionEvent) {
        zzaux zzauxVarD = d();
        if (zzauxVarD == null) {
            this.f2940a.add(new Object[]{motionEvent});
        } else {
            e();
            zzauxVarD.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzl(int i, int i10, int i11) {
        zzaux zzauxVarD = d();
        if (zzauxVarD != null) {
            e();
            zzauxVarD.zzl(i, i10, i11);
        } else {
            this.f2940a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11)});
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaux zzauxVarD;
        zzaux zzauxVarD2;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcT)).booleanValue()) {
            if (this.f2952y.getCount() != 0 || (zzauxVarD2 = d()) == null) {
                return;
            }
            zzauxVarD2.zzn(stackTraceElementArr);
            return;
        }
        if (!c() || (zzauxVarD = d()) == null) {
            return;
        }
        zzauxVarD.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzo(View view) {
        zzaux zzauxVarD = d();
        if (zzauxVarD != null) {
            zzauxVarD.zzo(view);
        }
    }
}
