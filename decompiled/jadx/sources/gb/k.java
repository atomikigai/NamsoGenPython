package gb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzpb;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import z7.a1;
import z7.b2;
import z7.c2;
import z7.d2;
import z7.i0;
import z7.p2;
import z7.t1;
import z7.t2;
import z7.x1;
import z7.z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4475b;

    public /* synthetic */ k(Object obj, int i) {
        this.f4474a = i;
        this.f4475b = obj;
    }

    public static void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    r9.b bVar = (r9.b) n9.g.d().b(r9.b.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (bVar != null) {
                        String string = bundle.getString("google.c.a.c_id");
                        r9.c cVar = (r9.c) bVar;
                        if (s9.b.c("fcm") && s9.b.d("fcm", "_ln")) {
                            cVar.f8232a.f10615a.zzO("fcm", "_ln", string, true);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string);
                        cVar.a("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            r7.g.u("_no", bundle);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        Uri uri;
        switch (this.f4474a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent == null || !((Set) this.f4475b).add(intent)) {
                    return;
                }
                if (Build.VERSION.SDK_INT <= 25) {
                    new Handler(Looper.getMainLooper()).post(new androidx.activity.d(this, intent));
                    return;
                } else {
                    a(intent);
                    return;
                }
            case 1:
                jc.i.e(activity, "activity");
                return;
            default:
                a1 a1Var = (a1) ((x1) this.f4475b).f159a;
                try {
                    i0 i0Var = a1Var.f11007t;
                    a1.f(i0Var);
                    i0Var.f11198y.b("onActivityCreated");
                    Intent intent2 = activity.getIntent();
                    if (intent2 == null) {
                        d2 d2Var = a1Var.f11013z;
                        a1.e(d2Var);
                        d2Var.l(activity, bundle);
                        return;
                    }
                    zzpb.zzc();
                    Uri data = null;
                    if (a1Var.f11005r.l(null, z7.z.f11490x0)) {
                        Uri data2 = intent2.getData();
                        if (data2 == null || !data2.isHierarchical()) {
                            Bundle extras = intent2.getExtras();
                            if (extras != null) {
                                String string = extras.getString("com.android.vending.referral_url");
                                if (!TextUtils.isEmpty(string)) {
                                    data = Uri.parse(string);
                                }
                            }
                        } else {
                            uri = data2;
                        }
                        if (uri == null && uri.isHierarchical()) {
                            a1.d(a1Var.f11010w);
                            String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                            String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                            String queryParameter = uri.getQueryParameter("referrer");
                            boolean z4 = bundle == null;
                            z0 z0Var = a1Var.f11008u;
                            a1.f(z0Var);
                            try {
                                try {
                                    z0Var.l(new t1(this, z4, uri, str, queryParameter));
                                } catch (RuntimeException e) {
                                    e = e;
                                    i0 i0Var2 = a1Var.f11007t;
                                    a1.f(i0Var2);
                                    i0Var2.f11190f.c(e, "Throwable caught in onActivityCreated");
                                }
                            } catch (Throwable th) {
                                th = th;
                                d2 d2Var2 = a1Var.f11013z;
                                a1.e(d2Var2);
                                d2Var2.l(activity, bundle);
                                throw th;
                            }
                            break;
                        }
                        d2 d2Var3 = a1Var.f11013z;
                        a1.e(d2Var3);
                        d2Var3.l(activity, bundle);
                        return;
                    }
                    data = intent2.getData();
                    uri = data;
                    if (uri == null) {
                    }
                    d2 d2Var4 = a1Var.f11013z;
                    a1.e(d2Var4);
                    d2Var4.l(activity, bundle);
                    return;
                } catch (RuntimeException e4) {
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                    d2 d2Var5 = a1Var.f11013z;
                    a1.e(d2Var5);
                    d2Var5.l(activity, bundle);
                    throw th;
                }
                i0 i0Var3 = a1Var.f11007t;
                a1.f(i0Var3);
                i0Var3.f11190f.c(e, "Throwable caught in onActivityCreated");
                d2 d2Var6 = a1Var.f11013z;
                a1.e(d2Var6);
                d2Var6.l(activity, bundle);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f4474a) {
            case 0:
                return;
            case 1:
                jc.i.e(activity, "activity");
                return;
            default:
                d2 d2Var = ((a1) ((x1) this.f4475b).f159a).f11013z;
                a1.e(d2Var);
                synchronized (d2Var.f11080w) {
                    try {
                        if (activity == d2Var.f11075r) {
                            d2Var.f11075r = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (((a1) d2Var.f159a).f11005r.m()) {
                    d2Var.f11074f.remove(activity);
                    return;
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i;
        switch (this.f4474a) {
            case 0:
                if (activity.isFinishing()) {
                    ((Set) this.f4475b).remove(activity.getIntent());
                    return;
                }
                return;
            case 1:
                jc.i.e(activity, "activity");
                androidx.viewpager2.adapter.c cVar = (androidx.viewpager2.adapter.c) this.f4475b;
                int i10 = qc.a.f8058d;
                cVar.f1196a = qd.b.E(SystemClock.elapsedRealtime(), qc.c.MILLISECONDS);
                return;
            default:
                d2 d2Var = ((a1) ((x1) this.f4475b).f159a).f11013z;
                a1.e(d2Var);
                synchronized (d2Var.f11080w) {
                    d2Var.f11079v = false;
                    i = 1;
                    d2Var.f11076s = true;
                    break;
                }
                ((a1) d2Var.f159a).f11012y.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (((a1) d2Var.f159a).f11005r.m()) {
                    b2 b2VarM = d2Var.m(activity);
                    d2Var.f11073d = d2Var.f11072c;
                    d2Var.f11072c = null;
                    z0 z0Var = ((a1) d2Var.f159a).f11008u;
                    a1.f(z0Var);
                    z0Var.l(new q3.j(d2Var, b2VarM, jElapsedRealtime, 2));
                } else {
                    d2Var.f11072c = null;
                    z0 z0Var2 = ((a1) d2Var.f159a).f11008u;
                    a1.f(z0Var2);
                    z0Var2.l(new z7.s(d2Var, jElapsedRealtime, i));
                }
                t2 t2Var = ((a1) ((x1) this.f4475b).f159a).f11009v;
                a1.e(t2Var);
                ((a1) t2Var.f159a).f11012y.getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                z0 z0Var3 = ((a1) t2Var.f159a).f11008u;
                a1.f(z0Var3);
                z0Var3.l(new p2(t2Var, jElapsedRealtime2, i));
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0199  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d8  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        nb.c cVar;
        Integer num;
        long jD;
        qc.a aVar = null;
        switch (this.f4474a) {
            case 0:
                return;
            case 1:
                jc.i.e(activity, "activity");
                androidx.viewpager2.adapter.c cVar2 = (androidx.viewpager2.adapter.c) this.f4475b;
                int i = qc.a.f8058d;
                long jE = qd.b.E(SystemClock.elapsedRealtime(), qc.c.MILLISECONDS);
                long j4 = cVar2.f1196a;
                long j10 = ((-(j4 >> 1)) << 1) + ((long) (((int) j4) & 1));
                int i10 = qc.b.f8060a;
                if (qc.a.d(jE)) {
                    if (qc.a.d(j10) && (j10 ^ jE) < 0) {
                        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
                    }
                } else if (qc.a.d(j10)) {
                    jE = j10;
                } else {
                    int i11 = ((int) jE) & 1;
                    if (i11 == (((int) j10) & 1)) {
                        long j11 = (jE >> 1) + (j10 >> 1);
                        if (i11 == 0) {
                            jE = (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? qd.b.o(j11 / ((long) 1000000)) : j11 << 1;
                        } else if (-4611686018426L > j11 || j11 >= 4611686018427L) {
                            jE = qd.b.o(jd.d.h(j11));
                        } else {
                            j11 *= (long) 1000000;
                        }
                    } else {
                        jE = i11 == 1 ? qc.a.a(jE >> 1, j10 >> 1) : qc.a.a(j10 >> 1, jE >> 1);
                    }
                }
                nb.f fVar = (nb.f) cVar2.f1199d;
                Bundle bundle = (Bundle) fVar.f7391a.f188b;
                qc.a aVar2 = bundle.containsKey("firebase_sessions_sessions_restart_timeout") ? new qc.a(qd.b.D(bundle.getInt("firebase_sessions_sessions_restart_timeout"), qc.c.SECONDS)) : null;
                if (aVar2 != null) {
                    jD = aVar2.f8059a;
                    if (jD <= 0 || qc.a.d(jD)) {
                        cVar = fVar.f7392b.f7378c.f7401b;
                        if (cVar != null) {
                            jc.i.i("sessionConfigs");
                            throw null;
                        }
                        num = cVar.f7382c;
                        if (num != null) {
                            int i12 = qc.a.f8058d;
                            aVar = new qc.a(qd.b.D(num.intValue(), qc.c.SECONDS));
                        }
                        if (aVar != null) {
                            jD = aVar.f8059a;
                            if (jD > 0 || qc.a.d(jD)) {
                                jD = qd.b.D(30, qc.c.MINUTES);
                            }
                        } else {
                            jD = qd.b.D(30, qc.c.MINUTES);
                        }
                    }
                } else {
                    cVar = fVar.f7392b.f7378c.f7401b;
                    if (cVar != null) {
                        jc.i.i("sessionConfigs");
                        throw null;
                    }
                    num = cVar.f7382c;
                    if (num != null) {
                        int i13 = qc.a.f8058d;
                        aVar = new qc.a(qd.b.D(num.intValue(), qc.c.SECONDS));
                    }
                    if (aVar != null) {
                        jD = aVar.f8059a;
                        if (jD > 0) {
                            jD = qd.b.D(30, qc.c.MINUTES);
                        } else {
                            jD = qd.b.D(30, qc.c.MINUTES);
                        }
                    } else {
                        jD = qd.b.D(30, qc.c.MINUTES);
                    }
                }
                if (qc.a.c(jE, jD) > 0) {
                    cVar2.b();
                    return;
                }
                return;
            default:
                t2 t2Var = ((a1) ((x1) this.f4475b).f159a).f11009v;
                a1.e(t2Var);
                ((a1) t2Var.f159a).f11012y.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                z0 z0Var = ((a1) t2Var.f159a).f11008u;
                a1.f(z0Var);
                int i14 = 0;
                z0Var.l(new p2(t2Var, jElapsedRealtime, i14));
                d2 d2Var = ((a1) ((x1) this.f4475b).f159a).f11013z;
                a1.e(d2Var);
                synchronized (d2Var.f11080w) {
                    d2Var.f11079v = true;
                    if (activity != d2Var.f11075r) {
                        synchronized (d2Var.f11080w) {
                            d2Var.f11075r = activity;
                            d2Var.f11076s = false;
                            break;
                        }
                        if (((a1) d2Var.f159a).f11005r.m()) {
                            d2Var.f11077t = null;
                            z0 z0Var2 = ((a1) d2Var.f159a).f11008u;
                            a1.f(z0Var2);
                            z0Var2.l(new c2(d2Var, 1));
                        }
                    }
                }
                if (!((a1) d2Var.f159a).f11005r.m()) {
                    d2Var.f11072c = d2Var.f11077t;
                    z0 z0Var3 = ((a1) d2Var.f159a).f11008u;
                    a1.f(z0Var3);
                    z0Var3.l(new c2(d2Var, 0));
                    return;
                }
                d2Var.n(activity, d2Var.m(activity), false);
                z7.u uVarH = ((a1) d2Var.f159a).h();
                ((a1) uVarH.f159a).f11012y.getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                z0 z0Var4 = ((a1) uVarH.f159a).f11008u;
                a1.f(z0Var4);
                z0Var4.l(new z7.s(uVarH, jElapsedRealtime2, i14));
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        b2 b2Var;
        switch (this.f4474a) {
            case 0:
                break;
            case 1:
                jc.i.e(activity, "activity");
                jc.i.e(bundle, "outState");
                break;
            default:
                d2 d2Var = ((a1) ((x1) this.f4475b).f159a).f11013z;
                a1.e(d2Var);
                if (((a1) d2Var.f159a).f11005r.m() && bundle != null && (b2Var = (b2) d2Var.f11074f.get(activity)) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("id", b2Var.f11030c);
                    bundle2.putString("name", b2Var.f11028a);
                    bundle2.putString("referrer_name", b2Var.f11029b);
                    bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f4474a) {
            case 1:
                jc.i.e(activity, "activity");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f4474a) {
            case 1:
                jc.i.e(activity, "activity");
                break;
        }
    }

    public k() {
        this.f4474a = 0;
        this.f4475b = Collections.newSetFromMap(new WeakHashMap());
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }
}
