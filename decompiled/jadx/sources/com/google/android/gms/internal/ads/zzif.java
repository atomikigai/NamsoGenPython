package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzif implements zzkp {
    private final zzlv zza;
    private final zzie zzb;
    private zzln zzc;
    private zzkp zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzif(zzie zzieVar, zzdc zzdcVar) {
        this.zzb = zzieVar;
        this.zza = new zzlv(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        if (this.zze) {
            return this.zza.zza();
        }
        zzkp zzkpVar = this.zzd;
        zzkpVar.getClass();
        return zzkpVar.zza();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    public final long zzb(boolean z4) {
        zzbj zzbjVarZzc;
        zzln zzlnVar = this.zzc;
        if (zzlnVar == null || zzlnVar.zzW() || ((z4 && this.zzc.zzcV() != 2) || (!this.zzc.zzX() && (z4 || this.zzc.zzQ())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzkp zzkpVar = this.zzd;
            zzkpVar.getClass();
            long jZza = zzkpVar.zza();
            if (!this.zze) {
                this.zza.zzb(jZza);
                zzbjVarZzc = zzkpVar.zzc();
                if (!zzbjVarZzc.equals(this.zza.zzc())) {
                    this.zza.zzg(zzbjVarZzc);
                    this.zzb.zza(zzbjVarZzc);
                }
            } else if (jZza < this.zza.zza()) {
                this.zza.zze();
            } else {
                this.zze = false;
                if (this.zzf) {
                    this.zza.zzd();
                }
                this.zza.zzb(jZza);
                zzbjVarZzc = zzkpVar.zzc();
                if (!zzbjVarZzc.equals(this.zza.zzc())) {
                    this.zza.zzg(zzbjVarZzc);
                    this.zzb.zza(zzbjVarZzc);
                }
            }
        }
        return zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzbj zzc() {
        zzkp zzkpVar = this.zzd;
        return zzkpVar != null ? zzkpVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzln zzlnVar) {
        if (zzlnVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzln zzlnVar) throws zzig {
        zzkp zzkpVar;
        zzkp zzkpVarZzl = zzlnVar.zzl();
        if (zzkpVarZzl == null || zzkpVarZzl == (zzkpVar = this.zzd)) {
            return;
        }
        if (zzkpVar != null) {
            throw zzig.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), zzbbs.zzq.zzf);
        }
        this.zzd = zzkpVarZzl;
        this.zzc = zzlnVar;
        zzkpVarZzl.zzg(this.zza.zzc());
    }

    public final void zzf(long j4) {
        this.zza.zzb(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzbj zzbjVar) {
        zzkp zzkpVar = this.zzd;
        if (zzkpVar != null) {
            zzkpVar.zzg(zzbjVar);
            zzbjVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbjVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzkp zzkpVar = this.zzd;
        zzkpVar.getClass();
        return zzkpVar.zzj();
    }
}
