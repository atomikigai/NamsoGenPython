package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import d6.p;
import e6.t;
import h6.r0;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdwv {
    private final zzges zza;
    private final zzges zzb;
    private final zzdyd zzc;
    private final zzhfr zzd;

    public zzdwv(zzges zzgesVar, zzges zzgesVar2, zzdyd zzdydVar, zzhfr zzhfrVar) {
        this.zza = zzgesVar;
        this.zzb = zzgesVar2;
        this.zzc = zzdydVar;
        this.zzd = zzhfrVar;
    }

    public final zzdyx zza(zzbvx zzbvxVar) throws Exception {
        return (zzdyx) this.zzc.zza(zzbvxVar).get(((Integer) t.f3437d.f3440c.zza(zzbcn.zzfx)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ m9.a zzb(final zzbvx zzbvxVar, int i, zzdyw zzdywVar) throws Exception {
        Bundle bundle;
        if (zzbvxVar != null && (bundle = zzbvxVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgei.zzn(((zzebg) this.zzd.zzb()).zzc(zzbvxVar, i), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdwr
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzgei.zzh(new zzdyx((InputStream) obj, zzbvxVar));
            }
        }, this.zzb);
    }

    public final m9.a zzc(final zzbvx zzbvxVar) {
        String str = zzbvxVar.zzd;
        r0 r0Var = p.C.f2979c;
        m9.a aVarZzg = r0.c(str) ? zzgei.zzg(new zzdyw(1)) : zzgei.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdws
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza(zzbvxVar);
            }
        }), ExecutionException.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdwt
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzgei.zzg(((ExecutionException) obj).getCause());
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzgei.zzf(aVarZzg, zzdyw.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdwu
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzb(zzbvxVar, callingUid, (zzdyw) obj);
            }
        }, this.zzb);
    }
}
