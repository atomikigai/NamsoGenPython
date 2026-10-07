package i2;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2.c f5153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5154d;
    public final ub.i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5155f;

    public i(Context context, String str, h2.c cVar, boolean z4) {
        jc.i.e(context, "context");
        jc.i.e(cVar, "callback");
        this.f5151a = context;
        this.f5152b = str;
        this.f5153c = cVar;
        this.f5154d = z4;
        this.e = new ub.i(new a2.d(this, 5));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e.f9070b != ub.j.f9072a) {
            ((h) this.e.getValue()).close();
        }
    }

    @Override // h2.e
    public final String getDatabaseName() {
        return this.f5152b;
    }

    @Override // h2.e
    public final void setWriteAheadLoggingEnabled(boolean z4) {
        if (this.e.f9070b != ub.j.f9072a) {
            ((h) this.e.getValue()).setWriteAheadLoggingEnabled(z4);
        }
        this.f5155f = z4;
    }

    @Override // h2.e
    public final h2.b z() {
        return ((h) this.e.getValue()).c(true);
    }
}
