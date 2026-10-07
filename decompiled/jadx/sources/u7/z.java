package u7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzau;
import com.google.android.gms.internal.fido.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends h7.a {
    public static final Parcelable.Creator<z> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f8982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8984c;

    static {
        zzau.zzi(zzh.zza, zzh.zzb);
        CREATOR = new r4.a(19);
    }

    public z(String str, byte[] bArr, ArrayList arrayList) {
        com.google.android.gms.common.internal.i0.i(str);
        try {
            this.f8982a = e0.a(str);
            com.google.android.gms.common.internal.i0.i(bArr);
            this.f8983b = bArr;
            this.f8984c = arrayList;
        } catch (d0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        List list = zVar.f8984c;
        if (!this.f8982a.equals(zVar.f8982a) || !Arrays.equals(this.f8983b, zVar.f8983b)) {
            return false;
        }
        List list2 = this.f8984c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8982a, Integer.valueOf(Arrays.hashCode(this.f8983b)), this.f8984c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        this.f8982a.getClass();
        com.bumptech.glide.d.K(parcel, 2, "public-key", false);
        com.bumptech.glide.d.D(parcel, 3, this.f8983b, false);
        com.bumptech.glide.d.O(parcel, 4, this.f8984c, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
