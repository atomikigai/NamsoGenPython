package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcol {
    private final zzdsm zza;
    private final zzfff zzb;

    public zzcol(zzdsm zzdsmVar, zzfff zzfffVar) {
        this.zza = zzdsmVar;
        this.zzb = zzfffVar;
    }

    public final void zza(long j4, int i) {
        String str;
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzd(this.zzb.zzb.zzb);
        zzdslVarZza.zzb("action", "ad_closed");
        zzdslVarZza.zzb("show_time", String.valueOf(j4));
        zzdslVarZza.zzb("ad_format", "app_open_ad");
        int i10 = i - 1;
        if (i10 == 0) {
            str = "h";
        } else if (i10 == 1) {
            str = "bb";
        } else if (i10 == 2) {
            str = "cc";
        } else if (i10 != 3) {
            str = i10 != 4 ? "u" : "ac";
        } else {
            str = "cb";
        }
        zzdslVarZza.zzb("acr", str);
        zzdslVarZza.zzf();
    }
}
