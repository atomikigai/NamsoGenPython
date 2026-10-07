package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzggf {
    private final zzgum zza;
    private final List zzb;
    private final zzgnd zzc;

    public /* synthetic */ zzggf(zzgum zzgumVar, List list, zzgnd zzgndVar, zzgge zzggeVar) {
        this.zza = zzgumVar;
        this.zzb = list;
        this.zzc = zzgndVar;
    }

    public static final zzggf zza(zzgum zzgumVar) throws GeneralSecurityException {
        zzh(zzgumVar);
        return new zzggf(zzgumVar, zzg(zzgumVar));
    }

    public static final zzggf zzb(zzggj zzggjVar) throws GeneralSecurityException {
        zzggc zzggcVar = new zzggc();
        zzgga zzggaVar = new zzgga(zzggjVar, null);
        zzggaVar.zzd();
        zzggaVar.zzc();
        zzggcVar.zza(zzggaVar);
        return zzggcVar.zzb();
    }

    private final Object zzf(zzgmn zzgmnVar, Class cls, Class cls2) throws GeneralSecurityException {
        int i = zzggq.zza;
        zzgum zzgumVar = this.zza;
        int iZzb = zzgumVar.zzb();
        int i10 = 0;
        boolean z4 = false;
        boolean z10 = true;
        for (zzguk zzgukVar : zzgumVar.zzh()) {
            if (zzgukVar.zzk() == 3) {
                if (!zzgukVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgukVar.zza())));
                }
                if (zzgukVar.zzf() == zzgve.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgukVar.zza())));
                }
                if (zzgukVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgukVar.zza())));
                }
                if (zzgukVar.zza() == iZzb) {
                    if (z4) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z4 = true;
                }
                z10 &= zzgukVar.zzb().zzb() == zzgty.ASYMMETRIC_PUBLIC;
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z4 && !z10) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzgor zzgorVarZzb = zzgou.zzb(cls2);
        zzgorVarZzb.zzc(this.zzc);
        for (int i11 = 0; i11 < this.zzb.size(); i11++) {
            zzguk zzgukVarZzd = this.zza.zzd(i11);
            if (zzgukVarZzd.zzk() == 3) {
                zzggd zzggdVar = (zzggd) this.zzb.get(i11);
                if (zzggdVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i11 + " and type_url " + zzgukVarZzd.zzb().zzg() + " failed, unable to get primitive");
                }
                zzgfw zzgfwVarZza = zzggdVar.zza();
                try {
                    Object objZzb = zzgmnVar.zzb(zzgfwVarZza, cls2);
                    if (zzgukVarZzd.zza() == this.zza.zzb()) {
                        zzgorVarZzb.zzb(objZzb, zzgfwVarZza, zzgukVarZzd);
                    } else {
                        zzgorVarZzb.zza(objZzb, zzgfwVarZza, zzgukVarZzd);
                    }
                } catch (GeneralSecurityException e) {
                    throw new GeneralSecurityException(v.k("Unable to get primitive ", cls2.toString(), " for key of type ", zzgukVarZzd.zzb().zzg(), ", see https://developers.google.com/tink/faq/registration_errors"), e);
                }
            }
        }
        return zzgmnVar.zzc(zzgorVarZzb.zzd(), cls);
    }

    private static List zzg(zzgum zzgumVar) {
        zzgfy zzgfyVar;
        ArrayList arrayList = new ArrayList(zzgumVar.zza());
        for (zzguk zzgukVar : zzgumVar.zzh()) {
            int iZza = zzgukVar.zza();
            try {
                zzgow zzgowVarZza = zzgow.zza(zzgukVar.zzb().zzg(), zzgukVar.zzb().zzf(), zzgukVar.zzb().zzb(), zzgukVar.zzf(), zzgukVar.zzf() == zzgve.RAW ? null : Integer.valueOf(zzgukVar.zza()));
                zzgnz zzgnzVarZzc = zzgnz.zzc();
                zzggn zzggnVarZza = zzggn.zza();
                zzgfw zzgmzVar = !zzgnzVarZzc.zzj(zzgowVarZza) ? new zzgmz(zzgowVarZza, zzggnVarZza) : zzgnzVarZzc.zza(zzgowVarZza, zzggnVarZza);
                int iZzk = zzgukVar.zzk() - 2;
                if (iZzk == 1) {
                    zzgfyVar = zzgfy.zza;
                } else if (iZzk == 2) {
                    zzgfyVar = zzgfy.zzb;
                } else {
                    if (iZzk != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zzgfyVar = zzgfy.zzc;
                }
                arrayList.add(new zzggd(zzgmzVar, zzgfyVar, iZza, iZza == zzgumVar.zzb(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzh(zzgum zzgumVar) throws GeneralSecurityException {
        if (zzgumVar == null || zzgumVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        int i = zzggq.zza;
        zzgun zzgunVarZza = zzgur.zza();
        zzgum zzgumVar = this.zza;
        zzgunVarZza.zzb(zzgumVar.zzb());
        for (zzguk zzgukVar : zzgumVar.zzh()) {
            zzguo zzguoVarZza = zzgup.zza();
            zzguoVarZza.zzc(zzgukVar.zzb().zzg());
            zzguoVarZza.zzd(zzgukVar.zzk());
            zzguoVarZza.zzb(zzgukVar.zzf());
            zzguoVarZza.zza(zzgukVar.zza());
            zzgunVarZza.zza((zzgup) zzguoVarZza.zzbr());
        }
        return ((zzgur) zzgunVarZza.zzbr()).toString();
    }

    public final zzgum zzc() {
        return this.zza;
    }

    public final Object zzd(zzgfq zzgfqVar, Class cls) throws GeneralSecurityException {
        zzgmn zzgmnVar = (zzgmn) zzgfqVar;
        Class clsZza = zzgmnVar.zza(cls);
        if (clsZza != null) {
            return zzf(zzgmnVar, cls, clsZza);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    private zzggf(zzgum zzgumVar, List list) {
        this.zza = zzgumVar;
        this.zzb = list;
        this.zzc = zzgnd.zza;
    }
}
