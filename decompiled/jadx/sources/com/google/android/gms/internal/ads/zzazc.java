package com.google.android.gms.internal.ads;

import d6.p;
import h6.n0;
import i6.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzazc {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final void zza(zzazb zzazbVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc.size() >= 10) {
                    h.b("Queue is full, current size = " + this.zzc.size());
                    this.zzc.remove(0);
                }
                int i = this.zza;
                this.zza = i + 1;
                zzazbVar.zzg(i);
                zzazbVar.zzk();
                this.zzc.add(zzazbVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzazb zzazbVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzazb zzazbVar2 = (zzazb) it.next();
                    p pVar = p.C;
                    if (((n0) pVar.f2982g.zzi()).i()) {
                        if (!((n0) pVar.f2982g.zzi()).j() && !zzazbVar.equals(zzazbVar2) && zzazbVar2.zzd().equals(zzazbVar.zzd())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzazbVar.equals(zzazbVar2) && zzazbVar2.zzc().equals(zzazbVar.zzc())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(zzazb zzazbVar) {
        synchronized (this.zzb) {
            try {
                return this.zzc.contains(zzazbVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
