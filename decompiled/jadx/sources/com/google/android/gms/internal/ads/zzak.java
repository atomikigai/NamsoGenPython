package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzak {
    private String zza;
    private Uri zzb;
    private final zzal zzc = new zzal();
    private final List zzd;
    private final zzfzo zze;
    private final zzap zzf;
    private final zzat zzg;

    public zzak() {
        zzfzo.zzn();
        this.zzd = Collections.EMPTY_LIST;
        this.zze = zzfzo.zzn();
        this.zzf = new zzap();
        this.zzg = zzat.zza;
    }

    public final zzak zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzak zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzaw zzc() {
        zzar zzarVar;
        Uri uri = this.zzb;
        if (uri != null) {
            zzarVar = new zzar(uri, null, null, null, this.zzd, null, this.zze, null, -9223372036854775807L, null);
        } else {
            zzarVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzaw(str, new zzan(this.zzc, null), zzarVar, new zzaq(this.zzf, null), zzba.zza, this.zzg, null);
    }
}
