package com.google.android.gms.internal.ads;

import e6.o3;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfbq implements zzfck {
    private final zzfck zza;
    private final zzfck zzb;
    private final zzfhy zzc;
    private final String zzd;
    private zzcvt zze;
    private final Executor zzf;

    public zzfbq(zzfck zzfckVar, zzfck zzfckVar2, zzfhy zzfhyVar, String str, Executor executor) {
        this.zza = zzfckVar;
        this.zzb = zzfckVar2;
        this.zzc = zzfhyVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final m9.a zzg(zzfhl zzfhlVar, zzfcl zzfclVar) {
        zzcvt zzcvtVar = zzfhlVar.zza;
        this.zze = zzcvtVar;
        if (zzfhlVar.zzc != null) {
            if (zzcvtVar.zzf() != null) {
                zzfhlVar.zzc.zzp().zzl(zzfhlVar.zza.zzf());
            }
            return zzgei.zzh(zzfhlVar.zzc);
        }
        zzcvtVar.zzb().zzl(zzfhlVar.zzb);
        return ((zzfca) this.zza).zzb(zzfclVar, null, zzfhlVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcvt zzd() {
        return this.zze;
    }

    public final /* synthetic */ m9.a zzb(zzfcl zzfclVar, zzfbp zzfbpVar, zzfcj zzfcjVar, zzcvt zzcvtVar, zzfbv zzfbvVar) throws Exception {
        if (zzfbvVar != null) {
            zzfbp zzfbpVar2 = new zzfbp(zzfbpVar.zza, zzfbpVar.zzb, zzfbpVar.zzc, zzfbpVar.zzd, zzfbpVar.zze, zzfbpVar.zzf, zzfbvVar.zza);
            if (zzfbvVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzfbpVar2);
                return zzg(zzfbvVar.zzc, zzfclVar);
            }
            m9.a aVarZza = this.zzc.zza(zzfbpVar2);
            if (aVarZza != null) {
                this.zze = null;
                return zzgei.zzn(aVarZza, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfbm
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final m9.a zza(Object obj) {
                        return this.zza.zze((zzfhv) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzfbpVar2);
            zzfclVar = new zzfcl(zzfclVar.zzb, zzfbvVar.zzb);
        }
        m9.a aVarZzb = ((zzfca) this.zza).zzb(zzfclVar, zzfcjVar, zzcvtVar);
        this.zze = zzcvtVar;
        return aVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* bridge */ /* synthetic */ m9.a zzc(zzfcl zzfclVar, zzfcj zzfcjVar, Object obj) {
        return zzf(zzfclVar, zzfcjVar, null);
    }

    public final /* synthetic */ m9.a zze(zzfhv zzfhvVar) throws Exception {
        zzfhx zzfhxVar;
        if (zzfhvVar == null || zzfhvVar.zza == null || (zzfhxVar = zzfhvVar.zzb) == null) {
            throw new zzdwn(1, "Empty prefetch");
        }
        zzbbs.zzb.zzc zzcVarZzd = zzbbs.zzb.zzd();
        zzbbs.zzb.zza.C0003zza c0003zzaZza = zzbbs.zzb.zza.zza();
        c0003zzaZza.zzf(zzbbs.zzb.zzd.IN_MEMORY);
        c0003zzaZza.zzh(zzbbs.zzb.zze.zzi());
        zzcVarZzd.zzd(c0003zzaZza);
        zzfhvVar.zza.zza.zzb().zzc().zzm(zzcVarZzd.zzbr());
        return zzg(zzfhvVar.zza, ((zzfbp) zzfhxVar).zzb);
    }

    public final synchronized m9.a zzf(final zzfcl zzfclVar, final zzfcj zzfcjVar, zzcvt zzcvtVar) {
        zzcvs zzcvsVarZza = zzfcjVar.zza(zzfclVar.zzb);
        zzcvsVarZza.zza(new zzfbr(this.zzd));
        final zzcvt zzcvtVar2 = (zzcvt) zzcvsVarZza.zzh();
        zzcvtVar2.zzg();
        zzcvtVar2.zzg();
        o3 o3Var = zzcvtVar2.zzg().zzd;
        if (o3Var.D != null || o3Var.I != null) {
            this.zze = zzcvtVar2;
            return ((zzfca) this.zza).zzb(zzfclVar, zzfcjVar, zzcvtVar2);
        }
        zzffo zzffoVarZzg = zzcvtVar2.zzg();
        final zzfbp zzfbpVar = new zzfbp(zzfcjVar, zzfclVar, zzffoVarZzg.zzd, zzffoVarZzg.zzf, this.zzf, zzffoVarZzg.zzj, null);
        return (zzgdz) zzgei.zzn(zzgdz.zzu(((zzfbw) this.zzb).zzb(zzfclVar, zzfcjVar, zzcvtVar2)), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfbn
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzb(zzfclVar, zzfbpVar, zzfcjVar, zzcvtVar2, (zzfbv) obj);
            }
        }, this.zzf);
    }
}
