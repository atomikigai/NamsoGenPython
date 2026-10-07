package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import e6.f2;
import e6.f3;
import e6.g3;
import e6.o2;
import e6.p3;
import e6.s;
import e6.v0;
import i6.h;
import r6.b;
import r6.c;
import r6.e;
import w5.k;
import w5.p;
import w5.q;
import w5.t;
import wa.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbxl extends c {
    private final String zza;
    private final zzbxc zzb;
    private final Context zzc;
    private final zzbxu zzd;
    private v0 zze;
    private r6.a zzf;
    private p zzg;
    private k zzh;
    private final long zzi;
    private final Object zzj;

    public zzbxl(Context context, String str, zzbxc zzbxcVar, zzbxu zzbxuVar) {
        this.zzi = System.currentTimeMillis();
        this.zzj = new Object();
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = zzbxcVar;
        this.zzd = zzbxuVar;
    }

    private final void zzd(Context context, zzbpg zzbpgVar) {
        synchronized (this.zzj) {
            try {
                if (this.zze == null) {
                    this.zze = s.f3427f.f3429b.f(context, zzbpgVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle getAdMetadata() {
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                return zzbxcVar.zzb();
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        return this.zza;
    }

    public final k getFullScreenContentCallback() {
        return this.zzh;
    }

    public final r6.a getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    public final p getOnPaidEventListener() {
        return null;
    }

    @Override // r6.c
    public final t getResponseInfo() {
        f2 f2VarZzc = null;
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                f2VarZzc = zzbxcVar.zzc();
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
        return new t(f2VarZzc);
    }

    public final b getRewardItem() {
        d dVar = b.f8195l;
        try {
            zzbxc zzbxcVar = this.zzb;
            zzbwz zzbwzVarZzd = zzbxcVar != null ? zzbxcVar.zzd() : null;
            return zzbwzVarZzd == null ? dVar : new zzbxm(zzbwzVarZzd);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            return dVar;
        }
    }

    public final void setFullScreenContentCallback(k kVar) {
        this.zzh = kVar;
        this.zzd.zzb(kVar);
    }

    public final void setImmersiveMode(boolean z4) {
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbxcVar.zzh(z4);
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void setOnAdMetadataChangedListener(r6.a aVar) {
        try {
            this.zzf = aVar;
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbxcVar.zzi(new f3(aVar));
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(p pVar) {
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbxcVar.zzj(new g3());
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // r6.c
    public final void show(Activity activity, q qVar) {
        this.zzd.zzc(qVar);
        if (activity == null) {
            h.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbxcVar.zzk(this.zzd);
                this.zzb.zzm(new q7.b(activity));
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final c zza() {
        try {
            zzd(this.zzc, new zzbpc());
            zzbxc zzbxcVarZzg = this.zze.zzg(this.zza);
            if (zzbxcVarZzg != null) {
                return new zzbxl(this.zzc, this.zza, zzbxcVarZzg, this.zzd);
            }
            h.i("Failed to obtain a Rewarded Ad from the preloader.", null);
            return null;
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void zzb(o2 o2Var, r6.d dVar) {
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                o2Var.f3370j = this.zzi;
                zzbxcVar.zzf(p3.a(this.zzc, o2Var), new zzbxp(dVar, this));
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzc() {
        try {
            zzd(this.zzc, new zzbpc());
            return this.zze.zzl(this.zza);
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            return false;
        }
    }

    public zzbxl(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        e6.q qVar = s.f3427f.f3429b;
        zzbpc zzbpcVar = new zzbpc();
        qVar.getClass();
        this(applicationContext, str, (zzbxc) new e6.b(context, str, zzbpcVar).d(context, false), new zzbxu());
    }

    public final void setServerSideVerificationOptions(e eVar) {
    }
}
