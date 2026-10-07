package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e6.i2;
import e6.j2;
import e6.l2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdix extends i2 {
    private final Object zza = new Object();
    private final j2 zzb;
    private final zzbpv zzc;

    public zzdix(j2 j2Var, zzbpv zzbpvVar) {
        this.zzb = j2Var;
        this.zzc = zzbpvVar;
    }

    @Override // e6.j2
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // e6.j2
    public final float zzf() throws RemoteException {
        zzbpv zzbpvVar = this.zzc;
        if (zzbpvVar != null) {
            return zzbpvVar.zzg();
        }
        return 0.0f;
    }

    @Override // e6.j2
    public final float zzg() throws RemoteException {
        zzbpv zzbpvVar = this.zzc;
        if (zzbpvVar != null) {
            return zzbpvVar.zzh();
        }
        return 0.0f;
    }

    @Override // e6.j2
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // e6.j2
    public final l2 zzi() throws RemoteException {
        synchronized (this.zza) {
            try {
                j2 j2Var = this.zzb;
                if (j2Var == null) {
                    return null;
                }
                return j2Var.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e6.j2
    public final void zzj(boolean z4) throws RemoteException {
        throw new RemoteException();
    }

    @Override // e6.j2
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // e6.j2
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // e6.j2
    public final void zzm(l2 l2Var) throws RemoteException {
        synchronized (this.zza) {
            try {
                j2 j2Var = this.zzb;
                if (j2Var != null) {
                    j2Var.zzm(l2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e6.j2
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // e6.j2
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // e6.j2
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // e6.j2
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
