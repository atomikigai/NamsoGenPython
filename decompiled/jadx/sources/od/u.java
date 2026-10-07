package od;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Socket f7766m;

    public u(Socket socket) {
        this.f7766m = socket;
    }

    @Override // od.e
    public final void j() {
        Socket socket = this.f7766m;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!jd.l.n(e)) {
                throw e;
            }
            m.f7747a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e4) {
            m.f7747a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
