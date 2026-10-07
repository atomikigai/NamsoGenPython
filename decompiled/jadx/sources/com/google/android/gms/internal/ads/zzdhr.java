package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import e6.t;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdhr implements zzbjr {
    private final WeakReference zza;

    public /* synthetic */ zzdhr(zzdhu zzdhuVar, zzdht zzdhtVar) {
        this.zza = new WeakReference(zzdhuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzdhu zzdhuVar = (zzdhu) this.zza.get();
        if (zzdhuVar == null) {
            return;
        }
        zzdhuVar.zzh.onAdClicked();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkt)).booleanValue()) {
            zzdhuVar.zzi.zzdG();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdhuVar.zzi.zzdf();
        }
    }
}
