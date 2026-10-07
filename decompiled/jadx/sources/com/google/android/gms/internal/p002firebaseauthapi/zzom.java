package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzom {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzom(zzoi zzoiVar, zzol zzolVar) {
        this.zza = new HashMap(zzoiVar.zza);
        this.zzb = new HashMap(zzoiVar.zzb);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzcm) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException(v.i("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object zzb(zzbn zzbnVar, Class cls) throws GeneralSecurityException {
        zzok zzokVar = new zzok(zzbnVar.getClass(), cls, null);
        if (this.zza.containsKey(zzokVar)) {
            return ((zzof) this.zza.get(zzokVar)).zza(zzbnVar);
        }
        throw new GeneralSecurityException(v.i("No PrimitiveConstructor for ", zzokVar.toString(), " available"));
    }

    public final Object zzc(zzcl zzclVar, Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzcm zzcmVar = (zzcm) this.zzb.get(cls);
        if (zzclVar.zzc().equals(zzcmVar.zza()) && zzcmVar.zza().equals(zzclVar.zzc())) {
            return zzcmVar.zzc(zzclVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
