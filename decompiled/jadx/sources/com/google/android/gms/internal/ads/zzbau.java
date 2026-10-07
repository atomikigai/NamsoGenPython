package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.bumptech.glide.d;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbau extends h7.a {
    public static final Parcelable.Creator<zzbau> CREATOR = new zzbav();
    private ParcelFileDescriptor zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    public zzbau(ParcelFileDescriptor parcelFileDescriptor, boolean z4, boolean z10, long j4, boolean z11) {
        this.zza = parcelFileDescriptor;
        this.zzb = z4;
        this.zzc = z10;
        this.zzd = j4;
        this.zze = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.J(parcel, 2, zzb(), i, false);
        boolean zZzd = zzd();
        d.R(parcel, 3, 4);
        parcel.writeInt(zZzd ? 1 : 0);
        boolean zZzf = zzf();
        d.R(parcel, 4, 4);
        parcel.writeInt(zZzf ? 1 : 0);
        long jZza = zza();
        d.R(parcel, 5, 8);
        parcel.writeLong(jZza);
        boolean zZzg = zzg();
        d.R(parcel, 6, 4);
        parcel.writeInt(zZzg ? 1 : 0);
        d.Q(iP, parcel);
    }

    public final synchronized long zza() {
        return this.zzd;
    }

    public final synchronized ParcelFileDescriptor zzb() {
        return this.zza;
    }

    public final synchronized InputStream zzc() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        return this.zza != null;
    }

    public final synchronized boolean zzf() {
        return this.zzc;
    }

    public final synchronized boolean zzg() {
        return this.zze;
    }

    public zzbau() {
        this(null, false, false, 0L, false);
    }
}
