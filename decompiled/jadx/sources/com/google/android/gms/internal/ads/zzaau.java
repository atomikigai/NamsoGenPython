package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaau {
    private final zzaap zza;
    private zzci zzf;
    private long zzh;
    private final zzzq zzj;
    private final zzaan zzb = new zzaan();
    private final zzej zzc = new zzej(10);
    private final zzej zzd = new zzej(10);
    private final zzdv zze = new zzdv(16);
    private zzci zzg = zzci.zza;
    private long zzi = -9223372036854775807L;

    public zzaau(zzzq zzzqVar, zzaap zzaapVar) {
        this.zzj = zzzqVar;
        this.zza = zzaapVar;
    }

    private static Object zzg(zzej zzejVar) {
        zzdb.zzd(zzejVar.zza() > 0);
        while (zzejVar.zza() > 1) {
            zzejVar.zzb();
        }
        Object objZzb = zzejVar.zzb();
        objZzb.getClass();
        return objZzb;
    }

    public final void zza() {
        this.zze.zzc();
        this.zzi = -9223372036854775807L;
        zzej zzejVar = this.zzd;
        if (zzejVar.zza() > 0) {
            Long l2 = (Long) zzg(zzejVar);
            l2.longValue();
            this.zzd.zzd(0L, l2);
        }
        if (this.zzf != null) {
            this.zzc.zze();
            return;
        }
        zzej zzejVar2 = this.zzc;
        if (zzejVar2.zza() > 0) {
            this.zzf = (zzci) zzg(zzejVar2);
        }
    }

    public final void zzb(long j4, long j10) {
        this.zzd.zzd(j4, Long.valueOf(j10));
    }

    public final void zzc(long j4, long j10) throws zzig {
        zzdv zzdvVar = this.zze;
        if (zzdvVar.zzd()) {
            return;
        }
        zzej zzejVar = this.zzd;
        long jZza = zzdvVar.zza();
        Long l2 = (Long) zzejVar.zzc(jZza);
        if (l2 != null && l2.longValue() != this.zzh) {
            this.zzh = l2.longValue();
            this.zza.zzf();
        }
        int iZza = this.zza.zza(jZza, j4, j10, this.zzh, false, this.zzb);
        if (iZza != 0 && iZza != 1) {
            if (iZza == 2 || iZza == 3 || iZza == 4) {
                this.zzi = jZza;
                this.zze.zzb();
                zzzq zzzqVar = this.zzj;
                Iterator it = zzzqVar.zza.zzh.iterator();
                while (it.hasNext()) {
                    ((zzzr) it.next()).zzb(zzzqVar.zza);
                }
                zzdb.zzb(null);
                throw null;
            }
            return;
        }
        this.zzi = jZza;
        long jLongValue = Long.valueOf(this.zze.zzb()).longValue();
        zzci zzciVar = (zzci) this.zzc.zzc(jLongValue);
        if (zzciVar != null && !zzciVar.equals(zzci.zza) && !zzciVar.equals(this.zzg)) {
            this.zzg = zzciVar;
            zzzq zzzqVar2 = this.zzj;
            zzab zzabVar = new zzab();
            zzabVar.zzae(zzciVar.zzb);
            zzabVar.zzJ(zzciVar.zzc);
            zzabVar.zzZ("video/raw");
            zzzqVar2.zza.zzi = zzabVar.zzaf();
            Iterator it2 = zzzqVar2.zza.zzh.iterator();
            while (it2.hasNext()) {
                ((zzzr) it2.next()).zzc(zzzqVar2.zza, zzciVar);
            }
        }
        zzzq zzzqVar3 = this.zzj;
        if (this.zza.zzp()) {
            zzaaa zzaaaVar = zzzqVar3.zza;
            if (zzaaaVar.zzl != null) {
                Iterator it3 = zzaaaVar.zzh.iterator();
                while (it3.hasNext()) {
                    ((zzzr) it3.next()).zza(zzzqVar3.zza);
                }
            }
        }
        zzaaa zzaaaVar2 = zzzqVar3.zza;
        if (zzaaaVar2.zzj != null) {
            zzad zzadVarZzaf = zzaaaVar2.zzi == null ? new zzab().zzaf() : zzaaaVar2.zzi;
            zzaaa zzaaaVar3 = zzzqVar3.zza;
            zzaaaVar3.zzj.zza(jLongValue, zzaaaVar3.zzg.zzc(), zzadVarZzaf, null);
        }
        zzdb.zzb(null);
        throw null;
    }

    public final void zzd(float f10) {
        zzdb.zzd(f10 > 0.0f);
        this.zza.zzn(f10);
    }

    public final boolean zze(long j4) {
        long j10 = this.zzi;
        return j10 != -9223372036854775807L && j10 >= j4;
    }

    public final boolean zzf(boolean z4) {
        return this.zza.zzo(false);
    }
}
