package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhe extends ContentObserver {
    final /* synthetic */ zzhf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhe(zzhf zzhfVar, Handler handler) {
        super(null);
        this.zza = zzhfVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        this.zza.zzf();
    }
}
