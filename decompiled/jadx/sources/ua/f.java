package ua;

import da.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements ra.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f9051f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ra.c f9052g = new ra.c("key", v.n(v.m(e.class, new a(1))));
    public static final ra.c h = new ra.c("value", v.n(v.m(e.class, new a(2))));
    public static final ta.a i = new ta.a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f9053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f9055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ra.d f9056d;
    public final h e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, ra.d dVar) {
        this.f9053a = byteArrayOutputStream;
        this.f9054b = map;
        this.f9055c = map2;
        this.f9056d = dVar;
    }

    public static int j(ra.c cVar) {
        e eVar = (e) ((Annotation) cVar.f8237b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f9047a;
        }
        throw new ra.b("Field has no @Protobuf config");
    }

    @Override // ra.e
    public final ra.e a(ra.c cVar, boolean z4) {
        g(cVar, z4 ? 1 : 0, true);
        return this;
    }

    @Override // ra.e
    public final ra.e b(ra.c cVar, double d10) throws IOException {
        f(cVar, d10, true);
        return this;
    }

    @Override // ra.e
    public final ra.e c(ra.c cVar, int i10) {
        g(cVar, i10, true);
        return this;
    }

    @Override // ra.e
    public final ra.e d(ra.c cVar, long j4) throws IOException {
        if (j4 == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) cVar.f8237b.get(e.class));
        if (eVar == null) {
            throw new ra.b("Field has no @Protobuf config");
        }
        k(((a) eVar).f9047a << 3);
        l(j4);
        return this;
    }

    @Override // ra.e
    public final ra.e e(ra.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final void f(ra.c cVar, double d10, boolean z4) throws IOException {
        if (z4 && d10 == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f9053a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d10).array());
    }

    public final void g(ra.c cVar, int i10, boolean z4) {
        if (z4 && i10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f8237b.get(e.class));
        if (eVar == null) {
            throw new ra.b("Field has no @Protobuf config");
        }
        k(((a) eVar).f9047a << 3);
        k(i10);
    }

    public final void h(ra.c cVar, Object obj, boolean z4) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z4 && charSequence.length() == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f9051f);
            k(bytes.length);
            this.f9053a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            f(cVar, ((Double) obj).doubleValue(), z4);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z4 && fFloatValue == 0.0f) {
                return;
            }
            k((j(cVar) << 3) | 5);
            this.f9053a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z4 && jLongValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) cVar.f8237b.get(e.class));
            if (eVar == null) {
                throw new ra.b("Field has no @Protobuf config");
            }
            k(((a) eVar).f9047a << 3);
            l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z4);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z4 && bArr.length == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            k(bArr.length);
            this.f9053a.write(bArr);
            return;
        }
        ra.d dVar = (ra.d) this.f9054b.get(obj.getClass());
        if (dVar != null) {
            i(dVar, cVar, obj, z4);
            return;
        }
        ra.f fVar = (ra.f) this.f9055c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.e;
            hVar.f9058a = false;
            hVar.f9060c = cVar;
            hVar.f9059b = z4;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            g(cVar, ((c) obj).a(), true);
        } else if (obj instanceof Enum) {
            g(cVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.f9056d, cVar, obj, z4);
        }
    }

    public final void i(ra.d dVar, ra.c cVar, Object obj, boolean z4) throws IOException {
        b bVar = new b();
        bVar.f9048a = 0L;
        try {
            OutputStream outputStream = this.f9053a;
            this.f9053a = bVar;
            try {
                dVar.a(obj, this);
                this.f9053a = outputStream;
                long j4 = bVar.f9048a;
                bVar.close();
                if (z4 && j4 == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                l(j4);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f9053a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f9053a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f9053a.write(i10 & 127);
    }

    public final void l(long j4) throws IOException {
        while (((-128) & j4) != 0) {
            this.f9053a.write((((int) j4) & 127) | 128);
            j4 >>>= 7;
        }
        this.f9053a.write(((int) j4) & 127);
    }
}
