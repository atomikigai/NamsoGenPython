package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgjm {
    private zzgjo zza;
    private String zzb;
    private zzgjn zzc;
    private zzggt zzd;

    private zzgjm() {
        throw null;
    }

    public final zzgjm zza(zzggt zzggtVar) {
        this.zzd = zzggtVar;
        return this;
    }

    public final zzgjm zzb(zzgjn zzgjnVar) {
        this.zzc = zzgjnVar;
        return this;
    }

    public final zzgjm zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzgjm zzd(zzgjo zzgjoVar) {
        this.zza = zzgjoVar;
        return this;
    }

    public final zzgjq zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzgjo.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzgjn zzgjnVar = this.zzc;
        if (zzgjnVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzggt zzggtVar = this.zzd;
        if (zzggtVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzggtVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzgjnVar.equals(zzgjn.zza) && (zzggtVar instanceof zzgie)) || ((zzgjnVar.equals(zzgjn.zzc) && (zzggtVar instanceof zzgiv)) || ((zzgjnVar.equals(zzgjn.zzb) && (zzggtVar instanceof zzgkm)) || ((zzgjnVar.equals(zzgjn.zzd) && (zzggtVar instanceof zzghj)) || ((zzgjnVar.equals(zzgjn.zze) && (zzggtVar instanceof zzght)) || (zzgjnVar.equals(zzgjn.zzf) && (zzggtVar instanceof zzgip))))))) {
            return new zzgjq(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        throw new GeneralSecurityException(v.k("Cannot use parsing strategy ", this.zzc.toString(), " when new keys are picked according to ", String.valueOf(this.zzd), "."));
    }

    public /* synthetic */ zzgjm(zzgjp zzgjpVar) {
    }
}
