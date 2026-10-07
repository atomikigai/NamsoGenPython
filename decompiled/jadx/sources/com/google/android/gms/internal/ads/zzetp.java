package com.google.android.gms.internal.ads;

import android.os.Bundle;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzetp implements zzevy {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzetp(String str, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = z12;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.zza.isEmpty()) {
            bundle.putString("inspector_extras", this.zza);
        }
        bundle.putInt("test_mode", this.zzb ? 1 : 0);
        bundle.putInt("linked_device", this.zzc ? 1 : 0);
        if (this.zzb || this.zzc) {
            zzbce zzbceVar = zzbcn.zziP;
            t tVar = t.f3437d;
            if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
            if (((Boolean) tVar.f3440c.zza(zzbcn.zziT)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}
