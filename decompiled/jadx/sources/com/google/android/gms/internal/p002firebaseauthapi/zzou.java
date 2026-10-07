package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzou {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzou() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzou zza(zzna zznaVar) throws GeneralSecurityException {
        zzow zzowVar = new zzow(zznaVar.zzd(), zznaVar.zzc(), null);
        if (!this.zzb.containsKey(zzowVar)) {
            this.zzb.put(zzowVar, zznaVar);
            return this;
        }
        zzna zznaVar2 = (zzna) this.zzb.get(zzowVar);
        if (zznaVar2.equals(zznaVar) && zznaVar.equals(zznaVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzowVar.toString()));
    }

    public final zzou zzb(zzne zzneVar) throws GeneralSecurityException {
        zzoy zzoyVar = new zzoy(zzneVar.zzb(), zzneVar.zzc(), null);
        if (!this.zza.containsKey(zzoyVar)) {
            this.zza.put(zzoyVar, zzneVar);
            return this;
        }
        zzne zzneVar2 = (zzne) this.zza.get(zzoyVar);
        if (zzneVar2.equals(zzneVar) && zzneVar.equals(zzneVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzoyVar.toString()));
    }

    public final zzou zzc(zznx zznxVar) throws GeneralSecurityException {
        zzow zzowVar = new zzow(zznxVar.zzd(), zznxVar.zzc(), null);
        if (!this.zzd.containsKey(zzowVar)) {
            this.zzd.put(zzowVar, zznxVar);
            return this;
        }
        zznx zznxVar2 = (zznx) this.zzd.get(zzowVar);
        if (zznxVar2.equals(zznxVar) && zznxVar.equals(zznxVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzowVar.toString()));
    }

    public final zzou zzd(zzob zzobVar) throws GeneralSecurityException {
        zzoy zzoyVar = new zzoy(zzobVar.zzc(), zzobVar.zzd(), null);
        if (!this.zzc.containsKey(zzoyVar)) {
            this.zzc.put(zzoyVar, zzobVar);
            return this;
        }
        zzob zzobVar2 = (zzob) this.zzc.get(zzoyVar);
        if (zzobVar2.equals(zzobVar) && zzobVar.equals(zzobVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzoyVar.toString()));
    }

    public zzou(zzpa zzpaVar) {
        this.zza = new HashMap(zzpaVar.zza);
        this.zzb = new HashMap(zzpaVar.zzb);
        this.zzc = new HashMap(zzpaVar.zzc);
        this.zzd = new HashMap(zzpaVar.zzd);
    }
}
