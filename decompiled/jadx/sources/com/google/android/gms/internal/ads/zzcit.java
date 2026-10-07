package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcit extends zzexr {
    private final zzeyo zza;
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

    public /* synthetic */ zzcit(zzciy zzciyVar, zzeyo zzeyoVar, zzckd zzckdVar) {
        this.zzb = zzciyVar;
        this.zza = zzeyoVar;
        zzeyq zzeyqVar = new zzeyq(zzeyoVar);
        this.zzc = zzeyqVar;
        zzhgg zzhggVarZzc = zzhfw.zzc(zzdrh.zza());
        this.zzd = zzhggVarZzc;
        zzhgg zzhggVarZzc2 = zzhfw.zzc(zzdrf.zza());
        this.zze = zzhggVarZzc2;
        zzhgg zzhggVarZzc3 = zzhfw.zzc(zzdrj.zza());
        this.zzf = zzhggVarZzc3;
        zzhgg zzhggVarZzc4 = zzhfw.zzc(zzdrl.zza());
        this.zzg = zzhggVarZzc4;
        zzhga zzhgaVarZzc = zzhgb.zzc(4);
        zzhgaVarZzc.zzb(zzfjl.GMS_SIGNALS, zzhggVarZzc);
        zzhgaVarZzc.zzb(zzfjl.BUILD_URL, zzhggVarZzc2);
        zzhgaVarZzc.zzb(zzfjl.HTTP, zzhggVarZzc3);
        zzhgaVarZzc.zzb(zzfjl.PRE_PROCESS, zzhggVarZzc4);
        zzhgb zzhgbVarZzc = zzhgaVarZzc.zzc();
        this.zzh = zzhgbVarZzc;
        zzhgg zzhggVarZzc5 = zzhfw.zzc(new zzdrm(zzeyqVar, zzciyVar.zzh, zzfin.zza(), zzhgbVarZzc));
        this.zzi = zzhggVarZzc5;
        zzhgk zzhgkVarZza = zzhgl.zza(0, 1);
        zzhgkVarZza.zza(zzhggVarZzc5);
        zzhgl zzhglVarZzc = zzhgkVarZza.zzc();
        this.zzj = zzhglVarZzc;
        zzfju zzfjuVar = new zzfju(zzhglVarZzc);
        this.zzk = zzfjuVar;
        this.zzl = zzhfw.zzc(new zzfjt(zzfin.zza(), zzciyVar.zze, zzfjuVar));
        this.zzm = zzhfw.zzc(new zzfkm(zzciyVar.zzz));
    }

    @Override // com.google.android.gms.internal.ads.zzexr
    public final zzewc zza() {
        Context contextZzc = zzchq.zzc(this.zzb.zza);
        zzeyi zzeyiVar = new zzeyi(zzclg.zza(), zzfin.zzc(), zzeyp.zza(this.zza));
        zzciy zzciyVar = this.zzb;
        zzges zzgesVarZzc = zzfin.zzc();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzciyVar.zze.zzb();
        zzfkl zzfklVar = (zzfkl) this.zzm.zzb();
        zzdsm zzdsmVar = (zzdsm) this.zzb.zzM.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzeun(zzeyiVar, 0L, scheduledExecutorService));
        return new zzewc(contextZzc, zzgesVarZzc, hashSet, zzfklVar, zzdsmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzexr
    public final zzfjr zzb() {
        return (zzfjr) this.zzl.zzb();
    }
}
