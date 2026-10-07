package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import da.v;
import e6.s;
import e6.t;
import g7.f;
import i6.d;
import i6.h;
import i6.k;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import p7.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbuj implements zzbul {
    public static zzbul zza;
    static zzbul zzb;
    static zzbul zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final i6.a zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    public zzbuj(Context context, i6.a aVar) {
        PackageInfo packageInfoF;
        this.zzf = new Object();
        this.zzh = new WeakHashMap();
        zzftc.zza();
        this.zzi = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zzn = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzg = context;
        this.zzj = aVar;
        String string = null;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhv)).booleanValue()) {
            zzftd zzftdVar = d.f5219b;
            if (context == null || context.getApplicationInfo() == null) {
                packageInfoF = null;
            } else {
                try {
                    packageInfoF = c.a(context).f(0, context.getApplicationInfo().packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfoF = null;
                }
            }
        } else {
            packageInfoF = null;
        }
        this.zzk = packageInfoF;
        zzbce zzbceVar = zzbcn.zzht;
        t tVar = t.f3437d;
        this.zzl = ((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() ? Locale.getDefault().getCountry() : "unknown";
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            Context context2 = this.zzg;
            zzftd zzftdVar2 = d.f5219b;
            if (context2 != null) {
                try {
                    PackageInfo packageInfoF2 = c.a(context2).f(128, "com.android.vending");
                    if (packageInfoF2 != null) {
                        string = Integer.toString(packageInfoF2.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
        } else {
            string = "unknown";
        }
        this.zzm = string;
    }

    public static zzbul zza(Context context) {
        synchronized (zze) {
            try {
                if (zza == null) {
                    if (zzl(context)) {
                        zza = new zzbuj(context, i6.a.g());
                    } else {
                        zza = new zzbuk();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    public static zzbul zzb(Context context, i6.a aVar) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z4 = false;
                    if (((Boolean) zzbef.zzc.zze()).booleanValue()) {
                        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzho)).booleanValue() || ((Boolean) zzbef.zza.zze()).booleanValue()) {
                            z4 = true;
                        }
                    }
                    if (zzl(context)) {
                        zzbuj zzbujVar = new zzbuj(context, aVar);
                        zzbujVar.zzk();
                        zzbujVar.zzj();
                        zzc = zzbujVar;
                    } else if (!z4 || context == null) {
                        zzc = new zzbuk();
                    } else {
                        zzbuj zzbujVar2 = new zzbuj(context, aVar, true);
                        zzbujVar2.zzk();
                        zzbujVar2.zzj();
                        zzc = zzbujVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzc;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x0029, B:13:0x0037, B:14:0x003e), top: B:19:0x0003 }] */
    public static zzbul zzc(Context context) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    zzbce zzbceVar = zzbcn.zzhp;
                    t tVar = t.f3437d;
                    if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                        if (((Boolean) tVar.f3440c.zza(zzbcn.zzho)).booleanValue()) {
                            zzb = new zzbuk();
                        } else {
                            zzb = new zzbuj(context, i6.a.g());
                        }
                    } else {
                        zzb = new zzbuk();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x0029, B:13:0x0033, B:14:0x003a), top: B:19:0x0003 }] */
    public static zzbul zzd(Context context, i6.a aVar) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    zzbce zzbceVar = zzbcn.zzhp;
                    t tVar = t.f3437d;
                    if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                        if (((Boolean) tVar.f3440c.zza(zzbcn.zzho)).booleanValue()) {
                            zzb = new zzbuk();
                        } else {
                            zzb = new zzbuj(context, aVar);
                        }
                    } else {
                        zzb = new zzbuk();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzb;
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzfxf.zzc(d.a(zze(th), "SHA-256"));
    }

    private final void zzj() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbuh(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzk() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbui(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean zzl(Context context) {
        if (context == null) {
            return false;
        }
        zzbce zzbceVar = zzbcn.zzmv;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            if (((Boolean) zzbew.zze.zze()).booleanValue()) {
                if (!((Boolean) tVar.f3440c.zza(zzbcn.zzho)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    zzd = Boolean.valueOf(s.f3427f.e.nextInt(100) < ((Integer) tVar.f3440c.zza(zzbcn.zzms)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) tVar.f3440c.zza(zzbcn.zzho)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void zzg(Thread thread, Throwable th) {
        if (th != null) {
            boolean zK = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zK |= d.k(stackTraceElement.getClassName());
                    zEquals |= zzbuj.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zK || zEquals) {
                return;
            }
            if (!this.zzo) {
                zzh(th, "");
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbef.zzc.zze()).booleanValue()) {
                return;
            }
            zzbbx.zzc(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbul
    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbul
    public final void zzi(Throwable th, String str, float f10) {
        Throwable th2;
        boolean zH;
        String packageName;
        PackageInfo packageInfoF;
        ActivityManager activityManager;
        ActivityManager.MemoryInfo memoryInfo;
        if (this.zzo) {
            return;
        }
        zzftd zzftdVar = d.f5219b;
        int i = 0;
        if (((Boolean) zzbew.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z4 = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcr)).booleanValue() && stackTrace != null && stackTrace.length == 0 && d.k(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (d.k(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z4 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z4) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strZze = zze(th);
            String strZzf = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zziu)).booleanValue() ? zzf(th) : "";
            double d10 = f10;
            double dRandom = Math.random();
            int i10 = f10 > 0.0f ? (int) (1.0f / f10) : 1;
            if (dRandom < d10) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zH = c.a(this.zzg).h();
                } catch (Throwable th4) {
                    h.e("Error fetching instant app info", th4);
                    zH = false;
                }
                try {
                    packageName = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    h.g("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zH)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i11 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i11));
                String str2 = Build.MANUFACTURER;
                String strU = Build.MODEL;
                if (!strU.startsWith(str2)) {
                    strU = v.u(str2, " ", strU);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", strU).appendQueryParameter("js", this.zzj.f5213a).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZze);
                t tVar = t.f3437d;
                zzbcf zzbcfVar = tVar.f3438a;
                zzbcl zzbclVar = tVar.f3440c;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("eids", TextUtils.join(",", zzbcfVar.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "685849915").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(zzbew.zzc.zze()));
                Context context = this.zzg;
                f.f4241b.getClass();
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(f.a(context))).appendQueryParameter("lite", true != this.zzj.e ? "0" : "1");
                if (!TextUtils.isEmpty(strZzf)) {
                    builderAppendQueryParameter5.appendQueryParameter("hash", strZzf);
                }
                if (((Boolean) zzbclVar.zza(zzbcn.zzhu)).booleanValue()) {
                    Context context2 = this.zzg;
                    if (context2 == null || (activityManager = (ActivityManager) context2.getSystemService("activity")) == null) {
                        memoryInfo = null;
                    } else {
                        memoryInfo = new ActivityManager.MemoryInfo();
                        try {
                            activityManager.getMemoryInfo(memoryInfo);
                        } catch (NullPointerException unused2) {
                            h.g("Error retrieving the memory information.");
                        }
                    }
                    if (memoryInfo != null) {
                        builderAppendQueryParameter5.appendQueryParameter("available_memory", Long.toString(memoryInfo.availMem));
                        builderAppendQueryParameter5.appendQueryParameter("total_memory", Long.toString(memoryInfo.totalMem));
                        builderAppendQueryParameter5.appendQueryParameter("is_low_memory", true != memoryInfo.lowMemory ? "0" : "1");
                    }
                }
                if (((Boolean) zzbclVar.zza(zzbcn.zzht)).booleanValue()) {
                    if (!TextUtils.isEmpty(this.zzl)) {
                        builderAppendQueryParameter5.appendQueryParameter("countrycode", this.zzl);
                    }
                    if (!TextUtils.isEmpty(this.zzm)) {
                        builderAppendQueryParameter5.appendQueryParameter("psv", this.zzm);
                    }
                    Context context3 = this.zzg;
                    if (i11 >= 26) {
                        packageInfoF = WebView.getCurrentWebViewPackage();
                    } else if (context3 == null) {
                        packageInfoF = null;
                    } else {
                        try {
                            packageInfoF = c.a(context3).f(128, "com.android.webview");
                        } catch (PackageManager.NameNotFoundException unused3) {
                            packageInfoF = null;
                        }
                    }
                    if (packageInfoF != null) {
                        builderAppendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(packageInfoF.versionCode));
                        builderAppendQueryParameter5.appendQueryParameter("wvvn", packageInfoF.versionName);
                        builderAppendQueryParameter5.appendQueryParameter("wvpn", packageInfoF.packageName);
                    }
                }
                PackageInfo packageInfo = this.zzk;
                if (packageInfo != null) {
                    builderAppendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter5.appendQueryParameter("appvn", this.zzk.versionName);
                }
                arrayList2.add(builderAppendQueryParameter5.toString());
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    final String str3 = (String) obj;
                    final k kVar = new k(null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbug
                        @Override // java.lang.Runnable
                        public final void run() {
                            kVar.zza(str3);
                        }
                    });
                }
            }
        }
    }

    public zzbuj(Context context, i6.a aVar, boolean z4) {
        this(context, aVar);
        this.zzo = true;
    }
}
