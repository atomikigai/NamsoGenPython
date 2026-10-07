package lb;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z9.c f6947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a f6948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6949d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f6950f;

    public u(boolean z4, z9.c cVar) {
        t tVar = t.f6945t;
        this.f6946a = z4;
        this.f6947b = cVar;
        this.f6948c = tVar;
        this.f6949d = a();
        this.e = -1;
    }

    public final String a() {
        String string = ((UUID) this.f6948c.a()).toString();
        jc.i.d(string, "uuidGenerator().toString()");
        String lowerCase = pc.o.c0(string, "-", "").toLowerCase(Locale.ROOT);
        jc.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
