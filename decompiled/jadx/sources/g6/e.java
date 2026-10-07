package g6;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e6.r3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h7.a {
    public static final Parcelable.Creator<e> CREATOR = new r3(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4186d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4187f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f4188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Intent f4189s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f4190t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f4191u;

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z4) {
        this.f4183a = str;
        this.f4184b = str2;
        this.f4185c = str3;
        this.f4186d = str4;
        this.e = str5;
        this.f4187f = str6;
        this.f4188r = str7;
        this.f4189s = intent;
        this.f4190t = (a) q7.b.I(q7.b.y(iBinder));
        this.f4191u = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 2, this.f4183a, false);
        com.bumptech.glide.d.K(parcel, 3, this.f4184b, false);
        com.bumptech.glide.d.K(parcel, 4, this.f4185c, false);
        com.bumptech.glide.d.K(parcel, 5, this.f4186d, false);
        com.bumptech.glide.d.K(parcel, 6, this.e, false);
        com.bumptech.glide.d.K(parcel, 7, this.f4187f, false);
        com.bumptech.glide.d.K(parcel, 8, this.f4188r, false);
        com.bumptech.glide.d.J(parcel, 9, this.f4189s, i, false);
        com.bumptech.glide.d.F(parcel, 10, new q7.b(this.f4190t).asBinder());
        com.bumptech.glide.d.R(parcel, 11, 4);
        parcel.writeInt(this.f4191u ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public e(Intent intent, a aVar) {
        this(null, null, null, null, null, null, null, intent, new q7.b(aVar).asBinder(), false);
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new q7.b(aVar).asBinder(), false);
    }
}
