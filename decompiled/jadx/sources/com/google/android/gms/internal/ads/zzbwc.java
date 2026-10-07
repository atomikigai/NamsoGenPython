package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbwc implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbwe zzb;

    public zzbwc(zzbwe zzbweVar, Context context) {
        this.zza = context;
        this.zzb = zzbweVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003d  */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        zzbwb zzbwbVarZza;
        zzbwd zzbwdVar = (zzbwd) this.zzb.zza.get(this.zza);
        if (zzbwdVar != null) {
            long jLongValue = zzbwdVar.zza + ((Long) zzbec.zzd.zze()).longValue();
            p.C.f2983j.getClass();
            if (jLongValue < System.currentTimeMillis()) {
                zzbwbVarZza = new zzbwa(this.zza).zza();
            } else {
                zzbwbVarZza = new zzbwa(this.zza, zzbwdVar.zzb).zza();
            }
        } else {
            zzbwbVarZza = new zzbwa(this.zza).zza();
        }
        zzbwe zzbweVar = this.zzb;
        zzbweVar.zza.put(this.zza, new zzbwd(zzbweVar, zzbwbVarZza));
        return zzbwbVarZza;
    }
}
