package b6;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzi;
import i6.k;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f1415b;

    public /* synthetic */ c(int i, Serializable serializable) {
        this.f1414a = i;
        this.f1415b = serializable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f1414a) {
            case 0:
                HashMap map = (HashMap) this.f1415b;
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    try {
                        zzi.zzb(263);
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                        try {
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 65);
                                sb2.append("Received non-success response code ");
                                sb2.append(responseCode);
                                sb2.append(" from pinging URL: ");
                                sb2.append(string);
                                Log.w("HttpUrlPinger", sb2.toString());
                            }
                            httpURLConnection.disconnect();
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        zzi.zza();
                        throw th2;
                    }
                    break;
                } catch (IOException e) {
                    e = e;
                    String message = e.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(message).length());
                    sb3.append("Error while pinging URL: ");
                    sb3.append(string);
                    sb3.append(". ");
                    sb3.append(message);
                    Log.w("HttpUrlPinger", sb3.toString(), e);
                } catch (IndexOutOfBoundsException e4) {
                    String message2 = e4.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + 32 + String.valueOf(message2).length());
                    sb4.append("Error while parsing ping URL: ");
                    sb4.append(string);
                    sb4.append(". ");
                    sb4.append(message2);
                    Log.w("HttpUrlPinger", sb4.toString(), e4);
                } catch (RuntimeException e10) {
                    e = e10;
                    String message3 = e.getMessage();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(message3).length());
                    sb5.append("Error while pinging URL: ");
                    sb5.append(string);
                    sb5.append(". ");
                    sb5.append(message3);
                    Log.w("HttpUrlPinger", sb5.toString(), e);
                }
                zzi.zza();
                return;
            default:
                new k(null).zza((String) this.f1415b);
                return;
        }
    }
}
