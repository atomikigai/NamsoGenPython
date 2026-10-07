package d1;

import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.x;
import c1.h;
import c1.j;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import jc.i;
import z0.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f2799a = new g();

    public final b a(FileInputStream fileInputStream) throws z0.a {
        try {
            c1.f fVarL = c1.f.l(fileInputStream);
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            i.e(eVarArr, "pairs");
            if (bVar.f2792b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map mapJ = fVarL.j();
            i.d(mapJ, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapJ.entrySet()) {
                String str = (String) entry.getKey();
                j jVar = (j) entry.getValue();
                i.d(str, "name");
                i.d(jVar, "value");
                int iX = jVar.x();
                switch (iX == 0 ? -1 : f.f2798a[u.e.d(iX)]) {
                    case -1:
                        throw new z0.a("Value case is null.", null);
                    case 0:
                    default:
                        throw new d1();
                    case 1:
                        bVar.c(new d(str), Boolean.valueOf(jVar.p()));
                        break;
                    case 2:
                        bVar.c(new d(str), Float.valueOf(jVar.s()));
                        break;
                    case 3:
                        bVar.c(new d(str), Double.valueOf(jVar.r()));
                        break;
                    case 4:
                        bVar.c(android.support.v4.media.session.a.l(str), Integer.valueOf(jVar.t()));
                        break;
                    case 5:
                        bVar.c(new d(str), Long.valueOf(jVar.u()));
                        break;
                    case 6:
                        d dVar = new d(str);
                        String strV = jVar.v();
                        i.d(strV, "value.string");
                        bVar.c(dVar, strV);
                        break;
                    case 7:
                        d dVar2 = new d(str);
                        u uVarK = jVar.w().k();
                        i.d(uVarK, "value.stringSet.stringsList");
                        bVar.c(dVar2, vb.i.q0(uVarK));
                        break;
                    case 8:
                        throw new z0.a("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (x e) {
            throw new z0.a("Unable to parse preferences proto.", e);
        }
    }

    public final void b(Object obj, l lVar) throws IOException {
        t tVarA;
        Map mapA = ((b) obj).a();
        c1.d dVarK = c1.f.k();
        for (Map.Entry entry : mapA.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f2797a;
            if (value instanceof Boolean) {
                c1.i iVarY = j.y();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                iVarY.c();
                j.m((j) iVarY.f708b, zBooleanValue);
                tVarA = iVarY.a();
            } else if (value instanceof Float) {
                c1.i iVarY2 = j.y();
                float fFloatValue = ((Number) value).floatValue();
                iVarY2.c();
                j.n((j) iVarY2.f708b, fFloatValue);
                tVarA = iVarY2.a();
            } else if (value instanceof Double) {
                c1.i iVarY3 = j.y();
                double dDoubleValue = ((Number) value).doubleValue();
                iVarY3.c();
                j.l((j) iVarY3.f708b, dDoubleValue);
                tVarA = iVarY3.a();
            } else if (value instanceof Integer) {
                c1.i iVarY4 = j.y();
                int iIntValue = ((Number) value).intValue();
                iVarY4.c();
                j.o((j) iVarY4.f708b, iIntValue);
                tVarA = iVarY4.a();
            } else if (value instanceof Long) {
                c1.i iVarY5 = j.y();
                long jLongValue = ((Number) value).longValue();
                iVarY5.c();
                j.i((j) iVarY5.f708b, jLongValue);
                tVarA = iVarY5.a();
            } else if (value instanceof String) {
                c1.i iVarY6 = j.y();
                iVarY6.c();
                j.j((j) iVarY6.f708b, (String) value);
                tVarA = iVarY6.a();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(i.h(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                c1.i iVarY7 = j.y();
                c1.g gVarL = h.l();
                gVarL.c();
                h.i((h) gVarL.f708b, (Set) value);
                iVarY7.c();
                j.k((j) iVarY7.f708b, gVarL);
                tVarA = iVarY7.a();
            }
            dVarK.getClass();
            str.getClass();
            dVarK.c();
            c1.f.i((c1.f) dVarK.f708b).put(str, (j) tVarA);
        }
        c1.f fVar = (c1.f) dVarK.a();
        int iA = fVar.a();
        Logger logger = androidx.datastore.preferences.protobuf.j.h;
        if (iA > 4096) {
            iA = 4096;
        }
        androidx.datastore.preferences.protobuf.j jVar = new androidx.datastore.preferences.protobuf.j(lVar, iA);
        fVar.c(jVar);
        if (jVar.f659f > 0) {
            jVar.B();
        }
    }
}
