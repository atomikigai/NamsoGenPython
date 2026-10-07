package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfv extends zzcv {
    private final zzga zza;
    private final zzzq zzb;
    private final zzzo zzc;
    private final Integer zzd;

    private zzfv(zzga zzgaVar, zzzq zzzqVar, zzzo zzzoVar, Integer num) {
        this.zza = zzgaVar;
        this.zzb = zzzqVar;
        this.zzc = zzzoVar;
        this.zzd = num;
    }

    public static zzfv zza(zzfz zzfzVar, zzzq zzzqVar, Integer num) throws GeneralSecurityException {
        zzzo zzzoVarF;
        zzfz zzfzVar2 = zzfz.zzc;
        if (zzfzVar != zzfzVar2 && num == null) {
            throw new GeneralSecurityException(v.i("For given Variant ", zzfzVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzfzVar == zzfzVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzqVar.zza() != 32) {
            throw new GeneralSecurityException(v.f(zzzqVar.zza(), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzga zzgaVarZzc = zzga.zzc(zzfzVar);
        if (zzgaVarZzc.zzb() == zzfzVar2) {
            zzzoVarF = zzzo.zzb(new byte[0]);
        } else if (zzgaVarZzc.zzb() == zzfz.zzb) {
            zzzoVarF = a.f(num, ByteBuffer.allocate(5).put((byte) 0));
        } else {
            if (zzgaVarZzc.zzb() != zzfz.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgaVarZzc.zzb().toString()));
            }
            zzzoVarF = a.f(num, ByteBuffer.allocate(5).put((byte) 1));
        }
        return new zzfv(zzgaVarZzc, zzzqVar, zzzoVarF, num);
    }
}
