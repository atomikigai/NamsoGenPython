package d0;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends u {
    public CharSequence e;

    @Override // d0.u
    public final void a(a3.j jVar) {
        Notification.BigTextStyle bigTextStyleA = q.a(q.c(q.b((Notification.Builder) jVar.f108b), this.f2787b), this.e);
        if (this.f2789d) {
            q.d(bigTextStyleA, this.f2788c);
        }
    }

    @Override // d0.u
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
