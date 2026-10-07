package com.google.android.gms.internal.ads;

import android.os.Bundle;
import i6.h;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdmf implements zzgee {
    final /* synthetic */ zzcao zza;

    public zzdmf(zzdmg zzdmgVar, zzcao zzcaoVar) {
        this.zza = zzcaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        h.d("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfk zzcfkVar = (zzcfk) obj;
        if (zzcfkVar == null) {
            this.zza.zzd(new zzeiz(1, "Missing webview from video view future."));
        } else {
            zzcfkVar.zzag("/video", new zzcdd(new Consumer() { // from class: com.google.android.gms.internal.ads.zzdme
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("mediaUrl", (String) obj2);
                    this.zza.zza.zzc(bundle);
                }
            }));
            zzcfkVar.zzaa();
        }
    }
}
