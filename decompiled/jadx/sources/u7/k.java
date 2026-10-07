package u7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzaj;
import com.google.android.gms.internal.fido.zzak;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new v0(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f8923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8925c;

    public k(int i, String str, int i10) {
        try {
            this.f8923a = u.a(i);
            this.f8924b = str;
            this.f8925c = i10;
        } catch (t e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return com.google.android.gms.common.internal.i0.m(this.f8923a, kVar.f8923a) && com.google.android.gms.common.internal.i0.m(this.f8924b, kVar.f8924b) && com.google.android.gms.common.internal.i0.m(Integer.valueOf(this.f8925c), Integer.valueOf(kVar.f8925c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8923a, this.f8924b, Integer.valueOf(this.f8925c)});
    }

    public final String toString() {
        zzaj zzajVarZza = zzak.zza(this);
        zzajVarZza.zza("errorCode", this.f8923a.f8951a);
        String str = this.f8924b;
        if (str != null) {
            zzajVarZza.zzb("errorMessage", str);
        }
        return zzajVarZza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        int i10 = this.f8923a.f8951a;
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(i10);
        com.bumptech.glide.d.K(parcel, 3, this.f8924b, false);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f8925c);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
