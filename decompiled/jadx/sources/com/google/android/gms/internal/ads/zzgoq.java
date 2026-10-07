package com.google.android.gms.internal.ads;

import da.v;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgoq {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgoq(zzgon zzgonVar, zzgop zzgopVar) {
        this.zza = new HashMap(zzgonVar.zza);
        this.zzb = new HashMap(zzgonVar.zzb);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzgov) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException(v.i("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object zzb(zzgfw zzgfwVar, Class cls) throws GeneralSecurityException {
        zzgoo zzgooVar = new zzgoo(zzgfwVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgooVar)) {
            return ((zzgom) this.zza.get(zzgooVar)).zza(zzgfwVar);
        }
        throw new GeneralSecurityException(v.i("No PrimitiveConstructor for ", zzgooVar.toString(), " available"));
    }

    public final Object zzc(zzgou zzgouVar, Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzgov zzgovVar = (zzgov) this.zzb.get(cls);
        if (zzgouVar.zzd().equals(zzgovVar.zza()) && zzgovVar.zza().equals(zzgouVar.zzd())) {
            return zzgovVar.zzc(zzgouVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
