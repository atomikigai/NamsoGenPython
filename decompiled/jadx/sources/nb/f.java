package nb;

import a2.l;
import android.content.Context;
import android.os.Bundle;
import jc.i;
import rc.x;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f7389c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c1.c f7390d = com.bumptech.glide.d.y("firebase_session_settings", null, 14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5.b f7391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7392b;

    public f(Context context, x xVar, x xVar2, za.d dVar, lb.b bVar) {
        i.e(context, "context");
        a5.b bVar2 = new a5.b(context);
        l lVar = new l(bVar, xVar);
        f7389c.getClass();
        b bVar3 = new b(xVar2, dVar, bVar, lVar, f7390d.a(context, d.f7384a[0]));
        this.f7391a = bVar2;
        this.f7392b = bVar3;
    }

    public final double a() {
        Bundle bundle = (Bundle) this.f7391a.f188b;
        Double dValueOf = bundle.containsKey("firebase_sessions_sampling_rate") ? Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate")) : null;
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        c cVar = this.f7392b.f7378c.f7401b;
        if (cVar == null) {
            i.i("sessionConfigs");
            throw null;
        }
        Double d10 = cVar.f7381b;
        if (d10 != null) {
            double dDoubleValue2 = d10.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ac.c cVar) {
        e eVar;
        f fVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i = eVar.f7388d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.f7388d = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f7386b;
        zb.a aVar = zb.a.f11555a;
        int i10 = eVar.f7388d;
        k kVar = k.f9073a;
        if (i10 != 0) {
            if (i10 == 1) {
                fVar = eVar.f7385a;
                r7.g.G(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r7.g.G(obj);
            }
        }
        r7.g.G(obj);
        eVar.f7385a = this;
        eVar.f7388d = 1;
        this.f7391a.getClass();
        if (kVar != aVar) {
            fVar = this;
        }
        b bVar = fVar.f7392b;
        eVar.f7385a = null;
        eVar.f7388d = 2;
        return bVar.b(eVar) == aVar ? aVar : kVar;
    }
}
