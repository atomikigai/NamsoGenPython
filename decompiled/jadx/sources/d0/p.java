package d0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends u {
    public IconCompat e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IconCompat f2767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2768g;

    @Override // d0.u
    public final void a(a3.j jVar) {
        Bitmap bitmapA;
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) jVar.f108b;
        Context context = (Context) jVar.f107a;
        Notification.BigPictureStyle bigPictureStyleC = m.c(m.b(builder), this.f2787b);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            if (i >= 31) {
                o.a(bigPictureStyleC, i0.d.c(iconCompat, context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.e;
                int i10 = iconCompat2.f585a;
                if (i10 == -1) {
                    Object obj = iconCompat2.f586b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i10 == 1) {
                    bitmapA = (Bitmap) iconCompat2.f586b;
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.f586b, true);
                }
                bigPictureStyleC = m.a(bigPictureStyleC, bitmapA);
            }
        }
        if (this.f2768g) {
            IconCompat iconCompat3 = this.f2767f;
            if (iconCompat3 == null) {
                m.d(bigPictureStyleC, null);
            } else {
                n.a(bigPictureStyleC, i0.d.c(iconCompat3, context));
            }
        }
        if (this.f2789d) {
            m.e(bigPictureStyleC, this.f2788c);
        }
        if (i >= 31) {
            o.c(bigPictureStyleC, false);
            o.b(bigPictureStyleC, null);
        }
    }

    @Override // d0.u
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
