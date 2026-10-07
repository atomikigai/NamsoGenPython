package com.google.android.gms.internal.ads;

import e6.h2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdrc implements zzczj, zzcya, zzcwp, zzcxg, e6.a, zzdbv {
    private final zzbbl zza;
    private boolean zzb = false;

    public zzdrc(zzbbl zzbblVar, zzfco zzfcoVar) {
        this.zza = zzbblVar;
        zzbblVar.zzc(2);
        if (zzfcoVar != null) {
            zzbblVar.zzc(1101);
        }
    }

    @Override // e6.a
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(h2 h2Var) {
        switch (h2Var.f3314a) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(final zzfff zzfffVar) {
        this.zza.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzdqy
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar) {
                zzbbs.zza.zzb zzbVarZzbM = zzaVar.zze().zzbM();
                zzbbs.zzi.zza zzaVarZzbM = zzaVar.zze().zzad().zzbM();
                zzaVarZzbM.zzo(zzfffVar.zzb.zzb.zzb);
                zzbVarZzbM.zzT(zzaVarZzbM);
                zzaVar.zzG(zzbVarZzbM);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzi(final zzbbs.zzb zzbVar) {
        this.zza.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzdrb
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(final zzbbs.zzb zzbVar) {
        this.zza.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzl(boolean z4) {
        this.zza.zzc(true != z4 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzm(final zzbbs.zzb zzbVar) {
        this.zza.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzdra
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbVar);
            }
        });
        this.zza.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzn(boolean z4) {
        this.zza.zzc(true != z4 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzs() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
    }
}
