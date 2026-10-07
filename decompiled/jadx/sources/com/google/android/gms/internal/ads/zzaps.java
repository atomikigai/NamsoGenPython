package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaps {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaoz zze;
    private final zzapi zzf;
    private final zzapj[] zzg;
    private zzapb zzh;
    private final List zzi;
    private final List zzj;
    private final zzapg zzk;

    public zzaps(zzaoz zzaozVar, zzapi zzapiVar, int i) {
        zzapg zzapgVar = new zzapg(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzaozVar;
        this.zzf = zzapiVar;
        this.zzg = new zzapj[4];
        this.zzk = zzapgVar;
    }

    public final zzapp zza(zzapp zzappVar) {
        zzappVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzappVar);
        }
        zzappVar.zzg(this.zza.incrementAndGet());
        zzappVar.zzm("add-to-queue");
        zzc(zzappVar, 0);
        this.zzc.add(zzappVar);
        return zzappVar;
    }

    public final void zzb(zzapp zzappVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzappVar);
        }
        synchronized (this.zzi) {
            try {
                Iterator it = this.zzi.iterator();
                while (it.hasNext()) {
                    ((zzapr) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzc(zzappVar, 5);
    }

    public final void zzc(zzapp zzappVar, int i) {
        synchronized (this.zzj) {
            try {
                Iterator it = this.zzj.iterator();
                while (it.hasNext()) {
                    ((zzapq) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd() {
        zzapb zzapbVar = this.zzh;
        if (zzapbVar != null) {
            zzapbVar.zzb();
        }
        zzapj[] zzapjVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzapj zzapjVar = zzapjVarArr[i];
            if (zzapjVar != null) {
                zzapjVar.zza();
            }
        }
        zzapb zzapbVar2 = new zzapb(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzapbVar2;
        zzapbVar2.start();
        for (int i10 = 0; i10 < 4; i10++) {
            zzapj zzapjVar2 = new zzapj(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i10] = zzapjVar2;
            zzapjVar2.start();
        }
    }
}
