package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkn {
    static final zzkn zza = new zzkn(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzkn zzd;
    private final Map zze;

    public zzkn() {
        this.zze = new HashMap();
    }

    public static zzkn zza() {
        zzkn zzknVar = zzd;
        if (zzknVar != null) {
            return zzknVar;
        }
        synchronized (zzkn.class) {
            try {
                zzkn zzknVar2 = zzd;
                if (zzknVar2 != null) {
                    return zzknVar2;
                }
                zzkn zzknVarZzb = zzkv.zzb(zzkn.class);
                zzd = zzknVarZzb;
                return zzknVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzkz zzb(zzmi zzmiVar, int i) {
        return (zzkz) this.zze.get(new zzkm(zzmiVar, i));
    }

    public zzkn(boolean z4) {
        this.zze = Collections.EMPTY_MAP;
    }
}
