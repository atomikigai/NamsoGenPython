package e7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.i0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j7.a f3472c = new j7.a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f3474b;

    public c(String str) {
        i0.e(str);
        this.f3473a = str;
        this.f3474b = new w(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        j7.a aVar = f3472c;
        Status status = Status.f2042r;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f3473a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                aVar.c("Unable to revoke access!", new Object[0]);
            }
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            aVar.c("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e4) {
            aVar.c("Exception when revoking access: ".concat(String.valueOf(e4.toString())), new Object[0]);
        }
        this.f3474b.setResult(status);
    }
}
