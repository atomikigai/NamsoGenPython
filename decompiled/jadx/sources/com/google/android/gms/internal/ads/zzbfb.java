package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbfb {
    public static final zzbdx zza = zzbdx.zzd("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbdx zzb;

    static {
        zzbdx.zzd("gads:invalidate_token_at_refresh_start", true);
        zzbdx.zzd("gms:expose_token_for_gma:enabled", true);
        zzbdx.zzd("gads:referesh_rate_limit", false);
        zzb = zzbdx.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbdx.zzd("gads:token_anonymization:enabled", true);
        zzbdx.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
