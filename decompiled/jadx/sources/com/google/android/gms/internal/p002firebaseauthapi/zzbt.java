package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbt {
    private static final Logger zza = Logger.getLogger(zzbt.class.getName());
    private final ConcurrentMap zzb;

    public zzbt() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzbs zzf(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzbs) this.zzb.get(str);
    }

    private final synchronized void zzg(zzbs zzbsVar, boolean z4) throws GeneralSecurityException {
        try {
            String strZzc = zzbsVar.zzb().zzc();
            zzbs zzbsVar2 = (zzbs) this.zzb.get(strZzc);
            if (zzbsVar2 != null && !zzbsVar2.zzc().equals(zzbsVar.zzc())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(strZzc));
                throw new GeneralSecurityException("typeUrl (" + strZzc + ") is already registered with " + zzbsVar2.zzc().getName() + ", cannot be re-registered with " + zzbsVar.zzc().getName());
            }
            if (z4) {
                this.zzb.put(strZzc, zzbsVar);
            } else {
                this.zzb.putIfAbsent(strZzc, zzbsVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzbo zza(String str, Class cls) throws GeneralSecurityException {
        zzbs zzbsVarZzf = zzf(str);
        if (zzbsVarZzf.zze().contains(cls)) {
            return zzbsVarZzf.zza(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzbsVarZzf.zzc());
        Set<Class> setZze = zzbsVarZzf.zze();
        StringBuilder sb2 = new StringBuilder();
        boolean z4 = true;
        for (Class cls2 : setZze) {
            if (!z4) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z4 = false;
        }
        String string = sb2.toString();
        StringBuilder sbE = b.e("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", supported primitives: ");
        sbE.append(string);
        throw new GeneralSecurityException(sbE.toString());
    }

    public final zzbo zzb(String str) throws GeneralSecurityException {
        return zzf(str).zzb();
    }

    public final synchronized void zzc(zzon zzonVar, zzng zzngVar) throws GeneralSecurityException {
        Class clsZzd;
        try {
            if (!zzij.zza(1)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzonVar.getClass()) + " as it is not FIPS compatible.");
            }
            if (!zzij.zza(zzngVar.zzf())) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzngVar.getClass()) + " as it is not FIPS compatible.");
            }
            String strZzd = zzonVar.zzd();
            String strZzd2 = zzngVar.zzd();
            if (this.zzb.containsKey(strZzd) && ((zzbs) this.zzb.get(strZzd)).zzd() != null && (clsZzd = ((zzbs) this.zzb.get(strZzd)).zzd()) != null) {
                if (!clsZzd.getName().equals(zzngVar.getClass().getName())) {
                    zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + strZzd + " with inconsistent public key type " + strZzd2);
                    throw new GeneralSecurityException("public key manager corresponding to " + zzonVar.getClass().getName() + " is already registered with " + clsZzd.getName() + ", cannot be re-registered with " + zzngVar.getClass().getName());
                }
            }
            zzg(new zzbr(zzonVar, zzngVar), true);
            zzg(new zzbq(zzngVar), false);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(zzng zzngVar) throws GeneralSecurityException {
        if (!zzij.zza(zzngVar.zzf())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzngVar.getClass()) + " as it is not FIPS compatible.");
        }
        zzg(new zzbq(zzngVar), false);
    }

    public final boolean zze(String str) {
        return this.zzb.containsKey(str);
    }

    public zzbt(zzbt zzbtVar) {
        this.zzb = new ConcurrentHashMap(zzbtVar.zzb);
    }
}
