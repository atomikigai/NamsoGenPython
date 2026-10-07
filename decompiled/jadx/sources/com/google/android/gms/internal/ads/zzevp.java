package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzevp implements zzevy {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;

    public zzevp(boolean z4, boolean z10, String str, boolean z11, int i, int i10, int i11, String str2) {
        this.zza = z4;
        this.zzb = z10;
        this.zzc = str;
        this.zzd = z11;
        this.zze = i;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        zzbce zzbceVar = zzbcn.zzdO;
        t tVar = t.f3437d;
        bundle.putString("extra_caps", (String) tVar.f3440c.zza(zzbceVar));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzfP)).booleanValue() && !TextUtils.isEmpty(this.zzh)) {
            bundle.putString("ev", this.zzh);
        }
        Bundle bundleZza = zzfgc.zza(bundle, "sdk_env");
        bundleZza.putBoolean("mf", ((Boolean) zzben.zzc.zze()).booleanValue());
        bundleZza.putBoolean("instant_app", this.zza);
        bundleZza.putBoolean("lite", this.zzb);
        bundleZza.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", bundleZza);
        Bundle bundleZza2 = zzfgc.zza(bundleZza, "build_meta");
        bundleZza2.putString("cl", "685849915");
        bundleZza2.putString("rapid_rc", "dev");
        bundleZza2.putString("rapid_rollup", "HEAD");
        bundleZza.putBundle("build_meta", bundleZza2);
    }
}
