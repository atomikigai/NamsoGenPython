package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzazg {
    private final Object zza = new Object();
    private zzaze zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            try {
                zzaze zzazeVar = this.zzb;
                if (zzazeVar == null) {
                    return null;
                }
                return zzazeVar.zza();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            try {
                zzaze zzazeVar = this.zzb;
                if (zzazeVar == null) {
                    return null;
                }
                return zzazeVar.zzb();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzazf zzazfVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzaze();
                }
                this.zzb.zzf(zzazfVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            try {
                if (!this.zzc) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        h.g("Can not cast Context to Application");
                        return;
                    }
                    if (this.zzb == null) {
                        this.zzb = new zzaze();
                    }
                    this.zzb.zzg(application, context);
                    this.zzc = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze(zzazf zzazfVar) {
        synchronized (this.zza) {
            try {
                zzaze zzazeVar = this.zzb;
                if (zzazeVar == null) {
                    return;
                }
                zzazeVar.zzh(zzazfVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
