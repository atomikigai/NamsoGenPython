package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s0 f710c = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f712b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f711a = new f0();

    public final v0 a(Class cls) {
        v0 v0VarW;
        Class cls2;
        v.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f712b;
        v0 v0Var = (v0) concurrentHashMap.get(cls);
        if (v0Var != null) {
            return v0Var;
        }
        f0 f0Var = this.f711a;
        f0Var.getClass();
        Class cls3 = w0.f727a;
        if (!t.class.isAssignableFrom(cls) && (cls2 = w0.f727a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        u0 u0VarA = ((e0) f0Var.f636a).a(cls);
        int i = u0VarA.f719d;
        a aVar = u0VarA.f716a;
        if ((i & 2) == 2) {
            if (t.class.isAssignableFrom(cls)) {
                v0VarW = new o0(w0.f730d, n.f670a, aVar);
            } else {
                f1 f1Var = w0.f728b;
                m mVar = n.f671b;
                if (mVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                v0VarW = new o0(f1Var, mVar, aVar);
            }
        } else if (t.class.isAssignableFrom(cls)) {
            v0VarW = (u0VarA.f719d & 1) == 1 ? n0.w(u0VarA, q0.f705b, d0.f623b, w0.f730d, n.f670a, k0.f663b) : n0.w(u0VarA, q0.f705b, d0.f623b, w0.f730d, null, k0.f663b);
        } else if ((u0VarA.f719d & 1) == 1) {
            p0 p0Var = q0.f704a;
            b0 b0Var = d0.f622a;
            f1 f1Var2 = w0.f728b;
            m mVar2 = n.f671b;
            if (mVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            v0VarW = n0.w(u0VarA, p0Var, b0Var, f1Var2, mVar2, k0.f662a);
        } else {
            v0VarW = n0.w(u0VarA, q0.f704a, d0.f622a, w0.f729c, null, k0.f662a);
        }
        v0 v0Var2 = (v0) concurrentHashMap.putIfAbsent(cls, v0VarW);
        return v0Var2 != null ? v0Var2 : v0VarW;
    }
}
