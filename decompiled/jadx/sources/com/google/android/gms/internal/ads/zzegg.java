package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import e6.j2;
import e6.q3;
import e6.t;
import i6.h;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzegg implements zzefh {
    private final Context zza;
    private final zzcqh zzb;
    private final Executor zzc;

    public zzegg(Context context, zzcqh zzcqhVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcqhVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final Object zza(zzfff zzfffVar, final zzfet zzfetVar, zzefe zzefeVar) throws zzffv, zzeiz {
        final View viewZza;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhy)).booleanValue() && zzfetVar.zzag) {
            zzbpp zzbppVarZzc = ((zzfgm) zzefeVar.zzb).zzc();
            if (zzbppVarZzc == null) {
                h.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzffv(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) b.I(zzbppVarZzc.zze());
                boolean zZzf = zzbppVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzffv(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzgei.zzn(zzgei.zzh(null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzege
                            @Override // com.google.android.gms.internal.ads.zzgdp
                            public final m9.a zza(Object obj) {
                                return this.zza.zzc(viewZza, zzfetVar, obj);
                            }
                        }, zzcaj.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzffv(e);
                    }
                }
            } catch (RemoteException e4) {
                throw new zzffv(e4);
            }
        } else {
            viewZza = ((zzfgm) zzefeVar.zzb).zza();
        }
        zzcqh zzcqhVar = this.zzb;
        zzcsg zzcsgVar = new zzcsg(zzfffVar, zzfetVar, zzefeVar.zza);
        final zzfgm zzfgmVar = (zzfgm) zzefeVar.zzb;
        Objects.requireNonNull(zzfgmVar);
        zzcpe zzcpeVarZza = zzcqhVar.zza(zzcsgVar, new zzcpk(viewZza, null, new zzcro() { // from class: com.google.android.gms.internal.ads.zzegf
            @Override // com.google.android.gms.internal.ads.zzcro
            public final j2 zza() {
                return zzfgmVar.zzb();
            }
        }, (zzfeu) zzfetVar.zzu.get(0)));
        zzcpeVarZza.zzg().zza(viewZza);
        zzcpeVarZza.zzd().zzo(new zzcmr((zzfgm) zzefeVar.zzb), this.zzc);
        ((zzegx) zzefeVar.zzc).zzc(zzcpeVarZza.zzk());
        return zzcpeVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefh
    public final void zzb(zzfff zzfffVar, zzfet zzfetVar, zzefe zzefeVar) throws zzffv {
        q3 q3VarZza;
        q3 q3Var = zzfffVar.zza.zza.zze;
        boolean z4 = q3Var.f3418y;
        int i = q3Var.f3407b;
        int i10 = q3Var.e;
        if (z4) {
            Context context = this.zza;
            w5.h hVar = new w5.h(i10, i);
            hVar.f9659d = true;
            hVar.e = i;
            q3VarZza = new q3(context, hVar);
        } else {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhy)).booleanValue() && zzfetVar.zzag) {
                Context context2 = this.zza;
                w5.h hVar2 = new w5.h(i10, i);
                hVar2.f9660f = true;
                hVar2.f9661g = i;
                q3VarZza = new q3(context2, hVar2);
            } else {
                q3VarZza = zzffu.zza(this.zza, zzfetVar.zzu);
            }
        }
        q3 q3Var2 = q3VarZza;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhy)).booleanValue() && zzfetVar.zzag) {
            Object obj = zzefeVar.zzb;
            Context context3 = this.zza;
            zzffo zzffoVar = zzfffVar.zza.zza;
            ((zzfgm) obj).zzn(context3, q3Var2, zzffoVar.zzd, zzfetVar.zzv.toString(), qd.b.R(zzfetVar.zzs), (zzbpm) zzefeVar.zzc);
            return;
        }
        Object obj2 = zzefeVar.zzb;
        Context context4 = this.zza;
        zzffo zzffoVar2 = zzfffVar.zza.zza;
        ((zzfgm) obj2).zzm(context4, q3Var2, zzffoVar2.zzd, zzfetVar.zzv.toString(), qd.b.R(zzfetVar.zzs), (zzbpm) zzefeVar.zzc);
    }

    public final /* synthetic */ m9.a zzc(View view, zzfet zzfetVar, Object obj) throws Exception {
        return zzgei.zzh(zzcrc.zza(this.zza, view, zzfetVar));
    }
}
