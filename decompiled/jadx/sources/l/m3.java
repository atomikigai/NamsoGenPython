package l;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m3 implements n5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6362d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f6363f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f6364r;

    @Override // tb.a
    public Object get() {
        Context context = (Context) ((tb.a) this.f6359a).get();
        m5.d dVar = (m5.d) ((tb.a) this.f6360b).get();
        s5.d dVar2 = (s5.d) ((tb.a) this.f6361c).get();
        q5.d dVar3 = (q5.d) ((q5.d) this.f6362d).get();
        Executor executor = (Executor) ((tb.a) this.e).get();
        t5.c cVar = (t5.c) ((tb.a) this.f6363f).get();
        r7.j jVar = new r7.j();
        r7.i iVar = new r7.i();
        s5.c cVar2 = (s5.c) ((tb.a) this.f6364r).get();
        c3.j jVar2 = new c3.j();
        jVar2.f1759a = context;
        jVar2.f1760b = dVar;
        jVar2.f1761c = dVar2;
        jVar2.f1762d = dVar3;
        jVar2.e = executor;
        jVar2.f1763f = cVar;
        jVar2.f1764g = jVar;
        jVar2.h = iVar;
        jVar2.i = cVar2;
        return jVar2;
    }
}
