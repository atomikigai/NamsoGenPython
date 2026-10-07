package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdnz implements Callable {
    private final d6.a zza;
    private final Context zzb;
    private final zzdsm zzc;
    private final zzedp zzd;
    private final Executor zze;
    private final zzavc zzf;
    private final i6.a zzg;
    private final zzflr zzh;
    private final zzeea zzi;
    private final zzffs zzj;

    public zzdnz(Context context, Executor executor, zzavc zzavcVar, i6.a aVar, d6.a aVar2, zzcfx zzcfxVar, zzedp zzedpVar, zzflr zzflrVar, zzdsm zzdsmVar, zzeea zzeeaVar, zzffs zzffsVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzavcVar;
        this.zzg = aVar;
        this.zza = aVar2;
        this.zzd = zzedpVar;
        this.zzh = zzflrVar;
        this.zzc = zzdsmVar;
        this.zzi = zzeeaVar;
        this.zzj = zzffsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdoc zzdocVar = new zzdoc(this);
        zzdocVar.zzk();
        return zzdocVar;
    }
}
