package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfqz extends h7.a {
    public static final Parcelable.Creator<zzfqz> CREATOR = new zzfra();
    public final int zza;
    private zzata zzb = null;
    private byte[] zzc;

    public zzfqz(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzata zzataVar = this.zzb;
        if (zzataVar != null || this.zzc == null) {
            if (zzataVar == null || this.zzc != null) {
                if (zzataVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzataVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i10 = this.zza;
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(i10);
        byte[] bArrZzaV = this.zzc;
        if (bArrZzaV == null) {
            bArrZzaV = this.zzb.zzaV();
        }
        d.D(parcel, 2, bArrZzaV, false);
        d.Q(iP, parcel);
    }

    public final zzata zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzata.zzd(this.zzc, zzgyh.zza());
                this.zzc = null;
            } catch (zzgzm | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }
}
