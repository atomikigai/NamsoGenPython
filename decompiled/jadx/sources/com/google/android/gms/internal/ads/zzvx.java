package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzvx extends zztq implements zzvo {
    private final zzgc zza;
    private final zzrp zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzhd zzh;
    private zzaw zzi;
    private final zzvu zzj;
    private final zzyw zzk;

    public /* synthetic */ zzvx(zzaw zzawVar, zzgc zzgcVar, zzvu zzvuVar, zzrp zzrpVar, zzyw zzywVar, int i, zzvw zzvwVar) {
        this.zzi = zzawVar;
        this.zza = zzgcVar;
        this.zzj = zzvuVar;
        this.zzb = zzrpVar;
        this.zzk = zzywVar;
        this.zzc = i;
    }

    private final void zzw() {
        long j4 = this.zze;
        boolean z4 = this.zzf;
        boolean z10 = this.zzg;
        zzaw zzawVarZzJ = zzJ();
        zzbv zzwkVar = new zzwk(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j4, j4, 0L, 0L, z4, false, false, null, zzawVarZzJ, z10 ? zzawVarZzJ.zzc : null);
        if (this.zzd) {
            zzwkVar = new zzvt(this, zzwkVar);
        }
        zzo(zzwkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzG(zzup zzupVar) {
        ((zzvs) zzupVar).zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final zzup zzI(zzur zzurVar, zzys zzysVar, long j4) {
        zzgd zzgdVarZza = this.zza.zza();
        zzhd zzhdVar = this.zzh;
        if (zzhdVar != null) {
            zzgdVarZza.zzf(zzhdVar);
        }
        zzar zzarVar = zzJ().zzb;
        zzarVar.getClass();
        Uri uri = zzarVar.zza;
        zzvu zzvuVar = this.zzj;
        zzb();
        return new zzvs(uri, zzgdVarZza, new zztt(zzvuVar.zza), this.zzb, zzc(zzurVar), this.zzk, zze(zzurVar), this, zzysVar, null, this.zzc, zzen.zzs(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final synchronized zzaw zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void zza(long j4, boolean z4, boolean z10) {
        if (j4 == -9223372036854775807L) {
            j4 = this.zze;
        }
        if (!this.zzd && this.zze == j4 && this.zzf == z4 && this.zzg == z10) {
            return;
        }
        this.zze = j4;
        this.zzf = z4;
        this.zzg = z10;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzn(zzhd zzhdVar) {
        this.zzh = zzhdVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zztq, com.google.android.gms.internal.ads.zzut
    public final synchronized void zzt(zzaw zzawVar) {
        this.zzi = zzawVar;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void zzz() {
    }
}
