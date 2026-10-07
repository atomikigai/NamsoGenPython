package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzw implements Comparator<zzv>, Parcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzt();
    public final String zza;
    public final int zzb;
    private final zzv[] zzc;
    private int zzd;

    public zzw(Parcel parcel) {
        this.zza = parcel.readString();
        zzv[] zzvVarArr = (zzv[]) parcel.createTypedArray(zzv.CREATOR);
        int i = zzen.zza;
        this.zzc = zzvVarArr;
        this.zzb = zzvVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3 = zzvVar;
        zzv zzvVar4 = zzvVar2;
        UUID uuid = zzj.zza;
        if (uuid.equals(zzvVar3.zza)) {
            return !uuid.equals(zzvVar4.zza) ? 1 : 0;
        }
        return zzvVar3.zza.compareTo(zzvVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzw.class == obj.getClass()) {
            zzw zzwVar = (zzw) obj;
            if (Objects.equals(this.zza, zzwVar.zza) && Arrays.equals(this.zzc, zzwVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
        this.zzd = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzv zza(int i) {
        return this.zzc[i];
    }

    public final zzw zzb(String str) {
        return Objects.equals(this.zza, str) ? this : new zzw(str, false, this.zzc);
    }

    private zzw(String str, boolean z4, zzv... zzvVarArr) {
        this.zza = str;
        zzvVarArr = z4 ? (zzv[]) zzvVarArr.clone() : zzvVarArr;
        this.zzc = zzvVarArr;
        this.zzb = zzvVarArr.length;
        Arrays.sort(zzvVarArr, this);
    }

    public zzw(String str, zzv... zzvVarArr) {
        this(null, true, zzvVarArr);
    }

    public zzw(List list) {
        this(null, false, (zzv[]) list.toArray(new zzv[0]));
    }
}
