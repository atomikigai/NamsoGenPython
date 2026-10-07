package o6;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzdsr;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends q6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f7685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzdsr f7686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7688d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f7689f;

    public y(x xVar, boolean z4, int i, Boolean bool, zzdsr zzdsrVar) {
        this.f7685a = xVar;
        this.f7687c = z4;
        this.f7688d = i;
        this.f7689f = bool;
        this.f7686b = zzdsrVar;
        d6.p.C.f2983j.getClass();
        this.e = System.currentTimeMillis();
    }

    public static long a() {
        d6.p.C.f2983j.getClass();
        return ((Long) e6.t.f3437d.f3440c.zza(zzbcn.zzjz)).longValue() + System.currentTimeMillis();
    }

    @Override // q6.b
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        d6.p.C.f2983j.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.e));
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(this.f7688d));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f7689f));
        boolean z4 = this.f7687c;
        android.support.v4.media.session.a.N(this.f7686b, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z4 ? "0" : "1"));
        this.f7685a.a(z4, new z(null, str, a(), this.f7688d));
    }

    @Override // q6.b
    public final void onSuccess(q6.a aVar) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        d6.p.C.f2983j.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.e));
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(this.f7688d));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f7689f));
        boolean z4 = this.f7687c;
        android.support.v4.media.session.a.N(this.f7686b, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z4 ? "0" : "1"));
        this.f7685a.a(z4, new z(aVar, "", a(), this.f7688d));
    }
}
