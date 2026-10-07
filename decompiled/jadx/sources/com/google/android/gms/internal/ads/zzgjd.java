package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgjd extends zzggs {
    private final zzgjf zza;
    private final zzgwu zzb;
    private final Integer zzc;

    private zzgjd(zzgjf zzgjfVar, zzgwu zzgwuVar, Integer num) {
        this.zza = zzgjfVar;
        this.zzb = zzgwuVar;
        this.zzc = num;
    }

    public static zzgjd zza(zzgjf zzgjfVar, Integer num) throws GeneralSecurityException {
        zzgwu zzgwuVarZzb;
        if (zzgjfVar.zzb() == zzgje.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzgwuVarZzb = zzgwu.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzgjfVar.zzb() != zzgje.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzgjfVar.zzb().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzgwuVarZzb = zzgwu.zzb(new byte[0]);
        }
        return new zzgjd(zzgjfVar, zzgwuVarZzb, num);
    }

    public final zzgjf zzb() {
        return this.zza;
    }

    public final zzgwu zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
