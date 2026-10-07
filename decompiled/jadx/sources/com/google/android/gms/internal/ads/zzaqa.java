package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaqa {
    public static final boolean zza = zzaqb.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzaqb.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j4) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzapz(str, j4, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        long j4;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j4 = 0;
        } else {
            long j10 = ((zzapz) this.zzb.get(0)).zzc;
            List list = this.zzb;
            j4 = ((zzapz) list.get(list.size() - 1)).zzc - j10;
        }
        if (j4 > 0) {
            long j11 = ((zzapz) this.zzb.get(0)).zzc;
            zzaqb.zza("(%-4d ms) %s", Long.valueOf(j4), str);
            for (zzapz zzapzVar : this.zzb) {
                long j12 = zzapzVar.zzc;
                zzaqb.zza("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(zzapzVar.zzb), zzapzVar.zza);
                j11 = j12;
            }
        }
    }
}
