package z0;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f10897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f10899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10900d;
    public r e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f10901f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f10902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f10903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10904t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y yVar, ac.c cVar) {
        super(cVar);
        this.f10903s = yVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f10902r = obj;
        this.f10904t |= Integer.MIN_VALUE;
        return this.f10903s.d(this);
    }
}
