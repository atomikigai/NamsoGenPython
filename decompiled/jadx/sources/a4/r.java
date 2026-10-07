package a4;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map f171c;

    public r(Map map) {
        this.f170b = Collections.unmodifiableMap(map);
    }

    @Override // a4.o
    public final Map a() {
        if (this.f171c == null) {
            synchronized (this) {
                try {
                    if (this.f171c == null) {
                        this.f171c = Collections.unmodifiableMap(b());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f171c;
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f170b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((q) list.get(i)).f169a;
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    if (i != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String string = sb2.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f170b.equals(((r) obj).f170b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f170b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f170b + '}';
    }
}
