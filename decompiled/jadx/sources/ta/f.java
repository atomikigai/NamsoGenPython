package ta;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements ra.e, ra.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8670a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f8671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f8672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f8673d;
    public final ra.d e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8674f;

    public f(Writer writer, HashMap map, HashMap map2, a aVar, boolean z4) {
        this.f8671b = new JsonWriter(writer);
        this.f8672c = map;
        this.f8673d = map2;
        this.e = aVar;
        this.f8674f = z4;
    }

    @Override // ra.e
    public final ra.e a(ra.c cVar, boolean z4) throws IOException {
        String str = cVar.f8236a;
        j();
        JsonWriter jsonWriter = this.f8671b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z4);
        return this;
    }

    @Override // ra.e
    public final ra.e b(ra.c cVar, double d10) throws IOException {
        String str = cVar.f8236a;
        j();
        JsonWriter jsonWriter = this.f8671b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d10);
        return this;
    }

    @Override // ra.e
    public final ra.e c(ra.c cVar, int i) throws IOException {
        String str = cVar.f8236a;
        j();
        JsonWriter jsonWriter = this.f8671b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i);
        return this;
    }

    @Override // ra.e
    public final ra.e d(ra.c cVar, long j4) throws IOException {
        String str = cVar.f8236a;
        j();
        JsonWriter jsonWriter = this.f8671b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j4);
        return this;
    }

    @Override // ra.e
    public final ra.e e(ra.c cVar, Object obj) throws IOException {
        i(obj, cVar.f8236a);
        return this;
    }

    @Override // ra.g
    public final ra.g f(String str) throws IOException {
        j();
        this.f8671b.value(str);
        return this;
    }

    @Override // ra.g
    public final ra.g g(boolean z4) throws IOException {
        j();
        this.f8671b.value(z4);
        return this;
    }

    public final f h(Object obj) {
        JsonWriter jsonWriter = this.f8671b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new ra.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            ra.d dVar = (ra.d) this.f8672c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            ra.f fVar = (ra.f) this.f8673d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof g) {
                int iA = ((g) obj).a();
                j();
                jsonWriter.value(iA);
                return this;
            }
            String strName = ((Enum) obj).name();
            j();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j4 = jArr[i];
                j();
                jsonWriter.value(j4);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                h(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                h(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final f i(Object obj, String str) throws IOException {
        boolean z4 = this.f8674f;
        JsonWriter jsonWriter = this.f8671b;
        if (z4) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            h(obj);
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        h(obj);
        return this;
    }

    public final void j() {
        if (!this.f8670a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
