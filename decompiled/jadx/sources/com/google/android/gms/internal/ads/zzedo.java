package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzedo implements zzgee {
    final /* synthetic */ zzfiv zza;

    public zzedo(zzedp zzedpVar, zzfiv zzfivVar) {
        this.zza = zzfivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        h.d("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            h.d("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
