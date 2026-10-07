package com.google.android.gms.internal.ads;

import android.view.ViewParent;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcqe implements zzcxg {
    private final zzcfk zza;
    private final zzdsm zzb;
    private final zzfet zzc;

    public zzcqe(zzcfk zzcfkVar, zzdsm zzdsmVar, zzfet zzfetVar) {
        this.zza = zzcfkVar;
        this.zzb = zzdsmVar;
        this.zzc = zzfetVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        zzcfk zzcfkVar;
        boolean z4;
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmB)).booleanValue() || (zzcfkVar = this.zza) == null) {
            return;
        }
        ViewParent parent = zzcfkVar.zzF().getParent();
        while (true) {
            if (parent == null) {
                z4 = false;
                break;
            } else {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    z4 = true;
                    break;
                }
                parent = parent.getParent();
            }
        }
        zzdsl zzdslVarZza = this.zzb.zza();
        zzdslVarZza.zzb("action", "hcp");
        zzdslVarZza.zzb("hcp", true != z4 ? "0" : "1");
        zzdslVarZza.zzc(this.zzc);
        zzdslVarZza.zzf();
    }
}
