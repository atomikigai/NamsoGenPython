package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import e6.t;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzewi implements zzevy {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final String zzi;
    public final String zzj;
    public final String zzk;
    public final boolean zzl;
    public final String zzm;
    public final long zzn;
    public final boolean zzo;
    public final String zzp;
    public final int zzq;

    public zzewi(boolean z4, boolean z10, String str, boolean z11, boolean z12, boolean z13, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z14, String str6, long j4, boolean z15, String str7, int i) {
        this.zza = z4;
        this.zzb = z10;
        this.zzc = str;
        this.zzd = z11;
        this.zze = z12;
        this.zzf = z13;
        this.zzg = str2;
        this.zzh = arrayList;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = str5;
        this.zzl = z14;
        this.zzm = str6;
        this.zzn = j4;
        this.zzo = z15;
        this.zzp = str7;
        this.zzq = i;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        bundle.putInt("build_api_level", this.zzq);
        zzbce zzbceVar = zzbcn.zzkI;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString("hl", this.zzg);
        if (!this.zzh.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzh);
        }
        bundle.putString("mv", this.zzi);
        bundle.putString("submodel", this.zzm);
        Bundle bundleZza = zzfgc.zza(bundle, "device");
        bundle.putBundle("device", bundleZza);
        bundleZza.putString("build", this.zzk);
        bundleZza.putLong("remaining_data_partition_space", this.zzn);
        Bundle bundleZza2 = zzfgc.zza(bundleZza, "browser");
        bundleZza.putBundle("browser", bundleZza2);
        bundleZza2.putBoolean("is_browser_custom_tabs_capable", this.zzl);
        if (!TextUtils.isEmpty(this.zzj)) {
            Bundle bundleZza3 = zzfgc.zza(bundleZza, "play_store");
            bundleZza.putBundle("play_store", bundleZza3);
            bundleZza3.putString("package_version", this.zzj);
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzkY)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzo);
        }
        if (!TextUtils.isEmpty(this.zzp)) {
            bundle.putString("v_unity", this.zzp);
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzkS)).booleanValue()) {
            zzfgc.zzg(bundle, "gotmt_l", true, ((Boolean) tVar.f3440c.zza(zzbcn.zzkP)).booleanValue());
            zzfgc.zzg(bundle, "gotmt_i", true, ((Boolean) tVar.f3440c.zza(zzbcn.zzkO)).booleanValue());
        }
    }
}
