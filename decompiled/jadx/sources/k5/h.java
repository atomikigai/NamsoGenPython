package k5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6019d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6021g;
    public final String h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6024l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f6016a = num;
        this.f6017b = str;
        this.f6018c = str2;
        this.f6019d = str3;
        this.e = str4;
        this.f6020f = str5;
        this.f6021g = str6;
        this.h = str7;
        this.i = str8;
        this.f6022j = str9;
        this.f6023k = str10;
        this.f6024l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f6016a;
            if (num != null ? num.equals(((h) aVar).f6016a) : ((h) aVar).f6016a == null) {
                String str = this.f6017b;
                if (str != null ? str.equals(((h) aVar).f6017b) : ((h) aVar).f6017b == null) {
                    String str2 = this.f6018c;
                    if (str2 != null ? str2.equals(((h) aVar).f6018c) : ((h) aVar).f6018c == null) {
                        String str3 = this.f6019d;
                        if (str3 != null ? str3.equals(((h) aVar).f6019d) : ((h) aVar).f6019d == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(((h) aVar).e) : ((h) aVar).e == null) {
                                String str5 = this.f6020f;
                                if (str5 != null ? str5.equals(((h) aVar).f6020f) : ((h) aVar).f6020f == null) {
                                    String str6 = this.f6021g;
                                    if (str6 != null ? str6.equals(((h) aVar).f6021g) : ((h) aVar).f6021g == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(((h) aVar).h) : ((h) aVar).h == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(((h) aVar).i) : ((h) aVar).i == null) {
                                                String str9 = this.f6022j;
                                                if (str9 != null ? str9.equals(((h) aVar).f6022j) : ((h) aVar).f6022j == null) {
                                                    String str10 = this.f6023k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f6023k) : ((h) aVar).f6023k == null) {
                                                        String str11 = this.f6024l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f6024l) : ((h) aVar).f6024l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f6016a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f6017b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f6018c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6019d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f6020f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f6021g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f6022j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f6023k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f6024l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f6016a);
        sb2.append(", model=");
        sb2.append(this.f6017b);
        sb2.append(", hardware=");
        sb2.append(this.f6018c);
        sb2.append(", device=");
        sb2.append(this.f6019d);
        sb2.append(", product=");
        sb2.append(this.e);
        sb2.append(", osBuild=");
        sb2.append(this.f6020f);
        sb2.append(", manufacturer=");
        sb2.append(this.f6021g);
        sb2.append(", fingerprint=");
        sb2.append(this.h);
        sb2.append(", locale=");
        sb2.append(this.i);
        sb2.append(", country=");
        sb2.append(this.f6022j);
        sb2.append(", mccMnc=");
        sb2.append(this.f6023k);
        sb2.append(", applicationBuild=");
        return q1.a.m(sb2, this.f6024l, "}");
    }
}
