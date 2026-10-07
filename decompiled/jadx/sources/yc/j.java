package yc;

import java.util.concurrent.TimeUnit;
import t2.m;
import wc.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f10702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10704d;
    public static final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f10705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f10706g;
    public static final m h;

    static {
        String property;
        int i = v.f9956a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f10701a = property;
        f10702b = wc.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = v.f9956a;
        if (i10 < 2) {
            i10 = 2;
        }
        f10703c = wc.a.k(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f10704d = wc.a.k(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(wc.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f10705f = f.f10696a;
        f10706g = new m(0);
        h = new m(1);
    }
}
