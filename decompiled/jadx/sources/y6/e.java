package y6;

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
public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new c1(4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final HashMap f10602r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f10603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f10605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10606d;
    public String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10607f;

    static {
        HashMap map = new HashMap();
        f10602r = map;
        map.put("authenticatorInfo", new l7.a(11, false, 11, false, "authenticatorInfo", 2, f.class));
        map.put("signature", new l7.a(7, false, 7, false, "signature", 3, null));
        map.put("package", new l7.a(7, false, 7, false, "package", 4, null));
    }

    public e(HashSet hashSet, int i, f fVar, String str, String str2, String str3) {
        this.f10603a = hashSet;
        this.f10604b = i;
        this.f10605c = fVar;
        this.f10606d = str;
        this.e = str2;
        this.f10607f = str3;
    }

    @Override // l7.b
    public final void addConcreteTypeInternal(l7.a aVar, String str, l7.b bVar) {
        int i = aVar.f6848r;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), bVar.getClass().getCanonicalName()));
        }
        this.f10605c = (f) bVar;
        this.f10603a.add(Integer.valueOf(i));
    }

    @Override // l7.b
    public final /* synthetic */ Map getFieldMappings() {
        return f10602r;
    }

    @Override // l7.b
    public final Object getFieldValue(l7.a aVar) {
        int i = aVar.f6848r;
        if (i == 1) {
            return Integer.valueOf(this.f10604b);
        }
        if (i == 2) {
            return this.f10605c;
        }
        if (i == 3) {
            return this.f10606d;
        }
        if (i == 4) {
            return this.e;
        }
        throw new IllegalStateException(v.f(aVar.f6848r, "Unknown SafeParcelable id="));
    }

    @Override // l7.b
    public final boolean isFieldSet(l7.a aVar) {
        return this.f10603a.contains(Integer.valueOf(aVar.f6848r));
    }

    @Override // l7.b
    public final void setStringInternal(l7.a aVar, String str, String str2) {
        int i = aVar.f6848r;
        if (i == 3) {
            this.f10606d = str2;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.e = str2;
        }
        this.f10603a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        HashSet hashSet = this.f10603a;
        if (hashSet.contains(1)) {
            com.bumptech.glide.d.R(parcel, 1, 4);
            parcel.writeInt(this.f10604b);
        }
        if (hashSet.contains(2)) {
            com.bumptech.glide.d.J(parcel, 2, this.f10605c, i, true);
        }
        if (hashSet.contains(3)) {
            com.bumptech.glide.d.K(parcel, 3, this.f10606d, true);
        }
        if (hashSet.contains(4)) {
            com.bumptech.glide.d.K(parcel, 4, this.e, true);
        }
        if (hashSet.contains(5)) {
            com.bumptech.glide.d.K(parcel, 5, this.f10607f, true);
        }
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
