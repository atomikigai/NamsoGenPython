package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import e6.t;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import u6.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzexw implements zzevz {
    private final zzbzz zza;
    private final ScheduledExecutorService zzb;
    private final zzges zzc;

    public zzexw(String str, zzbao zzbaoVar, zzbzz zzbzzVar, ScheduledExecutorService scheduledExecutorService, zzges zzgesVar) {
        this.zza = zzbzzVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        zzbce zzbceVar = zzbcn.zzcW;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzdb)).booleanValue()) {
                m9.a aVarZzn = zzgei.zzn(zzftq.zza(Tasks.forResult(null), null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzexu
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final m9.a zza(Object obj) {
                        b bVar = (b) obj;
                        return bVar == null ? zzgei.zzh(new zzexx(null, -1)) : zzgei.zzh(new zzexx(bVar.f8862a, bVar.f8863b));
                    }
                }, this.zzc);
                if (((Boolean) zzbea.zza.zze()).booleanValue()) {
                    aVarZzn = zzgei.zzo(aVarZzn, ((Long) zzbea.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgei.zze(aVarZzn, Exception.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzexv
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, this.zzc);
            }
        }
        return zzgei.zzh(new zzexx(null, -1));
    }

    public final /* synthetic */ zzexx zzc(Exception exc) {
        this.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new zzexx(null, -1);
    }
}
