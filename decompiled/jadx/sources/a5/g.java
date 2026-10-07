package a5;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import da.h;
import java.io.IOException;
import java.io.InputStream;
import o3.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f200b;

    public g(String str, String str2) {
        this.f199a = str;
        this.f200b = str2;
    }

    public o a() {
        if ("first_party".equals(this.f200b)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.f199a == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.f200b != null) {
            return new o(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.w(this.f199a, this.f200b, exc);
    }

    public g(aa.c cVar) {
        Context context = (Context) cVar.f263b;
        int iE = h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iE != 0) {
            this.f199a = "Unity";
            String string = context.getResources().getString(iE);
            this.f200b = string;
            String strB = u3.b.b("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strB, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f199a = "Flutter";
                this.f200b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f199a = null;
        this.f200b = null;
    }
}
