package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbnz {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzboi zzc;
    private zzboi zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzboi zza(Context context, i6.a aVar, zzfko zzfkoVar) {
        zzboi zzboiVar;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = new zzboi(zzc(context), aVar, (String) t.f3437d.f3440c.zza(zzbcn.zza), zzfkoVar);
                }
                zzboiVar = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzboiVar;
    }

    public final zzboi zzb(Context context, i6.a aVar, zzfko zzfkoVar) {
        zzboi zzboiVar;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    this.zzd = new zzboi(zzc(context), aVar, (String) zzbex.zza.zze(), zzfkoVar);
                }
                zzboiVar = this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzboiVar;
    }
}
