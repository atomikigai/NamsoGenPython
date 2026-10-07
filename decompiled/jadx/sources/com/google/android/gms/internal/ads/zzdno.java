package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import i6.h;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdno implements zzbjr {
    private final zzbhc zza;
    private final zzdoc zzb;
    private final zzhfr zzc;

    public zzdno(zzdjj zzdjjVar, zzdiy zzdiyVar, zzdoc zzdocVar, zzhfr zzhfrVar) {
        this.zza = zzdjjVar.zzc(zzdiyVar.zzA());
        this.zzb = zzdocVar;
        this.zzc = zzhfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbgs) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            h.h("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}
