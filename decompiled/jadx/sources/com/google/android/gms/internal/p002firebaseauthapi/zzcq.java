package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcq {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzcq.class.getName());
    private static final AtomicReference zzc = new AtomicReference(new zzbt());
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzcq() {
    }

    @Deprecated
    public static zzbo zza(String str) throws GeneralSecurityException {
        return ((zzbt) zzc.get()).zzb(str);
    }

    public static synchronized zzwi zzb(zzwn zzwnVar) throws GeneralSecurityException {
        zzbo zzboVarZzb;
        zzboVarZzb = ((zzbt) zzc.get()).zzb(zzwnVar.zzg());
        if (!((Boolean) zze.get(zzwnVar.zzg())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzwnVar.zzg())));
        }
        return zzboVarZzb.zza(zzwnVar.zzf());
    }

    public static Class zzc(Class cls) {
        try {
            return zznq.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzd(zzwi zzwiVar, Class cls) throws GeneralSecurityException {
        return zze(zzwiVar.zzf(), zzwiVar.zze(), cls);
    }

    public static Object zze(String str, zzajf zzajfVar, Class cls) throws GeneralSecurityException {
        return ((zzbt) zzc.get()).zza(str, cls).zzb(zzajfVar);
    }

    public static synchronized void zzf(zzon zzonVar, zzng zzngVar, boolean z4) throws GeneralSecurityException {
        try {
            AtomicReference atomicReference = zzc;
            zzbt zzbtVar = new zzbt((zzbt) atomicReference.get());
            zzbtVar.zzc(zzonVar, zzngVar);
            Map mapZzc = zzonVar.zza().zzc();
            String strZzd = zzonVar.zzd();
            zzi(strZzd, mapZzc, true);
            String strZzd2 = zzngVar.zzd();
            zzi(strZzd2, Collections.EMPTY_MAP, false);
            if (!((zzbt) atomicReference.get()).zze(strZzd)) {
                zzd.put(strZzd, new zzcp(zzonVar));
                zzj(zzonVar.zza().zzc());
            }
            ConcurrentMap concurrentMap = zze;
            concurrentMap.put(strZzd, Boolean.TRUE);
            concurrentMap.put(strZzd2, Boolean.FALSE);
            atomicReference.set(zzbtVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void zzg(zzng zzngVar, boolean z4) throws GeneralSecurityException {
        try {
            AtomicReference atomicReference = zzc;
            zzbt zzbtVar = new zzbt((zzbt) atomicReference.get());
            zzbtVar.zzd(zzngVar);
            Map mapZzc = zzngVar.zza().zzc();
            String strZzd = zzngVar.zzd();
            zzi(strZzd, mapZzc, true);
            if (!((zzbt) atomicReference.get()).zze(strZzd)) {
                zzd.put(strZzd, new zzcp(zzngVar));
                zzj(zzngVar.zza().zzc());
            }
            zze.put(strZzd, Boolean.TRUE);
            atomicReference.set(zzbtVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void zzh(zzcm zzcmVar) throws GeneralSecurityException {
        zznq.zza().zzf(zzcmVar);
    }

    private static synchronized void zzi(String str, Map map, boolean z4) throws GeneralSecurityException {
        if (z4) {
            try {
                ConcurrentMap concurrentMap = zze;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((zzbt) zzc.get()).zze(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!zzg.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (zzg.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void zzj(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzg.put((String) entry.getKey(), (zzce) entry.getValue());
        }
    }
}
