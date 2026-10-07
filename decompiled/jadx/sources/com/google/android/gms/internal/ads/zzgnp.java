package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgnp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgno zzb = new zzgno() { // from class: com.google.android.gms.internal.ads.zzgnn
        @Override // com.google.android.gms.internal.ads.zzgno
        public final zzgfw zza(zzggj zzggjVar, Integer num) throws GeneralSecurityException {
            int i = zzgnp.zza;
            zzgue zzgueVarZzc = ((zzgna) zzggjVar).zzb().zzc();
            zzgfx zzgfxVarZzb = zzgmo.zzc().zzb(zzgueVarZzc.zzi());
            if (!zzgmo.zzc().zze(zzgueVarZzc.zzi())) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            zzgua zzguaVarZza = zzgfxVarZzb.zza(zzgueVarZzc.zzh());
            return new zzgmz(zzgow.zza(zzguaVarZza.zzg(), zzguaVarZza.zzf(), zzguaVarZza.zzb(), zzgueVarZzc.zzg(), num), zzgfv.zza());
        }
    };
    private static final zzgnp zzc = zze();
    private final Map zzd = new HashMap();

    public static zzgnp zzb() {
        return zzc;
    }

    private final synchronized zzgfw zzd(zzggj zzggjVar, Integer num) throws GeneralSecurityException {
        zzgno zzgnoVar;
        zzgnoVar = (zzgno) this.zzd.get(zzggjVar.getClass());
        if (zzgnoVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + zzggjVar.toString() + ": no key creator for this class was registered.");
        }
        return zzgnoVar.zza(zzggjVar, num);
    }

    private static zzgnp zze() {
        zzgnp zzgnpVar = new zzgnp();
        try {
            zzgnpVar.zzc(zzb, zzgna.class);
            return zzgnpVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final zzgfw zza(zzggj zzggjVar, Integer num) throws GeneralSecurityException {
        return zzd(zzggjVar, num);
    }

    public final synchronized void zzc(zzgno zzgnoVar, Class cls) throws GeneralSecurityException {
        try {
            zzgno zzgnoVar2 = (zzgno) this.zzd.get(cls);
            if (zzgnoVar2 != null && !zzgnoVar2.equals(zzgnoVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.zzd.put(cls, zzgnoVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
