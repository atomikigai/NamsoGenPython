package l7;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h7.a {
    public static final e CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6846d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6847f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class f6849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f6850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h f6851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k7.a f6852v;

    public a(int i, int i10, boolean z4, int i11, boolean z10, String str, int i12, String str2, k7.b bVar) {
        this.f6843a = i;
        this.f6844b = i10;
        this.f6845c = z4;
        this.f6846d = i11;
        this.e = z10;
        this.f6847f = str;
        this.f6848r = i12;
        if (str2 == null) {
            this.f6849s = null;
            this.f6850t = null;
        } else {
            this.f6849s = d.class;
            this.f6850t = str2;
        }
        if (bVar == null) {
            this.f6852v = null;
            return;
        }
        k7.a aVar = bVar.f6064b;
        if (aVar == null) {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
        this.f6852v = aVar;
    }

    public static a g(int i, String str) {
        return new a(7, true, 7, true, str, i, null);
    }

    public final String toString() {
        aa.c cVar = new aa.c(this);
        cVar.b(Integer.valueOf(this.f6843a), "versionCode");
        cVar.b(Integer.valueOf(this.f6844b), "typeIn");
        cVar.b(Boolean.valueOf(this.f6845c), "typeInArray");
        cVar.b(Integer.valueOf(this.f6846d), "typeOut");
        cVar.b(Boolean.valueOf(this.e), "typeOutArray");
        cVar.b(this.f6847f, "outputFieldName");
        cVar.b(Integer.valueOf(this.f6848r), "safeParcelFieldId");
        String str = this.f6850t;
        if (str == null) {
            str = null;
        }
        cVar.b(str, "concreteTypeName");
        Class cls = this.f6849s;
        if (cls != null) {
            cVar.b(cls.getCanonicalName(), "concreteType.class");
        }
        k7.a aVar = this.f6852v;
        if (aVar != null) {
            cVar.b(aVar.getClass().getCanonicalName(), "converterName");
        }
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f6843a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f6844b);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f6845c ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f6846d);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 6, this.f6847f, false);
        com.bumptech.glide.d.R(parcel, 7, 4);
        parcel.writeInt(this.f6848r);
        k7.b bVar = null;
        String str = this.f6850t;
        if (str == null) {
            str = null;
        }
        com.bumptech.glide.d.K(parcel, 8, str, false);
        k7.a aVar = this.f6852v;
        if (aVar != null) {
            if (!(aVar instanceof k7.a)) {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
            bVar = new k7.b(aVar);
        }
        com.bumptech.glide.d.J(parcel, 9, bVar, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public a(int i, boolean z4, int i10, boolean z10, String str, int i11, Class cls) {
        this.f6843a = 1;
        this.f6844b = i;
        this.f6845c = z4;
        this.f6846d = i10;
        this.e = z10;
        this.f6847f = str;
        this.f6848r = i11;
        this.f6849s = cls;
        if (cls == null) {
            this.f6850t = null;
        } else {
            this.f6850t = cls.getCanonicalName();
        }
        this.f6852v = null;
    }
}
