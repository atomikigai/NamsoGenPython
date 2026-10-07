package y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import da.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import x1.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends zzbz {
    public static final Parcelable.Creator<d> CREATOR = new c1(3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final r.e f10596r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f10598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f10599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f10600d;
    public List e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f10601f;

    static {
        r.e eVar = new r.e(0);
        f10596r = eVar;
        eVar.put("registered", l7.a.g(2, "registered"));
        eVar.put("in_progress", l7.a.g(3, "in_progress"));
        eVar.put("success", l7.a.g(4, "success"));
        eVar.put("failed", l7.a.g(5, "failed"));
        eVar.put("escrowed", l7.a.g(6, "escrowed"));
    }

    public d(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f10597a = i;
        this.f10598b = arrayList;
        this.f10599c = arrayList2;
        this.f10600d = arrayList3;
        this.e = arrayList4;
        this.f10601f = arrayList5;
    }

    @Override // l7.b
    public final Map getFieldMappings() {
        return f10596r;
    }

    @Override // l7.b
    public final Object getFieldValue(l7.a aVar) {
        switch (aVar.f6848r) {
            case 1:
                return Integer.valueOf(this.f10597a);
            case 2:
                return this.f10598b;
            case 3:
                return this.f10599c;
            case 4:
                return this.f10600d;
            case 5:
                return this.e;
            case 6:
                return this.f10601f;
            default:
                throw new IllegalStateException(v.f(aVar.f6848r, "Unknown SafeParcelable id="));
        }
    }

    @Override // l7.b
    public final boolean isFieldSet(l7.a aVar) {
        return true;
    }

    @Override // l7.b
    public final void setStringsInternal(l7.a aVar, String str, ArrayList arrayList) {
        int i = aVar.f6848r;
        if (i == 2) {
            this.f10598b = arrayList;
            return;
        }
        if (i == 3) {
            this.f10599c = arrayList;
            return;
        }
        if (i == 4) {
            this.f10600d = arrayList;
        } else if (i == 5) {
            this.e = arrayList;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i)));
            }
            this.f10601f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f10597a);
        com.bumptech.glide.d.M(parcel, 2, this.f10598b);
        com.bumptech.glide.d.M(parcel, 3, this.f10599c);
        com.bumptech.glide.d.M(parcel, 4, this.f10600d);
        com.bumptech.glide.d.M(parcel, 5, this.e);
        com.bumptech.glide.d.M(parcel, 6, this.f10601f);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
