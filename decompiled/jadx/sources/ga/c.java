package ga;

import android.util.Base64;
import android.util.JsonReader;
import fa.a0;
import fa.a1;
import fa.b0;
import fa.b1;
import fa.c0;
import fa.c1;
import fa.d;
import fa.d0;
import fa.d1;
import fa.e0;
import fa.e1;
import fa.f;
import fa.f0;
import fa.f1;
import fa.g;
import fa.g0;
import fa.g1;
import fa.h;
import fa.h0;
import fa.h1;
import fa.i;
import fa.i0;
import fa.i1;
import fa.j;
import fa.j0;
import fa.j1;
import fa.k;
import fa.k0;
import fa.k1;
import fa.l;
import fa.l0;
import fa.l1;
import fa.m;
import fa.m0;
import fa.m1;
import fa.n;
import fa.n0;
import fa.n1;
import fa.o;
import fa.o0;
import fa.o1;
import fa.p;
import fa.p0;
import fa.p1;
import fa.q;
import fa.q0;
import fa.q1;
import fa.r;
import fa.r0;
import fa.r1;
import fa.s;
import fa.s0;
import fa.s1;
import fa.t;
import fa.t1;
import fa.u;
import fa.v;
import fa.w;
import fa.x;
import fa.x0;
import fa.y;
import fa.y0;
import fa.z;
import fa.z0;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import ta.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ta.c f4427a;

    static {
        e eVar = new e();
        d dVar = d.f3699a;
        eVar.a(s1.class, dVar);
        eVar.a(x.class, dVar);
        j jVar = j.f3756a;
        eVar.a(r1.class, jVar);
        eVar.a(d0.class, jVar);
        g gVar = g.f3728a;
        eVar.a(d1.class, gVar);
        eVar.a(e0.class, gVar);
        h hVar = h.f3740a;
        eVar.a(c1.class, hVar);
        eVar.a(f0.class, hVar);
        v vVar = v.f3858a;
        eVar.a(q1.class, vVar);
        eVar.a(s0.class, vVar);
        u uVar = u.f3849a;
        eVar.a(p1.class, uVar);
        eVar.a(r0.class, uVar);
        i iVar = i.f3745a;
        eVar.a(e1.class, iVar);
        eVar.a(g0.class, iVar);
        s sVar = s.f3836a;
        eVar.a(o1.class, sVar);
        eVar.a(h0.class, sVar);
        k kVar = k.f3770a;
        eVar.a(l1.class, kVar);
        eVar.a(i0.class, kVar);
        m mVar = m.f3787a;
        eVar.a(k1.class, mVar);
        eVar.a(j0.class, mVar);
        p pVar = p.f3811a;
        eVar.a(j1.class, pVar);
        eVar.a(n0.class, pVar);
        q qVar = q.f3820a;
        eVar.a(i1.class, qVar);
        eVar.a(o0.class, qVar);
        n nVar = n.f3795a;
        eVar.a(g1.class, nVar);
        eVar.a(l0.class, nVar);
        fa.b bVar = fa.b.f3683a;
        eVar.a(y0.class, bVar);
        eVar.a(y.class, bVar);
        fa.a aVar = fa.a.f3677a;
        eVar.a(x0.class, aVar);
        eVar.a(z.class, aVar);
        o oVar = o.f3803a;
        eVar.a(h1.class, oVar);
        eVar.a(m0.class, oVar);
        l lVar = l.f3779a;
        eVar.a(f1.class, lVar);
        eVar.a(k0.class, lVar);
        fa.c cVar = fa.c.f3692a;
        eVar.a(z0.class, cVar);
        eVar.a(a0.class, cVar);
        r rVar = r.f3826a;
        eVar.a(m1.class, rVar);
        eVar.a(p0.class, rVar);
        t tVar = t.f3843a;
        eVar.a(n1.class, tVar);
        eVar.a(q0.class, tVar);
        fa.e eVar2 = fa.e.f3717a;
        eVar.a(b1.class, eVar2);
        eVar.a(b0.class, eVar2);
        f fVar = f.f3725a;
        eVar.a(a1.class, fVar);
        eVar.a(c0.class, fVar);
        eVar.f8669d = true;
        f4427a = new ta.c(eVar);
    }

    public static o0 a(JsonReader jsonReader) throws IOException {
        bd.u uVar = new bd.u(2);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    uVar.e = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    uVar.f1676b = strNextString;
                    break;
                    break;
                case "pc":
                    uVar.f1677c = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    uVar.f1678d = jsonReader.nextString();
                    break;
                case "importance":
                    uVar.f1679f = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return uVar.c();
    }

    public static a0 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " key" : "";
        if (strNextString2 == null) {
            strConcat = strConcat.concat(" value");
        }
        if (strConcat.isEmpty()) {
            return new a0(strNextString, strNextString2);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public static y c(JsonReader jsonReader) throws IOException {
        c3.j jVar = new c3.j();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    jVar.i = d(jsonReader, new a5.f(28));
                    break;
                case "pid":
                    jVar.f1759a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "pss":
                    jVar.e = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rss":
                    jVar.f1763f = Long.valueOf(jsonReader.nextLong());
                    break;
                case "timestamp":
                    jVar.f1764g = Long.valueOf(jsonReader.nextLong());
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    jVar.f1760b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    jVar.f1761c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "traceFile":
                    jVar.h = jsonReader.nextString();
                    break;
                case "importance":
                    jVar.f1762d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return jVar.a();
    }

    public static t1 d(JsonReader jsonReader, b bVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(bVar.b(jsonReader));
        }
        jsonReader.endArray();
        return new t1(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x019e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0209  */
    /* JADX WARN: Code duplicated, block: B:201:0x0326  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static h0 e(JsonReader jsonReader) throws IOException {
        int i;
        String strConcat;
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        bd.u uVar = new bd.u(1);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i14 = 0;
            switch (strNextName) {
                case "device":
                    i = 0;
                    break;
                case "app":
                    i = i13;
                    break;
                case "log":
                    i = 2;
                    break;
                case "type":
                    i = 3;
                    break;
                case "timestamp":
                    i = 4;
                    break;
                default:
                    i = -1;
                    break;
            }
            switch (i) {
                case 0:
                    bd.v vVar = new bd.v(4);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                vVar.f1682c = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                vVar.f1681b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "orientation":
                                vVar.e = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "diskUsed":
                                vVar.f1685g = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "ramUsed":
                                vVar.f1684f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "proximityOn":
                                vVar.f1683d = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    uVar.e = vVar.d();
                    break;
                case 1:
                    jsonReader.beginObject();
                    int i15 = 3;
                    int i16 = 4;
                    int i17 = 2;
                    j0 j0Var = null;
                    t1 t1Var = null;
                    t1 t1Var2 = null;
                    Boolean boolValueOf = null;
                    Integer numValueOf = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3.hashCode()) {
                            case -1332194002:
                                if (!strNextName3.equals("background")) {
                                    i10 = -1;
                                } else {
                                    i10 = 0;
                                }
                                break;
                            case -1090974952:
                                if (!strNextName3.equals("execution")) {
                                    i10 = -1;
                                } else {
                                    i10 = i13;
                                }
                                break;
                            case -80231855:
                                if (!strNextName3.equals("internalKeys")) {
                                    i10 = -1;
                                } else {
                                    i10 = i17;
                                }
                                break;
                            case 555169704:
                                if (!strNextName3.equals("customAttributes")) {
                                    i10 = -1;
                                } else {
                                    i10 = i15;
                                }
                                break;
                            case 928737948:
                                if (!strNextName3.equals("uiOrientation")) {
                                    i10 = -1;
                                } else {
                                    i10 = i16;
                                }
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                        switch (i10) {
                            case 0:
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 1:
                                jsonReader.beginObject();
                                t1 t1VarD = null;
                                l0 l0VarF = null;
                                y yVarC = null;
                                m0 m0Var = null;
                                t1 t1VarD2 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4.hashCode()) {
                                        case -1375141843:
                                            if (!strNextName4.equals("appExitInfo")) {
                                                i11 = -1;
                                            } else {
                                                i11 = 0;
                                            }
                                            break;
                                        case -1337936983:
                                            if (!strNextName4.equals("threads")) {
                                                i11 = -1;
                                            } else {
                                                i11 = i13;
                                            }
                                            break;
                                        case -902467928:
                                            if (!strNextName4.equals("signal")) {
                                                i11 = -1;
                                            } else {
                                                i11 = i17;
                                            }
                                            break;
                                        case 937615455:
                                            if (!strNextName4.equals("binaries")) {
                                                i11 = -1;
                                            } else {
                                                i11 = i15;
                                            }
                                            break;
                                        case 1481625679:
                                            if (!strNextName4.equals("exception")) {
                                                i11 = -1;
                                            } else {
                                                i11 = i16;
                                            }
                                            break;
                                        default:
                                            i11 = -1;
                                            break;
                                    }
                                    switch (i11) {
                                        case 0:
                                            yVarC = c(jsonReader);
                                            break;
                                        case 1:
                                            t1VarD = d(jsonReader, new a(i14));
                                            break;
                                        case 2:
                                            jsonReader.beginObject();
                                            String strNextString = null;
                                            String strNextString2 = null;
                                            Long lValueOf = null;
                                            while (jsonReader.hasNext()) {
                                                String strNextName5 = jsonReader.nextName();
                                                strNextName5.getClass();
                                                switch (strNextName5.hashCode()) {
                                                    case -1147692044:
                                                        if (!strNextName5.equals("address")) {
                                                            i12 = -1;
                                                        } else {
                                                            i12 = 0;
                                                        }
                                                        break;
                                                    case 3059181:
                                                        if (!strNextName5.equals("code")) {
                                                            i12 = -1;
                                                        } else {
                                                            i12 = 1;
                                                        }
                                                        break;
                                                    case 3373707:
                                                        if (!strNextName5.equals("name")) {
                                                            i12 = -1;
                                                        } else {
                                                            i12 = i17;
                                                        }
                                                        break;
                                                    default:
                                                        i12 = -1;
                                                        break;
                                                }
                                                switch (i12) {
                                                    case 0:
                                                        lValueOf = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case 1:
                                                        strNextString2 = jsonReader.nextString();
                                                        if (strNextString2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                        break;
                                                    case 2:
                                                        strNextString = jsonReader.nextString();
                                                        if (strNextString == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            String strH = strNextString == null ? " name" : "";
                                            if (strNextString2 == null) {
                                                strH = strH.concat(" code");
                                            }
                                            if (lValueOf == null) {
                                                strH = da.v.h(strH, " address");
                                            }
                                            if (!strH.isEmpty()) {
                                                throw new IllegalStateException("Missing required properties:".concat(strH));
                                            }
                                            m0Var = new m0(strNextString, strNextString2, lValueOf.longValue());
                                            break;
                                            break;
                                        case 3:
                                            t1VarD2 = d(jsonReader, new a(i13));
                                            break;
                                        case 4:
                                            l0VarF = f(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                    i13 = 1;
                                    i15 = 3;
                                    i16 = 4;
                                    i17 = 2;
                                }
                                jsonReader.endObject();
                                String strConcat2 = m0Var == null ? " signal" : "";
                                if (t1VarD2 == null) {
                                    strConcat2 = strConcat2.concat(" binaries");
                                }
                                if (!strConcat2.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat2));
                                }
                                j0Var = new j0(t1VarD, l0VarF, yVarC, m0Var, t1VarD2);
                                break;
                                break;
                            case 2:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                t1Var2 = new t1(arrayList);
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                t1Var = new t1(arrayList2);
                                break;
                            case 4:
                                numValueOf = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                        i13 = 1;
                        i15 = 3;
                        i16 = 4;
                        i17 = 2;
                    }
                    jsonReader.endObject();
                    strConcat = j0Var == null ? " execution" : "";
                    if (numValueOf == null) {
                        strConcat = strConcat.concat(" uiOrientation");
                    }
                    if (!strConcat.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat));
                    }
                    uVar.f1678d = new i0(j0Var, t1Var, t1Var2, boolValueOf, numValueOf.intValue());
                    break;
                    break;
                case 2:
                    jsonReader.beginObject();
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String strNextName6 = jsonReader.nextName();
                        strNextName6.getClass();
                        if (strNextName6.equals("content")) {
                            String strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null content");
                            }
                            str = strNextString3;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strConcat = str == null ? " content" : "";
                    if (!strConcat.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat));
                    }
                    uVar.f1679f = new q0(str);
                    break;
                    break;
                case 3:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null type");
                    }
                    uVar.f1676b = strNextString4;
                    break;
                    break;
                case 4:
                    uVar.f1677c = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            i13 = 1;
        }
        jsonReader.endObject();
        return uVar.b();
    }

    public static l0 f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer numValueOf = null;
        String str = null;
        String strNextString = null;
        t1 t1VarD = null;
        l0 l0VarF = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i = 2;
            switch (strNextName) {
                case "frames":
                    t1VarD = d(jsonReader, new a(i));
                    break;
                case "reason":
                    strNextString = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = strNextString2;
                    break;
                    break;
                case "causedBy":
                    l0VarF = f(jsonReader);
                    break;
                case "overflowCount":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strH = str == null ? " type" : "";
        if (t1VarD == null) {
            strH = strH.concat(" frames");
        }
        if (numValueOf == null) {
            strH = da.v.h(strH, " overflowCount");
        }
        if (strH.isEmpty()) {
            return new l0(str, strNextString, t1VarD, l0VarF, numValueOf.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    public static x g(JsonReader jsonReader) throws IOException {
        byte b10;
        Charset charset = s1.f3842a;
        w wVar = new w();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    b10 = 0;
                    break;
                case "sdkVersion":
                    b10 = 1;
                    break;
                case "appQualitySessionId":
                    b10 = 2;
                    break;
                case "appExitInfo":
                    b10 = 3;
                    break;
                case "buildVersion":
                    b10 = 4;
                    break;
                case "gmpAppId":
                    b10 = 5;
                    break;
                case "installationUuid":
                    b10 = 6;
                    break;
                case "firebaseInstallationId":
                    b10 = 7;
                    break;
                case "platform":
                    b10 = 8;
                    break;
                case "displayVersion":
                    b10 = 9;
                    break;
                case "session":
                    b10 = 10;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    jsonReader.beginObject();
                    t1 t1VarD = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            t1VarD = d(jsonReader, new a5.f(29));
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str = t1VarD == null ? " files" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    wVar.f3871j = new b0(t1VarD, strNextString);
                    continue;
                    break;
                case 1:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    wVar.f3865a = strNextString2;
                    break;
                    break;
                case 2:
                    wVar.e = jsonReader.nextString();
                    break;
                case 3:
                    wVar.f3872k = c(jsonReader);
                    break;
                case 4:
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    wVar.f3869f = strNextString3;
                    break;
                    break;
                case 5:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    wVar.f3866b = strNextString4;
                    break;
                    break;
                case 6:
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    wVar.f3867c = strNextString5;
                    break;
                    break;
                case 7:
                    wVar.f3868d = jsonReader.nextString();
                    break;
                case 8:
                    wVar.h = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 9:
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    wVar.f3870g = strNextString6;
                    break;
                    break;
                case 10:
                    b9.j jVar = new b9.j();
                    jVar.f1473f = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                jVar.f1472d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "appQualitySessionId":
                                jVar.f1471c = jsonReader.nextString();
                                break;
                            case "identifier":
                                jVar.f1470b = new String(Base64.decode(jsonReader.nextString(), 2), s1.f3842a);
                                break;
                            case "endedAt":
                                jVar.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                c3.j jVar2 = new c3.j();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            jVar2.f1763f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            jVar2.h = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            jVar2.f1762d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            jVar2.f1759a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            jVar2.e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            jVar2.f1761c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            jVar2.f1760b = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            jVar2.f1764g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            jVar2.i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                jVar.f1475j = jVar2.b();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                jVar.f1476k = new t1(arrayList);
                                break;
                            case "os":
                                gb.r rVar = new gb.r();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            rVar.f4496d = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            rVar.f4494b = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            rVar.f4493a = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            rVar.f4495c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                jVar.i = rVar.b();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                            break;
                                        case "developmentPlatform":
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            strNextString17 = jsonReader.nextString();
                                            break;
                                        case "version":
                                            strNextString13 = jsonReader.nextString();
                                            if (strNextString13 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                            break;
                                        case "installationUuid":
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                String strConcat = strNextString12 == null ? " identifier" : "";
                                if (strNextString13 == null) {
                                    strConcat = strConcat.concat(" version");
                                }
                                if (!strConcat.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat));
                                }
                                jVar.f1474g = new e0(strNextString12, strNextString13, strNextString14, strNextString15, strNextString16, strNextString17);
                                break;
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName7 = jsonReader.nextName();
                                    strNextName7.getClass();
                                    if (strNextName7.equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str2 = strNextString18 == null ? " identifier" : "";
                                if (!str2.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                                jVar.h = new s0(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                jVar.f1469a = strNextString19;
                                break;
                                break;
                            case "crashed":
                                jVar.f1473f = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case "generatorType":
                                jVar.f1477l = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    wVar.i = jVar.b();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return wVar.b();
    }

    public static x h(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                x xVarG = g(jsonReader);
                jsonReader.close();
                return xVarG;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
