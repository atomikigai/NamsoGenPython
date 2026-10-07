package o6;

import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzhfx;
import com.google.android.gms.internal.ads.zzhgf;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements zzhfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f7648a;

    public l(k kVar) {
        this.f7648a = kVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        zzbbs.zza.EnumC0000zza enumC0000zza;
        switch (this.f7648a.f7647a) {
            case "NATIVE":
                enumC0000zza = zzbbs.zza.EnumC0000zza.AD_LOADER;
                break;
            case "INTERSTITIAL":
                enumC0000zza = zzbbs.zza.EnumC0000zza.INTERSTITIAL;
                break;
            case "REWARDED":
                enumC0000zza = zzbbs.zza.EnumC0000zza.REWARD_BASED_VIDEO_AD;
                break;
            case "BANNER":
                enumC0000zza = zzbbs.zza.EnumC0000zza.BANNER;
                break;
            default:
                enumC0000zza = zzbbs.zza.EnumC0000zza.AD_INITIATER_UNSPECIFIED;
                break;
        }
        zzhgf.zzb(enumC0000zza);
        return enumC0000zza;
    }
}
