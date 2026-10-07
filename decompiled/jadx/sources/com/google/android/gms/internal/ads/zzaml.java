package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaml implements zzamm {
    private final List zza;
    private final zzadx[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzaml(List list) {
        this.zza = list;
        this.zzb = new zzadx[list.size()];
    }

    private final boolean zzf(zzed zzedVar, int i) {
        if (zzedVar.zzb() == 0) {
            return false;
        }
        if (zzedVar.zzm() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzedVar, 32)) {
                if (this.zzd != 1 || zzf(zzedVar, 0)) {
                    int iZzd = zzedVar.zzd();
                    int iZzb = zzedVar.zzb();
                    for (zzadx zzadxVar : this.zzb) {
                        zzedVar.zzL(iZzd);
                        zzadxVar.zzq(zzedVar, iZzb);
                    }
                    this.zze += iZzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzanx zzanxVar = (zzanx) this.zza.get(i);
            zzaoaVar.zzc();
            zzadx zzadxVarZzw = zzacuVar.zzw(zzaoaVar.zza(), 3);
            zzab zzabVar = new zzab();
            zzabVar.zzL(zzaoaVar.zzb());
            zzabVar.zzZ("application/dvbsubs");
            zzabVar.zzM(Collections.singletonList(zzanxVar.zzb));
            zzabVar.zzP(zzanxVar.zza);
            zzadxVarZzw.zzl(zzabVar.zzaf());
            this.zzb[i] = zzadxVarZzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
        if (this.zzc) {
            zzdb.zzf(this.zzf != -9223372036854775807L);
            for (zzadx zzadxVar : this.zzb) {
                zzadxVar.zzs(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j4, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = j4;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
