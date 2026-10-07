package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzbct {
    public static final void zza(zzbcs zzbcsVar, zzbcq zzbcqVar) {
        if (zzbcqVar.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbcqVar.zzb())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbcsVar.zzd(zzbcqVar.zza(), zzbcqVar.zzb(), zzbcqVar.zzc(), zzbcqVar.zzd());
    }
}
