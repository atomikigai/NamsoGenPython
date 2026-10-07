package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgwr implements zzggi {
    private static final byte[] zza = {0};
    private final zzgrn zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgwr(zzgpm zzgpmVar) throws GeneralSecurityException {
        this.zzb = new zzgwo(zzgpmVar.zzd().zzd(zzgfv.zza()));
        this.zzc = zzgpmVar.zzb().zzb();
        this.zzd = zzgpmVar.zzc().zzc();
        if (zzgpmVar.zzb().zzf().equals(zzgps.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzggi zza(zzgpm zzgpmVar) throws GeneralSecurityException {
        return new zzgwr(zzgpmVar);
    }

    public static zzggi zzb(zzgqb zzgqbVar) throws GeneralSecurityException {
        return new zzgwr(zzgqbVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzgvu.zzb(this.zzd, this.zzb.zza(zzgvu.zzb(bArr, bArr2), this.zzc)) : zzgvu.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgwr(zzgqb zzgqbVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(zzgqbVar.zzb().zzf());
        this.zzb = new zzgwq("HMAC".concat(strValueOf), new SecretKeySpec(zzgqbVar.zzd().zzd(zzgfv.zza()), "HMAC"));
        this.zzc = zzgqbVar.zzb().zzb();
        this.zzd = zzgqbVar.zzc().zzc();
        if (zzgqbVar.zzb().zzg().equals(zzgqj.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgwr(zzgrn zzgrnVar, int i) throws GeneralSecurityException {
        this.zzb = zzgrnVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgrnVar.zza(new byte[0], i);
    }
}
