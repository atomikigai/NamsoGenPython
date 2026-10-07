package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import d6.p;
import e6.t;
import h6.r0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzepw implements zzevy {
    private final Integer zza;

    private zzepw(Integer num) {
        this.zza = num;
    }

    public static zzepw zzb(i6.a aVar) {
        zzbce zzbceVar = zzbcn.zzjI;
        t tVar = t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            return new zzepw(null);
        }
        r0 r0Var = p.C.f2979c;
        int extensionVersion = 0;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzjL)).booleanValue()) {
                    if (aVar.f5215c >= ((Integer) tVar.f3440c.zza(zzbcn.zzjK)).intValue() && i >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (Exception e) {
            p.C.f2982g.zzw(e, "AdUtil.getAdServicesExtensionVersion");
        }
        return new zzepw(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
