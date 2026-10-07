package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f691c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f692a = new x0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f693b;

    static {
        new o(0);
    }

    public o() {
    }

    public static void b(j jVar, v1 v1Var, int i, Object obj) throws IOException {
        if (v1Var == v1.f723d) {
            jVar.R(i, 3);
            ((a) obj).c(jVar);
            jVar.R(i, 4);
        }
        jVar.R(i, v1Var.f726b);
        switch (v1Var.ordinal()) {
            case 0:
                jVar.L(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                jVar.J(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                jVar.V(((Long) obj).longValue());
                break;
            case 3:
                jVar.V(((Long) obj).longValue());
                break;
            case 4:
                jVar.N(((Integer) obj).intValue());
                break;
            case 5:
                jVar.L(((Long) obj).longValue());
                break;
            case 6:
                jVar.J(((Integer) obj).intValue());
                break;
            case 7:
                jVar.D(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof f)) {
                    jVar.Q((String) obj);
                } else {
                    jVar.H((f) obj);
                }
                break;
            case 9:
                ((a) obj).c(jVar);
                break;
            case 10:
                a aVar = (a) obj;
                jVar.getClass();
                jVar.T(aVar.a());
                aVar.c(jVar);
                break;
            case 11:
                if (!(obj instanceof f)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    jVar.T(length);
                    jVar.E(bArr, 0, length);
                } else {
                    jVar.H((f) obj);
                }
                break;
            case 12:
                jVar.T(((Integer) obj).intValue());
                break;
            case 13:
                jVar.N(((Integer) obj).intValue());
                break;
            case 14:
                jVar.J(((Integer) obj).intValue());
                break;
            case 15:
                jVar.L(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                jVar.T((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                jVar.V((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f693b) {
            return;
        }
        x0 x0Var = this.f692a;
        if (!x0Var.f744d) {
            if (x0Var.f742b.size() > 0) {
                x0Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = x0Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!x0Var.f744d) {
            x0Var.f743c = x0Var.f743c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(x0Var.f743c);
            x0Var.f745f = x0Var.f745f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(x0Var.f745f);
            x0Var.f744d = true;
        }
        this.f693b = true;
    }

    public final Object clone() {
        o oVar = new o();
        x0 x0Var = this.f692a;
        if (x0Var.f742b.size() > 0) {
            Map.Entry entryC = x0Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = x0Var.d().iterator();
        if (!it.hasNext()) {
            return oVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return this.f692a.equals(((o) obj).f692a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f692a.hashCode();
    }

    public o(int i) {
        a();
        a();
    }
}
