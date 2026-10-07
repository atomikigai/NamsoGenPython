package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends q0 {
    public static r0 e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Application f1087d;

    public r0(Application application) {
        this.f1087d = application;
    }

    @Override // androidx.lifecycle.q0, androidx.lifecycle.s0
    public final p0 a(Class cls) {
        Application application = this.f1087d;
        if (application != null) {
            return b(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final p0 b(Class cls, Application application) {
        if (!d5.f.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            p0 p0Var = (p0) cls.getConstructor(Application.class).newInstance(application);
            jc.i.d(p0Var, "{\n                try {\n…          }\n            }");
            return p0Var;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }

    @Override // androidx.lifecycle.s0
    public final p0 d(Class cls, l1.b bVar) {
        if (this.f1087d != null) {
            return a(cls);
        }
        Application application = (Application) ((LinkedHashMap) bVar.f159a).get(q0.f1084a);
        if (application != null) {
            return b(cls, application);
        }
        if (d5.f.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }
}
