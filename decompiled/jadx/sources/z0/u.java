package z0;

import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f10924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileInputStream f10925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f10927d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, ac.c cVar) {
        super(cVar);
        this.f10927d = yVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f10926c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f10927d.g(this);
    }
}
