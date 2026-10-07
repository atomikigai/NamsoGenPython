package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzanu implements zzann {
    final /* synthetic */ zzanw zza;
    private final zzec zzb = new zzec(new byte[4], 4);

    public zzanu(zzanw zzanwVar) {
        this.zza = zzanwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zza(zzed zzedVar) {
        if (zzedVar.zzm() == 0 && (zzedVar.zzm() & 128) != 0) {
            zzedVar.zzM(6);
            int iZzb = zzedVar.zzb() / 4;
            for (int i = 0; i < iZzb; i++) {
                zzedVar.zzG(this.zzb, 4);
                zzec zzecVar = this.zzb;
                int iZzd = zzecVar.zzd(16);
                zzecVar.zzn(3);
                if (iZzd == 0) {
                    this.zzb.zzn(13);
                } else {
                    int iZzd2 = this.zzb.zzd(13);
                    if (this.zza.zzg.get(iZzd2) == null) {
                        zzanw zzanwVar = this.zza;
                        zzanwVar.zzg.put(iZzd2, new zzano(new zzanv(zzanwVar, iZzd2)));
                        this.zza.zzm++;
                    }
                }
            }
            this.zza.zzg.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzb(zzek zzekVar, zzacu zzacuVar, zzaoa zzaoaVar) {
    }
}
