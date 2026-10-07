package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import i6.h;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbax extends h7.a {
    public static final Parcelable.Creator<zzbax> CREATOR = new zzbay();
    public final String zza;
    public final long zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final Bundle zzf;
    public final boolean zzg;
    public long zzh;
    public String zzi;
    public int zzj;

    public zzbax(String str, long j4, String str2, String str3, String str4, Bundle bundle, boolean z4, long j10, String str5, int i) {
        this.zza = str;
        this.zzb = j4;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z4;
        this.zzh = j10;
        this.zzi = str5;
        this.zzj = i;
    }

    public static zzbax zza(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                h.g("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j4 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbax(queryParameter, j4, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e) {
            e = e;
            h.h("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            h.h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iP = d.P(20293, parcel);
        d.K(parcel, 2, str, false);
        long j4 = this.zzb;
        d.R(parcel, 3, 8);
        parcel.writeLong(j4);
        d.K(parcel, 4, this.zzc, false);
        d.K(parcel, 5, this.zzd, false);
        d.K(parcel, 6, this.zze, false);
        d.C(parcel, 7, this.zzf, false);
        boolean z4 = this.zzg;
        d.R(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        long j10 = this.zzh;
        d.R(parcel, 9, 8);
        parcel.writeLong(j10);
        d.K(parcel, 10, this.zzi, false);
        int i10 = this.zzj;
        d.R(parcel, 11, 4);
        parcel.writeInt(i10);
        d.Q(iP, parcel);
    }
}
