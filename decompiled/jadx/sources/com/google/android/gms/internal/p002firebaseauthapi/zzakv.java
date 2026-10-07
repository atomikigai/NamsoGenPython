package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzakv {
    private static final zzajx zzb = zzajx.zza;
    protected volatile zzalp zza;
    private volatile zzajf zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzakv)) {
            return false;
        }
        zzakv zzakvVar = (zzakv) obj;
        zzalp zzalpVar = this.zza;
        zzalp zzalpVar2 = zzakvVar.zza;
        if (zzalpVar == null && zzalpVar2 == null) {
            return zzb().equals(zzakvVar.zzb());
        }
        if (zzalpVar != null && zzalpVar2 != null) {
            return zzalpVar.equals(zzalpVar2);
        }
        if (zzalpVar != null) {
            zzakvVar.zzc(zzalpVar.zzM());
            return zzalpVar.equals(zzakvVar.zza);
        }
        zzc(zzalpVar2.zzM());
        return this.zza.equals(zzalpVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzajc) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzs();
        }
        return 0;
    }

    public final zzajf zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            try {
                if (this.zzc != null) {
                    return this.zzc;
                }
                if (this.zza == null) {
                    this.zzc = zzajf.zzb;
                } else {
                    this.zzc = this.zza.zzo();
                }
                return this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzalp zzalpVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzalpVar;
                    this.zzc = zzajf.zzb;
                } catch (zzaks unused) {
                    this.zza = zzalpVar;
                    this.zzc = zzajf.zzb;
                }
            }
        }
    }
}
