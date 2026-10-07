package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import b9.e;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d6.p;
import e6.t;
import e6.u1;
import g6.l;
import h6.k0;
import i6.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdvv implements l, zzcha {
    private final Context zza;
    private final i6.a zzb;
    private zzdvk zzc;
    private zzcfk zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private u1 zzh;
    private boolean zzi;

    public zzdvv(Context context, i6.a aVar) {
        this.zza = context;
        this.zzb = aVar;
    }

    private final synchronized boolean zzl(u1 u1Var) {
        zzbce zzbceVar = zzbcn.zziz;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            h.g("Ad inspector had an internal error.");
            try {
                u1Var.zze(zzfgq.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            h.g("Ad inspector had an internal error.");
            try {
                p.C.f2982g.zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                u1Var.zze(zzfgq.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            p.C.f2983j.getClass();
            if (System.currentTimeMillis() >= this.zzg + ((long) ((Integer) tVar.f3440c.zza(zzbcn.zziC)).intValue())) {
                return true;
            }
        }
        h.g("Ad inspector cannot be opened because it is already open.");
        try {
            u1Var.zze(zzfgq.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final synchronized void zza(boolean z4, int i, String str, String str2) {
        if (z4) {
            k0.k("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        h.g("Ad inspector failed to load.");
        try {
            p.C.f2982g.zzw(new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            u1 u1Var = this.zzh;
            if (u1Var != null) {
                u1Var.zze(zzfgq.zzd(17, null, null));
            }
        } catch (RemoteException e) {
            p.C.f2982g.zzw(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // g6.l
    public final synchronized void zzdr() {
        this.zzf = true;
        zzk("");
    }

    @Override // g6.l
    public final synchronized void zzdu(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            k0.k("Inspector closed.");
            u1 u1Var = this.zzh;
            if (u1Var != null) {
                try {
                    u1Var.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcfk zzcfkVar = this.zzd;
        if (zzcfkVar == null || zzcfkVar.zzaE()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzh(zzdvk zzdvkVar) {
        this.zzc = zzdvkVar;
    }

    public final /* synthetic */ void zzi(String str) {
        JSONObject jSONObjectZze = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectZze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", jSONObjectZze.toString());
    }

    public final synchronized void zzj(u1 u1Var, zzbkl zzbklVar, zzbke zzbkeVar, zzbjs zzbjsVar) {
        if (zzl(u1Var)) {
            try {
                p pVar = p.C;
                zzcfx zzcfxVar = pVar.f2980d;
                zzcfk zzcfkVarZza = zzcfx.zza(this.zza, zzche.zza(), "", false, false, null, null, this.zzb, null, null, null, zzbbl.zza(), null, null, null, null);
                this.zzd = zzcfkVarZza;
                zzchc zzchcVarZzN = zzcfkVarZza.zzN();
                if (zzchcVarZzN == null) {
                    h.g("Failed to obtain a web view for the ad inspector");
                    try {
                        pVar.f2982g.zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        u1Var.zze(zzfgq.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        p.C.f2982g.zzw(e, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = u1Var;
                zzchcVarZzN.zzU(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbklVar, null, new zzbkk(this.zza), zzbkeVar, zzbjsVar, null);
                zzchcVarZzN.zzB(this);
                this.zzd.loadUrl((String) t.f3437d.f3440c.zza(zzbcn.zziA));
                e.y(this.zza, new AdOverlayInfoParcel(this, this.zzd, this.zzb), true);
                pVar.f2983j.getClass();
                this.zzg = System.currentTimeMillis();
            } catch (zzcfw e4) {
                h.h("Failed to obtain a web view for the ad inspector", e4);
                try {
                    p.C.f2982g.zzw(e4, "InspectorUi.openInspector 0");
                    u1Var.zze(zzfgq.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e10) {
                    p.C.f2982g.zzw(e10, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvu
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(str);
                }
            });
        }
    }

    @Override // g6.l
    public final void zzdH() {
    }

    @Override // g6.l
    public final void zzdk() {
    }

    @Override // g6.l
    public final void zzdq() {
    }

    @Override // g6.l
    public final void zzdt() {
    }
}
