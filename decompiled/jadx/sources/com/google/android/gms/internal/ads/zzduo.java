package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import d6.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzduo extends zzbls {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfka zzd;
    final /* synthetic */ zzcao zze;
    final /* synthetic */ zzdup zzf;

    public zzduo(zzdup zzdupVar, Object obj, String str, long j4, zzfka zzfkaVar, zzcao zzcaoVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j4;
        this.zzd = zzfkaVar;
        this.zze = zzcaoVar;
        this.zzf = zzdupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zze(String str) {
        synchronized (this.zza) {
            zzdup zzdupVar = this.zzf;
            String str2 = this.zzb;
            p.C.f2983j.getClass();
            zzdupVar.zzv(str2, false, str, (int) (SystemClock.elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, "error");
            this.zzf.zzo.zzb(this.zzb, "error");
            zzfko zzfkoVar = this.zzf.zzp;
            zzfka zzfkaVar = this.zzd;
            zzfkaVar.zzc(str);
            zzfkaVar.zzg(false);
            zzfkoVar.zzb(zzfkaVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblt
    public final void zzf() {
        synchronized (this.zza) {
            zzdup zzdupVar = this.zzf;
            String str = this.zzb;
            p.C.f2983j.getClass();
            zzdupVar.zzv(str, true, "", (int) (SystemClock.elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfko zzfkoVar = this.zzf.zzp;
            zzfka zzfkaVar = this.zzd;
            zzfkaVar.zzg(true);
            zzfkoVar.zzb(zzfkaVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
