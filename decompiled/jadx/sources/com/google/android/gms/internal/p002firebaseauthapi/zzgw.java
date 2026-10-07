package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgw {
    private String zza;
    private zzgx zzb;
    private zzcx zzc;

    private zzgw() {
    }

    public final zzgw zza(zzcx zzcxVar) {
        this.zzc = zzcxVar;
        return this;
    }

    public final zzgw zzb(zzgx zzgxVar) {
        this.zzb = zzgxVar;
        return this;
    }

    public final zzgw zzc(String str) {
        this.zza = str;
        return this;
    }

    public final zzgz zzd() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzgx zzgxVar = this.zzb;
        if (zzgxVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzcx zzcxVar = this.zzc;
        if (zzcxVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzcxVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must note have ID Requirements");
        }
        if ((zzgxVar.equals(zzgx.zza) && (zzcxVar instanceof zzey)) || ((zzgxVar.equals(zzgx.zzc) && (zzcxVar instanceof zzga)) || ((zzgxVar.equals(zzgx.zzb) && (zzcxVar instanceof zzhr)) || ((zzgxVar.equals(zzgx.zzd) && (zzcxVar instanceof zzdn)) || ((zzgxVar.equals(zzgx.zze) && (zzcxVar instanceof zzeh)) || (zzgxVar.equals(zzgx.zzf) && (zzcxVar instanceof zzfp))))))) {
            return new zzgz(this.zza, this.zzb, this.zzc, null);
        }
        throw new GeneralSecurityException(v.k("Cannot use parsing strategy ", this.zzb.toString(), " when new keys are picked according to ", String.valueOf(this.zzc), "."));
    }

    public /* synthetic */ zzgw(zzgv zzgvVar) {
    }
}
