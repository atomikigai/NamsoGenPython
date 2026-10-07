package nb;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbbs;
import h3.q;
import java.io.IOException;
import jc.i;
import rc.b0;
import ub.k;
import yb.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1.d f7396c = new d1.d("firebase_sessions_enabled");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d1.d f7397d = new d1.d("firebase_sessions_sampling_rate");
    public static final d1.d e = android.support.v4.media.session.a.l("firebase_sessions_restart_timeout");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d1.d f7398f = android.support.v4.media.session.a.l("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d1.d f7399g = new d1.d("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0.f f7400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f7401b;

    public h(z0.f fVar) throws Throwable {
        this.f7400a = fVar;
        b0.u(j.f10674a, new a2.g(this, (yb.d) null, 20));
    }

    public static final void a(h hVar, d1.b bVar) {
        hVar.getClass();
        hVar.f7401b = new c((Boolean) bVar.b(f7396c), (Double) bVar.b(f7397d), (Integer) bVar.b(e), (Integer) bVar.b(f7398f), (Long) bVar.b(f7399g));
    }

    public final boolean b() {
        c cVar = this.f7401b;
        if (cVar == null) {
            i.i("sessionConfigs");
            throw null;
        }
        Long l2 = cVar.e;
        if (cVar != null) {
            Integer num = cVar.f7383d;
            return l2 == null || num == null || (System.currentTimeMillis() - l2.longValue()) / ((long) zzbbs.zzq.zzf) >= ((long) num.intValue());
        }
        i.i("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(d1.d dVar, Object obj, ac.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i = gVar.f7395c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.f7395c = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj2 = gVar.f7393a;
        zb.a aVar = zb.a.f11555a;
        int i10 = gVar.f7395c;
        try {
            if (i10 == 0) {
                r7.g.G(obj2);
                z0.f fVar = this.f7400a;
                q qVar = new q(obj, dVar, this, null);
                gVar.f7395c = 1;
                if (fVar.a(new d1.c(qVar, null, 1), gVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r7.g.G(obj2);
            }
        } catch (IOException e4) {
            Log.w("SettingsCache", "Failed to update cache config value: " + e4);
        }
        return k.f9073a;
    }
}
