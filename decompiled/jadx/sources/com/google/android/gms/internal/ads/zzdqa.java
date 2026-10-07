package com.google.android.gms.internal.ads;

import e6.t;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdqa {
    private final Map zza = new HashMap();

    public final synchronized zzdpz zza(String str) {
        return (zzdpz) this.zza.get(str);
    }

    public final String zzb(String str) {
        zzbru zzbruVar;
        zzdpz zzdpzVarZza = zza(str);
        return (zzdpzVarZza == null || (zzbruVar = zzdpzVarZza.zzb) == null) ? "" : zzbruVar.toString();
    }

    public final synchronized void zzc(String str, zzfgm zzfgmVar) {
        zzbru zzbruVarZze;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbru zzbruVarZzf = null;
        if (zzfgmVar == null) {
            zzbruVarZze = null;
        } else {
            try {
                zzbruVarZze = zzfgmVar.zze();
            } catch (zzffv unused) {
                zzbruVarZze = null;
            }
        }
        if (zzfgmVar != null) {
            try {
                zzbruVarZzf = zzfgmVar.zzf();
            } catch (zzffv unused2) {
            }
        }
        boolean z4 = true;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziW)).booleanValue()) {
            if (zzfgmVar == null) {
                z4 = false;
            } else {
                try {
                    zzfgmVar.zzC();
                } catch (zzffv unused3) {
                    z4 = false;
                }
            }
        }
        this.zza.put(str, new zzdpz(str, zzbruVarZze, zzbruVarZzf, z4));
    }

    public final synchronized void zzd(String str, zzbrf zzbrfVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdpz(str, zzbrfVar.zzf(), zzbrfVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
