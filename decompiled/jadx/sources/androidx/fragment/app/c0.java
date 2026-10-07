package androidx.fragment.app;

import androidx.datastore.preferences.protobuf.d1;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r.k f855b = new r.k(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f856a;

    public c0(i0 i0Var) {
        this.f856a = i0Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        r.k kVar = f855b;
        r.k kVar2 = (r.k) kVar.get(classLoader);
        if (kVar2 == null) {
            kVar2 = new r.k(0);
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new d1(da.v.i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e4) {
            throw new d1(da.v.i("Unable to instantiate fragment ", str, ": make sure class name exists"), e4);
        }
    }

    public final s a(String str) {
        try {
            return (s) c(this.f856a.f887n.f997f.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new d1(da.v.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e4) {
            throw new d1(da.v.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e10) {
            throw new d1(da.v.i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e10);
        } catch (InvocationTargetException e11) {
            throw new d1(da.v.i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e11);
        }
    }
}
