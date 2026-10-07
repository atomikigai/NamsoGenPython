package a7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h7.a {
    public static final Parcelable.Creator<e> CREATOR = new n(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f217d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f218f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f219r;

    public e(d dVar, a aVar, String str, boolean z4, int i, c cVar, b bVar) {
        i0.i(dVar);
        this.f214a = dVar;
        i0.i(aVar);
        this.f215b = aVar;
        this.f216c = str;
        this.f217d = z4;
        this.e = i;
        this.f218f = cVar == null ? new c(null, null, false) : cVar;
        this.f219r = bVar == null ? new b(null, false) : bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return i0.m(this.f214a, eVar.f214a) && i0.m(this.f215b, eVar.f215b) && i0.m(this.f218f, eVar.f218f) && i0.m(this.f219r, eVar.f219r) && i0.m(this.f216c, eVar.f216c) && this.f217d == eVar.f217d && this.e == eVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f214a, this.f215b, this.f218f, this.f219r, this.f216c, Boolean.valueOf(this.f217d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 1, this.f214a, i, false);
        com.bumptech.glide.d.J(parcel, 2, this.f215b, i, false);
        com.bumptech.glide.d.K(parcel, 3, this.f216c, false);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f217d ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.e);
        com.bumptech.glide.d.J(parcel, 6, this.f218f, i, false);
        com.bumptech.glide.d.J(parcel, 7, this.f219r, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
