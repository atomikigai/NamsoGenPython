package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.location.LocationRequest;
import h7.a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzba extends a {
    final LocationRequest zzb;
    final List<g> zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final String zzh;
    final boolean zzi;
    boolean zzj;
    String zzk;
    long zzl;
    static final List<g> zza = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    public zzba(LocationRequest locationRequest, List<g> list, String str, boolean z4, boolean z10, boolean z11, String str2, boolean z12, boolean z13, String str3, long j4) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z4;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = str2;
        this.zzi = z12;
        this.zzj = z13;
        this.zzk = str3;
        this.zzl = j4;
    }

    public static zzba zza(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, zza, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (i0.m(this.zzb, zzbaVar.zzb) && i0.m(this.zzc, zzbaVar.zzc) && i0.m(this.zzd, zzbaVar.zzd) && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && i0.m(this.zzh, zzbaVar.zzh) && this.zzi == zzbaVar.zzi && this.zzj == zzbaVar.zzj && i0.m(this.zzk, zzbaVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzb);
        if (this.zzd != null) {
            sb2.append(" tag=");
            sb2.append(this.zzd);
        }
        if (this.zzh != null) {
            sb2.append(" moduleId=");
            sb2.append(this.zzh);
        }
        if (this.zzk != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.zzk);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.zze);
        sb2.append(" clients=");
        sb2.append(this.zzc);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.zzf);
        if (this.zzg) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.J(parcel, 1, this.zzb, i, false);
        d.O(parcel, 5, this.zzc, false);
        d.K(parcel, 6, this.zzd, false);
        boolean z4 = this.zze;
        d.R(parcel, 7, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.zzf;
        d.R(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzg;
        d.R(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        d.K(parcel, 10, this.zzh, false);
        boolean z12 = this.zzi;
        d.R(parcel, 11, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.zzj;
        d.R(parcel, 12, 4);
        parcel.writeInt(z13 ? 1 : 0);
        d.K(parcel, 13, this.zzk, false);
        long j4 = this.zzl;
        d.R(parcel, 14, 8);
        parcel.writeLong(j4);
        d.Q(iP, parcel);
    }

    public final zzba zzb(long j4) {
        LocationRequest locationRequest = this.zzb;
        long j10 = locationRequest.f2307s;
        long j11 = locationRequest.f2302b;
        if (j10 < j11) {
            j10 = j11;
        }
        if (j10 <= j11) {
            this.zzl = 10000L;
            return this;
        }
        LocationRequest locationRequest2 = this.zzb;
        long j12 = locationRequest2.f2302b;
        long j13 = locationRequest2.f2307s;
        if (j13 < j12) {
            j13 = j12;
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append("could not set max age when location batching is requested, interval=");
        sb2.append(j12);
        sb2.append("maxWaitTime=");
        sb2.append(j13);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final zzba zzc(String str) {
        this.zzk = str;
        return this;
    }

    public final zzba zzd(boolean z4) {
        this.zzj = true;
        return this;
    }
}
