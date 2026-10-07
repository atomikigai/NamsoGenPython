package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzamw implements zzamm {
    private zzadx zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzed zza = new zzed(10);
    private long zzd = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zza(zzed zzedVar) {
        zzdb.zzb(this.zzb);
        if (this.zzc) {
            int iZzb = zzedVar.zzb();
            int i = this.zzf;
            if (i < 10) {
                int iMin = Math.min(iZzb, 10 - i);
                System.arraycopy(zzedVar.zzN(), zzedVar.zzd(), this.zza.zzN(), this.zzf, iMin);
                if (this.zzf + iMin == 10) {
                    this.zza.zzL(0);
                    if (this.zza.zzm() != 73 || this.zza.zzm() != 68 || this.zza.zzm() != 51) {
                        zzdt.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    } else {
                        this.zza.zzM(3);
                        this.zze = this.zza.zzl() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZzb, this.zze - this.zzf);
            this.zzb.zzq(zzedVar, iMin2);
            this.zzf += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        zzaoaVar.zzc();
        zzadx zzadxVarZzw = zzacuVar.zzw(zzaoaVar.zza(), 5);
        this.zzb = zzadxVarZzw;
        zzab zzabVar = new zzab();
        zzabVar.zzL(zzaoaVar.zzb());
        zzabVar.zzZ("application/id3");
        zzadxVarZzw.zzl(zzabVar.zzaf());
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzc(boolean z4) {
        int i;
        zzdb.zzb(this.zzb);
        if (this.zzc && (i = this.zze) != 0 && this.zzf == i) {
            zzdb.zzf(this.zzd != -9223372036854775807L);
            this.zzb.zzs(this.zzd, 1, this.zze, 0, null);
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zzd(long j4, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzd = j4;
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzamm
    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
