package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzanf implements zzann {
    private zzad zza;
    private zzek zzb;
    private zzadx zzc;

    public zzanf(String str) {
        zzab zzabVar = new zzab();
        zzabVar.zzZ(str);
        this.zza = zzabVar.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zza(zzed zzedVar) {
        zzdb.zzb(this.zzb);
        int i = zzen.zza;
        long jZze = this.zzb.zze();
        long jZzf = this.zzb.zzf();
        if (jZze == -9223372036854775807L || jZzf == -9223372036854775807L) {
            return;
        }
        zzad zzadVar = this.zza;
        if (jZzf != zzadVar.zzt) {
            zzab zzabVarZzb = zzadVar.zzb();
            zzabVarZzb.zzad(jZzf);
            zzad zzadVarZzaf = zzabVarZzb.zzaf();
            this.zza = zzadVarZzaf;
            this.zzc.zzl(zzadVarZzaf);
        }
        int iZzb = zzedVar.zzb();
        this.zzc.zzq(zzedVar, iZzb);
        this.zzc.zzs(jZze, 1, iZzb, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzb(zzek zzekVar, zzacu zzacuVar, zzaoa zzaoaVar) {
        this.zzb = zzekVar;
        zzaoaVar.zzc();
        zzadx zzadxVarZzw = zzacuVar.zzw(zzaoaVar.zza(), 5);
        this.zzc = zzadxVarZzw;
        zzadxVarZzw.zzl(this.zza);
    }
}
