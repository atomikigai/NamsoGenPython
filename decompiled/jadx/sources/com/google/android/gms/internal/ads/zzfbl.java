package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfbl implements zzfck {
    private zzcvt zza;
    private final Executor zzb = zzgey.zzb();

    public final zzcvt zza() {
        return this.zza;
    }

    public final m9.a zzb(zzfcl zzfclVar, zzfcj zzfcjVar, zzcvt zzcvtVar) {
        zzcvs zzcvsVarZza = zzfcjVar.zza(zzfclVar.zzb);
        zzcvsVarZza.zzb(new zzfco(true));
        zzcvt zzcvtVar2 = (zzcvt) zzcvsVarZza.zzh();
        this.zza = zzcvtVar2;
        final zzcsy zzcsyVarZzb = zzcvtVar2.zzb();
        final zzfhl zzfhlVar = new zzfhl();
        return (zzgdz) zzgei.zzm((zzgdz) zzgei.zzn(zzgdz.zzu(zzcsyVarZzb.zzj()), new zzgdp(this) { // from class: com.google.android.gms.internal.ads.zzfbj
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                zzfff zzfffVar = (zzfff) obj;
                zzfhlVar.zzb = zzfffVar;
                Iterator it = zzfffVar.zzb.zza.iterator();
                boolean z4 = false;
                while (it.hasNext()) {
                    Iterator it2 = ((zzfet) it.next()).zza.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return zzgei.zzh(null);
                        }
                        z4 = true;
                    }
                }
                if (z4) {
                    return zzcsyVarZzb.zzi(zzgei.zzh(zzfffVar));
                }
                return zzgei.zzh(null);
            }
        }, this.zzb), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzfbk
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzfhl zzfhlVar2 = zzfhlVar;
                zzfhlVar2.zzc = (zzcrq) obj;
                return zzfhlVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* bridge */ /* synthetic */ m9.a zzc(zzfcl zzfclVar, zzfcj zzfcjVar, Object obj) {
        return zzb(zzfclVar, zzfcjVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
