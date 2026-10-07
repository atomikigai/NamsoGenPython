package com.google.android.gms.internal.ads;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzado {
    public final zzadr zza;
    public final zzadr zzb;

    public zzado(zzadr zzadrVar, zzadr zzadrVar2) {
        this.zza = zzadrVar;
        this.zzb = zzadrVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzado.class == obj.getClass()) {
            zzado zzadoVar = (zzado) obj;
            if (this.zza.equals(zzadoVar.zza) && this.zzb.equals(zzadoVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        zzadr zzadrVar = this.zza;
        return v.j("[", zzadrVar.toString(), zzadrVar.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString()), "]");
    }
}
