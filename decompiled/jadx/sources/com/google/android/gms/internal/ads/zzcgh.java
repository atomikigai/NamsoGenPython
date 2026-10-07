package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import i6.h;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcgh implements zzbjr {
    final /* synthetic */ zzcgj zza;

    public zzcgh(zzcgj zzcgjVar) {
        this.zza = zzcgjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                synchronized (this.zza) {
                    try {
                        zzcgj zzcgjVar = this.zza;
                        if (zzcgjVar.zzI != i) {
                            zzcgjVar.zzI = i;
                            this.zza.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                h.h("Exception occurred while getting webview content height", e);
            }
        }
    }
}
