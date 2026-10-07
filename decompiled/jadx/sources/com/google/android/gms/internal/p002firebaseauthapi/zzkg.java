package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkg extends zzli {
    private final zzjx zza;
    private final ECPoint zzb;
    private final zzzo zzc;
    private final zzzo zzd;
    private final Integer zze;

    private zzkg(zzjx zzjxVar, ECPoint eCPoint, zzzo zzzoVar, zzzo zzzoVar2, Integer num) {
        this.zza = zzjxVar;
        this.zzb = eCPoint;
        this.zzc = zzzoVar;
        this.zzd = zzzoVar2;
        this.zze = num;
    }

    public static zzkg zzb(zzjx zzjxVar, zzzo zzzoVar, Integer num) throws GeneralSecurityException {
        if (!zzjxVar.zzc().equals(zzjs.zzd)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        zzg(zzjxVar.zzf(), num);
        if (zzzoVar.zza() == 32) {
            return new zzkg(zzjxVar, null, zzzoVar, zzf(zzjxVar.zzf(), num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    public static zzkg zzc(zzjx zzjxVar, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        if (zzjxVar.zzc().equals(zzjs.zzd)) {
            throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        zzg(zzjxVar.zzf(), num);
        zzjs zzjsVarZzc = zzjxVar.zzc();
        if (zzjsVarZzc == zzjs.zza) {
            curve = zzmq.zza.getCurve();
        } else if (zzjsVarZzc == zzjs.zzb) {
            curve = zzmq.zzb.getCurve();
        } else {
            if (zzjsVarZzc != zzjs.zzc) {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zzjsVarZzc)));
            }
            curve = zzmq.zzc.getCurve();
        }
        zzmq.zzf(eCPoint, curve);
        return new zzkg(zzjxVar, eCPoint, null, zzf(zzjxVar.zzf(), num), num);
    }

    private static zzzo zzf(zzjv zzjvVar, Integer num) {
        if (zzjvVar == zzjv.zzc) {
            return zzzo.zzb(new byte[0]);
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(zzjvVar)));
        }
        if (zzjvVar == zzjv.zzb) {
            return a.f(num, ByteBuffer.allocate(5).put((byte) 0));
        }
        if (zzjvVar == zzjv.zza) {
            return a.f(num, ByteBuffer.allocate(5).put((byte) 1));
        }
        throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(zzjvVar)));
    }

    private static void zzg(zzjv zzjvVar, Integer num) throws GeneralSecurityException {
        zzjv zzjvVar2 = zzjv.zzc;
        if (!zzjvVar.equals(zzjvVar2) && num == null) {
            throw new GeneralSecurityException(v.i("'idRequirement' must be non-null for ", String.valueOf(zzjvVar), " variant."));
        }
        if (zzjvVar.equals(zzjvVar2) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    public final zzjx zza() {
        return this.zza;
    }

    public final zzzo zzd() {
        return this.zzc;
    }

    public final ECPoint zze() {
        return this.zzb;
    }
}
