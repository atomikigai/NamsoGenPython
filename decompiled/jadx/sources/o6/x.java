package o6;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzges;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f7681a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f7682b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzdsr f7684d;
    public final ExecutorService e;

    public x(Context context, zzdsr zzdsrVar, zzges zzgesVar) {
        this.f7683c = context;
        this.f7684d = zzdsrVar;
        this.e = zzgesVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:10:0x0027, B:12:0x002b, B:18:0x0037, B:20:0x003b, B:22:0x0054, B:26:0x005e, B:29:0x0080, B:30:0x0084, B:32:0x008a, B:21:0x0048, B:17:0x0032), top: B:38:0x0001 }] */
    public final synchronized void a(final boolean z4, z zVar) {
        Integer num;
        try {
            HashMap map = this.f7681a;
            Boolean boolValueOf = Boolean.valueOf(z4);
            z zVar2 = (z) map.get(boolValueOf);
            final boolean z10 = true;
            if (zVar2 != null) {
                d6.p.C.f2983j.getClass();
                if ((zVar2.f7692c <= System.currentTimeMillis()) || zVar2.f7690a == null || zVar.f7690a != null) {
                    this.f7681a.put(boolValueOf, zVar);
                }
            } else {
                this.f7681a.put(boolValueOf, zVar);
            }
            if (zVar.f7690a != null) {
                num = (Integer) e6.t.f3437d.f3440c.zza(zzbcn.zzjA);
            } else {
                num = (Integer) e6.t.f3437d.f3440c.zza(zzbcn.zzjB);
            }
            int iIntValue = num.intValue();
            if (zVar.f7690a != null) {
                z10 = false;
            }
            zzcaj.zzd.schedule(new Runnable() { // from class: o6.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7678a.e(z4, z10);
                }
            }, iIntValue, TimeUnit.SECONDS);
            List list = (List) this.f7682b.get(boolValueOf);
            this.f7682b.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    d(zVar, (Pair) it.next(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Object obj, q6.b bVar) throws Throwable {
        try {
            try {
                d6.p.C.f2983j.getClass();
                Pair pair = new Pair(bVar, Long.valueOf(System.currentTimeMillis()));
                zzcaj.zze.execute(new b3.b(this, obj, pair, 12, false));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void c(boolean z4) {
        Boolean boolValueOf = Boolean.valueOf(z4);
        HashMap map = this.f7682b;
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.e.submit(new com.bumptech.glide.manager.p(this, z4, 2));
    }

    public final void d(z zVar, Pair pair, boolean z4) {
        zVar.e.set(true);
        q6.a aVar = zVar.f7690a;
        if (aVar != null) {
            ((q6.b) pair.first).onSuccess(aVar);
        } else {
            ((q6.b) pair.first).onFailure(zVar.f7691b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        d6.p.C.f2983j.getClass();
        android.support.v4.media.session.a.N(this.f7684d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z4)), new Pair("sgpc_rs", Boolean.toString(aVar != null)));
    }

    public final synchronized void e(boolean z4, boolean z10) {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z4);
                HashMap map = this.f7681a;
                Boolean boolValueOf = Boolean.valueOf(z4);
                z zVar = (z) map.get(boolValueOf);
                int i = 0;
                if (z10 && zVar != null) {
                    try {
                        i = zVar.f7693d + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                int i10 = i;
                z zVar2 = (z) this.f7681a.get(boolValueOf);
                y yVar = new y(this, z4, i10, zVar2 == null ? null : Boolean.valueOf(zVar2.e.get()), this.f7684d);
                ta.c cVar = new ta.c();
                cVar.e(bundle);
                w5.g gVar = new w5.g(cVar);
                if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzkK)).booleanValue()) {
                    this.e.submit(new o3.q(this, gVar, yVar, 8));
                } else {
                    q6.a.a(this.f7683c, gVar, yVar);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
