package rc;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient l1 f8264a;

    public c1(String str, Throwable th, l1 l1Var) {
        super(str);
        this.f8264a = l1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return jc.i.a(c1Var.getMessage(), getMessage()) && jc.i.a(c1Var.f8264a, this.f8264a) && jc.i.a(c1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        jc.i.b(message);
        int iHashCode = (this.f8264a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f8264a;
    }
}
