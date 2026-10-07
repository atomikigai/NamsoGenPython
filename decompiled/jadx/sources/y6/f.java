package y6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import da.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import x1.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends zzbz {
    public static final Parcelable.Creator<f> CREATOR = new c1(5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final HashMap f10608s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f10609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10612d;
    public byte[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PendingIntent f10613f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f10614r;

    static {
        HashMap map = new HashMap();
        f10608s = map;
        map.put("accountType", new l7.a(7, false, 7, false, "accountType", 2, null));
        map.put("status", new l7.a(0, false, 0, false, "status", 3, null));
        map.put("transferBytes", new l7.a(8, false, 8, false, "transferBytes", 4, null));
    }

    public f(HashSet hashSet, int i, String str, int i10, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.f10609a = hashSet;
        this.f10610b = i;
        this.f10611c = str;
        this.f10612d = i10;
        this.e = bArr;
        this.f10613f = pendingIntent;
        this.f10614r = aVar;
    }

    @Override // l7.b
    public final /* synthetic */ Map getFieldMappings() {
        return f10608s;
    }

    @Override // l7.b
    public final Object getFieldValue(l7.a aVar) {
        int i = aVar.f6848r;
        if (i == 1) {
            return Integer.valueOf(this.f10610b);
        }
        if (i == 2) {
            return this.f10611c;
        }
        if (i == 3) {
            return Integer.valueOf(this.f10612d);
        }
        if (i == 4) {
            return this.e;
        }
        throw new IllegalStateException(v.f(aVar.f6848r, "Unknown SafeParcelable id="));
    }

    @Override // l7.b
    public final boolean isFieldSet(l7.a aVar) {
        return this.f10609a.contains(Integer.valueOf(aVar.f6848r));
    }

    @Override // l7.b
    public final void setDecodedBytesInternal(l7.a aVar, String str, byte[] bArr) {
        int i = aVar.f6848r;
        if (i != 4) {
            throw new IllegalArgumentException(q1.a.j(i, "Field with id=", " is not known to be an byte array."));
        }
        this.e = bArr;
        this.f10609a.add(Integer.valueOf(i));
    }

    @Override // l7.b
    public final void setIntegerInternal(l7.a aVar, String str, int i) {
        int i10 = aVar.f6848r;
        if (i10 != 3) {
            throw new IllegalArgumentException(q1.a.j(i10, "Field with id=", " is not known to be an int."));
        }
        this.f10612d = i;
        this.f10609a.add(Integer.valueOf(i10));
    }

    @Override // l7.b
    public final void setStringInternal(l7.a aVar, String str, String str2) {
        int i = aVar.f6848r;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.f10611c = str2;
        this.f10609a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        HashSet hashSet = this.f10609a;
        if (hashSet.contains(1)) {
            com.bumptech.glide.d.R(parcel, 1, 4);
            parcel.writeInt(this.f10610b);
        }
        if (hashSet.contains(2)) {
            com.bumptech.glide.d.K(parcel, 2, this.f10611c, true);
        }
        if (hashSet.contains(3)) {
            int i10 = this.f10612d;
            com.bumptech.glide.d.R(parcel, 3, 4);
            parcel.writeInt(i10);
        }
        if (hashSet.contains(4)) {
            com.bumptech.glide.d.D(parcel, 4, this.e, true);
        }
        if (hashSet.contains(5)) {
            com.bumptech.glide.d.J(parcel, 5, this.f10613f, i, true);
        }
        if (hashSet.contains(6)) {
            com.bumptech.glide.d.J(parcel, 6, this.f10614r, i, true);
        }
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
