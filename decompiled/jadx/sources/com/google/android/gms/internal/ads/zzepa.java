package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import e6.t;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzepa implements zzevz {
    private final Context zza;
    private final zzges zzb;

    public zzepa(zzges zzgesVar, Context context) {
        this.zzb = zzgesVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmA)).booleanValue()) {
            return zzgei.zzh(new zzepb(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzgei.zzh(new zzepb(null, false)) : this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzepb(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }
}
