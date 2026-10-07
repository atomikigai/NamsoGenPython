package com.google.android.gms.internal.ads;

import d6.p;
import h6.k0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzdcc {
    protected final Map zza = new HashMap();

    public zzdcc(Set set) {
        zzp(set);
    }

    public final synchronized void zzk(zzded zzdedVar) {
        zzo(zzdedVar.zza, zzdedVar.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((zzded) it.next());
        }
    }

    public final synchronized void zzq(final zzdcb zzdcbVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdca
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdcbVar.zza(key);
                    } catch (Throwable th) {
                        p.C.f2982g.zzv(th, "EventEmitter.notify");
                        k0.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
