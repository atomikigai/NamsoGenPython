package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzoj {
    public final String zza;
    private final zzoi zzb;
    private final Object zzc;

    static {
        if (zzen.zza < 31) {
            new zzoj("");
        } else {
            int i = zzoi.zzb;
        }
    }

    public zzoj(LogSessionId logSessionId, String str) {
        this.zzb = new zzoi(logSessionId);
        this.zza = str;
        this.zzc = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoj)) {
            return false;
        }
        zzoj zzojVar = (zzoj) obj;
        return Objects.equals(this.zza, zzojVar.zza) && Objects.equals(this.zzb, zzojVar.zzb) && Objects.equals(this.zzc, zzojVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc);
    }

    public final LogSessionId zza() {
        zzoi zzoiVar = this.zzb;
        zzoiVar.getClass();
        return zzoiVar.zza;
    }

    public zzoj(String str) {
        zzdb.zzf(zzen.zza < 31);
        this.zza = str;
        this.zzb = null;
        this.zzc = new Object();
    }
}
