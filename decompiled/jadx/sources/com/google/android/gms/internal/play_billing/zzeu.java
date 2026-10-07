package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeu {
    static final zzeu zza = new zzeu(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzeu zzd;
    private final Map zze;

    public zzeu() {
        this.zze = new HashMap();
    }

    public static zzeu zza() {
        zzeu zzeuVar = zzd;
        if (zzeuVar != null) {
            return zzeuVar;
        }
        synchronized (zzeu.class) {
            try {
                zzeu zzeuVar2 = zzd;
                if (zzeuVar2 != null) {
                    return zzeuVar2;
                }
                int i = zzgs.zza;
                zzeu zzeuVarZzb = zzfc.zzb(zzeu.class);
                zzd = zzeuVarZzb;
                return zzeuVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzfh zzb(zzgl zzglVar, int i) {
        return (zzfh) this.zze.get(new zzet(zzglVar, i));
    }

    public zzeu(boolean z4) {
        this.zze = Collections.EMPTY_MAP;
    }
}
