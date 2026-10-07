package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import e6.j2;
import e6.m0;
import e6.q3;
import e6.t;
import i6.h;
import java.util.concurrent.Executor;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcpg extends zzcpd {
    private final Context zzc;
    private final View zzd;
    private final zzcfk zze;
    private final zzfeu zzf;
    private final zzcro zzg;
    private final zzdjj zzh;
    private final zzden zzi;
    private final zzhfr zzj;
    private final Executor zzk;
    private q3 zzl;

    public zzcpg(zzcrp zzcrpVar, Context context, zzfeu zzfeuVar, View view, zzcfk zzcfkVar, zzcro zzcroVar, zzdjj zzdjjVar, zzden zzdenVar, zzhfr zzhfrVar, Executor executor) {
        super(zzcrpVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcfkVar;
        this.zzf = zzfeuVar;
        this.zzg = zzcroVar;
        this.zzh = zzdjjVar;
        this.zzi = zzdenVar;
        this.zzj = zzhfrVar;
        this.zzk = executor;
    }

    public static void zzj(zzcpg zzcpgVar) {
        zzdjj zzdjjVar = zzcpgVar.zzh;
        if (zzdjjVar.zze() == null) {
            return;
        }
        try {
            zzdjjVar.zze().zze((m0) zzcpgVar.zzj.zzb(), new b(zzcpgVar.zzc));
        } catch (RemoteException e) {
            h.e("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final int zza() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final int zzc() {
        zzbce zzbceVar = zzbcn.zzhy;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) tVar.f3440c.zza(zzbcn.zzhz)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final View zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final j2 zze() {
        try {
            return this.zzg.zza();
        } catch (zzffv unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final zzfeu zzf() {
        q3 q3Var = this.zzl;
        if (q3Var != null) {
            return zzffu.zzb(q3Var);
        }
        zzfet zzfetVar = this.zzb;
        if (zzfetVar.zzac) {
            for (String str : zzfetVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfeu(view.getWidth(), view.getHeight(), false);
        }
        return (zzfeu) this.zzb.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final zzfeu zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final void zzh() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcpd
    public final void zzi(ViewGroup viewGroup, q3 q3Var) {
        zzcfk zzcfkVar;
        if (viewGroup == null || (zzcfkVar = this.zze) == null) {
            return;
        }
        zzcfkVar.zzaj(zzche.zzc(q3Var));
        viewGroup.setMinimumHeight(q3Var.f3408c);
        viewGroup.setMinimumWidth(q3Var.f3410f);
        this.zzl = q3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcrq
    public final void zzk() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpf
            @Override // java.lang.Runnable
            public final void run() {
                zzcpg.zzj(this.zza);
            }
        });
        super.zzk();
    }
}
