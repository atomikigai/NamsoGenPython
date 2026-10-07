package d0;

import android.app.Notification;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
        return bigPictureStyle.bigPicture(bitmap);
    }

    public static Notification.BigPictureStyle b(Notification.Builder builder) {
        return new Notification.BigPictureStyle(builder);
    }

    public static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        return bigPictureStyle.setBigContentTitle(charSequence);
    }

    public static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
        bigPictureStyle.bigLargeIcon(bitmap);
    }

    public static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setSummaryText(charSequence);
    }
}
