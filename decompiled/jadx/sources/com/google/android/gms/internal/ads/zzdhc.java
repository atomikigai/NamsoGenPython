package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdhc implements zzcrt {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhgp zzd;
    private final zzdjj zze;

    public zzdhc(Map map, Map map2, Map map3, zzhgp zzhgpVar, zzdjj zzdjjVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhgpVar;
        this.zze = zzdjjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final zzefb zza(int i, String str) {
        zzefb zzefbVarZza;
        zzefb zzefbVar = (zzefb) this.zza.get(str);
        if (zzefbVar != null) {
            return zzefbVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzehp zzehpVar = (zzehp) this.zzc.get(str);
            if (zzehpVar != null) {
                return new zzefc(zzehpVar, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzcrv
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        return new zzcry((List) obj);
                    }
                });
            }
            zzefbVarZza = (zzefb) this.zzb.get(str);
            if (zzefbVarZza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zzefbVarZza = ((zzcrt) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return new zzefc(zzefbVarZza, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzcrw
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return new zzcry((zzcrq) obj);
            }
        });
    }
}
