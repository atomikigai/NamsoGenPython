package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzl extends zzd {
    public zzl() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void zza(zzm zzmVar, zzm zzmVar2) {
        zzmVar.zzc = zzmVar2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void zzb(zzm zzmVar, Thread thread) {
        zzmVar.zzb = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean zzc(zzo zzoVar, zzh zzhVar, zzh zzhVar2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.zzd != zzhVar) {
                    return false;
                }
                zzoVar.zzd = zzhVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean zzd(zzo zzoVar, Object obj, Object obj2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.zzc != obj) {
                    return false;
                }
                zzoVar.zzc = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean zze(zzo zzoVar, zzm zzmVar, zzm zzmVar2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.zze != zzmVar) {
                    return false;
                }
                zzoVar.zze = zzmVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
