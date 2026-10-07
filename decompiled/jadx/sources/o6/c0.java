package o6;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzdsr;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7604d;
    public final Map e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f7605f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f7606g = new ArrayDeque();
    public final zzdsr h;
    public ConcurrentHashMap i;

    public c0(zzdsr zzdsrVar) {
        this.h = zzdsrVar;
        zzbce zzbceVar = zzbcn.zzgM;
        e6.t tVar = e6.t.f3437d;
        this.f7601a = ((Integer) tVar.f3440c.zza(zzbceVar)).intValue();
        zzbce zzbceVar2 = zzbcn.zzgN;
        zzbcl zzbclVar = tVar.f3440c;
        this.f7602b = ((Long) zzbclVar.zza(zzbceVar2)).longValue();
        this.f7603c = ((Boolean) zzbclVar.zza(zzbcn.zzgR)).booleanValue();
        this.f7604d = ((Boolean) zzbclVar.zza(zzbcn.zzgQ)).booleanValue();
        this.e = Collections.synchronizedMap(new a0(this));
    }

    public final synchronized String a(String str, zzdsh zzdshVar) {
        try {
            b0 b0Var = (b0) this.e.get(str);
            zzdshVar.zzb().put("request_id", str);
            if (b0Var == null) {
                zzdshVar.zzb().put("mhit", "false");
                return null;
            }
            if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzhj)).booleanValue()) {
                this.e.remove(str);
            }
            String str2 = b0Var.f7596b;
            zzdshVar.zzb().put("mhit", "true");
            return str2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(zzdsh zzdshVar) throws Throwable {
        try {
            try {
                if (this.f7603c) {
                    ArrayDeque arrayDeque = this.f7606g;
                    ArrayDeque arrayDequeClone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f7605f;
                    ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    zzcaj.zza.execute(new d3.p(this, zzdshVar, arrayDequeClone, arrayDequeClone2, 3, false));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void c(zzdsh zzdshVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdshVar.zzb());
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.f7604d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(android.support.v4.media.session.a.L(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.h.zzf(this.i);
        }
    }

    public final synchronized void d() {
        d6.p.C.f2983j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((b0) entry.getValue()).f7595a.longValue() <= this.f7602b) {
                    break;
                }
                this.f7606g.add(new Pair((String) entry.getKey(), ((b0) entry.getValue()).f7596b));
                it.remove();
                throw th;
            }
        } catch (ConcurrentModificationException e) {
            d6.p.C.f2982g.zzw(e, "QueryJsonMap.removeExpiredEntries");
        }
    }
}
