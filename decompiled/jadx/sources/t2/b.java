package t2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o6.h0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f8526a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f8527b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f8528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r7.j f8529d;
    public final h0 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8531g;
    public final int h;

    public b(r7.i iVar) {
        String str = t.f8558a;
        this.f8528c = new s();
        this.f8529d = new r7.j();
        this.e = new h0(5, false);
        this.f8530f = 4;
        this.f8531g = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.h = 20;
    }
}
