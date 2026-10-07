package z7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h7.a {
    public static final Parcelable.Creator<c> CREATOR = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a3 f11039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11040d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11041f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f11042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f11043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public q f11044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f11045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q f11046v;

    public c(String str, String str2, a3 a3Var, long j4, boolean z4, String str3, q qVar, long j10, q qVar2, long j11, q qVar3) {
        this.f11037a = str;
        this.f11038b = str2;
        this.f11039c = a3Var;
        this.f11040d = j4;
        this.e = z4;
        this.f11041f = str3;
        this.f11042r = qVar;
        this.f11043s = j10;
        this.f11044t = qVar2;
        this.f11045u = j11;
        this.f11046v = qVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 2, this.f11037a, false);
        com.bumptech.glide.d.K(parcel, 3, this.f11038b, false);
        com.bumptech.glide.d.J(parcel, 4, this.f11039c, i, false);
        long j4 = this.f11040d;
        com.bumptech.glide.d.R(parcel, 5, 8);
        parcel.writeLong(j4);
        boolean z4 = this.e;
        com.bumptech.glide.d.R(parcel, 6, 4);
        parcel.writeInt(z4 ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 7, this.f11041f, false);
        com.bumptech.glide.d.J(parcel, 8, this.f11042r, i, false);
        long j10 = this.f11043s;
        com.bumptech.glide.d.R(parcel, 9, 8);
        parcel.writeLong(j10);
        com.bumptech.glide.d.J(parcel, 10, this.f11044t, i, false);
        com.bumptech.glide.d.R(parcel, 11, 8);
        parcel.writeLong(this.f11045u);
        com.bumptech.glide.d.J(parcel, 12, this.f11046v, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public c(c cVar) {
        com.google.android.gms.common.internal.i0.i(cVar);
        this.f11037a = cVar.f11037a;
        this.f11038b = cVar.f11038b;
        this.f11039c = cVar.f11039c;
        this.f11040d = cVar.f11040d;
        this.e = cVar.e;
        this.f11041f = cVar.f11041f;
        this.f11042r = cVar.f11042r;
        this.f11043s = cVar.f11043s;
        this.f11044t = cVar.f11044t;
        this.f11045u = cVar.f11045u;
        this.f11046v = cVar.f11046v;
    }
}
