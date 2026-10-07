package wc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends jc.j implements ic.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f9957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f9958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f9959d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9960a;

    static {
        int i = 2;
        f9957b = new w(i, 0);
        f9958c = new w(i, 1);
        f9959d = new w(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, int i10) {
        super(i);
        this.f9960a = i10;
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9960a) {
            case 0:
                yb.g gVar = (yb.g) obj2;
                if (!(gVar instanceof x)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? gVar : Integer.valueOf(iIntValue + 1);
            case 1:
                x xVar = (x) obj;
                yb.g gVar2 = (yb.g) obj2;
                if (xVar != null) {
                    return xVar;
                }
                if (gVar2 instanceof x) {
                    return (x) gVar2;
                }
                return null;
            default:
                a0 a0Var = (a0) obj;
                yb.g gVar3 = (yb.g) obj2;
                if (gVar3 instanceof x) {
                    x xVar2 = (x) gVar3;
                    Object objB = xVar2.b(a0Var.f9919a);
                    Object[] objArr = a0Var.f9920b;
                    int i = a0Var.f9922d;
                    objArr[i] = objB;
                    x[] xVarArr = a0Var.f9921c;
                    a0Var.f9922d = i + 1;
                    xVarArr[i] = xVar2;
                }
                return a0Var;
        }
    }
}
