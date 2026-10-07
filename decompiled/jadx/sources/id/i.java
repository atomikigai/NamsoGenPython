package id;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends ed.a {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5286g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.e = i;
        this.f5285f = obj;
        this.f5286g = obj2;
    }

    @Override // ed.a
    public final long a() {
        long jA;
        int i;
        w[] wVarArr;
        switch (this.e) {
            case 0:
                o oVar = (o) this.f5285f;
                oVar.f5297a.a(oVar, (a0) ((jc.q) this.f5286g).f5776a);
                return -1L;
            case 1:
                try {
                    ((o) this.f5285f).f5297a.b((w) this.f5286g);
                    break;
                } catch (IOException e) {
                    jd.n nVar = jd.n.f5799a;
                    jd.n nVar2 = jd.n.f5799a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f5285f).f5299c;
                    nVar2.getClass();
                    jd.n.i(4, str, e);
                    try {
                        ((w) this.f5286g).c(e, 2);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                k kVar = (k) this.f5285f;
                a0 a0Var = (a0) this.f5286g;
                jc.q qVar = new jc.q();
                o oVar2 = kVar.f5290b;
                synchronized (oVar2.H) {
                    try {
                        synchronized (oVar2) {
                            try {
                                a0 a0Var2 = oVar2.B;
                                a0 a0Var3 = new a0();
                                a0Var3.b(a0Var2);
                                a0Var3.b(a0Var);
                                qVar.f5776a = a0Var3;
                                jA = ((long) a0Var3.a()) - ((long) a0Var2.a());
                                i = 0;
                                wVarArr = (jA == 0 || oVar2.f5298b.isEmpty()) ? null : (w[]) oVar2.f5298b.values().toArray(new w[0]);
                                a0 a0Var4 = (a0) qVar.f5776a;
                                jc.i.e(a0Var4, "<set-?>");
                                oVar2.B = a0Var4;
                                oVar2.f5305u.c(new i(oVar2.f5299c + " onSettings", oVar2, qVar, i), 0L);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            oVar2.H.c((a0) qVar.f5776a);
                        } catch (IOException e4) {
                            oVar2.c(2, 2, e4);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (wVarArr != null) {
                    int length = wVarArr.length;
                    while (i < length) {
                        w wVar = wVarArr[i];
                        synchronized (wVar) {
                            wVar.f5340f += jA;
                            if (jA > 0) {
                                wVar.notifyAll();
                            }
                            break;
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
