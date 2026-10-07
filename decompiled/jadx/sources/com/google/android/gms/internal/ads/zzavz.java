package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzavz implements zzfro {
    private final zzfpr zza;
    private final zzfqi zzb;
    private final zzawm zzc;
    private final zzavy zzd;
    private final zzavi zze;
    private final zzawo zzf;
    private final zzawg zzg;
    private final zzavx zzh;

    public zzavz(zzfpr zzfprVar, zzfqi zzfqiVar, zzawm zzawmVar, zzavy zzavyVar, zzavi zzaviVar, zzawo zzawoVar, zzawg zzawgVar, zzavx zzavxVar) {
        this.zza = zzfprVar;
        this.zzb = zzfqiVar;
        this.zzc = zzawmVar;
        this.zzd = zzavyVar;
        this.zze = zzaviVar;
        this.zzf = zzawoVar;
        this.zzg = zzawgVar;
        this.zzh = zzavxVar;
    }

    private final Map zze() {
        HashMap map = new HashMap();
        zzfpr zzfprVar = this.zza;
        zzata zzataVarZzb = this.zzb.zzb();
        map.put("v", zzfprVar.zzd());
        map.put("gms", Boolean.valueOf(this.zza.zzg()));
        map.put("int", zzataVarZzb.zzh());
        map.put("attts", Long.valueOf(zzataVarZzb.zzf().zza()));
        map.put("att", zzataVarZzb.zzf().zzd());
        map.put("attkid", zzataVarZzb.zzf().zzf());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzawg zzawgVar = this.zzg;
        if (zzawgVar != null) {
            map.put("tcq", Long.valueOf(zzawgVar.zzc()));
            map.put("tpq", Long.valueOf(this.zzg.zzg()));
            map.put("tcv", Long.valueOf(this.zzg.zzd()));
            map.put("tpv", Long.valueOf(this.zzg.zzh()));
            map.put("tchv", Long.valueOf(this.zzg.zzb()));
            map.put("tphv", Long.valueOf(this.zzg.zzf()));
            map.put("tcc", Long.valueOf(this.zzg.zza()));
            map.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    public final Map zza() {
        zzawm zzawmVar = this.zzc;
        Map mapZze = zze();
        mapZze.put("lts", Long.valueOf(zzawmVar.zza()));
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    public final Map zzb() {
        Map mapZze = zze();
        zzata zzataVarZza = this.zzb.zza();
        mapZze.put("gai", Boolean.valueOf(this.zza.zzh()));
        mapZze.put("did", zzataVarZza.zzg());
        mapZze.put("dst", Integer.valueOf(zzataVarZza.zzal() - 1));
        mapZze.put("doo", Boolean.valueOf(zzataVarZza.zzai()));
        zzavi zzaviVar = this.zze;
        if (zzaviVar != null) {
            mapZze.put("nt", Long.valueOf(zzaviVar.zza()));
        }
        zzawo zzawoVar = this.zzf;
        if (zzawoVar != null) {
            mapZze.put("vs", Long.valueOf(zzawoVar.zzc()));
            mapZze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    public final Map zzc() {
        zzavx zzavxVar = this.zzh;
        Map mapZze = zze();
        if (zzavxVar != null) {
            mapZze.put("vst", zzavxVar.zza());
        }
        return mapZze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
