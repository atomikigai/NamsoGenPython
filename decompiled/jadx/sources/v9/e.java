package v9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends d {
    public static final Parcelable.Creator<e> CREATOR = new v7.i(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9238d;
    public boolean e;

    public e(String str, String str2, String str3, String str4, boolean z4) {
        com.google.android.gms.common.internal.i0.e(str);
        this.f9235a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f9236b = str2;
        this.f9237c = str3;
        this.f9238d = str4;
        this.e = z4;
    }

    public static boolean i(String str) {
        c cVar;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        zzap zzapVar = c.f9227d;
        com.google.android.gms.common.internal.i0.e(str);
        try {
            cVar = new c(str);
        } catch (IllegalArgumentException unused) {
            cVar = null;
        }
        if (cVar == null) {
            return false;
        }
        zzap zzapVar2 = c.f9227d;
        String str2 = cVar.f9229b;
        return (zzapVar2.containsKey(str2) ? ((Integer) zzapVar2.get(str2)).intValue() : 3) == 4;
    }

    @Override // v9.d
    public final String g() {
        return "password";
    }

    @Override // v9.d
    public final d h() {
        return new e(this.f9235a, this.f9236b, this.f9237c, this.f9238d, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9235a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9236b, false);
        com.bumptech.glide.d.K(parcel, 3, this.f9237c, false);
        com.bumptech.glide.d.K(parcel, 4, this.f9238d, false);
        boolean z4 = this.e;
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
