package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import b.b;
import java.util.List;
import o.h;
import o.m;
import o.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbdo {
    private n zza;
    private h zzb;
    private m zzc;
    private zzbdn zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzhgq.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final n zza() {
        h hVar = this.zzb;
        if (hVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = hVar.b(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzhgq.zza(activity)) != null) {
            zzhgr zzhgrVar = new zzhgr(this);
            this.zzc = zzhgrVar;
            zzhgrVar.setApplicationContext(activity.getApplicationContext());
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(strZza)) {
                intent.setPackage(strZza);
            }
            activity.bindService(intent, zzhgrVar, 33);
        }
    }

    public final void zzc(h hVar) {
        this.zzb = hVar;
        hVar.getClass();
        try {
            ((b) hVar.f7428a).L();
        } catch (RemoteException unused) {
        }
        zzbdn zzbdnVar = this.zzd;
        if (zzbdnVar != null) {
            zzbdnVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbdn zzbdnVar) {
        this.zzd = zzbdnVar;
    }

    public final void zzf(Activity activity) {
        m mVar = this.zzc;
        if (mVar == null) {
            return;
        }
        activity.unbindService(mVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
