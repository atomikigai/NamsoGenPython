package com.google.android.gms.internal.ads;

import d6.p;
import e6.h2;
import e6.o3;
import e6.t;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcsy {
    private final zzdya zza;
    private final zzffo zzb;
    private final zzfjr zzc;
    private final zzclp zzd;
    private final zzejc zze;
    private final zzdbt zzf;
    private zzfff zzg;
    private final zzdzj zzh;
    private final zzcvq zzi;
    private final Executor zzj;
    private final zzdyt zzk;
    private final zzefg zzl;
    private final zzdzz zzm;
    private final zzeag zzn;

    public zzcsy(zzdya zzdyaVar, zzffo zzffoVar, zzfjr zzfjrVar, zzclp zzclpVar, zzejc zzejcVar, zzdbt zzdbtVar, zzfff zzfffVar, zzdzj zzdzjVar, zzcvq zzcvqVar, Executor executor, zzdyt zzdytVar, zzefg zzefgVar, zzdzz zzdzzVar, zzeag zzeagVar) {
        this.zza = zzdyaVar;
        this.zzb = zzffoVar;
        this.zzc = zzfjrVar;
        this.zzd = zzclpVar;
        this.zze = zzejcVar;
        this.zzf = zzdbtVar;
        this.zzg = zzfffVar;
        this.zzh = zzdzjVar;
        this.zzi = zzcvqVar;
        this.zzj = executor;
        this.zzk = zzdytVar;
        this.zzl = zzefgVar;
        this.zzm = zzdzzVar;
        this.zzn = zzeagVar;
    }

    public final h2 zza(Throwable th) {
        return zzfgq.zzb(th, this.zzl);
    }

    public final zzdbt zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzfff zzd(zzfff zzfffVar) throws Exception {
        this.zzd.zza(zzfffVar);
        return zzfffVar;
    }

    public final m9.a zze(final zzfhj zzfhjVar) {
        zzfix zzfixVarZza = this.zzc.zzb(zzfjl.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcsu
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzf(zzfhjVar, (zzbvx) obj);
            }
        }).zza();
        zzgei.zzr(zzfixVarZza, new zzcsw(this), this.zzj);
        return zzfixVarZza;
    }

    public final /* synthetic */ m9.a zzf(zzfhj zzfhjVar, zzbvx zzbvxVar) throws Exception {
        zzbvxVar.zzi = zzfhjVar;
        return this.zzh.zza(zzbvxVar);
    }

    public final /* synthetic */ m9.a zzg(m9.a aVar, m9.a aVar2, m9.a aVar3) throws Exception {
        return this.zzn.zzc((zzbvx) aVar.get(), (JSONObject) aVar2.get(), (zzbvz) aVar3.get());
    }

    public final m9.a zzh(zzbvx zzbvxVar) {
        zzfix zzfixVarZza = this.zzc.zzb(zzfjl.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbvxVar)).zza();
        zzgei.zzr(zzfixVarZza, new zzcsx(this), this.zzj);
        return zzfixVarZza;
    }

    public final m9.a zzi(m9.a aVar) {
        zzfjh zzfjhVarZzf = this.zzc.zzb(zzfjl.RENDERER, aVar).zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzcsp
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) throws Exception {
                zzfff zzfffVar = (zzfff) obj;
                this.zza.zzd(zzfffVar);
                return zzfffVar;
            }
        }).zzf(this.zze);
        zzbce zzbceVar = zzbcn.zzfw;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            zzfjhVarZzf = zzfjhVarZzf.zzi(((Integer) tVar.f3440c.zza(zzbcn.zzfx)).intValue(), TimeUnit.SECONDS);
        }
        return zzfjhVarZzf.zza();
    }

    public final m9.a zzj() {
        o3 o3Var = this.zzb.zzd;
        if (o3Var.I == null && o3Var.D == null) {
            return zzk(this.zzi.zzc());
        }
        zzfjr zzfjrVar = this.zzc;
        zzdya zzdyaVar = this.zza;
        return zzfjb.zzc(zzdyaVar.zza(), zzfjl.PRELOADED_LOADER, zzfjrVar).zza();
    }

    public final m9.a zzk(final m9.a aVar) {
        zzfff zzfffVar = this.zzg;
        if (zzfffVar != null) {
            return zzfjb.zzc(zzgei.zzh(zzfffVar), zzfjl.SERVER_TRANSACTION, this.zzc).zza();
        }
        p.C.i.zzj();
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzli)).booleanValue() || ((Boolean) zzbet.zzc.zze()).booleanValue()) {
            zzfjh zzfjhVarZzb = this.zzc.zzb(zzfjl.SERVER_TRANSACTION, aVar);
            final zzdyt zzdytVar = this.zzk;
            Objects.requireNonNull(zzdytVar);
            return zzfjhVarZzb.zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcsv
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final m9.a zza(Object obj) {
                    return zzdytVar.zzb((zzbvx) obj);
                }
            }).zza();
        }
        final zzdzz zzdzzVar = this.zzm;
        Objects.requireNonNull(zzdzzVar);
        final m9.a aVarZzn = zzgei.zzn(aVar, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcsq
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzdzzVar.zza((zzbvx) obj);
            }
        }, this.zzj);
        zzfjh zzfjhVarZzb2 = this.zzc.zzb(zzfjl.BUILD_URL, aVarZzn);
        final zzdzj zzdzjVar = this.zzh;
        Objects.requireNonNull(zzdzjVar);
        final zzfix zzfixVarZza = zzfjhVarZzb2.zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcsr
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return zzdzjVar.zzb((JSONObject) obj);
            }
        }).zza();
        return this.zzc.zza(zzfjl.SERVER_TRANSACTION, aVar, aVarZzn, zzfixVarZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcss
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzg(aVar, aVarZzn, zzfixVarZza);
            }
        }).zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcst
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return (m9.a) obj;
            }
        }).zza();
    }

    public final void zzl(zzfff zzfffVar) {
        this.zzg = zzfffVar;
    }
}
