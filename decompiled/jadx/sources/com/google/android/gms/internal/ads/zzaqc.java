package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaqc implements zzapo {
    private final Map zza = new HashMap();
    private final zzapb zzb;
    private final BlockingQueue zzc;
    private final zzapg zzd;

    public zzaqc(zzapb zzapbVar, BlockingQueue blockingQueue, zzapg zzapgVar) {
        this.zzd = zzapgVar;
        this.zzb = zzapbVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final synchronized void zza(zzapp zzappVar) {
        try {
            Map map = this.zza;
            String strZzj = zzappVar.zzj();
            List list = (List) map.remove(strZzj);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzaqb.zzb) {
                zzaqb.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
            }
            zzapp zzappVar2 = (zzapp) list.remove(0);
            this.zza.put(strZzj, list);
            zzappVar2.zzu(this);
            try {
                this.zzc.put(zzappVar2);
            } catch (InterruptedException e) {
                zzaqb.zzb("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.zzb.zzb();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zzb(zzapp zzappVar, zzapv zzapvVar) {
        List list;
        zzaoy zzaoyVar = zzapvVar.zzb;
        if (zzaoyVar == null || zzaoyVar.zza(System.currentTimeMillis())) {
            zza(zzappVar);
            return;
        }
        String strZzj = zzappVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(strZzj);
        }
        if (list != null) {
            if (zzaqb.zzb) {
                zzaqb.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zzb((zzapp) it.next(), zzapvVar, null);
            }
        }
    }

    public final synchronized boolean zzc(zzapp zzappVar) {
        try {
            Map map = this.zza;
            String strZzj = zzappVar.zzj();
            if (!map.containsKey(strZzj)) {
                this.zza.put(strZzj, null);
                zzappVar.zzu(this);
                if (zzaqb.zzb) {
                    zzaqb.zza("new request, sending to network %s", strZzj);
                }
                return false;
            }
            List arrayList = (List) this.zza.get(strZzj);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            zzappVar.zzm("waiting-for-response");
            arrayList.add(zzappVar);
            this.zza.put(strZzj, arrayList);
            if (zzaqb.zzb) {
                zzaqb.zza("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
