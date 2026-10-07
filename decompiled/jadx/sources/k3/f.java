package k3;

import android.util.Log;
import bd.s;
import bd.u;
import bd.v;
import bd.x;
import bd.z;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import rc.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(String str, String str2, yb.d dVar, int i) {
        super(2, dVar);
        this.f5935a = i;
        this.f5937c = str;
        this.f5938d = str2;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f5935a) {
            case 0:
                f fVar = new f(this.f5937c, (String) this.f5938d, dVar, 0);
                fVar.f5936b = obj;
                return fVar;
            case 1:
                f fVar2 = new f(this.f5937c, (String) this.f5938d, dVar, 1);
                fVar2.f5936b = obj;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f5937c, (String) this.f5938d, dVar, 2);
                fVar3.f5936b = obj;
                return fVar3;
            case 3:
                f fVar4 = new f(this.f5937c, (String) this.f5938d, dVar, 3);
                fVar4.f5936b = obj;
                return fVar4;
            default:
                f fVar5 = new f((JSONObject) this.f5938d, this.f5937c, dVar);
                fVar5.f5936b = obj;
                return fVar5;
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        yb.d dVar = (yb.d) obj2;
        switch (this.f5935a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((f) create(a0Var, dVar)).invokeSuspend(ub.k.f9073a);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0355  */
    /* JADX WARN: Code duplicated, block: B:124:0x0372  */
    /* JADX WARN: Code duplicated, block: B:125:0x0375  */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0236  */
    /* JADX WARN: Code duplicated, block: B:94:0x0253  */
    /* JADX WARN: Code duplicated, block: B:95:0x0256  */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x0355, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x0236, please report this as an issue */
    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objM;
        Object objM2;
        Object objM3;
        Throwable thA;
        String message;
        String str;
        l lVar;
        Object objM4;
        Throwable thA2;
        String message2;
        String str2;
        n nVar;
        String strOptString;
        String strOptString2;
        String strOptString3;
        Object objM5;
        Object objM6;
        int i = this.f5935a;
        String str3 = this.f5937c;
        Object obj2 = this.f5938d;
        switch (i) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                r7.g.G(obj);
                try {
                    JSONObject jSONObjectPut = new JSONObject().put("action", str3).put("token", (String) obj2).put("app", "namso");
                    u uVar = new u();
                    uVar.j("https://api.spacehowen.com/fcm/tokens.php?action=".concat(str3));
                    String string = jSONObjectPut.toString();
                    jc.i.d(string, "toString(...)");
                    Pattern pattern = bd.q.f1632c;
                    uVar.h("POST", android.support.v4.media.session.a.d(string, r7.g.q("application/json")));
                    v vVarA = uVar.a();
                    s sVar = h.f5941a;
                    sVar.getClass();
                    x xVarC = new fd.i(sVar, vVarA).c();
                    try {
                        int i10 = xVarC.f1699d;
                        xVarC.close();
                        objM = new Integer(i10);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            r7.g.h(xVarC, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    objM = r7.g.m(th3);
                }
                return new ub.h(objM);
            case 1:
                zb.a aVar2 = zb.a.f11555a;
                r7.g.G(obj);
                try {
                    JSONObject jSONObjectPut2 = new JSONObject().put("action", "received").put("mid", str3).put("dev", (String) obj2);
                    u uVar2 = new u();
                    uVar2.j("https://api.spacehowen.com/fcm/track.php?action=received");
                    String string2 = jSONObjectPut2.toString();
                    jc.i.d(string2, "toString(...)");
                    Pattern pattern2 = bd.q.f1632c;
                    uVar2.h("POST", android.support.v4.media.session.a.d(string2, r7.g.q("application/json")));
                    v vVarA2 = uVar2.a();
                    s sVar2 = i.f5942a;
                    sVar2.getClass();
                    x xVarC2 = new fd.i(sVar2, vVarA2).c();
                    try {
                        int i11 = xVarC2.f1699d;
                        xVarC2.close();
                        objM2 = new Integer(i11);
                        return new ub.h(objM2);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            r7.g.h(xVarC2, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    objM2 = r7.g.m(th6);
                }
                break;
            case 2:
                zb.a aVar3 = zb.a.f11555a;
                r7.g.G(obj);
                JSONObject jSONObjectPut3 = new JSONObject().put("id_token", str3).put("purchaseToken", (String) obj2).put("sku", "proxy_100_mb");
                try {
                    u uVar3 = new u();
                    uVar3.j("https://api.spacehowen.com/users-proxys/buy.php");
                    uVar3.f("X-Client-Key", "spacehowen-verify-2026");
                    String string3 = jSONObjectPut3.toString();
                    jc.i.d(string3, "toString(...)");
                    Pattern pattern3 = bd.q.f1632c;
                    uVar3.h("POST", android.support.v4.media.session.a.d(string3, r7.g.q("application/json")));
                    v vVarA3 = uVar3.a();
                    s sVar3 = o.f5963a;
                    sVar3.getClass();
                    x xVarC3 = new fd.i(sVar3, vVarA3).c();
                    try {
                        z zVar = xVarC3.f1701r;
                        if (zVar != null) {
                            JSONObject jSONObject = new JSONObject(zVar.o());
                            if (jSONObject.optBoolean("ok", false)) {
                                objM3 = new l(true, jSONObject.optInt("mb_added", 0), jSONObject.optInt("mb_total", 0), jSONObject.optInt("mb_left", 0), jSONObject.optLong("quota_bytes", 0L), jSONObject.optLong("used_bytes", 0L), jSONObject.optLong("expires_at", 0L), jSONObject.optBoolean("already_credited", false), null, 256);
                            } else {
                                lVar = new l(false, 0, 0, 0, 0L, 0L, 0L, false, jSONObject.optString("error", jSONObject.optString("reason", "unknown")), 254);
                            }
                            xVarC3.close();
                            thA = ub.h.a(objM3);
                            if (thA == null) {
                                return objM3;
                            }
                            Log.e("PremiumProxyApi", "Error en buy.php: " + thA.getMessage());
                            message = thA.getMessage();
                            if (message == null) {
                                str = "network_error";
                            } else {
                                str = message;
                            }
                            return new l(false, 0, 0, 0, 0L, 0L, 0L, false, str, 254);
                        }
                        lVar = new l(false, 0, 0, 0, 0L, 0L, 0L, false, "empty_response", 254);
                        objM3 = lVar;
                        xVarC3.close();
                        thA = ub.h.a(objM3);
                        if (thA == null) {
                            return objM3;
                        }
                        Log.e("PremiumProxyApi", "Error en buy.php: " + thA.getMessage());
                        message = thA.getMessage();
                        if (message == null) {
                            str = "network_error";
                        } else {
                            str = message;
                        }
                        return new l(false, 0, 0, 0, 0L, 0L, 0L, false, str, 254);
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            r7.g.h(xVarC3, th7);
                            throw th8;
                        }
                    }
                } catch (Throwable th9) {
                    objM3 = r7.g.m(th9);
                }
                break;
            case 3:
                zb.a aVar4 = zb.a.f11555a;
                r7.g.G(obj);
                JSONObject jSONObjectPut4 = new JSONObject().put("id_token", str3);
                String str4 = (String) obj2;
                Locale locale = Locale.ROOT;
                String lowerCase = str4.toLowerCase(locale);
                jc.i.d(lowerCase, "toLowerCase(...)");
                JSONObject jSONObjectPut5 = jSONObjectPut4.put("country", lowerCase);
                try {
                    u uVar4 = new u();
                    uVar4.j("https://api.spacehowen.com/users-proxys/get_proxy.php");
                    uVar4.f("X-Client-Key", "spacehowen-verify-2026");
                    String string4 = jSONObjectPut5.toString();
                    jc.i.d(string4, "toString(...)");
                    Pattern pattern4 = bd.q.f1632c;
                    uVar4.h("POST", android.support.v4.media.session.a.d(string4, r7.g.q("application/json")));
                    v vVarA4 = uVar4.a();
                    s sVar4 = o.f5963a;
                    sVar4.getClass();
                    x xVarC4 = new fd.i(sVar4, vVarA4).c();
                    try {
                        z zVar2 = xVarC4.f1701r;
                        if (zVar2 != null) {
                            JSONObject jSONObject2 = new JSONObject(zVar2.o());
                            if (jSONObject2.optBoolean("ok", false)) {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("proxy");
                                String str5 = (jSONObjectOptJSONObject == null || (strOptString3 = jSONObjectOptJSONObject.optString("host", "proxy.proxiware.com")) == null) ? "proxy.proxiware.com" : strOptString3;
                                int iOptInt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("port", 1337) : 1337;
                                String str6 = (jSONObjectOptJSONObject == null || (strOptString2 = jSONObjectOptJSONObject.optString("user", "")) == null) ? "" : strOptString2;
                                String str7 = (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("pass", "")) == null) ? "" : strOptString;
                                String upperCase = str4.toUpperCase(locale);
                                jc.i.d(upperCase, "toUpperCase(...)");
                                String strOptString4 = jSONObject2.optString("country", upperCase);
                                jc.i.d(strOptString4, "optString(...)");
                                objM4 = new n(iOptInt, jSONObject2.optInt("mb_left", 0), 384, str5, str6, str7, strOptString4, null, null, true);
                            } else {
                                nVar = new n(0, 0, 126, null, null, null, null, jSONObject2.optString("error", "unknown"), jSONObject2.has("message") ? jSONObject2.optString("message") : null, false);
                            }
                            xVarC4.close();
                            thA2 = ub.h.a(objM4);
                            if (thA2 == null) {
                                return objM4;
                            }
                            Log.e("PremiumProxyApi", "Error al obtener proxy: " + thA2.getMessage());
                            message2 = thA2.getMessage();
                            if (message2 == null) {
                                str2 = "network_error";
                            } else {
                                str2 = message2;
                            }
                            return new n(0, 0, 382, null, null, null, null, str2, null, false);
                        }
                        nVar = new n(0, 0, 382, null, null, null, null, "empty_response", null, false);
                        objM4 = nVar;
                        xVarC4.close();
                        thA2 = ub.h.a(objM4);
                        if (thA2 == null) {
                            return objM4;
                        }
                        Log.e("PremiumProxyApi", "Error al obtener proxy: " + thA2.getMessage());
                        message2 = thA2.getMessage();
                        if (message2 == null) {
                            str2 = "network_error";
                        } else {
                            str2 = message2;
                        }
                        return new n(0, 0, 382, null, null, null, null, str2, null, false);
                    } catch (Throwable th10) {
                        try {
                            throw th10;
                        } catch (Throwable th11) {
                            r7.g.h(xVarC4, th10);
                            throw th11;
                        }
                    }
                } catch (Throwable th12) {
                    objM4 = r7.g.m(th12);
                }
                break;
            default:
                zb.a aVar5 = zb.a.f11555a;
                r7.g.G(obj);
                JSONObject jSONObject3 = (JSONObject) obj2;
                String strOptString5 = jSONObject3.optString("action", jSONObject3.optString("type", "?"));
                JSONObject jSONObject4 = new JSONObject(jSONObject3.toString());
                jSONObject4.remove("token");
                jSONObject4.remove("id_token");
                jSONObject4.remove("purchaseToken");
                Log.d("Coins", "[" + strOptString5 + "] envio: " + jSONObject4);
                try {
                    u uVar5 = new u();
                    uVar5.j(str3);
                    uVar5.f("X-Client-Key", "spacehowen-verify-2026");
                    String string5 = jSONObject3.toString();
                    jc.i.d(string5, "toString(...)");
                    Pattern pattern5 = bd.q.f1632c;
                    uVar5.h("POST", android.support.v4.media.session.a.d(string5, r7.g.q("application/json")));
                    v vVarA5 = uVar5.a();
                    s sVar5 = e.f5931b;
                    sVar5.getClass();
                    x xVarC5 = new fd.i(sVar5, vVarA5).c();
                    try {
                        z zVar3 = xVarC5.f1701r;
                        String strO = zVar3 != null ? zVar3.o() : null;
                        Log.d("Coins", "[" + strOptString5 + "] http=" + xVarC5.f1699d + " body=" + strO);
                        if (xVarC5.d() && strO != null) {
                            try {
                                objM6 = new JSONObject(strO);
                            } catch (Throwable th13) {
                                objM6 = r7.g.m(th13);
                            }
                            if (objM6 instanceof ub.g) {
                                objM6 = null;
                            }
                            objM5 = (JSONObject) objM6;
                        } else {
                            objM5 = null;
                        }
                        xVarC5.close();
                        break;
                    } catch (Throwable th14) {
                        try {
                            throw th14;
                        } catch (Throwable th15) {
                            r7.g.h(xVarC5, th14);
                            throw th15;
                        }
                    }
                } catch (Throwable th16) {
                    objM5 = r7.g.m(th16);
                }
                if (objM5 instanceof ub.g) {
                    return null;
                }
                return objM5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(JSONObject jSONObject, String str, yb.d dVar) {
        super(2, dVar);
        this.f5935a = 4;
        this.f5938d = jSONObject;
        this.f5937c = str;
    }
}
