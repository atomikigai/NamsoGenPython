package com.google.android.gms.internal.ads;

import java.util.Set;
import o6.r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdfa extends zzdcc {
    public zzdfa(Set set) {
        super(set);
    }

    public final synchronized void zza(final r rVar) {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdey
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzdex) obj).zze(rVar);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdez
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzdex) obj).zzf(str);
            }
        });
    }
}
