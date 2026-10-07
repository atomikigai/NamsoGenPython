package g7;

import com.google.android.gms.common.internal.i0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f4256c;

    public /* synthetic */ l(boolean z4, String str, o oVar) {
        this.f4254a = z4;
        this.f4255b = str;
        this.f4256c = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z4 = this.f4254a;
        String str = this.f4255b;
        o oVar = this.f4256c;
        String str2 = (z4 || !q.a(str, oVar, true, false).f4281a) ? "not allowed" : "debug cert rejected";
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    i0.i(messageDigest);
                    return str2 + ": pkg=" + str + ", sha256=" + n7.c.b(messageDigest.digest(oVar.f4261c)) + ", atk=" + z4 + ", ver=12451000.false";
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        messageDigest = null;
        i0.i(messageDigest);
        return str2 + ": pkg=" + str + ", sha256=" + n7.c.b(messageDigest.digest(oVar.f4261c)) + ", atk=" + z4 + ", ver=12451000.false";
    }
}
