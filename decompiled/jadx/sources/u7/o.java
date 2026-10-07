package u7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends p {
    public static final Parcelable.Creator<o> CREATOR = new v0(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f8937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f8938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f8939c;

    public o(b0 b0Var, Uri uri, byte[] bArr) {
        com.google.android.gms.common.internal.i0.i(b0Var);
        this.f8937a = b0Var;
        com.google.android.gms.common.internal.i0.i(uri);
        com.google.android.gms.common.internal.i0.a("origin scheme must be non-empty", uri.getScheme() != null);
        com.google.android.gms.common.internal.i0.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f8938b = uri;
        com.google.android.gms.common.internal.i0.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f8939c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return com.google.android.gms.common.internal.i0.m(this.f8937a, oVar.f8937a) && com.google.android.gms.common.internal.i0.m(this.f8938b, oVar.f8938b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8937a, this.f8938b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 2, this.f8937a, i, false);
        com.bumptech.glide.d.J(parcel, 3, this.f8938b, i, false);
        com.bumptech.glide.d.D(parcel, 4, this.f8939c, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
