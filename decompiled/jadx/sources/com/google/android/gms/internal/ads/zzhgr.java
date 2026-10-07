package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import o.h;
import o.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhgr extends m {
    private final WeakReference zza;

    public zzhgr(zzbdo zzbdoVar) {
        this.zza = new WeakReference(zzbdoVar);
    }

    @Override // o.m
    public final void onCustomTabsServiceConnected(ComponentName componentName, h hVar) {
        zzbdo zzbdoVar = (zzbdo) this.zza.get();
        if (zzbdoVar != null) {
            zzbdoVar.zzc(hVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbdo zzbdoVar = (zzbdo) this.zza.get();
        if (zzbdoVar != null) {
            zzbdoVar.zzd();
        }
    }
}
