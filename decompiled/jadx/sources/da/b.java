package da;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.x f3090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f3092c;

    public b(fa.x xVar, String str, File file) {
        this.f3090a = xVar;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f3091b = str;
        this.f3092c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3090a.equals(bVar.f3090a) && this.f3091b.equals(bVar.f3091b) && this.f3092c.equals(bVar.f3092c);
    }

    public final int hashCode() {
        return ((((this.f3090a.hashCode() ^ 1000003) * 1000003) ^ this.f3091b.hashCode()) * 1000003) ^ this.f3092c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f3090a + ", sessionId=" + this.f3091b + ", reportFile=" + this.f3092c + "}";
    }
}
