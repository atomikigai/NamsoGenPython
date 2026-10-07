package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbz {
    private final zzws zza;

    private zzbz(zzws zzwsVar) {
        this.zza = zzwsVar;
    }

    public static zzbz zze() {
        return new zzbz(zzwv.zzc());
    }

    public static zzbz zzf(zzby zzbyVar) {
        return new zzbz((zzws) zzbyVar.zzc().zzu());
    }

    private final synchronized int zzg() {
        int iZza;
        iZza = zzpd.zza();
        while (zzj(iZza)) {
            iZza = zzpd.zza();
        }
        return iZza;
    }

    private final synchronized zzwu zzh(zzwi zzwiVar, zzxo zzxoVar) throws GeneralSecurityException {
        zzwt zzwtVarZzc;
        int iZzg = zzg();
        if (zzxoVar == zzxo.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        zzwtVarZzc = zzwu.zzc();
        zzwtVarZzc.zza(zzwiVar);
        zzwtVarZzc.zzb(iZzg);
        zzwtVarZzc.zzd(3);
        zzwtVarZzc.zzc(zzxoVar);
        return (zzwu) zzwtVarZzc.zzi();
    }

    private final synchronized zzwu zzi(zzwn zzwnVar) throws GeneralSecurityException {
        return zzh(zzcq.zzb(zzwnVar), zzwnVar.zze());
    }

    private final synchronized boolean zzj(int i) {
        Iterator it = this.zza.zze().iterator();
        while (it.hasNext()) {
            if (((zzwu) it.next()).zza() == i) {
                return true;
            }
        }
        return false;
    }

    public final synchronized int zza(zzwn zzwnVar, boolean z4) throws GeneralSecurityException {
        zzwu zzwuVarZzi;
        zzws zzwsVar = this.zza;
        zzwuVarZzi = zzi(zzwnVar);
        zzwsVar.zzb(zzwuVarZzi);
        return zzwuVarZzi.zza();
    }

    public final synchronized zzby zzb() throws GeneralSecurityException {
        return zzby.zza((zzwv) this.zza.zzi());
    }

    public final synchronized zzbz zzc(zzbv zzbvVar) throws GeneralSecurityException {
        zza(zzbvVar.zzb(), false);
        return this;
    }

    public final synchronized zzbz zzd(int i) throws GeneralSecurityException {
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            zzwu zzwuVarZzd = this.zza.zzd(i10);
            if (zzwuVarZzd.zza() == i) {
                if (zzwuVarZzd.zzk() != 3) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
                }
                this.zza.zzc(i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}
