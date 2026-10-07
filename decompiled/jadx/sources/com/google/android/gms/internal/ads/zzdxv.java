package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.t;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdxv implements zzdyv {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdwv zzb;
    private final zzges zzc;
    private final zzffo zzd;
    private final ScheduledExecutorService zze;
    private final zzecl zzf;
    private final zzfkl zzg;
    private final Context zzh;

    public zzdxv(Context context, zzffo zzffoVar, zzdwv zzdwvVar, zzges zzgesVar, ScheduledExecutorService scheduledExecutorService, zzecl zzeclVar, zzfkl zzfklVar) {
        this.zzh = context;
        this.zzd = zzffoVar;
        this.zzb = zzdwvVar;
        this.zzc = zzgesVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzeclVar;
        this.zzg = zzfklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyv
    public final m9.a zzb(zzbvx zzbvxVar) {
        Context context = this.zzh;
        m9.a aVarZzc = this.zzb.zzc(zzbvxVar);
        zzfka zzfkaVarZza = zzfjz.zza(context, 11);
        zzfkk.zzd(aVarZzc, zzfkaVarZza);
        m9.a aVarZzn = zzgei.zzn(aVarZzc, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdxs
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzc((zzdyx) obj);
            }
        }, this.zzc);
        zzbce zzbceVar = zzbcn.zzfw;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            aVarZzn = zzgei.zzf(zzgei.zzo(aVarZzn, ((Integer) tVar.f3440c.zza(zzbcn.zzfx)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdxt
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final m9.a zza(Object obj) {
                    return zzgei.zzg(new zzdwn(5));
                }
            }, zzcaj.zzf);
        }
        zzfkk.zza(aVarZzn, this.zzg, zzfkaVarZza);
        zzgei.zzr(aVarZzn, new zzdxu(this), zzcaj.zzf);
        return aVarZzn;
    }

    public final /* synthetic */ m9.a zzc(zzdyx zzdyxVar) throws Exception {
        return zzgei.zzh(new zzfff(new zzffc(this.zzd), zzffe.zza(new InputStreamReader(zzdyxVar.zzb()), zzdyxVar.zza())));
    }
}
