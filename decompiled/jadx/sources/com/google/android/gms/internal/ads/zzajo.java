package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzajo implements zzacr {
    private zzacu zza;
    private zzajw zzb;
    private boolean zzc;

    private final boolean zza(zzacs zzacsVar) throws IOException {
        zzajq zzajqVar = new zzajq();
        if (zzajqVar.zzb(zzacsVar, true) && (zzajqVar.zza & 2) == 2) {
            int iMin = Math.min(zzajqVar.zze, 8);
            zzed zzedVar = new zzed(iMin);
            zzacsVar.zzh(zzedVar.zzN(), 0, iMin);
            zzedVar.zzL(0);
            if (zzedVar.zzb() >= 5 && zzedVar.zzm() == 127 && zzedVar.zzu() == 1179402563) {
                this.zzb = new zzajn();
            } else {
                zzedVar.zzL(0);
                try {
                    if (zzaed.zzd(1, zzedVar, true)) {
                        this.zzb = new zzajy();
                    } else {
                        zzedVar.zzL(0);
                        if (zzajs.zzd(zzedVar)) {
                            this.zzb = new zzajs();
                        }
                    }
                } catch (zzbh unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        zzdb.zzb(this.zza);
        if (this.zzb == null) {
            if (!zza(zzacsVar)) {
                throw zzbh.zza("Failed to determine bitstream type", null);
            }
            zzacsVar.zzj();
        }
        if (!this.zzc) {
            zzadx zzadxVarZzw = this.zza.zzw(0, 1);
            this.zza.zzD();
            this.zzb.zzh(this.zza, zzadxVarZzw);
            this.zzc = true;
        }
        return this.zzb.zze(zzacsVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zza = zzacuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        zzajw zzajwVar = this.zzb;
        if (zzajwVar != null) {
            zzajwVar.zzj(j4, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        try {
            return zza(zzacsVar);
        } catch (zzbh unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
