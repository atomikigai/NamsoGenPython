package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhm extends zzcv {
    private final zzhr zza;
    private final zzzq zzb;
    private final zzzo zzc;
    private final Integer zzd;

    private zzhm(zzhr zzhrVar, zzzq zzzqVar, zzzo zzzoVar, Integer num) {
        this.zza = zzhrVar;
        this.zzb = zzzqVar;
        this.zzc = zzzoVar;
        this.zzd = num;
    }

    public static zzhm zza(zzhq zzhqVar, zzzq zzzqVar, Integer num) throws GeneralSecurityException {
        zzzo zzzoVarF;
        zzhq zzhqVar2 = zzhq.zzc;
        if (zzhqVar != zzhqVar2 && num == null) {
            throw new GeneralSecurityException(v.i("For given Variant ", zzhqVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzhqVar == zzhqVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzqVar.zza() != 32) {
            throw new GeneralSecurityException(v.f(zzzqVar.zza(), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzhr zzhrVarZzd = zzhr.zzd(zzhqVar);
        if (zzhrVarZzd.zzb() == zzhqVar2) {
            zzzoVarF = zzzo.zzb(new byte[0]);
        } else if (zzhrVarZzd.zzb() == zzhq.zzb) {
            zzzoVarF = a.f(num, ByteBuffer.allocate(5).put((byte) 0));
        } else {
            if (zzhrVarZzd.zzb() != zzhq.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhrVarZzd.zzb().toString()));
            }
            zzzoVarF = a.f(num, ByteBuffer.allocate(5).put((byte) 1));
        }
        return new zzhm(zzhrVarZzd, zzzqVar, zzzoVarF, num);
    }
}
