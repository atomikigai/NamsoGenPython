package d0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2769a;
    public CharSequence e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f2773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f2774g;
    public IconCompat h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2775j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f2777l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bundle f2779n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f2782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f2783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Notification f2784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f2785t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2770b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2771c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2772d = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2776k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2778m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2780o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2781p = 0;

    public t(Context context, String str) {
        Notification notification = new Notification();
        this.f2784s = notification;
        this.f2769a = context;
        this.f2782q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f2775j = 0;
        this.f2785t = new ArrayList();
        this.f2783r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification a() {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        int i10;
        a3.j jVar = new a3.j();
        new ArrayList();
        jVar.f110d = new Bundle();
        jVar.f109c = this;
        Context context = this.f2769a;
        jVar.f107a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            jVar.f108b = c0.a(context, this.f2782q);
        } else {
            jVar.f108b = new Notification.Builder(context);
        }
        Notification.Builder builder = (Notification.Builder) jVar.f108b;
        Notification notification = this.f2784s;
        Context context2 = null;
        int i11 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f2773f).setContentInfo(null).setContentIntent(this.f2774g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.i).setProgress(0, 0, false);
        Notification.Builder builder2 = (Notification.Builder) jVar.f108b;
        IconCompat iconCompat = this.h;
        a0.b(builder2, iconCompat == null ? null : i0.d.c(iconCompat, context));
        v.b(v.d(v.c((Notification.Builder) jVar.f108b, null), false), this.f2775j);
        ArrayList arrayList2 = this.f2770b;
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            l lVar = (l) obj;
            if (lVar.f2762b == null && (i10 = lVar.e) != 0) {
                lVar.f2762b = IconCompat.b(i10);
            }
            IconCompat iconCompat2 = lVar.f2762b;
            boolean z4 = lVar.f2763c;
            Bundle bundle2 = lVar.f2761a;
            Notification.Action.Builder builderA = a0.a(iconCompat2 != null ? i0.d.c(iconCompat2, context2) : context2, lVar.f2765f, lVar.f2766g);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z4);
            int i13 = Build.VERSION.SDK_INT;
            b0.a(builderA, z4);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i13 >= 28) {
                d0.b(builderA, 0);
            }
            if (i13 >= 29) {
                e0.c(builderA, false);
            }
            if (i13 >= 31) {
                f0.a(builderA, false);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", lVar.f2764d);
            y.b(builderA, bundle3);
            y.a((Notification.Builder) jVar.f108b, y.d(builderA));
            context2 = null;
        }
        Bundle bundle4 = this.f2779n;
        if (bundle4 != null) {
            ((Bundle) jVar.f110d).putAll(bundle4);
        }
        int i14 = Build.VERSION.SDK_INT;
        w.a((Notification.Builder) jVar.f108b, this.f2776k);
        y.i((Notification.Builder) jVar.f108b, this.f2778m);
        y.g((Notification.Builder) jVar.f108b, null);
        y.j((Notification.Builder) jVar.f108b, null);
        y.h((Notification.Builder) jVar.f108b, false);
        z.b((Notification.Builder) jVar.f108b, null);
        z.c((Notification.Builder) jVar.f108b, this.f2780o);
        z.f((Notification.Builder) jVar.f108b, this.f2781p);
        z.d((Notification.Builder) jVar.f108b, null);
        z.e((Notification.Builder) jVar.f108b, notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = this.f2785t;
        ArrayList arrayList4 = this.f2771c;
        if (i14 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    throw q1.a.g(it);
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    r.f fVar = new r.f(arrayList3.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList3.get(i15);
                i15++;
                z.a((Notification.Builder) jVar.f108b, (String) obj2);
            }
        }
        ArrayList arrayList5 = this.f2772d;
        if (arrayList5.size() > 0) {
            if (this.f2779n == null) {
                this.f2779n = new Bundle();
            }
            Bundle bundle5 = this.f2779n.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i16 = 0;
            while (i16 < arrayList5.size()) {
                String string = Integer.toString(i16);
                l lVar2 = (l) arrayList5.get(i16);
                Bundle bundle8 = new Bundle();
                if (lVar2.f2762b == null && (i = lVar2.e) != 0) {
                    lVar2.f2762b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = lVar2.f2762b;
                Bundle bundle9 = lVar2.f2761a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i11);
                bundle8.putCharSequence("title", lVar2.f2765f);
                bundle8.putParcelable("actionIntent", lVar2.f2766g);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", lVar2.f2763c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", lVar2.f2764d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i16++;
                i11 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f2779n == null) {
                this.f2779n = new Bundle();
            }
            this.f2779n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) jVar.f110d).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i17 = Build.VERSION.SDK_INT;
        x.a((Notification.Builder) jVar.f108b, this.f2779n);
        b0.e((Notification.Builder) jVar.f108b, null);
        if (i17 >= 26) {
            c0.b((Notification.Builder) jVar.f108b, 0);
            c0.e((Notification.Builder) jVar.f108b, null);
            c0.f((Notification.Builder) jVar.f108b, null);
            c0.g((Notification.Builder) jVar.f108b, 0L);
            c0.d((Notification.Builder) jVar.f108b, 0);
            if (!TextUtils.isEmpty(this.f2782q)) {
                ((Notification.Builder) jVar.f108b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i17 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                throw q1.a.g(it2);
            }
        }
        if (i17 >= 29) {
            e0.a((Notification.Builder) jVar.f108b, this.f2783r);
            e0.b((Notification.Builder) jVar.f108b, null);
        }
        t tVar = (t) jVar.f109c;
        u uVar = tVar.f2777l;
        if (uVar != null) {
            uVar.a(jVar);
        }
        Notification.Builder builder3 = (Notification.Builder) jVar.f108b;
        Notification notificationA = Build.VERSION.SDK_INT >= 26 ? v.a(builder3) : v.a(builder3);
        if (uVar != null) {
            tVar.f2777l.getClass();
        }
        if (uVar != null && (bundle = notificationA.extras) != null) {
            if (uVar.f2789d) {
                bundle.putCharSequence("android.summaryText", uVar.f2788c);
            }
            CharSequence charSequence = uVar.f2787b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", uVar.b());
        }
        return notificationA;
    }

    public final void c(boolean z4) {
        Notification notification = this.f2784s;
        if (z4) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f2769a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f584k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f586b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void e(u uVar) {
        if (this.f2777l != uVar) {
            this.f2777l = uVar;
            if (uVar.f2786a != this) {
                uVar.f2786a = this;
                e(uVar);
            }
        }
    }
}
