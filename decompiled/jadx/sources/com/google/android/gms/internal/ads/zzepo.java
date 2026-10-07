package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import e6.t;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import u6.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzepo implements zzevz {
    final zzbzz zza;
    u6.a zzb;
    private final ScheduledExecutorService zzc;
    private final zzges zzd;
    private final Context zze;

    public zzepo(Context context, zzbzz zzbzzVar, ScheduledExecutorService scheduledExecutorService, zzges zzgesVar) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzda)).booleanValue()) {
            this.zzb = new com.google.android.gms.internal.appset.zzr(context);
        }
        this.zze = context;
        this.zza = zzbzzVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        zzbce zzbceVar = zzbcn.zzcW;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            if (!((Boolean) tVar.f3440c.zza(zzbcn.zzdb)).booleanValue()) {
                if (!((Boolean) tVar.f3440c.zza(zzbcn.zzcX)).booleanValue()) {
                    return zzgei.zzm(zzftq.zza(this.zzb.getAppSetIdInfo(), null), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzepl
                        @Override // com.google.android.gms.internal.ads.zzfwh
                        public final Object apply(Object obj) {
                            b bVar = (b) obj;
                            return new zzepp(bVar.f8862a, bVar.f8863b);
                        }
                    }, zzcaj.zzf);
                }
                Task taskZza = ((Boolean) tVar.f3440c.zza(zzbcn.zzda)).booleanValue() ? zzfgt.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZza == null) {
                    return zzgei.zzh(new zzepp(null, -1));
                }
                m9.a aVarZzn = zzgei.zzn(zzftq.zza(taskZza, null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzepm
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final m9.a zza(Object obj) {
                        b bVar = (b) obj;
                        return bVar == null ? zzgei.zzh(new zzepp(null, -1)) : zzgei.zzh(new zzepp(bVar.f8862a, bVar.f8863b));
                    }
                }, zzcaj.zzf);
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzcY)).booleanValue()) {
                    aVarZzn = zzgei.zzo(aVarZzn, ((Long) tVar.f3440c.zza(zzbcn.zzcZ)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgei.zze(aVarZzn, Exception.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzepn
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        this.zza.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzepp(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgei.zzh(new zzepp(null, -1));
    }
}
