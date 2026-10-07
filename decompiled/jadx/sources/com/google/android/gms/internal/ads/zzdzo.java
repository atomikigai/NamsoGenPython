package com.google.android.gms.internal.ads;

import android.os.Binder;
import d6.p;
import e6.t;
import h6.r0;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdzo {
    private final zzges zza;
    private final zzges zzb;
    private final zzeaj zzc;
    private final zzhfr zzd;

    public zzdzo(zzges zzgesVar, zzges zzgesVar2, zzeaj zzeajVar, zzhfr zzhfrVar) {
        this.zza = zzgesVar;
        this.zzb = zzgesVar2;
        this.zzc = zzeajVar;
        this.zzd = zzhfrVar;
    }

    public final m9.a zza(zzbvb zzbvbVar) throws Exception {
        return this.zzc.zza(zzbvbVar, ((Long) t.f3437d.f3440c.zza(zzbcn.zzlk)).longValue());
    }

    public final /* synthetic */ m9.a zzb(zzbvb zzbvbVar, int i, zzdyw zzdywVar) throws Exception {
        return ((zzebq) this.zzd.zzb()).zzb(zzbvbVar, i);
    }

    public final m9.a zzc(final zzbvb zzbvbVar) {
        String str = zzbvbVar.zzf;
        r0 r0Var = p.C.f2979c;
        m9.a aVarZzg = r0.c(str) ? zzgei.zzg(new zzdyw(1, "Ads service proxy force local")) : zzgei.zzf(zzgei.zzk(new zzgdo() { // from class: com.google.android.gms.internal.ads.zzdzl
            @Override // com.google.android.gms.internal.ads.zzgdo
            public final m9.a zza() {
                return this.zza.zza(zzbvbVar);
            }
        }, this.zza), ExecutionException.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzm
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return zzgei.zzg(cause);
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzgei.zzf(aVarZzg, zzdyw.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzn
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzb(zzbvbVar, callingUid, (zzdyw) obj);
            }
        }, this.zzb);
    }
}
