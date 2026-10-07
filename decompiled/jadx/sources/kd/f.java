package kd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f6217f = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f6218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f6219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f6220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f6221d;
    public final Method e;

    public f(Class cls) throws NoSuchMethodException {
        this.f6218a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        jc.i.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f6219b = declaredMethod;
        this.f6220c = cls.getMethod("setHostname", String.class);
        this.f6221d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // kd.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f6218a.isInstance(sSLSocket);
    }

    @Override // kd.m
    public final String b(SSLSocket sSLSocket) {
        if (this.f6218a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f6221d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, pc.a.f7846a);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (!(cause instanceof NullPointerException) || !jc.i.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e4);
                }
            }
        }
        return null;
    }

    @Override // kd.m
    public final void c(SSLSocket sSLSocket, String str, List list) {
        jc.i.e(list, "protocols");
        if (this.f6218a.isInstance(sSLSocket)) {
            try {
                this.f6219b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f6220c.invoke(sSLSocket, str);
                }
                Method method = this.e;
                jd.n nVar = jd.n.f5799a;
                method.invoke(sSLSocket, z9.c.i(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    @Override // kd.m
    public final boolean isSupported() {
        boolean z4 = jd.c.e;
        return jd.c.e;
    }
}
