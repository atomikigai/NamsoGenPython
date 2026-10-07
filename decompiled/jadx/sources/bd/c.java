package bd;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f1559n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1563d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1565g;
    public final int h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f1569m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        jc.i.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public c(boolean z4, boolean z10, int i, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str) {
        this.f1560a = z4;
        this.f1561b = z10;
        this.f1562c = i;
        this.f1563d = i10;
        this.e = z11;
        this.f1564f = z12;
        this.f1565g = z13;
        this.h = i11;
        this.i = i12;
        this.f1566j = z14;
        this.f1567k = z15;
        this.f1568l = z16;
        this.f1569m = str;
    }

    public final String toString() {
        String str = this.f1569m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f1560a) {
            sb2.append("no-cache, ");
        }
        if (this.f1561b) {
            sb2.append("no-store, ");
        }
        int i = this.f1562c;
        if (i != -1) {
            sb2.append("max-age=");
            sb2.append(i);
            sb2.append(", ");
        }
        int i10 = this.f1563d;
        if (i10 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i10);
            sb2.append(", ");
        }
        if (this.e) {
            sb2.append("private, ");
        }
        if (this.f1564f) {
            sb2.append("public, ");
        }
        if (this.f1565g) {
            sb2.append("must-revalidate, ");
        }
        int i11 = this.h;
        if (i11 != -1) {
            sb2.append("max-stale=");
            sb2.append(i11);
            sb2.append(", ");
        }
        int i12 = this.i;
        if (i12 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i12);
            sb2.append(", ");
        }
        if (this.f1566j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f1567k) {
            sb2.append("no-transform, ");
        }
        if (this.f1568l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        jc.i.d(string, "StringBuilder().apply(builderAction).toString()");
        this.f1569m = string;
        return string;
    }
}
