package d0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f2761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f2762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2764d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f2765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f2766g;

    public l(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatB = IconCompat.b(2131230863);
        Bundle bundle = new Bundle();
        this.f2764d = true;
        this.f2762b = iconCompatB;
        if (iconCompatB.d() == 2) {
            this.e = iconCompatB.c();
        }
        this.f2765f = t.b(str);
        this.f2766g = pendingIntent;
        this.f2761a = bundle;
        this.f2763c = true;
        this.f2764d = true;
    }
}
