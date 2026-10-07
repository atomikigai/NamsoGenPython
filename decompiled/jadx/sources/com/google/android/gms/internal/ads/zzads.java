package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzads implements zzacr {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzacu zzf;
    private zzadx zzg;

    public zzads(int i, int i10, String str) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final int zzb(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzadx zzadxVar = this.zzg;
        zzadxVar.getClass();
        int iZzf = zzadxVar.zzf(zzacsVar, 1024, true);
        if (iZzf == -1) {
            this.zze = 2;
            this.zzg.zzs(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZzf;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ List zzd() {
        return zzfzo.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zze(zzacu zzacuVar) {
        this.zzf = zzacuVar;
        zzadx zzadxVarZzw = zzacuVar.zzw(1024, 4);
        this.zzg = zzadxVarZzw;
        zzab zzabVar = new zzab();
        zzabVar.zzZ(this.zzc);
        zzadxVarZzw.zzl(zzabVar.zzaf());
        this.zzf.zzD();
        this.zzf.zzO(new zzadt(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final void zzf(long j4, long j10) {
        if (j4 == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzi(zzacs zzacsVar) throws IOException {
        zzdb.zzf((this.zza == -1 || this.zzb == -1) ? false : true);
        zzed zzedVar = new zzed(this.zzb);
        ((zzacg) zzacsVar).zzm(zzedVar.zzN(), 0, this.zzb, false);
        return zzedVar.zzq() == this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final /* synthetic */ zzacr zzc() {
        return this;
    }
}
