package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzby {
    private final zzwv zza;
    private final List zzb;
    private final zzro zzc = zzro.zza;

    private zzby(zzwv zzwvVar, List list) {
        this.zza = zzwvVar;
        this.zzb = list;
    }

    public static final zzby zza(zzwv zzwvVar) throws GeneralSecurityException {
        zzl(zzwvVar);
        return new zzby(zzwvVar, zzk(zzwvVar));
    }

    public static final zzby zzh(zzbe zzbeVar, zzbd zzbdVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzva zzvaVarZza = zzbeVar.zza();
        if (zzvaVarZza == null || zzvaVarZza.zzd().zzd() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            zzwv zzwvVarZzg = zzwv.zzg(zzbdVar.zza(zzvaVarZza.zzd().zzq(), bArr), zzajx.zza());
            zzl(zzwvVarZzg);
            return zza(zzwvVarZzg);
        } catch (zzaks unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static zzoo zzi(zzwu zzwuVar) {
        try {
            return zzoo.zza(zzwuVar.zzb().zzf(), zzwuVar.zzb().zze(), zzwuVar.zzb().zzb(), zzwuVar.zze(), zzwuVar.zze() == zzxo.RAW ? null : Integer.valueOf(zzwuVar.zza()));
        } catch (GeneralSecurityException e) {
            throw new zzpc("Creating a protokey serialization failed", e);
        }
    }

    private static Object zzj(zzmw zzmwVar, zzwu zzwuVar, Class cls) throws GeneralSecurityException {
        try {
            return zzcq.zzd(zzwuVar.zzb(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    private static List zzk(zzwv zzwvVar) {
        zzbu zzbuVar;
        ArrayList arrayList = new ArrayList(zzwvVar.zza());
        for (zzwu zzwuVar : zzwvVar.zzh()) {
            int iZza = zzwuVar.zza();
            try {
                zzbn zzbnVarZza = zznt.zzc().zza(zzi(zzwuVar), zzcr.zza());
                int iZzk = zzwuVar.zzk() - 2;
                if (iZzk == 1) {
                    zzbuVar = zzbu.zza;
                } else if (iZzk == 2) {
                    zzbuVar = zzbu.zzb;
                } else {
                    if (iZzk != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zzbuVar = zzbu.zzc;
                }
                arrayList.add(new zzbx(zzbnVarZza, zzbuVar, iZza, iZza == zzwvVar.zzb(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzl(zzwv zzwvVar) throws GeneralSecurityException {
        if (zzwvVar == null || zzwvVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static final Object zzm(zzmw zzmwVar, zzbn zzbnVar, Class cls) throws GeneralSecurityException {
        try {
            return zznq.zza().zzc(zzbnVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        return zzct.zza(this.zza).toString();
    }

    public final zzby zzb() throws GeneralSecurityException {
        zzwv zzwvVar = this.zza;
        if (zzwvVar == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        zzws zzwsVarZzc = zzwv.zzc();
        for (zzwu zzwuVar : zzwvVar.zzh()) {
            zzwi zzwiVarZzb = zzwuVar.zzb();
            if (zzwiVarZzb.zzb() != zzwh.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException("The keyset contains a non-private key");
            }
            String strZzf = zzwiVarZzb.zzf();
            zzajf zzajfVarZze = zzwiVarZzb.zze();
            zzbo zzboVarZza = zzcq.zza(strZzf);
            if (!(zzboVarZza instanceof zzcn)) {
                throw new GeneralSecurityException(v.i("manager for key type ", strZzf, " is not a PrivateKeyManager"));
            }
            zzwi zzwiVarZzd = ((zzcn) zzboVarZza).zzd(zzajfVarZze);
            String strZzf2 = zzwiVarZzd.zzf();
            zzcq.zza(strZzf2).zzb(zzwiVarZzd.zze());
            zzwt zzwtVar = (zzwt) zzwuVar.zzu();
            zzwtVar.zza(zzwiVarZzd);
            zzwsVarZzc.zzb((zzwu) zzwtVar.zzi());
        }
        zzwsVarZzc.zzc(this.zza.zzb());
        return zza((zzwv) zzwsVarZzc.zzi());
    }

    public final zzwv zzc() {
        return this.zza;
    }

    public final zzxa zzd() {
        return zzct.zza(this.zza);
    }

    public final Object zze(zzbh zzbhVar, Class cls) throws GeneralSecurityException {
        Class clsZzc = zzcq.zzc(cls);
        if (clsZzc == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        zzwv zzwvVar = this.zza;
        Charset charset = zzct.zza;
        int iZzb = zzwvVar.zzb();
        int i = 0;
        boolean z4 = false;
        boolean z10 = true;
        for (zzwu zzwuVar : zzwvVar.zzh()) {
            if (zzwuVar.zzk() == 3) {
                if (!zzwuVar.zzi()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzwuVar.zza())));
                }
                if (zzwuVar.zze() == zzxo.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzwuVar.zza())));
                }
                if (zzwuVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzwuVar.zza())));
                }
                if (zzwuVar.zza() == iZzb) {
                    if (z4) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z4 = true;
                }
                z10 &= zzwuVar.zzb().zzb() == zzwh.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z4 && !z10) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzcg zzcgVar = new zzcg(clsZzc, null);
        zzcgVar.zzc(this.zzc);
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            zzwu zzwuVarZzd = this.zza.zzd(i10);
            if (zzwuVarZzd.zzk() == 3) {
                zzmw zzmwVar = (zzmw) zzbhVar;
                Object objZzj = zzj(zzmwVar, zzwuVarZzd, clsZzc);
                Object objZzm = this.zzb.get(i10) != null ? zzm(zzmwVar, ((zzbx) this.zzb.get(i10)).zza(), clsZzc) : null;
                if (objZzm == null && objZzj == null) {
                    throw new GeneralSecurityException(v.j("Unable to get primitive ", clsZzc.toString(), " for key of type ", zzwuVarZzd.zzb().zzf()));
                }
                if (zzwuVarZzd.zza() == this.zza.zzb()) {
                    zzcgVar.zzb(objZzm, objZzj, zzwuVarZzd);
                } else {
                    zzcgVar.zza(objZzm, objZzj, zzwuVarZzd);
                }
            }
        }
        return zznq.zza().zzd(zzcgVar.zzd(), cls);
    }

    public final void zzf(zzca zzcaVar, zzbd zzbdVar) throws GeneralSecurityException, IOException {
        zzwv zzwvVar = this.zza;
        byte[] bArr = new byte[0];
        byte[] bArrZzb = zzbdVar.zzb(zzwvVar.zzq(), bArr);
        try {
            if (!zzwv.zzg(zzbdVar.zza(bArrZzb, bArr), zzajx.zza()).equals(zzwvVar)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            int length = bArrZzb.length;
            zzuz zzuzVarZza = zzva.zza();
            zzuzVarZza.zza(zzajf.zzn(bArrZzb, 0, length));
            zzuzVarZza.zzb(zzct.zza(zzwvVar));
            zzcaVar.zzb((zzva) zzuzVarZza.zzi());
        } catch (zzaks unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final void zzg(zzca zzcaVar) throws GeneralSecurityException, IOException {
        for (zzwu zzwuVar : this.zza.zzh()) {
            if (zzwuVar.zzb().zzb() == zzwh.UNKNOWN_KEYMATERIAL || zzwuVar.zzb().zzb() == zzwh.SYMMETRIC || zzwuVar.zzb().zzb() == zzwh.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(v.j("keyset contains key material of type ", zzwuVar.zzb().zzb().name(), " for type url ", zzwuVar.zzb().zzf()));
            }
        }
        zzcaVar.zzc(this.zza);
    }
}
