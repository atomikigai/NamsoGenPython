package h3;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ nc.c[] f4796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c1.c f4797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1.d f4798c;

    static {
        jc.l lVar = new jc.l(jc.b.f5759a, p.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        jc.r.f5777a.getClass();
        f4796a = new nc.c[]{lVar};
        f4797b = com.bumptech.glide.d.y("coins_prefs", new o(0), 10);
        android.support.v4.media.session.a.l("coin_balance");
        f4798c = new d1.d("app_language");
    }

    public static final z0.f a(Context context) {
        return f4797b.a(context, f4796a[0]);
    }
}
