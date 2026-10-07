package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import d6.p;
import e6.i3;
import e6.j1;
import e6.t;
import e6.u1;
import h6.j;
import h6.n0;
import h6.r0;
import i6.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzckp extends j1 {
    private final Context zza;
    private final i6.a zzb;
    private final zzdqd zzc;
    private final zzefd zzd;
    private final zzelo zze;
    private final zzdup zzf;
    private final zzbyv zzg;
    private final zzdqi zzh;
    private final zzdvk zzi;
    private final zzbfg zzj;
    private final zzfko zzk;
    private final zzfgk zzl;
    private final zzcue zzm;
    private final zzdsm zzn;
    private boolean zzo = false;
    private final Long zzp;

    public zzckp(Context context, i6.a aVar, zzdqd zzdqdVar, zzefd zzefdVar, zzelo zzeloVar, zzdup zzdupVar, zzbyv zzbyvVar, zzdqi zzdqiVar, zzdvk zzdvkVar, zzbfg zzbfgVar, zzfko zzfkoVar, zzfgk zzfgkVar, zzcue zzcueVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = zzdqdVar;
        this.zzd = zzefdVar;
        this.zze = zzeloVar;
        this.zzf = zzdupVar;
        this.zzg = zzbyvVar;
        this.zzh = zzdqiVar;
        this.zzi = zzdvkVar;
        this.zzj = zzbfgVar;
        this.zzk = zzfkoVar;
        this.zzl = zzfgkVar;
        this.zzm = zzcueVar;
        this.zzn = zzdsmVar;
        p.C.f2983j.getClass();
        this.zzp = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public final void zzb() {
        boolean z4;
        String str;
        p pVar = p.C;
        n0 n0Var = (n0) pVar.f2982g.zzi();
        n0Var.l();
        synchronized (n0Var.f5036a) {
            z4 = n0Var.f5057y;
        }
        if (z4) {
            n0 n0Var2 = (n0) pVar.f2982g.zzi();
            n0Var2.l();
            synchronized (n0Var2.f5036a) {
                str = n0Var2.f5058z;
            }
            if (pVar.f2987n.l(this.zza, str, this.zzb.f5213a)) {
                return;
            }
            ((n0) pVar.f2982g.zzi()).r(false);
            ((n0) pVar.f2982g.zzi()).q("");
        }
    }

    public final void zzc(Runnable runnable) {
        i0.d("Adapters must be initialized on the main thread.");
        Map mapZze = ((n0) p.C.f2982g.zzi()).n().zze();
        if (mapZze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                h.h("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap map = new HashMap();
            Iterator it = mapZze.values().iterator();
            while (it.hasNext()) {
                for (zzboz zzbozVar : ((zzbpa) it.next()).zza) {
                    String str = zzbozVar.zzb;
                    for (String str2 : zzbozVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzefe zzefeVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzefeVarZza != null) {
                        zzfgm zzfgmVar = (zzfgm) zzefeVarZza.zzb;
                        if (!zzfgmVar.zzC() && zzfgmVar.zzB()) {
                            zzfgmVar.zzj(this.zza, (zzegy) zzefeVarZza.zzc, (List) entry.getValue());
                            h.b("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzffv e) {
                    h.h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    public final /* synthetic */ void zzd() {
        zzfgt.zzb(this.zza, true);
    }

    @Override // e6.k1
    public final synchronized float zze() {
        return p.C.h.a();
    }

    @Override // e6.k1
    public final String zzf() {
        return this.zzb.f5213a;
    }

    @Override // e6.k1
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // e6.k1
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // e6.k1
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // e6.k1
    public final void zzj(boolean z4) throws RemoteException {
        try {
            zzfti.zza(this.zza).zzc(z4);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // e6.k1
    public final synchronized void zzk() {
        if (this.zzo) {
            h.g("Mobile ads is initialized already.");
            return;
        }
        zzbcn.zza(this.zza);
        Context context = this.zza;
        i6.a aVar = this.zzb;
        p pVar = p.C;
        pVar.f2982g.zzu(context, aVar);
        this.zzm.zzd();
        pVar.i.zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zze();
        zzbce zzbceVar = zzbcn.zzec;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            this.zzh.zzd();
        }
        this.zzi.zzg();
        if (((Boolean) tVar.f3440c.zza(zzbcn.zziO)).booleanValue()) {
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzkD)).booleanValue()) {
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckn
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx();
                }
            });
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzda)).booleanValue()) {
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd();
                }
            });
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzeF)).booleanValue()) {
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzeG)).booleanValue()) {
                zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzw();
                    }
                });
            }
        }
    }

    @Override // e6.k1
    public final void zzl(String str, q7.a aVar) {
        String strE;
        Runnable runnable;
        zzbcn.zza(this.zza);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeh)).booleanValue()) {
            try {
                r0 r0Var = p.C.f2979c;
                strE = r0.E(this.zza);
            } catch (RemoteException | RuntimeException e) {
                p.C.f2982g.zzw(e, "NonagonMobileAdsSettingManager_AppId");
                strE = "";
            }
        } else {
            strE = "";
        }
        boolean z4 = true;
        String str2 = true == TextUtils.isEmpty(strE) ? str : strE;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzbce zzbceVar = zzbcn.zzea;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        boolean zBooleanValue = ((Boolean) zzbclVar.zza(zzbceVar)).booleanValue();
        zzbce zzbceVar2 = zzbcn.zzaX;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) zzbclVar2.zza(zzbceVar2)).booleanValue();
        if (((Boolean) zzbclVar2.zza(zzbceVar2)).booleanValue()) {
            final Runnable runnable2 = (Runnable) b.I(aVar);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcko
                @Override // java.lang.Runnable
                public final void run() {
                    zzges zzgesVar = zzcaj.zze;
                    final zzckp zzckpVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzgesVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzckpVar.zzc(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z4 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z4) {
            p.C.f2984k.j(this.zza, this.zzb, true, null, str2, null, runnable3, this.zzk, this.zzn, this.zzp);
        }
    }

    @Override // e6.k1
    public final void zzm(u1 u1Var) throws RemoteException {
        this.zzi.zzh(u1Var, zzdvj.API);
    }

    @Override // e6.k1
    public final void zzn(q7.a aVar, String str) {
        if (aVar == null) {
            h.d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) b.I(aVar);
        if (context == null) {
            h.d("Context is null. Failed to open debug menu.");
            return;
        }
        j jVar = new j(context);
        jVar.f5013d = str;
        jVar.e = this.zzb.f5213a;
        jVar.b();
    }

    @Override // e6.k1
    public final void zzo(zzbpg zzbpgVar) throws RemoteException {
        this.zzl.zzf(zzbpgVar);
    }

    @Override // e6.k1
    public final synchronized void zzp(boolean z4) {
        h6.b bVar = p.C.h;
        synchronized (bVar) {
            bVar.f4971a = z4;
        }
    }

    @Override // e6.k1
    public final synchronized void zzq(float f10) {
        h6.b bVar = p.C.h;
        synchronized (bVar) {
            bVar.f4972b = f10;
        }
    }

    @Override // e6.k1
    public final synchronized void zzr(String str) {
        zzbcn.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzea)).booleanValue()) {
                p.C.f2984k.j(this.zza, this.zzb, true, null, str, null, null, this.zzk, null, null);
            }
        }
    }

    @Override // e6.k1
    public final void zzs(zzblw zzblwVar) throws RemoteException {
        this.zzf.zzs(zzblwVar);
    }

    @Override // e6.k1
    public final void zzt(String str) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zziZ)).booleanValue()) {
            p.C.f2982g.zzz(str);
        }
    }

    @Override // e6.k1
    public final void zzu(i3 i3Var) throws RemoteException {
        this.zzg.zzn(this.zza, i3Var);
    }

    @Override // e6.k1
    public final synchronized boolean zzv() {
        boolean z4;
        h6.b bVar = p.C.h;
        synchronized (bVar) {
            z4 = bVar.f4971a;
        }
        return z4;
    }

    public final void zzw() {
        p.C.f2986m.zzb(this.zza, this.zzn);
    }

    public final /* synthetic */ void zzx() {
        this.zzj.zza(new zzbuo());
    }
}
