package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzciv extends zzext {
    private final zzexh zza;
    private final zzciy zzb;
    private final zzhgg zzc;
    private final zzhgg zzd;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;
    private final zzhgg zzh;
    private final zzhgg zzi;
    private final zzhgg zzj;
    private final zzhgg zzk;
    private final zzhgg zzl;
    private final zzhgg zzm;

    public /* synthetic */ zzciv(zzciy zzciyVar, zzexh zzexhVar, zzckd zzckdVar) {
        this.zzb = zzciyVar;
        this.zza = zzexhVar;
        this.zzc = zzhfw.zzc(new zzfkm(zzciyVar.zzz));
        zzexp zzexpVar = new zzexp(zzexhVar);
        this.zzd = zzexpVar;
        zzhgg zzhggVarZzc = zzhfw.zzc(zzdrh.zza());
        this.zze = zzhggVarZzc;
        zzhgg zzhggVarZzc2 = zzhfw.zzc(zzdrf.zza());
        this.zzf = zzhggVarZzc2;
        zzhgg zzhggVarZzc3 = zzhfw.zzc(zzdrj.zza());
        this.zzg = zzhggVarZzc3;
        zzhgg zzhggVarZzc4 = zzhfw.zzc(zzdrl.zza());
        this.zzh = zzhggVarZzc4;
        zzhga zzhgaVarZzc = zzhgb.zzc(4);
        zzhgaVarZzc.zzb(zzfjl.GMS_SIGNALS, zzhggVarZzc);
        zzhgaVarZzc.zzb(zzfjl.BUILD_URL, zzhggVarZzc2);
        zzhgaVarZzc.zzb(zzfjl.HTTP, zzhggVarZzc3);
        zzhgaVarZzc.zzb(zzfjl.PRE_PROCESS, zzhggVarZzc4);
        zzhgb zzhgbVarZzc = zzhgaVarZzc.zzc();
        this.zzi = zzhgbVarZzc;
        zzhgg zzhggVarZzc5 = zzhfw.zzc(new zzdrm(zzexpVar, zzciyVar.zzh, zzfin.zza(), zzhgbVarZzc));
        this.zzj = zzhggVarZzc5;
        zzhgk zzhgkVarZza = zzhgl.zza(0, 1);
        zzhgkVarZza.zza(zzhggVarZzc5);
        zzhgl zzhglVarZzc = zzhgkVarZza.zzc();
        this.zzk = zzhglVarZzc;
        zzfju zzfjuVar = new zzfju(zzhglVarZzc);
        this.zzl = zzfjuVar;
        this.zzm = zzhfw.zzc(new zzfjt(zzfin.zza(), zzciyVar.zze, zzfjuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzext
    public final zzewc zza() {
        Context contextZzc = zzchq.zzc(this.zzb.zza);
        zzexh zzexhVar = this.zza;
        zzges zzgesVarZzc = zzfin.zzc();
        zzevz zzevzVarZza = zzezg.zza(new zzeyi(zzclg.zza(), zzfin.zzc(), zzexi.zza(zzexhVar)), zzeuh.zza(), (ScheduledExecutorService) this.zzb.zze.zzb(), 0);
        zzevz zzevzVarZza2 = zzezh.zza(new zzeys(zzcli.zza(), (ScheduledExecutorService) this.zzb.zze.zzb(), zzchq.zzc(this.zzb.zza)), (ScheduledExecutorService) this.zzb.zze.zzb());
        zzciy zzciyVar = this.zzb;
        zzbzq zzbzqVarZza = zzclk.zza();
        Context contextZzc2 = zzchq.zzc(zzciyVar.zza);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zze.zzb();
        zzexh zzexhVar2 = this.zza;
        zzevz zzevzVarZza3 = zzeze.zza(zzexb.zza(zzbzqVarZza, contextZzc2, scheduledExecutorService, zzfin.zzc(), zzexj.zza(zzexhVar2), zzexl.zza(zzexhVar2), zzexm.zza(zzexhVar2)), (ScheduledExecutorService) this.zzb.zze.zzb());
        zzevz zzevzVarZza4 = zzezi.zza(new zzezq(zzfin.zzc()), (ScheduledExecutorService) this.zzb.zze.zzb());
        zzciy zzciyVar2 = this.zzb;
        zzevz zzevzVarZza5 = zzezf.zza();
        zzeya zzeyaVar = new zzeya(zzcle.zza(), zzfin.zzc(), zzchq.zzc(zzciyVar2.zza));
        zzeym zzeymVar = new zzeym(zzckz.zza(), zzfin.zzc(), zzexk.zza(this.zza));
        zzexh zzexhVar3 = this.zza;
        return new zzewc(contextZzc, zzgesVarZzc, zzfzt.zzs(zzevzVarZza, zzevzVarZza2, zzevzVarZza3, zzevzVarZza4, zzevzVarZza5, zzeyaVar, zzeymVar, new zzexf(zzclk.zza(), zzfin.zzc(), zzexn.zza(zzexhVar3), zzexo.zza(zzexhVar3), zzexj.zza(zzexhVar3)), (zzevz) this.zzb.zzbh.zzb(), zzexy.zza(zzexi.zza(this.zza), zzclc.zza(), (zzbzz) this.zzb.zzaj.zzb(), (ScheduledExecutorService) this.zzb.zze.zzb(), zzfin.zzc())), (zzfkl) this.zzc.zzb(), (zzdsm) this.zzb.zzM.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzext
    public final zzfjr zzb() {
        return (zzfjr) this.zzm.zzb();
    }
}
