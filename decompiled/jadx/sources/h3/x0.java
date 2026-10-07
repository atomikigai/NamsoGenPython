package h3;

import com.android.billingclient.api.Purchase;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Purchase f4890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f4891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e1 f4893d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(e1 e1Var, ac.c cVar) {
        super(cVar);
        this.f4893d = e1Var;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.f4892c = obj;
        this.e |= Integer.MIN_VALUE;
        return e1.b0(this.f4893d, null, this);
    }
}
