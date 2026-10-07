package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcir extends zzexc {
    private final zzeyv zza;
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
    private final zzhgg zzn;
    private final zzhgg zzo;
    private final zzhgg zzp;
    private final zzhgg zzq;
    private final zzhgg zzr;
    private final zzhgg zzs;
    private final zzhgg zzt;
    private final zzhgg zzu;
    private final zzhgg zzv;
    private final zzhgg zzw;
    private final zzhgg zzx;
    private final zzhgg zzy;

    public /* synthetic */ zzcir(zzciy zzciyVar, zzeyv zzeyvVar, zzckd zzckdVar) {
        this.zzb = zzciyVar;
        this.zza = zzeyvVar;
        this.zzc = zzhfw.zzc(new zzfkm(zzciyVar.zzz));
        zzeyx zzeyxVar = new zzeyx(zzeyvVar);
        this.zzd = zzeyxVar;
        zzeyy zzeyyVar = new zzeyy(zzeyvVar);
        this.zze = zzeyyVar;
        zzeza zzezaVar = new zzeza(zzeyvVar);
        this.zzf = zzezaVar;
        this.zzg = new zzexb(zzclj.zza, zzciyVar.zzh, zzciyVar.zze, zzfin.zza(), zzeyxVar, zzeyyVar, zzezaVar);
        this.zzh = new zzeyc(zzcld.zza, zzfin.zza(), zzciyVar.zzh);
        zzeyw zzeywVar = new zzeyw(zzeyvVar);
        this.zzi = zzeywVar;
        this.zzj = new zzeyk(zzclf.zza, zzfin.zza(), zzeywVar);
        this.zzk = new zzeyu(zzclh.zza, zzciyVar.zze, zzciyVar.zzh);
        this.zzl = new zzezs(zzfin.zza());
        zzeyz zzeyzVar = new zzeyz(zzeyvVar);
        this.zzm = zzeyzVar;
        this.zzn = new zzezo(zzciyVar.zzaj, zzeyzVar, zzezaVar, zzcll.zza, zzfin.zza(), zzeywVar, zzciyVar.zze);
        this.zzo = new zzexy(zzeywVar, zzclb.zza, zzciyVar.zzaj, zzciyVar.zze, zzfin.zza());
        zzezb zzezbVar = new zzezb(zzeyvVar);
        this.zzp = zzezbVar;
        zzhgg zzhggVarZzc = zzhfw.zzc(zzdrh.zza());
        this.zzq = zzhggVarZzc;
        zzhgg zzhggVarZzc2 = zzhfw.zzc(zzdrf.zza());
        this.zzr = zzhggVarZzc2;
        zzhgg zzhggVarZzc3 = zzhfw.zzc(zzdrj.zza());
        this.zzs = zzhggVarZzc3;
        zzhgg zzhggVarZzc4 = zzhfw.zzc(zzdrl.zza());
        this.zzt = zzhggVarZzc4;
        zzhga zzhgaVarZzc = zzhgb.zzc(4);
        zzhgaVarZzc.zzb(zzfjl.GMS_SIGNALS, zzhggVarZzc);
        zzhgaVarZzc.zzb(zzfjl.BUILD_URL, zzhggVarZzc2);
        zzhgaVarZzc.zzb(zzfjl.HTTP, zzhggVarZzc3);
        zzhgaVarZzc.zzb(zzfjl.PRE_PROCESS, zzhggVarZzc4);
        zzhgb zzhgbVarZzc = zzhgaVarZzc.zzc();
        this.zzu = zzhgbVarZzc;
        zzhgg zzhggVarZzc5 = zzhfw.zzc(new zzdrm(zzezbVar, zzciyVar.zzh, zzfin.zza(), zzhgbVarZzc));
        this.zzv = zzhggVarZzc5;
        zzhgk zzhgkVarZza = zzhgl.zza(0, 1);
        zzhgkVarZza.zza(zzhggVarZzc5);
        zzhgl zzhglVarZzc = zzhgkVarZza.zzc();
        this.zzw = zzhglVarZzc;
        zzfju zzfjuVar = new zzfju(zzhglVarZzc);
        this.zzx = zzfjuVar;
        this.zzy = zzhfw.zzc(new zzfjt(zzfin.zza(), zzciyVar.zze, zzfjuVar));
    }

    private final zzexf zze() {
        zzeyv zzeyvVar = this.zza;
        zzbzq zzbzqVarZza = zzclk.zza();
        zzges zzgesVarZzc = zzfin.zzc();
        String strZzd = zzeyvVar.zzd();
        zzeyv zzeyvVar2 = this.zza;
        return new zzexf(zzbzqVarZza, zzgesVarZzc, strZzd, zzeyvVar2.zzb(), zzeyvVar2.zza());
    }

    private final zzeym zzf() {
        zzeyv zzeyvVar = this.zza;
        zzbbw zzbbwVarZza = zzckz.zza();
        zzges zzgesVarZzc = zzfin.zzc();
        List listZzf = zzeyvVar.zzf();
        zzhgf.zzb(listZzf);
        return new zzeym(zzbbwVarZza, zzgesVarZzc, listZzf);
    }

    @Override // com.google.android.gms.internal.ads.zzexc
    public final zzewc zza() {
        Context contextZzc = zzchq.zzc(this.zzb.zza);
        zzciy zzciyVar = this.zzb;
        zzbzn zzbznVarZza = zzclg.zza();
        zzbzo zzbzoVarZza = zzclm.zza();
        Object objZzb = zzciyVar.zzbh.zzb();
        zzhgg zzhggVar = this.zzc;
        zzhgg zzhggVar2 = this.zzo;
        zzhgg zzhggVar3 = this.zzn;
        zzhgg zzhggVar4 = this.zzl;
        zzhgg zzhggVar5 = this.zzk;
        zzhgg zzhggVar6 = this.zzj;
        zzhgg zzhggVar7 = this.zzh;
        return zzezj.zza(contextZzc, zzbznVarZza, zzbzoVarZza, objZzb, zze(), zzf(), zzhfw.zza(this.zzg), zzhfw.zza(zzhggVar7), zzhfw.zza(zzhggVar6), zzhfw.zza(zzhggVar5), zzhfw.zza(zzhggVar4), zzhfw.zza(zzhggVar3), zzhfw.zza(zzhggVar2), zzfin.zzc(), (zzfkl) zzhggVar.zzb(), (zzdsm) this.zzb.zzM.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzexc
    public final zzewc zzb() {
        Context contextZzc = zzchq.zzc(this.zzb.zza);
        zzeyv zzeyvVar = this.zza;
        zzges zzgesVarZzc = zzfin.zzc();
        zzevz zzevzVarZza = zzezg.zza(new zzeyi(zzclg.zza(), zzfin.zzc(), zzeyw.zzc(zzeyvVar)), zzeuh.zza(), (ScheduledExecutorService) this.zzb.zze.zzb(), -1);
        zzevz zzevzVarZza2 = zzezh.zza(new zzeys(zzcli.zza(), (ScheduledExecutorService) this.zzb.zze.zzb(), zzchq.zzc(this.zzb.zza)), (ScheduledExecutorService) this.zzb.zze.zzb());
        zzciy zzciyVar = this.zzb;
        zzbzq zzbzqVarZza = zzclk.zza();
        Context contextZzc2 = zzchq.zzc(zzciyVar.zza);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zze.zzb();
        zzeyv zzeyvVar2 = this.zza;
        return new zzewc(contextZzc, zzgesVarZzc, zzfzt.zzs(zzevzVarZza, zzevzVarZza2, zzeze.zza(zzexb.zza(zzbzqVarZza, contextZzc2, scheduledExecutorService, zzfin.zzc(), zzeyvVar2.zza(), zzeyy.zzc(zzeyvVar2), zzeza.zzc(zzeyvVar2)), (ScheduledExecutorService) this.zzb.zze.zzb()), zzezi.zza(new zzezq(zzfin.zzc()), (ScheduledExecutorService) this.zzb.zze.zzb()), zzezf.zza(), new zzeya(zzcle.zza(), zzfin.zzc(), zzchq.zzc(this.zzb.zza)), zzf(), zze(), (zzevz) this.zzb.zzbh.zzb(), zzexy.zza(zzeyw.zzc(this.zza), zzclc.zza(), (zzbzz) this.zzb.zzaj.zzb(), (ScheduledExecutorService) this.zzb.zze.zzb(), zzfin.zzc())), (zzfkl) this.zzc.zzb(), (zzdsm) this.zzb.zzM.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzexc
    public final zzfjr zzc() {
        return (zzfjr) this.zzy.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzexc
    public final zzfkl zzd() {
        return (zzfkl) this.zzc.zzb();
    }
}
