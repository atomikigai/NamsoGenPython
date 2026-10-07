package com.google.android.gms.internal.ads;

import e6.s;
import e6.t;
import i6.h;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzbip implements zzbjr {
    public final /* synthetic */ zzdel zza;
    public final /* synthetic */ zzcnb zzb;

    public /* synthetic */ zzbip(zzdel zzdelVar, zzcnb zzcnbVar) {
        this.zza = zzdelVar;
        this.zzb = zzcnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        zzbjq.zzc(map, this.zza);
        final String str = (String) map.get("u");
        if (str == null) {
            h.g("URL missing from click GMSG.");
            return;
        }
        final zzcnb zzcnbVar = this.zzb;
        zzgdz zzgdzVarZzu = zzgdz.zzu(zzbjq.zza(zzcfkVar, str));
        zzgdp zzgdpVar = new zzgdp() { // from class: com.google.android.gms.internal.ads.zzbir
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj2) {
                zzcnb zzcnbVar2;
                String str2 = (String) obj2;
                zzbjr zzbjrVar = zzbjq.zza;
                return (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjI)).booleanValue() && (zzcnbVar2 = zzcnbVar) != null && zzcnb.zzj(str)) ? zzcnbVar2.zzb(str2, s.f3427f.e) : zzgei.zzh(str2);
            }
        };
        zzges zzgesVar = zzcaj.zza;
        zzgei.zzr((zzgdz) zzgei.zzn(zzgdzVarZzu, zzgdpVar, zzgesVar), new zzbjf(zzcfkVar), zzgesVar);
    }
}
