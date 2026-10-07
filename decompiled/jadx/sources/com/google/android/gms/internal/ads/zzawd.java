package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzawd implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzawf zzb;

    public zzawd(zzawf zzawfVar, int i, boolean z4) {
        this.zza = i;
        this.zzb = zzawfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzata zzataVarZza;
        int i = this.zza;
        zzawf zzawfVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * zzbbs.zzq.zzf);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzawfVar.zza.getPackageManager().getPackageInfo(zzawfVar.zza.getPackageName(), 0);
            Context context = zzawfVar.zza;
            zzataVarZza = zzfpx.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzataVarZza = null;
        }
        this.zzb.zzm = zzataVarZza;
        if (this.zza < 4) {
            if (zzataVarZza != null && zzataVarZza.zzaj() && !zzataVarZza.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzataVarZza.zzak() && zzataVarZza.zzf().zzg() && zzataVarZza.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
