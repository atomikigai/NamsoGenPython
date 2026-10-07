package g8;

import android.os.Parcel;
import android.os.Parcelable;
import e6.r3;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new r3(14);
    public CharSequence A;
    public int B;
    public int C;
    public Integer D;
    public Integer F;
    public Integer G;
    public Integer H;
    public Integer I;
    public Integer J;
    public Integer K;
    public Integer L;
    public Integer M;
    public Integer N;
    public Boolean O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f4297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f4298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f4299d;
    public Integer e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f4300f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f4301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f4302s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f4304u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Locale f4308y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f4309z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4303t = 255;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4305v = -2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4306w = -2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4307x = -2;
    public Boolean E = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4296a);
        parcel.writeSerializable(this.f4297b);
        parcel.writeSerializable(this.f4298c);
        parcel.writeSerializable(this.f4299d);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f4300f);
        parcel.writeSerializable(this.f4301r);
        parcel.writeSerializable(this.f4302s);
        parcel.writeInt(this.f4303t);
        parcel.writeString(this.f4304u);
        parcel.writeInt(this.f4305v);
        parcel.writeInt(this.f4306w);
        parcel.writeInt(this.f4307x);
        CharSequence charSequence = this.f4309z;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.A;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.B);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.F);
        parcel.writeSerializable(this.G);
        parcel.writeSerializable(this.H);
        parcel.writeSerializable(this.I);
        parcel.writeSerializable(this.J);
        parcel.writeSerializable(this.K);
        parcel.writeSerializable(this.N);
        parcel.writeSerializable(this.L);
        parcel.writeSerializable(this.M);
        parcel.writeSerializable(this.E);
        parcel.writeSerializable(this.f4308y);
        parcel.writeSerializable(this.O);
    }
}
