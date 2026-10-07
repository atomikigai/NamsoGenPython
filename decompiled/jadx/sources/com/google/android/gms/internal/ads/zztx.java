package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zztx implements zzvb, zzrl {
    final /* synthetic */ zztz zza;
    private final Object zzb;
    private zzva zzc;
    private zzrk zzd;

    public zztx(zztz zztzVar, Object obj) {
        this.zza = zztzVar;
        this.zzc = zztzVar.zze(null);
        this.zzd = zztzVar.zzc(null);
        this.zzb = obj;
    }

    private final zzun zzf(zzun zzunVar, zzur zzurVar) {
        zztz zztzVar = this.zza;
        Object obj = this.zzb;
        long j4 = zzunVar.zzc;
        zztzVar.zzx(obj, j4, zzurVar);
        zztz zztzVar2 = this.zza;
        Object obj2 = this.zzb;
        long j10 = zzunVar.zzd;
        zztzVar2.zzx(obj2, j10, zzurVar);
        return (j4 == zzunVar.zzc && j10 == zzunVar.zzd) ? zzunVar : new zzun(1, zzunVar.zza, zzunVar.zzb, 0, null, j4, j10);
    }

    private final boolean zzg(int i, zzur zzurVar) {
        zzur zzurVarZzy;
        if (zzurVar != null) {
            zzurVarZzy = this.zza.zzy(this.zzb, zzurVar);
            if (zzurVarZzy == null) {
                return false;
            }
        } else {
            zzurVarZzy = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzva zzvaVar = this.zzc;
        int i10 = zzvaVar.zza;
        if (!Objects.equals(zzvaVar.zzb, zzurVarZzy)) {
            this.zzc = this.zza.zzf(0, zzurVarZzy);
        }
        zzrk zzrkVar = this.zzd;
        int i11 = zzrkVar.zza;
        if (Objects.equals(zzrkVar.zzb, zzurVarZzy)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzurVarZzy);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzaf(int i, zzur zzurVar, zzun zzunVar) {
        if (zzg(0, zzurVar)) {
            this.zzc.zzc(zzf(zzunVar, zzurVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzag(int i, zzur zzurVar, zzui zzuiVar, zzun zzunVar) {
        if (zzg(0, zzurVar)) {
            this.zzc.zzd(zzuiVar, zzf(zzunVar, zzurVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzah(int i, zzur zzurVar, zzui zzuiVar, zzun zzunVar) {
        if (zzg(0, zzurVar)) {
            this.zzc.zze(zzuiVar, zzf(zzunVar, zzurVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzai(int i, zzur zzurVar, zzui zzuiVar, zzun zzunVar, IOException iOException, boolean z4) {
        if (zzg(0, zzurVar)) {
            this.zzc.zzf(zzuiVar, zzf(zzunVar, zzurVar), iOException, z4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzaj(int i, zzur zzurVar, zzui zzuiVar, zzun zzunVar) {
        if (zzg(0, zzurVar)) {
            this.zzc.zzg(zzuiVar, zzf(zzunVar, zzurVar));
        }
    }
}
