package v9;

import android.animation.ValueAnimator;
import android.os.Bundle;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.internal.measurement.zzqo;
import java.lang.ref.ReferenceQueue;
import z7.a1;
import z7.m2;
import z7.n0;
import z7.p0;
import z7.q0;
import z7.q2;
import z7.s0;
import z7.s2;
import z7.t2;
import z7.u2;
import z7.v0;
import z7.x1;
import z7.z2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9255b;

    public /* synthetic */ i0(int i, Object obj, Object obj2) {
        this.f9254a = i;
        this.f9255b = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9254a;
        int i10 = 1;
        Object obj = this.f9255b;
        switch (i) {
            case 0:
                ((v) obj).onVerificationFailed(null);
                break;
            case 1:
                gb.r rVar = (gb.r) obj;
                rVar.getClass();
                while (true) {
                    try {
                        rVar.d((w3.a) ((ReferenceQueue) rVar.f4495c).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                x1.k kVar = (x1.k) obj;
                ValueAnimator valueAnimator = kVar.f10136z;
                int i11 = kVar.A;
                if (i11 == 1) {
                    valueAnimator.cancel();
                } else if (i11 != 2) {
                }
                kVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            case 3:
                ((StaggeredGridLayoutManager) obj).C0();
                break;
            case 4:
                ((y0.d) obj).n(0);
                break;
            case 5:
                ((n0) obj).f11270a.y();
                break;
            case 6:
                q2 q2Var = (q2) obj;
                s5.j jVar = q2Var.f11323c;
                long j4 = q2Var.f11321a;
                long j10 = q2Var.f11322b;
                ((t2) jVar.f8446c).c();
                t2 t2Var = (t2) jVar.f8446c;
                s2 s2Var = t2Var.f11371f;
                a1 a1Var = (a1) t2Var.f159a;
                z7.i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11197x.b("Application going to the background");
                q0 q0Var = a1Var.f11006s;
                a1.d(q0Var);
                q0Var.B.a(true);
                t2Var.c();
                t2Var.f11370d = true;
                if (!a1Var.f11005r.m()) {
                    s2Var.f11345c.a();
                    s2Var.a(j10, false, false);
                }
                zzqo.zzc();
                if (!a1Var.f11005r.l(null, z7.z.f11484u0)) {
                    x1 x1Var = a1Var.A;
                    a1.e(x1Var);
                    x1Var.l(new Bundle(), "auto", "_ab", j4);
                } else {
                    z7.i0 i0Var2 = a1Var.f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11196w.c(Long.valueOf(j4), "Application backgrounded at: timestamp_millis");
                }
                break;
            default:
                z2 z2Var = (z2) obj;
                z2Var.zzaB().c();
                z2Var.f11516v = new s0(z2Var);
                z7.j jVar2 = new z7.j(z2Var);
                jVar2.e();
                z2Var.f11509c = jVar2;
                z7.g gVarF = z2Var.F();
                v0 v0Var = z2Var.f11507a;
                com.google.android.gms.common.internal.i0.i(v0Var);
                gVarF.f11134c = v0Var;
                m2 m2Var = new m2(z2Var);
                m2Var.e();
                z2Var.f11514t = m2Var;
                z7.b bVar = new z7.b(z2Var);
                bVar.e();
                z2Var.f11511f = bVar;
                z7.l0 l0Var = new z7.l0(z2Var, i10);
                l0Var.e();
                z2Var.f11513s = l0Var;
                u2 u2Var = new u2(z2Var);
                u2Var.e();
                z2Var.e = u2Var;
                z2Var.f11510d = new n0(z2Var);
                if (z2Var.B != z2Var.C) {
                    z2Var.zzaA().f11190f.d(Integer.valueOf(z2Var.B), "Not all upload components initialized", Integer.valueOf(z2Var.C));
                }
                z2Var.f11518x = true;
                z2Var.zzaB().c();
                z7.j jVar3 = z2Var.f11509c;
                z2.D(jVar3);
                jVar3.K();
                if (z2Var.f11514t.f11259r.a() == 0) {
                    p0 p0Var = z2Var.f11514t.f11259r;
                    ((n7.b) z2Var.zzax()).getClass();
                    p0Var.b(System.currentTimeMillis());
                }
                z2Var.y();
                break;
        }
    }

    public /* synthetic */ i0(Object obj, int i) {
        this.f9254a = i;
        this.f9255b = obj;
    }

    public i0(n0 n0Var, boolean z4) {
        this.f9254a = 5;
        this.f9255b = n0Var;
    }
}
