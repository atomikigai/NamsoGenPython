package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzes extends zzev {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzes(int i, long j4) {
        super(i, null);
        this.zza = j4;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final String toString() {
        List list = this.zzb;
        return zzev.zze(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzes zza(int i) {
        int size = this.zzc.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzes zzesVar = (zzes) this.zzc.get(i10);
            if (zzesVar.zzd == i) {
                return zzesVar;
            }
        }
        return null;
    }

    public final zzet zzb(int i) {
        int size = this.zzb.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzet zzetVar = (zzet) this.zzb.get(i10);
            if (zzetVar.zzd == i) {
                return zzetVar;
            }
        }
        return null;
    }

    public final void zzc(zzes zzesVar) {
        this.zzc.add(zzesVar);
    }

    public final void zzd(zzet zzetVar) {
        this.zzb.add(zzetVar);
    }
}
