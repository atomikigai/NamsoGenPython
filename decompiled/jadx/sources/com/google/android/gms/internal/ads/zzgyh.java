package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgyh {
    static final zzgyh zza = new zzgyh(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgyh zzd;
    private final Map zze;

    public zzgyh() {
        this.zze = new HashMap();
    }

    public static zzgyh zza() {
        int i = zzhas.zza;
        return zza;
    }

    public static zzgyh zzb() {
        zzgyh zzgyhVar = zzd;
        if (zzgyhVar != null) {
            return zzgyhVar;
        }
        synchronized (zzgyh.class) {
            try {
                zzgyh zzgyhVar2 = zzd;
                if (zzgyhVar2 != null) {
                    return zzgyhVar2;
                }
                int i = zzhas.zza;
                zzgyh zzgyhVarZzb = zzgyp.zzb(zzgyh.class);
                zzd = zzgyhVarZzb;
                return zzgyhVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzgyv zzc(zzhai zzhaiVar, int i) {
        return (zzgyv) this.zze.get(new zzgyg(zzhaiVar, i));
    }

    public zzgyh(boolean z4) {
        this.zze = Collections.EMPTY_MAP;
    }
}
