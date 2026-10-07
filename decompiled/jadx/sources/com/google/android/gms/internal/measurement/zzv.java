package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.zzbbs;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzv extends zzai {
    private final zzz zza;

    public zzv(zzz zzzVar) {
        super("internal.registerCallback");
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh(this.zzd, 3, list);
        String strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(1));
        if (!(zzapVarZzb instanceof zzao)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        zzap zzapVarZzb2 = zzgVar.zzb((zzap) list.get(2));
        if (!(zzapVarZzb2 instanceof zzam)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        zzam zzamVar = (zzam) zzapVarZzb2;
        if (!zzamVar.zzt("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.zza.zza(strZzi, zzamVar.zzt("priority") ? zzh.zzb(zzamVar.zzf("priority").zzh().doubleValue()) : zzbbs.zzq.zzf, (zzao) zzapVarZzb, zzamVar.zzf("type").zzi());
        return zzap.zzf;
    }
}
