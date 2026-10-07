package h3;

import android.util.Log;
import android.widget.Button;
import androidx.webkit.ProxyConfig;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, yb.d dVar, int i) {
        super(2, dVar);
        this.f4658a = i;
        this.f4659b = obj;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f4658a) {
            case 0:
                return new d1((e1) this.f4659b, dVar, 0);
            default:
                return new d1((l3.d) this.f4659b, dVar, 1);
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        rc.a0 a0Var = (rc.a0) obj;
        yb.d dVar = (yb.d) obj2;
        switch (this.f4658a) {
            case 0:
                d1 d1Var = (d1) create(a0Var, dVar);
                ub.k kVar = ub.k.f9073a;
                d1Var.invokeSuspend(kVar);
                return kVar;
            default:
                return ((d1) create(a0Var, dVar)).invokeSuspend(ub.k.f9073a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [h3.d1] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        int i;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        Throwable th;
        JSONArray jSONArrayOptJSONArray;
        ?? r14;
        ?? r25;
        int i10;
        int i11;
        ?? r26;
        ?? r15;
        int i12;
        ?? r27;
        ?? r16 = this;
        int i13 = r16.f4658a;
        Object obj2 = r16.f4659b;
        switch (i13) {
            case 0:
                zb.a aVar = zb.a.f11555a;
                r7.g.G(obj);
                e1 e1Var = (e1) obj2;
                Button button = e1Var.f4672m0;
                if (button != null) {
                    button.setText(e1Var.v(R.string.ldc_buy_format));
                    return ub.k.f9073a;
                }
                jc.i.i("btnPurchase");
                throw null;
            default:
                zb.a aVar2 = zb.a.f11555a;
                r7.g.G(obj);
                bd.s sVar = k3.j.f5943a;
                String str = ((l3.d) obj2).f6538a;
                ?? r17 = "optString(...)";
                bd.s sVar2 = k3.j.f5943a;
                jc.i.e(str, "countryIso");
                String upperCase = str.toUpperCase(Locale.ROOT);
                jc.i.d(upperCase, "toUpperCase(...)");
                String string = pc.g.B0(upperCase).toString();
                ?? arrayList = new ArrayList();
                ?? hashSet = new HashSet();
                try {
                    try {
                        bd.u uVar = new bd.u();
                        uVar.j("https://proxylist.geonode.com/api/proxy-list?country=" + string + "&limit=40&sort_by=lastChecked&sort_type=desc");
                        uVar.f("User-Agent", "Mozilla/5.0 (Android; Mobile)");
                        bd.v vVarA = uVar.a();
                        sVar2.getClass();
                        bd.x xVarC = new fd.i(sVar2, vVarA).c();
                        try {
                            if (xVarC.d()) {
                                bd.z zVar = xVarC.f1701r;
                                String strO = zVar != null ? zVar.o() : null;
                                if (strO != null && !pc.g.m0(strO) && (jSONArrayOptJSONArray = new JSONObject(strO).optJSONArray("data")) != null) {
                                    int length = jSONArrayOptJSONArray.length();
                                    int i14 = 0;
                                    while (i14 < length) {
                                        r14 = r17;
                                        arrayList = arrayList;
                                        hashSet = hashSet;
                                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i14);
                                        JSONArray jSONArray = jSONArrayOptJSONArray;
                                        String strOptString = jSONObject.optString("ip");
                                        jc.i.d(strOptString, r14);
                                        String string2 = pc.g.B0(strOptString).toString();
                                        int i15 = i14;
                                        int i16 = 0;
                                        try {
                                            int iOptInt = jSONObject.optInt("port", 0);
                                            if (string2.length() <= 0 || 1 > iOptInt || iOptInt >= 65536) {
                                                r25 = r14;
                                                r16 = arrayList;
                                            } else {
                                                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("protocols");
                                                if (jSONArrayOptJSONArray2 != null) {
                                                    try {
                                                        if (jSONArrayOptJSONArray2.length() > 0) {
                                                            try {
                                                                String strOptString2 = jSONArrayOptJSONArray2.optString(0);
                                                                jc.i.d(strOptString2, r14);
                                                                String lowerCase = strOptString2.toLowerCase(Locale.ROOT);
                                                                jc.i.d(lowerCase, "toLowerCase(...)");
                                                                r26 = r14;
                                                                i11 = 0;
                                                                try {
                                                                    if (pc.g.f0(lowerCase, "socks5", false)) {
                                                                        r15 = arrayList;
                                                                        i12 = 2;
                                                                        r25 = r26;
                                                                    } else if (pc.g.f0(lowerCase, "socks4", false)) {
                                                                        ?? r31 = arrayList;
                                                                        i12 = 3;
                                                                        r15 = r31;
                                                                        r25 = r26;
                                                                    } else if (pc.g.f0(lowerCase, ProxyConfig.MATCH_HTTPS, false)) {
                                                                        r27 = r26;
                                                                        r15 = arrayList;
                                                                        i12 = 1;
                                                                        r25 = r26;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    i16 = i11;
                                                                    r16 = arrayList;
                                                                    i = i16;
                                                                    r17 = hashSet;
                                                                    th = th;
                                                                    try {
                                                                        throw th;
                                                                    } catch (Throwable th3) {
                                                                        r7.g.h(xVarC, th);
                                                                        throw th3;
                                                                    }
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                i11 = 0;
                                                            }
                                                        } else {
                                                            r27 = r14;
                                                            i11 = 0;
                                                        }
                                                        r27 = r26;
                                                        r15 = arrayList;
                                                        i12 = i11;
                                                        r25 = r27;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        i11 = 0;
                                                    }
                                                } else {
                                                    r27 = r14;
                                                    i11 = 0;
                                                    r27 = r26;
                                                    r15 = arrayList;
                                                    i12 = i11;
                                                    r25 = r27;
                                                }
                                                try {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(string2);
                                                    try {
                                                        sb2.append(':');
                                                        sb2.append(iOptInt);
                                                        if (hashSet.add(sb2.toString())) {
                                                            String str2 = string;
                                                            try {
                                                                i10 = length;
                                                                r17 = hashSet;
                                                                r16 = r15;
                                                                i = 0;
                                                                try {
                                                                    string = str2;
                                                                    try {
                                                                        r16.add(new n3.c(i12, iOptInt, 512, string2, "", "", str2, (String) null, str2, false));
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        th = th;
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    string = str2;
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                r16 = r15;
                                                                r17 = hashSet;
                                                                i = 0;
                                                            }
                                                        } else {
                                                            r16 = r15;
                                                            r25 = r25;
                                                        }
                                                        length = i10;
                                                        hashSet = r17;
                                                        i14 = i15 + 1;
                                                        jSONArrayOptJSONArray = jSONArray;
                                                        r14 = r25;
                                                        arrayList = r16;
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        r16 = r15;
                                                        r13 = hashSet;
                                                        r17 = r13;
                                                        i = 0;
                                                        th = th;
                                                        throw th;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    r16 = r15;
                                                    i = i11;
                                                    r17 = hashSet;
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                            r17 = hashSet;
                                            i10 = length;
                                            length = i10;
                                            hashSet = r17;
                                            i14 = i15 + 1;
                                            jSONArrayOptJSONArray = jSONArray;
                                            r14 = r25;
                                            arrayList = r16;
                                        } catch (Throwable th11) {
                                            th = th11;
                                        }
                                    }
                                    r14 = r17;
                                    arrayList = arrayList;
                                    hashSet = hashSet;
                                }
                            }
                            r12 = arrayList;
                            r10 = hashSet;
                            r11 = 0;
                            xVarC.close();
                        } catch (Throwable th12) {
                            th = th12;
                            r16 = arrayList;
                            r13 = hashSet;
                        }
                    } catch (Exception e) {
                        e = e;
                        StringBuilder sbN = q1.a.n("Geonode error para ", string, ": ");
                        sbN.append(e.getMessage());
                        Log.w("FreeProxyScraper", sbN.toString());
                        r12 = r16;
                        r11 = i;
                        r10 = r17;
                    }
                } catch (Exception e4) {
                    e = e4;
                    r16 = arrayList;
                    r17 = hashSet;
                    i = 0;
                    StringBuilder sbN2 = q1.a.n("Geonode error para ", string, ": ");
                    sbN2.append(e.getMessage());
                    Log.w("FreeProxyScraper", sbN2.toString());
                    r12 = r16;
                    r11 = i;
                    r10 = r17;
                }
                try {
                    bd.u uVar2 = new bd.u();
                    uVar2.j("https://api.proxyscrape.com/v2/?request=displayproxies&protocol=http,socks4,socks5&timeout=10000&country=" + string + "&ssl=all&anonymity=all");
                    uVar2.f("User-Agent", "Mozilla/5.0 (Android; Mobile)");
                    bd.v vVarA2 = uVar2.a();
                    sVar2.getClass();
                    bd.x xVarC2 = new fd.i(sVar2, vVarA2).c();
                    try {
                        if (xVarC2.d()) {
                            bd.z zVar2 = xVarC2.f1701r;
                            String strO2 = zVar2 != null ? zVar2.o() : null;
                            if (strO2 != null && !pc.g.m0(strO2)) {
                                pc.d dVar = new pc.d(strO2);
                                while (dVar.hasNext()) {
                                    String string3 = pc.g.B0((String) dVar.next()).toString();
                                    if (string3.length() != 0 && pc.g.f0(string3, ":", r11)) {
                                        ?? W0 = pc.g.w0(string3, new String[]{":"});
                                        if (W0.size() >= 2) {
                                            String string4 = pc.g.B0((String) W0.get(r11)).toString();
                                            Integer numY = pc.n.Y(pc.g.B0((String) W0.get(1)).toString());
                                            ?? IntValue = numY != null ? numY.intValue() : r11;
                                            if (string4.length() > 0) {
                                                if (1 <= IntValue && IntValue < 65536) {
                                                    if (r10.add(string4 + ':' + IntValue)) {
                                                        String str3 = string;
                                                        try {
                                                            string = str3;
                                                            r12.add(new n3.c(0, (int) IntValue, 512, string4, "", "", str3, (String) null, str3, false));
                                                        } catch (Throwable th13) {
                                                            th = th13;
                                                            string = str3;
                                                            Throwable th14 = th;
                                                            try {
                                                                throw th14;
                                                            } catch (Throwable th15) {
                                                                r7.g.h(xVarC2, th14);
                                                                throw th15;
                                                            }
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        xVarC2.close();
                    } catch (Throwable th16) {
                        th = th16;
                    }
                    break;
                } catch (Exception e10) {
                    StringBuilder sbN3 = q1.a.n("ProxyScrape error para ", string, ": ");
                    sbN3.append(e10.getMessage());
                    Log.w("FreeProxyScraper", sbN3.toString());
                }
                return r12;
        }
    }
}
