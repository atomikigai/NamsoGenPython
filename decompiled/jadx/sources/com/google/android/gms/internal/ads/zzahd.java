package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahd implements zzbc {
    public static final Parcelable.Creator<zzahd> CREATOR = new zzaha();
    public final List zza;

    public zzahd(List list) {
        this.zza = list;
        boolean z4 = false;
        if (!list.isEmpty()) {
            long j4 = ((zzahc) list.get(0)).zzb;
            for (int i = 1; i < list.size(); i++) {
                if (((zzahc) list.get(i)).zza < j4) {
                    z4 = true;
                    break;
                }
                j4 = ((zzahc) list.get(i)).zzb;
            }
        }
        zzdb.zzd(!z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahd.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzahd) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbc
    public final /* synthetic */ void zza(zzay zzayVar) {
    }
}
