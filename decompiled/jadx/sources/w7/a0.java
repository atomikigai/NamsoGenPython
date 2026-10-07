package w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends h7.a {
    public static final Parcelable.Creator<a0> CREATOR = new v7.i(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9686d;

    public a0(int i, int i10, int i11, int i12) {
        i0.k("Start hour must be in range [0, 23].", i >= 0 && i <= 23);
        i0.k("Start minute must be in range [0, 59].", i10 >= 0 && i10 <= 59);
        i0.k("End hour must be in range [0, 23].", i11 >= 0 && i11 <= 23);
        i0.k("End minute must be in range [0, 59].", i12 >= 0 && i12 <= 59);
        i0.k("Parameters can't be all 0.", ((i + i10) + i11) + i12 > 0);
        this.f9683a = i;
        this.f9684b = i10;
        this.f9685c = i11;
        this.f9686d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f9683a == a0Var.f9683a && this.f9684b == a0Var.f9684b && this.f9685c == a0Var.f9685c && this.f9686d == a0Var.f9686d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9683a), Integer.valueOf(this.f9684b), Integer.valueOf(this.f9685c), Integer.valueOf(this.f9686d)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(117);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(this.f9683a);
        sb2.append(", startMinute=");
        sb2.append(this.f9684b);
        sb2.append(", endHour=");
        sb2.append(this.f9685c);
        sb2.append(", endMinute=");
        sb2.append(this.f9686d);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i0.i(parcel);
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f9683a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f9684b);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f9685c);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f9686d);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
