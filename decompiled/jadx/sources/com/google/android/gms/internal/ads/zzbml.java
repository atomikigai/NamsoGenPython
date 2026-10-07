package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import e6.f2;
import e6.g3;
import e6.m0;
import e6.m3;
import e6.o2;
import e6.p3;
import e6.q;
import e6.q3;
import e6.s;
import e6.u;
import i6.h;
import q7.b;
import w5.d;
import w5.k;
import w5.l;
import w5.p;
import w5.t;
import x5.c;
import x5.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbml extends c {
    private final Context zza;
    private final p3 zzb;
    private final m0 zzc;
    private final String zzd;
    private final zzbpc zze;
    private final long zzf;
    private e zzg;
    private k zzh;
    private p zzi;

    public zzbml(Context context, String str) {
        zzbpc zzbpcVar = new zzbpc();
        this.zze = zzbpcVar;
        this.zzf = System.currentTimeMillis();
        this.zza = context;
        this.zzd = str;
        this.zzb = p3.f3389a;
        q qVar = s.f3427f.f3429b;
        q3 q3Var = new q3();
        qVar.getClass();
        this.zzc = (m0) new e6.k(qVar, context, q3Var, str, zzbpcVar).d(context, false);
    }

    public final String getAdUnitId() {
        return this.zzd;
    }

    public final e getAppEventListener() {
        return this.zzg;
    }

    public final k getFullScreenContentCallback() {
        return this.zzh;
    }

    public final p getOnPaidEventListener() {
        return null;
    }

    @Override // j6.a
    public final t getResponseInfo() {
        f2 f2VarZzk = null;
        try {
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                f2VarZzk = m0Var.zzk();
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
        return new t(f2VarZzk);
    }

    public final void setAppEventListener(e eVar) {
        try {
            this.zzg = eVar;
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                m0Var.zzG(eVar != null ? new zzaza(eVar) : null);
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // j6.a
    public final void setFullScreenContentCallback(k kVar) {
        try {
            this.zzh = kVar;
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                m0Var.zzJ(new u(kVar));
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // j6.a
    public final void setImmersiveMode(boolean z4) {
        try {
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                m0Var.zzL(z4);
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(p pVar) {
        try {
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                m0Var.zzP(new g3());
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    @Override // j6.a
    public final void show(Activity activity) {
        if (activity == null) {
            h.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                m0Var.zzW(new b(activity));
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
        }
    }

    public final void zza(o2 o2Var, d dVar) {
        try {
            m0 m0Var = this.zzc;
            if (m0Var != null) {
                o2Var.f3370j = this.zzf;
                p3 p3Var = this.zzb;
                Context context = this.zza;
                p3Var.getClass();
                m0Var.zzy(p3.a(context, o2Var), new m3(dVar, this));
            }
        } catch (RemoteException e) {
            h.i("#007 Could not call remote method.", e);
            dVar.onAdFailedToLoad(new l(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }

    public zzbml(Context context, String str, m0 m0Var) {
        this.zze = new zzbpc();
        this.zzf = System.currentTimeMillis();
        this.zza = context;
        this.zzd = str;
        this.zzb = p3.f3389a;
        this.zzc = m0Var;
    }
}
