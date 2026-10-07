package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import d6.p;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeag {
    public m9.a zza;
    private final zzczh zzb;
    private final zzdzo zzc;
    private final zzfjr zzd;
    private final zzffo zze;
    private final i6.a zzf;
    private final zzfko zzg;
    private final zzfkl zzh;
    private final Context zzi;
    private final zzges zzj;

    public zzeag(zzczh zzczhVar, zzdzo zzdzoVar, zzfjr zzfjrVar, zzffo zzffoVar, i6.a aVar, zzfko zzfkoVar, zzfkl zzfklVar, Context context, zzges zzgesVar) {
        this.zzb = zzczhVar;
        this.zzc = zzdzoVar;
        this.zzd = zzfjrVar;
        this.zze = zzffoVar;
        this.zzf = aVar;
        this.zzg = zzfkoVar;
        this.zzh = zzfklVar;
        this.zzi = context;
        this.zzj = zzgesVar;
    }

    public final zzbvb zza(zzbvx zzbvxVar, zzebs zzebsVar) {
        zzebsVar.zzc.put("Content-Type", zzebsVar.zze);
        zzebsVar.zzc.put("User-Agent", p.C.f2979c.w(this.zzi, zzbvxVar.zzb.f5213a));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : zzebsVar.zzc.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbvb(zzebsVar.zza, zzebsVar.zzb, bundle, zzebsVar.zzd, zzebsVar.zzf, zzbvxVar.zzd, zzbvxVar.zzh);
    }

    public final m9.a zzc(final zzbvx zzbvxVar, final JSONObject jSONObject, final zzbvz zzbvzVar) {
        this.zzb.zzdn(zzbvxVar);
        zzfjh zzfjhVarZzb = this.zzd.zzb(zzfjl.PROXY, zzgei.zzm(this.zzd.zzb(zzfjl.PREPARE_HTTP_REQUEST, zzgei.zzh(new zzebw(jSONObject, zzbvzVar))).zze(new zzebx(zzbvxVar.zzg, this.zzh, zzfjz.zza(this.zzi, 9))).zza(), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzeac
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return this.zza.zza(zzbvxVar, (zzebs) obj);
            }
        }, this.zzj));
        final zzdzo zzdzoVar = this.zzc;
        Objects.requireNonNull(zzdzoVar);
        zzfix zzfixVarZza = zzfjhVarZzb.zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzead
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzdzoVar.zzc((zzbvb) obj);
            }
        }).zza();
        this.zza = zzfixVarZza;
        m9.a aVarZzn = zzgei.zzn(this.zzd.zzb(zzfjl.PRE_PROCESS, zzfixVarZza).zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzeab
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                return new zzebf(zzebt.zza(new InputStreamReader((InputStream) obj)), jSONObject, zzbvzVar);
            }
        }).zzf(p.C.f2990q.zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzebf.zza, zzbof.zzb)).zza(), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeae
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzd(zzbvxVar, (InputStream) obj);
            }
        }, this.zzj);
        zzgei.zzr(aVarZzn, new zzeaf(this), this.zzj);
        return aVarZzn;
    }

    public final /* synthetic */ m9.a zzd(zzbvx zzbvxVar, InputStream inputStream) throws Exception {
        return zzgei.zzh(new zzfff(new zzffc(this.zze), zzffe.zza(new InputStreamReader(inputStream), zzbvxVar)));
    }
}
