package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgef implements Runnable {
    final Future zza;
    final zzgee zzb;

    public zzgef(Future future, zzgee zzgeeVar) {
        this.zza = future;
        this.zzb = zzgeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Object obj = this.zza;
        if ((obj instanceof zzgfk) && (thZza = zzgfl.zza((zzgfk) obj)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzgei.zzp(this.zza));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzfwk zzfwkVarZza = zzfwm.zza(this);
        zzfwkVarZza.zza(this.zzb);
        return zzfwkVarZza.toString();
    }
}
