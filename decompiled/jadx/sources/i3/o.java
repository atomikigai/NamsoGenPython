package i3;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5194d;
    public final long e;

    public o(String str, String str2, String str3, String str4, long j4) {
        jc.i.e(str, "notificationId");
        jc.i.e(str2, "title");
        jc.i.e(str3, "body");
        this.f5191a = str;
        this.f5192b = str2;
        this.f5193c = str3;
        this.f5194d = str4;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return jc.i.a(this.f5191a, oVar.f5191a) && jc.i.a(this.f5192b, oVar.f5192b) && jc.i.a(this.f5193c, oVar.f5193c) && jc.i.a(this.f5194d, oVar.f5194d) && this.e == oVar.e;
    }

    public final int hashCode() {
        int iD = v.d(v.d(this.f5191a.hashCode() * 31, 31, this.f5192b), 31, this.f5193c);
        String str = this.f5194d;
        return Long.hashCode(this.e) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "NotificationItem(notificationId=" + this.f5191a + ", title=" + this.f5192b + ", body=" + this.f5193c + ", url=" + this.f5194d + ", receivedAt=" + this.e + ')';
    }
}
