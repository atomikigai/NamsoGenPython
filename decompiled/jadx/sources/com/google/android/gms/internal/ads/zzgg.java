package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgg {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public /* synthetic */ zzgg(zzgi zzgiVar, zzgh zzghVar) {
        this.zza = zzgiVar.zza;
        this.zzb = zzgiVar.zzd;
        this.zzc = zzgiVar.zze;
        this.zzd = zzgiVar.zzf;
        this.zze = zzgiVar.zzg;
    }

    public final zzgg zza(int i) {
        this.zze = 6;
        return this;
    }

    public final zzgg zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzgg zzc(long j4) {
        this.zzc = j4;
        return this;
    }

    public final zzgg zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzgi zze() {
        if (this.zza == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new zzgi(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public zzgg() {
        this.zzb = Collections.EMPTY_MAP;
        this.zzd = -1L;
    }
}
