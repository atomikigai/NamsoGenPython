package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import i6.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdkc implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdoc zzd;
    private final n7.a zze;
    private zzbhs zzf;
    private zzbjr zzg;

    public zzdkc(zzdoc zzdocVar, n7.a aVar) {
        this.zzd = zzdocVar;
        this.zze = aVar;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            ((b) this.zze).getClass();
            map.put("time_interval", String.valueOf(System.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzj("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final zzbhs zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(final zzbhs zzbhsVar) {
        this.zzf = zzbhsVar;
        zzbjr zzbjrVar = this.zzg;
        if (zzbjrVar != null) {
            this.zzd.zzn("/unconfirmedClick", zzbjrVar);
        }
        zzbjr zzbjrVar2 = new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkb
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                zzdkc zzdkcVar = this.zza;
                try {
                    zzdkcVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    h.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbhs zzbhsVar2 = zzbhsVar;
                zzdkcVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbhsVar2 == null) {
                    h.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbhsVar2.zzf(str);
                } catch (RemoteException e) {
                    h.i("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzbjrVar2;
        this.zzd.zzl("/unconfirmedClick", zzbjrVar2);
    }
}
