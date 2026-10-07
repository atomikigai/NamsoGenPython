package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaxp extends zzaxt {
    public zzaxp(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10) {
        super(zzawfVar, "88ETcPLh1JYg+nQ5zdwp+6acsWFKzCMthjLOw7XatJOMkLvYw0fl0jJT3ig1Ktkw", "AW0WUdAlySbPNJG5w1IgQqYKXV7WN2hB/EQpNB2ZwfA=", zzasfVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzag(3);
        boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (this.zzd) {
            try {
                if (zBooleanValue) {
                    this.zzd.zzag(2);
                } else {
                    this.zzd.zzag(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
