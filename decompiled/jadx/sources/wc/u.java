package wc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9955a = 0;

    static {
        Object objM;
        Object objM2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objM = ac.a.class.getCanonicalName();
        } catch (Throwable th) {
            objM = r7.g.m(th);
        }
        if (ub.h.a(objM) != null) {
            objM = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objM2 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            objM2 = r7.g.m(th2);
        }
        if (ub.h.a(objM2) != null) {
            objM2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
