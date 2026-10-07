package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrk {
    public final int zza;
    public final zzur zzb;
    private final CopyOnWriteArrayList zzc;

    private zzrk(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzur zzurVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzurVar;
    }

    public final zzrk zza(int i, zzur zzurVar) {
        return new zzrk(this.zzc, 0, zzurVar);
    }

    public final void zzb(Handler handler, zzrl zzrlVar) {
        this.zzc.add(new zzrj(handler, zzrlVar));
    }

    public final void zzc(zzrl zzrlVar) {
        for (zzrj zzrjVar : this.zzc) {
            if (zzrjVar.zza == zzrlVar) {
                this.zzc.remove(zzrjVar);
            }
        }
    }

    public zzrk() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
