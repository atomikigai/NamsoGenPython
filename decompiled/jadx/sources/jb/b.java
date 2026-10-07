package jb;

import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kb.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9.c f5735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f5736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kb.c f5737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kb.c f5738d;
    public final kb.c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kb.h f5739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kb.i f5740g;
    public final kb.k h;
    public final a2.l i;

    public b(o9.c cVar, Executor executor, kb.c cVar2, kb.c cVar3, kb.c cVar4, kb.h hVar, kb.i iVar, kb.k kVar, a2.l lVar) {
        this.f5735a = cVar;
        this.f5736b = executor;
        this.f5737c = cVar2;
        this.f5738d = cVar3;
        this.e = cVar4;
        this.f5739f = hVar;
        this.f5740g = iVar;
        this.h = kVar;
        this.i = lVar;
    }

    public static b b() {
        return ((k) n9.g.d().b(k.class)).c();
    }

    public static ArrayList e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final Task a() {
        kb.h hVar = this.f5739f;
        long j4 = hVar.f6174g.f6183a.getLong("minimum_fetch_interval_in_seconds", kb.h.i);
        HashMap map = new HashMap(hVar.h);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return hVar.e.b().continueWithTask(hVar.f6171c, new aa.a(hVar, j4, map)).onSuccessTask(y9.i.f10656a, new ga.a(24)).onSuccessTask(this.f5736b, new a(this));
    }

    public final String c(String str) {
        kb.i iVar = this.f5740g;
        kb.c cVar = iVar.f6178c;
        String strC = kb.i.c(cVar, str);
        if (strC != null) {
            iVar.a(str, kb.i.b(cVar));
            return strC;
        }
        String strC2 = kb.i.c(iVar.f6179d, str);
        if (strC2 != null) {
            return strC2;
        }
        kb.i.d(str, "String");
        return "";
    }

    public final void d(boolean z4) {
        a2.l lVar = this.i;
        synchronized (lVar) {
            ((m) lVar.f44c).e = z4;
            if (!z4) {
                synchronized (lVar) {
                    if (!((LinkedHashSet) lVar.f43b).isEmpty()) {
                        ((m) lVar.f44c).e(0L);
                    }
                }
            }
        }
    }
}
