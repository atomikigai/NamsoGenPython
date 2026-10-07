package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzanq {
    private final List zza;
    private final zzadx[] zzb;
    private final zzft zzc = new zzft(new zzfr() { // from class: com.google.android.gms.internal.ads.zzanp
        @Override // com.google.android.gms.internal.ads.zzfr
        public final void zza(long j4, zzed zzedVar) {
            this.zza.zzd(j4, zzedVar);
        }
    });

    public zzanq(List list) {
        this.zza = list;
        this.zzb = new zzadx[list.size()];
    }

    public final void zza(long j4, zzed zzedVar) {
        this.zzc.zzb(j4, zzedVar);
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
            String strZzb = zzadVar.zza;
            if (strZzb == null) {
                strZzb = zzaoaVar.zzb();
            }
            zzab zzabVar = new zzab();
            zzabVar.zzL(strZzb);
            zzabVar.zzZ(str);
            zzabVar.zzab(zzadVar.zze);
            zzabVar.zzP(zzadVar.zzd);
            zzabVar.zzx(zzadVar.zzH);
            zzabVar.zzM(zzadVar.zzr);
            zzadxVarZzw.zzl(zzabVar.zzaf());
            this.zzb[i] = zzadxVarZzw;
        }
    }

    public final void zzc() {
        this.zzc.zzc();
    }

    public final /* synthetic */ void zzd(long j4, zzed zzedVar) {
        zzacd.zza(j4, zzedVar, this.zzb);
    }

    public final void zze(int i) {
        this.zzc.zzd(i);
    }
}
