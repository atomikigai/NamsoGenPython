package c1;

import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.r;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.x;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends t {
    private static final f DEFAULT_INSTANCE;
    private static volatile r0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private i0 preferences_ = i0.f654b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        t.h(f.class, fVar);
    }

    public static i0 i(f fVar) {
        i0 i0Var = fVar.preferences_;
        if (!i0Var.f655a) {
            fVar.preferences_ = i0Var.b();
        }
        return fVar.preferences_;
    }

    public static d k() {
        return (d) ((r) DEFAULT_INSTANCE.d(5));
    }

    public static f l(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.g gVar = new androidx.datastore.preferences.protobuf.g(fileInputStream);
        androidx.datastore.preferences.protobuf.l lVarA = androidx.datastore.preferences.protobuf.l.a();
        t tVar = (t) fVar.d(4);
        try {
            s0 s0Var = s0.f710c;
            s0Var.getClass();
            v0 v0VarA = s0Var.a(tVar.getClass());
            androidx.datastore.preferences.protobuf.h hVar = gVar.f638b;
            if (hVar == null) {
                hVar = new androidx.datastore.preferences.protobuf.h();
                hVar.f650c = 0;
                Charset charset = v.f720a;
                hVar.f651d = gVar;
                gVar.f638b = hVar;
            }
            v0VarA.h(tVar, hVar, lVarA);
            v0VarA.b(tVar);
            if (tVar.g()) {
                return (f) tVar;
            }
            throw new x(new d1().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof x) {
                throw ((x) e.getCause());
            }
            throw new x(e.getMessage());
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof x) {
                throw ((x) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t
    public final Object d(int i) {
        r0 sVar;
        switch (u.e.d(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new u0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f1725a});
            case 3:
                return new f();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                r0 r0Var = PARSER;
                if (r0Var != null) {
                    return r0Var;
                }
                synchronized (f.class) {
                    try {
                        sVar = PARSER;
                        if (sVar == null) {
                            sVar = new s();
                            PARSER = sVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return sVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
