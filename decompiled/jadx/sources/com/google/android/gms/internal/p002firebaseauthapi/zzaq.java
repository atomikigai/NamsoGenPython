package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzaq extends zzai implements Set {
    private transient zzam zza;

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
        return zzay.zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzaz iterator();

    public final zzam zzf() {
        zzam zzamVar = this.zza;
        if (zzamVar != null) {
            return zzamVar;
        }
        zzam zzamVarZzg = zzg();
        this.zza = zzamVarZzg;
        return zzamVarZzg;
    }

    public zzam zzg() {
        Object[] array = toArray();
        int i = zzam.zzd;
        return zzam.zzg(array, array.length);
    }
}
