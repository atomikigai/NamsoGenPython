package com.google.android.recaptcha.internal;

import jd.l;
import pc.g;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzu implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strO0 = g.o0(10, String.valueOf(this.zzb / ((long) this.zza)));
        String strO1 = g.o0(10, String.valueOf(this.zzc));
        String strO2 = g.o0(10, String.valueOf(this.zzb));
        String strO3 = g.o0(5, String.valueOf(this.zza));
        StringBuilder sbE = b.e("avgExecutionTime: ", strO0, " us| maxExecutionTime: ", strO1, " us| totalTime: ");
        sbE.append(strO2);
        sbE.append(" us| #Usages: ");
        sbE.append(strO3);
        return sbE.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzu zzuVar) {
        return l.f(Long.valueOf(this.zzb), Long.valueOf(zzuVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j4) {
        this.zzc = j4;
    }

    public final void zzf(long j4) {
        this.zzb = j4;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
