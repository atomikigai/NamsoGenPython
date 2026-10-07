package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfnr {
    private static final zzfnr zza = new zzfnr();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfnr() {
    }

    public static zzfnr zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfna zzfnaVar) {
        this.zzb.add(zzfnaVar);
    }

    public final void zze(zzfna zzfnaVar) {
        ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzfnaVar);
        this.zzc.remove(zzfnaVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfnz.zzb().zzg();
    }

    public final void zzf(zzfna zzfnaVar) {
        ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzfnaVar);
        if (zZzg) {
            return;
        }
        zzfnz.zzb().zzf();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
