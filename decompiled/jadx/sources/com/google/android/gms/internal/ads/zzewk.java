package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import d6.p;
import e6.s;
import e6.t;
import h6.r0;
import i6.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import n7.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzewk implements zzevz {
    private final zzges zza;
    private final Context zzb;

    public zzewk(zzges zzgesVar, Context context) {
        this.zza = zzgesVar;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:41:0x014b  */
    /* JADX WARN: Code duplicated, block: B:56:0x018d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0190  */
    /* JADX WARN: Code duplicated, block: B:59:0x0192  */
    /* JADX WARN: Code duplicated, block: B:8:0x0063  */
    public final zzewi zzc() throws Exception {
        ActivityInfo activityInfo;
        String str;
        String str2;
        String str3;
        boolean z4;
        String string;
        String str4;
        boolean z10;
        PackageManager packageManager = this.zzb.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo resolveInfoZzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo resolveInfoZzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        r0 r0Var = p.C.f2979c;
        d dVar = s.f3427f.f3428a;
        boolean zM = d.m();
        Context context = this.zzb;
        boolean zK = c.k(context);
        boolean zP = c.p(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(localeList.get(i).getLanguage());
        }
        Context context2 = this.zzb;
        ResolveInfo resolveInfoZzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoZzd3 == null || (activityInfo = resolveInfoZzd3.activityInfo) == null) {
            str = null;
        } else {
            try {
                PackageInfo packageInfoF = p7.c.a(context2).f(0, activityInfo.packageName);
                if (packageInfoF != null) {
                    str = packageInfoF.versionCode + "." + activityInfo.packageName;
                } else {
                    str = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        try {
            PackageInfo packageInfoF2 = p7.c.a(this.zzb).f(128, "com.android.vending");
            str2 = packageInfoF2 != null ? packageInfoF2.versionCode + "." + packageInfoF2.packageName : null;
        } catch (Exception unused2) {
        }
        Context context3 = this.zzb;
        boolean zEquals = false;
        String str5 = Build.FINGERPRINT;
        if (packageManager != null) {
            str3 = str2;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities == null || resolveInfoResolveActivity == null) {
                zEquals = false;
                break;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= listQueryIntentActivities.size()) {
                    zEquals = false;
                    break;
                }
                List<ResolveInfo> list = listQueryIntentActivities;
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                    zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(zzhgq.zza(context3));
                    break;
                }
                i10++;
                listQueryIntentActivities = list;
            }
        } else {
            str3 = str2;
        }
        p pVar = p.C;
        r0 r0Var2 = pVar.f2979c;
        long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        zzbce zzbceVar = zzbcn.zzkY;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            r0 r0Var3 = pVar.f2979c;
            if (r0.b(this.zzb)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzlc)).booleanValue()) {
            Context context4 = this.zzb;
            try {
                Bundle bundle = p7.c.a(context4).d(128, context4.getPackageName()).metaData;
                if (bundle == null || !bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                    str4 = null;
                } else {
                    string = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                }
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            boolean z11 = resolveInfoZzd2 != null;
            if (resolveInfoZzd != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new zzewi(z10, z11, country, zM, zK, zP, language, arrayList, str, str3, str5, zEquals, Build.MODEL, availableBytes, z4, str4, Build.VERSION.SDK_INT);
        }
        string = "";
        str4 = string;
        if (resolveInfoZzd2 != null) {
        }
        if (resolveInfoZzd != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new zzewi(z10, z11, country, zM, zK, zP, language, arrayList, str, str3, str5, zEquals, Build.MODEL, availableBytes, z4, str4, Build.VERSION.SDK_INT);
    }
}
