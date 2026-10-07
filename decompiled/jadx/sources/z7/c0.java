package z7;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends m0 {
    public String A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11048d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11049f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f11050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f11051s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f11052t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f11053u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11054v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f11055w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f11056x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f11057y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f11058z;

    public c0(a1 a1Var, long j4) {
        super(a1Var);
        this.f11058z = 0L;
        this.A = null;
        this.f11051s = j4;
    }

    @Override // z7.m0
    public final boolean f() {
        return true;
    }

    public final String g() {
        d();
        com.google.android.gms.common.internal.i0.i(this.f11047c);
        return this.f11047c;
    }

    public final String h() {
        c();
        d();
        com.google.android.gms.common.internal.i0.i(this.f11055w);
        return this.f11055w;
    }

    public final void j() {
        String str;
        c();
        a1 a1Var = (a1) this.f159a;
        q0 q0Var = a1Var.f11006s;
        i0 i0Var = a1Var.f11007t;
        a1.d(q0Var);
        if (q0Var.h().f(i1.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            d3 d3Var = a1Var.f11010w;
            a1.d(d3Var);
            d3Var.l().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            a1.f(i0Var);
            i0Var.f11197x.b("Analytics Storage consent is not granted");
            str = null;
        }
        a1.f(i0Var);
        i0Var.f11197x.b("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f11057y = str;
        a1Var.f11012y.getClass();
        this.f11058z = System.currentTimeMillis();
    }
}
