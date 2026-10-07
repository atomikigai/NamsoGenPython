package com.google.android.gms.internal.ads;

import java.util.Set;
import w5.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdfg extends zzdcc {
    private boolean zzb;

    public zzdfg(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdfd
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((v) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdfc
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((v) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        try {
            if (!this.zzb) {
                zzq(new zzdfe());
                this.zzb = true;
            }
            zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzdff
                @Override // com.google.android.gms.internal.ads.zzdcb
                public final void zza(Object obj) {
                    ((v) obj).onVideoPlay();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        zzq(new zzdfe());
        this.zzb = true;
    }
}
