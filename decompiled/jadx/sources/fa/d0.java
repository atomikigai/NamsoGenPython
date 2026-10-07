package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3711d;
    public final Long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d1 f3713g;
    public final q1 h;
    public final p1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e1 f3714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t1 f3715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3716l;

    public d0(String str, String str2, String str3, long j4, Long l2, boolean z4, d1 d1Var, q1 q1Var, p1 p1Var, e1 e1Var, t1 t1Var, int i) {
        this.f3708a = str;
        this.f3709b = str2;
        this.f3710c = str3;
        this.f3711d = j4;
        this.e = l2;
        this.f3712f = z4;
        this.f3713g = d1Var;
        this.h = q1Var;
        this.i = p1Var;
        this.f3714j = e1Var;
        this.f3715k = t1Var;
        this.f3716l = i;
    }

    @Override // fa.r1
    public final b9.j a() {
        b9.j jVar = new b9.j();
        jVar.f1469a = this.f3708a;
        jVar.f1470b = this.f3709b;
        jVar.f1471c = this.f3710c;
        jVar.f1472d = Long.valueOf(this.f3711d);
        jVar.e = this.e;
        jVar.f1473f = Boolean.valueOf(this.f3712f);
        jVar.f1474g = this.f3713g;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.f1475j = this.f3714j;
        jVar.f1476k = this.f3715k;
        jVar.f1477l = Integer.valueOf(this.f3716l);
        return jVar;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l2;
        q1 q1Var;
        p1 p1Var;
        e1 e1Var;
        t1 t1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            d0 d0Var = (d0) ((r1) obj);
            t1 t1Var2 = d0Var.f3715k;
            e1 e1Var2 = d0Var.f3714j;
            p1 p1Var2 = d0Var.i;
            q1 q1Var2 = d0Var.h;
            Long l10 = d0Var.e;
            String str2 = d0Var.f3710c;
            if (this.f3708a.equals(d0Var.f3708a) && this.f3709b.equals(d0Var.f3709b) && ((str = this.f3710c) != null ? str.equals(str2) : str2 == null) && this.f3711d == d0Var.f3711d && ((l2 = this.e) != null ? l2.equals(l10) : l10 == null) && this.f3712f == d0Var.f3712f && this.f3713g.equals(d0Var.f3713g) && ((q1Var = this.h) != null ? q1Var.equals(q1Var2) : q1Var2 == null) && ((p1Var = this.i) != null ? p1Var.equals(p1Var2) : p1Var2 == null) && ((e1Var = this.f3714j) != null ? e1Var.equals(e1Var2) : e1Var2 == null) && ((t1Var = this.f3715k) != null ? t1Var.f3848a.equals(t1Var2) : t1Var2 == null) && this.f3716l == d0Var.f3716l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f3708a.hashCode() ^ 1000003) * 1000003) ^ this.f3709b.hashCode()) * 1000003;
        String str = this.f3710c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j4 = this.f3711d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        Long l2 = this.e;
        int iHashCode3 = (((((i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.f3712f ? 1231 : 1237)) * 1000003) ^ this.f3713g.hashCode()) * 1000003;
        q1 q1Var = this.h;
        int iHashCode4 = (iHashCode3 ^ (q1Var == null ? 0 : q1Var.hashCode())) * 1000003;
        p1 p1Var = this.i;
        int iHashCode5 = (iHashCode4 ^ (p1Var == null ? 0 : p1Var.hashCode())) * 1000003;
        e1 e1Var = this.f3714j;
        int iHashCode6 = (iHashCode5 ^ (e1Var == null ? 0 : e1Var.hashCode())) * 1000003;
        t1 t1Var = this.f3715k;
        return ((iHashCode6 ^ (t1Var != null ? t1Var.f3848a.hashCode() : 0)) * 1000003) ^ this.f3716l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f3708a);
        sb2.append(", identifier=");
        sb2.append(this.f3709b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f3710c);
        sb2.append(", startedAt=");
        sb2.append(this.f3711d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f3712f);
        sb2.append(", app=");
        sb2.append(this.f3713g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.i);
        sb2.append(", device=");
        sb2.append(this.f3714j);
        sb2.append(", events=");
        sb2.append(this.f3715k);
        sb2.append(", generatorType=");
        return u3.b.c(sb2, this.f3716l, "}");
    }
}
