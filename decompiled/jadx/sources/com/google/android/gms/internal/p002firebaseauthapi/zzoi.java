package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzoi {
    private final Map zza;
    private final Map zzb;

    private zzoi() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzoi zza(zzof zzofVar) throws GeneralSecurityException {
        zzok zzokVar = new zzok(zzofVar.zzc(), zzofVar.zzd(), null);
        if (!this.zza.containsKey(zzokVar)) {
            this.zza.put(zzokVar, zzofVar);
            return this;
        }
        zzof zzofVar2 = (zzof) this.zza.get(zzokVar);
        if (zzofVar2.equals(zzofVar) && zzofVar.equals(zzofVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzokVar.toString()));
    }

    public final zzoi zzb(zzcm zzcmVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZzb = zzcmVar.zzb();
        if (!map.containsKey(clsZzb)) {
            this.zzb.put(clsZzb, zzcmVar);
            return this;
        }
        zzcm zzcmVar2 = (zzcm) this.zzb.get(clsZzb);
        if (zzcmVar2.equals(zzcmVar) && zzcmVar.equals(zzcmVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
    }

    public /* synthetic */ zzoi(zzoh zzohVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzoi(zzom zzomVar, zzoh zzohVar) {
        this.zza = new HashMap(zzomVar.zza);
        this.zzb = new HashMap(zzomVar.zzb);
    }
}
