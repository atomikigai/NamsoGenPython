package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfs implements Comparable {
    private long zzc;
    private long zzb = -9223372036854775807L;
    private final zzed zza = new zzed();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfs zzfsVar = (zzfs) obj;
        int iCompare = Long.compare(this.zzb, zzfsVar.zzb);
        return iCompare != 0 ? iCompare : Long.compare(this.zzc, zzfsVar.zzc);
    }

    public final void zzc(long j4, long j10, zzed zzedVar) {
        zzdb.zzf(j4 != -9223372036854775807L);
        this.zzb = j4;
        this.zzc = j10;
        this.zza.zzI(zzedVar.zzb());
        System.arraycopy(zzedVar.zzN(), zzedVar.zzd(), this.zza.zzN(), 0, zzedVar.zzb());
    }
}
