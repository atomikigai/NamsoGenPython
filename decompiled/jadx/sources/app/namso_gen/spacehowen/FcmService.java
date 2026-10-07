package app.namso_gen.spacehowen;

import a2.l;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import app.namso_gen.spacehowen.data.NotesDatabase;
import com.google.firebase.messaging.FirebaseMessagingService;
import gb.q;
import h3.r;
import h3.s;
import i3.n;
import i3.o;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import jc.i;
import r.e;
import r7.g;
import rc.b0;
import rc.k0;
import yb.d;
import yc.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class FcmService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1282r = 0;

    public static final Bitmap e(FcmService fcmService, String str) {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            i.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setInstanceFollowRedirects(true);
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                g.h(inputStream, null);
                return bitmapDecodeStream;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    g.h(inputStream, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:70:0x010b  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(q qVar) {
        String string;
        String str;
        String string2;
        Bundle bundle = qVar.f4489a;
        if (getSharedPreferences("app_settings", 0).getBoolean("notifications_enabled", true)) {
            if (qVar.f4490b == null) {
                e eVar = new e(0);
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof String) {
                        String str3 = (String) obj;
                        if (!str2.startsWith("google.") && !str2.startsWith("gcm.") && !str2.equals("from") && !str2.equals("message_type") && !str2.equals("collapse_key")) {
                            eVar.put(str2, str3);
                        }
                    }
                }
                qVar.f4490b = eVar;
            }
            e eVar2 = qVar.f4490b;
            i.d(eVar2, "getData(...)");
            if (qVar.f4491c == null && e7.i.A(bundle)) {
                qVar.f4491c = new l(new e7.i(bundle), (char) 0);
            }
            l lVar = qVar.f4491c;
            d dVar = null;
            if (lVar == null || (string = (String) lVar.f43b) == null) {
                string = (String) eVar2.get("title");
                if (string != null || string.length() <= 0) {
                    string = null;
                }
                if (string == null) {
                    string = getString(R.string.app_name);
                    i.d(string, "getString(...)");
                }
            } else {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string == null) {
                    string = (String) eVar2.get("title");
                    if (string != null) {
                        string = null;
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = getString(R.string.app_name);
                        i.d(string, "getString(...)");
                    }
                }
            }
            String str4 = string;
            if (lVar == null || (str = (String) lVar.f44c) == null) {
                str = (String) eVar2.get("body");
                if (str == null) {
                    str = "";
                }
            } else {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str == null) {
                    str = (String) eVar2.get("body");
                    if (str == null) {
                        str = "";
                    }
                }
            }
            String str5 = str;
            String str6 = (String) eVar2.get("url");
            String str7 = (String) eVar2.get("large_icon");
            if (lVar == null) {
                string2 = (String) eVar2.get("big_picture");
            } else {
                String str8 = (String) lVar.f45d;
                Uri uri = str8 != null ? Uri.parse(str8) : null;
                if (uri == null || (string2 = uri.toString()) == null) {
                    string2 = (String) eVar2.get("big_picture");
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder("fcm_");
            Object string3 = bundle.getString("google.message_id");
            if (string3 == null) {
                string3 = bundle.getString("message_id");
            }
            if (string3 == null) {
                string3 = Long.valueOf(jCurrentTimeMillis);
            }
            sb2.append(string3);
            o oVar = new o(sb2.toString(), str4, str5, str6, jCurrentTimeMillis);
            n nVarU = NotesDatabase.f1305l.a(this).u();
            c cVar = k0.f8293b;
            b0.q(b0.b(cVar), null, new a2.g(nVarU, oVar, dVar, 5), 3);
            b0.q(b0.b(cVar), null, new h3.q(str7, string2, this, oVar, null), 3);
            String str9 = (String) eVar2.get("mid");
            if (str9 != null) {
                b0.q(b0.b(cVar), null, new r(str9, null, 0), 3);
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        i.e(str, "token");
        if (getSharedPreferences("app_settings", 0).getBoolean("notifications_enabled", true)) {
            b0.q(b0.b(k0.f8293b), null, new s(this, str, null), 3);
        }
    }
}
