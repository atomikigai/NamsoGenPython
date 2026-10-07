package com.google.android.gms.internal.ads;

import e6.t;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdxu implements zzgee {
    final /* synthetic */ zzdxv zza;

    public zzdxu(zzdxv zzdxvVar) {
        this.zza = zzdxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgc)).booleanValue()) {
            Matcher matcher = zzdxv.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        zzfff zzfffVar = (zzfff) obj;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgc)).booleanValue()) {
            this.zza.zzf.zzi(zzfffVar.zzb.zzb.zzf);
            this.zza.zzf.zzj(zzfffVar.zzb.zzb.zzg);
        }
    }
}
