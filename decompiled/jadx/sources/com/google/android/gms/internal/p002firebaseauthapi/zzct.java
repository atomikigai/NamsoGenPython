package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzct {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzxa zza(zzwv zzwvVar) {
        zzwx zzwxVarZza = zzxa.zza();
        zzwxVarZza.zzb(zzwvVar.zzb());
        for (zzwu zzwuVar : zzwvVar.zzh()) {
            zzwy zzwyVarZzb = zzwz.zzb();
            zzwyVarZzb.zzc(zzwuVar.zzb().zzf());
            zzwyVarZzb.zzd(zzwuVar.zzk());
            zzwyVarZzb.zzb(zzwuVar.zze());
            zzwyVarZzb.zza(zzwuVar.zza());
            zzwxVarZza.zza((zzwz) zzwyVarZzb.zzi());
        }
        return (zzxa) zzwxVarZza.zzi();
    }
}
