package w9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import java.util.List;
import v9.h0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements h7.c {
    public static final Parcelable.Creator<a0> CREATOR = new b(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f9802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f9803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f9804c;

    public a0(d0 d0Var) {
        i0.i(d0Var);
        this.f9802a = d0Var;
        List list = d0Var.e;
        this.f9803b = null;
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.isEmpty(((b0) list.get(i)).f9813t)) {
                this.f9803b = new z(((b0) list.get(i)).f9807b, ((b0) list.get(i)).f9813t, d0Var.f9827u);
            }
        }
        if (this.f9803b == null) {
            this.f9803b = new z(d0Var.f9827u);
        }
        this.f9804c = d0Var.f9828v;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 1, this.f9802a, i, false);
        com.bumptech.glide.d.J(parcel, 2, this.f9803b, i, false);
        com.bumptech.glide.d.J(parcel, 3, this.f9804c, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
