package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;
import k6.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbpy implements d {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final boolean zzg;

    public zzbpy(Date date, int i, Set set, Location location, boolean z4, int i10, boolean z10, int i11, String str) {
        this.zza = date;
        this.zzb = i;
        this.zzc = set;
        this.zze = location;
        this.zzd = z4;
        this.zzf = i10;
        this.zzg = z10;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // k6.d
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Override // k6.d
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzg;
    }

    @Override // k6.d
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // k6.d
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }
}
