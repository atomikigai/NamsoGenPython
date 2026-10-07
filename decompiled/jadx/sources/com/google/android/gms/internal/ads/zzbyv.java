package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e6.i3;
import e6.o3;
import e6.s;
import e6.t;
import h6.k0;
import i6.d;
import i6.h;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import r7.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbyv {
    private final Object zzi;
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    private String zzd = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zze = new AtomicInteger(-1);
    private final AtomicReference zzf = new AtomicReference(null);
    private final AtomicReference zzg = new AtomicReference(null);
    private final ConcurrentMap zzh = new ConcurrentHashMap(9);

    public zzbyv() {
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
        this.zzi = new Object();
    }

    public static final Bundle zzq(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean zzr(Context context) {
        zzbce zzbceVar = zzbcn.zzas;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            return false;
        }
        if (f.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) tVar.f3440c.zza(zzbcn.zzat)).intValue()) {
            return false;
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzau)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object zzs(String str, Context context) {
        if (!zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return null;
        }
        try {
            return zzt(context, str).invoke(this.zzf.get(), null);
        } catch (Exception unused) {
            zzw(str, true);
            return null;
        }
    }

    private final Method zzt(Context context, String str) {
        Method method = (Method) this.zzh.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.zzh.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzw(str, false);
            return null;
        }
    }

    private final void zzu(Context context, String str, String str2) {
        if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            Method declaredMethod = (Method) this.zzh.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.zzh.put(str2, declaredMethod);
                } catch (Exception unused) {
                    zzw(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzf.get(), str);
                k0.k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                zzw(str2, false);
            }
        }
    }

    private final void zzv(Context context, String str, String str2, Bundle bundle) {
        if (zzp(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                h.e("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                Method declaredMethod = (Method) this.zzh.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.zzh.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        zzw("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.zzf.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzw("logEventInternal", true);
                }
            }
        }
    }

    private final void zzw(String str, boolean z4) {
        if (this.zza.get()) {
            return;
        }
        h.g("Invoke Firebase method " + str + " error.");
        if (z4) {
            h.g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.zza.set(true);
        }
    }

    private final boolean zzx(Context context, String str, AtomicReference atomicReference, boolean z4) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            zzbys.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            return true;
        } catch (Exception unused) {
            zzw("getInstance", z4);
            return false;
        }
    }

    public final String zza(Context context) {
        Object objZzs;
        if (zzp(context) && (objZzs = zzs("generateEventId", context)) != null) {
            return objZzs.toString();
        }
        return null;
    }

    public final String zzb(final Context context) {
        if (!zzp(context)) {
            return null;
        }
        zzbce zzbceVar = zzbcn.zzaq;
        t tVar = t.f3437d;
        long jLongValue = ((Long) tVar.f3440c.zza(zzbceVar)).longValue();
        if (jLongValue < 0) {
            return (String) zzs("getAppInstanceId", context);
        }
        if (this.zzb.get() == null) {
            zzbce zzbceVar2 = zzbcn.zzar;
            zzbys.zza(this.zzb, null, new ThreadPoolExecutor(((Integer) tVar.f3440c.zza(zzbceVar2)).intValue(), ((Integer) tVar.f3440c.zza(zzbceVar2)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbyu(this)));
        }
        try {
            return (String) ((ExecutorService) this.zzb.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbyt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zze(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String zzc(Context context) {
        if (zzp(context) && zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            try {
                String str = (String) zzt(context, "getCurrentScreenName").invoke(this.zzf.get(), null);
                if (str == null) {
                    str = (String) zzt(context, "getCurrentScreenClass").invoke(this.zzf.get(), null);
                }
                return str == null ? "" : str;
            } catch (Exception unused) {
                zzw("getCurrentScreenName", false);
            }
        }
        return "";
    }

    public final String zzd(Context context) {
        if (!zzp(context)) {
            return null;
        }
        synchronized (this.zzc) {
            try {
                String str = this.zzd;
                if (str != null) {
                    return str;
                }
                String str2 = (String) zzs("getGmpAppId", context);
                this.zzd = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ String zze(Context context) throws Exception {
        return (String) zzs("getAppInstanceId", context);
    }

    public final void zzf(Context context, String str) {
        if (zzp(context)) {
            zzu(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzg(Context context, String str) {
        if (zzp(context)) {
            zzu(context, str, "endAdUnitExposure");
        }
    }

    public final void zzh(Context context, String str) {
        zzv(context, "_aa", str, null);
    }

    public final void zzi(Context context, String str) {
        zzv(context, "_aq", str, null);
    }

    public final void zzj(Context context, String str, Map map) {
        zzv(context, "_ac", str, zzq(map));
    }

    public final void zzk(Context context, String str, Map map) {
        zzv(context, "_ai", str, zzq(map));
    }

    public final void zzl(Context context, String str, String str2, String str3, int i) {
        if (zzp(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zzv(context, "_ar", str, bundle);
            k0.k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final void zzm(Context context, o3 o3Var) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzax)).booleanValue() && zzp(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzn(Context context, i3 i3Var) {
        zzbyw.zzd(context).zzb().zzc(i3Var);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzax)).booleanValue() && zzp(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    @Deprecated
    public final void zzo(Context context, String str) {
        if (zzp(context) && (context instanceof Activity) && zzx(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            Method declaredMethod = (Method) this.zzh.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.zzh.put("setCurrentScreen", declaredMethod);
                } catch (Exception unused) {
                    zzw("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzg.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                zzw("setCurrentScreen", false);
            }
        }
    }

    public final boolean zzp(Context context) {
        int iD;
        zzbce zzbceVar = zzbcn.zzak;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && !this.zza.get()) {
            if (!((Boolean) tVar.f3440c.zza(zzbcn.zzav)).booleanValue()) {
                if (this.zze.get() == -1) {
                    d dVar = s.f3427f.f3428a;
                    g7.f fVar = g7.f.f4241b;
                    if (fVar.d(context, 12451000) != 0 && ((iD = fVar.d(context, 12451000)) == 0 || iD == 2)) {
                        h.g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zze.set(0);
                    } else {
                        this.zze.set(1);
                    }
                }
                if (this.zze.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }
}
