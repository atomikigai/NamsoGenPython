package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.b;
import d6.p;
import e6.t;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdoc {
    private final d6.a zzb;
    private final Context zzc;
    private final zzdsm zzd;
    private final Executor zze;
    private final zzavc zzf;
    private final i6.a zzg;
    private final zzedp zzi;
    private final zzflr zzj;
    private final zzeea zzk;
    private final zzffs zzl;
    private m9.a zzm;
    private final zzdnp zza = new zzdnp();
    private final zzbkh zzh = new zzbkh();

    public zzdoc(zzdnz zzdnzVar) {
        this.zzc = zzdnzVar.zzb;
        this.zze = zzdnzVar.zze;
        this.zzf = zzdnzVar.zzf;
        this.zzg = zzdnzVar.zzg;
        this.zzb = zzdnzVar.zza;
        this.zzi = zzdnzVar.zzd;
        this.zzj = zzdnzVar.zzh;
        this.zzd = zzdnzVar.zzc;
        this.zzk = zzdnzVar.zzi;
        this.zzl = zzdnzVar.zzj;
    }

    public final /* synthetic */ zzcfk zza(zzcfk zzcfkVar) {
        zzcfkVar.zzag("/result", this.zzh);
        zzchc zzchcVarZzN = zzcfkVar.zzN();
        b bVar = new b(this.zzc, null);
        zzedp zzedpVar = this.zzi;
        zzflr zzflrVar = this.zzj;
        zzdsm zzdsmVar = this.zzd;
        zzdnp zzdnpVar = this.zza;
        zzchcVarZzN.zzU(null, zzdnpVar, zzdnpVar, zzdnpVar, zzdnpVar, false, null, bVar, null, null, zzedpVar, zzflrVar, zzdsmVar, null, null, null, null, null, null);
        return zzcfkVar;
    }

    public final /* synthetic */ m9.a zzf(String str, JSONObject jSONObject, zzcfk zzcfkVar) throws Exception {
        return this.zzh.zzb(zzcfkVar, str, jSONObject);
    }

    public final synchronized m9.a zzg(final String str, final JSONObject jSONObject) {
        m9.a aVar = this.zzm;
        if (aVar == null) {
            return zzgei.zzh(null);
        }
        return zzgei.zzn(aVar, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdnq
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzf(str, jSONObject, (zzcfk) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzh(zzfet zzfetVar, zzfew zzfewVar, zzcnb zzcnbVar) {
        m9.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgei.zzr(aVar, new zzdnw(this, zzfetVar, zzfewVar, zzcnbVar), this.zze);
    }

    public final synchronized void zzi() {
        m9.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgei.zzr(aVar, new zzdns(this), this.zze);
        this.zzm = null;
    }

    public final synchronized void zzj(String str, Map map) {
        m9.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgei.zzr(aVar, new zzdnv(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzk() {
        final String str = (String) t.f3437d.f3440c.zza(zzbcn.zzdP);
        final Context context = this.zzc;
        final zzavc zzavcVar = this.zzf;
        final i6.a aVar = this.zzg;
        final d6.a aVar2 = this.zzb;
        final zzeea zzeeaVar = this.zzk;
        final zzffs zzffsVar = this.zzl;
        m9.a aVarZzm = zzgei.zzm(zzgei.zzk(new zzgdo() { // from class: com.google.android.gms.internal.ads.zzcfv
            @Override // com.google.android.gms.internal.ads.zzgdo
            public final m9.a zza() throws zzcfw {
                zzcfx zzcfxVar = p.C.f2980d;
                Context context2 = context;
                zzche zzcheVarZza = zzche.zza();
                zzavc zzavcVar2 = zzavcVar;
                zzeea zzeeaVar2 = zzeeaVar;
                d6.a aVar3 = aVar2;
                zzcfk zzcfkVarZza = zzcfx.zza(context2, zzcheVarZza, "", false, false, zzavcVar2, null, aVar, null, null, aVar3, zzbbl.zza(), null, null, zzeeaVar2, zzffsVar);
                final zzcan zzcanVarZza = zzcan.zza((Object) zzcfkVarZza);
                zzcfkVarZza.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzcfu
                    @Override // com.google.android.gms.internal.ads.zzcha
                    public final void zza(boolean z4, int i, String str2, String str3) {
                        zzcanVarZza.zzb();
                    }
                });
                zzcfkVarZza.loadUrl(str);
                return zzcanVarZza;
            }
        }, zzcaj.zze), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdnr
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzcfk zzcfkVar = (zzcfk) obj;
                this.zza.zza(zzcfkVar);
                return zzcfkVar;
            }
        }, this.zze);
        this.zzm = aVarZzm;
        zzcam.zza(aVarZzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzbjr zzbjrVar) {
        m9.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgei.zzr(aVar, new zzdnt(this, str, zzbjrVar), this.zze);
    }

    public final void zzm(WeakReference weakReference, String str, zzbjr zzbjrVar) {
        zzl(str, new zzdoa(this, weakReference, str, zzbjrVar, null));
    }

    public final synchronized void zzn(String str, zzbjr zzbjrVar) {
        m9.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgei.zzr(aVar, new zzdnu(this, str, zzbjrVar), this.zze);
    }
}
