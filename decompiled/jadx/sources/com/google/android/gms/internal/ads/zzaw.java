package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaw {
    public final String zza;
    public final zzar zzb;
    public final zzaq zzc;
    public final zzba zzd;
    public final zzam zze;
    public final zzat zzf;

    static {
        new zzak().zzc();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzaw(String str, zzan zzanVar, zzar zzarVar, zzaq zzaqVar, zzba zzbaVar, zzat zzatVar, zzav zzavVar) {
        this.zza = str;
        this.zzb = zzarVar;
        this.zzc = zzaqVar;
        this.zzd = zzbaVar;
        this.zze = zzanVar;
        this.zzf = zzatVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        zzaw zzawVar = (zzaw) obj;
        return Objects.equals(this.zza, zzawVar.zza) && this.zze.equals(zzawVar.zze) && Objects.equals(this.zzb, zzawVar.zzb) && Objects.equals(this.zzc, zzawVar.zzc) && Objects.equals(this.zzd, zzawVar.zzd) && Objects.equals(this.zzf, zzawVar.zzf);
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() * 31;
        zzar zzarVar = this.zzb;
        return (this.zzd.hashCode() + ((this.zze.hashCode() + ((this.zzc.hashCode() + ((iHashCode + (zzarVar != null ? zzarVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
