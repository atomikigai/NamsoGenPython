package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.i0;
import h6.k0;
import h6.r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbnt extends zzcav {
    private final r zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbnt(r rVar) {
        this.zzb = rVar;
    }

    public final zzbno zza() {
        zzbno zzbnoVar = new zzbno(this);
        k0.k("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            k0.k("createNewReference: Lock acquired");
            zzj(new zzbnp(this, zzbnoVar), new zzbnq(this, zzbnoVar));
            i0.l(this.zzd >= 0);
            this.zzd++;
        }
        k0.k("createNewReference: Lock released");
        return zzbnoVar;
    }

    public final void zzb() {
        k0.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            k0.k("markAsDestroyable: Lock acquired");
            i0.l(this.zzd >= 0);
            k0.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
        k0.k("markAsDestroyable: Lock released");
    }

    public final void zzc() {
        k0.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                k0.k("maybeDestroy: Lock acquired");
                i0.l(this.zzd >= 0);
                if (this.zzc && this.zzd == 0) {
                    k0.k("No reference is left (including root). Cleaning up engine.");
                    zzj(new zzbns(this), new zzcar());
                } else {
                    k0.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        k0.k("maybeDestroy: Lock released");
    }

    public final void zzd() {
        k0.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            k0.k("releaseOneReference: Lock acquired");
            i0.l(this.zzd > 0);
            k0.k("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
        k0.k("releaseOneReference: Lock released");
    }
}
