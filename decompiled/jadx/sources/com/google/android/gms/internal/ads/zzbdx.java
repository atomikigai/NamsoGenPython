package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzbdx {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbdx(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbdx zza(String str, double d10) {
        return new zzbdx(str, Double.valueOf(d10), 3);
    }

    public static zzbdx zzb(String str, long j4) {
        return new zzbdx(str, Long.valueOf(j4), 2);
    }

    public static zzbdx zzc(String str, String str2) {
        return new zzbdx("gad:dynamite_module:experiment_id", "", 4);
    }

    public static zzbdx zzd(String str, boolean z4) {
        return new zzbdx(str, Boolean.valueOf(z4), 1);
    }

    public final Object zze() {
        zzbfc zzbfcVarZza = zzbfe.zza();
        if (zzbfcVarZza == null) {
            if (zzbfe.zzb() != null) {
                zzbfe.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i == 0) {
            return zzbfcVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i != 1) {
            return i != 2 ? zzbfcVarZza.zzd(this.zza, (String) this.zzb) : zzbfcVarZza.zzb(this.zza, ((Double) this.zzb).doubleValue());
        }
        return zzbfcVarZza.zzc(this.zza, ((Long) this.zzb).longValue());
    }
}
