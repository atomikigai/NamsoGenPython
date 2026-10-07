package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyc {
    public final zzbw zza;
    public final int[] zzb;

    public zzyc(zzbw zzbwVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzdt.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbwVar;
        this.zzb = iArr;
    }
}
