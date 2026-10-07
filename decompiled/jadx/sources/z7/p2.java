package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2 f11301c;

    public /* synthetic */ p2(t2 t2Var, long j4, int i) {
        this.f11299a = i;
        this.f11301c = t2Var;
        this.f11300b = j4;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ab  */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11299a) {
            case 0:
                t2 t2Var = this.f11301c;
                t2Var.c();
                s2 s2Var = t2Var.f11371f;
                t2Var.g();
                a1 a1Var = (a1) t2Var.f159a;
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                fd.b bVar = i0Var.f11198y;
                long j4 = this.f11300b;
                bVar.c(Long.valueOf(j4), "Activity resumed, time");
                g gVar = a1Var.f11005r;
                if (gVar.l(null, z.f11492y0)) {
                    if (gVar.m() || t2Var.f11370d) {
                        s2Var.f11346d.c();
                        s2Var.f11345c.a();
                        s2Var.f11343a = j4;
                        s2Var.f11344b = j4;
                    }
                } else if (gVar.m()) {
                    s2Var.f11346d.c();
                    s2Var.f11345c.a();
                    s2Var.f11343a = j4;
                    s2Var.f11344b = j4;
                } else {
                    q0 q0Var = a1Var.f11006s;
                    a1.d(q0Var);
                    if (q0Var.B.b()) {
                        s2Var.f11346d.c();
                        s2Var.f11345c.a();
                        s2Var.f11343a = j4;
                        s2Var.f11344b = j4;
                    }
                }
                s5.j jVar = t2Var.f11372r;
                t2 t2Var2 = (t2) jVar.f8446c;
                t2Var2.c();
                q2 q2Var = (q2) jVar.f8445b;
                if (q2Var != null) {
                    t2Var2.f11369c.removeCallbacks(q2Var);
                }
                q0 q0Var2 = ((a1) t2Var2.f159a).f11006s;
                a1.d(q0Var2);
                q0Var2.B.a(false);
                t2Var2.c();
                t2Var2.f11370d = false;
                ta.c cVar = t2Var.e;
                t2 t2Var3 = (t2) cVar.f8662a;
                a1 a1Var2 = (a1) t2Var3.f159a;
                t2Var3.c();
                if (a1Var2.b()) {
                    a1Var2.f11012y.getClass();
                    cVar.k(System.currentTimeMillis(), false);
                    break;
                }
                break;
            default:
                t2 t2Var4 = this.f11301c;
                t2Var4.c();
                t2Var4.g();
                a1 a1Var3 = (a1) t2Var4.f159a;
                i0 i0Var2 = a1Var3.f11007t;
                a1.f(i0Var2);
                fd.b bVar2 = i0Var2.f11198y;
                long j10 = this.f11300b;
                bVar2.c(Long.valueOf(j10), "Activity paused, time");
                s5.j jVar2 = t2Var4.f11372r;
                t2 t2Var5 = (t2) jVar2.f8446c;
                ((a1) t2Var5.f159a).f11012y.getClass();
                q2 q2Var2 = new q2(jVar2, System.currentTimeMillis(), j10);
                jVar2.f8445b = q2Var2;
                t2Var5.f11369c.postDelayed(q2Var2, 2000L);
                if (a1Var3.f11005r.m()) {
                    t2Var4.f11371f.f11345c.a();
                }
                break;
        }
    }
}
