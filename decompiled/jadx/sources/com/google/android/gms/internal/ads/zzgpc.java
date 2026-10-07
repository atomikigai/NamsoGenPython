package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgpc {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgpc() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgpc zza(zzgms zzgmsVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgmsVar.zzd(), zzgmsVar.zzc(), null);
        if (!this.zzb.containsKey(zzgpdVar)) {
            this.zzb.put(zzgpdVar, zzgmsVar);
            return this;
        }
        zzgms zzgmsVar2 = (zzgms) this.zzb.get(zzgpdVar);
        if (zzgmsVar2.equals(zzgmsVar) && zzgmsVar.equals(zzgmsVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgpdVar.toString()));
    }

    public final zzgpc zzb(zzgmw zzgmwVar) throws GeneralSecurityException {
        zzgpe zzgpeVar = new zzgpe(zzgmwVar.zzc(), zzgmwVar.zzd(), null);
        if (!this.zza.containsKey(zzgpeVar)) {
            this.zza.put(zzgpeVar, zzgmwVar);
            return this;
        }
        zzgmw zzgmwVar2 = (zzgmw) this.zza.get(zzgpeVar);
        if (zzgmwVar2.equals(zzgmwVar) && zzgmwVar.equals(zzgmwVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgpeVar.toString()));
    }

    public final zzgpc zzc(zzgoe zzgoeVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgoeVar.zzd(), zzgoeVar.zzc(), null);
        if (!this.zzd.containsKey(zzgpdVar)) {
            this.zzd.put(zzgpdVar, zzgoeVar);
            return this;
        }
        zzgoe zzgoeVar2 = (zzgoe) this.zzd.get(zzgpdVar);
        if (zzgoeVar2.equals(zzgoeVar) && zzgoeVar.equals(zzgoeVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgpdVar.toString()));
    }

    public final zzgpc zzd(zzgoi zzgoiVar) throws GeneralSecurityException {
        zzgpe zzgpeVar = new zzgpe(zzgoiVar.zzc(), zzgoiVar.zzd(), null);
        if (!this.zzc.containsKey(zzgpeVar)) {
            this.zzc.put(zzgpeVar, zzgoiVar);
            return this;
        }
        zzgoi zzgoiVar2 = (zzgoi) this.zzc.get(zzgpeVar);
        if (zzgoiVar2.equals(zzgoiVar) && zzgoiVar.equals(zzgoiVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgpeVar.toString()));
    }

    public zzgpc(zzgpg zzgpgVar) {
        this.zza = new HashMap(zzgpgVar.zza);
        this.zzb = new HashMap(zzgpgVar.zzb);
        this.zzc = new HashMap(zzgpgVar.zzc);
        this.zzd = new HashMap(zzgpgVar.zzd);
    }
}
