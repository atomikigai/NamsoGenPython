package v1;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.fragment.app.w;
import androidx.webkit.TracingConfig;
import com.google.firebase.auth.FirebaseAuth;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import v9.j0;
import v9.u;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f9116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9119d;
    public final Serializable e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f9121g;
    public Object h;

    public /* synthetic */ b(FirebaseAuth firebaseAuth, Long l2, j0 j0Var, Executor executor, String str, w wVar, u uVar) {
        this.f9119d = firebaseAuth;
        this.f9117b = str;
        this.e = l2;
        this.f9120f = j0Var;
        this.f9121g = wVar;
        this.f9116a = executor;
        this.h = uVar;
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((e) this.f9119d).e();
            return null;
        }
    }

    public void b(final int i, final Serializable serializable) {
        this.f9116a.execute(new Runnable() { // from class: v1.a
            @Override // java.lang.Runnable
            public final void run() {
                ((e) this.f9113a.f9119d).f(i, serializable);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f9118c = false;
        this.f9116a = executor;
        this.f9119d = eVar;
        this.f9117b = str;
        this.f9121g = file;
        int i = Build.VERSION.SDK_INT;
        ?? r10 = 0;
        r10 = 0;
        if (i <= 33) {
            switch (i) {
                case 24:
                case 25:
                    r10 = f.h;
                    break;
                case 26:
                    r10 = f.f9134g;
                    break;
                case 27:
                    r10 = f.f9133f;
                    break;
                case 28:
                case 29:
                case 30:
                    r10 = f.e;
                    break;
                case 31:
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                case 33:
                    r10 = f.f9132d;
                    break;
            }
        }
        this.e = r10;
    }
}
