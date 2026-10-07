package i6;

import e6.s;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5232a;

    public k(String str) {
        this.f5232a = str;
    }

    @Override // i6.c
    public final boolean zza(String str) {
        boolean z4 = false;
        try {
            h.b("Pinging URL: " + str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
            try {
                d dVar = s.f3427f.f3428a;
                String str2 = this.f5232a;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                g gVar = new g();
                gVar.a(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                gVar.b(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    h.g("Received non-success response code " + responseCode + " from pinging URL: " + str);
                } else {
                    z4 = true;
                }
                return z4;
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e = e;
            h.g("Error while pinging URL: " + str + ". " + e.getMessage());
            return false;
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
            h.g("Error while parsing ping URL: " + str + ". " + e.getMessage());
            return false;
        } catch (RuntimeException e10) {
            e = e10;
            h.g("Error while pinging URL: " + str + ". " + e.getMessage());
            return false;
        } catch (URISyntaxException e11) {
            e = e11;
            h.g("Error while parsing ping URL: " + str + ". " + e.getMessage());
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }
}
