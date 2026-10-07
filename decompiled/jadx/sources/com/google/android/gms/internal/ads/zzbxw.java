package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import e6.b;
import e6.f2;
import e6.f3;
import e6.g3;
import e6.o2;
import e6.p3;
import e6.q;
import e6.s;
import i6.h;
import r6.e;
import w5.k;
import w5.p;
import w5.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbxw extends s6.a {
    private final String zza;
    private final zzbxc zzb;
    private final Context zzc;
    private final zzbxu zzd;
    private k zze;
    private r6.a zzf;
    private p zzg;
    private final long zzh = System.currentTimeMillis();

    public zzbxw(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        q qVar = s.f3427f.f3429b;
        zzbpc zzbpcVar = new zzbpc();
        qVar.getClass();
        this.zzb = (zzbxc) new b(context, str, zzbpcVar).d(context, false);
        this.zzd = new zzbxu();
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
        return this.zze;
    }

    public final r6.a getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    public final p getOnPaidEventListener() {
        return null;
    }

    @Override // s6.a
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

    public final r6.b getRewardItem() {
        try {
            zzbxc zzbxcVar = this.zzb;
            zzbwz zzbwzVarZzd = zzbxcVar != null ? zzbxcVar.zzd() : null;
            if (zzbwzVarZzd != null) {
                return new zzbxm(zzbwzVarZzd);
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
        return r6.b.f8195l;
    }

    public final void setFullScreenContentCallback(k kVar) {
        this.zze = kVar;
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
        this.zzf = aVar;
        try {
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

    public final void setServerSideVerificationOptions(e eVar) {
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                zzbxcVar.zzl(new zzbxq(eVar));
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // s6.a
    public final void show(Activity activity, w5.q qVar) {
        this.zzd.zzc(qVar);
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

    public final void zza(o2 o2Var, s6.b bVar) {
        try {
            zzbxc zzbxcVar = this.zzb;
            if (zzbxcVar != null) {
                o2Var.f3370j = this.zzh;
                zzbxcVar.zzg(p3.a(this.zzc, o2Var), new zzbxv(bVar, this));
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }
}
