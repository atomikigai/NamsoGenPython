package da;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.api.internal.h0;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f3170g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f3171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final za.d f3174d;
    public final h0 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f3175f;

    public z(Context context, String str, za.d dVar, h0 h0Var) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f3172b = context;
        this.f3173c = str;
        this.f3174d = dVar;
        this.e = h0Var;
        this.f3171a = new a0();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f3170g.matcher(string).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized c b() {
        String str;
        c cVar = this.f3175f;
        if (cVar != null && (cVar.f3096b != null || !this.e.a())) {
            return this.f3175f;
        }
        aa.d dVar = aa.d.f265a;
        dVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f3172b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        dVar.c("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            try {
                str = (String) c0.a(((za.c) this.f3174d).c());
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e);
                str = null;
            }
            dVar.c("Fetched Firebase Installation ID: " + str);
            if (str == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f3175f = new c(sharedPreferences.getString("crashlytics.installation.id", null), str);
            } else {
                this.f3175f = new c(a(sharedPreferences, str), str);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f3175f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null);
        } else {
            this.f3175f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null);
        }
        dVar.c("Install IDs: " + this.f3175f);
        return this.f3175f;
    }

    public final String c() {
        String str;
        a0 a0Var = this.f3171a;
        Context context = this.f3172b;
        synchronized (a0Var) {
            try {
                if (a0Var.f3089a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    a0Var.f3089a = installerPackageName;
                }
                str = "".equals(a0Var.f3089a) ? null : a0Var.f3089a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
