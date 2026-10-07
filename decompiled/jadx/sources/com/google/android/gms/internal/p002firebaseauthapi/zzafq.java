package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import da.v;
import java.util.Iterator;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzafq extends zzadx {
    final /* synthetic */ zzaft zza;
    private final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafq(zzaft zzaftVar, zzadx zzadxVar, String str) {
        super(zzadxVar);
        this.zza = zzaftVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadx
    public final void zzb(String str) {
        zzaft.zza.a("onCodeSent", new Object[0]);
        zzafs zzafsVar = (zzafs) this.zza.zzd.get(this.zzb);
        if (zzafsVar == null) {
            return;
        }
        Iterator it = zzafsVar.zzb.iterator();
        while (it.hasNext()) {
            ((zzadx) it.next()).zzb(str);
        }
        zzafsVar.zzg = true;
        zzafsVar.zzd = str;
        if (zzafsVar.zza <= 0) {
            this.zza.zzg(this.zzb);
        } else if (!zzafsVar.zzc) {
            this.zza.zzm(this.zzb);
        } else {
            if (zzac.zzd(zzafsVar.zze)) {
                return;
            }
            zzaft.zzd(this.zza, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadx
    public final void zzh(Status status) {
        zzaft.zza.c(v.j("SMS verification code request failed: ", b.p(status.f2045a), " ", status.f2046b), new Object[0]);
        zzafs zzafsVar = (zzafs) this.zza.zzd.get(this.zzb);
        if (zzafsVar == null) {
            return;
        }
        Iterator it = zzafsVar.zzb.iterator();
        while (it.hasNext()) {
            ((zzadx) it.next()).zzh(status);
        }
        this.zza.zzi(this.zzb);
    }
}
