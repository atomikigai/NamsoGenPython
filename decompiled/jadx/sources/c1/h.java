package c1;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.r;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends t {
    private static final h DEFAULT_INSTANCE;
    private static volatile r0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private u strings_ = t0.f713d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        t.h(h.class, hVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void i(h hVar, Set set) {
        u uVar = hVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) uVar).f609a) {
            int size = uVar.size();
            hVar.strings_ = uVar.a(size == 0 ? 10 : size * 2);
        }
        List list = hVar.strings_;
        Charset charset = v.f720a;
        if (!(set instanceof a0)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : set) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List listC = ((a0) set).c();
        a0 a0Var = (a0) list;
        int size4 = list.size();
        for (Object obj2 : listC) {
            if (obj2 == null) {
                String str2 = "Element at index " + (a0Var.size() - size4) + " is null.";
                for (int size5 = a0Var.size() - 1; size5 >= size4; size5--) {
                    a0Var.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof androidx.datastore.preferences.protobuf.f) {
                a0Var.b((androidx.datastore.preferences.protobuf.f) obj2);
            } else {
                a0Var.add((String) obj2);
            }
        }
    }

    public static h j() {
        return DEFAULT_INSTANCE;
    }

    public static g l() {
        return (g) ((r) DEFAULT_INSTANCE.d(5));
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
                return new u0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                r0 r0Var = PARSER;
                if (r0Var != null) {
                    return r0Var;
                }
                synchronized (h.class) {
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

    public final u k() {
        return this.strings_;
    }
}
