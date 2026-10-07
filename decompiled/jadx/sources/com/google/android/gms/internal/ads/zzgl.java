package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgl implements zzgc {
    private zzhd zzb;
    private String zzc;
    private boolean zzf;
    private final zzgx zza = new zzgx();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzgl zzb(boolean z4) {
        this.zzf = true;
        return this;
    }

    public final zzgl zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzgl zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzgl zze(zzhd zzhdVar) {
        this.zzb = zzhdVar;
        return this;
    }

    public final zzgl zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgq zza() {
        zzgq zzgqVar = new zzgq(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzhd zzhdVar = this.zzb;
        if (zzhdVar != null) {
            zzgqVar.zzf(zzhdVar);
        }
        return zzgqVar;
    }
}
