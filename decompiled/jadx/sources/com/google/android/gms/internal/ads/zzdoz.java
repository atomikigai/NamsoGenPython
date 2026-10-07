package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdoz implements zzhfx {
    private final zzhgp zza;

    public zzdoz(zzhgp zzhgpVar) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbs.zza.EnumC0000zza enumC0000zza = ((zzcwd) this.zza).zza().zzo.zza == 3 ? zzbbs.zza.EnumC0000zza.REWARDED_INTERSTITIAL : zzbbs.zza.EnumC0000zza.REWARD_BASED_VIDEO_AD;
        zzhgf.zzb(enumC0000zza);
        return enumC0000zza;
    }
}
