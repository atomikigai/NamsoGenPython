package com.google.android.gms.internal.ads;

import da.v;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzgdf extends zzgdy implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    m9.a zza;
    Object zzb;

    public zzgdf(m9.a aVar, Object obj) {
        aVar.getClass();
        this.zza = aVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m9.a aVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (aVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (aVar.isCancelled()) {
            zzs(aVar);
            return;
        }
        try {
            try {
                Object objZze = zze(obj, zzgei.zzp(aVar));
                this.zzb = null;
                zzf(objZze);
            } catch (Throwable th) {
                try {
                    zzgez.zza(th);
                    zzd(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzd(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e4) {
            zzd(e4.getCause());
        } catch (Exception e10) {
            zzd(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final String zza() {
        m9.a aVar = this.zza;
        Object obj = this.zzb;
        String strZza = super.zza();
        String strI = aVar != null ? v.i("inputFuture=[", aVar.toString(), "], ") : "";
        if (obj != null) {
            return v.v(strI, "function=[", obj.toString(), "]");
        }
        if (strZza != null) {
            return strI.concat(strZza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zze(Object obj, Object obj2) throws Exception;

    public abstract void zzf(Object obj);
}
