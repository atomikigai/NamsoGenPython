package t2;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f8546c;

    public g(int i, Notification notification, int i10) {
        this.f8544a = i;
        this.f8546c = notification;
        this.f8545b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f8544a == gVar.f8544a && this.f8545b == gVar.f8545b) {
            return this.f8546c.equals(gVar.f8546c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8546c.hashCode() + (((this.f8544a * 31) + this.f8545b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f8544a + ", mForegroundServiceType=" + this.f8545b + ", mNotification=" + this.f8546c + '}';
    }
}
