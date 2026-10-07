package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgnw {
    private static final zzgnw zza = new zzgnw();
    private final AtomicReference zzb = new AtomicReference(new zzgoq(new zzgon(null), null));

    public static zzgnw zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzgoq) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzgfw zzgfwVar, Class cls) throws GeneralSecurityException {
        return ((zzgoq) this.zzb.get()).zzb(zzgfwVar, cls);
    }

    public final Object zzd(zzgou zzgouVar, Class cls) throws GeneralSecurityException {
        return ((zzgoq) this.zzb.get()).zzc(zzgouVar, cls);
    }

    public final synchronized void zze(zzgom zzgomVar) throws GeneralSecurityException {
        zzgon zzgonVar = new zzgon((zzgoq) this.zzb.get(), null);
        zzgonVar.zza(zzgomVar);
        this.zzb.set(new zzgoq(zzgonVar, null));
    }

    public final synchronized void zzf(zzgov zzgovVar) throws GeneralSecurityException {
        zzgon zzgonVar = new zzgon((zzgoq) this.zzb.get(), null);
        zzgonVar.zzb(zzgovVar);
        this.zzb.set(new zzgoq(zzgonVar, null));
    }
}
