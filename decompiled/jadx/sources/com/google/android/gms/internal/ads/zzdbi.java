package com.google.android.gms.internal.ads;

import java.util.Set;
import x5.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdbi extends zzdcc implements zzbij {
    public zzdbi(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final synchronized void zzb(final String str, final String str2) {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdbh
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((e) obj).onAppEvent(str, str2);
            }
        });
    }
}
