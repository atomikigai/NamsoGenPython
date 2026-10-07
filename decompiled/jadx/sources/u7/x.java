package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends h7.a {
    public static final Parcelable.Creator<x> CREATOR = new r4.a(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f8961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f8962d;
    public final i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f8963f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f8964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f8965s;

    public x(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        boolean z4 = true;
        if ((jVar == null || iVar != null || kVar != null) && ((jVar != null || iVar == null || kVar != null) && (jVar != null || iVar != null || kVar == null))) {
            z4 = false;
        }
        com.google.android.gms.common.internal.i0.b(z4);
        this.f8959a = str;
        this.f8960b = str2;
        this.f8961c = bArr;
        this.f8962d = jVar;
        this.e = iVar;
        this.f8963f = kVar;
        this.f8964r = gVar;
        this.f8965s = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return com.google.android.gms.common.internal.i0.m(this.f8959a, xVar.f8959a) && com.google.android.gms.common.internal.i0.m(this.f8960b, xVar.f8960b) && Arrays.equals(this.f8961c, xVar.f8961c) && com.google.android.gms.common.internal.i0.m(this.f8962d, xVar.f8962d) && com.google.android.gms.common.internal.i0.m(this.e, xVar.e) && com.google.android.gms.common.internal.i0.m(this.f8963f, xVar.f8963f) && com.google.android.gms.common.internal.i0.m(this.f8964r, xVar.f8964r) && com.google.android.gms.common.internal.i0.m(this.f8965s, xVar.f8965s);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8959a, this.f8960b, this.f8961c, this.e, this.f8962d, this.f8963f, this.f8964r, this.f8965s});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f8959a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f8960b, false);
        com.bumptech.glide.d.D(parcel, 3, this.f8961c, false);
        com.bumptech.glide.d.J(parcel, 4, this.f8962d, i, false);
        com.bumptech.glide.d.J(parcel, 5, this.e, i, false);
        com.bumptech.glide.d.J(parcel, 6, this.f8963f, i, false);
        com.bumptech.glide.d.J(parcel, 7, this.f8964r, i, false);
        com.bumptech.glide.d.K(parcel, 8, this.f8965s, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
