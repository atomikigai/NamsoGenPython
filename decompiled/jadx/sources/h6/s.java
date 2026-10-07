package h6;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f5078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f5079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f5080d;
    public final int e;

    public s(String str, double d10, double d11, double d12, int i) {
        this.f5077a = str;
        this.f5079c = d10;
        this.f5078b = d11;
        this.f5080d = d12;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return com.google.android.gms.common.internal.i0.m(this.f5077a, sVar.f5077a) && this.f5078b == sVar.f5078b && this.f5079c == sVar.f5079c && this.e == sVar.e && Double.compare(this.f5080d, sVar.f5080d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5077a, Double.valueOf(this.f5078b), Double.valueOf(this.f5079c), Double.valueOf(this.f5080d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        aa.c cVar = new aa.c(this);
        cVar.b(this.f5077a, "name");
        cVar.b(Double.valueOf(this.f5079c), "minBound");
        cVar.b(Double.valueOf(this.f5078b), "maxBound");
        cVar.b(Double.valueOf(this.f5080d), "percent");
        cVar.b(Integer.valueOf(this.e), "count");
        return cVar.toString();
    }
}
