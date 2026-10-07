package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgmo {
    private static final Logger zza = Logger.getLogger(zzgmo.class.getName());
    private static final zzgmo zzb = new zzgmo();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    public static zzgmo zzc() {
        return zzb;
    }

    private final synchronized zzgfx zzg(String str) throws GeneralSecurityException {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzgfx) this.zzc.get(str);
    }

    private final synchronized void zzh(zzgfx zzgfxVar, boolean z4, boolean z10) throws GeneralSecurityException {
        try {
            String str = ((zzgmx) zzgfxVar).zza;
            if (this.zzd.containsKey(str) && !((Boolean) this.zzd.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            zzgfx zzgfxVar2 = (zzgfx) this.zzc.get(str);
            if (zzgfxVar2 != null && !zzgfxVar2.getClass().equals(zzgfxVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + zzgfxVar2.getClass().getName() + ", cannot be re-registered with " + zzgfxVar.getClass().getName());
            }
            this.zzc.putIfAbsent(str, zzgfxVar);
            this.zzd.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzgfx zza(String str, Class cls) throws GeneralSecurityException {
        zzgfx zzgfxVarZzg = zzg(str);
        if (zzgfxVarZzg.zzb().equals(cls)) {
            return zzgfxVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzgfxVarZzg.getClass());
        String string = zzgfxVarZzg.zzb().toString();
        StringBuilder sbE = b.e("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbE.append(string);
        throw new GeneralSecurityException(sbE.toString());
    }

    public final zzgfx zzb(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final synchronized void zzd(zzgfx zzgfxVar, boolean z4) throws GeneralSecurityException {
        zzf(zzgfxVar, 1, true);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzd.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzgfx zzgfxVar, int i, boolean z4) throws GeneralSecurityException {
        if (!zzgmh.zza(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzgfxVar, false, true);
    }
}
