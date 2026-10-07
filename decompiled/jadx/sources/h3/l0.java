package h3;

import java.util.List;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f4758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f4759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4760d;
    public final /* synthetic */ int e;

    public /* synthetic */ l0(e1 e1Var, List list, boolean z4, int i, int i10) {
        this.f4757a = i10;
        this.f4758b = e1Var;
        this.f4759c = list;
        this.f4760d = z4;
        this.e = i;
    }

    @Override // ic.a
    public final Object a() throws JSONException {
        switch (this.f4757a) {
            case 0:
                this.f4758b.t0(this.e + 1, this.f4759c, this.f4760d);
                break;
            case 1:
                this.f4758b.t0(this.e + 1, this.f4759c, this.f4760d);
                break;
            case 2:
                this.f4758b.t0(this.e + 1, this.f4759c, this.f4760d);
                break;
            case 3:
                this.f4758b.t0(this.e + 1, this.f4759c, this.f4760d);
                break;
            default:
                this.f4758b.t0(this.e + 1, this.f4759c, this.f4760d);
                break;
        }
        return ub.k.f9073a;
    }
}
