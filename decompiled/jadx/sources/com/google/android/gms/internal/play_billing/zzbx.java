package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbx extends zzbq implements Set {
    private transient zzbt zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzcg.zza(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public zzbt zzd() {
        zzbt zzbtVar = this.zza;
        if (zzbtVar != null) {
            return zzbtVar;
        }
        zzbt zzbtVarZzh = zzh();
        this.zza = zzbtVarZzh;
        return zzbtVarZzh;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze */
    public abstract zzch iterator();

    public zzbt zzh() {
        Object[] array = toArray();
        int i = zzbt.zzd;
        return zzbt.zzi(array, array.length);
    }
}
