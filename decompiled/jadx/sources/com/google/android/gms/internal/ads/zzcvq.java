package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import e6.t;
import h6.m0;
import h6.n0;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcvq {
    private final zzfjr zza;
    private final i6.a zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhfr zzg;
    private final String zzh;
    private final zzewc zzi;
    private final m0 zzj;
    private final zzffo zzk;
    private final zzdbx zzl;

    public zzcvq(zzfjr zzfjrVar, i6.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhfr zzhfrVar, m0 m0Var, String str2, zzewc zzewcVar, zzffo zzffoVar, zzdbx zzdbxVar) {
        this.zza = zzfjrVar;
        this.zzb = aVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhfrVar;
        this.zzh = str2;
        this.zzi = zzewcVar;
        this.zzj = m0Var;
        this.zzk = zzffoVar;
        this.zzl = zzdbxVar;
    }

    public final zzbvx zza(m9.a aVar, Bundle bundle) throws Exception {
        Bundle bundle2 = (Bundle) aVar.get();
        String str = (String) ((m9.a) this.zzg.zzb()).get();
        boolean z4 = false;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgS)).booleanValue() && ((n0) this.zzj).k()) {
            z4 = true;
        }
        boolean z10 = z4;
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        String str3 = this.zzd;
        return new zzbvx(bundle2, this.zzb, this.zzc, str3, list, packageInfo, str, str2, null, null, z10, this.zzk.zzb(), bundle);
    }

    public final m9.a zzb(Bundle bundle) {
        this.zzl.zza();
        return zzfjb.zzc(this.zzi.zza(new Bundle(), bundle), zzfjl.SIGNALS, this.zza).zza();
    }

    public final m9.a zzc() {
        final Bundle bundle = new Bundle();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzci)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzs;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final m9.a aVarZzb = zzb(bundle);
        return this.zza.zza(zzfjl.REQUEST_PARCEL, aVarZzb, (m9.a) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcvp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza(aVarZzb, bundle);
            }
        }).zza();
    }
}
