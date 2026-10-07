package kd;

import bd.s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import vb.r;
import vb.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f6214a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f6215b;

    static {
        Map linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Package r10 = s.class.getPackage();
        String name = r10 != null ? r10.getName() : null;
        if (name != null) {
            linkedHashMap2.put(name, "OkHttp");
        }
        linkedHashMap2.put(s.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap2.put(id.f.class.getName(), "okhttp.Http2");
        linkedHashMap2.put(ed.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap2.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap2.size();
        if (size != 0) {
            linkedHashMap = size != 1 ? new LinkedHashMap(linkedHashMap2) : t.E(linkedHashMap2);
        } else {
            linkedHashMap = r.f9298a;
        }
        f6215b = linkedHashMap;
    }
}
