package com.google.android.gms.internal.ads;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfwv extends zzfwo {
    private final Object zza;

    public zzfwv(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfwv) {
            return this.zza.equals(((zzfwv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return v.i("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwo zza(zzfwh zzfwhVar) {
        Object objApply = zzfwhVar.apply(this.zza);
        zzfwq.zzc(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzfwv(objApply);
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
