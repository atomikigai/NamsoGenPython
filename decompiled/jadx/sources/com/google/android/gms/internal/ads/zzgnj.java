package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgnj {
    private final zzgnd zza;
    private final List zzb;
    private final Integer zzc;

    public /* synthetic */ zzgnj(zzgnd zzgndVar, List list, Integer num, zzgni zzgniVar) {
        this.zza = zzgndVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnj)) {
            return false;
        }
        zzgnj zzgnjVar = (zzgnj) obj;
        return this.zza.equals(zzgnjVar.zza) && this.zzb.equals(zzgnjVar.zzb) && Objects.equals(this.zzc, zzgnjVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
