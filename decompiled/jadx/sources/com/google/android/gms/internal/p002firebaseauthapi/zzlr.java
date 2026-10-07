package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzlr implements zzbl {
    private final zzwd zza;
    private final zzlt zzb;
    private final zzls zzc;
    private final zzlo zzd;

    private zzlr(zzwd zzwdVar, zzlt zzltVar, zzls zzlsVar, zzlo zzloVar) {
        this.zza = zzwdVar;
        this.zzb = zzltVar;
        this.zzc = zzlsVar;
        this.zzd = zzloVar;
    }

    public static zzlr zza(zzwd zzwdVar) throws GeneralSecurityException {
        if (zzwdVar.zzg().zzp()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        zzvx zzvxVarZzb = zzwdVar.zzb();
        return new zzlr(zzwdVar, zzlv.zzc(zzvxVarZzb), zzlv.zzb(zzvxVarZzb), zzlv.zza(zzvxVarZzb));
    }
}
