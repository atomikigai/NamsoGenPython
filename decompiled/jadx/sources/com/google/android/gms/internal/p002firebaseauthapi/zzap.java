package com.google.android.gms.internal.p002firebaseauthapi;

import da.v;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzap implements Map, Serializable {
    private transient zzaq zza;
    private transient zzaq zzb;
    private transient zzai zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public static zzap zzc(Iterable iterable) {
        zzao zzaoVar = new zzao(iterable instanceof Collection ? iterable.size() : 4);
        zzaoVar.zza(iterable);
        zzan zzanVar = zzaoVar.zzc;
        if (zzanVar != null) {
            throw zzanVar.zza();
        }
        zzax zzaxVarZzg = zzax.zzg(zzaoVar.zzb, zzaoVar.zza, zzaoVar);
        zzan zzanVar2 = zzaoVar.zzc;
        if (zzanVar2 == null) {
            return zzaxVarZzg;
        }
        throw zzanVar2.zza();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzay.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzaq zzaqVar = this.zzb;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq zzaqVarZze = zze();
        this.zzb = zzaqVarZze;
        return zzaqVarZze;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(v.f(size, "size cannot be negative but was: "));
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z4 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z4) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z4 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public abstract zzai zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzai values() {
        zzai zzaiVar = this.zzc;
        if (zzaiVar != null) {
            return zzaiVar;
        }
        zzai zzaiVarZza = zza();
        this.zzc = zzaiVarZza;
        return zzaiVarZza;
    }

    public abstract zzaq zzd();

    public abstract zzaq zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzaq entrySet() {
        zzaq zzaqVar = this.zza;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq zzaqVarZzd = zzd();
        this.zza = zzaqVarZzd;
        return zzaqVarZzd;
    }
}
