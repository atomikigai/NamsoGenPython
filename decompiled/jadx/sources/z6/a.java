package z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbbs;
import x1.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h7.a {
    public static final Parcelable.Creator<a> CREATOR = new c1(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f10988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CredentialPickerConfig f10989d;
    public final CredentialPickerConfig e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10990f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f10992s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f10993t;

    public a(int i, boolean z4, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z10, String str, String str2, boolean z11) {
        this.f10986a = i;
        this.f10987b = z4;
        i0.i(strArr);
        this.f10988c = strArr;
        this.f10989d = credentialPickerConfig == null ? new CredentialPickerConfig(2, false, true, false, 1) : credentialPickerConfig;
        this.e = credentialPickerConfig2 == null ? new CredentialPickerConfig(2, false, true, false, 1) : credentialPickerConfig2;
        if (i < 3) {
            this.f10990f = true;
            this.f10991r = null;
            this.f10992s = null;
        } else {
            this.f10990f = z10;
            this.f10991r = str;
            this.f10992s = str2;
        }
        this.f10993t = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f10987b ? 1 : 0);
        com.bumptech.glide.d.L(parcel, 2, this.f10988c, false);
        com.bumptech.glide.d.J(parcel, 3, this.f10989d, i, false);
        com.bumptech.glide.d.J(parcel, 4, this.e, i, false);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.f10990f ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 6, this.f10991r, false);
        com.bumptech.glide.d.K(parcel, 7, this.f10992s, false);
        com.bumptech.glide.d.R(parcel, 8, 4);
        parcel.writeInt(this.f10993t ? 1 : 0);
        com.bumptech.glide.d.R(parcel, zzbbs.zzq.zzf, 4);
        parcel.writeInt(this.f10986a);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
