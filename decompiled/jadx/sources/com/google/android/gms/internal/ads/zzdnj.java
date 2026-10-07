package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdnj implements zzbfm {
    final /* synthetic */ String zza = "_videoMediaView";
    final /* synthetic */ zzdnk zzb;

    public zzdnj(zzdnk zzdnkVar, String str) {
        this.zzb = zzdnkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final void zzc() {
        zzdnk zzdnkVar = this.zzb;
        if (zzdnkVar.zzd != null) {
            zzdnkVar.zzd.zzF(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfm
    public final void zzd(MotionEvent motionEvent) {
    }
}
