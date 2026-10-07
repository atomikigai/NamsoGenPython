package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaod {
    private final List zza;
    private final zzadx[] zzb;

    public zzaod(List list) {
        this.zza = list;
        this.zzb = new zzadx[list.size()];
    }

    public final void zza(long j4, zzed zzedVar) {
        if (zzedVar.zzb() < 9) {
            return;
        }
        int iZzg = zzedVar.zzg();
        int iZzg2 = zzedVar.zzg();
        int iZzm = zzedVar.zzm();
        if (iZzg == 434 && iZzg2 == 1195456820 && iZzm == 3) {
            zzacd.zzb(j4, zzedVar, this.zzb);
        }
    }

    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzaoaVar.zzc();
            zzadx zzadxVarZzw = zzacuVar.zzw(zzaoaVar.zza(), 3);
            zzad zzadVar = (zzad) this.zza.get(i);
            String str = zzadVar.zzo;
            boolean z4 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z4 = false;
            }
            zzdb.zze(z4, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzab zzabVar = new zzab();
            zzabVar.zzL(zzaoaVar.zzb());
            zzabVar.zzZ(str);
            zzabVar.zzab(zzadVar.zze);
            zzabVar.zzP(zzadVar.zzd);
            zzabVar.zzx(zzadVar.zzH);
            zzabVar.zzM(zzadVar.zzr);
            zzadxVarZzw.zzl(zzabVar.zzaf());
            this.zzb[i] = zzadxVarZzw;
        }
    }
}
