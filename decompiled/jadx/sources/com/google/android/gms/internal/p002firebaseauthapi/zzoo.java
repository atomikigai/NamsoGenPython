package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzoo implements zzot {
    private final String zza;
    private final zzzo zzb;
    private final zzajf zzc;
    private final zzwh zzd;
    private final zzxo zze;
    private final Integer zzf;

    private zzoo(String str, zzajf zzajfVar, zzwh zzwhVar, zzxo zzxoVar, Integer num) {
        this.zza = str;
        this.zzb = zzpd.zzb(str);
        this.zzc = zzajfVar;
        this.zzd = zzwhVar;
        this.zze = zzxoVar;
        this.zzf = num;
    }

    public static zzoo zza(String str, zzajf zzajfVar, zzwh zzwhVar, zzxo zzxoVar, Integer num) throws GeneralSecurityException {
        if (zzxoVar == zzxo.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzoo(str, zzajfVar, zzwhVar, zzxoVar, num);
    }

    public final zzwh zzb() {
        return this.zzd;
    }

    public final zzxo zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
    public final zzzo zzd() {
        return this.zzb;
    }

    public final zzajf zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
