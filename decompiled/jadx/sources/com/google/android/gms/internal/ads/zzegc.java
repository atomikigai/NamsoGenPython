package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import d6.p;
import da.v;
import e6.j2;
import e6.l3;
import e6.q3;
import e6.t;
import h6.j;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzegc implements zzefb {
    private final zzcqh zza;
    private final Context zzb;
    private final zzdpn zzc;
    private final zzffo zzd;
    private final Executor zze;
    private final zzfwh zzf;
    private final zzdsh zzg;

    public zzegc(zzcqh zzcqhVar, Context context, Executor executor, zzdpn zzdpnVar, zzffo zzffoVar, zzfwh zzfwhVar, zzdsh zzdshVar) {
        this.zzb = context;
        this.zza = zzcqhVar;
        this.zze = executor;
        this.zzc = zzdpnVar;
        this.zzd = zzffoVar;
        this.zzf = zzfwhVar;
        this.zzg = zzdshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final m9.a zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        return zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzegb
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzc(zzfffVar, zzfetVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        zzfey zzfeyVar = zzfetVar.zzs;
        return (zzfeyVar == null || zzfeyVar.zza == null) ? false : true;
    }

    public final m9.a zzc(zzfff zzfffVar, zzfet zzfetVar, Object obj) throws Exception {
        zzbce zzbceVar = zzbcn.zzck;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
            v.t(p.C.f2983j, this.zzg.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        q3 q3VarZza = zzffu.zza(this.zzb, zzfetVar.zzu);
        final zzcfk zzcfkVarZza = this.zzc.zza(q3VarZza, zzfetVar, zzfffVar.zzb.zzb);
        zzcfkVarZza.zzac(zzfetVar.zzW);
        View viewZza = (((Boolean) zzbclVar2.zza(zzbcn.zzhy)).booleanValue() && zzfetVar.zzag) ? zzcrc.zza(this.zzb, zzcfkVarZza.zzF(), zzfetVar) : new zzdpq(this.zzb, zzcfkVarZza.zzF(), (j) this.zzf.apply(zzfetVar));
        if (((Boolean) zzbclVar2.zza(zzbceVar)).booleanValue()) {
            v.t(p.C.f2983j, this.zzg.zza(), zzdrv.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        final zzcpe zzcpeVarZza = this.zza.zza(new zzcsg(zzfffVar, zzfetVar, null), new zzcpk(viewZza, zzcfkVarZza, new zzcro() { // from class: com.google.android.gms.internal.ads.zzefw
            @Override // com.google.android.gms.internal.ads.zzcro
            public final j2 zza() {
                return zzcfkVarZza.zzq();
            }
        }, zzffu.zzb(q3VarZza)));
        if (((Boolean) zzbclVar2.zza(zzbceVar)).booleanValue()) {
            v.t(p.C.f2983j, this.zzg.zza(), zzdrv.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzcpeVarZza.zzh().zzi(zzcfkVarZza, false, null, this.zzg.zza());
        zzcxe zzcxeVarZzc = zzcpeVarZza.zzc();
        zzcxg zzcxgVar = new zzcxg() { // from class: com.google.android.gms.internal.ads.zzefx
            @Override // com.google.android.gms.internal.ads.zzcxg
            public final void zzr() {
                zzcfk zzcfkVar = zzcfkVarZza;
                if (zzcfkVar.zzN() != null) {
                    zzcfkVar.zzN().zzr();
                }
            }
        };
        zzges zzgesVar = zzcaj.zzf;
        zzcxeVarZzc.zzo(zzcxgVar, zzgesVar);
        String strZzb = zzfetVar.zzs.zza;
        if (((Boolean) zzbclVar2.zza(zzbcn.zzfe)).booleanValue() && zzcpeVarZza.zzi().zze(true)) {
            strZzb = zzcgv.zzb(strZzb, zzcgv.zza(zzfetVar));
        }
        zzcpeVarZza.zzh();
        m9.a aVarZzj = zzdpm.zzj(zzcfkVarZza, zzfetVar.zzs.zzb, strZzb, this.zzg.zza());
        if (zzfetVar.zzM) {
            aVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefy
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfkVarZza.zzah();
                }
            }, this.zze);
        }
        aVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(zzcfkVarZza);
            }
        }, this.zze);
        return zzgei.zzm(aVarZzj, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzega
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj2) {
                return zzcpeVarZza.zza();
            }
        }, zzgesVar);
    }

    public final void zzd(zzcfk zzcfkVar) {
        zzcfkVar.zzab();
        zzffo zzffoVar = this.zzd;
        zzcgm zzcgmVarZzq = zzcfkVar.zzq();
        l3 l3Var = zzffoVar.zza;
        if (l3Var != null && zzcgmVarZzq != null) {
            zzcgmVarZzq.zzs(l3Var);
        }
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbp)).booleanValue() || zzcfkVar.isAttachedToWindow()) {
            return;
        }
        zzcfkVar.onPause();
        zzcfkVar.zzav(true);
    }
}
