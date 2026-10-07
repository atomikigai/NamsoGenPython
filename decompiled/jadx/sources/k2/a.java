package k2;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.datastore.preferences.protobuf.d1;
import app.namso_gen.spacehowen.R;
import gb.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f5913d;
    public static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5916c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f5915b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5914a = new HashMap();

    public a(Context context) {
        this.f5916c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f5913d == null) {
            synchronized (e) {
                try {
                    if (f5913d == null) {
                        f5913d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5913d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f5916c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f5915b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e4) {
                throw new d1(e4);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = this.f5914a;
        if (p.b()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f5916c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new d1(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
