package hd;

import fd.k;
import java.io.IOException;
import jc.i;
import od.h;
import od.j;
import od.v;
import od.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ab.a f5115c;

    public a(ab.a aVar) {
        this.f5115c = aVar;
        this.f5113a = new j(((h) aVar.f269d).a());
    }

    @Override // od.v
    public final x a() {
        return this.f5113a;
    }

    public final void c() {
        ab.a aVar = this.f5115c;
        int i = aVar.f266a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + aVar.f266a);
        }
        j jVar = this.f5113a;
        x xVar = jVar.e;
        jVar.e = x.f7767d;
        xVar.a();
        xVar.b();
        aVar.f266a = 6;
    }

    @Override // od.v
    public long t(long j4, od.f fVar) throws IOException {
        ab.a aVar = this.f5115c;
        i.e(fVar, "sink");
        try {
            return ((h) aVar.f269d).t(j4, fVar);
        } catch (IOException e) {
            ((k) aVar.f268c).k();
            c();
            throw e;
        }
    }
}
