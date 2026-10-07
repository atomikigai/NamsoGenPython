package com.google.android.gms.internal.ads;

import e6.o3;
import e6.u3;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfbp implements zzfhx {
    public final zzfcj zza;
    public final zzfcl zzb;
    public final o3 zzc;
    public final String zzd;
    public final Executor zze;
    public final u3 zzf;
    public final zzfhm zzg;

    public zzfbp(zzfcj zzfcjVar, zzfcl zzfclVar, o3 o3Var, String str, Executor executor, u3 u3Var, zzfhm zzfhmVar) {
        this.zza = zzfcjVar;
        this.zzb = zzfclVar;
        this.zzc = o3Var;
        this.zzd = str;
        this.zze = executor;
        this.zzf = u3Var;
        this.zzg = zzfhmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhx
    public final zzfhm zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfhx
    public final Executor zzb() {
        return this.zze;
    }
}
