package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import l9.a;
import l9.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzn {
    private final zzl zza;
    private final Activity zzb;
    private final a zzc;
    private final g zzd;

    public /* synthetic */ zzn(zzl zzlVar, Activity activity, a aVar, g gVar, zzm zzmVar) {
        this.zza = zzlVar;
        this.zzb = activity;
        this.zzc = aVar;
        this.zzd = gVar;
    }

    public static zzcf zza(zzn zznVar) throws zzg {
        Bundle bundle;
        String string;
        List list;
        List list2;
        PackageInfo packageInfo;
        zzcf zzcfVar = new zzcf();
        zznVar.zzd.getClass();
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = zznVar.zza.zza.getPackageManager().getApplicationInfo(zznVar.zza.zza.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        zzcfVar.zza = string;
        if (zznVar.zzc.f6874a) {
            ArrayList arrayList = new ArrayList();
            zznVar.zzc.getClass();
            arrayList.add(zzca.PREVIEWING_DEBUG_MESSAGES);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        zzcfVar.zzi = list;
        zzcfVar.zze = zznVar.zza.zzb.zzc();
        zznVar.zzd.getClass();
        zzcfVar.zzd = Boolean.FALSE;
        zzcfVar.zzc = Locale.getDefault().toLanguageTag();
        zzcb zzcbVar = new zzcb();
        int i = Build.VERSION.SDK_INT;
        zzcbVar.zzb = Integer.valueOf(i);
        zzcbVar.zza = Build.MODEL;
        zzcbVar.zzc = 2;
        zzcfVar.zzb = zzcbVar;
        Configuration configuration = zznVar.zza.zza.getResources().getConfiguration();
        zznVar.zza.zza.getResources().getConfiguration();
        zzcd zzcdVar = new zzcd();
        zzcdVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzcdVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        zzcdVar.zzc = Double.valueOf(zznVar.zza.zza.getResources().getDisplayMetrics().density);
        if (i < 28) {
            list2 = Collections.EMPTY_LIST;
        } else {
            Activity activity = zznVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list2 = Collections.EMPTY_LIST;
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzcc zzccVar = new zzcc();
                        zzccVar.zzb = Integer.valueOf(rect.left);
                        zzccVar.zzc = Integer.valueOf(rect.right);
                        zzccVar.zza = Integer.valueOf(rect.top);
                        zzccVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzccVar);
                    }
                }
                list2 = arrayList2;
            }
        }
        zzcdVar.zzd = list2;
        zzcfVar.zzf = zzcdVar;
        zzl zzlVar = zznVar.zza;
        Application application = zzlVar.zza;
        try {
            packageInfo = zzlVar.zza.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzbz zzbzVar = new zzbz();
        zzbzVar.zza = application.getPackageName();
        CharSequence applicationLabel = zznVar.zza.zza.getPackageManager().getApplicationLabel(zznVar.zza.zza.getApplicationInfo());
        zzbzVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzbzVar.zzc = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        zzcfVar.zzg = zzbzVar;
        zzce zzceVar = new zzce();
        zzceVar.zza = "3.1.0";
        zzcfVar.zzh = zzceVar;
        return zzcfVar;
    }
}
