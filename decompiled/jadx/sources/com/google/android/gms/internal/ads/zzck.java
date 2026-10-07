package com.google.android.gms.internal.ads;

import java.util.Arrays;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzck {
    public static final zzck zza = new zzck(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzck(int i, int i10, int i11) {
        this.zzb = i;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = zzen.zzJ(i11) ? zzen.zzk(i11) * i10 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzck zzckVar = (zzck) obj;
        return this.zzb == zzckVar.zzb && this.zzc == zzckVar.zzc && this.zzd == zzckVar.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.zzb);
        sb2.append(", channelCount=");
        sb2.append(this.zzc);
        sb2.append(", encoding=");
        return b.c(sb2, this.zzd, "]");
    }
}
