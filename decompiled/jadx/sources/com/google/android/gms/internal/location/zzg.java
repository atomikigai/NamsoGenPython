package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzg {
    public final q removeActivityUpdates(o oVar, PendingIntent pendingIntent) {
        return ((i0) oVar).f2119b.doWrite(new zze(this, oVar, pendingIntent));
    }

    public final q requestActivityUpdates(o oVar, long j4, PendingIntent pendingIntent) {
        return ((i0) oVar).f2119b.doWrite(new zzd(this, oVar, j4, pendingIntent));
    }
}
