package com.google.android.gms.internal.ads;

import android.os.Bundle;
import e6.t;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeot implements zzevz {
    private final zzges zza;
    private final zzdqd zzb;
    private final zzdup zzc;
    private final zzeov zzd;

    public zzeot(zzges zzgesVar, zzdqd zzdqdVar, zzdup zzdupVar, zzeov zzeovVar) {
        this.zza = zzgesVar;
        this.zzb = zzdqdVar;
        this.zzc = zzdupVar;
        this.zzd = zzeovVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        zzbce zzbceVar = zzbcn.zzlo;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && this.zzd.zza() != null) {
            zzeou zzeouVarZza = this.zzd.zza();
            zzeouVarZza.getClass();
            return zzgei.zzh(zzeouVarZza);
        }
        if (zzfxf.zzd((String) tVar.f3440c.zza(zzbcn.zzbx)) || (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && (this.zzd.zzd() || !this.zzc.zzt()))) {
            return zzgei.zzh(new zzeou(new Bundle()));
        }
        this.zzd.zzc(true);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeos
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final zzeou zzc() throws Exception {
        List<String> listAsList = Arrays.asList(((String) t.f3437d.f3440c.zza(zzbcn.zzbx)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfgm zzfgmVarZzc = this.zzb.zzc(str, new JSONObject());
                zzfgmVarZzc.zzC();
                boolean zZzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlo)).booleanValue() || zZzt) {
                    try {
                        zzbru zzbruVarZzf = zzfgmVarZzc.zzf();
                        if (zzbruVarZzf != null) {
                            bundle2.putString("sdk_version", zzbruVarZzf.toString());
                        }
                    } catch (zzffv unused) {
                    }
                }
                try {
                    zzbru zzbruVarZze = zzfgmVarZzc.zze();
                    if (zzbruVarZze != null) {
                        bundle2.putString("adapter_version", zzbruVarZze.toString());
                    }
                } catch (zzffv unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzffv unused3) {
            }
        }
        zzeou zzeouVar = new zzeou(bundle);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlo)).booleanValue()) {
            this.zzd.zzb(zzeouVar);
        }
        return zzeouVar;
    }
}
