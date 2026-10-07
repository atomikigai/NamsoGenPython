package c8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.i;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import da.v;
import e0.k;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import n7.g;
import n7.h;
import p7.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f1792n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f1793o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f1794p = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f1796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f1798d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f1799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1800g;
    public zzb h;
    public final n7.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f1801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f1802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f1803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f1804m;

    public a(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f1795a = new Object();
        this.f1797c = 0;
        this.f1799f = new HashSet();
        this.f1800g = true;
        this.i = n7.b.f7302a;
        this.f1802k = new HashMap();
        this.f1803l = new AtomicInteger(0);
        i0.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f1801j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f1801j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        this.f1796b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = h.f7313a;
        synchronized (h.class) {
            Boolean bool = h.f7315c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = k.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                h.f7315c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i = g.f7312a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoD = c.a(context).d(0, packageName);
                    if (applicationInfoD == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i10 = applicationInfoD.uid;
                        workSource = new WorkSource();
                        Method method2 = h.f7314b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i10), packageName);
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            Method method3 = h.f7313a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i10));
                                } catch (Exception e4) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f1796b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                    Log.wtf("WakeLock", e10.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f1793o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f1794p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f1793o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f1793o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f1804m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j4) {
        this.f1803l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f1792n), 1L);
        if (j4 > 0) {
            jMax = Math.min(j4, jMax);
        }
        synchronized (this.f1795a) {
            try {
                if (!b()) {
                    this.h = zzb.zza(false, null);
                    this.f1796b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f1797c++;
                if (this.f1800g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f1802k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f1802k.put(null, bVar);
                }
                bVar.f1805a++;
                this.i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j10 > this.e) {
                    this.e = j10;
                    ScheduledFuture scheduledFuture = this.f1798d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f1798d = this.f1804m.schedule(new i(this, 6), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z4;
        synchronized (this.f1795a) {
            z4 = this.f1797c > 0;
        }
        return z4;
    }

    public final void c() {
        if (this.f1803l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f1801j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f1795a) {
            try {
                if (this.f1800g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f1802k.containsKey(null)) {
                    b bVar = (b) this.f1802k.get(null);
                    if (bVar != null) {
                        int i = bVar.f1805a - 1;
                        bVar.f1805a = i;
                        if (i == 0) {
                            this.f1802k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f1801j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f1799f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() > 0) {
            throw v.e(arrayList, 0);
        }
    }

    public final void e() {
        synchronized (this.f1795a) {
            try {
                if (b()) {
                    if (this.f1800g) {
                        int i = this.f1797c - 1;
                        this.f1797c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.f1797c = 0;
                    }
                    d();
                    Iterator it = this.f1802k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f1805a = 0;
                    }
                    this.f1802k.clear();
                    ScheduledFuture scheduledFuture = this.f1798d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f1798d = null;
                        this.e = 0L;
                    }
                    if (this.f1796b.isHeld()) {
                        try {
                            try {
                                this.f1796b.release();
                                if (this.h != null) {
                                    this.h = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.f1801j).concat(" failed to release!"), e);
                                if (this.h != null) {
                                    this.h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.h != null) {
                                this.h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f1801j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
