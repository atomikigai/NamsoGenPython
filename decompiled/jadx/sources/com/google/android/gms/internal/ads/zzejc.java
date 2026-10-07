package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import d6.p;
import da.v;
import e6.t;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzejc implements zzgdp {
    private final zzfjr zza;
    private final zzcwo zzb;
    private final zzfln zzc;
    private final zzflr zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcrt zzg;
    private final zzeiv zzh;
    private final zzefg zzi;
    private final Context zzj;
    private final zzfkl zzk;
    private final zzeif zzl;
    private final zzdsh zzm;

    public zzejc(Context context, zzfjr zzfjrVar, zzeiv zzeivVar, zzcwo zzcwoVar, zzfln zzflnVar, zzflr zzflrVar, zzcrt zzcrtVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzefg zzefgVar, zzfkl zzfklVar, zzeif zzeifVar, zzdsh zzdshVar) {
        this.zzj = context;
        this.zza = zzfjrVar;
        this.zzh = zzeivVar;
        this.zzb = zzcwoVar;
        this.zzc = zzflnVar;
        this.zzd = zzflrVar;
        this.zzg = zzcrtVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzefgVar;
        this.zzk = zzfklVar;
        this.zzl = zzeifVar;
        this.zzm = zzdshVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    public static String zzc(zzfff zzfffVar) {
        zzbce zzbceVar = zzbcn.zzfv;
        t tVar = t.f3437d;
        String strF = "No fill.";
        String str = true != ((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() ? "No ad config." : "No fill.";
        int i = zzfffVar.zzb.zzb.zzf;
        if (i == 0) {
            strF = str;
        } else if (i < 200 || i >= 300) {
            strF = (i < 300 || i >= 400) ? v.f(i, "Received error HTTP response code: ") : "No location header to follow redirect or too many redirects.";
        } else {
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzfu)).booleanValue()) {
                strF = str;
            }
        }
        zzfev zzfevVar = zzfffVar.zzb.zzb.zzj;
        return zzfevVar != null ? zzfevVar.zza() : strF;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgdp
    public final m9.a zza(Object obj) throws Exception {
        Iterator it;
        zzefb zzefbVarZza;
        int i;
        zzbvx zzbvxVar;
        Bundle bundle;
        final zzfff zzfffVar = (zzfff) obj;
        zzbce zzbceVar = zzbcn.zzci;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue() && (zzbvxVar = zzfffVar.zzb.zzd) != null && (bundle = zzbvxVar.zzm) != null) {
            this.zzm.zza().putAll(bundle);
        }
        if (((Boolean) zzbclVar2.zza(zzbcn.zzcj)).booleanValue()) {
            v.t(p.C.f2983j, this.zzm.zza(), zzdrv.RENDERING_START.zza());
        }
        String strZzc = zzc(zzfffVar);
        this.zzi.zzi(zzfffVar.zzb.zzb);
        if (((Boolean) zzbclVar2.zza(zzbcn.zzhW)).booleanValue() && (i = zzfffVar.zzb.zzb.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzgei.zzg(new zzeiz(3, strZzc));
        }
        zzfew zzfewVar = zzfffVar.zzb.zzb;
        if (!((Boolean) zzbclVar2.zza(zzbcn.zzdG)).booleanValue()) {
            for (zzfet zzfetVar : zzfffVar.zzb.zza) {
                this.zzi.zzd(zzfetVar);
                it = zzfetVar.zza.iterator();
                while (true) {
                    if (it.hasNext()) {
                        this.zzi.zzf(zzfetVar, 0L, zzfgq.zzd(1, null, null));
                        break;
                        break;
                    }
                    zzefbVarZza = this.zzg.zza(zzfetVar.zzb, (String) it.next());
                    if (zzefbVarZza == null) {
                    }
                }
            }
        } else {
            String str = zzfewVar.zzq;
            if (TextUtils.isEmpty(str)) {
                while (r0.hasNext()) {
                    this.zzi.zzd(zzfetVar);
                    it = zzfetVar.zza.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            this.zzi.zzf(zzfetVar, 0L, zzfgq.zzd(1, null, null));
                            break;
                        }
                        zzefbVarZza = this.zzg.zza(zzfetVar.zzb, (String) it.next());
                        if (zzefbVarZza == null && zzefbVarZza.zzb(zzfffVar, zzfetVar)) {
                            break;
                        }
                    }
                }
            } else {
                this.zzi.zzh(str, zzfffVar.zzb.zza);
            }
        }
        this.zzb.zzo(new zzcnf(zzfffVar, this.zzd, this.zzc), this.zze);
        if (zzfffVar.zzb.zzb.zzr > 1) {
            return this.zzl.zzb(zzfffVar);
        }
        zzfix zzfixVarZza = zzfjb.zzc(zzgei.zzg(new zzeiz(3, zzc(zzfffVar))), zzfjl.RENDER_CONFIG_INIT, this.zza).zza();
        this.zzh.zzl();
        int i10 = 0;
        for (final zzfet zzfetVar2 : zzfffVar.zzb.zza) {
            for (String str2 : zzfetVar2.zza) {
                final zzefb zzefbVarZza2 = this.zzg.zza(zzfetVar2.zzb, str2);
                if (zzefbVarZza2 != null && zzefbVarZza2.zzb(zzfffVar, zzfetVar2)) {
                    zzfixVarZza = this.zza.zzb(zzfjl.RENDER_CONFIG_WATERFALL, zzfixVarZza).zzh("render-config-" + i10 + "-" + str2).zzc(Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeja
                        @Override // com.google.android.gms.internal.ads.zzgdp
                        public final m9.a zza(Object obj2) {
                            return this.zza.zzb(zzfetVar2, zzfffVar, zzefbVarZza2, (Throwable) obj2);
                        }
                    }).zza();
                    break;
                }
            }
            i10++;
        }
        final zzeiv zzeivVar = this.zzh;
        Objects.requireNonNull(zzeivVar);
        zzfixVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejb
            @Override // java.lang.Runnable
            public final void run() {
                zzeivVar.zzj();
            }
        }, this.zze);
        return zzfixVarZza;
    }

    public final /* synthetic */ m9.a zzb(zzfet zzfetVar, zzfff zzfffVar, zzefb zzefbVar, Throwable th) throws Exception {
        zzfka zzfkaVarZza = zzfjz.zza(this.zzj, 12);
        zzfkaVarZza.zzd(zzfetVar.zzE);
        zzfkaVarZza.zzi();
        m9.a aVarZzo = zzgei.zzo(zzefbVar.zza(zzfffVar, zzfetVar), zzfetVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfffVar, zzfetVar, aVarZzo, this.zzc);
        zzfkk.zza(aVarZzo, this.zzk, zzfkaVarZza);
        return aVarZzo;
    }
}
