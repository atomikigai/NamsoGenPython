package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcz extends zzda {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzda zzc;

    public zzcz(zzda zzdaVar, int i, int i10) {
        this.zzc = zzdaVar;
        this.zza = i;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzct.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzda subList(int i, int i10) {
        zzct.zzc(i, i10, this.zzb);
        int i11 = this.zza;
        return this.zzc.subList(i + i11, i10 + i11);
    }
}
