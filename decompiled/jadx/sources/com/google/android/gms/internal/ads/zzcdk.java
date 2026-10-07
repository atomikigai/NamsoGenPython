package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcdk implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final zzcdj zza(zzccf zzccfVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdj zzcdjVar = (zzcdj) it.next();
            if (zzcdjVar.zza == zzccfVar) {
                return zzcdjVar;
            }
        }
        return null;
    }

    public final void zzb(zzcdj zzcdjVar) {
        this.zza.add(zzcdjVar);
    }

    public final void zzc(zzcdj zzcdjVar) {
        this.zza.remove(zzcdjVar);
    }

    public final boolean zzd(zzccf zzccfVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdj zzcdjVar = (zzcdj) it.next();
            if (zzcdjVar.zza == zzccfVar) {
                arrayList.add(zzcdjVar);
            }
        }
        int i = 0;
        if (arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zzcdj) obj).zzb.zzf();
        }
        return true;
    }
}
