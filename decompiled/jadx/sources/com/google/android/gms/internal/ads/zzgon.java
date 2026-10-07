package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgon {
    private final Map zza;
    private final Map zzb;

    private zzgon() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgon zza(zzgom zzgomVar) throws GeneralSecurityException {
        if (zzgomVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzgoo zzgooVar = new zzgoo(zzgomVar.zzc(), zzgomVar.zzd(), null);
        if (!this.zza.containsKey(zzgooVar)) {
            this.zza.put(zzgooVar, zzgomVar);
            return this;
        }
        zzgom zzgomVar2 = (zzgom) this.zza.get(zzgooVar);
        if (zzgomVar2.equals(zzgomVar) && zzgomVar.equals(zzgomVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgooVar.toString()));
    }

    public final zzgon zzb(zzgov zzgovVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZzb = zzgovVar.zzb();
        if (!map.containsKey(clsZzb)) {
            this.zzb.put(clsZzb, zzgovVar);
            return this;
        }
        zzgov zzgovVar2 = (zzgov) this.zzb.get(clsZzb);
        if (zzgovVar2.equals(zzgovVar) && zzgovVar.equals(zzgovVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
    }

    public /* synthetic */ zzgon(zzgop zzgopVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzgon(zzgoq zzgoqVar, zzgop zzgopVar) {
        this.zza = new HashMap(zzgoqVar.zza);
        this.zzb = new HashMap(zzgoqVar.zzb);
    }
}
