package mb;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f7085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f7086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f7087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zc.d f7088d;
    public Map e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f7089f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f7091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7092t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ac.c cVar2) {
        super(cVar2);
        this.f7091s = cVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f7090r = obj;
        this.f7092t |= Integer.MIN_VALUE;
        return this.f7091s.b(this);
    }
}
