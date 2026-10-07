package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.e;
import d6.p;
import e6.t;
import h6.m0;
import h6.n0;
import o6.r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcux implements zzczj, zzdex {
    private final Context zza;
    private final zzffo zzb;
    private final i6.a zzc;
    private final m0 zzd;
    private final zzdup zze;
    private final zzfko zzf;

    public zzcux(Context context, zzffo zzffoVar, i6.a aVar, m0 m0Var, zzdup zzdupVar, zzfko zzfkoVar) {
        this.zza = context;
        this.zzb = zzffoVar;
        this.zzc = aVar;
        this.zzd = m0Var;
        this.zze = zzdupVar;
        this.zzf = zzfkoVar;
    }

    private final void zzc() {
        String strZzb;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzea)).booleanValue()) {
            m0 m0Var = this.zzd;
            Context context = this.zza;
            i6.a aVar = this.zzc;
            zzffo zzffoVar = this.zzb;
            zzfko zzfkoVar = this.zzf;
            String str = zzffoVar.zzf;
            zzbzt zzbztVarN = ((n0) m0Var).n();
            e eVar = p.C.f2984k;
            if (zzbztVarN != null) {
                eVar.getClass();
                strZzb = zzbztVarN.zzb();
            } else {
                strZzb = null;
            }
            eVar.j(context, aVar, false, zzbztVarN, strZzb, str, null, zzfkoVar, null, null);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zze(r rVar) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeb)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzf(String str) {
    }
}
