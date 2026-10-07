package k3;

import android.util.Log;
import bd.s;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import rc.b0;
import rc.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f5930a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f5931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile String f5932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile String f5933d;
    public static volatile Boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile long f5934f;

    static {
        bd.r rVar = new bd.r();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        jc.i.e(timeUnit, "unit");
        rVar.f1651s = cd.b.b(15L, timeUnit);
        rVar.f1652t = cd.b.b(15L, timeUnit);
        jc.i.e(timeUnit, "unit");
        rVar.f1653u = cd.b.b(15L, timeUnit);
        f5931b = new s(rVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, int i, ac.c cVar) throws JSONException {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f5919c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f5919c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objY = aVar.f5917a;
        zb.a aVar2 = zb.a.f11555a;
        int i11 = aVar.f5919c;
        if (i11 == 0) {
            r7.g.G(objY);
            if (str != null) {
                JSONObject jSONObjectPut = new JSONObject().put("action", "credit").put("id_token", str).put("purchaseToken", str2).put("sku", str3).put("quantity", i);
                jc.i.d(jSONObjectPut, "put(...)");
                aVar.f5919c = 1;
                objY = b0.y(k0.f8293b, new f(jSONObjectPut, "https://api.spacehowen.com/users-coins/coins.php", null), aVar);
                if (objY == aVar2) {
                    return aVar2;
                }
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r7.g.G(objY);
        JSONObject jSONObject = (JSONObject) objY;
        if (jSONObject != null) {
            if (!jSONObject.optBoolean("ok", false)) {
                Log.w("Coins", "credit rechazado por server: " + jSONObject);
                return null;
            }
            Log.d("Coins", "credit OK: credited=" + jSONObject.optInt("credited", -1) + " already=" + jSONObject.optBoolean("already_credited", false) + " balance=" + jSONObject.optInt("balance", -1));
            return new Integer(jSONObject.optInt("balance", 0));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ac.c cVar) throws JSONException {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.f5922c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f5922c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objY = bVar.f5920a;
        zb.a aVar = zb.a.f11555a;
        int i10 = bVar.f5922c;
        if (i10 == 0) {
            r7.g.G(objY);
            if (str != null) {
                JSONObject jSONObjectPut = new JSONObject().put("action", "get_balance").put("id_token", str);
                jc.i.d(jSONObjectPut, "put(...)");
                bVar.f5922c = 1;
                objY = b0.y(k0.f8293b, new f(jSONObjectPut, "https://api.spacehowen.com/users-coins/coins.php", null), bVar);
                if (objY == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r7.g.G(objY);
        JSONObject jSONObject = (JSONObject) objY;
        if (jSONObject != null && jSONObject.optBoolean("ok", false)) {
            return new Integer(jSONObject.optInt("balance", 0));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, int i, ac.c cVar) throws JSONException {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f5925c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f5925c = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objY = cVar2.f5923a;
        zb.a aVar = zb.a.f11555a;
        int i11 = cVar2.f5925c;
        if (i11 == 0) {
            r7.g.G(objY);
            if (str != null) {
                JSONObject jSONObjectPut = new JSONObject().put("action", "spend").put("id_token", str).put("amount", i);
                jc.i.d(jSONObjectPut, "put(...)");
                cVar2.f5925c = 1;
                objY = b0.y(k0.f8293b, new f(jSONObjectPut, "https://api.spacehowen.com/users-coins/coins.php", null), cVar2);
                if (objY == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r7.g.G(objY);
        JSONObject jSONObject = (JSONObject) objY;
        if (jSONObject != null) {
            if (jSONObject.optBoolean("ok", false)) {
                return new Integer(jSONObject.optInt("balance", 0));
            }
            Log.w("Coins", "spend rechazado por server: " + jSONObject);
            return null;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, String str2, ac.c cVar) throws JSONException {
        d dVar;
        Boolean boolValueOf;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.f5929d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.f5929d = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objY = dVar.f5927b;
        zb.a aVar = zb.a.f11555a;
        int i10 = dVar.f5929d;
        if (i10 == 0) {
            r7.g.G(objY);
            if (pc.g.m0(str)) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                if (str.equals(f5932c)) {
                    return null;
                }
                if (str.equals(f5933d) && e != null && jCurrentTimeMillis - f5934f < 45000) {
                    return e;
                }
                f5932c = str;
                JSONObject jSONObjectPut = new JSONObject().put("token", str).put("sku", str2).put("type", "sub");
                jc.i.d(jSONObjectPut, "put(...)");
                dVar.f5926a = str;
                dVar.f5929d = 1;
                objY = b0.y(k0.f8293b, new f(jSONObjectPut, "https://api.spacehowen.com/verify/verify.php", null), dVar);
                if (objY == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = dVar.f5926a;
            r7.g.G(objY);
        }
        JSONObject jSONObject = (JSONObject) objY;
        if (jSONObject == null) {
            boolValueOf = null;
        } else {
            if (!jSONObject.has("ok")) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                boolValueOf = Boolean.valueOf(jSONObject.optBoolean("ok", false));
            } else {
                boolValueOf = null;
            }
        }
        synchronized (this) {
            f5932c = null;
            if (boolValueOf != null) {
                f5933d = str;
                e = boolValueOf;
                f5934f = System.currentTimeMillis();
            }
        }
        return boolValueOf;
    }
}
