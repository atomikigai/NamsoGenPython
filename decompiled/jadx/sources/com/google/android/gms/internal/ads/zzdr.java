package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdr {
    public final Object zza;
    private zzx zzb = new zzx();
    private boolean zzc;
    private boolean zzd;

    public zzdr(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdr.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzdr) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, zzdp zzdpVar) {
        if (this.zzd) {
            return;
        }
        if (i != -1) {
            this.zzb.zza(i);
        }
        this.zzc = true;
        zzdpVar.zza(this.zza);
    }

    public final void zzb(zzdq zzdqVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzz zzzVarZzb = this.zzb.zzb();
        this.zzb = new zzx();
        this.zzc = false;
        zzdqVar.zza(this.zza, zzzVarZzb);
    }

    public final void zzc(zzdq zzdqVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdqVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
